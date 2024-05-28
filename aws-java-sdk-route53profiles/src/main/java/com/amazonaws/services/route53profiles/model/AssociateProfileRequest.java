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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * ID of the Profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A list of the tag keys and values that you want to identify the Profile association.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the association.
     * </p>
     * 
     * @param name
     *        A name for the association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the association.
     * </p>
     * 
     * @return A name for the association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the association.
     * </p>
     * 
     * @param name
     *        A name for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        ID of the Profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @return ID of the Profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        ID of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param resourceId
     *        The ID of the VPC.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param resourceId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProfileRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to identify the Profile association.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to identify the Profile association.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to identify the Profile association.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to identify the Profile association.
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
     * A list of the tag keys and values that you want to identify the Profile association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to identify the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProfileRequest withTags(Tag... tags) {
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
     * A list of the tag keys and values that you want to identify the Profile association.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to identify the Profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProfileRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof AssociateProfileRequest == false)
            return false;
        AssociateProfileRequest other = (AssociateProfileRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssociateProfileRequest clone() {
        return (AssociateProfileRequest) super.clone();
    }

}
