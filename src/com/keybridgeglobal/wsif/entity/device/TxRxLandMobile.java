//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity.device;

import com.keybridgeglobal.wsif.entity.Device;
import com.keybridgeglobal.wsif.entity.Channel;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txRxLandMobile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="txRxLandMobile">
 *   &lt;complexContent>
 *     &lt;extension base="{}device">
 *       &lt;sequence>
 *         &lt;element name="baseStation" type="{}txRxLandMobileBase" minOccurs="0"/>
 *         &lt;element ref="{}channel"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txRxLandMobile", propOrder = {
    "baseStation",
    "channel"
})
public class TxRxLandMobile
    extends Device
{

    protected TxRxLandMobileBase baseStation;
    @XmlElement(required = true)
    protected Channel channel;

    /**
     * Gets the value of the baseStation property.
     *
     * @return
     *     possible object is
     *     {@link TxRxLandMobileBase }
     *
     */
    public TxRxLandMobileBase getBaseStation() {
        return baseStation;
    }

    /**
     * Sets the value of the baseStation property.
     *
     * @param value
     *     allowed object is
     *     {@link TxRxLandMobileBase }
     *
     */
    public void setBaseStation(TxRxLandMobileBase value) {
        this.baseStation = value;
    }

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link Channel }
     *
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link Channel }
     *
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

}
