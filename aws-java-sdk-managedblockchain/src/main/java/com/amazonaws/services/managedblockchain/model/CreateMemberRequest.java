/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMemberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The unique identifier of the invitation that is sent to the member to join the network.
     * </p>
     */
    private String invitationId;
    /**
     * <p>
     * The unique identifier of the network in which the member is created.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * Member configuration parameters.
     * </p>
     */
    private MemberConfiguration memberConfiguration;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time. This identifier is required only if you make a
     *         service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *         AWS CLI.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the invitation that is sent to the member to join the network.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier of the invitation that is sent to the member to join the network.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The unique identifier of the invitation that is sent to the member to join the network.
     * </p>
     * 
     * @return The unique identifier of the invitation that is sent to the member to join the network.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The unique identifier of the invitation that is sent to the member to join the network.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier of the invitation that is sent to the member to join the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the network in which the member is created.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network in which the member is created.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network in which the member is created.
     * </p>
     * 
     * @return The unique identifier of the network in which the member is created.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network in which the member is created.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network in which the member is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * Member configuration parameters.
     * </p>
     * 
     * @param memberConfiguration
     *        Member configuration parameters.
     */

    public void setMemberConfiguration(MemberConfiguration memberConfiguration) {
        this.memberConfiguration = memberConfiguration;
    }

    /**
     * <p>
     * Member configuration parameters.
     * </p>
     * 
     * @return Member configuration parameters.
     */

    public MemberConfiguration getMemberConfiguration() {
        return this.memberConfiguration;
    }

    /**
     * <p>
     * Member configuration parameters.
     * </p>
     * 
     * @param memberConfiguration
     *        Member configuration parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest withMemberConfiguration(MemberConfiguration memberConfiguration) {
        setMemberConfiguration(memberConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getInvitationId() != null)
            sb.append("InvitationId: ").append(getInvitationId()).append(",");
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberConfiguration() != null)
            sb.append("MemberConfiguration: ").append(getMemberConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMemberRequest == false)
            return false;
        CreateMemberRequest other = (CreateMemberRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberConfiguration() == null ^ this.getMemberConfiguration() == null)
            return false;
        if (other.getMemberConfiguration() != null && other.getMemberConfiguration().equals(this.getMemberConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberConfiguration() == null) ? 0 : getMemberConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateMemberRequest clone() {
        return (CreateMemberRequest) super.clone();
    }

}
