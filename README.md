# White Space Information Format (WSIF)

## Reference Developer Kit

Conforms to WSIF Version: 5.0r00

For more information about WSIF and to download the complete 100+ page specification 
documentation go to http://keybridgeglobal.com

This package contains three sample web client implementations and supporting
class library software.

Also included is the logical data model schema file (XSD) and a data file (XML)
containing sample query/response messages.

You may compile your own complete WSIF class library with the XSD file or use
the included Java sample, which is pre-built for you.

To build your own WSIF library in Java use the 'xjc' compiler command. Other
languages and IDEs have their own schema binding compiler. e.g. xsd.exe for .NET,
XSD for C++, etc. Search for 'data binding compiler' to find a version in your
language of interest.

<table>
  <tr>
    <td>Content</td>
    <td>Location</td>
    <td>License</td>
  </tr>
  <tr>
    <td>Rest Client: Jersey</td>
    <td>com.keybridgeglobal.api.rest.client.jersey</td>
    <td>GPL 3.0</td>
  </tr>
  <tr>
    <td>Rest Client: Scribe</td>
    <td>com.keybridgeglobal.api.rest.client.scribe</td>
    <td>GPL 3.0</td>
  </tr>
  <tr>
    <td>Class Library: WSIF</td>
    <td>com.keybridgeglobal.wsif</td>
    <td>GPL 3.0</td>
  </tr>
  <tr>
    <td>Class Library: Scribe</td>
    <td>org.scribe</td>
    <td>MIT</td>
  </tr>
</table>

## References / Requires:
  [Jersey]: http://jersey.java.net/     Jersey is the open source, production quality, JAX-RS (JSR 311) Reference Implementation for building RESTful Web services.

  [Commons Codec]: http://commons.apache.org/codec/ Apache Commons Codec (TM) software provides implementations of common encoders and decoders such as Base64, Hex, Phonetic and URLs.

  [Scribe-Java]: https://github.com/fernandezpablo85/scribe-java Scribe is a mature OAuth library for Java by Pablo Fernandez that is intended to work with all APIs.

## GNU General Public License
> This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
> This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.

_END
