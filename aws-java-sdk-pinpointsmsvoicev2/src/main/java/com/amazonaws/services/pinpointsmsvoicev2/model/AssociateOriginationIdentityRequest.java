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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateOriginationIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateOriginationIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find these
     * values using <a>DescribePools</a>.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination identity.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find these
     * values using <a>DescribePools</a>.
     * </p>
     * 
     * @param poolId
     *        The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find
     *        these values using <a>DescribePools</a>.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find these
     * values using <a>DescribePools</a>.
     * </p>
     * 
     * @return The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can
     *         find these values using <a>DescribePools</a>.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find these
     * values using <a>DescribePools</a>.
     * </p>
     * 
     * @param poolId
     *        The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find
     *        these values using <a>DescribePools</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOriginationIdentityRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @return The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can
     *         use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     *         <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     * <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn, while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOriginationIdentityRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination identity.
     * </p>
     * 
     * @param isoCountryCode
     *        The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination
     *        identity.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination identity.
     * </p>
     * 
     * @return The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination
     *         identity.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination identity.
     * </p>
     * 
     * @param isoCountryCode
     *        The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination
     *        identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOriginationIdentityRequest withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *         specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOriginationIdentityRequest withClientToken(String clientToken) {
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
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

        if (obj instanceof AssociateOriginationIdentityRequest == false)
            return false;
        AssociateOriginationIdentityRequest other = (AssociateOriginationIdentityRequest) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
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

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateOriginationIdentityRequest clone() {
        return (AssociateOriginationIdentityRequest) super.clone();
    }

}
