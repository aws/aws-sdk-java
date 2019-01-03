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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a database bundle. A bundle describes the performance specifications of the database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseBundle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseBundle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The name for the database bundle.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     */
    private Float price;
    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     * </p>
     */
    private Float ramSizeInGb;
    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     */
    private Integer diskSizeInGb;
    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     */
    private Integer transferPerMonthInGb;
    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     */
    private Integer cpuCount;
    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     */
    private Boolean isEncrypted;
    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     * 
     * @param bundleId
     *        The ID for the database bundle.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     * 
     * @return The ID for the database bundle.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID for the database bundle.
     * </p>
     * 
     * @param bundleId
     *        The ID for the database bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     * 
     * @param name
     *        The name for the database bundle.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     * 
     * @return The name for the database bundle.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the database bundle.
     * </p>
     * 
     * @param name
     *        The name for the database bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     * 
     * @param price
     *        The cost of the database bundle in US currency.
     */

    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     * 
     * @return The cost of the database bundle in US currency.
     */

    public Float getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The cost of the database bundle in US currency.
     * </p>
     * 
     * @param price
     *        The cost of the database bundle in US currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withPrice(Float price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     */

    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     * </p>
     * 
     * @return The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     */

    public Float getRamSizeInGb() {
        return this.ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB (for example, <code>2.0</code>) for the database bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withRamSizeInGb(Float ramSizeInGb) {
        setRamSizeInGb(ramSizeInGb);
        return this;
    }

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     * 
     * @param diskSizeInGb
     *        The size of the disk for the database bundle.
     */

    public void setDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     * 
     * @return The size of the disk for the database bundle.
     */

    public Integer getDiskSizeInGb() {
        return this.diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database bundle.
     * </p>
     * 
     * @param diskSizeInGb
     *        The size of the disk for the database bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withDiskSizeInGb(Integer diskSizeInGb) {
        setDiskSizeInGb(diskSizeInGb);
        return this;
    }

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     * 
     * @param transferPerMonthInGb
     *        The data transfer rate per month in GB for the database bundle.
     */

    public void setTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     * 
     * @return The data transfer rate per month in GB for the database bundle.
     */

    public Integer getTransferPerMonthInGb() {
        return this.transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB for the database bundle.
     * </p>
     * 
     * @param transferPerMonthInGb
     *        The data transfer rate per month in GB for the database bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withTransferPerMonthInGb(Integer transferPerMonthInGb) {
        setTransferPerMonthInGb(transferPerMonthInGb);
        return this;
    }

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     * 
     * @param cpuCount
     *        The number of virtual CPUs (vCPUs) for the database bundle.
     */

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     * 
     * @return The number of virtual CPUs (vCPUs) for the database bundle.
     */

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * <p>
     * The number of virtual CPUs (vCPUs) for the database bundle.
     * </p>
     * 
     * @param cpuCount
     *        The number of virtual CPUs (vCPUs) for the database bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withCpuCount(Integer cpuCount) {
        setCpuCount(cpuCount);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     * 
     * @param isEncrypted
     *        A Boolean value indicating whether the database bundle is encrypted.
     */

    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     * 
     * @return A Boolean value indicating whether the database bundle is encrypted.
     */

    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     * 
     * @param isEncrypted
     *        A Boolean value indicating whether the database bundle is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withIsEncrypted(Boolean isEncrypted) {
        setIsEncrypted(isEncrypted);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is encrypted.
     * </p>
     * 
     * @return A Boolean value indicating whether the database bundle is encrypted.
     */

    public Boolean isEncrypted() {
        return this.isEncrypted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the database bundle is active.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     * 
     * @return A Boolean value indicating whether the database bundle is active.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the database bundle is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBundle withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the database bundle is active.
     * </p>
     * 
     * @return A Boolean value indicating whether the database bundle is active.
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
        if (getRamSizeInGb() != null)
            sb.append("RamSizeInGb: ").append(getRamSizeInGb()).append(",");
        if (getDiskSizeInGb() != null)
            sb.append("DiskSizeInGb: ").append(getDiskSizeInGb()).append(",");
        if (getTransferPerMonthInGb() != null)
            sb.append("TransferPerMonthInGb: ").append(getTransferPerMonthInGb()).append(",");
        if (getCpuCount() != null)
            sb.append("CpuCount: ").append(getCpuCount()).append(",");
        if (getIsEncrypted() != null)
            sb.append("IsEncrypted: ").append(getIsEncrypted()).append(",");
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

        if (obj instanceof RelationalDatabaseBundle == false)
            return false;
        RelationalDatabaseBundle other = (RelationalDatabaseBundle) obj;
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
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        if (other.getDiskSizeInGb() == null ^ this.getDiskSizeInGb() == null)
            return false;
        if (other.getDiskSizeInGb() != null && other.getDiskSizeInGb().equals(this.getDiskSizeInGb()) == false)
            return false;
        if (other.getTransferPerMonthInGb() == null ^ this.getTransferPerMonthInGb() == null)
            return false;
        if (other.getTransferPerMonthInGb() != null && other.getTransferPerMonthInGb().equals(this.getTransferPerMonthInGb()) == false)
            return false;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getIsEncrypted() == null ^ this.getIsEncrypted() == null)
            return false;
        if (other.getIsEncrypted() != null && other.getIsEncrypted().equals(this.getIsEncrypted()) == false)
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
        hashCode = prime * hashCode + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getDiskSizeInGb() == null) ? 0 : getDiskSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getTransferPerMonthInGb() == null) ? 0 : getTransferPerMonthInGb().hashCode());
        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode + ((getIsEncrypted() == null) ? 0 : getIsEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseBundle clone() {
        try {
            return (RelationalDatabaseBundle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseBundleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
