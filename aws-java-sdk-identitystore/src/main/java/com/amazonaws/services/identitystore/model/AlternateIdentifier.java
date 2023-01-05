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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from an
 * external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For example, a
 * unique <code>GroupDisplayName</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/AlternateIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlternateIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier issued to this resource by an external identity provider.
     * </p>
     */
    private ExternalId externalId;

    /**
     * <p>
     * The identifier issued to this resource by an external identity provider.
     * </p>
     * 
     * @param externalId
     *        The identifier issued to this resource by an external identity provider.
     */

    public void setExternalId(ExternalId externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The identifier issued to this resource by an external identity provider.
     * </p>
     * 
     * @return The identifier issued to this resource by an external identity provider.
     */

    public ExternalId getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The identifier issued to this resource by an external identity provider.
     * </p>
     * 
     * @param externalId
     *        The identifier issued to this resource by an external identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateIdentifier withExternalId(ExternalId externalId) {
        setExternalId(externalId);
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
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlternateIdentifier == false)
            return false;
        AlternateIdentifier other = (AlternateIdentifier) obj;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public AlternateIdentifier clone() {
        try {
            return (AlternateIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.AlternateIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
