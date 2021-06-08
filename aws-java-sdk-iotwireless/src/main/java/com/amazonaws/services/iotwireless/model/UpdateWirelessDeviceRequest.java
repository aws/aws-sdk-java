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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessDevice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWirelessDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the new destination for the device.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The new name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A new description of the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated wireless device's configuration.
     * </p>
     */
    private LoRaWANUpdateDevice loRaWAN;

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @return The ID of the resource to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the new destination for the device.
     * </p>
     * 
     * @param destinationName
     *        The name of the new destination for the device.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the new destination for the device.
     * </p>
     * 
     * @return The name of the new destination for the device.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the new destination for the device.
     * </p>
     * 
     * @param destinationName
     *        The name of the new destination for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @param name
     *        The new name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @return The new name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @param name
     *        The new name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @param description
     *        A new description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @return A new description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @param description
     *        A new description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated wireless device's configuration.
     * </p>
     * 
     * @param loRaWAN
     *        The updated wireless device's configuration.
     */

    public void setLoRaWAN(LoRaWANUpdateDevice loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * <p>
     * The updated wireless device's configuration.
     * </p>
     * 
     * @return The updated wireless device's configuration.
     */

    public LoRaWANUpdateDevice getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * <p>
     * The updated wireless device's configuration.
     * </p>
     * 
     * @param loRaWAN
     *        The updated wireless device's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessDeviceRequest withLoRaWAN(LoRaWANUpdateDevice loRaWAN) {
        setLoRaWAN(loRaWAN);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWirelessDeviceRequest == false)
            return false;
        UpdateWirelessDeviceRequest other = (UpdateWirelessDeviceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWirelessDeviceRequest clone() {
        return (UpdateWirelessDeviceRequest) super.clone();
    }

}
