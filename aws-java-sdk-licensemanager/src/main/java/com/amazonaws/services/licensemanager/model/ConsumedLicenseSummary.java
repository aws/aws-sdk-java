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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about license consumption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ConsumedLicenseSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsumedLicenseSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Resource type of the resource consuming a license (instance, host, or AMI).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Number of licenses consumed by a resource.
     * </p>
     */
    private Long consumedLicenses;

    /**
     * <p>
     * Resource type of the resource consuming a license (instance, host, or AMI).
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource consuming a license (instance, host, or AMI).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type of the resource consuming a license (instance, host, or AMI).
     * </p>
     * 
     * @return Resource type of the resource consuming a license (instance, host, or AMI).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type of the resource consuming a license (instance, host, or AMI).
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource consuming a license (instance, host, or AMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConsumedLicenseSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource consuming a license (instance, host, or AMI).
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource consuming a license (instance, host, or AMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConsumedLicenseSummary withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Number of licenses consumed by a resource.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses consumed by a resource.
     */

    public void setConsumedLicenses(Long consumedLicenses) {
        this.consumedLicenses = consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses consumed by a resource.
     * </p>
     * 
     * @return Number of licenses consumed by a resource.
     */

    public Long getConsumedLicenses() {
        return this.consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses consumed by a resource.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses consumed by a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumedLicenseSummary withConsumedLicenses(Long consumedLicenses) {
        setConsumedLicenses(consumedLicenses);
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
        if (getConsumedLicenses() != null)
            sb.append("ConsumedLicenses: ").append(getConsumedLicenses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConsumedLicenseSummary == false)
            return false;
        ConsumedLicenseSummary other = (ConsumedLicenseSummary) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getConsumedLicenses() == null ^ this.getConsumedLicenses() == null)
            return false;
        if (other.getConsumedLicenses() != null && other.getConsumedLicenses().equals(this.getConsumedLicenses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getConsumedLicenses() == null) ? 0 : getConsumedLicenses().hashCode());
        return hashCode;
    }

    @Override
    public ConsumedLicenseSummary clone() {
        try {
            return (ConsumedLicenseSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ConsumedLicenseSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
