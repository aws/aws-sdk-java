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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
 * </p>
 */
public class CreateAuthorizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * [Required] The type of the authorizer.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of the Cognito Your User Pool authorizer's provider ARNs.
     * </p>
     */
    private java.util.List<String> providerARNs;
    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * </p>
     */
    private String authorizerUri;
    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any.
     * </p>
     */
    private String authorizerCredentials;
    /**
     * <p>
     * [Required] The source of the identity in an incoming request.
     * </p>
     */
    private String identitySource;
    /**
     * <p>
     * A validation expression for the incoming identity.
     * </p>
     */
    private String identityValidationExpression;
    /**
     * <p>
     * The TTL of cached authorizer results.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier under which the <a>Authorizer</a> will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @param name
     *        [Required] The name of the authorizer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @return [Required] The name of the authorizer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @param name
     *        [Required] The name of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * [Required] The type of the authorizer.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer.
     * @see AuthorizerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * [Required] The type of the authorizer.
     * </p>
     * 
     * @return [Required] The type of the authorizer.
     * @see AuthorizerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * [Required] The type of the authorizer.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public CreateAuthorizerRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * [Required] The type of the authorizer.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer.
     * @see AuthorizerType
     */

    public void setType(AuthorizerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * [Required] The type of the authorizer.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizerType
     */

    public CreateAuthorizerRequest withType(AuthorizerType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A list of the Cognito Your User Pool authorizer's provider ARNs.
     * </p>
     * 
     * @return A list of the Cognito Your User Pool authorizer's provider ARNs.
     */

    public java.util.List<String> getProviderARNs() {
        return providerARNs;
    }

    /**
     * <p>
     * A list of the Cognito Your User Pool authorizer's provider ARNs.
     * </p>
     * 
     * @param providerARNs
     *        A list of the Cognito Your User Pool authorizer's provider ARNs.
     */

    public void setProviderARNs(java.util.Collection<String> providerARNs) {
        if (providerARNs == null) {
            this.providerARNs = null;
            return;
        }

        this.providerARNs = new java.util.ArrayList<String>(providerARNs);
    }

    /**
     * <p>
     * A list of the Cognito Your User Pool authorizer's provider ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviderARNs(java.util.Collection)} or {@link #withProviderARNs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param providerARNs
     *        A list of the Cognito Your User Pool authorizer's provider ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withProviderARNs(String... providerARNs) {
        if (this.providerARNs == null) {
            setProviderARNs(new java.util.ArrayList<String>(providerARNs.length));
        }
        for (String ele : providerARNs) {
            this.providerARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Cognito Your User Pool authorizer's provider ARNs.
     * </p>
     * 
     * @param providerARNs
     *        A list of the Cognito Your User Pool authorizer's provider ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withProviderARNs(java.util.Collection<String> providerARNs) {
        setProviderARNs(providerARNs);
        return this;
    }

    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     * </p>
     * 
     * @param authType
     *        Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     * </p>
     * 
     * @return Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     * </p>
     * 
     * @param authType
     *        Optional customer-defined field, used in Swagger imports/exports. Has no functional impact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * </p>
     * 
     * @param authorizerUri
     *        [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     */

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * </p>
     * 
     * @return [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     */

    public String getAuthorizerUri() {
        return this.authorizerUri;
    }

    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * </p>
     * 
     * @param authorizerUri
     *        [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withAuthorizerUri(String authorizerUri) {
        setAuthorizerUri(authorizerUri);
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any.
     * </p>
     * 
     * @param authorizerCredentials
     *        Specifies the credentials required for the authorizer, if any.
     */

    public void setAuthorizerCredentials(String authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any.
     * </p>
     * 
     * @return Specifies the credentials required for the authorizer, if any.
     */

    public String getAuthorizerCredentials() {
        return this.authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any.
     * </p>
     * 
     * @param authorizerCredentials
     *        Specifies the credentials required for the authorizer, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withAuthorizerCredentials(String authorizerCredentials) {
        setAuthorizerCredentials(authorizerCredentials);
        return this;
    }

    /**
     * <p>
     * [Required] The source of the identity in an incoming request.
     * </p>
     * 
     * @param identitySource
     *        [Required] The source of the identity in an incoming request.
     */

    public void setIdentitySource(String identitySource) {
        this.identitySource = identitySource;
    }

    /**
     * <p>
     * [Required] The source of the identity in an incoming request.
     * </p>
     * 
     * @return [Required] The source of the identity in an incoming request.
     */

    public String getIdentitySource() {
        return this.identitySource;
    }

    /**
     * <p>
     * [Required] The source of the identity in an incoming request.
     * </p>
     * 
     * @param identitySource
     *        [Required] The source of the identity in an incoming request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withIdentitySource(String identitySource) {
        setIdentitySource(identitySource);
        return this;
    }

    /**
     * <p>
     * A validation expression for the incoming identity.
     * </p>
     * 
     * @param identityValidationExpression
     *        A validation expression for the incoming identity.
     */

    public void setIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity.
     * </p>
     * 
     * @return A validation expression for the incoming identity.
     */

    public String getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity.
     * </p>
     * 
     * @param identityValidationExpression
     *        A validation expression for the incoming identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withIdentityValidationExpression(String identityValidationExpression) {
        setIdentityValidationExpression(identityValidationExpression);
        return this;
    }

    /**
     * <p>
     * The TTL of cached authorizer results.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The TTL of cached authorizer results.
     */

    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL of cached authorizer results.
     * </p>
     * 
     * @return The TTL of cached authorizer results.
     */

    public Integer getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL of cached authorizer results.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The TTL of cached authorizer results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAuthorizerRequest withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        setAuthorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getProviderARNs() != null)
            sb.append("ProviderARNs: " + getProviderARNs() + ",");
        if (getAuthType() != null)
            sb.append("AuthType: " + getAuthType() + ",");
        if (getAuthorizerUri() != null)
            sb.append("AuthorizerUri: " + getAuthorizerUri() + ",");
        if (getAuthorizerCredentials() != null)
            sb.append("AuthorizerCredentials: " + getAuthorizerCredentials() + ",");
        if (getIdentitySource() != null)
            sb.append("IdentitySource: " + getIdentitySource() + ",");
        if (getIdentityValidationExpression() != null)
            sb.append("IdentityValidationExpression: " + getIdentityValidationExpression() + ",");
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("AuthorizerResultTtlInSeconds: " + getAuthorizerResultTtlInSeconds());
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
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProviderARNs() == null ^ this.getProviderARNs() == null)
            return false;
        if (other.getProviderARNs() != null && other.getProviderARNs().equals(this.getProviderARNs()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getAuthorizerCredentials() == null ^ this.getAuthorizerCredentials() == null)
            return false;
        if (other.getAuthorizerCredentials() != null && other.getAuthorizerCredentials().equals(this.getAuthorizerCredentials()) == false)
            return false;
        if (other.getIdentitySource() == null ^ this.getIdentitySource() == null)
            return false;
        if (other.getIdentitySource() != null && other.getIdentitySource().equals(this.getIdentitySource()) == false)
            return false;
        if (other.getIdentityValidationExpression() == null ^ this.getIdentityValidationExpression() == null)
            return false;
        if (other.getIdentityValidationExpression() != null && other.getIdentityValidationExpression().equals(this.getIdentityValidationExpression()) == false)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() == null ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null && other.getAuthorizerResultTtlInSeconds().equals(this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProviderARNs() == null) ? 0 : getProviderARNs().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerCredentials() == null) ? 0 : getAuthorizerCredentials().hashCode());
        hashCode = prime * hashCode + ((getIdentitySource() == null) ? 0 : getIdentitySource().hashCode());
        hashCode = prime * hashCode + ((getIdentityValidationExpression() == null) ? 0 : getIdentityValidationExpression().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerResultTtlInSeconds() == null) ? 0 : getAuthorizerResultTtlInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CreateAuthorizerRequest clone() {
        return (CreateAuthorizerRequest) super.clone();
    }
}
