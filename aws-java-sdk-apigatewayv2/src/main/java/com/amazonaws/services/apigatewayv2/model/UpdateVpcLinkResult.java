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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The name of the VPC link.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     */
    private String vpcLinkId;
    /**
     * <p>
     * The status of the VPC link.
     * </p>
     */
    private String vpcLinkStatus;
    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     */
    private String vpcLinkStatusMessage;
    /**
     * <p>
     * The version of the VPC link.
     * </p>
     */
    private String vpcLinkVersion;

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the VPC link was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     * 
     * @return The timestamp when the VPC link was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The timestamp when the VPC link was created.
     * </p>
     * 
     * @param createdDate
     *        The timestamp when the VPC link was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * 
     * @param name
     *        The name of the VPC link.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * 
     * @return The name of the VPC link.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the VPC link.
     * </p>
     * 
     * @param name
     *        The name of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     * 
     * @return A list of security group IDs for the VPC link.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs for the VPC link.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs for the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security group IDs for the VPC link.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs for the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     * 
     * @return A list of subnet IDs to include in the VPC link.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs to include in the VPC link.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to include in the VPC link.
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
     * A list of subnet IDs to include in the VPC link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to include in the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withSubnetIds(String... subnetIds) {
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
     * A list of subnet IDs to include in the VPC link.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs to include in the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     * 
     * @return Tags for the VPC link.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     * 
     * @param tags
     *        Tags for the VPC link.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the VPC link.
     * </p>
     * 
     * @param tags
     *        Tags for the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateVpcLinkResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * 
     * @param vpcLinkId
     *        The ID of the VPC link.
     */

    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * 
     * @return The ID of the VPC link.
     */

    public String getVpcLinkId() {
        return this.vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * 
     * @param vpcLinkId
     *        The ID of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withVpcLinkId(String vpcLinkId) {
        setVpcLinkId(vpcLinkId);
        return this;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * 
     * @param vpcLinkStatus
     *        The status of the VPC link.
     * @see VpcLinkStatus
     */

    public void setVpcLinkStatus(String vpcLinkStatus) {
        this.vpcLinkStatus = vpcLinkStatus;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * 
     * @return The status of the VPC link.
     * @see VpcLinkStatus
     */

    public String getVpcLinkStatus() {
        return this.vpcLinkStatus;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * 
     * @param vpcLinkStatus
     *        The status of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcLinkStatus
     */

    public UpdateVpcLinkResult withVpcLinkStatus(String vpcLinkStatus) {
        setVpcLinkStatus(vpcLinkStatus);
        return this;
    }

    /**
     * <p>
     * The status of the VPC link.
     * </p>
     * 
     * @param vpcLinkStatus
     *        The status of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcLinkStatus
     */

    public UpdateVpcLinkResult withVpcLinkStatus(VpcLinkStatus vpcLinkStatus) {
        this.vpcLinkStatus = vpcLinkStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     * 
     * @param vpcLinkStatusMessage
     *        A message summarizing the cause of the status of the VPC link.
     */

    public void setVpcLinkStatusMessage(String vpcLinkStatusMessage) {
        this.vpcLinkStatusMessage = vpcLinkStatusMessage;
    }

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     * 
     * @return A message summarizing the cause of the status of the VPC link.
     */

    public String getVpcLinkStatusMessage() {
        return this.vpcLinkStatusMessage;
    }

    /**
     * <p>
     * A message summarizing the cause of the status of the VPC link.
     * </p>
     * 
     * @param vpcLinkStatusMessage
     *        A message summarizing the cause of the status of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcLinkResult withVpcLinkStatusMessage(String vpcLinkStatusMessage) {
        setVpcLinkStatusMessage(vpcLinkStatusMessage);
        return this;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * 
     * @param vpcLinkVersion
     *        The version of the VPC link.
     * @see VpcLinkVersion
     */

    public void setVpcLinkVersion(String vpcLinkVersion) {
        this.vpcLinkVersion = vpcLinkVersion;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * 
     * @return The version of the VPC link.
     * @see VpcLinkVersion
     */

    public String getVpcLinkVersion() {
        return this.vpcLinkVersion;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * 
     * @param vpcLinkVersion
     *        The version of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcLinkVersion
     */

    public UpdateVpcLinkResult withVpcLinkVersion(String vpcLinkVersion) {
        setVpcLinkVersion(vpcLinkVersion);
        return this;
    }

    /**
     * <p>
     * The version of the VPC link.
     * </p>
     * 
     * @param vpcLinkVersion
     *        The version of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcLinkVersion
     */

    public UpdateVpcLinkResult withVpcLinkVersion(VpcLinkVersion vpcLinkVersion) {
        this.vpcLinkVersion = vpcLinkVersion.toString();
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: ").append(getVpcLinkId()).append(",");
        if (getVpcLinkStatus() != null)
            sb.append("VpcLinkStatus: ").append(getVpcLinkStatus()).append(",");
        if (getVpcLinkStatusMessage() != null)
            sb.append("VpcLinkStatusMessage: ").append(getVpcLinkStatusMessage()).append(",");
        if (getVpcLinkVersion() != null)
            sb.append("VpcLinkVersion: ").append(getVpcLinkVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcLinkResult == false)
            return false;
        UpdateVpcLinkResult other = (UpdateVpcLinkResult) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        if (other.getVpcLinkStatus() == null ^ this.getVpcLinkStatus() == null)
            return false;
        if (other.getVpcLinkStatus() != null && other.getVpcLinkStatus().equals(this.getVpcLinkStatus()) == false)
            return false;
        if (other.getVpcLinkStatusMessage() == null ^ this.getVpcLinkStatusMessage() == null)
            return false;
        if (other.getVpcLinkStatusMessage() != null && other.getVpcLinkStatusMessage().equals(this.getVpcLinkStatusMessage()) == false)
            return false;
        if (other.getVpcLinkVersion() == null ^ this.getVpcLinkVersion() == null)
            return false;
        if (other.getVpcLinkVersion() != null && other.getVpcLinkVersion().equals(this.getVpcLinkVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkStatus() == null) ? 0 : getVpcLinkStatus().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkStatusMessage() == null) ? 0 : getVpcLinkStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkVersion() == null) ? 0 : getVpcLinkVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcLinkResult clone() {
        try {
            return (UpdateVpcLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
