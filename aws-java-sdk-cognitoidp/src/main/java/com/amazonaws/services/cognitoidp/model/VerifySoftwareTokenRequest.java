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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifySoftwareToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifySoftwareTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access token.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     */
    private String session;
    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     */
    private String userCode;
    /**
     * <p>
     * The friendly device name.
     * </p>
     */
    private String friendlyDeviceName;

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

    public VerifySoftwareTokenRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifySoftwareTokenRequest withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * 
     * @param userCode
     *        The one time password computed using the secret code returned by
     */

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * 
     * @return The one time password computed using the secret code returned by
     */

    public String getUserCode() {
        return this.userCode;
    }

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * 
     * @param userCode
     *        The one time password computed using the secret code returned by
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifySoftwareTokenRequest withUserCode(String userCode) {
        setUserCode(userCode);
        return this;
    }

    /**
     * <p>
     * The friendly device name.
     * </p>
     * 
     * @param friendlyDeviceName
     *        The friendly device name.
     */

    public void setFriendlyDeviceName(String friendlyDeviceName) {
        this.friendlyDeviceName = friendlyDeviceName;
    }

    /**
     * <p>
     * The friendly device name.
     * </p>
     * 
     * @return The friendly device name.
     */

    public String getFriendlyDeviceName() {
        return this.friendlyDeviceName;
    }

    /**
     * <p>
     * The friendly device name.
     * </p>
     * 
     * @param friendlyDeviceName
     *        The friendly device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifySoftwareTokenRequest withFriendlyDeviceName(String friendlyDeviceName) {
        setFriendlyDeviceName(friendlyDeviceName);
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
            sb.append("Session: ").append(getSession()).append(",");
        if (getUserCode() != null)
            sb.append("UserCode: ").append(getUserCode()).append(",");
        if (getFriendlyDeviceName() != null)
            sb.append("FriendlyDeviceName: ").append(getFriendlyDeviceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifySoftwareTokenRequest == false)
            return false;
        VerifySoftwareTokenRequest other = (VerifySoftwareTokenRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getUserCode() == null ^ this.getUserCode() == null)
            return false;
        if (other.getUserCode() != null && other.getUserCode().equals(this.getUserCode()) == false)
            return false;
        if (other.getFriendlyDeviceName() == null ^ this.getFriendlyDeviceName() == null)
            return false;
        if (other.getFriendlyDeviceName() != null && other.getFriendlyDeviceName().equals(this.getFriendlyDeviceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        hashCode = prime * hashCode + ((getFriendlyDeviceName() == null) ? 0 : getFriendlyDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public VerifySoftwareTokenRequest clone() {
        return (VerifySoftwareTokenRequest) super.clone();
    }

}
