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
 * Represents the output of an <a>AttachObject</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchAttachObject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAttachObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parent object reference.
     * </p>
     */
    private ObjectReference parentReference;
    /**
     * <p>
     * The child object reference that is to be attached to the object.
     * </p>
     */
    private ObjectReference childReference;
    /**
     * <p>
     * The name of the link.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The parent object reference.
     * </p>
     * 
     * @param parentReference
     *        The parent object reference.
     */

    public void setParentReference(ObjectReference parentReference) {
        this.parentReference = parentReference;
    }

    /**
     * <p>
     * The parent object reference.
     * </p>
     * 
     * @return The parent object reference.
     */

    public ObjectReference getParentReference() {
        return this.parentReference;
    }

    /**
     * <p>
     * The parent object reference.
     * </p>
     * 
     * @param parentReference
     *        The parent object reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachObject withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The child object reference that is to be attached to the object.
     * </p>
     * 
     * @param childReference
     *        The child object reference that is to be attached to the object.
     */

    public void setChildReference(ObjectReference childReference) {
        this.childReference = childReference;
    }

    /**
     * <p>
     * The child object reference that is to be attached to the object.
     * </p>
     * 
     * @return The child object reference that is to be attached to the object.
     */

    public ObjectReference getChildReference() {
        return this.childReference;
    }

    /**
     * <p>
     * The child object reference that is to be attached to the object.
     * </p>
     * 
     * @param childReference
     *        The child object reference that is to be attached to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachObject withChildReference(ObjectReference childReference) {
        setChildReference(childReference);
        return this;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @return The name of the link.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachObject withLinkName(String linkName) {
        setLinkName(linkName);
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
        if (getParentReference() != null)
            sb.append("ParentReference: ").append(getParentReference()).append(",");
        if (getChildReference() != null)
            sb.append("ChildReference: ").append(getChildReference()).append(",");
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAttachObject == false)
            return false;
        BatchAttachObject other = (BatchAttachObject) obj;
        if (other.getParentReference() == null ^ this.getParentReference() == null)
            return false;
        if (other.getParentReference() != null && other.getParentReference().equals(this.getParentReference()) == false)
            return false;
        if (other.getChildReference() == null ^ this.getChildReference() == null)
            return false;
        if (other.getChildReference() != null && other.getChildReference().equals(this.getChildReference()) == false)
            return false;
        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getChildReference() == null) ? 0 : getChildReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public BatchAttachObject clone() {
        try {
            return (BatchAttachObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchAttachObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
