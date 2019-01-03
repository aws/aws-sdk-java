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

/**
 * <p>
 * The response to respond to the authentication challenge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RespondToAuthChallenge" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RespondToAuthChallengeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     */
    private String challengeName;
    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the or API call
     * determines that the caller needs to go through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     */
    private String session;
    /**
     * <p>
     * The challenge parameters. For more information, see .
     * </p>
     */
    private java.util.Map<String, String> challengeParameters;
    /**
     * <p>
     * The result returned by the server in response to the request to respond to the authentication challenge.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @return The challenge name. For more information, see .
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public RespondToAuthChallengeResult withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        withChallengeName(challengeName);
    }

    /**
     * <p>
     * The challenge name. For more information, see .
     * </p>
     * 
     * @param challengeName
     *        The challenge name. For more information, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public RespondToAuthChallengeResult withChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the or API call
     * determines that the caller needs to go through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If the or API
     *        call determines that the caller needs to go through another challenge, they return a session with other
     *        challenge parameters. This session should be passed as it is to the next
     *        <code>RespondToAuthChallenge</code> API call.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the or API call
     * determines that the caller needs to go through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @return The session which should be passed both ways in challenge-response calls to the service. If the or API
     *         call determines that the caller needs to go through another challenge, they return a session with other
     *         challenge parameters. This session should be passed as it is to the next
     *         <code>RespondToAuthChallenge</code> API call.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls to the service. If the or API call
     * determines that the caller needs to go through another challenge, they return a session with other challenge
     * parameters. This session should be passed as it is to the next <code>RespondToAuthChallenge</code> API call.
     * </p>
     * 
     * @param session
     *        The session which should be passed both ways in challenge-response calls to the service. If the or API
     *        call determines that the caller needs to go through another challenge, they return a session with other
     *        challenge parameters. This session should be passed as it is to the next
     *        <code>RespondToAuthChallenge</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeResult withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The challenge parameters. For more information, see .
     * </p>
     * 
     * @return The challenge parameters. For more information, see .
     */

    public java.util.Map<String, String> getChallengeParameters() {
        return challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters. For more information, see .
     * </p>
     * 
     * @param challengeParameters
     *        The challenge parameters. For more information, see .
     */

    public void setChallengeParameters(java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters. For more information, see .
     * </p>
     * 
     * @param challengeParameters
     *        The challenge parameters. For more information, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeResult withChallengeParameters(java.util.Map<String, String> challengeParameters) {
        setChallengeParameters(challengeParameters);
        return this;
    }

    public RespondToAuthChallengeResult addChallengeParametersEntry(String key, String value) {
        if (null == this.challengeParameters) {
            this.challengeParameters = new java.util.HashMap<String, String>();
        }
        if (this.challengeParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.challengeParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChallengeParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeResult clearChallengeParametersEntries() {
        this.challengeParameters = null;
        return this;
    }

    /**
     * <p>
     * The result returned by the server in response to the request to respond to the authentication challenge.
     * </p>
     * 
     * @param authenticationResult
     *        The result returned by the server in response to the request to respond to the authentication challenge.
     */

    public void setAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * The result returned by the server in response to the request to respond to the authentication challenge.
     * </p>
     * 
     * @return The result returned by the server in response to the request to respond to the authentication challenge.
     */

    public AuthenticationResultType getAuthenticationResult() {
        return this.authenticationResult;
    }

    /**
     * <p>
     * The result returned by the server in response to the request to respond to the authentication challenge.
     * </p>
     * 
     * @param authenticationResult
     *        The result returned by the server in response to the request to respond to the authentication challenge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondToAuthChallengeResult withAuthenticationResult(AuthenticationResultType authenticationResult) {
        setAuthenticationResult(authenticationResult);
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
        if (getChallengeName() != null)
            sb.append("ChallengeName: ").append(getChallengeName()).append(",");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getChallengeParameters() != null)
            sb.append("ChallengeParameters: ").append(getChallengeParameters()).append(",");
        if (getAuthenticationResult() != null)
            sb.append("AuthenticationResult: ").append(getAuthenticationResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RespondToAuthChallengeResult == false)
            return false;
        RespondToAuthChallengeResult other = (RespondToAuthChallengeResult) obj;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getChallengeParameters() == null ^ this.getChallengeParameters() == null)
            return false;
        if (other.getChallengeParameters() != null && other.getChallengeParameters().equals(this.getChallengeParameters()) == false)
            return false;
        if (other.getAuthenticationResult() == null ^ this.getAuthenticationResult() == null)
            return false;
        if (other.getAuthenticationResult() != null && other.getAuthenticationResult().equals(this.getAuthenticationResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getChallengeParameters() == null) ? 0 : getChallengeParameters().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationResult() == null) ? 0 : getAuthenticationResult().hashCode());
        return hashCode;
    }

    @Override
    public RespondToAuthChallengeResult clone() {
        try {
            return (RespondToAuthChallengeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
