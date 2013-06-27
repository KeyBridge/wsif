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
 * <p>Java class for rxTv complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="rxTv">
 *   &lt;complexContent>
 *     &lt;extension base="{}device">
 *       &lt;sequence>
 *         &lt;element ref="{}channel"/>
 *         &lt;element name="transmitter" type="{}txTv" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rxTv", propOrder = {
    "channel",
    "transmitter"
})
public class RxTv
    extends Device
{

    @XmlElement(required = true)
    protected Channel channel;
    protected TxTv transmitter;

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

    /**
     * Gets the value of the transmitter property.
     *
     * @return
     *     possible object is
     *     {@link TxTv }
     *
     */
    public TxTv getTransmitter() {
        return transmitter;
    }

    /**
     * Sets the value of the transmitter property.
     *
     * @param value
     *     allowed object is
     *     {@link TxTv }
     *
     */
    public void setTransmitter(TxTv value) {
        this.transmitter = value;
    }

}
