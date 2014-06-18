package me.shadaj.leap

import scala.io.StdIn

object FingerCount extends App {
	val frames = LeapFrames()
	frames.subscribe { frame =>
    val fingers: BetterFingerList = frame.fingers
	  println(fingers.count(_.isExtended))
	}

	StdIn.readLine()
}