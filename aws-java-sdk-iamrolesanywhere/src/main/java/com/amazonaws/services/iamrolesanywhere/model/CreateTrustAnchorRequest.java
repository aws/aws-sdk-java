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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateTrustAnchor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrustAnchorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether the trust anchor is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * The tags to attach to the trust anchor.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies whether the trust anchor is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the trust anchor is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the trust anchor is enabled.
     * </p>
     * 
     * @return Specifies whether the trust anchor is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the trust anchor is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the trust anchor is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustAnchorRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trust anchor is enabled.
     * </p>
     * 
     * @return Specifies whether the trust anchor is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @param name
     *        The name of the trust anchor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @return The name of the trust anchor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trust anchor.
     * </p>
     * 
     * @param name
     *        The name of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustAnchorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @param source
     *        The trust anchor type and its related certificate data.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @return The trust anchor type and its related certificate data.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The trust anchor type and its related certificate data.
     * </p>
     * 
     * @param source
     *        The trust anchor type and its related certificate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustAnchorRequest withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the trust anchor.
     * </p>
     * 
     * @return The tags to attach to the trust anchor.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the trust anchor.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the trust anchor.
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
     * The tags to attach to the trust anchor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustAnchorRequest withTags(Tag... tags) {
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
     * The tags to attach to the trust anchor.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustAnchorRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
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

        if (obj instanceof CreateTrustAnchorRequest == false)
            return false;
        CreateTrustAnchorRequest other = (CreateTrustAnchorRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustAnchorRequest clone() {
        return (CreateTrustAnchorRequest) super.clone();
    }

}
