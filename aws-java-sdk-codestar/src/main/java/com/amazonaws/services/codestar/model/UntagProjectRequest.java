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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UntagProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project to remove tags from.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The tags to remove from the project.
     * </p>
     */
    private java.util.List<String> tags;

    /**
     * <p>
     * The ID of the project to remove tags from.
     * </p>
     * 
     * @param id
     *        The ID of the project to remove tags from.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the project to remove tags from.
     * </p>
     * 
     * @return The ID of the project to remove tags from.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the project to remove tags from.
     * </p>
     * 
     * @param id
     *        The ID of the project to remove tags from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagProjectRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The tags to remove from the project.
     * </p>
     * 
     * @return The tags to remove from the project.
     */

    public java.util.List<String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to remove from the project.
     * </p>
     * 
     * @param tags
     *        The tags to remove from the project.
     */

    public void setTags(java.util.Collection<String> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<String>(tags);
    }

    /**
     * <p>
     * The tags to remove from the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to remove from the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagProjectRequest withTags(String... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<String>(tags.length));
        }
        for (String ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to remove from the project.
     * </p>
     * 
     * @param tags
     *        The tags to remove from the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagProjectRequest withTags(java.util.Collection<String> tags) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof UntagProjectRequest == false)
            return false;
        UntagProjectRequest other = (UntagProjectRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UntagProjectRequest clone() {
        return (UntagProjectRequest) super.clone();
    }

}
