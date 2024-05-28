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
package com.amazonaws.services.repostspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/CreateSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSpaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name for the private re:Post. This must be unique in your account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS support
     * tickets.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must be
     * approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an AWS
     * generated subdomain for immediate use.
     * </p>
     */
    private String subdomain;
    /**
     * <p>
     * The list of tags associated with the private re:Post.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The pricing tier for the private re:Post.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is encrypted by
     * default with a key that AWS owns and manages for you.
     * </p>
     */
    private String userKMSKey;

    /**
     * <p>
     * A description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     * 
     * @param description
     *        A description for the private re:Post. This is used only to help you identify this private re:Post.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     * 
     * @return A description for the private re:Post. This is used only to help you identify this private re:Post.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     * 
     * @param description
     *        A description for the private re:Post. This is used only to help you identify this private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name for the private re:Post. This must be unique in your account.
     * </p>
     * 
     * @param name
     *        The name for the private re:Post. This must be unique in your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the private re:Post. This must be unique in your account.
     * </p>
     * 
     * @return The name for the private re:Post. This must be unique in your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the private re:Post. This must be unique in your account.
     * </p>
     * 
     * @param name
     *        The name for the private re:Post. This must be unique in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS support
     * tickets.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS
     *        support tickets.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS support
     * tickets.
     * </p>
     * 
     * @return The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS
     *         support tickets.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS support
     * tickets.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS
     *        support tickets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must be
     * approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an AWS
     * generated subdomain for immediate use.
     * </p>
     * 
     * @param subdomain
     *        The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must
     *        be approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an
     *        AWS generated subdomain for immediate use.
     */

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * <p>
     * The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must be
     * approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an AWS
     * generated subdomain for immediate use.
     * </p>
     * 
     * @return The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must
     *         be approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an
     *         AWS generated subdomain for immediate use.
     */

    public String getSubdomain() {
        return this.subdomain;
    }

    /**
     * <p>
     * The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must be
     * approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an AWS
     * generated subdomain for immediate use.
     * </p>
     * 
     * @param subdomain
     *        The subdomain that you use to access your AWS re:Post Private private re:Post. All custom subdomains must
     *        be approved by AWS before use. In addition to your custom subdomain, all private re:Posts are issued an
     *        AWS generated subdomain for immediate use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withSubdomain(String subdomain) {
        setSubdomain(subdomain);
        return this;
    }

    /**
     * <p>
     * The list of tags associated with the private re:Post.
     * </p>
     * 
     * @return The list of tags associated with the private re:Post.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags associated with the private re:Post.
     * </p>
     * 
     * @param tags
     *        The list of tags associated with the private re:Post.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tags associated with the private re:Post.
     * </p>
     * 
     * @param tags
     *        The list of tags associated with the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSpaceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest addTagsEntry(String key, String value) {
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

    public CreateSpaceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The pricing tier for the private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier for the private re:Post.
     * @see TierLevel
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The pricing tier for the private re:Post.
     * </p>
     * 
     * @return The pricing tier for the private re:Post.
     * @see TierLevel
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The pricing tier for the private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier for the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TierLevel
     */

    public CreateSpaceRequest withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The pricing tier for the private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier for the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TierLevel
     */

    public CreateSpaceRequest withTier(TierLevel tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is encrypted by
     * default with a key that AWS owns and manages for you.
     * </p>
     * 
     * @param userKMSKey
     *        The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is
     *        encrypted by default with a key that AWS owns and manages for you.
     */

    public void setUserKMSKey(String userKMSKey) {
        this.userKMSKey = userKMSKey;
    }

    /**
     * <p>
     * The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is encrypted by
     * default with a key that AWS owns and manages for you.
     * </p>
     * 
     * @return The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is
     *         encrypted by default with a key that AWS owns and manages for you.
     */

    public String getUserKMSKey() {
        return this.userKMSKey;
    }

    /**
     * <p>
     * The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is encrypted by
     * default with a key that AWS owns and manages for you.
     * </p>
     * 
     * @param userKMSKey
     *        The AWS KMS key ARN that’s used for the AWS KMS encryption. If you don't provide a key, your data is
     *        encrypted by default with a key that AWS owns and manages for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withUserKMSKey(String userKMSKey) {
        setUserKMSKey(userKMSKey);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSubdomain() != null)
            sb.append("Subdomain: ").append(getSubdomain()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getUserKMSKey() != null)
            sb.append("UserKMSKey: ").append(getUserKMSKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSpaceRequest == false)
            return false;
        CreateSpaceRequest other = (CreateSpaceRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSubdomain() == null ^ this.getSubdomain() == null)
            return false;
        if (other.getSubdomain() != null && other.getSubdomain().equals(this.getSubdomain()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getUserKMSKey() == null ^ this.getUserKMSKey() == null)
            return false;
        if (other.getUserKMSKey() != null && other.getUserKMSKey().equals(this.getUserKMSKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubdomain() == null) ? 0 : getSubdomain().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getUserKMSKey() == null) ? 0 : getUserKMSKey().hashCode());
        return hashCode;
    }

    @Override
    public CreateSpaceRequest clone() {
        return (CreateSpaceRequest) super.clone();
    }

}
