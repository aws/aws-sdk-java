/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The identity provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/IdentityProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     */
    private String identityProviderArn;
    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>api_version</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>team_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private_key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_request_method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oidc_issuer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MetadataFile</code> OR <code>MetadataURL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDPSignout</code> <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> identityProviderDetails;
    /**
     * <p>
     * The identity provider name.
     * </p>
     */
    private String identityProviderName;
    /**
     * <p>
     * The identity provider type.
     * </p>
     */
    private String identityProviderType;

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     * 
     * @param identityProviderArn
     *        The ARN of the identity provider.
     */

    public void setIdentityProviderArn(String identityProviderArn) {
        this.identityProviderArn = identityProviderArn;
    }

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     * 
     * @return The ARN of the identity provider.
     */

    public String getIdentityProviderArn() {
        return this.identityProviderArn;
    }

    /**
     * <p>
     * The ARN of the identity provider.
     * </p>
     * 
     * @param identityProviderArn
     *        The ARN of the identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProvider withIdentityProviderArn(String identityProviderArn) {
        setIdentityProviderArn(identityProviderArn);
        return this;
    }

    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>api_version</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>team_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private_key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_request_method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oidc_issuer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MetadataFile</code> OR <code>MetadataURL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDPSignout</code> <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The identity provider details. The following list describes the provider detail keys for each identity
     *         provider type. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Google and Login with Amazon:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>client_id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client_secret</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>authorize_scopes</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Facebook:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>client_id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client_secret</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>authorize_scopes</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>api_version</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Sign in with Apple:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>client_id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>team_id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key_id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private_key</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>authorize_scopes</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For OIDC providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>client_id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client_secret</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attributes_request_method</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oidc_issuer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>authorize_scopes</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For SAML providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MetadataFile</code> OR <code>MetadataURL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IDPSignout</code> <i>optional</i>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.Map<String, String> getIdentityProviderDetails() {
        return identityProviderDetails;
    }

    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>api_version</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>team_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private_key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_request_method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oidc_issuer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MetadataFile</code> OR <code>MetadataURL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDPSignout</code> <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param identityProviderDetails
     *        The identity provider details. The following list describes the provider detail keys for each identity
     *        provider type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Google and Login with Amazon:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client_secret</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Facebook:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client_secret</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>api_version</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Sign in with Apple:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>team_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private_key</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For OIDC providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client_secret</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attributes_request_method</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oidc_issuer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For SAML providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MetadataFile</code> OR <code>MetadataURL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IDPSignout</code> <i>optional</i>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setIdentityProviderDetails(java.util.Map<String, String> identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * The identity provider details. The following list describes the provider detail keys for each identity provider
     * type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>api_version</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>team_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private_key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>client_id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client_secret</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_request_method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oidc_issuer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_scopes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MetadataFile</code> OR <code>MetadataURL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDPSignout</code> <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param identityProviderDetails
     *        The identity provider details. The following list describes the provider detail keys for each identity
     *        provider type. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Google and Login with Amazon:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client_secret</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Facebook:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client_secret</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>api_version</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Sign in with Apple:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>team_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private_key</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For OIDC providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>client_id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client_secret</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attributes_request_method</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oidc_issuer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_scopes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>authorize_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attributes_url</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jwks_uri</code> <i>if not available from discovery URL specified by oidc_issuer key</i>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For SAML providers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MetadataFile</code> OR <code>MetadataURL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IDPSignout</code> <i>optional</i>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProvider withIdentityProviderDetails(java.util.Map<String, String> identityProviderDetails) {
        setIdentityProviderDetails(identityProviderDetails);
        return this;
    }

    /**
     * Add a single IdentityProviderDetails entry
     *
     * @see IdentityProvider#withIdentityProviderDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProvider addIdentityProviderDetailsEntry(String key, String value) {
        if (null == this.identityProviderDetails) {
            this.identityProviderDetails = new java.util.HashMap<String, String>();
        }
        if (this.identityProviderDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.identityProviderDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IdentityProviderDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProvider clearIdentityProviderDetailsEntries() {
        this.identityProviderDetails = null;
        return this;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param identityProviderName
     *        The identity provider name.
     */

    public void setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @return The identity provider name.
     */

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param identityProviderName
     *        The identity provider name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProvider withIdentityProviderName(String identityProviderName) {
        setIdentityProviderName(identityProviderName);
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param identityProviderType
     *        The identity provider type.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @return The identity provider type.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param identityProviderType
     *        The identity provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public IdentityProvider withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param identityProviderType
     *        The identity provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public IdentityProvider withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
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
        if (getIdentityProviderArn() != null)
            sb.append("IdentityProviderArn: ").append(getIdentityProviderArn()).append(",");
        if (getIdentityProviderDetails() != null)
            sb.append("IdentityProviderDetails: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentityProviderName() != null)
            sb.append("IdentityProviderName: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProvider == false)
            return false;
        IdentityProvider other = (IdentityProvider) obj;
        if (other.getIdentityProviderArn() == null ^ this.getIdentityProviderArn() == null)
            return false;
        if (other.getIdentityProviderArn() != null && other.getIdentityProviderArn().equals(this.getIdentityProviderArn()) == false)
            return false;
        if (other.getIdentityProviderDetails() == null ^ this.getIdentityProviderDetails() == null)
            return false;
        if (other.getIdentityProviderDetails() != null && other.getIdentityProviderDetails().equals(this.getIdentityProviderDetails()) == false)
            return false;
        if (other.getIdentityProviderName() == null ^ this.getIdentityProviderName() == null)
            return false;
        if (other.getIdentityProviderName() != null && other.getIdentityProviderName().equals(this.getIdentityProviderName()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProviderArn() == null) ? 0 : getIdentityProviderArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderName() == null) ? 0 : getIdentityProviderName().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProvider clone() {
        try {
            return (IdentityProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.IdentityProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
