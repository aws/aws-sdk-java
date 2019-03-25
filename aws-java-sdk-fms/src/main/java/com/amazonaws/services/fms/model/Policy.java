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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An AWS Firewall Manager policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/Policy" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     * <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the current policy
     * version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a <code>GetPolicy</code>
     * request.
     * </p>
     */
    private String policyUpdateToken;
    /**
     * <p>
     * Details about the security service that is being used to protect the resources.
     * </p>
     */
    private SecurityServicePolicyData securityServicePolicyData;
    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     */
    private java.util.List<String> resourceTypeList;
    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;
    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code> array are
     * not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code> array is not null,
     * only resources with the specified tags are associated with the policy.
     * </p>
     */
    private Boolean excludeResourceTags;
    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     */
    private Boolean remediationEnabled;
    /**
     * <p>
     * Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts in the
     * organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not null, only values
     * listed in <code>IncludeMap</code> are included in the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> includeMap;
    /**
     * <p>
     * Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are evaluated first,
     * with all the appropriate account IDs added to the policy. Then the accounts listed in <code>ExcludeMap</code> are
     * removed, resulting in the final list of accounts to add to the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> excludeMap;

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the AWS Firewall Manager policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * 
     * @return The ID of the AWS Firewall Manager policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name of the AWS Firewall Manager policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * 
     * @return The friendly name of the AWS Firewall Manager policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name of the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     * <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the current policy
     * version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a <code>GetPolicy</code>
     * request.
     * </p>
     * 
     * @param policyUpdateToken
     *        A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     *        <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the current
     *        policy version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a
     *        <code>GetPolicy</code> request.
     */

    public void setPolicyUpdateToken(String policyUpdateToken) {
        this.policyUpdateToken = policyUpdateToken;
    }

    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     * <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the current policy
     * version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a <code>GetPolicy</code>
     * request.
     * </p>
     * 
     * @return A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     *         <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the
     *         current policy version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a
     *         <code>GetPolicy</code> request.
     */

    public String getPolicyUpdateToken() {
        return this.policyUpdateToken;
    }

    /**
     * <p>
     * A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     * <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the current policy
     * version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a <code>GetPolicy</code>
     * request.
     * </p>
     * 
     * @param policyUpdateToken
     *        A unique identifier for each update to the policy. When issuing a <code>PutPolicy</code> request, the
     *        <code>PolicyUpdateToken</code> in the request must match the <code>PolicyUpdateToken</code> of the current
     *        policy version. To get the <code>PolicyUpdateToken</code> of the current policy version, use a
     *        <code>GetPolicy</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withPolicyUpdateToken(String policyUpdateToken) {
        setPolicyUpdateToken(policyUpdateToken);
        return this;
    }

    /**
     * <p>
     * Details about the security service that is being used to protect the resources.
     * </p>
     * 
     * @param securityServicePolicyData
     *        Details about the security service that is being used to protect the resources.
     */

    public void setSecurityServicePolicyData(SecurityServicePolicyData securityServicePolicyData) {
        this.securityServicePolicyData = securityServicePolicyData;
    }

    /**
     * <p>
     * Details about the security service that is being used to protect the resources.
     * </p>
     * 
     * @return Details about the security service that is being used to protect the resources.
     */

    public SecurityServicePolicyData getSecurityServicePolicyData() {
        return this.securityServicePolicyData;
    }

    /**
     * <p>
     * Details about the security service that is being used to protect the resources.
     * </p>
     * 
     * @param securityServicePolicyData
     *        Details about the security service that is being used to protect the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withSecurityServicePolicyData(SecurityServicePolicyData securityServicePolicyData) {
        setSecurityServicePolicyData(securityServicePolicyData);
        return this;
    }

    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to protect with the policy. This is in the format shown in <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *        Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *        <code>AWS::CloudFront::Distribution</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @return The type of resource to protect with the policy. This is in the format shown in <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >AWS Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *         <code>AWS::CloudFront::Distribution</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to protect with the policy. This is in the format shown in <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *        Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *        <code>AWS::CloudFront::Distribution</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     * 
     * @return An array of <code>ResourceType</code>.
     */

    public java.util.List<String> getResourceTypeList() {
        return resourceTypeList;
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     * 
     * @param resourceTypeList
     *        An array of <code>ResourceType</code>.
     */

    public void setResourceTypeList(java.util.Collection<String> resourceTypeList) {
        if (resourceTypeList == null) {
            this.resourceTypeList = null;
            return;
        }

        this.resourceTypeList = new java.util.ArrayList<String>(resourceTypeList);
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypeList(java.util.Collection)} or {@link #withResourceTypeList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceTypeList
     *        An array of <code>ResourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withResourceTypeList(String... resourceTypeList) {
        if (this.resourceTypeList == null) {
            setResourceTypeList(new java.util.ArrayList<String>(resourceTypeList.length));
        }
        for (String ele : resourceTypeList) {
            this.resourceTypeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceType</code>.
     * </p>
     * 
     * @param resourceTypeList
     *        An array of <code>ResourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withResourceTypeList(java.util.Collection<String> resourceTypeList) {
        setResourceTypeList(resourceTypeList);
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     * 
     * @return An array of <code>ResourceTag</code> objects.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     * 
     * @param resourceTags
     *        An array of <code>ResourceTag</code> objects.
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        An array of <code>ResourceTag</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceTag</code> objects.
     * </p>
     * 
     * @param resourceTags
     *        An array of <code>ResourceTag</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code> array are
     * not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code> array is not null,
     * only resources with the specified tags are associated with the policy.
     * </p>
     * 
     * @param excludeResourceTags
     *        If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code>
     *        array are not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code>
     *        array is not null, only resources with the specified tags are associated with the policy.
     */

    public void setExcludeResourceTags(Boolean excludeResourceTags) {
        this.excludeResourceTags = excludeResourceTags;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code> array are
     * not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code> array is not null,
     * only resources with the specified tags are associated with the policy.
     * </p>
     * 
     * @return If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code>
     *         array are not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code>
     *         array is not null, only resources with the specified tags are associated with the policy.
     */

    public Boolean getExcludeResourceTags() {
        return this.excludeResourceTags;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code> array are
     * not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code> array is not null,
     * only resources with the specified tags are associated with the policy.
     * </p>
     * 
     * @param excludeResourceTags
     *        If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code>
     *        array are not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code>
     *        array is not null, only resources with the specified tags are associated with the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withExcludeResourceTags(Boolean excludeResourceTags) {
        setExcludeResourceTags(excludeResourceTags);
        return this;
    }

    /**
     * <p>
     * If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code> array are
     * not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code> array is not null,
     * only resources with the specified tags are associated with the policy.
     * </p>
     * 
     * @return If set to <code>True</code>, resources with the tags that are specified in the <code>ResourceTag</code>
     *         array are not protected by the policy. If set to <code>False</code>, and the <code>ResourceTag</code>
     *         array is not null, only resources with the specified tags are associated with the policy.
     */

    public Boolean isExcludeResourceTags() {
        return this.excludeResourceTags;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @param remediationEnabled
     *        Indicates if the policy should be automatically applied to new resources.
     */

    public void setRemediationEnabled(Boolean remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @return Indicates if the policy should be automatically applied to new resources.
     */

    public Boolean getRemediationEnabled() {
        return this.remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @param remediationEnabled
     *        Indicates if the policy should be automatically applied to new resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withRemediationEnabled(Boolean remediationEnabled) {
        setRemediationEnabled(remediationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @return Indicates if the policy should be automatically applied to new resources.
     */

    public Boolean isRemediationEnabled() {
        return this.remediationEnabled;
    }

    /**
     * <p>
     * Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts in the
     * organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not null, only values
     * listed in <code>IncludeMap</code> are included in the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * 
     * @return Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts
     *         in the organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not
     *         null, only values listed in <code>IncludeMap</code> are included in the policy.</p>
     *         <p>
     *         The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     *         <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     */

    public java.util.Map<String, java.util.List<String>> getIncludeMap() {
        return includeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts in the
     * organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not null, only values
     * listed in <code>IncludeMap</code> are included in the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * 
     * @param includeMap
     *        Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts
     *        in the organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not
     *        null, only values listed in <code>IncludeMap</code> are included in the policy.</p>
     *        <p>
     *        The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     *        <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     */

    public void setIncludeMap(java.util.Map<String, java.util.List<String>> includeMap) {
        this.includeMap = includeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts in the
     * organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not null, only values
     * listed in <code>IncludeMap</code> are included in the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * 
     * @param includeMap
     *        Specifies the AWS account IDs to include in the policy. If <code>IncludeMap</code> is null, all accounts
     *        in the organization in AWS Organizations are included in the policy. If <code>IncludeMap</code> is not
     *        null, only values listed in <code>IncludeMap</code> are included in the policy.</p>
     *        <p>
     *        The key to the map is <code>ACCOUNT</code>. For example, a valid <code>IncludeMap</code> would be
     *        <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withIncludeMap(java.util.Map<String, java.util.List<String>> includeMap) {
        setIncludeMap(includeMap);
        return this;
    }

    public Policy addIncludeMapEntry(String key, java.util.List<String> value) {
        if (null == this.includeMap) {
            this.includeMap = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.includeMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.includeMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IncludeMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy clearIncludeMapEntries() {
        this.includeMap = null;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are evaluated first,
     * with all the appropriate account IDs added to the policy. Then the accounts listed in <code>ExcludeMap</code> are
     * removed, resulting in the final list of accounts to add to the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * 
     * @return Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are
     *         evaluated first, with all the appropriate account IDs added to the policy. Then the accounts listed in
     *         <code>ExcludeMap</code> are removed, resulting in the final list of accounts to add to the policy.</p>
     *         <p>
     *         The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     *         <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     */

    public java.util.Map<String, java.util.List<String>> getExcludeMap() {
        return excludeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are evaluated first,
     * with all the appropriate account IDs added to the policy. Then the accounts listed in <code>ExcludeMap</code> are
     * removed, resulting in the final list of accounts to add to the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * 
     * @param excludeMap
     *        Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are evaluated
     *        first, with all the appropriate account IDs added to the policy. Then the accounts listed in
     *        <code>ExcludeMap</code> are removed, resulting in the final list of accounts to add to the policy.</p>
     *        <p>
     *        The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     *        <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     */

    public void setExcludeMap(java.util.Map<String, java.util.List<String>> excludeMap) {
        this.excludeMap = excludeMap;
    }

    /**
     * <p>
     * Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are evaluated first,
     * with all the appropriate account IDs added to the policy. Then the accounts listed in <code>ExcludeMap</code> are
     * removed, resulting in the final list of accounts to add to the policy.
     * </p>
     * <p>
     * The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     * <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * </p>
     * 
     * @param excludeMap
     *        Specifies the AWS account IDs to exclude from the policy. The <code>IncludeMap</code> values are evaluated
     *        first, with all the appropriate account IDs added to the policy. Then the accounts listed in
     *        <code>ExcludeMap</code> are removed, resulting in the final list of accounts to add to the policy.</p>
     *        <p>
     *        The key to the map is <code>ACCOUNT</code>. For example, a valid <code>ExcludeMap</code> would be
     *        <code>{“ACCOUNT” : [“accountID1”, “accountID2”]}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withExcludeMap(java.util.Map<String, java.util.List<String>> excludeMap) {
        setExcludeMap(excludeMap);
        return this;
    }

    public Policy addExcludeMapEntry(String key, java.util.List<String> value) {
        if (null == this.excludeMap) {
            this.excludeMap = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.excludeMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.excludeMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExcludeMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy clearExcludeMapEntries() {
        this.excludeMap = null;
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyUpdateToken() != null)
            sb.append("PolicyUpdateToken: ").append(getPolicyUpdateToken()).append(",");
        if (getSecurityServicePolicyData() != null)
            sb.append("SecurityServicePolicyData: ").append(getSecurityServicePolicyData()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTypeList() != null)
            sb.append("ResourceTypeList: ").append(getResourceTypeList()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getExcludeResourceTags() != null)
            sb.append("ExcludeResourceTags: ").append(getExcludeResourceTags()).append(",");
        if (getRemediationEnabled() != null)
            sb.append("RemediationEnabled: ").append(getRemediationEnabled()).append(",");
        if (getIncludeMap() != null)
            sb.append("IncludeMap: ").append(getIncludeMap()).append(",");
        if (getExcludeMap() != null)
            sb.append("ExcludeMap: ").append(getExcludeMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyUpdateToken() == null ^ this.getPolicyUpdateToken() == null)
            return false;
        if (other.getPolicyUpdateToken() != null && other.getPolicyUpdateToken().equals(this.getPolicyUpdateToken()) == false)
            return false;
        if (other.getSecurityServicePolicyData() == null ^ this.getSecurityServicePolicyData() == null)
            return false;
        if (other.getSecurityServicePolicyData() != null && other.getSecurityServicePolicyData().equals(this.getSecurityServicePolicyData()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTypeList() == null ^ this.getResourceTypeList() == null)
            return false;
        if (other.getResourceTypeList() != null && other.getResourceTypeList().equals(this.getResourceTypeList()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getExcludeResourceTags() == null ^ this.getExcludeResourceTags() == null)
            return false;
        if (other.getExcludeResourceTags() != null && other.getExcludeResourceTags().equals(this.getExcludeResourceTags()) == false)
            return false;
        if (other.getRemediationEnabled() == null ^ this.getRemediationEnabled() == null)
            return false;
        if (other.getRemediationEnabled() != null && other.getRemediationEnabled().equals(this.getRemediationEnabled()) == false)
            return false;
        if (other.getIncludeMap() == null ^ this.getIncludeMap() == null)
            return false;
        if (other.getIncludeMap() != null && other.getIncludeMap().equals(this.getIncludeMap()) == false)
            return false;
        if (other.getExcludeMap() == null ^ this.getExcludeMap() == null)
            return false;
        if (other.getExcludeMap() != null && other.getExcludeMap().equals(this.getExcludeMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyUpdateToken() == null) ? 0 : getPolicyUpdateToken().hashCode());
        hashCode = prime * hashCode + ((getSecurityServicePolicyData() == null) ? 0 : getSecurityServicePolicyData().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTypeList() == null) ? 0 : getResourceTypeList().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getExcludeResourceTags() == null) ? 0 : getExcludeResourceTags().hashCode());
        hashCode = prime * hashCode + ((getRemediationEnabled() == null) ? 0 : getRemediationEnabled().hashCode());
        hashCode = prime * hashCode + ((getIncludeMap() == null) ? 0 : getIncludeMap().hashCode());
        hashCode = prime * hashCode + ((getExcludeMap() == null) ? 0 : getExcludeMap().hashCode());
        return hashCode;
    }

    @Override
    public Policy clone() {
        try {
            return (Policy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
