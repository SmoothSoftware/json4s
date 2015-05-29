package org.json4s.ubjson

import org.json4s.{NoTypeHints, SerializationSpec}

class UbJsonSerializationSpec
  extends SerializationSpec(
    serialization = org.json4s.ubjson.Serialization,
    baseFormats = org.json4s.ubjson.Serialization.formats(NoTypeHints)
  )
