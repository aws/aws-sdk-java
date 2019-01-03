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
 * Represents the output batch <a>AttachObject</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchAttachObjectResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAttachObjectResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that has been attached.
     * </p>
     */
    private String attachedObjectIdentifier;

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that has been attached.
     * </p>
     * 
     * @param attachedObjectIdentifier
     *        The <code>ObjectIdentifier</code> of the object that has been attached.
     */

    public void setAttachedObjectIdentifier(String attachedObjectIdentifier) {
        this.attachedObjectIdentifier = attachedObjectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that has been attached.
     * </p>
     * 
     * @return The <code>ObjectIdentifier</code> of the object that has been attached.
     */

    public String getAttachedObjectIdentifier() {
        return this.attachedObjectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the object that has been attached.
     * </p>
     * 
     * @param attachedObjectIdentifier
     *        The <code>ObjectIdentifier</code> of the object that has been attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachObjectResponse withAttachedObjectIdentifier(String attachedObjectIdentifier) {
        setAttachedObjectIdentifier(attachedObjectIdentifier);
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
        if (getAttachedObjectIdentifier() != null)
            sb.append("AttachedObjectIdentifier: ").append(getAttachedObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAttachObjectResponse == false)
            return false;
        BatchAttachObjectResponse other = (BatchAttachObjectResponse) obj;
        if (other.getAttachedObjectIdentifier() == null ^ this.getAttachedObjectIdentifier() == null)
            return false;
        if (other.getAttachedObjectIdentifier() != null && other.getAttachedObjectIdentifier().equals(this.getAttachedObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachedObjectIdentifier() == null) ? 0 : getAttachedObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchAttachObjectResponse clone() {
        try {
            return (BatchAttachObjectResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchAttachObjectResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
