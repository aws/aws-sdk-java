/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A smart home appliance that can connect to a central system. Any domestic device can be a smart appliance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SmartHomeAppliance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmartHomeAppliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     */
    private String friendlyName;
    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     */
    private String manufacturerName;

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     * 
     * @param friendlyName
     *        The friendly name of the smart home appliance.
     */

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     * 
     * @return The friendly name of the smart home appliance.
     */

    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     * 
     * @param friendlyName
     *        The friendly name of the smart home appliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmartHomeAppliance withFriendlyName(String friendlyName) {
        setFriendlyName(friendlyName);
        return this;
    }

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     * 
     * @param description
     *        The description of the smart home appliance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     * 
     * @return The description of the smart home appliance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     * 
     * @param description
     *        The description of the smart home appliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmartHomeAppliance withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     * 
     * @param manufacturerName
     *        The name of the manufacturer of the smart home appliance.
     */

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     * 
     * @return The name of the manufacturer of the smart home appliance.
     */

    public String getManufacturerName() {
        return this.manufacturerName;
    }

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     * 
     * @param manufacturerName
     *        The name of the manufacturer of the smart home appliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmartHomeAppliance withManufacturerName(String manufacturerName) {
        setManufacturerName(manufacturerName);
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
        if (getFriendlyName() != null)
            sb.append("FriendlyName: ").append(getFriendlyName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getManufacturerName() != null)
            sb.append("ManufacturerName: ").append(getManufacturerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmartHomeAppliance == false)
            return false;
        SmartHomeAppliance other = (SmartHomeAppliance) obj;
        if (other.getFriendlyName() == null ^ this.getFriendlyName() == null)
            return false;
        if (other.getFriendlyName() != null && other.getFriendlyName().equals(this.getFriendlyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getManufacturerName() == null ^ this.getManufacturerName() == null)
            return false;
        if (other.getManufacturerName() != null && other.getManufacturerName().equals(this.getManufacturerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFriendlyName() == null) ? 0 : getFriendlyName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        return hashCode;
    }

    @Override
    public SmartHomeAppliance clone() {
        try {
            return (SmartHomeAppliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SmartHomeApplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
