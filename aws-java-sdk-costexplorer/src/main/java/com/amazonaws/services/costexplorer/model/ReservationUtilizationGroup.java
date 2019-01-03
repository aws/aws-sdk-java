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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A group of reservations that share a set of attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationUtilizationGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationUtilizationGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     */
    private ReservationAggregates utilization;

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     * 
     * @param key
     *        The key for a specific reservation attribute.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     * 
     * @return The key for a specific reservation attribute.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     * 
     * @param key
     *        The key for a specific reservation attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationUtilizationGroup withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     * 
     * @param value
     *        The value of a specific reservation attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     * 
     * @return The value of a specific reservation attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     * 
     * @param value
     *        The value of a specific reservation attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationUtilizationGroup withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * 
     * @return The attributes for this group of reservations.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * 
     * @param attributes
     *        The attributes for this group of reservations.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * 
     * @param attributes
     *        The attributes for this group of reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationUtilizationGroup withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public ReservationUtilizationGroup addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationUtilizationGroup clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     * 
     * @param utilization
     *        How much you used this group of reservations.
     */

    public void setUtilization(ReservationAggregates utilization) {
        this.utilization = utilization;
    }

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     * 
     * @return How much you used this group of reservations.
     */

    public ReservationAggregates getUtilization() {
        return this.utilization;
    }

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     * 
     * @param utilization
     *        How much you used this group of reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationUtilizationGroup withUtilization(ReservationAggregates utilization) {
        setUtilization(utilization);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getUtilization() != null)
            sb.append("Utilization: ").append(getUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationUtilizationGroup == false)
            return false;
        ReservationUtilizationGroup other = (ReservationUtilizationGroup) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUtilization() == null ^ this.getUtilization() == null)
            return false;
        if (other.getUtilization() != null && other.getUtilization().equals(this.getUtilization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getUtilization() == null) ? 0 : getUtilization().hashCode());
        return hashCode;
    }

    @Override
    public ReservationUtilizationGroup clone() {
        try {
            return (ReservationUtilizationGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationUtilizationGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
