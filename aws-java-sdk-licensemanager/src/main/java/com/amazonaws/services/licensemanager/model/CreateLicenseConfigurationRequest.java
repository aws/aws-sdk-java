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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLicenseConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Dimension used to track the license inventory.
     * </p>
     */
    private String licenseCountingType;
    /**
     * <p>
     * Number of licenses managed by the license configuration.
     * </p>
     */
    private Long licenseCount;
    /**
     * <p>
     * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new
     * instances.
     * </p>
     */
    private Boolean licenseCountHardLimit;
    /**
     * <p>
     * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary
     * by dimension.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> | <code>minimumCores</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     * <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> | <code>maximumVcpus</code>
     * | <code>minimumVcpus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     * <code>minimumSockets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     * <code>maximumVcpus</code> | <code>minimumVcpus</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> licenseRules;
    /**
     * <p>
     * Tags to add to the license configuration.
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

    public CreateLicenseConfigurationRequest withName(String name) {
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

    public CreateLicenseConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Dimension used to track the license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension used to track the license inventory.
     * @see LicenseCountingType
     */

    public void setLicenseCountingType(String licenseCountingType) {
        this.licenseCountingType = licenseCountingType;
    }

    /**
     * <p>
     * Dimension used to track the license inventory.
     * </p>
     * 
     * @return Dimension used to track the license inventory.
     * @see LicenseCountingType
     */

    public String getLicenseCountingType() {
        return this.licenseCountingType;
    }

    /**
     * <p>
     * Dimension used to track the license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension used to track the license inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public CreateLicenseConfigurationRequest withLicenseCountingType(String licenseCountingType) {
        setLicenseCountingType(licenseCountingType);
        return this;
    }

    /**
     * <p>
     * Dimension used to track the license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension used to track the license inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public CreateLicenseConfigurationRequest withLicenseCountingType(LicenseCountingType licenseCountingType) {
        this.licenseCountingType = licenseCountingType.toString();
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

    public CreateLicenseConfigurationRequest withLicenseCount(Long licenseCount) {
        setLicenseCount(licenseCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new
     * instances.
     * </p>
     * 
     * @param licenseCountHardLimit
     *        Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of
     *        new instances.
     */

    public void setLicenseCountHardLimit(Boolean licenseCountHardLimit) {
        this.licenseCountHardLimit = licenseCountHardLimit;
    }

    /**
     * <p>
     * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new
     * instances.
     * </p>
     * 
     * @return Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of
     *         new instances.
     */

    public Boolean getLicenseCountHardLimit() {
        return this.licenseCountHardLimit;
    }

    /**
     * <p>
     * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new
     * instances.
     * </p>
     * 
     * @param licenseCountHardLimit
     *        Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of
     *        new instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withLicenseCountHardLimit(Boolean licenseCountHardLimit) {
        setLicenseCountHardLimit(licenseCountHardLimit);
        return this;
    }

    /**
     * <p>
     * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new
     * instances.
     * </p>
     * 
     * @return Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of
     *         new instances.
     */

    public Boolean isLicenseCountHardLimit() {
        return this.licenseCountHardLimit;
    }

    /**
     * <p>
     * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary
     * by dimension.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> | <code>minimumCores</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     * <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> | <code>maximumVcpus</code>
     * | <code>minimumVcpus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     * <code>minimumSockets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     * <code>maximumVcpus</code> | <code>minimumVcpus</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available
     *         rules vary by dimension.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *         <code>minimumCores</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *         <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> |
     *         <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     *         <code>minimumSockets</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     *         <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getLicenseRules() {
        return licenseRules;
    }

    /**
     * <p>
     * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary
     * by dimension.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> | <code>minimumCores</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     * <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> | <code>maximumVcpus</code>
     * | <code>minimumVcpus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     * <code>minimumSockets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     * <code>maximumVcpus</code> | <code>minimumVcpus</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param licenseRules
     *        License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules
     *        vary by dimension.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *        <code>minimumCores</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *        <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> |
     *        <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     *        <code>minimumSockets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     *        <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *        </p>
     *        </li>
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
     * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary
     * by dimension.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> | <code>minimumCores</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     * <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> | <code>maximumVcpus</code>
     * | <code>minimumVcpus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     * <code>minimumSockets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     * <code>maximumVcpus</code> | <code>minimumVcpus</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseRules(java.util.Collection)} or {@link #withLicenseRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseRules
     *        License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules
     *        vary by dimension.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *        <code>minimumCores</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *        <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> |
     *        <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     *        <code>minimumSockets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     *        <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withLicenseRules(String... licenseRules) {
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
     * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary
     * by dimension.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> | <code>minimumCores</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     * <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> | <code>maximumVcpus</code>
     * | <code>minimumVcpus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     * <code>minimumSockets</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     * <code>maximumVcpus</code> | <code>minimumVcpus</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param licenseRules
     *        License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules
     *        vary by dimension.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Cores</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *        <code>minimumCores</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Instances</code> dimension: <code>allowedTenancy</code> | <code>maximumCores</code> |
     *        <code>minimumCores</code> | <code>maximumSockets</code> | <code>minimumSockets</code> |
     *        <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sockets</code> dimension: <code>allowedTenancy</code> | <code>maximumSockets</code> |
     *        <code>minimumSockets</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vCPUs</code> dimension: <code>allowedTenancy</code> | <code>honorVcpuOptimization</code> |
     *        <code>maximumVcpus</code> | <code>minimumVcpus</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withLicenseRules(java.util.Collection<String> licenseRules) {
        setLicenseRules(licenseRules);
        return this;
    }

    /**
     * <p>
     * Tags to add to the license configuration.
     * </p>
     * 
     * @return Tags to add to the license configuration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to add to the license configuration.
     * </p>
     * 
     * @param tags
     *        Tags to add to the license configuration.
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
     * Tags to add to the license configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to add to the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withTags(Tag... tags) {
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
     * Tags to add to the license configuration.
     * </p>
     * 
     * @param tags
     *        Tags to add to the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withTags(java.util.Collection<Tag> tags) {
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

    public CreateLicenseConfigurationRequest withProductInformationList(ProductInformation... productInformationList) {
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

    public CreateLicenseConfigurationRequest withProductInformationList(java.util.Collection<ProductInformation> productInformationList) {
        setProductInformationList(productInformationList);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLicenseCountingType() != null)
            sb.append("LicenseCountingType: ").append(getLicenseCountingType()).append(",");
        if (getLicenseCount() != null)
            sb.append("LicenseCount: ").append(getLicenseCount()).append(",");
        if (getLicenseCountHardLimit() != null)
            sb.append("LicenseCountHardLimit: ").append(getLicenseCountHardLimit()).append(",");
        if (getLicenseRules() != null)
            sb.append("LicenseRules: ").append(getLicenseRules()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProductInformationList() != null)
            sb.append("ProductInformationList: ").append(getProductInformationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLicenseConfigurationRequest == false)
            return false;
        CreateLicenseConfigurationRequest other = (CreateLicenseConfigurationRequest) obj;
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
        if (other.getLicenseCount() == null ^ this.getLicenseCount() == null)
            return false;
        if (other.getLicenseCount() != null && other.getLicenseCount().equals(this.getLicenseCount()) == false)
            return false;
        if (other.getLicenseCountHardLimit() == null ^ this.getLicenseCountHardLimit() == null)
            return false;
        if (other.getLicenseCountHardLimit() != null && other.getLicenseCountHardLimit().equals(this.getLicenseCountHardLimit()) == false)
            return false;
        if (other.getLicenseRules() == null ^ this.getLicenseRules() == null)
            return false;
        if (other.getLicenseRules() != null && other.getLicenseRules().equals(this.getLicenseRules()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProductInformationList() == null ^ this.getProductInformationList() == null)
            return false;
        if (other.getProductInformationList() != null && other.getProductInformationList().equals(this.getProductInformationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLicenseCountingType() == null) ? 0 : getLicenseCountingType().hashCode());
        hashCode = prime * hashCode + ((getLicenseCount() == null) ? 0 : getLicenseCount().hashCode());
        hashCode = prime * hashCode + ((getLicenseCountHardLimit() == null) ? 0 : getLicenseCountHardLimit().hashCode());
        hashCode = prime * hashCode + ((getLicenseRules() == null) ? 0 : getLicenseRules().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProductInformationList() == null) ? 0 : getProductInformationList().hashCode());
        return hashCode;
    }

    @Override
    public CreateLicenseConfigurationRequest clone() {
        return (CreateLicenseConfigurationRequest) super.clone();
    }

}
