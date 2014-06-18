package me.shadaj

import com.leapmotion.leap._

import scala.collection.JavaConversions._

package object leap {
  implicit class BetterFingerList(fingerList: FingerList) extends Seq[Finger] {
    def apply(index: Int) = fingerList.get(index)
    def iterator = fingerList.iterator
    def length = fingerList.count
  }

  implicit class BetterHandList(handList: HandList) extends Seq[Hand] {
    def apply(index: Int) = handList.get(index)
    def iterator = handList.iterator
    def length = handList.count
  }

  implicit class BetterVector(vector: Vector) {
    def x = vector.getX
    def y = vector.getY
    def z = vector.getZ

    def x_=(value: Float) = vector.setX(value)
    def y_=(value: Float) = vector.setY(value)
    def z_=(value: Float) = vector.setZ(value)
  }
}