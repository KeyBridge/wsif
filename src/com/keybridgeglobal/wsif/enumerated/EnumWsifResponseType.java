//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.enumerated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumWsifResponseType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumWsifResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORIZATION"/>
 *     &lt;enumeration value="INFORMATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "enumWsifResponseType")
@XmlEnum
public enum EnumWsifResponseType {

    AUTHORIZATION,
    INFORMATION;

    public String value() {
        return name();
    }

    public static EnumWsifResponseType fromValue(String v) {
        return valueOf(v);
    }

}
