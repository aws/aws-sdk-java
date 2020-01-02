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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A document that defines an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DefinitionDocument" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefinitionDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The GraphQL text that defines the entity.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * </p>
     * 
     * @param language
     *        The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * @see DefinitionLanguage
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * </p>
     * 
     * @return The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * @see DefinitionLanguage
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * </p>
     * 
     * @param language
     *        The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefinitionLanguage
     */

    public DefinitionDocument withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * </p>
     * 
     * @param language
     *        The language used to define the entity. <code>GRAPHQL</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefinitionLanguage
     */

    public DefinitionDocument withLanguage(DefinitionLanguage language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The GraphQL text that defines the entity.
     * </p>
     * 
     * @param text
     *        The GraphQL text that defines the entity.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The GraphQL text that defines the entity.
     * </p>
     * 
     * @return The GraphQL text that defines the entity.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The GraphQL text that defines the entity.
     * </p>
     * 
     * @param text
     *        The GraphQL text that defines the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefinitionDocument withText(String text) {
        setText(text);
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
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefinitionDocument == false)
            return false;
        DefinitionDocument other = (DefinitionDocument) obj;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public DefinitionDocument clone() {
        try {
            return (DefinitionDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.DefinitionDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
