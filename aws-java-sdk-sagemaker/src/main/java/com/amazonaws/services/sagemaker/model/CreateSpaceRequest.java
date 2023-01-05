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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSpaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the space.
     * </p>
     */
    private String spaceName;
    /**
     * <p>
     * Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be unique for
     * each resource. Tags are searchable using the <code>Search</code> API.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A collection of space settings.
     * </p>
     */
    private SpaceSettings spaceSettings;

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @return The ID of the associated Domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @param spaceName
     *        The name of the space.
     */

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @return The name of the space.
     */

    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * <p>
     * The name of the space.
     * </p>
     * 
     * @param spaceName
     *        The name of the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withSpaceName(String spaceName) {
        setSpaceName(spaceName);
        return this;
    }

    /**
     * <p>
     * Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be unique for
     * each resource. Tags are searchable using the <code>Search</code> API.
     * </p>
     * 
     * @return Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be
     *         unique for each resource. Tags are searchable using the <code>Search</code> API.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be unique for
     * each resource. Tags are searchable using the <code>Search</code> API.
     * </p>
     * 
     * @param tags
     *        Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be
     *        unique for each resource. Tags are searchable using the <code>Search</code> API.
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
     * Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be unique for
     * each resource. Tags are searchable using the <code>Search</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be
     *        unique for each resource. Tags are searchable using the <code>Search</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withTags(Tag... tags) {
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
     * Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be unique for
     * each resource. Tags are searchable using the <code>Search</code> API.
     * </p>
     * 
     * @param tags
     *        Tags to associated with the space. Each tag consists of a key and an optional value. Tag keys must be
     *        unique for each resource. Tags are searchable using the <code>Search</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A collection of space settings.
     * </p>
     * 
     * @param spaceSettings
     *        A collection of space settings.
     */

    public void setSpaceSettings(SpaceSettings spaceSettings) {
        this.spaceSettings = spaceSettings;
    }

    /**
     * <p>
     * A collection of space settings.
     * </p>
     * 
     * @return A collection of space settings.
     */

    public SpaceSettings getSpaceSettings() {
        return this.spaceSettings;
    }

    /**
     * <p>
     * A collection of space settings.
     * </p>
     * 
     * @param spaceSettings
     *        A collection of space settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceRequest withSpaceSettings(SpaceSettings spaceSettings) {
        setSpaceSettings(spaceSettings);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getSpaceName() != null)
            sb.append("SpaceName: ").append(getSpaceName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSpaceSettings() != null)
            sb.append("SpaceSettings: ").append(getSpaceSettings());
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
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getSpaceName() == null ^ this.getSpaceName() == null)
            return false;
        if (other.getSpaceName() != null && other.getSpaceName().equals(this.getSpaceName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSpaceSettings() == null ^ this.getSpaceSettings() == null)
            return false;
        if (other.getSpaceSettings() != null && other.getSpaceSettings().equals(this.getSpaceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getSpaceName() == null) ? 0 : getSpaceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSpaceSettings() == null) ? 0 : getSpaceSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateSpaceRequest clone() {
        return (CreateSpaceRequest) super.clone();
    }

}
