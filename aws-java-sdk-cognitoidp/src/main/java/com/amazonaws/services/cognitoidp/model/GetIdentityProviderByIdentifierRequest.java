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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetIdentityProviderByIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityProviderByIdentifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The identity provider ID.
     * </p>
     */
    private String idpIdentifier;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityProviderByIdentifierRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The identity provider ID.
     * </p>
     * 
     * @param idpIdentifier
     *        The identity provider ID.
     */

    public void setIdpIdentifier(String idpIdentifier) {
        this.idpIdentifier = idpIdentifier;
    }

    /**
     * <p>
     * The identity provider ID.
     * </p>
     * 
     * @return The identity provider ID.
     */

    public String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    /**
     * <p>
     * The identity provider ID.
     * </p>
     * 
     * @param idpIdentifier
     *        The identity provider ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityProviderByIdentifierRequest withIdpIdentifier(String idpIdentifier) {
        setIdpIdentifier(idpIdentifier);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getIdpIdentifier() != null)
            sb.append("IdpIdentifier: ").append(getIdpIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityProviderByIdentifierRequest == false)
            return false;
        GetIdentityProviderByIdentifierRequest other = (GetIdentityProviderByIdentifierRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getIdpIdentifier() == null ^ this.getIdpIdentifier() == null)
            return false;
        if (other.getIdpIdentifier() != null && other.getIdpIdentifier().equals(this.getIdpIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdpIdentifier() == null) ? 0 : getIdpIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityProviderByIdentifierRequest clone() {
        return (GetIdentityProviderByIdentifierRequest) super.clone();
    }

}
