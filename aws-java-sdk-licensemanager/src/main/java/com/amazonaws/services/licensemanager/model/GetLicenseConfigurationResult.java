/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique ID for the license configuration.
     * </p>
     */
    private String licenseConfigurationId;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
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
     * Dimension on which the licenses are counted.
     * </p>
     */
    private String licenseCountingType;
    /**
     * <p>
     * License rules.
     * </p>
     */
    private java.util.List<String> licenseRules;
    /**
     * <p>
     * Number of available licenses.
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
     * Number of licenses assigned to resources.
     * </p>
     */
    private Long consumedLicenses;
    /**
     * <p>
     * License configuration status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Account ID of the owner of the license configuration.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * Summaries of the licenses consumed by resources.
     * </p>
     */
    private java.util.List<ConsumedLicenseSummary> consumedLicenseSummaryList;
    /**
     * <p>
     * Summaries of the managed resources.
     * </p>
     */
    private java.util.List<ManagedResourceSummary> managedResourceSummaryList;
    /**
     * <p>
     * Tags for the license configuration.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Product information.
     * </p>
     */
    private java.util.List<ProductInformation> productInformationList;
    /**
     * <p>
     * Automated discovery information.
     * </p>
     */
    private AutomatedDiscoveryInformation automatedDiscoveryInformation;

    /**
     * <p>
     * Unique ID for the license configuration.
     * </p>
     * 
     * @param licenseConfigurationId
     *        Unique ID for the license configuration.
     */

    public void setLicenseConfigurationId(String licenseConfigurationId) {
        this.licenseConfigurationId = licenseConfigurationId;
    }

    /**
     * <p>
     * Unique ID for the license configuration.
     * </p>
     * 
     * @return Unique ID for the license configuration.
     */

    public String getLicenseConfigurationId() {
        return this.licenseConfigurationId;
    }

    /**
     * <p>
     * Unique ID for the license configuration.
     * </p>
     * 
     * @param licenseConfigurationId
     *        Unique ID for the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withLicenseConfigurationId(String licenseConfigurationId) {
        setLicenseConfigurationId(licenseConfigurationId);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        Amazon Resource Name (ARN) of the license configuration.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license configuration.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        Amazon Resource Name (ARN) of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withLicenseConfigurationArn(String licenseConfigurationArn) {
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

    public GetLicenseConfigurationResult withName(String name) {
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

    public GetLicenseConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Dimension on which the licenses are counted.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension on which the licenses are counted.
     * @see LicenseCountingType
     */

    public void setLicenseCountingType(String licenseCountingType) {
        this.licenseCountingType = licenseCountingType;
    }

    /**
     * <p>
     * Dimension on which the licenses are counted.
     * </p>
     * 
     * @return Dimension on which the licenses are counted.
     * @see LicenseCountingType
     */

    public String getLicenseCountingType() {
        return this.licenseCountingType;
    }

    /**
     * <p>
     * Dimension on which the licenses are counted.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension on which the licenses are counted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public GetLicenseConfigurationResult withLicenseCountingType(String licenseCountingType) {
        setLicenseCountingType(licenseCountingType);
        return this;
    }

    /**
     * <p>
     * Dimension on which the licenses are counted.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension on which the licenses are counted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public GetLicenseConfigurationResult withLicenseCountingType(LicenseCountingType licenseCountingType) {
        this.licenseCountingType = licenseCountingType.toString();
        return this;
    }

    /**
     * <p>
     * License rules.
     * </p>
     * 
     * @return License rules.
     */

    public java.util.List<String> getLicenseRules() {
        return licenseRules;
    }

    /**
     * <p>
     * License rules.
     * </p>
     * 
     * @param licenseRules
     *        License rules.
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
     * License rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseRules(java.util.Collection)} or {@link #withLicenseRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseRules
     *        License rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withLicenseRules(String... licenseRules) {
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
     * License rules.
     * </p>
     * 
     * @param licenseRules
     *        License rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withLicenseRules(java.util.Collection<String> licenseRules) {
        setLicenseRules(licenseRules);
        return this;
    }

    /**
     * <p>
     * Number of available licenses.
     * </p>
     * 
     * @param licenseCount
     *        Number of available licenses.
     */

    public void setLicenseCount(Long licenseCount) {
        this.licenseCount = licenseCount;
    }

    /**
     * <p>
     * Number of available licenses.
     * </p>
     * 
     * @return Number of available licenses.
     */

    public Long getLicenseCount() {
        return this.licenseCount;
    }

    /**
     * <p>
     * Number of available licenses.
     * </p>
     * 
     * @param licenseCount
     *        Number of available licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withLicenseCount(Long licenseCount) {
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

    public GetLicenseConfigurationResult withLicenseCountHardLimit(Boolean licenseCountHardLimit) {
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
     * Number of licenses assigned to resources.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses assigned to resources.
     */

    public void setConsumedLicenses(Long consumedLicenses) {
        this.consumedLicenses = consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses assigned to resources.
     * </p>
     * 
     * @return Number of licenses assigned to resources.
     */

    public Long getConsumedLicenses() {
        return this.consumedLicenses;
    }

    /**
     * <p>
     * Number of licenses assigned to resources.
     * </p>
     * 
     * @param consumedLicenses
     *        Number of licenses assigned to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withConsumedLicenses(Long consumedLicenses) {
        setConsumedLicenses(consumedLicenses);
        return this;
    }

    /**
     * <p>
     * License configuration status.
     * </p>
     * 
     * @param status
     *        License configuration status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * License configuration status.
     * </p>
     * 
     * @return License configuration status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * License configuration status.
     * </p>
     * 
     * @param status
     *        License configuration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Account ID of the owner of the license configuration.
     * </p>
     * 
     * @param ownerAccountId
     *        Account ID of the owner of the license configuration.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * Account ID of the owner of the license configuration.
     * </p>
     * 
     * @return Account ID of the owner of the license configuration.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * Account ID of the owner of the license configuration.
     * </p>
     * 
     * @param ownerAccountId
     *        Account ID of the owner of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * Summaries of the licenses consumed by resources.
     * </p>
     * 
     * @return Summaries of the licenses consumed by resources.
     */

    public java.util.List<ConsumedLicenseSummary> getConsumedLicenseSummaryList() {
        return consumedLicenseSummaryList;
    }

    /**
     * <p>
     * Summaries of the licenses consumed by resources.
     * </p>
     * 
     * @param consumedLicenseSummaryList
     *        Summaries of the licenses consumed by resources.
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
     * Summaries of the licenses consumed by resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedLicenseSummaryList(java.util.Collection)} or
     * {@link #withConsumedLicenseSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param consumedLicenseSummaryList
     *        Summaries of the licenses consumed by resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withConsumedLicenseSummaryList(ConsumedLicenseSummary... consumedLicenseSummaryList) {
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
     * Summaries of the licenses consumed by resources.
     * </p>
     * 
     * @param consumedLicenseSummaryList
     *        Summaries of the licenses consumed by resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withConsumedLicenseSummaryList(java.util.Collection<ConsumedLicenseSummary> consumedLicenseSummaryList) {
        setConsumedLicenseSummaryList(consumedLicenseSummaryList);
        return this;
    }

    /**
     * <p>
     * Summaries of the managed resources.
     * </p>
     * 
     * @return Summaries of the managed resources.
     */

    public java.util.List<ManagedResourceSummary> getManagedResourceSummaryList() {
        return managedResourceSummaryList;
    }

    /**
     * <p>
     * Summaries of the managed resources.
     * </p>
     * 
     * @param managedResourceSummaryList
     *        Summaries of the managed resources.
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
     * Summaries of the managed resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedResourceSummaryList(java.util.Collection)} or
     * {@link #withManagedResourceSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param managedResourceSummaryList
     *        Summaries of the managed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withManagedResourceSummaryList(ManagedResourceSummary... managedResourceSummaryList) {
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
     * Summaries of the managed resources.
     * </p>
     * 
     * @param managedResourceSummaryList
     *        Summaries of the managed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withManagedResourceSummaryList(java.util.Collection<ManagedResourceSummary> managedResourceSummaryList) {
        setManagedResourceSummaryList(managedResourceSummaryList);
        return this;
    }

    /**
     * <p>
     * Tags for the license configuration.
     * </p>
     * 
     * @return Tags for the license configuration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the license configuration.
     * </p>
     * 
     * @param tags
     *        Tags for the license configuration.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags for the license configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags for the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for the license configuration.
     * </p>
     * 
     * @param tags
     *        Tags for the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Product information.
     * </p>
     * 
     * @return Product information.
     */

    public java.util.List<ProductInformation> getProductInformationList() {
        return productInformationList;
    }

    /**
     * <p>
     * Product information.
     * </p>
     * 
     * @param productInformationList
     *        Product information.
     */

    public void setProductInformationList(java.util.Collection<ProductInformation> productInformationList) {
        if (productInformationList == null) {
            this.productInformationList = null;
            return;
        }

        this.productInformationList = new java.util.ArrayList<ProductInformation>(productInformationList);
    }

    /**
     * <p>
     * Product information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductInformationList(java.util.Collection)} or
     * {@link #withProductInformationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param productInformationList
     *        Product information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withProductInformationList(ProductInformation... productInformationList) {
        if (this.productInformationList == null) {
            setProductInformationList(new java.util.ArrayList<ProductInformation>(productInformationList.length));
        }
        for (ProductInformation ele : productInformationList) {
            this.productInformationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Product information.
     * </p>
     * 
     * @param productInformationList
     *        Product information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withProductInformationList(java.util.Collection<ProductInformation> productInformationList) {
        setProductInformationList(productInformationList);
        return this;
    }

    /**
     * <p>
     * Automated discovery information.
     * </p>
     * 
     * @param automatedDiscoveryInformation
     *        Automated discovery information.
     */

    public void setAutomatedDiscoveryInformation(AutomatedDiscoveryInformation automatedDiscoveryInformation) {
        this.automatedDiscoveryInformation = automatedDiscoveryInformation;
    }

    /**
     * <p>
     * Automated discovery information.
     * </p>
     * 
     * @return Automated discovery information.
     */

    public AutomatedDiscoveryInformation getAutomatedDiscoveryInformation() {
        return this.automatedDiscoveryInformation;
    }

    /**
     * <p>
     * Automated discovery information.
     * </p>
     * 
     * @param automatedDiscoveryInformation
     *        Automated discovery information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseConfigurationResult withAutomatedDiscoveryInformation(AutomatedDiscoveryInformation automatedDiscoveryInformation) {
        setAutomatedDiscoveryInformation(automatedDiscoveryInformation);
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
            sb.append("ManagedResourceSummaryList: ").append(getManagedResourceSummaryList()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProductInformationList() != null)
            sb.append("ProductInformationList: ").append(getProductInformationList()).append(",");
        if (getAutomatedDiscoveryInformation() != null)
            sb.append("AutomatedDiscoveryInformation: ").append(getAutomatedDiscoveryInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLicenseConfigurationResult == false)
            return false;
        GetLicenseConfigurationResult other = (GetLicenseConfigurationResult) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProductInformationList() == null ^ this.getProductInformationList() == null)
            return false;
        if (other.getProductInformationList() != null && other.getProductInformationList().equals(this.getProductInformationList()) == false)
            return false;
        if (other.getAutomatedDiscoveryInformation() == null ^ this.getAutomatedDiscoveryInformation() == null)
            return false;
        if (other.getAutomatedDiscoveryInformation() != null
                && other.getAutomatedDiscoveryInformation().equals(this.getAutomatedDiscoveryInformation()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProductInformationList() == null) ? 0 : getProductInformationList().hashCode());
        hashCode = prime * hashCode + ((getAutomatedDiscoveryInformation() == null) ? 0 : getAutomatedDiscoveryInformation().hashCode());
        return hashCode;
    }

    @Override
    public GetLicenseConfigurationResult clone() {
        try {
            return (GetLicenseConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
