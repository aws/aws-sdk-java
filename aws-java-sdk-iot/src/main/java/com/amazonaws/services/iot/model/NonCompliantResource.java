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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the resource that was non-compliant with the audit check.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NonCompliantResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     */
    private ResourceIdentifier resourceIdentifier;
    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     */
    private java.util.Map<String, String> additionalInfo;

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the non-compliant resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * 
     * @return The type of the non-compliant resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the non-compliant resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public NonCompliantResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the non-compliant resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public NonCompliantResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        Information identifying the non-compliant resource.
     */

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     * 
     * @return Information identifying the non-compliant resource.
     */

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        Information identifying the non-compliant resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonCompliantResource withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     * 
     * @return Additional information about the non-compliant resource.
     */

    public java.util.Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     * 
     * @param additionalInfo
     *        Additional information about the non-compliant resource.
     */

    public void setAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     * 
     * @param additionalInfo
     *        Additional information about the non-compliant resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonCompliantResource withAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    public NonCompliantResource addAdditionalInfoEntry(String key, String value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, String>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalInfo.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonCompliantResource clearAdditionalInfoEntries() {
        this.additionalInfo = null;
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NonCompliantResource == false)
            return false;
        NonCompliantResource other = (NonCompliantResource) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public NonCompliantResource clone() {
        try {
            return (NonCompliantResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.NonCompliantResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
