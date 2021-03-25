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
     * The mode of authentication that members use to access the domain.
     * </p>
     */
    private String authMode;
    /**
     * <p>
     * The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in the call
     * to the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html">CreateUserProfile</a>
     * API.
     * </p>
     * <p>
     * <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     * <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over those
     * specified in <code>CreateDomain</code>.
     * </p>
     */
    private UserSettings defaultUserSettings;
    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per
     * resource. Tags are searchable using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     * </p>
     * </li>
     * </ul>
     */
    private String appNetworkAccessType;
    /**
     * <p>
     * This member is deprecated and replaced with <code>KmsKeyId</code>.
     * </p>
     */
    @Deprecated
    private String homeEfsFileSystemKmsKeyId;
    /**
     * <p>
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key
     * (CMK) by default. For more control, specify a customer managed CMK.
     * </p>
     */
    private String kmsKeyId;

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
     * The mode of authentication that members use to access the domain.
     * </p>
     * 
     * @param authMode
     *        The mode of authentication that members use to access the domain.
     * @see AuthMode
     */

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * 
     * @return The mode of authentication that members use to access the domain.
     * @see AuthMode
     */

    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * 
     * @param authMode
     *        The mode of authentication that members use to access the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreateDomainRequest withAuthMode(String authMode) {
        setAuthMode(authMode);
        return this;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * 
     * @param authMode
     *        The mode of authentication that members use to access the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMode
     */

    public CreateDomainRequest withAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
        return this;
    }

    /**
     * <p>
     * The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in the call
     * to the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html">CreateUserProfile</a>
     * API.
     * </p>
     * <p>
     * <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     * <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over those
     * specified in <code>CreateDomain</code>.
     * </p>
     * 
     * @param defaultUserSettings
     *        The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in the
     *        call to the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html">
     *        CreateUserProfile</a> API.</p>
     *        <p>
     *        <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     *        <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over
     *        those specified in <code>CreateDomain</code>.
     */

    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in the call
     * to the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html">CreateUserProfile</a>
     * API.
     * </p>
     * <p>
     * <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     * <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over those
     * specified in <code>CreateDomain</code>.
     * </p>
     * 
     * @return The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in
     *         the call to the <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html"
     *         >CreateUserProfile</a> API.</p>
     *         <p>
     *         <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     *         <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over
     *         those specified in <code>CreateDomain</code>.
     */

    public UserSettings getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * <p>
     * The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in the call
     * to the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html">CreateUserProfile</a>
     * API.
     * </p>
     * <p>
     * <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     * <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over those
     * specified in <code>CreateDomain</code>.
     * </p>
     * 
     * @param defaultUserSettings
     *        The default settings to use to create a user profile when <code>UserSettings</code> isn't specified in the
     *        call to the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html">
     *        CreateUserProfile</a> API.</p>
     *        <p>
     *        <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
     *        <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over
     *        those specified in <code>CreateDomain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDefaultUserSettings(UserSettings defaultUserSettings) {
        setDefaultUserSettings(defaultUserSettings);
        return this;
    }

    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * 
     * @return The VPC subnets that Studio uses for communication.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The VPC subnets that Studio uses for communication.
     * </p>
     * 
     * @param subnetIds
     *        The VPC subnets that Studio uses for communication.
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
     * The VPC subnets that Studio uses for communication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The VPC subnets that Studio uses for communication.
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
     * The VPC subnets that Studio uses for communication.
     * </p>
     * 
     * @param subnetIds
     *        The VPC subnets that Studio uses for communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * </p>
     * 
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per
     * resource. Tags are searchable using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     * </p>
     * 
     * @return Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be
     *         unique per resource. Tags are searchable using the <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per
     * resource. Tags are searchable using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     * </p>
     * 
     * @param tags
     *        Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be
     *        unique per resource. Tags are searchable using the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
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
     * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per
     * resource. Tags are searchable using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be
     *        unique per resource. Tags are searchable using the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
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
     * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per
     * resource. Tags are searchable using the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     * </p>
     * 
     * @param tags
     *        Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be
     *        unique per resource. Tags are searchable using the <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_Search.html">Search</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     * </p>
     * </li>
     * </ul>
     * 
     * @param appNetworkAccessType
     *        Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *        allows direct internet access
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     *        </p>
     *        </li>
     * @see AppNetworkAccessType
     */

    public void setAppNetworkAccessType(String appNetworkAccessType) {
        this.appNetworkAccessType = appNetworkAccessType;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *         allows direct internet access
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     *         </p>
     *         </li>
     * @see AppNetworkAccessType
     */

    public String getAppNetworkAccessType() {
        return this.appNetworkAccessType;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     * </p>
     * </li>
     * </ul>
     * 
     * @param appNetworkAccessType
     *        Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *        allows direct internet access
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppNetworkAccessType
     */

    public CreateDomainRequest withAppNetworkAccessType(String appNetworkAccessType) {
        setAppNetworkAccessType(appNetworkAccessType);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows
     * direct internet access
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     * </p>
     * </li>
     * </ul>
     * 
     * @param appNetworkAccessType
     *        Specifies the VPC used for non-EFS traffic. The default value is <code>PublicInternetOnly</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PublicInternetOnly</code> - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which
     *        allows direct internet access
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VpcOnly</code> - All Studio traffic is through the specified VPC and subnets
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppNetworkAccessType
     */

    public CreateDomainRequest withAppNetworkAccessType(AppNetworkAccessType appNetworkAccessType) {
        this.appNetworkAccessType = appNetworkAccessType.toString();
        return this;
    }

    /**
     * <p>
     * This member is deprecated and replaced with <code>KmsKeyId</code>.
     * </p>
     * 
     * @param homeEfsFileSystemKmsKeyId
     *        This member is deprecated and replaced with <code>KmsKeyId</code>.
     */
    @Deprecated
    public void setHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        this.homeEfsFileSystemKmsKeyId = homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * This member is deprecated and replaced with <code>KmsKeyId</code>.
     * </p>
     * 
     * @return This member is deprecated and replaced with <code>KmsKeyId</code>.
     */
    @Deprecated
    public String getHomeEfsFileSystemKmsKeyId() {
        return this.homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * This member is deprecated and replaced with <code>KmsKeyId</code>.
     * </p>
     * 
     * @param homeEfsFileSystemKmsKeyId
     *        This member is deprecated and replaced with <code>KmsKeyId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateDomainRequest withHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        setHomeEfsFileSystemKmsKeyId(homeEfsFileSystemKmsKeyId);
        return this;
    }

    /**
     * <p>
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key
     * (CMK) by default. For more control, specify a customer managed CMK.
     * </p>
     * 
     * @param kmsKeyId
     *        SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer
     *        master key (CMK) by default. For more control, specify a customer managed CMK.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key
     * (CMK) by default. For more control, specify a customer managed CMK.
     * </p>
     * 
     * @return SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer
     *         master key (CMK) by default. For more control, specify a customer managed CMK.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key
     * (CMK) by default. For more control, specify a customer managed CMK.
     * </p>
     * 
     * @param kmsKeyId
     *        SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer
     *        master key (CMK) by default. For more control, specify a customer managed CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getAppNetworkAccessType() != null)
            sb.append("AppNetworkAccessType: ").append(getAppNetworkAccessType()).append(",");
        if (getHomeEfsFileSystemKmsKeyId() != null)
            sb.append("HomeEfsFileSystemKmsKeyId: ").append(getHomeEfsFileSystemKmsKeyId()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
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
        if (other.getAppNetworkAccessType() == null ^ this.getAppNetworkAccessType() == null)
            return false;
        if (other.getAppNetworkAccessType() != null && other.getAppNetworkAccessType().equals(this.getAppNetworkAccessType()) == false)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() == null ^ this.getHomeEfsFileSystemKmsKeyId() == null)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() != null && other.getHomeEfsFileSystemKmsKeyId().equals(this.getHomeEfsFileSystemKmsKeyId()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
        hashCode = prime * hashCode + ((getAppNetworkAccessType() == null) ? 0 : getAppNetworkAccessType().hashCode());
        hashCode = prime * hashCode + ((getHomeEfsFileSystemKmsKeyId() == null) ? 0 : getHomeEfsFileSystemKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
