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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the type of identity that made the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/Identity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Identity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the entity that made the call. For Time To Live, the principalId is
     * "dynamodb.amazonaws.com".
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The type of the identity. For Time To Live, the type is "Service".
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique identifier for the entity that made the call. For Time To Live, the principalId is
     * "dynamodb.amazonaws.com".
     * </p>
     * 
     * @param principalId
     *        A unique identifier for the entity that made the call. For Time To Live, the principalId is
     *        "dynamodb.amazonaws.com".
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * A unique identifier for the entity that made the call. For Time To Live, the principalId is
     * "dynamodb.amazonaws.com".
     * </p>
     * 
     * @return A unique identifier for the entity that made the call. For Time To Live, the principalId is
     *         "dynamodb.amazonaws.com".
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * A unique identifier for the entity that made the call. For Time To Live, the principalId is
     * "dynamodb.amazonaws.com".
     * </p>
     * 
     * @param principalId
     *        A unique identifier for the entity that made the call. For Time To Live, the principalId is
     *        "dynamodb.amazonaws.com".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The type of the identity. For Time To Live, the type is "Service".
     * </p>
     * 
     * @param type
     *        The type of the identity. For Time To Live, the type is "Service".
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the identity. For Time To Live, the type is "Service".
     * </p>
     * 
     * @return The type of the identity. For Time To Live, the type is "Service".
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the identity. For Time To Live, the type is "Service".
     * </p>
     * 
     * @param type
     *        The type of the identity. For Time To Live, the type is "Service".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Identity withType(String type) {
        setType(type);
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Identity == false)
            return false;
        Identity other = (Identity) obj;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Identity clone() {
        try {
            return (Identity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.IdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
