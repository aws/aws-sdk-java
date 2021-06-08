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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A definition of what is being billed for, including the type and amount.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ResourceSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSpecification implements Serializable, Cloneable, StructuredPojo {

    /** The amount of outbound bandwidth that is discounted in the offering. */
    private Integer reservedBitrate;
    /** The type of resource and the unit that is being billed for. */
    private String resourceType;

    /**
     * The amount of outbound bandwidth that is discounted in the offering.
     * 
     * @param reservedBitrate
     *        The amount of outbound bandwidth that is discounted in the offering.
     */

    public void setReservedBitrate(Integer reservedBitrate) {
        this.reservedBitrate = reservedBitrate;
    }

    /**
     * The amount of outbound bandwidth that is discounted in the offering.
     * 
     * @return The amount of outbound bandwidth that is discounted in the offering.
     */

    public Integer getReservedBitrate() {
        return this.reservedBitrate;
    }

    /**
     * The amount of outbound bandwidth that is discounted in the offering.
     * 
     * @param reservedBitrate
     *        The amount of outbound bandwidth that is discounted in the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpecification withReservedBitrate(Integer reservedBitrate) {
        setReservedBitrate(reservedBitrate);
        return this;
    }

    /**
     * The type of resource and the unit that is being billed for.
     * 
     * @param resourceType
     *        The type of resource and the unit that is being billed for.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The type of resource and the unit that is being billed for.
     * 
     * @return The type of resource and the unit that is being billed for.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * The type of resource and the unit that is being billed for.
     * 
     * @param resourceType
     *        The type of resource and the unit that is being billed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceSpecification withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * The type of resource and the unit that is being billed for.
     * 
     * @param resourceType
     *        The type of resource and the unit that is being billed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceSpecification withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getReservedBitrate() != null)
            sb.append("ReservedBitrate: ").append(getReservedBitrate()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSpecification == false)
            return false;
        ResourceSpecification other = (ResourceSpecification) obj;
        if (other.getReservedBitrate() == null ^ this.getReservedBitrate() == null)
            return false;
        if (other.getReservedBitrate() != null && other.getReservedBitrate().equals(this.getReservedBitrate()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedBitrate() == null) ? 0 : getReservedBitrate().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSpecification clone() {
        try {
            return (ResourceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.ResourceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
