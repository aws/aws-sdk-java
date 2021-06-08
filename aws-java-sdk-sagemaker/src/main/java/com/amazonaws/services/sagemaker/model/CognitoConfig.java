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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this parameter to configure your Amazon Cognito workforce. A single Cognito workforce is created using and
 * corresponds to a single <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon Cognito
 * user pool</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CognitoConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> user
     * pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web or mobile
     * app through Amazon Cognito. Your users can also sign in through social identity providers like Google, Facebook,
     * Amazon, or Apple, and through SAML identity providers.
     * </p>
     */
    private String userPool;
    /**
     * <p>
     * The client ID for your Amazon Cognito user pool.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> user
     * pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web or mobile
     * app through Amazon Cognito. Your users can also sign in through social identity providers like Google, Facebook,
     * Amazon, or Apple, and through SAML identity providers.
     * </p>
     * 
     * @param userPool
     *        A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     *        user pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web
     *        or mobile app through Amazon Cognito. Your users can also sign in through social identity providers like
     *        Google, Facebook, Amazon, or Apple, and through SAML identity providers.
     */

    public void setUserPool(String userPool) {
        this.userPool = userPool;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> user
     * pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web or mobile
     * app through Amazon Cognito. Your users can also sign in through social identity providers like Google, Facebook,
     * Amazon, or Apple, and through SAML identity providers.
     * </p>
     * 
     * @return A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     *         user pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web
     *         or mobile app through Amazon Cognito. Your users can also sign in through social identity providers like
     *         Google, Facebook, Amazon, or Apple, and through SAML identity providers.
     */

    public String getUserPool() {
        return this.userPool;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> user
     * pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web or mobile
     * app through Amazon Cognito. Your users can also sign in through social identity providers like Google, Facebook,
     * Amazon, or Apple, and through SAML identity providers.
     * </p>
     * 
     * @param userPool
     *        A <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     *        user pool</a> is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web
     *        or mobile app through Amazon Cognito. Your users can also sign in through social identity providers like
     *        Google, Facebook, Amazon, or Apple, and through SAML identity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoConfig withUserPool(String userPool) {
        setUserPool(userPool);
        return this;
    }

    /**
     * <p>
     * The client ID for your Amazon Cognito user pool.
     * </p>
     * 
     * @param clientId
     *        The client ID for your Amazon Cognito user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID for your Amazon Cognito user pool.
     * </p>
     * 
     * @return The client ID for your Amazon Cognito user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client ID for your Amazon Cognito user pool.
     * </p>
     * 
     * @param clientId
     *        The client ID for your Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoConfig withClientId(String clientId) {
        setClientId(clientId);
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
        if (getUserPool() != null)
            sb.append("UserPool: ").append(getUserPool()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoConfig == false)
            return false;
        CognitoConfig other = (CognitoConfig) obj;
        if (other.getUserPool() == null ^ this.getUserPool() == null)
            return false;
        if (other.getUserPool() != null && other.getUserPool().equals(this.getUserPool()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPool() == null) ? 0 : getUserPool().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public CognitoConfig clone() {
        try {
            return (CognitoConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CognitoConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
