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
 * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope
 * represents the IP space for a single network. The private scope is intended for all private IP address space. The
 * public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple
 * unconnected networks without causing IP address overlap or conflict.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/ipam/how-it-works-ipam.html">How IPAM
 * works</a> in the <i>Amazon VPC IPAM User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamScope implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the scope.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the scope.
     * </p>
     */
    private String ipamScopeId;
    /**
     * <p>
     * The ARN of the scope.
     * </p>
     */
    private String ipamScopeArn;
    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     */
    private String ipamArn;
    /**
     * <p>
     * The Amazon Web Services Region of the IPAM scope.
     * </p>
     */
    private String ipamRegion;
    /**
     * <p>
     * The type of the scope.
     * </p>
     */
    private String ipamScopeType;
    /**
     * <p>
     * Defines if the scope is the default scope or not.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The description of the scope.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of pools in the scope.
     * </p>
     */
    private Integer poolCount;
    /**
     * <p>
     * The state of the IPAM scope.
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
     * The Amazon Web Services account ID of the owner of the scope.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the owner of the scope.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the scope.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the owner of the scope.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the scope.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the owner of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the scope.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope.
     * </p>
     * 
     * @return The ID of the scope.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * <p>
     * The ARN of the scope.
     * </p>
     * 
     * @param ipamScopeArn
     *        The ARN of the scope.
     */

    public void setIpamScopeArn(String ipamScopeArn) {
        this.ipamScopeArn = ipamScopeArn;
    }

    /**
     * <p>
     * The ARN of the scope.
     * </p>
     * 
     * @return The ARN of the scope.
     */

    public String getIpamScopeArn() {
        return this.ipamScopeArn;
    }

    /**
     * <p>
     * The ARN of the scope.
     * </p>
     * 
     * @param ipamScopeArn
     *        The ARN of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withIpamScopeArn(String ipamScopeArn) {
        setIpamScopeArn(ipamScopeArn);
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

    public IpamScope withIpamArn(String ipamArn) {
        setIpamArn(ipamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM scope.
     * </p>
     * 
     * @param ipamRegion
     *        The Amazon Web Services Region of the IPAM scope.
     */

    public void setIpamRegion(String ipamRegion) {
        this.ipamRegion = ipamRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM scope.
     * </p>
     * 
     * @return The Amazon Web Services Region of the IPAM scope.
     */

    public String getIpamRegion() {
        return this.ipamRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM scope.
     * </p>
     * 
     * @param ipamRegion
     *        The Amazon Web Services Region of the IPAM scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withIpamRegion(String ipamRegion) {
        setIpamRegion(ipamRegion);
        return this;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @param ipamScopeType
     *        The type of the scope.
     * @see IpamScopeType
     */

    public void setIpamScopeType(String ipamScopeType) {
        this.ipamScopeType = ipamScopeType;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @return The type of the scope.
     * @see IpamScopeType
     */

    public String getIpamScopeType() {
        return this.ipamScopeType;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @param ipamScopeType
     *        The type of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamScopeType
     */

    public IpamScope withIpamScopeType(String ipamScopeType) {
        setIpamScopeType(ipamScopeType);
        return this;
    }

    /**
     * <p>
     * The type of the scope.
     * </p>
     * 
     * @param ipamScopeType
     *        The type of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamScopeType
     */

    public IpamScope withIpamScopeType(IpamScopeType ipamScopeType) {
        this.ipamScopeType = ipamScopeType.toString();
        return this;
    }

    /**
     * <p>
     * Defines if the scope is the default scope or not.
     * </p>
     * 
     * @param isDefault
     *        Defines if the scope is the default scope or not.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Defines if the scope is the default scope or not.
     * </p>
     * 
     * @return Defines if the scope is the default scope or not.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Defines if the scope is the default scope or not.
     * </p>
     * 
     * @param isDefault
     *        Defines if the scope is the default scope or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Defines if the scope is the default scope or not.
     * </p>
     * 
     * @return Defines if the scope is the default scope or not.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The description of the scope.
     * </p>
     * 
     * @param description
     *        The description of the scope.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the scope.
     * </p>
     * 
     * @return The description of the scope.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the scope.
     * </p>
     * 
     * @param description
     *        The description of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of pools in the scope.
     * </p>
     * 
     * @param poolCount
     *        The number of pools in the scope.
     */

    public void setPoolCount(Integer poolCount) {
        this.poolCount = poolCount;
    }

    /**
     * <p>
     * The number of pools in the scope.
     * </p>
     * 
     * @return The number of pools in the scope.
     */

    public Integer getPoolCount() {
        return this.poolCount;
    }

    /**
     * <p>
     * The number of pools in the scope.
     * </p>
     * 
     * @param poolCount
     *        The number of pools in the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamScope withPoolCount(Integer poolCount) {
        setPoolCount(poolCount);
        return this;
    }

    /**
     * <p>
     * The state of the IPAM scope.
     * </p>
     * 
     * @param state
     *        The state of the IPAM scope.
     * @see IpamScopeState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the IPAM scope.
     * </p>
     * 
     * @return The state of the IPAM scope.
     * @see IpamScopeState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the IPAM scope.
     * </p>
     * 
     * @param state
     *        The state of the IPAM scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamScopeState
     */

    public IpamScope withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the IPAM scope.
     * </p>
     * 
     * @param state
     *        The state of the IPAM scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamScopeState
     */

    public IpamScope withState(IpamScopeState state) {
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

    public IpamScope withTags(Tag... tags) {
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

    public IpamScope withTags(java.util.Collection<Tag> tags) {
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
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId()).append(",");
        if (getIpamScopeArn() != null)
            sb.append("IpamScopeArn: ").append(getIpamScopeArn()).append(",");
        if (getIpamArn() != null)
            sb.append("IpamArn: ").append(getIpamArn()).append(",");
        if (getIpamRegion() != null)
            sb.append("IpamRegion: ").append(getIpamRegion()).append(",");
        if (getIpamScopeType() != null)
            sb.append("IpamScopeType: ").append(getIpamScopeType()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPoolCount() != null)
            sb.append("PoolCount: ").append(getPoolCount()).append(",");
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

        if (obj instanceof IpamScope == false)
            return false;
        IpamScope other = (IpamScope) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        if (other.getIpamScopeArn() == null ^ this.getIpamScopeArn() == null)
            return false;
        if (other.getIpamScopeArn() != null && other.getIpamScopeArn().equals(this.getIpamScopeArn()) == false)
            return false;
        if (other.getIpamArn() == null ^ this.getIpamArn() == null)
            return false;
        if (other.getIpamArn() != null && other.getIpamArn().equals(this.getIpamArn()) == false)
            return false;
        if (other.getIpamRegion() == null ^ this.getIpamRegion() == null)
            return false;
        if (other.getIpamRegion() != null && other.getIpamRegion().equals(this.getIpamRegion()) == false)
            return false;
        if (other.getIpamScopeType() == null ^ this.getIpamScopeType() == null)
            return false;
        if (other.getIpamScopeType() != null && other.getIpamScopeType().equals(this.getIpamScopeType()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPoolCount() == null ^ this.getPoolCount() == null)
            return false;
        if (other.getPoolCount() != null && other.getPoolCount().equals(this.getPoolCount()) == false)
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
        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeArn() == null) ? 0 : getIpamScopeArn().hashCode());
        hashCode = prime * hashCode + ((getIpamArn() == null) ? 0 : getIpamArn().hashCode());
        hashCode = prime * hashCode + ((getIpamRegion() == null) ? 0 : getIpamRegion().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeType() == null) ? 0 : getIpamScopeType().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPoolCount() == null) ? 0 : getPoolCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public IpamScope clone() {
        try {
            return (IpamScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
