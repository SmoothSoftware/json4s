package org.json4s.ubjson

import java.io.OutputStream

import org.json4s.{Extraction, Formats, Serialization}

import reflect.Manifest

object Serialization extends Serialization {
  import java.io.{Reader, Writer}
  /** Serialize to String.
    */
  def write[A <: AnyRef](a: A)(implicit formats: Formats): String = ???

  /** Serialize to Writer.
    */
  def write[A <: AnyRef, W <: Writer](a: A, out: W)(implicit formats: Formats): W = ???

  def write[A <: AnyRef](a: A, out: OutputStream)(implicit formats: Formats): Unit = ???

  /** Serialize to String (pretty format).
    */
  def writePretty[A <: AnyRef](a: A)(implicit formats: Formats): String = ???

  /** Serialize to Writer (pretty format).
    */
  def writePretty[A <: AnyRef, W <: Writer](a: A, out: W)(implicit formats: Formats): W = ???

  /** Deserialize from a String.
    */
  def read[A](json: String)(implicit formats: Formats, mf: Manifest[A]): A =
    ???

  @deprecated("You can use formats now to indicate you want to use decimals instead of doubles", "3.2.0")
  def read[A](json: String, useBigDecimalForDouble: Boolean)(implicit formats: Formats, mf: Manifest[A]): A =
    ???

  /** Deserialize from a Reader.
    */
  @deprecated("You can use formats now to indicate you want to use decimals instead of doubles", "3.2.0")
  def read[A](in: Reader, useBigDecimalForDouble: Boolean)(implicit formats: Formats, mf: Manifest[A]): A = {
    ???
  }
  /** Deserialize from a Reader.
    */
  def read[A](in: Reader)(implicit formats: Formats, mf: Manifest[A]): A = {
    ???
  }
}

