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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The choice level additional resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AdditionalResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of additional resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The URLs for additional resources, either helpful resources or improvement plans. Up to five additional URLs can
     * be specified.
     * </p>
     */
    private java.util.List<ChoiceContent> content;

    /**
     * <p>
     * Type of additional resource.
     * </p>
     * 
     * @param type
     *        Type of additional resource.
     * @see AdditionalResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of additional resource.
     * </p>
     * 
     * @return Type of additional resource.
     * @see AdditionalResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of additional resource.
     * </p>
     * 
     * @param type
     *        Type of additional resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResourceType
     */

    public AdditionalResources withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of additional resource.
     * </p>
     * 
     * @param type
     *        Type of additional resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalResourceType
     */

    public AdditionalResources withType(AdditionalResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The URLs for additional resources, either helpful resources or improvement plans. Up to five additional URLs can
     * be specified.
     * </p>
     * 
     * @return The URLs for additional resources, either helpful resources or improvement plans. Up to five additional
     *         URLs can be specified.
     */

    public java.util.List<ChoiceContent> getContent() {
        return content;
    }

    /**
     * <p>
     * The URLs for additional resources, either helpful resources or improvement plans. Up to five additional URLs can
     * be specified.
     * </p>
     * 
     * @param content
     *        The URLs for additional resources, either helpful resources or improvement plans. Up to five additional
     *        URLs can be specified.
     */

    public void setContent(java.util.Collection<ChoiceContent> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<ChoiceContent>(content);
    }

    /**
     * <p>
     * The URLs for additional resources, either helpful resources or improvement plans. Up to five additional URLs can
     * be specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The URLs for additional resources, either helpful resources or improvement plans. Up to five additional
     *        URLs can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalResources withContent(ChoiceContent... content) {
        if (this.content == null) {
            setContent(new java.util.ArrayList<ChoiceContent>(content.length));
        }
        for (ChoiceContent ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The URLs for additional resources, either helpful resources or improvement plans. Up to five additional URLs can
     * be specified.
     * </p>
     * 
     * @param content
     *        The URLs for additional resources, either helpful resources or improvement plans. Up to five additional
     *        URLs can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalResources withContent(java.util.Collection<ChoiceContent> content) {
        setContent(content);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalResources == false)
            return false;
        AdditionalResources other = (AdditionalResources) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalResources clone() {
        try {
            return (AdditionalResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.AdditionalResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
