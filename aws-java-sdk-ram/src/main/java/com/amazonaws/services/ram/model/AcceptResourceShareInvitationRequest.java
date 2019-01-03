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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AcceptResourceShareInvitation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptResourceShareInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     */
    private String resourceShareInvitationArn;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * 
     * @param resourceShareInvitationArn
     *        The Amazon Resource Name (ARN) of the invitation.
     */

    public void setResourceShareInvitationArn(String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the invitation.
     */

    public String getResourceShareInvitationArn() {
        return this.resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * 
     * @param resourceShareInvitationArn
     *        The Amazon Resource Name (ARN) of the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptResourceShareInvitationRequest withResourceShareInvitationArn(String resourceShareInvitationArn) {
        setResourceShareInvitationArn(resourceShareInvitationArn);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptResourceShareInvitationRequest withClientToken(String clientToken) {
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
        if (getResourceShareInvitationArn() != null)
            sb.append("ResourceShareInvitationArn: ").append(getResourceShareInvitationArn()).append(",");
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

        if (obj instanceof AcceptResourceShareInvitationRequest == false)
            return false;
        AcceptResourceShareInvitationRequest other = (AcceptResourceShareInvitationRequest) obj;
        if (other.getResourceShareInvitationArn() == null ^ this.getResourceShareInvitationArn() == null)
            return false;
        if (other.getResourceShareInvitationArn() != null && other.getResourceShareInvitationArn().equals(this.getResourceShareInvitationArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceShareInvitationArn() == null) ? 0 : getResourceShareInvitationArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AcceptResourceShareInvitationRequest clone() {
        return (AcceptResourceShareInvitationRequest) super.clone();
    }

}
