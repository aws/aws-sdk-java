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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AssociateSoftwareToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateSoftwareTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access token.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     */
    private String session;

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @param accessToken
     *        The access token.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @return The access token.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @param accessToken
     *        The access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSoftwareTokenRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. This allows
     *        authentication of the user as part of the MFA setup process.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. This allows
     *         authentication of the user as part of the MFA setup process.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. This allows
     * authentication of the user as part of the MFA setup process.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. This allows
     *        authentication of the user as part of the MFA setup process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSoftwareTokenRequest withSession(String session) {
        setSession(session);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSoftwareTokenRequest == false)
            return false;
        AssociateSoftwareTokenRequest other = (AssociateSoftwareTokenRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSoftwareTokenRequest clone() {
        return (AssociateSoftwareTokenRequest) super.clone();
    }

}
