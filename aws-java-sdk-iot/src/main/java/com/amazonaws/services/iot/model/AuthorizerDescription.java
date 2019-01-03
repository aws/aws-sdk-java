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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorizer description.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizerDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authorizer name.
     * </p>
     */
    private String authorizerName;
    /**
     * <p>
     * The authorizer ARN.
     * </p>
     */
    private String authorizerArn;
    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     */
    private String authorizerFunctionArn;
    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     */
    private String tokenKeyName;
    /**
     * <p>
     * The public keys used to validate the token signature returned by your custom authentication service.
     * </p>
     */
    private java.util.Map<String, String> tokenSigningPublicKeys;
    /**
     * <p>
     * The status of the authorizer.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

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

    public AuthorizerDescription withAuthorizerName(String authorizerName) {
        setAuthorizerName(authorizerName);
        return this;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * 
     * @param authorizerArn
     *        The authorizer ARN.
     */

    public void setAuthorizerArn(String authorizerArn) {
        this.authorizerArn = authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * 
     * @return The authorizer ARN.
     */

    public String getAuthorizerArn() {
        return this.authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * 
     * @param authorizerArn
     *        The authorizer ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerDescription withAuthorizerArn(String authorizerArn) {
        setAuthorizerArn(authorizerArn);
        return this;
    }

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     * 
     * @param authorizerFunctionArn
     *        The authorizer's Lambda function ARN.
     */

    public void setAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
    }

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     * 
     * @return The authorizer's Lambda function ARN.
     */

    public String getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     * 
     * @param authorizerFunctionArn
     *        The authorizer's Lambda function ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerDescription withAuthorizerFunctionArn(String authorizerFunctionArn) {
        setAuthorizerFunctionArn(authorizerFunctionArn);
        return this;
    }

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * 
     * @param tokenKeyName
     *        The key used to extract the token from the HTTP headers.
     */

    public void setTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
    }

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * 
     * @return The key used to extract the token from the HTTP headers.
     */

    public String getTokenKeyName() {
        return this.tokenKeyName;
    }

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * 
     * @param tokenKeyName
     *        The key used to extract the token from the HTTP headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerDescription withTokenKeyName(String tokenKeyName) {
        setTokenKeyName(tokenKeyName);
        return this;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your custom authentication service.
     * </p>
     * 
     * @return The public keys used to validate the token signature returned by your custom authentication service.
     */

    public java.util.Map<String, String> getTokenSigningPublicKeys() {
        return tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your custom authentication service.
     * </p>
     * 
     * @param tokenSigningPublicKeys
     *        The public keys used to validate the token signature returned by your custom authentication service.
     */

    public void setTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your custom authentication service.
     * </p>
     * 
     * @param tokenSigningPublicKeys
     *        The public keys used to validate the token signature returned by your custom authentication service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerDescription withTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        setTokenSigningPublicKeys(tokenSigningPublicKeys);
        return this;
    }

    public AuthorizerDescription addTokenSigningPublicKeysEntry(String key, String value) {
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

    public AuthorizerDescription clearTokenSigningPublicKeysEntries() {
        this.tokenSigningPublicKeys = null;
        return this;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * 
     * @param status
     *        The status of the authorizer.
     * @see AuthorizerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * 
     * @return The status of the authorizer.
     * @see AuthorizerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * 
     * @param status
     *        The status of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerStatus
     */

    public AuthorizerDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * 
     * @param status
     *        The status of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerStatus
     */

    public AuthorizerDescription withStatus(AuthorizerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     * 
     * @param creationDate
     *        The UNIX timestamp of when the authorizer was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     * 
     * @return The UNIX timestamp of when the authorizer was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     * 
     * @param creationDate
     *        The UNIX timestamp of when the authorizer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerDescription withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The UNIX timestamp of when the authorizer was last updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     * 
     * @return The UNIX timestamp of when the authorizer was last updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The UNIX timestamp of when the authorizer was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getAuthorizerArn() != null)
            sb.append("AuthorizerArn: ").append(getAuthorizerArn()).append(",");
        if (getAuthorizerFunctionArn() != null)
            sb.append("AuthorizerFunctionArn: ").append(getAuthorizerFunctionArn()).append(",");
        if (getTokenKeyName() != null)
            sb.append("TokenKeyName: ").append(getTokenKeyName()).append(",");
        if (getTokenSigningPublicKeys() != null)
            sb.append("TokenSigningPublicKeys: ").append(getTokenSigningPublicKeys()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizerDescription == false)
            return false;
        AuthorizerDescription other = (AuthorizerDescription) obj;
        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getAuthorizerArn() == null ^ this.getAuthorizerArn() == null)
            return false;
        if (other.getAuthorizerArn() != null && other.getAuthorizerArn().equals(this.getAuthorizerArn()) == false)
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
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerArn() == null) ? 0 : getAuthorizerArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerFunctionArn() == null) ? 0 : getAuthorizerFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getTokenKeyName() == null) ? 0 : getTokenKeyName().hashCode());
        hashCode = prime * hashCode + ((getTokenSigningPublicKeys() == null) ? 0 : getTokenSigningPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizerDescription clone() {
        try {
            return (AuthorizerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuthorizerDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
