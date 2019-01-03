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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAuthorizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The authorizer name.
     * </p>
     */
    private String authorizerName;
    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     */
    private String authorizerFunctionArn;
    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP headers.
     * </p>
     */
    private String tokenKeyName;
    /**
     * <p>
     * The public keys used to verify the digital signature returned by your custom authentication service.
     * </p>
     */
    private java.util.Map<String, String> tokenSigningPublicKeys;
    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The authorizer name.
     * </p>
     * 
     * @param authorizerName
     *        The authorizer name.
     */

    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * 
     * @return The authorizer name.
     */

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * 
     * @param authorizerName
     *        The authorizer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withAuthorizerName(String authorizerName) {
        setAuthorizerName(authorizerName);
        return this;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * 
     * @param authorizerFunctionArn
     *        The ARN of the authorizer's Lambda function.
     */

    public void setAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * 
     * @return The ARN of the authorizer's Lambda function.
     */

    public String getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * 
     * @param authorizerFunctionArn
     *        The ARN of the authorizer's Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withAuthorizerFunctionArn(String authorizerFunctionArn) {
        setAuthorizerFunctionArn(authorizerFunctionArn);
        return this;
    }

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP headers.
     * </p>
     * 
     * @param tokenKeyName
     *        The name of the token key used to extract the token from the HTTP headers.
     */

    public void setTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
    }

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP headers.
     * </p>
     * 
     * @return The name of the token key used to extract the token from the HTTP headers.
     */

    public String getTokenKeyName() {
        return this.tokenKeyName;
    }

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP headers.
     * </p>
     * 
     * @param tokenKeyName
     *        The name of the token key used to extract the token from the HTTP headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withTokenKeyName(String tokenKeyName) {
        setTokenKeyName(tokenKeyName);
        return this;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your custom authentication service.
     * </p>
     * 
     * @return The public keys used to verify the digital signature returned by your custom authentication service.
     */

    public java.util.Map<String, String> getTokenSigningPublicKeys() {
        return tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your custom authentication service.
     * </p>
     * 
     * @param tokenSigningPublicKeys
     *        The public keys used to verify the digital signature returned by your custom authentication service.
     */

    public void setTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your custom authentication service.
     * </p>
     * 
     * @param tokenSigningPublicKeys
     *        The public keys used to verify the digital signature returned by your custom authentication service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        setTokenSigningPublicKeys(tokenSigningPublicKeys);
        return this;
    }

    public CreateAuthorizerRequest addTokenSigningPublicKeysEntry(String key, String value) {
        if (null == this.tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = new java.util.HashMap<String, String>();
        }
        if (this.tokenSigningPublicKeys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tokenSigningPublicKeys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TokenSigningPublicKeys.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest clearTokenSigningPublicKeysEntries() {
        this.tokenSigningPublicKeys = null;
        return this;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * 
     * @param status
     *        The status of the create authorizer request.
     * @see AuthorizerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * 
     * @return The status of the create authorizer request.
     * @see AuthorizerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * 
     * @param status
     *        The status of the create authorizer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerStatus
     */

    public CreateAuthorizerRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * 
     * @param status
     *        The status of the create authorizer request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerStatus
     */

    public CreateAuthorizerRequest withStatus(AuthorizerStatus status) {
        this.status = status.toString();
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
        if (getAuthorizerName() != null)
            sb.append("AuthorizerName: ").append(getAuthorizerName()).append(",");
        if (getAuthorizerFunctionArn() != null)
            sb.append("AuthorizerFunctionArn: ").append(getAuthorizerFunctionArn()).append(",");
        if (getTokenKeyName() != null)
            sb.append("TokenKeyName: ").append(getTokenKeyName()).append(",");
        if (getTokenSigningPublicKeys() != null)
            sb.append("TokenSigningPublicKeys: ").append(getTokenSigningPublicKeys()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAuthorizerRequest == false)
            return false;
        CreateAuthorizerRequest other = (CreateAuthorizerRequest) obj;
        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getAuthorizerFunctionArn() == null ^ this.getAuthorizerFunctionArn() == null)
            return false;
        if (other.getAuthorizerFunctionArn() != null && other.getAuthorizerFunctionArn().equals(this.getAuthorizerFunctionArn()) == false)
            return false;
        if (other.getTokenKeyName() == null ^ this.getTokenKeyName() == null)
            return false;
        if (other.getTokenKeyName() != null && other.getTokenKeyName().equals(this.getTokenKeyName()) == false)
            return false;
        if (other.getTokenSigningPublicKeys() == null ^ this.getTokenSigningPublicKeys() == null)
            return false;
        if (other.getTokenSigningPublicKeys() != null && other.getTokenSigningPublicKeys().equals(this.getTokenSigningPublicKeys()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerFunctionArn() == null) ? 0 : getAuthorizerFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getTokenKeyName() == null) ? 0 : getTokenKeyName().hashCode());
        hashCode = prime * hashCode + ((getTokenSigningPublicKeys() == null) ? 0 : getTokenSigningPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateAuthorizerRequest clone() {
        return (CreateAuthorizerRequest) super.clone();
    }

}
