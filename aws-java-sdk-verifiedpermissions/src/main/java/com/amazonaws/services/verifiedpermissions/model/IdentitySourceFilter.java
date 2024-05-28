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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines characteristics of an identity source that you can use to filter.
 * </p>
 * <p>
 * This data type is a request parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListIdentityStores.html"
 * >ListIdentityStores</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IdentitySourceFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentitySourceFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Cedar entity type of the principals returned by the identity provider (IdP) associated with this identity
     * source.
     * </p>
     */
    private String principalEntityType;

    /**
     * <p>
     * The Cedar entity type of the principals returned by the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * 
     * @param principalEntityType
     *        The Cedar entity type of the principals returned by the identity provider (IdP) associated with this
     *        identity source.
     */

    public void setPrincipalEntityType(String principalEntityType) {
        this.principalEntityType = principalEntityType;
    }

    /**
     * <p>
     * The Cedar entity type of the principals returned by the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * 
     * @return The Cedar entity type of the principals returned by the identity provider (IdP) associated with this
     *         identity source.
     */

    public String getPrincipalEntityType() {
        return this.principalEntityType;
    }

    /**
     * <p>
     * The Cedar entity type of the principals returned by the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * 
     * @param principalEntityType
     *        The Cedar entity type of the principals returned by the identity provider (IdP) associated with this
     *        identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentitySourceFilter withPrincipalEntityType(String principalEntityType) {
        setPrincipalEntityType(principalEntityType);
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
        if (getPrincipalEntityType() != null)
            sb.append("PrincipalEntityType: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentitySourceFilter == false)
            return false;
        IdentitySourceFilter other = (IdentitySourceFilter) obj;
        if (other.getPrincipalEntityType() == null ^ this.getPrincipalEntityType() == null)
            return false;
        if (other.getPrincipalEntityType() != null && other.getPrincipalEntityType().equals(this.getPrincipalEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalEntityType() == null) ? 0 : getPrincipalEntityType().hashCode());
        return hashCode;
    }

    @Override
    public IdentitySourceFilter clone() {
        try {
            return (IdentitySourceFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.IdentitySourceFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
