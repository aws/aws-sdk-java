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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A launch profile membership collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutStudioMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStudioMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the identity store.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * A list of members.
     * </p>
     */
    private java.util.List<NewStudioMember> members;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @return To make an idempotent API request using one of these actions, specify a client token in the request. You
     *         should not reuse the same client token for other API requests. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, the retry fails with a ValidationException error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStudioMembersRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The ID of the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     * 
     * @return The ID of the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The ID of the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The ID of the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStudioMembersRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * 
     * @return A list of members.
     */

    public java.util.List<NewStudioMember> getMembers() {
        return members;
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * 
     * @param members
     *        A list of members.
     */

    public void setMembers(java.util.Collection<NewStudioMember> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<NewStudioMember>(members);
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        A list of members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStudioMembersRequest withMembers(NewStudioMember... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<NewStudioMember>(members.length));
        }
        for (NewStudioMember ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of members.
     * </p>
     * 
     * @param members
     *        A list of members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStudioMembersRequest withMembers(java.util.Collection<NewStudioMember> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStudioMembersRequest withStudioId(String studioId) {
        setStudioId(studioId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutStudioMembersRequest == false)
            return false;
        PutStudioMembersRequest other = (PutStudioMembersRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public PutStudioMembersRequest clone() {
        return (PutStudioMembersRequest) super.clone();
    }

}
