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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A provider representing an Amazon Cognito Identity User Pool and its client ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/CognitoIdentityProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoIdentityProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The provider name for an Amazon Cognito Identity User Pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The client ID for the Amazon Cognito Identity User Pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity provider’s token.
     * </p>
     */
    private Boolean serverSideTokenCheck;

    /**
     * <p>
     * The provider name for an Amazon Cognito Identity User Pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * 
     * @param providerName
     *        The provider name for an Amazon Cognito Identity User Pool. For example,
     *        <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The provider name for an Amazon Cognito Identity User Pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * 
     * @return The provider name for an Amazon Cognito Identity User Pool. For example,
     *         <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The provider name for an Amazon Cognito Identity User Pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * 
     * @param providerName
     *        The provider name for an Amazon Cognito Identity User Pool. For example,
     *        <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoIdentityProvider withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The client ID for the Amazon Cognito Identity User Pool.
     * </p>
     * 
     * @param clientId
     *        The client ID for the Amazon Cognito Identity User Pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID for the Amazon Cognito Identity User Pool.
     * </p>
     * 
     * @return The client ID for the Amazon Cognito Identity User Pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client ID for the Amazon Cognito Identity User Pool.
     * </p>
     * 
     * @param clientId
     *        The client ID for the Amazon Cognito Identity User Pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoIdentityProvider withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity provider’s token.
     * </p>
     * 
     * @param serverSideTokenCheck
     *        TRUE if server-side token validation is enabled for the identity provider’s token.
     */

    public void setServerSideTokenCheck(Boolean serverSideTokenCheck) {
        this.serverSideTokenCheck = serverSideTokenCheck;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity provider’s token.
     * </p>
     * 
     * @return TRUE if server-side token validation is enabled for the identity provider’s token.
     */

    public Boolean getServerSideTokenCheck() {
        return this.serverSideTokenCheck;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity provider’s token.
     * </p>
     * 
     * @param serverSideTokenCheck
     *        TRUE if server-side token validation is enabled for the identity provider’s token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoIdentityProvider withServerSideTokenCheck(Boolean serverSideTokenCheck) {
        setServerSideTokenCheck(serverSideTokenCheck);
        return this;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity provider’s token.
     * </p>
     * 
     * @return TRUE if server-side token validation is enabled for the identity provider’s token.
     */

    public Boolean isServerSideTokenCheck() {
        return this.serverSideTokenCheck;
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
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getServerSideTokenCheck() != null)
            sb.append("ServerSideTokenCheck: ").append(getServerSideTokenCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoIdentityProvider == false)
            return false;
        CognitoIdentityProvider other = (CognitoIdentityProvider) obj;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getServerSideTokenCheck() == null ^ this.getServerSideTokenCheck() == null)
            return false;
        if (other.getServerSideTokenCheck() != null && other.getServerSideTokenCheck().equals(this.getServerSideTokenCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getServerSideTokenCheck() == null) ? 0 : getServerSideTokenCheck().hashCode());
        return hashCode;
    }

    @Override
    public CognitoIdentityProvider clone() {
        try {
            return (CognitoIdentityProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidentity.model.transform.CognitoIdentityProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
