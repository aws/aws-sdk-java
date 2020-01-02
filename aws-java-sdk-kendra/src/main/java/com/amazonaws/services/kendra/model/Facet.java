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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information a document attribute
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Facet" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Facet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     */
    private String documentAttributeKey;

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     * 
     * @param documentAttributeKey
     *        The unique key for the document attribute.
     */

    public void setDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
    }

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     * 
     * @return The unique key for the document attribute.
     */

    public String getDocumentAttributeKey() {
        return this.documentAttributeKey;
    }

    /**
     * <p>
     * The unique key for the document attribute.
     * </p>
     * 
     * @param documentAttributeKey
     *        The unique key for the document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Facet withDocumentAttributeKey(String documentAttributeKey) {
        setDocumentAttributeKey(documentAttributeKey);
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
        if (getDocumentAttributeKey() != null)
            sb.append("DocumentAttributeKey: ").append(getDocumentAttributeKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Facet == false)
            return false;
        Facet other = (Facet) obj;
        if (other.getDocumentAttributeKey() == null ^ this.getDocumentAttributeKey() == null)
            return false;
        if (other.getDocumentAttributeKey() != null && other.getDocumentAttributeKey().equals(this.getDocumentAttributeKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttributeKey() == null) ? 0 : getDocumentAttributeKey().hashCode());
        return hashCode;
    }

    @Override
    public Facet clone() {
        try {
            return (Facet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FacetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
