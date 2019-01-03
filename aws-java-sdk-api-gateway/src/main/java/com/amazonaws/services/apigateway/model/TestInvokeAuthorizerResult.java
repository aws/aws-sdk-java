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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response of the test invoke request for a custom <a>Authorizer</a>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestInvokeAuthorizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     * </p>
     */
    private Integer clientStatus;
    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     */
    private String log;
    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     */
    private Long latency;
    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     */
    private String policy;

    private java.util.Map<String, java.util.List<String>> authorization;
    /**
     * <p>
     * The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity claims</a>, with
     * any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
     * </p>
     */
    private java.util.Map<String, String> claims;

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     * </p>
     * 
     * @param clientStatus
     *        The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     */

    public void setClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
    }

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     * </p>
     * 
     * @return The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     */

    public Integer getClientStatus() {
        return this.clientStatus;
    }

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     * </p>
     * 
     * @param clientStatus
     *        The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withClientStatus(Integer clientStatus) {
        setClientStatus(clientStatus);
        return this;
    }

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     * 
     * @param log
     *        The API Gateway execution log for the test authorizer request.
     */

    public void setLog(String log) {
        this.log = log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     * 
     * @return The API Gateway execution log for the test authorizer request.
     */

    public String getLog() {
        return this.log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     * 
     * @param log
     *        The API Gateway execution log for the test authorizer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withLog(String log) {
        setLog(log);
        return this;
    }

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     * 
     * @param latency
     *        The execution latency of the test authorizer request.
     */

    public void setLatency(Long latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     * 
     * @return The execution latency of the test authorizer request.
     */

    public Long getLatency() {
        return this.latency;
    }

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     * 
     * @param latency
     *        The execution latency of the test authorizer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withLatency(Long latency) {
        setLatency(latency);
        return this;
    }

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     * 
     * @param principalId
     *        The principal identity returned by the <a>Authorizer</a>
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     * 
     * @return The principal identity returned by the <a>Authorizer</a>
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     * 
     * @param principalId
     *        The principal identity returned by the <a>Authorizer</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     * 
     * @param policy
     *        The JSON policy document returned by the <a>Authorizer</a>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     * 
     * @return The JSON policy document returned by the <a>Authorizer</a>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     * 
     * @param policy
     *        The JSON policy document returned by the <a>Authorizer</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, java.util.List<String>> getAuthorization() {
        return authorization;
    }

    /**
     * @param authorization
     */

    public void setAuthorization(java.util.Map<String, java.util.List<String>> authorization) {
        this.authorization = authorization;
    }

    /**
     * @param authorization
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withAuthorization(java.util.Map<String, java.util.List<String>> authorization) {
        setAuthorization(authorization);
        return this;
    }

    public TestInvokeAuthorizerResult addAuthorizationEntry(String key, java.util.List<String> value) {
        if (null == this.authorization) {
            this.authorization = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.authorization.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.authorization.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Authorization.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult clearAuthorizationEntries() {
        this.authorization = null;
        return this;
    }

    /**
     * <p>
     * The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity claims</a>, with
     * any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
     * </p>
     * 
     * @return The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity
     *         claims</a>, with any supported custom attributes, returned from the Cognito Your User Pool configured for
     *         the API.
     */

    public java.util.Map<String, String> getClaims() {
        return claims;
    }

    /**
     * <p>
     * The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity claims</a>, with
     * any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
     * </p>
     * 
     * @param claims
     *        The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity
     *        claims</a>, with any supported custom attributes, returned from the Cognito Your User Pool configured for
     *        the API.
     */

    public void setClaims(java.util.Map<String, String> claims) {
        this.claims = claims;
    }

    /**
     * <p>
     * The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity claims</a>, with
     * any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
     * </p>
     * 
     * @param claims
     *        The <a href="https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims">open identity
     *        claims</a>, with any supported custom attributes, returned from the Cognito Your User Pool configured for
     *        the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult withClaims(java.util.Map<String, String> claims) {
        setClaims(claims);
        return this;
    }

    public TestInvokeAuthorizerResult addClaimsEntry(String key, String value) {
        if (null == this.claims) {
            this.claims = new java.util.HashMap<String, String>();
        }
        if (this.claims.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.claims.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Claims.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerResult clearClaimsEntries() {
        this.claims = null;
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
        if (getClientStatus() != null)
            sb.append("ClientStatus: ").append(getClientStatus()).append(",");
        if (getLog() != null)
            sb.append("Log: ").append(getLog()).append(",");
        if (getLatency() != null)
            sb.append("Latency: ").append(getLatency()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getAuthorization() != null)
            sb.append("Authorization: ").append(getAuthorization()).append(",");
        if (getClaims() != null)
            sb.append("Claims: ").append(getClaims());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerResult == false)
            return false;
        TestInvokeAuthorizerResult other = (TestInvokeAuthorizerResult) obj;
        if (other.getClientStatus() == null ^ this.getClientStatus() == null)
            return false;
        if (other.getClientStatus() != null && other.getClientStatus().equals(this.getClientStatus()) == false)
            return false;
        if (other.getLog() == null ^ this.getLog() == null)
            return false;
        if (other.getLog() != null && other.getLog().equals(this.getLog()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getAuthorization() == null ^ this.getAuthorization() == null)
            return false;
        if (other.getAuthorization() != null && other.getAuthorization().equals(this.getAuthorization()) == false)
            return false;
        if (other.getClaims() == null ^ this.getClaims() == null)
            return false;
        if (other.getClaims() != null && other.getClaims().equals(this.getClaims()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientStatus() == null) ? 0 : getClientStatus().hashCode());
        hashCode = prime * hashCode + ((getLog() == null) ? 0 : getLog().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getAuthorization() == null) ? 0 : getAuthorization().hashCode());
        hashCode = prime * hashCode + ((getClaims() == null) ? 0 : getClaims().hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeAuthorizerResult clone() {
        try {
            return (TestInvokeAuthorizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
