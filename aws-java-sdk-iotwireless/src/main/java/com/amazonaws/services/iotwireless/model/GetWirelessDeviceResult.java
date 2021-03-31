/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The wireless device type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the thing associated with the wireless device. The value is empty if a thing isn't associated with
     * the device.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The ARN of the thing associated with the wireless device.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * Information about the wireless device.
     * </p>
     */
    private LoRaWANDevice loRaWAN;
    /**
     * <p>
     * Sidewalk device object.
     * </p>
     */
    private SidewalkDevice sidewalk;

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @see WirelessDeviceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @return The wireless device type.
     * @see WirelessDeviceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public GetWirelessDeviceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The wireless device type.
     * </p>
     * 
     * @param type
     *        The wireless device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessDeviceType
     */

    public GetWirelessDeviceResult withType(WirelessDeviceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @return The description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource.
     * </p>
     * 
     * @param description
     *        The description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination to which the device is assigned.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     * 
     * @return The name of the destination to which the device is assigned.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the destination to which the device is assigned.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination to which the device is assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     * 
     * @param id
     *        The ID of the wireless device.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     * 
     * @return The ID of the wireless device.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the wireless device.
     * </p>
     * 
     * @param id
     *        The ID of the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the thing associated with the wireless device. The value is empty if a thing isn't associated with
     * the device.
     * </p>
     * 
     * @param thingName
     *        The name of the thing associated with the wireless device. The value is empty if a thing isn't associated
     *        with the device.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing associated with the wireless device. The value is empty if a thing isn't associated with
     * the device.
     * </p>
     * 
     * @return The name of the thing associated with the wireless device. The value is empty if a thing isn't associated
     *         with the device.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing associated with the wireless device. The value is empty if a thing isn't associated with
     * the device.
     * </p>
     * 
     * @param thingName
     *        The name of the thing associated with the wireless device. The value is empty if a thing isn't associated
     *        with the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The ARN of the thing associated with the wireless device.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing associated with the wireless device.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing associated with the wireless device.
     * </p>
     * 
     * @return The ARN of the thing associated with the wireless device.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing associated with the wireless device.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing associated with the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * <p>
     * Information about the wireless device.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless device.
     */

    public void setLoRaWAN(LoRaWANDevice loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless device.
     * </p>
     * 
     * @return Information about the wireless device.
     */

    public LoRaWANDevice getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * Information about the wireless device.
     * </p>
     * 
     * @param loRaWAN
     *        Information about the wireless device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withLoRaWAN(LoRaWANDevice loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * <p>
     * Sidewalk device object.
     * </p>
     * 
     * @param sidewalk
     *        Sidewalk device object.
     */

    public void setSidewalk(SidewalkDevice sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * Sidewalk device object.
     * </p>
     * 
     * @return Sidewalk device object.
     */

    public SidewalkDevice getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * Sidewalk device object.
     * </p>
     * 
     * @param sidewalk
     *        Sidewalk device object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessDeviceResult withSidewalk(SidewalkDevice sidewalk) {
        setSidewalk(sidewalk);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessDeviceResult == false)
            return false;
        GetWirelessDeviceResult other = (GetWirelessDeviceResult) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessDeviceResult clone() {
        try {
            return (GetWirelessDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
