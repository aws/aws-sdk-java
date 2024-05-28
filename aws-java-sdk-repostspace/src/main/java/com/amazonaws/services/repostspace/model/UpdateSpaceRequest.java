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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/UpdateSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSpaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IAM role that grants permissions to the private re:Post to convert unanswered questions into AWS support
     * tickets.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The unique ID of this private re:Post.
     * </p>
     */
    private String spaceId;
    /**
     * <p>
     * The pricing tier of this private re:Post.
     * </p>
     */
    private String tier;

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

    public UpdateSpaceRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateSpaceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The unique ID of this private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The unique ID of this private re:Post.
     */

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * <p>
     * The unique ID of this private re:Post.
     * </p>
     * 
     * @return The unique ID of this private re:Post.
     */

    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * <p>
     * The unique ID of this private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The unique ID of this private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSpaceRequest withSpaceId(String spaceId) {
        setSpaceId(spaceId);
        return this;
    }

    /**
     * <p>
     * The pricing tier of this private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier of this private re:Post.
     * @see TierLevel
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The pricing tier of this private re:Post.
     * </p>
     * 
     * @return The pricing tier of this private re:Post.
     * @see TierLevel
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The pricing tier of this private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier of this private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TierLevel
     */

    public UpdateSpaceRequest withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The pricing tier of this private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier of this private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TierLevel
     */

    public UpdateSpaceRequest withTier(TierLevel tier) {
        this.tier = tier.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSpaceId() != null)
            sb.append("SpaceId: ").append(getSpaceId()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSpaceRequest == false)
            return false;
        UpdateSpaceRequest other = (UpdateSpaceRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSpaceId() == null ^ this.getSpaceId() == null)
            return false;
        if (other.getSpaceId() != null && other.getSpaceId().equals(this.getSpaceId()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSpaceId() == null) ? 0 : getSpaceId().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSpaceRequest clone() {
        return (UpdateSpaceRequest) super.clone();
    }

}
