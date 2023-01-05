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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetUserId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from
     * an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For
     * example, a unique <code>UserDisplayName</code>.
     * </p>
     */
    private AlternateIdentifier alternateIdentifier;

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @return The globally unique identifier for the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserIdRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from
     * an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For
     * example, a unique <code>UserDisplayName</code>.
     * </p>
     * 
     * @param alternateIdentifier
     *        A unique identifier for a user or group that is not the primary identifier. This value can be an
     *        identifier from an external identity provider (IdP) that is associated with the user, the group, or a
     *        unique attribute. For example, a unique <code>UserDisplayName</code>.
     */

    public void setAlternateIdentifier(AlternateIdentifier alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from
     * an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For
     * example, a unique <code>UserDisplayName</code>.
     * </p>
     * 
     * @return A unique identifier for a user or group that is not the primary identifier. This value can be an
     *         identifier from an external identity provider (IdP) that is associated with the user, the group, or a
     *         unique attribute. For example, a unique <code>UserDisplayName</code>.
     */

    public AlternateIdentifier getAlternateIdentifier() {
        return this.alternateIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from
     * an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For
     * example, a unique <code>UserDisplayName</code>.
     * </p>
     * 
     * @param alternateIdentifier
     *        A unique identifier for a user or group that is not the primary identifier. This value can be an
     *        identifier from an external identity provider (IdP) that is associated with the user, the group, or a
     *        unique attribute. For example, a unique <code>UserDisplayName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserIdRequest withAlternateIdentifier(AlternateIdentifier alternateIdentifier) {
        setAlternateIdentifier(alternateIdentifier);
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
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getAlternateIdentifier() != null)
            sb.append("AlternateIdentifier: ").append(getAlternateIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserIdRequest == false)
            return false;
        GetUserIdRequest other = (GetUserIdRequest) obj;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getAlternateIdentifier() == null ^ this.getAlternateIdentifier() == null)
            return false;
        if (other.getAlternateIdentifier() != null && other.getAlternateIdentifier().equals(this.getAlternateIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getAlternateIdentifier() == null) ? 0 : getAlternateIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetUserIdRequest clone() {
        return (GetUserIdRequest) super.clone();
    }

}
