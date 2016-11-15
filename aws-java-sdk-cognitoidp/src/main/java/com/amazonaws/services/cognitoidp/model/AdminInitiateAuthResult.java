/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Initiates the authentication response, as an administrator.
 * </p>
 */
public class AdminInitiateAuthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the challenge.
     * </p>
     */
    private String challengeName;
    /**
     * <p>
     * The session.
     * </p>
     */
    private String session;
    /**
     * <p>
     * The challenge parameters.
     * </p>
     */
    private java.util.Map<String, String> challengeParameters;
    /**
     * <p>
     * The result of the authentication response.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * <p>
     * The name of the challenge.
     * </p>
     * 
     * @param challengeName
     *        The name of the challenge.
     * @see ChallengeNameType
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The name of the challenge.
     * </p>
     * 
     * @return The name of the challenge.
     * @see ChallengeNameType
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The name of the challenge.
     * </p>
     * 
     * @param challengeName
     *        The name of the challenge.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminInitiateAuthResult withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The name of the challenge.
     * </p>
     * 
     * @param challengeName
     *        The name of the challenge.
     * @see ChallengeNameType
     */

    public void setChallengeName(ChallengeNameType challengeName) {
        this.challengeName = challengeName.toString();
    }

    /**
     * <p>
     * The name of the challenge.
     * </p>
     * 
     * @param challengeName
     *        The name of the challenge.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeNameType
     */

    public AdminInitiateAuthResult withChallengeName(ChallengeNameType challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The session.
     * </p>
     * 
     * @param session
     *        The session.
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session.
     * </p>
     * 
     * @return The session.
     */

    public String getSession() {
        return this.session;
    }

    /**
     * <p>
     * The session.
     * </p>
     * 
     * @param session
     *        The session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminInitiateAuthResult withSession(String session) {
        setSession(session);
        return this;
    }

    /**
     * <p>
     * The challenge parameters.
     * </p>
     * 
     * @return The challenge parameters.
     */

    public java.util.Map<String, String> getChallengeParameters() {
        return challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters.
     * </p>
     * 
     * @param challengeParameters
     *        The challenge parameters.
     */

    public void setChallengeParameters(java.util.Map<String, String> challengeParameters) {
        this.challengeParameters = challengeParameters;
    }

    /**
     * <p>
     * The challenge parameters.
     * </p>
     * 
     * @param challengeParameters
     *        The challenge parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminInitiateAuthResult withChallengeParameters(java.util.Map<String, String> challengeParameters) {
        setChallengeParameters(challengeParameters);
        return this;
    }

    public AdminInitiateAuthResult addChallengeParametersEntry(String key, String value) {
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

    public AdminInitiateAuthResult clearChallengeParametersEntries() {
        this.challengeParameters = null;
        return this;
    }

    /**
     * <p>
     * The result of the authentication response.
     * </p>
     * 
     * @param authenticationResult
     *        The result of the authentication response.
     */

    public void setAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * The result of the authentication response.
     * </p>
     * 
     * @return The result of the authentication response.
     */

    public AuthenticationResultType getAuthenticationResult() {
        return this.authenticationResult;
    }

    /**
     * <p>
     * The result of the authentication response.
     * </p>
     * 
     * @param authenticationResult
     *        The result of the authentication response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminInitiateAuthResult withAuthenticationResult(AuthenticationResultType authenticationResult) {
        setAuthenticationResult(authenticationResult);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ChallengeName: " + getChallengeName() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession() + ",");
        if (getChallengeParameters() != null)
            sb.append("ChallengeParameters: " + getChallengeParameters() + ",");
        if (getAuthenticationResult() != null)
            sb.append("AuthenticationResult: " + getAuthenticationResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminInitiateAuthResult == false)
            return false;
        AdminInitiateAuthResult other = (AdminInitiateAuthResult) obj;
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
    public AdminInitiateAuthResult clone() {
        try {
            return (AdminInitiateAuthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
