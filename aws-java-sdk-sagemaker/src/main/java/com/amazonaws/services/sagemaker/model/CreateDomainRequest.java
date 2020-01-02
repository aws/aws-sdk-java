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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The mode of authentication that member use to access the domain.
     * </p>
     */
    private String authMode;
    /**
     * <p>
     * The default user settings.
     * </p>
     */
    private UserSettings defaultUserSettings;
    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     */
    private String homeEfsFileSystemKmsKeyId;

    /**
     * <p>
     * A name for the domain.
     * </p>
     * 
     * @param domainName
     *        A name for the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A name for the domain.
     * </p>
     * 
     * @return A name for the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A name for the domain.
     * </p>
     * 
     * @param domainName
     *        A name for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The mode of authentication that member use to access the domain.
     * </p>
     * 
     * @param authMode
     *        The mode of authentication that member use to access the domain.
     * @see AuthMode
     */

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    /**
     * <p>
     * The mode of authentication that member use to access the domain.
     * </p>
     * 
     * @return The mode of authentication that member use to access the domain.
     * @see AuthMode
     */

    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * <p>
     * The mode of authentication that member use to access the domain.
     * </p>
     * 
     * @param authMode
     *        The mode of authentication that member use to access the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreateDomainRequest withAuthMode(String authMode) {
        setAuthMode(authMode);
        return this;
    }

    /**
     * <p>
     * The mode of authentication that member use to access the domain.
     * </p>
     * 
     * @param authMode
     *        The mode of authentication that member use to access the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreateDomainRequest withAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
        return this;
    }

    /**
     * <p>
     * The default user settings.
     * </p>
     * 
     * @param defaultUserSettings
     *        The default user settings.
     */

    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * The default user settings.
     * </p>
     * 
     * @return The default user settings.
     */

    public UserSettings getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * <p>
     * The default user settings.
     * </p>
     * 
     * @param defaultUserSettings
     *        The default user settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDefaultUserSettings(UserSettings defaultUserSettings) {
        setDefaultUserSettings(defaultUserSettings);
        return this;
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * 
     * @return Security setting to limit to a set of subnets.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * 
     * @param subnetIds
     *        Security setting to limit to a set of subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Security setting to limit to a set of subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security setting to limit to a set of subnets.
     * </p>
     * 
     * @param subnetIds
     *        Security setting to limit to a set of subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     * </p>
     * 
     * @param vpcId
     *        Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     * </p>
     * 
     * @return Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     * </p>
     * 
     * @param vpcId
     *        Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @return Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
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
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(Tag... tags) {
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
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @param homeEfsFileSystemKmsKeyId
     *        The AWS Key Management Service encryption key ID.
     */

    public void setHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        this.homeEfsFileSystemKmsKeyId = homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @return The AWS Key Management Service encryption key ID.
     */

    public String getHomeEfsFileSystemKmsKeyId() {
        return this.homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * 
     * @param homeEfsFileSystemKmsKeyId
     *        The AWS Key Management Service encryption key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        setHomeEfsFileSystemKmsKeyId(homeEfsFileSystemKmsKeyId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAuthMode() != null)
            sb.append("AuthMode: ").append(getAuthMode()).append(",");
        if (getDefaultUserSettings() != null)
            sb.append("DefaultUserSettings: ").append(getDefaultUserSettings()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getHomeEfsFileSystemKmsKeyId() != null)
            sb.append("HomeEfsFileSystemKmsKeyId: ").append(getHomeEfsFileSystemKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAuthMode() == null ^ this.getAuthMode() == null)
            return false;
        if (other.getAuthMode() != null && other.getAuthMode().equals(this.getAuthMode()) == false)
            return false;
        if (other.getDefaultUserSettings() == null ^ this.getDefaultUserSettings() == null)
            return false;
        if (other.getDefaultUserSettings() != null && other.getDefaultUserSettings().equals(this.getDefaultUserSettings()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() == null ^ this.getHomeEfsFileSystemKmsKeyId() == null)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() != null && other.getHomeEfsFileSystemKmsKeyId().equals(this.getHomeEfsFileSystemKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAuthMode() == null) ? 0 : getAuthMode().hashCode());
        hashCode = prime * hashCode + ((getDefaultUserSettings() == null) ? 0 : getDefaultUserSettings().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getHomeEfsFileSystemKmsKeyId() == null) ? 0 : getHomeEfsFileSystemKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
