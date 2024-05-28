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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the form entry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/FormEntryInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormEntryInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether a form entry is required.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The type ID of the form entry.
     * </p>
     */
    private String typeIdentifier;
    /**
     * <p>
     * The type revision of the form entry.
     * </p>
     */
    private String typeRevision;

    /**
     * <p>
     * Specifies whether a form entry is required.
     * </p>
     * 
     * @param required
     *        Specifies whether a form entry is required.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Specifies whether a form entry is required.
     * </p>
     * 
     * @return Specifies whether a form entry is required.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies whether a form entry is required.
     * </p>
     * 
     * @param required
     *        Specifies whether a form entry is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormEntryInput withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Specifies whether a form entry is required.
     * </p>
     * 
     * @return Specifies whether a form entry is required.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The type ID of the form entry.
     * </p>
     * 
     * @param typeIdentifier
     *        The type ID of the form entry.
     */

    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    /**
     * <p>
     * The type ID of the form entry.
     * </p>
     * 
     * @return The type ID of the form entry.
     */

    public String getTypeIdentifier() {
        return this.typeIdentifier;
    }

    /**
     * <p>
     * The type ID of the form entry.
     * </p>
     * 
     * @param typeIdentifier
     *        The type ID of the form entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormEntryInput withTypeIdentifier(String typeIdentifier) {
        setTypeIdentifier(typeIdentifier);
        return this;
    }

    /**
     * <p>
     * The type revision of the form entry.
     * </p>
     * 
     * @param typeRevision
     *        The type revision of the form entry.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The type revision of the form entry.
     * </p>
     * 
     * @return The type revision of the form entry.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The type revision of the form entry.
     * </p>
     * 
     * @param typeRevision
     *        The type revision of the form entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormEntryInput withTypeRevision(String typeRevision) {
        setTypeRevision(typeRevision);
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
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getTypeIdentifier() != null)
            sb.append("TypeIdentifier: ").append(getTypeIdentifier()).append(",");
        if (getTypeRevision() != null)
            sb.append("TypeRevision: ").append(getTypeRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormEntryInput == false)
            return false;
        FormEntryInput other = (FormEntryInput) obj;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getTypeIdentifier() == null ^ this.getTypeIdentifier() == null)
            return false;
        if (other.getTypeIdentifier() != null && other.getTypeIdentifier().equals(this.getTypeIdentifier()) == false)
            return false;
        if (other.getTypeRevision() == null ^ this.getTypeRevision() == null)
            return false;
        if (other.getTypeRevision() != null && other.getTypeRevision().equals(this.getTypeRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getTypeIdentifier() == null) ? 0 : getTypeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        return hashCode;
    }

    @Override
    public FormEntryInput clone() {
        try {
            return (FormEntryInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.FormEntryInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
