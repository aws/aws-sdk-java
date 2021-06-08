/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Configuration information of the security key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SecurityKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The key of the security key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * When the security key was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @param associationId
     *        The existing association identifier that uniquely identifies the resource type and storage config for the
     *        given instance ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @return The existing association identifier that uniquely identifies the resource type and storage config for the
     *         given instance ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @param associationId
     *        The existing association identifier that uniquely identifies the resource type and storage config for the
     *        given instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityKey withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The key of the security key.
     * </p>
     * 
     * @param key
     *        The key of the security key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the security key.
     * </p>
     * 
     * @return The key of the security key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the security key.
     * </p>
     * 
     * @param key
     *        The key of the security key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityKey withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * When the security key was created.
     * </p>
     * 
     * @param creationTime
     *        When the security key was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the security key was created.
     * </p>
     * 
     * @return When the security key was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the security key was created.
     * </p>
     * 
     * @param creationTime
     *        When the security key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityKey withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityKey == false)
            return false;
        SecurityKey other = (SecurityKey) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public SecurityKey clone() {
        try {
            return (SecurityKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SecurityKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
