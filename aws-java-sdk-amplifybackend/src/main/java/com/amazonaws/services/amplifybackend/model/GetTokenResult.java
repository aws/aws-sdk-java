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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The one-time challenge code for authenticating into the Amplify Admin UI.
     * </p>
     */
    private String challengeCode;
    /**
     * <p>
     * A unique ID provided when creating a new challenge token.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The expiry time for the one-time generated token code.
     * </p>
     */
    private String ttl;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTokenResult withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The one-time challenge code for authenticating into the Amplify Admin UI.
     * </p>
     * 
     * @param challengeCode
     *        The one-time challenge code for authenticating into the Amplify Admin UI.
     */

    public void setChallengeCode(String challengeCode) {
        this.challengeCode = challengeCode;
    }

    /**
     * <p>
     * The one-time challenge code for authenticating into the Amplify Admin UI.
     * </p>
     * 
     * @return The one-time challenge code for authenticating into the Amplify Admin UI.
     */

    public String getChallengeCode() {
        return this.challengeCode;
    }

    /**
     * <p>
     * The one-time challenge code for authenticating into the Amplify Admin UI.
     * </p>
     * 
     * @param challengeCode
     *        The one-time challenge code for authenticating into the Amplify Admin UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTokenResult withChallengeCode(String challengeCode) {
        setChallengeCode(challengeCode);
        return this;
    }

    /**
     * <p>
     * A unique ID provided when creating a new challenge token.
     * </p>
     * 
     * @param sessionId
     *        A unique ID provided when creating a new challenge token.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique ID provided when creating a new challenge token.
     * </p>
     * 
     * @return A unique ID provided when creating a new challenge token.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * A unique ID provided when creating a new challenge token.
     * </p>
     * 
     * @param sessionId
     *        A unique ID provided when creating a new challenge token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTokenResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The expiry time for the one-time generated token code.
     * </p>
     * 
     * @param ttl
     *        The expiry time for the one-time generated token code.
     */

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The expiry time for the one-time generated token code.
     * </p>
     * 
     * @return The expiry time for the one-time generated token code.
     */

    public String getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The expiry time for the one-time generated token code.
     * </p>
     * 
     * @param ttl
     *        The expiry time for the one-time generated token code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTokenResult withTtl(String ttl) {
        setTtl(ttl);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getChallengeCode() != null)
            sb.append("ChallengeCode: ").append(getChallengeCode()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTokenResult == false)
            return false;
        GetTokenResult other = (GetTokenResult) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getChallengeCode() == null ^ this.getChallengeCode() == null)
            return false;
        if (other.getChallengeCode() != null && other.getChallengeCode().equals(this.getChallengeCode()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getChallengeCode() == null) ? 0 : getChallengeCode().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        return hashCode;
    }

    @Override
    public GetTokenResult clone() {
        try {
            return (GetTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
