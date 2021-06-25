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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authentication settings for accessing provisioned data models in your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/BackendAPIAppSyncAuthSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendAPIAppSyncAuthSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your data
     * models.
     * </p>
     */
    private String cognitoUserPoolId;
    /**
     * <p>
     * The API key description for API_KEY, if it was used as an authentication mechanism to access your data models.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data
     * models.
     * </p>
     */
    private Double expirationTime;
    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     */
    private String openIDAuthTTL;
    /**
     * <p>
     * The clientID for openID, if openID was used as an authentication setting to access your data models.
     * </p>
     */
    private String openIDClientId;
    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     */
    private String openIDIatTTL;
    /**
     * <p>
     * The openID issuer URL, if openID was used as an authentication setting to access your data models.
     * </p>
     */
    private String openIDIssueURL;
    /**
     * <p>
     * The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     * </p>
     */
    private String openIDProviderName;

    /**
     * <p>
     * The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your data
     * models.
     * </p>
     * 
     * @param cognitoUserPoolId
     *        The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your
     *        data models.
     */

    public void setCognitoUserPoolId(String cognitoUserPoolId) {
        this.cognitoUserPoolId = cognitoUserPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your data
     * models.
     * </p>
     * 
     * @return The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your
     *         data models.
     */

    public String getCognitoUserPoolId() {
        return this.cognitoUserPoolId;
    }

    /**
     * <p>
     * The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your data
     * models.
     * </p>
     * 
     * @param cognitoUserPoolId
     *        The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your
     *        data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withCognitoUserPoolId(String cognitoUserPoolId) {
        setCognitoUserPoolId(cognitoUserPoolId);
        return this;
    }

    /**
     * <p>
     * The API key description for API_KEY, if it was used as an authentication mechanism to access your data models.
     * </p>
     * 
     * @param description
     *        The API key description for API_KEY, if it was used as an authentication mechanism to access your data
     *        models.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The API key description for API_KEY, if it was used as an authentication mechanism to access your data models.
     * </p>
     * 
     * @return The API key description for API_KEY, if it was used as an authentication mechanism to access your data
     *         models.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The API key description for API_KEY, if it was used as an authentication mechanism to access your data models.
     * </p>
     * 
     * @param description
     *        The API key description for API_KEY, if it was used as an authentication mechanism to access your data
     *        models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data
     * models.
     * </p>
     * 
     * @param expirationTime
     *        The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data
     *        models.
     */

    public void setExpirationTime(Double expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data
     * models.
     * </p>
     * 
     * @return The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your
     *         data models.
     */

    public Double getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data
     * models.
     * </p>
     * 
     * @param expirationTime
     *        The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data
     *        models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withExpirationTime(Double expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     * 
     * @param openIDAuthTTL
     *        The expiry time for the OpenID authentication mechanism.
     */

    public void setOpenIDAuthTTL(String openIDAuthTTL) {
        this.openIDAuthTTL = openIDAuthTTL;
    }

    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     * 
     * @return The expiry time for the OpenID authentication mechanism.
     */

    public String getOpenIDAuthTTL() {
        return this.openIDAuthTTL;
    }

    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     * 
     * @param openIDAuthTTL
     *        The expiry time for the OpenID authentication mechanism.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withOpenIDAuthTTL(String openIDAuthTTL) {
        setOpenIDAuthTTL(openIDAuthTTL);
        return this;
    }

    /**
     * <p>
     * The clientID for openID, if openID was used as an authentication setting to access your data models.
     * </p>
     * 
     * @param openIDClientId
     *        The clientID for openID, if openID was used as an authentication setting to access your data models.
     */

    public void setOpenIDClientId(String openIDClientId) {
        this.openIDClientId = openIDClientId;
    }

    /**
     * <p>
     * The clientID for openID, if openID was used as an authentication setting to access your data models.
     * </p>
     * 
     * @return The clientID for openID, if openID was used as an authentication setting to access your data models.
     */

    public String getOpenIDClientId() {
        return this.openIDClientId;
    }

    /**
     * <p>
     * The clientID for openID, if openID was used as an authentication setting to access your data models.
     * </p>
     * 
     * @param openIDClientId
     *        The clientID for openID, if openID was used as an authentication setting to access your data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withOpenIDClientId(String openIDClientId) {
        setOpenIDClientId(openIDClientId);
        return this;
    }

    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     * 
     * @param openIDIatTTL
     *        The expiry time for the OpenID authentication mechanism.
     */

    public void setOpenIDIatTTL(String openIDIatTTL) {
        this.openIDIatTTL = openIDIatTTL;
    }

    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     * 
     * @return The expiry time for the OpenID authentication mechanism.
     */

    public String getOpenIDIatTTL() {
        return this.openIDIatTTL;
    }

    /**
     * <p>
     * The expiry time for the OpenID authentication mechanism.
     * </p>
     * 
     * @param openIDIatTTL
     *        The expiry time for the OpenID authentication mechanism.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withOpenIDIatTTL(String openIDIatTTL) {
        setOpenIDIatTTL(openIDIatTTL);
        return this;
    }

    /**
     * <p>
     * The openID issuer URL, if openID was used as an authentication setting to access your data models.
     * </p>
     * 
     * @param openIDIssueURL
     *        The openID issuer URL, if openID was used as an authentication setting to access your data models.
     */

    public void setOpenIDIssueURL(String openIDIssueURL) {
        this.openIDIssueURL = openIDIssueURL;
    }

    /**
     * <p>
     * The openID issuer URL, if openID was used as an authentication setting to access your data models.
     * </p>
     * 
     * @return The openID issuer URL, if openID was used as an authentication setting to access your data models.
     */

    public String getOpenIDIssueURL() {
        return this.openIDIssueURL;
    }

    /**
     * <p>
     * The openID issuer URL, if openID was used as an authentication setting to access your data models.
     * </p>
     * 
     * @param openIDIssueURL
     *        The openID issuer URL, if openID was used as an authentication setting to access your data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withOpenIDIssueURL(String openIDIssueURL) {
        setOpenIDIssueURL(openIDIssueURL);
        return this;
    }

    /**
     * <p>
     * The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     * </p>
     * 
     * @param openIDProviderName
     *        The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     */

    public void setOpenIDProviderName(String openIDProviderName) {
        this.openIDProviderName = openIDProviderName;
    }

    /**
     * <p>
     * The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     * </p>
     * 
     * @return The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     */

    public String getOpenIDProviderName() {
        return this.openIDProviderName;
    }

    /**
     * <p>
     * The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     * </p>
     * 
     * @param openIDProviderName
     *        The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAPIAppSyncAuthSettings withOpenIDProviderName(String openIDProviderName) {
        setOpenIDProviderName(openIDProviderName);
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
        if (getCognitoUserPoolId() != null)
            sb.append("CognitoUserPoolId: ").append(getCognitoUserPoolId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getOpenIDAuthTTL() != null)
            sb.append("OpenIDAuthTTL: ").append(getOpenIDAuthTTL()).append(",");
        if (getOpenIDClientId() != null)
            sb.append("OpenIDClientId: ").append(getOpenIDClientId()).append(",");
        if (getOpenIDIatTTL() != null)
            sb.append("OpenIDIatTTL: ").append(getOpenIDIatTTL()).append(",");
        if (getOpenIDIssueURL() != null)
            sb.append("OpenIDIssueURL: ").append(getOpenIDIssueURL()).append(",");
        if (getOpenIDProviderName() != null)
            sb.append("OpenIDProviderName: ").append(getOpenIDProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendAPIAppSyncAuthSettings == false)
            return false;
        BackendAPIAppSyncAuthSettings other = (BackendAPIAppSyncAuthSettings) obj;
        if (other.getCognitoUserPoolId() == null ^ this.getCognitoUserPoolId() == null)
            return false;
        if (other.getCognitoUserPoolId() != null && other.getCognitoUserPoolId().equals(this.getCognitoUserPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getOpenIDAuthTTL() == null ^ this.getOpenIDAuthTTL() == null)
            return false;
        if (other.getOpenIDAuthTTL() != null && other.getOpenIDAuthTTL().equals(this.getOpenIDAuthTTL()) == false)
            return false;
        if (other.getOpenIDClientId() == null ^ this.getOpenIDClientId() == null)
            return false;
        if (other.getOpenIDClientId() != null && other.getOpenIDClientId().equals(this.getOpenIDClientId()) == false)
            return false;
        if (other.getOpenIDIatTTL() == null ^ this.getOpenIDIatTTL() == null)
            return false;
        if (other.getOpenIDIatTTL() != null && other.getOpenIDIatTTL().equals(this.getOpenIDIatTTL()) == false)
            return false;
        if (other.getOpenIDIssueURL() == null ^ this.getOpenIDIssueURL() == null)
            return false;
        if (other.getOpenIDIssueURL() != null && other.getOpenIDIssueURL().equals(this.getOpenIDIssueURL()) == false)
            return false;
        if (other.getOpenIDProviderName() == null ^ this.getOpenIDProviderName() == null)
            return false;
        if (other.getOpenIDProviderName() != null && other.getOpenIDProviderName().equals(this.getOpenIDProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCognitoUserPoolId() == null) ? 0 : getCognitoUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getOpenIDAuthTTL() == null) ? 0 : getOpenIDAuthTTL().hashCode());
        hashCode = prime * hashCode + ((getOpenIDClientId() == null) ? 0 : getOpenIDClientId().hashCode());
        hashCode = prime * hashCode + ((getOpenIDIatTTL() == null) ? 0 : getOpenIDIatTTL().hashCode());
        hashCode = prime * hashCode + ((getOpenIDIssueURL() == null) ? 0 : getOpenIDIssueURL().hashCode());
        hashCode = prime * hashCode + ((getOpenIDProviderName() == null) ? 0 : getOpenIDProviderName().hashCode());
        return hashCode;
    }

    @Override
    public BackendAPIAppSyncAuthSettings clone() {
        try {
            return (BackendAPIAppSyncAuthSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.BackendAPIAppSyncAuthSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
