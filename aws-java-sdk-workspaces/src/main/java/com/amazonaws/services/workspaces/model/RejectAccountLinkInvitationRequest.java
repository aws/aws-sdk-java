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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RejectAccountLinkInvitation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectAccountLinkInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the account link
     * </p>
     */
    private String linkId;
    /**
     * <p>
     * The client token of the account link invitation to reject.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the account link
     * </p>
     * 
     * @param linkId
     *        The identifier of the account link
     */

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * <p>
     * The identifier of the account link
     * </p>
     * 
     * @return The identifier of the account link
     */

    public String getLinkId() {
        return this.linkId;
    }

    /**
     * <p>
     * The identifier of the account link
     * </p>
     * 
     * @param linkId
     *        The identifier of the account link
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectAccountLinkInvitationRequest withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The client token of the account link invitation to reject.
     * </p>
     * 
     * @param clientToken
     *        The client token of the account link invitation to reject.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the account link invitation to reject.
     * </p>
     * 
     * @return The client token of the account link invitation to reject.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the account link invitation to reject.
     * </p>
     * 
     * @param clientToken
     *        The client token of the account link invitation to reject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectAccountLinkInvitationRequest withClientToken(String clientToken) {
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
        if (getLinkId() != null)
            sb.append("LinkId: ").append(getLinkId()).append(",");
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

        if (obj instanceof RejectAccountLinkInvitationRequest == false)
            return false;
        RejectAccountLinkInvitationRequest other = (RejectAccountLinkInvitationRequest) obj;
        if (other.getLinkId() == null ^ this.getLinkId() == null)
            return false;
        if (other.getLinkId() != null && other.getLinkId().equals(this.getLinkId()) == false)
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

        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public RejectAccountLinkInvitationRequest clone() {
        return (RejectAccountLinkInvitationRequest) super.clone();
    }

}
