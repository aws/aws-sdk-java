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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for a document field/attribute that you want to base query suggestions on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SuggestableConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestableConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the document field/attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can be used
     * for query suggestions.
     * </p>
     */
    private Boolean suggestable;

    /**
     * <p>
     * The name of the document field/attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the document field/attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the document field/attribute.
     * </p>
     * 
     * @return The name of the document field/attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the document field/attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the document field/attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestableConfig withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can be used
     * for query suggestions.
     * </p>
     * 
     * @param suggestable
     *        <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can
     *        be used for query suggestions.
     */

    public void setSuggestable(Boolean suggestable) {
        this.suggestable = suggestable;
    }

    /**
     * <p>
     * <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can be used
     * for query suggestions.
     * </p>
     * 
     * @return <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can
     *         be used for query suggestions.
     */

    public Boolean getSuggestable() {
        return this.suggestable;
    }

    /**
     * <p>
     * <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can be used
     * for query suggestions.
     * </p>
     * 
     * @param suggestable
     *        <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can
     *        be used for query suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestableConfig withSuggestable(Boolean suggestable) {
        setSuggestable(suggestable);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can be used
     * for query suggestions.
     * </p>
     * 
     * @return <code>TRUE</code> means the document field/attribute is suggestible, so the contents within the field can
     *         be used for query suggestions.
     */

    public Boolean isSuggestable() {
        return this.suggestable;
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getSuggestable() != null)
            sb.append("Suggestable: ").append(getSuggestable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestableConfig == false)
            return false;
        SuggestableConfig other = (SuggestableConfig) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getSuggestable() == null ^ this.getSuggestable() == null)
            return false;
        if (other.getSuggestable() != null && other.getSuggestable().equals(this.getSuggestable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getSuggestable() == null) ? 0 : getSuggestable().hashCode());
        return hashCode;
    }

    @Override
    public SuggestableConfig clone() {
        try {
            return (SuggestableConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SuggestableConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
