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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLicenseConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN for a license configuration.
     * </p>
     */
    private String licenseConfigurationArn;
    /**
     * <p>
     * New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * </p>
     */
    private String licenseConfigurationStatus;
    /**
     * <p>
     * List of flexible text strings designating license rules.
     * </p>
     */
    private java.util.List<String> licenseRules;
    /**
     * <p>
     * New number of licenses managed by the license configuration.
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
     * New name of the license configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * New human-friendly description of the license configuration.
     * </p>
     */
    private String description;

    /**
     * <p>
     * ARN for a license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        ARN for a license configuration.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * ARN for a license configuration.
     * </p>
     * 
     * @return ARN for a license configuration.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * ARN for a license configuration.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        ARN for a license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseConfigurationRequest withLicenseConfigurationArn(String licenseConfigurationArn) {
        setLicenseConfigurationArn(licenseConfigurationArn);
        return this;
    }

    /**
     * <p>
     * New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param licenseConfigurationStatus
     *        New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * @see LicenseConfigurationStatus
     */

    public void setLicenseConfigurationStatus(String licenseConfigurationStatus) {
        this.licenseConfigurationStatus = licenseConfigurationStatus;
    }

    /**
     * <p>
     * New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @return New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * @see LicenseConfigurationStatus
     */

    public String getLicenseConfigurationStatus() {
        return this.licenseConfigurationStatus;
    }

    /**
     * <p>
     * New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param licenseConfigurationStatus
     *        New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseConfigurationStatus
     */

    public UpdateLicenseConfigurationRequest withLicenseConfigurationStatus(String licenseConfigurationStatus) {
        setLicenseConfigurationStatus(licenseConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param licenseConfigurationStatus
     *        New status of the license configuration (<code>ACTIVE</code> or <code>INACTIVE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseConfigurationStatus
     */

    public UpdateLicenseConfigurationRequest withLicenseConfigurationStatus(LicenseConfigurationStatus licenseConfigurationStatus) {
        this.licenseConfigurationStatus = licenseConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * List of flexible text strings designating license rules.
     * </p>
     * 
     * @return List of flexible text strings designating license rules.
     */

    public java.util.List<String> getLicenseRules() {
        return licenseRules;
    }

    /**
     * <p>
     * List of flexible text strings designating license rules.
     * </p>
     * 
     * @param licenseRules
     *        List of flexible text strings designating license rules.
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
     * List of flexible text strings designating license rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseRules(java.util.Collection)} or {@link #withLicenseRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseRules
     *        List of flexible text strings designating license rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseConfigurationRequest withLicenseRules(String... licenseRules) {
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
     * List of flexible text strings designating license rules.
     * </p>
     * 
     * @param licenseRules
     *        List of flexible text strings designating license rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseConfigurationRequest withLicenseRules(java.util.Collection<String> licenseRules) {
        setLicenseRules(licenseRules);
        return this;
    }

    /**
     * <p>
     * New number of licenses managed by the license configuration.
     * </p>
     * 
     * @param licenseCount
     *        New number of licenses managed by the license configuration.
     */

    public void setLicenseCount(Long licenseCount) {
        this.licenseCount = licenseCount;
    }

    /**
     * <p>
     * New number of licenses managed by the license configuration.
     * </p>
     * 
     * @return New number of licenses managed by the license configuration.
     */

    public Long getLicenseCount() {
        return this.licenseCount;
    }

    /**
     * <p>
     * New number of licenses managed by the license configuration.
     * </p>
     * 
     * @param licenseCount
     *        New number of licenses managed by the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseConfigurationRequest withLicenseCount(Long licenseCount) {
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

    public UpdateLicenseConfigurationRequest withLicenseCountHardLimit(Boolean licenseCountHardLimit) {
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
     * New name of the license configuration.
     * </p>
     * 
     * @param name
     *        New name of the license configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * New name of the license configuration.
     * </p>
     * 
     * @return New name of the license configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * New name of the license configuration.
     * </p>
     * 
     * @param name
     *        New name of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * New human-friendly description of the license configuration.
     * </p>
     * 
     * @param description
     *        New human-friendly description of the license configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * New human-friendly description of the license configuration.
     * </p>
     * 
     * @return New human-friendly description of the license configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * New human-friendly description of the license configuration.
     * </p>
     * 
     * @param description
     *        New human-friendly description of the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseConfigurationRequest withDescription(String description) {
        setDescription(description);
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
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: ").append(getLicenseConfigurationArn()).append(",");
        if (getLicenseConfigurationStatus() != null)
            sb.append("LicenseConfigurationStatus: ").append(getLicenseConfigurationStatus()).append(",");
        if (getLicenseRules() != null)
            sb.append("LicenseRules: ").append(getLicenseRules()).append(",");
        if (getLicenseCount() != null)
            sb.append("LicenseCount: ").append(getLicenseCount()).append(",");
        if (getLicenseCountHardLimit() != null)
            sb.append("LicenseCountHardLimit: ").append(getLicenseCountHardLimit()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLicenseConfigurationRequest == false)
            return false;
        UpdateLicenseConfigurationRequest other = (UpdateLicenseConfigurationRequest) obj;
        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        if (other.getLicenseConfigurationStatus() == null ^ this.getLicenseConfigurationStatus() == null)
            return false;
        if (other.getLicenseConfigurationStatus() != null && other.getLicenseConfigurationStatus().equals(this.getLicenseConfigurationStatus()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getLicenseConfigurationStatus() == null) ? 0 : getLicenseConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getLicenseRules() == null) ? 0 : getLicenseRules().hashCode());
        hashCode = prime * hashCode + ((getLicenseCount() == null) ? 0 : getLicenseCount().hashCode());
        hashCode = prime * hashCode + ((getLicenseCountHardLimit() == null) ? 0 : getLicenseCountHardLimit().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLicenseConfigurationRequest clone() {
        return (UpdateLicenseConfigurationRequest) super.clone();
    }

}
