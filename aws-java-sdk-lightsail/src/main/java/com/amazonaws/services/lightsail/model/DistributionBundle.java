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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the specifications of a distribution bundle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DistributionBundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributionBundle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the bundle.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The name of the distribution bundle.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The monthly price, in US dollars, of the bundle.
     * </p>
     */
    private Float price;
    /**
     * <p>
     * The monthly network transfer quota of the bundle.
     * </p>
     */
    private Integer transferPerMonthInGb;
    /**
     * <p>
     * Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * The ID of the bundle.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle.
     * </p>
     * 
     * @return The ID of the bundle.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the bundle.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionBundle withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The name of the distribution bundle.
     * </p>
     * 
     * @param name
     *        The name of the distribution bundle.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the distribution bundle.
     * </p>
     * 
     * @return The name of the distribution bundle.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the distribution bundle.
     * </p>
     * 
     * @param name
     *        The name of the distribution bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionBundle withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The monthly price, in US dollars, of the bundle.
     * </p>
     * 
     * @param price
     *        The monthly price, in US dollars, of the bundle.
     */

    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * <p>
     * The monthly price, in US dollars, of the bundle.
     * </p>
     * 
     * @return The monthly price, in US dollars, of the bundle.
     */

    public Float getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The monthly price, in US dollars, of the bundle.
     * </p>
     * 
     * @param price
     *        The monthly price, in US dollars, of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionBundle withPrice(Float price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * The monthly network transfer quota of the bundle.
     * </p>
     * 
     * @param transferPerMonthInGb
     *        The monthly network transfer quota of the bundle.
     */

    public void setTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
    }

    /**
     * <p>
     * The monthly network transfer quota of the bundle.
     * </p>
     * 
     * @return The monthly network transfer quota of the bundle.
     */

    public Integer getTransferPerMonthInGb() {
        return this.transferPerMonthInGb;
    }

    /**
     * <p>
     * The monthly network transfer quota of the bundle.
     * </p>
     * 
     * @param transferPerMonthInGb
     *        The monthly network transfer quota of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionBundle withTransferPerMonthInGb(Integer transferPerMonthInGb) {
        setTransferPerMonthInGb(transferPerMonthInGb);
        return this;
    }

    /**
     * <p>
     * Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     * </p>
     * 
     * @param isActive
     *        Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     * </p>
     * 
     * @return Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     * </p>
     * 
     * @param isActive
     *        Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributionBundle withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     * </p>
     * 
     * @return Indicates whether the bundle is active, and can be specified for a new or existing distribution.
     */

    public Boolean isActive() {
        return this.isActive;
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getTransferPerMonthInGb() != null)
            sb.append("TransferPerMonthInGb: ").append(getTransferPerMonthInGb()).append(",");
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributionBundle == false)
            return false;
        DistributionBundle other = (DistributionBundle) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getTransferPerMonthInGb() == null ^ this.getTransferPerMonthInGb() == null)
            return false;
        if (other.getTransferPerMonthInGb() != null && other.getTransferPerMonthInGb().equals(this.getTransferPerMonthInGb()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getTransferPerMonthInGb() == null) ? 0 : getTransferPerMonthInGb().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return hashCode;
    }

    @Override
    public DistributionBundle clone() {
        try {
            return (DistributionBundle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DistributionBundleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
