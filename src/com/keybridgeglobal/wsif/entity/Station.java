//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.06.27 at 03:55:13 PM EDT
//


package com.keybridgeglobal.wsif.entity;

import com.keybridgeglobal.wsif.enumerated.EnumWsifStationClass;
import com.keybridgeglobal.wsif.entity.device.RxGeneric;
import com.keybridgeglobal.wsif.entity.device.RxLpaux;
import com.keybridgeglobal.wsif.entity.device.RxMicrowave;
import com.keybridgeglobal.wsif.entity.device.RxTv;
import com.keybridgeglobal.wsif.entity.device.TxGeneric;
import com.keybridgeglobal.wsif.entity.device.TxLpaux;
import com.keybridgeglobal.wsif.entity.device.TxMicrowave;
import com.keybridgeglobal.wsif.entity.device.TxRxLandMobile;
import com.keybridgeglobal.wsif.entity.device.TxRxLandMobileBase;
import com.keybridgeglobal.wsif.entity.device.TxRxWsd;
import com.keybridgeglobal.wsif.entity.device.TxTv;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for station complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="station">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}location"/>
 *         &lt;element ref="{}schedule"/>
 *         &lt;element name="contactList" type="{}contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}device"/>
 *           &lt;element ref="{}txGeneric"/>
 *           &lt;element ref="{}rxGeneric"/>
 *           &lt;element ref="{}txLpaux"/>
 *           &lt;element ref="{}rxLpaux"/>
 *           &lt;element ref="{}txTv"/>
 *           &lt;element ref="{}rxTv"/>
 *           &lt;element ref="{}txRxLandMobileBase"/>
 *           &lt;element ref="{}txRxLandMobile"/>
 *           &lt;element ref="{}txMicrowave"/>
 *           &lt;element ref="{}rxMicrowave"/>
 *           &lt;element ref="{}txRxWsd"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stationClass" use="required" type="{}enumWsifStationClass" />
 *       &lt;attribute name="primary" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="stationType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "station", propOrder = {
    "location",
    "schedule",
    "contactList",
    "deviceOrTxGenericOrRxGeneric"
})
public class Station {

    @XmlElement(required = true)
    protected Location location;
    @XmlElement(required = true)
    protected Schedule schedule;
    protected List<Contact> contactList;
    @XmlElements({
        @XmlElement(name = "device"),
        @XmlElement(name = "txGeneric", type = TxGeneric.class),
        @XmlElement(name = "rxGeneric", type = RxGeneric.class),
        @XmlElement(name = "txLpaux", type = TxLpaux.class),
        @XmlElement(name = "rxLpaux", type = RxLpaux.class),
        @XmlElement(name = "txTv", type = TxTv.class),
        @XmlElement(name = "rxTv", type = RxTv.class),
        @XmlElement(name = "txRxLandMobileBase", type = TxRxLandMobileBase.class),
        @XmlElement(name = "txRxLandMobile", type = TxRxLandMobile.class),
        @XmlElement(name = "txMicrowave", type = TxMicrowave.class),
        @XmlElement(name = "rxMicrowave", type = RxMicrowave.class),
        @XmlElement(name = "txRxWsd", type = TxRxWsd.class)
    })
    protected List<Device> deviceOrTxGenericOrRxGeneric;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "stationClass", required = true)
    protected EnumWsifStationClass stationClass;
    @XmlAttribute(name = "primary", required = true)
    protected boolean primary;
    @XmlAttribute(name = "stationType", required = true)
    protected String stationType;

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link Location }
     *
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link Location }
     *
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the schedule property.
     *
     * @return
     *     possible object is
     *     {@link Schedule }
     *
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     *
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the contactList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     *
     *
     */
    public List<Contact> getContactList() {
        if (contactList == null) {
            contactList = new ArrayList<Contact>();
        }
        return this.contactList;
    }

    /**
     * Gets the value of the deviceOrTxGenericOrRxGeneric property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceOrTxGenericOrRxGeneric property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceOrTxGenericOrRxGeneric().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Device }
     * {@link TxGeneric }
     * {@link RxGeneric }
     * {@link TxLpaux }
     * {@link RxLpaux }
     * {@link TxTv }
     * {@link RxTv }
     * {@link TxRxLandMobileBase }
     * {@link TxRxLandMobile }
     * {@link TxMicrowave }
     * {@link RxMicrowave }
     * {@link TxRxWsd }
     *
     *
     */
    public List<Device> getDeviceOrTxGenericOrRxGeneric() {
        if (deviceOrTxGenericOrRxGeneric == null) {
            deviceOrTxGenericOrRxGeneric = new ArrayList<Device>();
        }
        return this.deviceOrTxGenericOrRxGeneric;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the stationClass property.
     *
     * @return
     *     possible object is
     *     {@link EnumWsifStationClass }
     *
     */
    public EnumWsifStationClass getStationClass() {
        return stationClass;
    }

    /**
     * Sets the value of the stationClass property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumWsifStationClass }
     *
     */
    public void setStationClass(EnumWsifStationClass value) {
        this.stationClass = value;
    }

    /**
     * Gets the value of the primary property.
     *
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     *
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the stationType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStationType() {
        return stationType;
    }

    /**
     * Sets the value of the stationType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStationType(String value) {
        this.stationType = value;
    }

}