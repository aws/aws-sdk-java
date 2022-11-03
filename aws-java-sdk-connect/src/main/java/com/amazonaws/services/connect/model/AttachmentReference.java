/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AttachmentReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The location path of the attachment reference.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Status of the attachment reference type.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * 
     * @param name
     *        Identifier of the attachment reference.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * 
     * @return Identifier of the attachment reference.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Identifier of the attachment reference.
     * </p>
     * 
     * @param name
     *        Identifier of the attachment reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentReference withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The location path of the attachment reference.
     * </p>
     * 
     * @param value
     *        The location path of the attachment reference.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The location path of the attachment reference.
     * </p>
     * 
     * @return The location path of the attachment reference.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The location path of the attachment reference.
     * </p>
     * 
     * @param value
     *        The location path of the attachment reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentReference withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Status of the attachment reference type.
     * </p>
     * 
     * @param status
     *        Status of the attachment reference type.
     * @see ReferenceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the attachment reference type.
     * </p>
     * 
     * @return Status of the attachment reference type.
     * @see ReferenceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the attachment reference type.
     * </p>
     * 
     * @param status
     *        Status of the attachment reference type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceStatus
     */

    public AttachmentReference withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the attachment reference type.
     * </p>
     * 
     * @param status
     *        Status of the attachment reference type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceStatus
     */

    public AttachmentReference withStatus(ReferenceStatus status) {
        this.status = status.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentReference == false)
            return false;
        AttachmentReference other = (AttachmentReference) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentReference clone() {
        try {
            return (AttachmentReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AttachmentReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
