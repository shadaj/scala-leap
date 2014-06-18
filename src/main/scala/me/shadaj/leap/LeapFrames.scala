package me.shadaj.leap

import com.leapmotion.leap.Controller
import com.leapmotion.leap.Frame
import rx.lang.scala.{Subscriber, Observable}
import com.leapmotion.leap.Listener

object LeapFrames {
  val controller = new Controller

  var subscriber: Subscriber[Frame] = null

  val listener = new LeapListener(subscriber)

  val observer = Observable[Frame] { s =>
    subscriber = s
    controller.addListener(listener)
  }


  def apply() = observer
}

class LeapListener(subscriber: => Subscriber[Frame]) extends Listener {
  override def onFrame(c: Controller) {
    subscriber.onNext(c.frame)
  }

  override def onExit(c: Controller) {
    subscriber.onCompleted()
  }
}