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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
 * takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
 * Endpoint services.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the VPC link.
     * </p>
     */
    private String description;
    /**
     * <p>
     * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers
     * must be owned by the same AWS account of the API owner.
     * </p>
     */
    private java.util.List<String> targetArns;
    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     * 
     * @param name
     *        [Required] The name used to label and identify the VPC link.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     * 
     * @return [Required] The name used to label and identify the VPC link.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     * 
     * @param name
     *        [Required] The name used to label and identify the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * 
     * @param description
     *        The description of the VPC link.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * 
     * @return The description of the VPC link.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * 
     * @param description
     *        The description of the VPC link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers
     * must be owned by the same AWS account of the API owner.
     * </p>
     * 
     * @return [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load
     *         balancers must be owned by the same AWS account of the API owner.
     */

    public java.util.List<String> getTargetArns() {
        return targetArns;
    }

    /**
     * <p>
     * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers
     * must be owned by the same AWS account of the API owner.
     * </p>
     * 
     * @param targetArns
     *        [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load
     *        balancers must be owned by the same AWS account of the API owner.
     */

    public void setTargetArns(java.util.Collection<String> targetArns) {
        if (targetArns == null) {
            this.targetArns = null;
            return;
        }

        this.targetArns = new java.util.ArrayList<String>(targetArns);
    }

    /**
     * <p>
     * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers
     * must be owned by the same AWS account of the API owner.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetArns(java.util.Collection)} or {@link #withTargetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetArns
     *        [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load
     *        balancers must be owned by the same AWS account of the API owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkRequest withTargetArns(String... targetArns) {
        if (this.targetArns == null) {
            setTargetArns(new java.util.ArrayList<String>(targetArns.length));
        }
        for (String ele : targetArns) {
            this.targetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers
     * must be owned by the same AWS account of the API owner.
     * </p>
     * 
     * @param targetArns
     *        [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load
     *        balancers must be owned by the same AWS account of the API owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcLinkRequest withTargetArns(java.util.Collection<String> targetArns) {
        setTargetArns(targetArns);
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * 
     * @return The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *         characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * 
     * @param tags
     *        The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *        characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * 
     * @param tags
     *        The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *        characters and must not start with <code>aws:</code>. The tag value can be up to 256 characters.
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargetArns() != null)
            sb.append("TargetArns: ").append(getTargetArns()).append(",");
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargetArns() == null ^ this.getTargetArns() == null)
            return false;
        if (other.getTargetArns() != null && other.getTargetArns().equals(this.getTargetArns()) == false)
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
        hashCode = prime * hashCode + ((getTargetArns() == null) ? 0 : getTargetArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcLinkRequest clone() {
        return (CreateVpcLinkRequest) super.clone();
    }

}
