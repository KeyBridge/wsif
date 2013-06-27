/*
 *   Copyright (C) 2009-2013 Key Bridge Global LLC and/or its affiliates.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.keybridgeglobal.api.rest.client.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * A utility class used to unwrap URI-encoded text. This class is used to unwrap
 * a WSIF entity 'extension' fields.
 */
public class URITextUtility {

  /**
   * Unwrap a URI-encoded key value map into its constituents.
   * <p/>
   * @param keyValueString A string containing URI-encoded key-value pairs.
   * @return A non-null HashMap containing the String value of the decoded
   *         key/value pairs.
   */
  public static Map<String, String> decodeKVMap(String keyValueString) {
    Map<String, String> keyValueMap = new HashMap<String, String>();
    /**
     * Only process if the KVString is not empty
     */
    if (keyValueString != null && !keyValueString.isEmpty()) {
      /**
       * If the keyValueString has been retrieved from a browser URI then strip
       * the leading '?' if present
       */
      if (keyValueString.startsWith("?")) {
        keyValueString = keyValueString.substring(1);
      }
      /**
       * Parse the URI string into key / value pairs. Decode each key value
       * pair, splitting the key/value pairs and populate the map with key and
       * (decoded) value pairs (This second-pass of decoding is important!)
       */
      String[] keyValuePairs = keyValueString.split("&");
      for (String keyValuePair : keyValuePairs) {
        try {
          String[] kv = decodeString(keyValuePair).split("=");
          keyValueMap.put(kv[0], decodeString(kv[1]));
        } catch (Exception ex) {
        }
      }
    }
    return keyValueMap;
  }

  /**
   * Decode URL-encoded text into a raw text string.
   * <p/>
   * This method is called from within the {@link decodeVKMap} method and
   * assumes that input text has been encoded using the UTF-8 character set.
   * <p/>
   * @param cookedTextString A UTF-8, URI-encoded text string.
   * @return rawTextString A plain text string.
   * @throws UnsupportedEncodingException If the input text is not compatible
   *                                      with the UTF-8 character set.
   */
  private static String decodeString(String cookedTextString) throws UnsupportedEncodingException {
    return URLDecoder.decode(cookedTextString, "UTF-8");
  }
}
