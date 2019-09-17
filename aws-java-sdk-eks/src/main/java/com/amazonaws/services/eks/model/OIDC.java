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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the <a href="https://openid.net/connect/">OpenID Connect</a> identity provider information for
 * the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/OIDC" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OIDC implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The issuer URL for the OpenID Connect identity provider.
     * </p>
     */
    private String issuer;

    /**
     * <p>
     * The issuer URL for the OpenID Connect identity provider.
     * </p>
     * 
     * @param issuer
     *        The issuer URL for the OpenID Connect identity provider.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer URL for the OpenID Connect identity provider.
     * </p>
     * 
     * @return The issuer URL for the OpenID Connect identity provider.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The issuer URL for the OpenID Connect identity provider.
     * </p>
     * 
     * @param issuer
     *        The issuer URL for the OpenID Connect identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OIDC withIssuer(String issuer) {
        setIssuer(issuer);
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
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OIDC == false)
            return false;
        OIDC other = (OIDC) obj;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        return hashCode;
    }

    @Override
    public OIDC clone() {
        try {
            return (OIDC) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.OIDCMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
