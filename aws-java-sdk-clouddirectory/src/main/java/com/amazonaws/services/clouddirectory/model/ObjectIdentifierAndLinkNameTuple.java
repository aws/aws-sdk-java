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
 * A pair of ObjectIdentifier and LinkName.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ObjectIdentifierAndLinkNameTuple"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectIdentifierAndLinkNameTuple implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that is associated with the object.
     * </p>
     */
    private String objectIdentifier;
    /**
     * <p>
     * The name of the link between the parent and the child object.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The ID that is associated with the object.
     * </p>
     * 
     * @param objectIdentifier
     *        The ID that is associated with the object.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * The ID that is associated with the object.
     * </p>
     * 
     * @return The ID that is associated with the object.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * The ID that is associated with the object.
     * </p>
     * 
     * @param objectIdentifier
     *        The ID that is associated with the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectIdentifierAndLinkNameTuple withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the link between the parent and the child object.
     * </p>
     * 
     * @param linkName
     *        The name of the link between the parent and the child object.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link between the parent and the child object.
     * </p>
     * 
     * @return The name of the link between the parent and the child object.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the link between the parent and the child object.
     * </p>
     * 
     * @param linkName
     *        The name of the link between the parent and the child object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectIdentifierAndLinkNameTuple withLinkName(String linkName) {
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
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier()).append(",");
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

        if (obj instanceof ObjectIdentifierAndLinkNameTuple == false)
            return false;
        ObjectIdentifierAndLinkNameTuple other = (ObjectIdentifierAndLinkNameTuple) obj;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public ObjectIdentifierAndLinkNameTuple clone() {
        try {
            return (ObjectIdentifierAndLinkNameTuple) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.ObjectIdentifierAndLinkNameTupleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
