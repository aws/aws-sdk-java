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
 * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by
 * License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or
 * VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host
 * affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/LicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique ID of the <code>LicenseConfiguration</code> object.
     * </p>
     */
    private String licenseConfigurationId;
    /**
     * <p>
     * ARN of the <code>LicenseConfiguration</code> object.
     * </p>
     */
    private String licenseConfigurationArn;
    /**
     * <p>
     * Name of the license configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the license configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Dimension to use to track license inventory.
     * </p>
     */
    private String licenseCountingType;
    /**
     * <p>
     * Array of configured License Manager rules.
     * </p>
     */
    private java.util.List<String> licenseRules;
    /**
     * <p>
     * Number of licenses managed by the license configuration.
     * </p>
     */
    private Long licenseCount;
    /**
     * <p>
     * Sets the number of available licenses as a hard limit.
     * </p>
     */
    private Boolean licenseCountHardLimit;
    /**
     * <p>
     * Number of licenses consumed.
     * </p>
     */
    private Long consumedLicenses;
    /**
     * <p>
     * Status of the license configuration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Account ID of the license configuration's owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * List of summaries for licenses consumed by various resources.
     * </p>
     */
    private java.util.List<ConsumedLicenseSummary> consumedLicenseSummaryList;
    /**
     * <p>
     * List of summaries for managed resources.
     * </p>
     */
    private java.util.List<ManagedResourceSummary> managedResourceSummaryList;

    /**
     * <p>
     * Unique ID of the <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @param licenseConfigurationId
     *        Unique ID of the <code>LicenseConfiguration</code> object.
     */

    public void setLicenseConfigurationId(String licenseConfigurationId) {
        this.licenseConfigurationId = licenseConfigurationId;
    }

    /**
     * <p>
     * Unique ID of the <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @return Unique ID of the <code>LicenseConfiguration</code> object.
     */

    public String getLicenseConfigurationId() {
        return this.licenseConfigurationId;
    }

    /**
     * <p>
     * Unique ID of the <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @param licenseConfigurationId
     *        Unique ID of the <code>LicenseConfiguration</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseConfigurationId(String licenseConfigurationId) {
        setLicenseConfigurationId(licenseConfigurationId);
        return this;
    }

    /**
     * <p>
     * ARN of the <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        ARN of the <code>LicenseConfiguration</code> object.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @return ARN of the <code>LicenseConfiguration</code> object.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        ARN of the <code>LicenseConfiguration</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseConfigurationArn(String licenseConfigurationArn) {
        setLicenseConfigurationArn(licenseConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Name of the license configuration.
     * </p>
     * 
     * @param name
     *        Name of the license configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the license configuration.
     * </p>
     * 
     * @return Name of the license configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the license configuration.
     * </p>
     * 
     * @param name
     *        Name of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the license configuration.
     * </p>
     * 
     * @param description
     *        Description of the license configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the license configuration.
     * </p>
     * 
     * @return Description of the license configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the license configuration.
     * </p>
     * 
     * @param description
     *        Description of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Dimension to use to track license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension to use to track license inventory.
     * @see LicenseCountingType
     */

    public void setLicenseCountingType(String licenseCountingType) {
        this.licenseCountingType = licenseCountingType;
    }

    /**
     * <p>
     * Dimension to use to track license inventory.
     * </p>
     * 
     * @return Dimension to use to track license inventory.
     * @see LicenseCountingType
     */

    public String getLicenseCountingType() {
        return this.licenseCountingType;
    }

    /**
     * <p>
     * Dimension to use to track license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension to use to track license inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public LicenseConfiguration withLicenseCountingType(String licenseCountingType) {
        setLicenseCountingType(licenseCountingType);
        return this;
    }

    /**
     * <p>
     * Dimension to use to track license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension to use to track license inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public LicenseConfiguration withLicenseCountingType(LicenseCountingType licenseCountingType) {
        this.licenseCountingType = licenseCountingType.toString();
        return this;
    }

    /**
     * <p>
     * Array of configured License Manager rules.
     * </p>
     * 
     * @return Array of configured License Manager rules.
     */

    public java.util.List<String> getLicenseRules() {
        return licenseRules;
    }

    /**
     * <p>
     * Array of configured License Manager rules.
     * </p>
     * 
     * @param licenseRules
     *        Array of configured License Manager rules.
     */

    public void setLicenseRules(java.util.Collection<String> licenseRules) {
        if (licenseRules == null) {
            this.licenseRules = null;
            return;
        }

        this.licenseRules = new java.util.ArrayList<String>(licenseRules);
    }

    /**
     * <p>
     * Array of configured License Manager rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseRules(java.util.Collection)} or {@link #withLicenseRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseRules
     *        Array of configured License Manager rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseRules(String... licenseRules) {
        if (this.licenseRules == null) {
            setLicenseRules(new java.util.ArrayList<String>(licenseRules.length));
        }
        for (String ele : licenseRules) {
            this.licenseRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of configured License Manager rules.
     * </p>
     * 
     * @param licenseRules
     *        Array of configured License Manager rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseRules(java.util.Collection<String> licenseRules) {
        setLicenseRules(licenseRules);
        return this;
    }

    /**
     * <p>
     * Number of licenses managed by the license configuration.
     * </p>
     * 
     * @param licenseCount
     *        Number of licenses managed by the license configuration.
     */

    public void setLicenseCount(Long licenseCount) {
        this.licenseCount = licenseCount;
    }

    /**
     * <p>
     * Number of licenses managed by the license configuration.
     * </p>
     * 
     * @return Number of licenses managed by the license configuration.
     */

    public Long getLicenseCount() {
        return this.licenseCount;
    }

    /**
     * <p>
     * Number of licenses managed by the license configuration.
     * </p>
     * 
     * @param licenseCount
     *        Number of licenses managed by the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseCount(Long licenseCount) {
        setLicenseCount(licenseCount);
        return this;
    }

    /**
     * <p>
     * Sets the number of available licenses as a hard limit.
     * </p>
     * 
     * @param licenseCountHardLimit
     *        Sets the number of available licenses as a hard limit.
     */

    public void setLicenseCountHardLimit(Boolean licenseCountHardLimit) {
        this.licenseCountHardLimit = licenseCountHardLimit;
    }

    /**
     * <p>
     * Sets the number of available licenses as a hard limit.
     * </p>
     * 
     * @return Sets the number of available licenses as a hard limit.
     */

    public Boolean getLicenseCountHardLimit() {
        return this.licenseCountHardLimit;
    }

    /**
     * <p>
     * Sets the number of available licenses as a hard limit.
     * </p>
     * 
     * @param licenseCountHardLimit
     *        Sets the number of available licenses as a hard limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withLicenseCountHardLimit(Boolean licenseCountHardLimit) {
        setLicenseCountHardLimit(licenseCountHardLimit);
        return this;
    }

    /**
     * <p>
     * Sets the number of available licenses as a hard limit.
     * </p>
     * 
     * @return Sets the number of available licenses as a hard limit.
     */

    public Boolean isLicenseCountHardLimit() {
        return this.licenseCountHardLimit;
    }

    /**
     * <p>
     * Number of licenses consumed.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses consumed.
     */

    public void setConsumedLicenses(Long consumedLicenses) {
        this.consumedLicenses = consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses consumed.
     * </p>
     * 
     * @return Number of licenses consumed.
     */

    public Long getConsumedLicenses() {
        return this.consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses consumed.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses consumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withConsumedLicenses(Long consumedLicenses) {
        setConsumedLicenses(consumedLicenses);
        return this;
    }

    /**
     * <p>
     * Status of the license configuration.
     * </p>
     * 
     * @param status
     *        Status of the license configuration.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the license configuration.
     * </p>
     * 
     * @return Status of the license configuration.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the license configuration.
     * </p>
     * 
     * @param status
     *        Status of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Account ID of the license configuration's owner.
     * </p>
     * 
     * @param ownerAccountId
     *        Account ID of the license configuration's owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * Account ID of the license configuration's owner.
     * </p>
     * 
     * @return Account ID of the license configuration's owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * Account ID of the license configuration's owner.
     * </p>
     * 
     * @param ownerAccountId
     *        Account ID of the license configuration's owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * List of summaries for licenses consumed by various resources.
     * </p>
     * 
     * @return List of summaries for licenses consumed by various resources.
     */

    public java.util.List<ConsumedLicenseSummary> getConsumedLicenseSummaryList() {
        return consumedLicenseSummaryList;
    }

    /**
     * <p>
     * List of summaries for licenses consumed by various resources.
     * </p>
     * 
     * @param consumedLicenseSummaryList
     *        List of summaries for licenses consumed by various resources.
     */

    public void setConsumedLicenseSummaryList(java.util.Collection<ConsumedLicenseSummary> consumedLicenseSummaryList) {
        if (consumedLicenseSummaryList == null) {
            this.consumedLicenseSummaryList = null;
            return;
        }

        this.consumedLicenseSummaryList = new java.util.ArrayList<ConsumedLicenseSummary>(consumedLicenseSummaryList);
    }

    /**
     * <p>
     * List of summaries for licenses consumed by various resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedLicenseSummaryList(java.util.Collection)} or
     * {@link #withConsumedLicenseSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param consumedLicenseSummaryList
     *        List of summaries for licenses consumed by various resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withConsumedLicenseSummaryList(ConsumedLicenseSummary... consumedLicenseSummaryList) {
        if (this.consumedLicenseSummaryList == null) {
            setConsumedLicenseSummaryList(new java.util.ArrayList<ConsumedLicenseSummary>(consumedLicenseSummaryList.length));
        }
        for (ConsumedLicenseSummary ele : consumedLicenseSummaryList) {
            this.consumedLicenseSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of summaries for licenses consumed by various resources.
     * </p>
     * 
     * @param consumedLicenseSummaryList
     *        List of summaries for licenses consumed by various resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withConsumedLicenseSummaryList(java.util.Collection<ConsumedLicenseSummary> consumedLicenseSummaryList) {
        setConsumedLicenseSummaryList(consumedLicenseSummaryList);
        return this;
    }

    /**
     * <p>
     * List of summaries for managed resources.
     * </p>
     * 
     * @return List of summaries for managed resources.
     */

    public java.util.List<ManagedResourceSummary> getManagedResourceSummaryList() {
        return managedResourceSummaryList;
    }

    /**
     * <p>
     * List of summaries for managed resources.
     * </p>
     * 
     * @param managedResourceSummaryList
     *        List of summaries for managed resources.
     */

    public void setManagedResourceSummaryList(java.util.Collection<ManagedResourceSummary> managedResourceSummaryList) {
        if (managedResourceSummaryList == null) {
            this.managedResourceSummaryList = null;
            return;
        }

        this.managedResourceSummaryList = new java.util.ArrayList<ManagedResourceSummary>(managedResourceSummaryList);
    }

    /**
     * <p>
     * List of summaries for managed resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedResourceSummaryList(java.util.Collection)} or
     * {@link #withManagedResourceSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param managedResourceSummaryList
     *        List of summaries for managed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withManagedResourceSummaryList(ManagedResourceSummary... managedResourceSummaryList) {
        if (this.managedResourceSummaryList == null) {
            setManagedResourceSummaryList(new java.util.ArrayList<ManagedResourceSummary>(managedResourceSummaryList.length));
        }
        for (ManagedResourceSummary ele : managedResourceSummaryList) {
            this.managedResourceSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of summaries for managed resources.
     * </p>
     * 
     * @param managedResourceSummaryList
     *        List of summaries for managed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfiguration withManagedResourceSummaryList(java.util.Collection<ManagedResourceSummary> managedResourceSummaryList) {
        setManagedResourceSummaryList(managedResourceSummaryList);
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
        if (getLicenseConfigurationId() != null)
            sb.append("LicenseConfigurationId: ").append(getLicenseConfigurationId()).append(",");
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: ").append(getLicenseConfigurationArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLicenseCountingType() != null)
            sb.append("LicenseCountingType: ").append(getLicenseCountingType()).append(",");
        if (getLicenseRules() != null)
            sb.append("LicenseRules: ").append(getLicenseRules()).append(",");
        if (getLicenseCount() != null)
            sb.append("LicenseCount: ").append(getLicenseCount()).append(",");
        if (getLicenseCountHardLimit() != null)
            sb.append("LicenseCountHardLimit: ").append(getLicenseCountHardLimit()).append(",");
        if (getConsumedLicenses() != null)
            sb.append("ConsumedLicenses: ").append(getConsumedLicenses()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getConsumedLicenseSummaryList() != null)
            sb.append("ConsumedLicenseSummaryList: ").append(getConsumedLicenseSummaryList()).append(",");
        if (getManagedResourceSummaryList() != null)
            sb.append("ManagedResourceSummaryList: ").append(getManagedResourceSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseConfiguration == false)
            return false;
        LicenseConfiguration other = (LicenseConfiguration) obj;
        if (other.getLicenseConfigurationId() == null ^ this.getLicenseConfigurationId() == null)
            return false;
        if (other.getLicenseConfigurationId() != null && other.getLicenseConfigurationId().equals(this.getLicenseConfigurationId()) == false)
            return false;
        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLicenseCountingType() == null ^ this.getLicenseCountingType() == null)
            return false;
        if (other.getLicenseCountingType() != null && other.getLicenseCountingType().equals(this.getLicenseCountingType()) == false)
            return false;
        if (other.getLicenseRules() == null ^ this.getLicenseRules() == null)
            return false;
        if (other.getLicenseRules() != null && other.getLicenseRules().equals(this.getLicenseRules()) == false)
            return false;
        if (other.getLicenseCount() == null ^ this.getLicenseCount() == null)
            return false;
        if (other.getLicenseCount() != null && other.getLicenseCount().equals(this.getLicenseCount()) == false)
            return false;
        if (other.getLicenseCountHardLimit() == null ^ this.getLicenseCountHardLimit() == null)
            return false;
        if (other.getLicenseCountHardLimit() != null && other.getLicenseCountHardLimit().equals(this.getLicenseCountHardLimit()) == false)
            return false;
        if (other.getConsumedLicenses() == null ^ this.getConsumedLicenses() == null)
            return false;
        if (other.getConsumedLicenses() != null && other.getConsumedLicenses().equals(this.getConsumedLicenses()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getConsumedLicenseSummaryList() == null ^ this.getConsumedLicenseSummaryList() == null)
            return false;
        if (other.getConsumedLicenseSummaryList() != null && other.getConsumedLicenseSummaryList().equals(this.getConsumedLicenseSummaryList()) == false)
            return false;
        if (other.getManagedResourceSummaryList() == null ^ this.getManagedResourceSummaryList() == null)
            return false;
        if (other.getManagedResourceSummaryList() != null && other.getManagedResourceSummaryList().equals(this.getManagedResourceSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationId() == null) ? 0 : getLicenseConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLicenseCountingType() == null) ? 0 : getLicenseCountingType().hashCode());
        hashCode = prime * hashCode + ((getLicenseRules() == null) ? 0 : getLicenseRules().hashCode());
        hashCode = prime * hashCode + ((getLicenseCount() == null) ? 0 : getLicenseCount().hashCode());
        hashCode = prime * hashCode + ((getLicenseCountHardLimit() == null) ? 0 : getLicenseCountHardLimit().hashCode());
        hashCode = prime * hashCode + ((getConsumedLicenses() == null) ? 0 : getConsumedLicenses().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getConsumedLicenseSummaryList() == null) ? 0 : getConsumedLicenseSummaryList().hashCode());
        hashCode = prime * hashCode + ((getManagedResourceSummaryList() == null) ? 0 : getManagedResourceSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public LicenseConfiguration clone() {
        try {
            return (LicenseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.LicenseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
