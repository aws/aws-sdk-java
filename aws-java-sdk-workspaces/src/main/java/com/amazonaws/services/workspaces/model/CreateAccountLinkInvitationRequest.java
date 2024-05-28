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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateAccountLinkInvitation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountLinkInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     */
    private String targetAccountId;
    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @return The identifier of the target account.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountLinkInvitationRequest withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
        return this;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     * 
     * @param clientToken
     *        A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     * 
     * @param clientToken
     *        A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountLinkInvitationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: ").append(getTargetAccountId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountLinkInvitationRequest == false)
            return false;
        CreateAccountLinkInvitationRequest other = (CreateAccountLinkInvitationRequest) obj;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccountLinkInvitationRequest clone() {
        return (CreateAccountLinkInvitationRequest) super.clone();
    }

}
