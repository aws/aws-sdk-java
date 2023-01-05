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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an account or service that has access to an Amazon OpenSearch Service domain through the use of an
 * interface VPC endpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizedPrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of principal.
     * </p>
     */
    private String principalType;
    /**
     * <p>
     * The IAM principal that is allowed access to the domain.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param principalType
     *        The type of principal.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @return The type of principal.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param principalType
     *        The type of principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AuthorizedPrincipal withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param principalType
     *        The type of principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AuthorizedPrincipal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
        return this;
    }

    /**
     * <p>
     * The IAM principal that is allowed access to the domain.
     * </p>
     * 
     * @param principal
     *        The IAM principal that is allowed access to the domain.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The IAM principal that is allowed access to the domain.
     * </p>
     * 
     * @return The IAM principal that is allowed access to the domain.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The IAM principal that is allowed access to the domain.
     * </p>
     * 
     * @param principal
     *        The IAM principal that is allowed access to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizedPrincipal withPrincipal(String principal) {
        setPrincipal(principal);
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
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizedPrincipal == false)
            return false;
        AuthorizedPrincipal other = (AuthorizedPrincipal) obj;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizedPrincipal clone() {
        try {
            return (AuthorizedPrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.AuthorizedPrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
