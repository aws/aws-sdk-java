/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The identity provider configuration that you gave when the data store was created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/IdentityProviderConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authorization strategy that you selected when you created the data store.
     * </p>
     */
    private String authorizationStrategy;
    /**
     * <p>
     * If you enabled fine-grained authorization when you created the data store.
     * </p>
     */
    private Boolean fineGrainedAuthorizationEnabled;
    /**
     * <p>
     * The JSON metadata elements that you want to use in your identity provider configuration. Required elements are
     * listed based on the launch specification of the SMART application. For more information on all possible elements,
     * see <a href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     * App Launch specification.
     * </p>
     * <p>
     * <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     * </p>
     * <p>
     * <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You must
     * provide at least one grant type option. Valid options are <code>authorization_code</code> and
     * <code>client_credentials</code>.
     * </p>
     * <p>
     * <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     * </p>
     * <p>
     * <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server supports.
     * </p>
     * <p>
     * <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge methods. You
     * must include the <code>S256</code> method in the array of PKCE code challenge methods.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token created by
     * the authorization server.
     * </p>
     */
    private String idpLambdaArn;

    /**
     * <p>
     * The authorization strategy that you selected when you created the data store.
     * </p>
     * 
     * @param authorizationStrategy
     *        The authorization strategy that you selected when you created the data store.
     * @see AuthorizationStrategy
     */

    public void setAuthorizationStrategy(String authorizationStrategy) {
        this.authorizationStrategy = authorizationStrategy;
    }

    /**
     * <p>
     * The authorization strategy that you selected when you created the data store.
     * </p>
     * 
     * @return The authorization strategy that you selected when you created the data store.
     * @see AuthorizationStrategy
     */

    public String getAuthorizationStrategy() {
        return this.authorizationStrategy;
    }

    /**
     * <p>
     * The authorization strategy that you selected when you created the data store.
     * </p>
     * 
     * @param authorizationStrategy
     *        The authorization strategy that you selected when you created the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationStrategy
     */

    public IdentityProviderConfiguration withAuthorizationStrategy(String authorizationStrategy) {
        setAuthorizationStrategy(authorizationStrategy);
        return this;
    }

    /**
     * <p>
     * The authorization strategy that you selected when you created the data store.
     * </p>
     * 
     * @param authorizationStrategy
     *        The authorization strategy that you selected when you created the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationStrategy
     */

    public IdentityProviderConfiguration withAuthorizationStrategy(AuthorizationStrategy authorizationStrategy) {
        this.authorizationStrategy = authorizationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * If you enabled fine-grained authorization when you created the data store.
     * </p>
     * 
     * @param fineGrainedAuthorizationEnabled
     *        If you enabled fine-grained authorization when you created the data store.
     */

    public void setFineGrainedAuthorizationEnabled(Boolean fineGrainedAuthorizationEnabled) {
        this.fineGrainedAuthorizationEnabled = fineGrainedAuthorizationEnabled;
    }

    /**
     * <p>
     * If you enabled fine-grained authorization when you created the data store.
     * </p>
     * 
     * @return If you enabled fine-grained authorization when you created the data store.
     */

    public Boolean getFineGrainedAuthorizationEnabled() {
        return this.fineGrainedAuthorizationEnabled;
    }

    /**
     * <p>
     * If you enabled fine-grained authorization when you created the data store.
     * </p>
     * 
     * @param fineGrainedAuthorizationEnabled
     *        If you enabled fine-grained authorization when you created the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderConfiguration withFineGrainedAuthorizationEnabled(Boolean fineGrainedAuthorizationEnabled) {
        setFineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled);
        return this;
    }

    /**
     * <p>
     * If you enabled fine-grained authorization when you created the data store.
     * </p>
     * 
     * @return If you enabled fine-grained authorization when you created the data store.
     */

    public Boolean isFineGrainedAuthorizationEnabled() {
        return this.fineGrainedAuthorizationEnabled;
    }

    /**
     * <p>
     * The JSON metadata elements that you want to use in your identity provider configuration. Required elements are
     * listed based on the launch specification of the SMART application. For more information on all possible elements,
     * see <a href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     * App Launch specification.
     * </p>
     * <p>
     * <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     * </p>
     * <p>
     * <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You must
     * provide at least one grant type option. Valid options are <code>authorization_code</code> and
     * <code>client_credentials</code>.
     * </p>
     * <p>
     * <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     * </p>
     * <p>
     * <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server supports.
     * </p>
     * <p>
     * <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge methods. You
     * must include the <code>S256</code> method in the array of PKCE code challenge methods.
     * </p>
     * 
     * @param metadata
     *        The JSON metadata elements that you want to use in your identity provider configuration. Required elements
     *        are listed based on the launch specification of the SMART application. For more information on all
     *        possible elements, see <a
     *        href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     *        App Launch specification.</p>
     *        <p>
     *        <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     *        </p>
     *        <p>
     *        <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You
     *        must provide at least one grant type option. Valid options are <code>authorization_code</code> and
     *        <code>client_credentials</code>.
     *        </p>
     *        <p>
     *        <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     *        </p>
     *        <p>
     *        <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server
     *        supports.
     *        </p>
     *        <p>
     *        <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge
     *        methods. You must include the <code>S256</code> method in the array of PKCE code challenge methods.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The JSON metadata elements that you want to use in your identity provider configuration. Required elements are
     * listed based on the launch specification of the SMART application. For more information on all possible elements,
     * see <a href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     * App Launch specification.
     * </p>
     * <p>
     * <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     * </p>
     * <p>
     * <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You must
     * provide at least one grant type option. Valid options are <code>authorization_code</code> and
     * <code>client_credentials</code>.
     * </p>
     * <p>
     * <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     * </p>
     * <p>
     * <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server supports.
     * </p>
     * <p>
     * <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge methods. You
     * must include the <code>S256</code> method in the array of PKCE code challenge methods.
     * </p>
     * 
     * @return The JSON metadata elements that you want to use in your identity provider configuration. Required
     *         elements are listed based on the launch specification of the SMART application. For more information on
     *         all possible elements, see <a
     *         href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     *         App Launch specification.</p>
     *         <p>
     *         <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     *         </p>
     *         <p>
     *         <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You
     *         must provide at least one grant type option. Valid options are <code>authorization_code</code> and
     *         <code>client_credentials</code>.
     *         </p>
     *         <p>
     *         <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     *         </p>
     *         <p>
     *         <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server
     *         supports.
     *         </p>
     *         <p>
     *         <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge
     *         methods. You must include the <code>S256</code> method in the array of PKCE code challenge methods.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The JSON metadata elements that you want to use in your identity provider configuration. Required elements are
     * listed based on the launch specification of the SMART application. For more information on all possible elements,
     * see <a href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     * App Launch specification.
     * </p>
     * <p>
     * <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     * </p>
     * <p>
     * <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You must
     * provide at least one grant type option. Valid options are <code>authorization_code</code> and
     * <code>client_credentials</code>.
     * </p>
     * <p>
     * <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     * </p>
     * <p>
     * <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server supports.
     * </p>
     * <p>
     * <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge methods. You
     * must include the <code>S256</code> method in the array of PKCE code challenge methods.
     * </p>
     * 
     * @param metadata
     *        The JSON metadata elements that you want to use in your identity provider configuration. Required elements
     *        are listed based on the launch specification of the SMART application. For more information on all
     *        possible elements, see <a
     *        href="https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata">Metadata</a> in SMART's
     *        App Launch specification.</p>
     *        <p>
     *        <code>authorization_endpoint</code>: The URL to the OAuth2 authorization endpoint.
     *        </p>
     *        <p>
     *        <code>grant_types_supported</code>: An array of grant types that are supported at the token endpoint. You
     *        must provide at least one grant type option. Valid options are <code>authorization_code</code> and
     *        <code>client_credentials</code>.
     *        </p>
     *        <p>
     *        <code>token_endpoint</code>: The URL to the OAuth2 token endpoint.
     *        </p>
     *        <p>
     *        <code>capabilities</code>: An array of strings of the SMART capabilities that the authorization server
     *        supports.
     *        </p>
     *        <p>
     *        <code>code_challenge_methods_supported</code>: An array of strings of supported PKCE code challenge
     *        methods. You must include the <code>S256</code> method in the array of PKCE code challenge methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderConfiguration withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token created by
     * the authorization server.
     * </p>
     * 
     * @param idpLambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token
     *        created by the authorization server.
     */

    public void setIdpLambdaArn(String idpLambdaArn) {
        this.idpLambdaArn = idpLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token created by
     * the authorization server.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token
     *         created by the authorization server.
     */

    public String getIdpLambdaArn() {
        return this.idpLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token created by
     * the authorization server.
     * </p>
     * 
     * @param idpLambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the access token
     *        created by the authorization server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderConfiguration withIdpLambdaArn(String idpLambdaArn) {
        setIdpLambdaArn(idpLambdaArn);
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
        if (getAuthorizationStrategy() != null)
            sb.append("AuthorizationStrategy: ").append(getAuthorizationStrategy()).append(",");
        if (getFineGrainedAuthorizationEnabled() != null)
            sb.append("FineGrainedAuthorizationEnabled: ").append(getFineGrainedAuthorizationEnabled()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getIdpLambdaArn() != null)
            sb.append("IdpLambdaArn: ").append(getIdpLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderConfiguration == false)
            return false;
        IdentityProviderConfiguration other = (IdentityProviderConfiguration) obj;
        if (other.getAuthorizationStrategy() == null ^ this.getAuthorizationStrategy() == null)
            return false;
        if (other.getAuthorizationStrategy() != null && other.getAuthorizationStrategy().equals(this.getAuthorizationStrategy()) == false)
            return false;
        if (other.getFineGrainedAuthorizationEnabled() == null ^ this.getFineGrainedAuthorizationEnabled() == null)
            return false;
        if (other.getFineGrainedAuthorizationEnabled() != null
                && other.getFineGrainedAuthorizationEnabled().equals(this.getFineGrainedAuthorizationEnabled()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getIdpLambdaArn() == null ^ this.getIdpLambdaArn() == null)
            return false;
        if (other.getIdpLambdaArn() != null && other.getIdpLambdaArn().equals(this.getIdpLambdaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationStrategy() == null) ? 0 : getAuthorizationStrategy().hashCode());
        hashCode = prime * hashCode + ((getFineGrainedAuthorizationEnabled() == null) ? 0 : getFineGrainedAuthorizationEnabled().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getIdpLambdaArn() == null) ? 0 : getIdpLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderConfiguration clone() {
        try {
            return (IdentityProviderConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.IdentityProviderConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
