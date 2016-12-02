package fhj.swengb.assignments.basic

import fhj.model.Github
import fhj.model.Ima2015.Students
import org.scalatest.WordSpec

class Gruppe_CSpec extends WordSpec {

  import fhj.model.Ima2015.Students._


      
   "Michael Schrempf" when {
       "participating in SWENGB," should {
         "have a github account communicated" in assert(Students.mschrempf.githubUserName.nonEmpty)
         "have created a github account at http://github.com/" + Students.mschrempf.githubUserName in assert(Github.exists(mschrempf), "Github account for Michael Schrempf does not exist")

       }
      "submitting android-BasicGestureDetect" should {
          "have a repository named http://github.com/michaelschrempf/android-BasicGestureDetect" in assert(Github.exists(mschrempf,"android-BasicGestureDetect"), "Github repository 'android-BasicGestureDetect' for Michael Schrempf does not exist!")
          "have not committed local.properties" in assert(!Github.exists(mschrempf.fileIn("android-BasicGestureDetect", "local.properties")))
          "have a BasicGestureDetectFragment.scala commited" in assert(Github.exists(mschrempf.fileIn("android-BasicGestureDetect", "Application/src/main/scala/com/example/android/basicgesturedetect/BasicGestureDetectFragment.scala")))
          "have a GestureListener.scala commited" in assert(Github.exists(mschrempf.fileIn("android-BasicGestureDetect", "Application/src/main/scala/com/example/android/basicgesturedetect/GestureListener.scala")))
          "have a MainActivity.scala commited" in assert(Github.exists(mschrempf.fileIn("android-BasicGestureDetect", "Application/src/main/scala/com/example/android/basicgesturedetect/MainActivity.scala")))
          "have a .gitignore file commited" in assert(Github.exists(mschrempf.fileIn("android-BasicGestureDetect", ".gitignore")))
       }
     }
      

      

}
