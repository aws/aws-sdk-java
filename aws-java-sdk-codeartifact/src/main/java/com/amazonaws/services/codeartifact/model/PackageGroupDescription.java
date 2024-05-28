/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of the package group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageGroupDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageGroupDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the package group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The pattern of the package group. The pattern determines which packages are associated with the package group.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * The name of the domain that contains the package group.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * A timestamp that represents the date and time the package group was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The contact information of the package group.
     * </p>
     */
    private String contactInfo;
    /**
     * <p>
     * The description of the package group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The package group origin configuration that determines how package versions can enter repositories.
     * </p>
     */
    private PackageGroupOriginConfiguration originConfiguration;
    /**
     * <p>
     * The direct parent package group of the package group.
     * </p>
     */
    private PackageGroupReference parent;

    /**
     * <p>
     * The ARN of the package group.
     * </p>
     * 
     * @param arn
     *        The ARN of the package group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the package group.
     * </p>
     * 
     * @return The ARN of the package group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the package group.
     * </p>
     * 
     * @param arn
     *        The ARN of the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The pattern of the package group. The pattern determines which packages are associated with the package group.
     * </p>
     * 
     * @param pattern
     *        The pattern of the package group. The pattern determines which packages are associated with the package
     *        group.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The pattern of the package group. The pattern determines which packages are associated with the package group.
     * </p>
     * 
     * @return The pattern of the package group. The pattern determines which packages are associated with the package
     *         group.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The pattern of the package group. The pattern determines which packages are associated with the package group.
     * </p>
     * 
     * @param pattern
     *        The pattern of the package group. The pattern determines which packages are associated with the package
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * The name of the domain that contains the package group.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that contains the package group.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the package group.
     * </p>
     * 
     * @return The name of the domain that contains the package group.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the package group.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that contains the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *        dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *         dashes or spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *        dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the package group was created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that represents the date and time the package group was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the package group was created.
     * </p>
     * 
     * @return A timestamp that represents the date and time the package group was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that represents the date and time the package group was created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that represents the date and time the package group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The contact information of the package group.
     * </p>
     * 
     * @param contactInfo
     *        The contact information of the package group.
     */

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * <p>
     * The contact information of the package group.
     * </p>
     * 
     * @return The contact information of the package group.
     */

    public String getContactInfo() {
        return this.contactInfo;
    }

    /**
     * <p>
     * The contact information of the package group.
     * </p>
     * 
     * @param contactInfo
     *        The contact information of the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withContactInfo(String contactInfo) {
        setContactInfo(contactInfo);
        return this;
    }

    /**
     * <p>
     * The description of the package group.
     * </p>
     * 
     * @param description
     *        The description of the package group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the package group.
     * </p>
     * 
     * @return The description of the package group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the package group.
     * </p>
     * 
     * @param description
     *        The description of the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The package group origin configuration that determines how package versions can enter repositories.
     * </p>
     * 
     * @param originConfiguration
     *        The package group origin configuration that determines how package versions can enter repositories.
     */

    public void setOriginConfiguration(PackageGroupOriginConfiguration originConfiguration) {
        this.originConfiguration = originConfiguration;
    }

    /**
     * <p>
     * The package group origin configuration that determines how package versions can enter repositories.
     * </p>
     * 
     * @return The package group origin configuration that determines how package versions can enter repositories.
     */

    public PackageGroupOriginConfiguration getOriginConfiguration() {
        return this.originConfiguration;
    }

    /**
     * <p>
     * The package group origin configuration that determines how package versions can enter repositories.
     * </p>
     * 
     * @param originConfiguration
     *        The package group origin configuration that determines how package versions can enter repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withOriginConfiguration(PackageGroupOriginConfiguration originConfiguration) {
        setOriginConfiguration(originConfiguration);
        return this;
    }

    /**
     * <p>
     * The direct parent package group of the package group.
     * </p>
     * 
     * @param parent
     *        The direct parent package group of the package group.
     */

    public void setParent(PackageGroupReference parent) {
        this.parent = parent;
    }

    /**
     * <p>
     * The direct parent package group of the package group.
     * </p>
     * 
     * @return The direct parent package group of the package group.
     */

    public PackageGroupReference getParent() {
        return this.parent;
    }

    /**
     * <p>
     * The direct parent package group of the package group.
     * </p>
     * 
     * @param parent
     *        The direct parent package group of the package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageGroupDescription withParent(PackageGroupReference parent) {
        setParent(parent);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getContactInfo() != null)
            sb.append("ContactInfo: ").append(getContactInfo()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOriginConfiguration() != null)
            sb.append("OriginConfiguration: ").append(getOriginConfiguration()).append(",");
        if (getParent() != null)
            sb.append("Parent: ").append(getParent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageGroupDescription == false)
            return false;
        PackageGroupDescription other = (PackageGroupDescription) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getContactInfo() == null ^ this.getContactInfo() == null)
            return false;
        if (other.getContactInfo() != null && other.getContactInfo().equals(this.getContactInfo()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOriginConfiguration() == null ^ this.getOriginConfiguration() == null)
            return false;
        if (other.getOriginConfiguration() != null && other.getOriginConfiguration().equals(this.getOriginConfiguration()) == false)
            return false;
        if (other.getParent() == null ^ this.getParent() == null)
            return false;
        if (other.getParent() != null && other.getParent().equals(this.getParent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getContactInfo() == null) ? 0 : getContactInfo().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOriginConfiguration() == null) ? 0 : getOriginConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParent() == null) ? 0 : getParent().hashCode());
        return hashCode;
    }

    @Override
    public PackageGroupDescription clone() {
        try {
            return (PackageGroupDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageGroupDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
