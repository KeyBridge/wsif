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
 * <p>Java class for enumWsifDeviceClass.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumWsifDeviceClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RXGENERIC"/>
 *     &lt;enumeration value="TXGENERIC"/>
 *     &lt;enumeration value="RXLPAUX"/>
 *     &lt;enumeration value="TXLPAUX"/>
 *     &lt;enumeration value="RXTV"/>
 *     &lt;enumeration value="TXTV"/>
 *     &lt;enumeration value="TXRXLANDMOBILEBASE"/>
 *     &lt;enumeration value="TXRXLANDMOBILE"/>
 *     &lt;enumeration value="RXMICROWAVE"/>
 *     &lt;enumeration value="TXMICROWAVE"/>
 *     &lt;enumeration value="TXRXWSD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "enumWsifDeviceClass")
@XmlEnum
public enum EnumWsifDeviceClass {

    RXGENERIC,
    TXGENERIC,
    RXLPAUX,
    TXLPAUX,
    RXTV,
    TXTV,
    TXRXLANDMOBILEBASE,
    TXRXLANDMOBILE,
    RXMICROWAVE,
    TXMICROWAVE,
    TXRXWSD;

    public String value() {
        return name();
    }

    public static EnumWsifDeviceClass fromValue(String v) {
        return valueOf(v);
    }

}
