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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EnableDelegatedAdminAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableDelegatedAdminAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     */
    private String delegatedAdminAccountId;

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * 
     * @return The idempotency token for the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableDelegatedAdminAccountRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     */

    public void setDelegatedAdminAccountId(String delegatedAdminAccountId) {
        this.delegatedAdminAccountId = delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     */

    public String getDelegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableDelegatedAdminAccountRequest withDelegatedAdminAccountId(String delegatedAdminAccountId) {
        setDelegatedAdminAccountId(delegatedAdminAccountId);
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
        if (getDelegatedAdminAccountId() != null)
            sb.append("DelegatedAdminAccountId: ").append(getDelegatedAdminAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableDelegatedAdminAccountRequest == false)
            return false;
        EnableDelegatedAdminAccountRequest other = (EnableDelegatedAdminAccountRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDelegatedAdminAccountId() == null ^ this.getDelegatedAdminAccountId() == null)
            return false;
        if (other.getDelegatedAdminAccountId() != null && other.getDelegatedAdminAccountId().equals(this.getDelegatedAdminAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDelegatedAdminAccountId() == null) ? 0 : getDelegatedAdminAccountId().hashCode());
        return hashCode;
    }

    @Override
    public EnableDelegatedAdminAccountRequest clone() {
        return (EnableDelegatedAdminAccountRequest) super.clone();
    }

}
