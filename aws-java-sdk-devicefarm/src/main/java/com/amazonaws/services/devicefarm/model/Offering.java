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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the metadata of a device offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Offering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Offering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that corresponds to a device offering.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A string describing the offering.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of offering (e.g., "RECURRING") for a device.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The platform of the device (e.g., ANDROID or IOS).
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Specifies whether there are recurring charges for the offering.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The ID that corresponds to a device offering.
     * </p>
     * 
     * @param id
     *        The ID that corresponds to a device offering.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that corresponds to a device offering.
     * </p>
     * 
     * @return The ID that corresponds to a device offering.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that corresponds to a device offering.
     * </p>
     * 
     * @param id
     *        The ID that corresponds to a device offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A string describing the offering.
     * </p>
     * 
     * @param description
     *        A string describing the offering.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string describing the offering.
     * </p>
     * 
     * @return A string describing the offering.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string describing the offering.
     * </p>
     * 
     * @param description
     *        A string describing the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of offering (e.g., "RECURRING") for a device.
     * </p>
     * 
     * @param type
     *        The type of offering (e.g., "RECURRING") for a device.
     * @see OfferingType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of offering (e.g., "RECURRING") for a device.
     * </p>
     * 
     * @return The type of offering (e.g., "RECURRING") for a device.
     * @see OfferingType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of offering (e.g., "RECURRING") for a device.
     * </p>
     * 
     * @param type
     *        The type of offering (e.g., "RECURRING") for a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingType
     */

    public Offering withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of offering (e.g., "RECURRING") for a device.
     * </p>
     * 
     * @param type
     *        The type of offering (e.g., "RECURRING") for a device.
     * @see OfferingType
     */

    public void setType(OfferingType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of offering (e.g., "RECURRING") for a device.
     * </p>
     * 
     * @param type
     *        The type of offering (e.g., "RECURRING") for a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingType
     */

    public Offering withType(OfferingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The platform of the device (e.g., ANDROID or IOS).
     * </p>
     * 
     * @param platform
     *        The platform of the device (e.g., ANDROID or IOS).
     * @see DevicePlatform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the device (e.g., ANDROID or IOS).
     * </p>
     * 
     * @return The platform of the device (e.g., ANDROID or IOS).
     * @see DevicePlatform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the device (e.g., ANDROID or IOS).
     * </p>
     * 
     * @param platform
     *        The platform of the device (e.g., ANDROID or IOS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePlatform
     */

    public Offering withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the device (e.g., ANDROID or IOS).
     * </p>
     * 
     * @param platform
     *        The platform of the device (e.g., ANDROID or IOS).
     * @see DevicePlatform
     */

    public void setPlatform(DevicePlatform platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The platform of the device (e.g., ANDROID or IOS).
     * </p>
     * 
     * @param platform
     *        The platform of the device (e.g., ANDROID or IOS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DevicePlatform
     */

    public Offering withPlatform(DevicePlatform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether there are recurring charges for the offering.
     * </p>
     * 
     * @return Specifies whether there are recurring charges for the offering.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * Specifies whether there are recurring charges for the offering.
     * </p>
     * 
     * @param recurringCharges
     *        Specifies whether there are recurring charges for the offering.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * Specifies whether there are recurring charges for the offering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        Specifies whether there are recurring charges for the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether there are recurring charges for the offering.
     * </p>
     * 
     * @param recurringCharges
     *        Specifies whether there are recurring charges for the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Offering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Offering == false)
            return false;
        Offering other = (Offering) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public Offering clone() {
        try {
            return (Offering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.OfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
