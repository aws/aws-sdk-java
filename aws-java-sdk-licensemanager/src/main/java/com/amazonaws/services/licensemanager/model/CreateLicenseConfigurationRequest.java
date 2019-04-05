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
     * Human-friendly description of the license configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Dimension to use to track the license inventory.
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
     * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked
     * deployment of new instances.
     * </p>
     */
    private Boolean licenseCountHardLimit;
    /**
     * <p>
     * Array of configured License Manager rules.
     * </p>
     */
    private java.util.List<String> licenseRules;
    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see CreateTags .
     * </p>
     * <p/>
     */
    private java.util.List<Tag> tags;

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
     * Human-friendly description of the license configuration.
     * </p>
     * 
     * @param description
     *        Human-friendly description of the license configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-friendly description of the license configuration.
     * </p>
     * 
     * @return Human-friendly description of the license configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-friendly description of the license configuration.
     * </p>
     * 
     * @param description
     *        Human-friendly description of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Dimension to use to track the license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension to use to track the license inventory.
     * @see LicenseCountingType
     */

    public void setLicenseCountingType(String licenseCountingType) {
        this.licenseCountingType = licenseCountingType;
    }

    /**
     * <p>
     * Dimension to use to track the license inventory.
     * </p>
     * 
     * @return Dimension to use to track the license inventory.
     * @see LicenseCountingType
     */

    public String getLicenseCountingType() {
        return this.licenseCountingType;
    }

    /**
     * <p>
     * Dimension to use to track the license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension to use to track the license inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseCountingType
     */

    public CreateLicenseConfigurationRequest withLicenseCountingType(String licenseCountingType) {
        setLicenseCountingType(licenseCountingType);
        return this;
    }

    /**
     * <p>
     * Dimension to use to track the license inventory.
     * </p>
     * 
     * @param licenseCountingType
     *        Dimension to use to track the license inventory.
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
     * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked
     * deployment of new instances.
     * </p>
     * 
     * @param licenseCountHardLimit
     *        Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the
     *        blocked deployment of new instances.
     */

    public void setLicenseCountHardLimit(Boolean licenseCountHardLimit) {
        this.licenseCountHardLimit = licenseCountHardLimit;
    }

    /**
     * <p>
     * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked
     * deployment of new instances.
     * </p>
     * 
     * @return Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the
     *         blocked deployment of new instances.
     */

    public Boolean getLicenseCountHardLimit() {
        return this.licenseCountHardLimit;
    }

    /**
     * <p>
     * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked
     * deployment of new instances.
     * </p>
     * 
     * @param licenseCountHardLimit
     *        Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the
     *        blocked deployment of new instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withLicenseCountHardLimit(Boolean licenseCountHardLimit) {
        setLicenseCountHardLimit(licenseCountHardLimit);
        return this;
    }

    /**
     * <p>
     * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked
     * deployment of new instances.
     * </p>
     * 
     * @return Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the
     *         blocked deployment of new instances.
     */

    public Boolean isLicenseCountHardLimit() {
        return this.licenseCountHardLimit;
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
     * Array of configured License Manager rules.
     * </p>
     * 
     * @param licenseRules
     *        Array of configured License Manager rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withLicenseRules(java.util.Collection<String> licenseRules) {
        setLicenseRules(licenseRules);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see CreateTags .
     * </p>
     * <p/>
     * 
     * @return The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *         specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *         after it has been created, see CreateTags .
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see CreateTags .
     * </p>
     * <p/>
     * 
     * @param tags
     *        The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *        specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *        after it has been created, see CreateTags .
     *        </p>
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
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see CreateTags .
     * </p>
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *        specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *        after it has been created, see CreateTags .</p>
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
     * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified
     * tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been
     * created, see CreateTags .
     * </p>
     * <p/>
     * 
     * @param tags
     *        The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The
     *        specified tags are applied to all instances or volumes that are created during launch. To tag a resource
     *        after it has been created, see CreateTags .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("Tags: ").append(getTags());
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
        return hashCode;
    }

    @Override
    public CreateLicenseConfigurationRequest clone() {
        return (CreateLicenseConfigurationRequest) super.clone();
    }

}
