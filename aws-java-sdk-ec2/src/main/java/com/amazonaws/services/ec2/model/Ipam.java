/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning,
 * tracking, troubleshooting, and auditing IP addresses across Amazon Web Services Regions and accounts throughout your
 * Amazon Web Services Organization. For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/ipam/what-is-it-ipam.html">What is IPAM?</a> in the <i>Amazon VPC IPAM
 * User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipam" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ipam implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the IPAM.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     */
    private String ipamArn;
    /**
     * <p>
     * The Amazon Web Services Region of the IPAM.
     * </p>
     */
    private String ipamRegion;
    /**
     * <p>
     * The ID of the IPAM's default public scope.
     * </p>
     */
    private String publicDefaultScopeId;
    /**
     * <p>
     * The ID of the IPAM's default private scope.
     * </p>
     */
    private String privateDefaultScopeId;
    /**
     * <p>
     * The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     */
    private Integer scopeCount;
    /**
     * <p>
     * The description for the IPAM.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to
     * manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select
     * as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamOperatingRegion> operatingRegions;
    /**
     * <p>
     * The state of the IPAM.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the owner of the IPAM.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the owner of the IPAM.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the owner of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM.
     * </p>
     * 
     * @return The ID of the IPAM.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     * 
     * @param ipamArn
     *        The ARN of the IPAM.
     */

    public void setIpamArn(String ipamArn) {
        this.ipamArn = ipamArn;
    }

    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     * 
     * @return The ARN of the IPAM.
     */

    public String getIpamArn() {
        return this.ipamArn;
    }

    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     * 
     * @param ipamArn
     *        The ARN of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withIpamArn(String ipamArn) {
        setIpamArn(ipamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM.
     * </p>
     * 
     * @param ipamRegion
     *        The Amazon Web Services Region of the IPAM.
     */

    public void setIpamRegion(String ipamRegion) {
        this.ipamRegion = ipamRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM.
     * </p>
     * 
     * @return The Amazon Web Services Region of the IPAM.
     */

    public String getIpamRegion() {
        return this.ipamRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM.
     * </p>
     * 
     * @param ipamRegion
     *        The Amazon Web Services Region of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withIpamRegion(String ipamRegion) {
        setIpamRegion(ipamRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM's default public scope.
     * </p>
     * 
     * @param publicDefaultScopeId
     *        The ID of the IPAM's default public scope.
     */

    public void setPublicDefaultScopeId(String publicDefaultScopeId) {
        this.publicDefaultScopeId = publicDefaultScopeId;
    }

    /**
     * <p>
     * The ID of the IPAM's default public scope.
     * </p>
     * 
     * @return The ID of the IPAM's default public scope.
     */

    public String getPublicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }

    /**
     * <p>
     * The ID of the IPAM's default public scope.
     * </p>
     * 
     * @param publicDefaultScopeId
     *        The ID of the IPAM's default public scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withPublicDefaultScopeId(String publicDefaultScopeId) {
        setPublicDefaultScopeId(publicDefaultScopeId);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM's default private scope.
     * </p>
     * 
     * @param privateDefaultScopeId
     *        The ID of the IPAM's default private scope.
     */

    public void setPrivateDefaultScopeId(String privateDefaultScopeId) {
        this.privateDefaultScopeId = privateDefaultScopeId;
    }

    /**
     * <p>
     * The ID of the IPAM's default private scope.
     * </p>
     * 
     * @return The ID of the IPAM's default private scope.
     */

    public String getPrivateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }

    /**
     * <p>
     * The ID of the IPAM's default private scope.
     * </p>
     * 
     * @param privateDefaultScopeId
     *        The ID of the IPAM's default private scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withPrivateDefaultScopeId(String privateDefaultScopeId) {
        setPrivateDefaultScopeId(privateDefaultScopeId);
        return this;
    }

    /**
     * <p>
     * The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param scopeCount
     *        The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     */

    public void setScopeCount(Integer scopeCount) {
        this.scopeCount = scopeCount;
    }

    /**
     * <p>
     * The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @return The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon
     *         VPC IPAM User Guide</i>.
     */

    public Integer getScopeCount() {
        return this.scopeCount;
    }

    /**
     * <p>
     * The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param scopeCount
     *        The number of scopes in the IPAM. The scope quota is 5. For more information on quotas, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withScopeCount(Integer scopeCount) {
        setScopeCount(scopeCount);
        return this;
    }

    /**
     * <p>
     * The description for the IPAM.
     * </p>
     * 
     * @param description
     *        The description for the IPAM.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the IPAM.
     * </p>
     * 
     * @return The description for the IPAM.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the IPAM.
     * </p>
     * 
     * @param description
     *        The description for the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to
     * manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select
     * as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @return The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *         allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *         Regions you select as operating Regions.</p>
     *         <p>
     *         For more information about operating Regions, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *         VPC IPAM User Guide</i>.
     */

    public java.util.List<IpamOperatingRegion> getOperatingRegions() {
        if (operatingRegions == null) {
            operatingRegions = new com.amazonaws.internal.SdkInternalList<IpamOperatingRegion>();
        }
        return operatingRegions;
    }

    /**
     * <p>
     * The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to
     * manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select
     * as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *        allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *        Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     */

    public void setOperatingRegions(java.util.Collection<IpamOperatingRegion> operatingRegions) {
        if (operatingRegions == null) {
            this.operatingRegions = null;
            return;
        }

        this.operatingRegions = new com.amazonaws.internal.SdkInternalList<IpamOperatingRegion>(operatingRegions);
    }

    /**
     * <p>
     * The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to
     * manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select
     * as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingRegions(java.util.Collection)} or {@link #withOperatingRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *        allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *        Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withOperatingRegions(IpamOperatingRegion... operatingRegions) {
        if (this.operatingRegions == null) {
            setOperatingRegions(new com.amazonaws.internal.SdkInternalList<IpamOperatingRegion>(operatingRegions.length));
        }
        for (IpamOperatingRegion ele : operatingRegions) {
            this.operatingRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to
     * manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select
     * as operating Regions.
     * </p>
     * <p>
     * For more information about operating Regions, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for an IPAM. Operating Regions are Amazon Web Services Regions where the IPAM is
     *        allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     *        Regions you select as operating Regions.</p>
     *        <p>
     *        For more information about operating Regions, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-ipam.html">Create an IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withOperatingRegions(java.util.Collection<IpamOperatingRegion> operatingRegions) {
        setOperatingRegions(operatingRegions);
        return this;
    }

    /**
     * <p>
     * The state of the IPAM.
     * </p>
     * 
     * @param state
     *        The state of the IPAM.
     * @see IpamState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the IPAM.
     * </p>
     * 
     * @return The state of the IPAM.
     * @see IpamState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the IPAM.
     * </p>
     * 
     * @param state
     *        The state of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamState
     */

    public Ipam withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the IPAM.
     * </p>
     * 
     * @param state
     *        The state of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamState
     */

    public Ipam withState(IpamState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @return The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *         tag value as the filter value. For example, to find all resources that have a tag with the key
     *         <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *         and <code>TeamA</code> for the filter value.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tags
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tags
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipam withTags(java.util.Collection<Tag> tags) {
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getIpamArn() != null)
            sb.append("IpamArn: ").append(getIpamArn()).append(",");
        if (getIpamRegion() != null)
            sb.append("IpamRegion: ").append(getIpamRegion()).append(",");
        if (getPublicDefaultScopeId() != null)
            sb.append("PublicDefaultScopeId: ").append(getPublicDefaultScopeId()).append(",");
        if (getPrivateDefaultScopeId() != null)
            sb.append("PrivateDefaultScopeId: ").append(getPrivateDefaultScopeId()).append(",");
        if (getScopeCount() != null)
            sb.append("ScopeCount: ").append(getScopeCount()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperatingRegions() != null)
            sb.append("OperatingRegions: ").append(getOperatingRegions()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof Ipam == false)
            return false;
        Ipam other = (Ipam) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getIpamArn() == null ^ this.getIpamArn() == null)
            return false;
        if (other.getIpamArn() != null && other.getIpamArn().equals(this.getIpamArn()) == false)
            return false;
        if (other.getIpamRegion() == null ^ this.getIpamRegion() == null)
            return false;
        if (other.getIpamRegion() != null && other.getIpamRegion().equals(this.getIpamRegion()) == false)
            return false;
        if (other.getPublicDefaultScopeId() == null ^ this.getPublicDefaultScopeId() == null)
            return false;
        if (other.getPublicDefaultScopeId() != null && other.getPublicDefaultScopeId().equals(this.getPublicDefaultScopeId()) == false)
            return false;
        if (other.getPrivateDefaultScopeId() == null ^ this.getPrivateDefaultScopeId() == null)
            return false;
        if (other.getPrivateDefaultScopeId() != null && other.getPrivateDefaultScopeId().equals(this.getPrivateDefaultScopeId()) == false)
            return false;
        if (other.getScopeCount() == null ^ this.getScopeCount() == null)
            return false;
        if (other.getScopeCount() != null && other.getScopeCount().equals(this.getScopeCount()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperatingRegions() == null ^ this.getOperatingRegions() == null)
            return false;
        if (other.getOperatingRegions() != null && other.getOperatingRegions().equals(this.getOperatingRegions()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getIpamArn() == null) ? 0 : getIpamArn().hashCode());
        hashCode = prime * hashCode + ((getIpamRegion() == null) ? 0 : getIpamRegion().hashCode());
        hashCode = prime * hashCode + ((getPublicDefaultScopeId() == null) ? 0 : getPublicDefaultScopeId().hashCode());
        hashCode = prime * hashCode + ((getPrivateDefaultScopeId() == null) ? 0 : getPrivateDefaultScopeId().hashCode());
        hashCode = prime * hashCode + ((getScopeCount() == null) ? 0 : getScopeCount().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperatingRegions() == null) ? 0 : getOperatingRegions().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Ipam clone() {
        try {
            return (Ipam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
