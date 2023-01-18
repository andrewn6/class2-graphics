package my.scalafx

import scalafx.application.JFXApp3
import scalafx.scene.shape.Circle
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint._
import scalafx.scene.text.Text

object ScalaFXHelloWorld extends JFXApp3 {
  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      //    initStyle(StageStyle.Unified)
      title = "Graphics -- Shapes"
      // scene size
      scene = new Scene(300, 300) {
        val circle = new Circle {
          // position of the circle
          centerX = 150
          centerY = 150
          radius = 50
        }
        content = List(circle)
      }
    }
  }
}
