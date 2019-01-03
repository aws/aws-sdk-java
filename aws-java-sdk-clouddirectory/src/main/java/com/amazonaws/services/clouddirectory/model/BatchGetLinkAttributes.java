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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieves attributes that are associated with a typed link inside a <a>BatchRead</a> operation. For more information,
 * see <a>GetLinkAttributes</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchGetLinkAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetLinkAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     */
    private TypedLinkSpecifier typedLinkSpecifier;
    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Allows a typed link specifier to be accepted as input.
     */

    public void setTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        this.typedLinkSpecifier = typedLinkSpecifier;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @return Allows a typed link specifier to be accepted as input.
     */

    public TypedLinkSpecifier getTypedLinkSpecifier() {
        return this.typedLinkSpecifier;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Allows a typed link specifier to be accepted as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLinkAttributes withTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        setTypedLinkSpecifier(typedLinkSpecifier);
        return this;
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * 
     * @return A list of attribute names whose values will be retrieved.
     */

    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * 
     * @param attributeNames
     *        A list of attribute names whose values will be retrieved.
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of attribute names whose values will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLinkAttributes withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * 
     * @param attributeNames
     *        A list of attribute names whose values will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLinkAttributes withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getTypedLinkSpecifier() != null)
            sb.append("TypedLinkSpecifier: ").append(getTypedLinkSpecifier()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetLinkAttributes == false)
            return false;
        BatchGetLinkAttributes other = (BatchGetLinkAttributes) obj;
        if (other.getTypedLinkSpecifier() == null ^ this.getTypedLinkSpecifier() == null)
            return false;
        if (other.getTypedLinkSpecifier() != null && other.getTypedLinkSpecifier().equals(this.getTypedLinkSpecifier()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypedLinkSpecifier() == null) ? 0 : getTypedLinkSpecifier().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetLinkAttributes clone() {
        try {
            return (BatchGetLinkAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchGetLinkAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
