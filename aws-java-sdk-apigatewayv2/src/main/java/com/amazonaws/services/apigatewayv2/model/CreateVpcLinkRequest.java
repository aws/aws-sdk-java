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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a VPC link
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A list of tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateVpcLinkRequest withName(String name) {
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

    public CreateVpcLinkRequest withSecurityGroupIds(String... securityGroupIds) {
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

    public CreateVpcLinkRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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

    public CreateVpcLinkRequest withSubnetIds(String... subnetIds) {
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

    public CreateVpcLinkRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of tags.
     * </p>
     * 
     * @return A list of tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags.
     * </p>
     * 
     * @param tags
     *        A list of tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags.
     * </p>
     * 
     * @param tags
     *        A list of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateVpcLinkRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkRequest addTagsEntry(String key, String value) {
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

    public CreateVpcLinkRequest clearTagsEntries() {
        this.tags = null;
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
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

        if (obj instanceof CreateVpcLinkRequest == false)
            return false;
        CreateVpcLinkRequest other = (CreateVpcLinkRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcLinkRequest clone() {
        return (CreateVpcLinkRequest) super.clone();
    }

}
