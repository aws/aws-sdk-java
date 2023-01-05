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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeVpcEndpointAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Amazon Web Services account or service that was provided access to the domain.
     * </p>
     */
    private AuthorizedPrincipal authorizedPrincipal;

    /**
     * <p>
     * Information about the Amazon Web Services account or service that was provided access to the domain.
     * </p>
     * 
     * @param authorizedPrincipal
     *        Information about the Amazon Web Services account or service that was provided access to the domain.
     */

    public void setAuthorizedPrincipal(AuthorizedPrincipal authorizedPrincipal) {
        this.authorizedPrincipal = authorizedPrincipal;
    }

    /**
     * <p>
     * Information about the Amazon Web Services account or service that was provided access to the domain.
     * </p>
     * 
     * @return Information about the Amazon Web Services account or service that was provided access to the domain.
     */

    public AuthorizedPrincipal getAuthorizedPrincipal() {
        return this.authorizedPrincipal;
    }

    /**
     * <p>
     * Information about the Amazon Web Services account or service that was provided access to the domain.
     * </p>
     * 
     * @param authorizedPrincipal
     *        Information about the Amazon Web Services account or service that was provided access to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeVpcEndpointAccessResult withAuthorizedPrincipal(AuthorizedPrincipal authorizedPrincipal) {
        setAuthorizedPrincipal(authorizedPrincipal);
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
        if (getAuthorizedPrincipal() != null)
            sb.append("AuthorizedPrincipal: ").append(getAuthorizedPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeVpcEndpointAccessResult == false)
            return false;
        AuthorizeVpcEndpointAccessResult other = (AuthorizeVpcEndpointAccessResult) obj;
        if (other.getAuthorizedPrincipal() == null ^ this.getAuthorizedPrincipal() == null)
            return false;
        if (other.getAuthorizedPrincipal() != null && other.getAuthorizedPrincipal().equals(this.getAuthorizedPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizedPrincipal() == null) ? 0 : getAuthorizedPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeVpcEndpointAccessResult clone() {
        try {
            return (AuthorizeVpcEndpointAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
