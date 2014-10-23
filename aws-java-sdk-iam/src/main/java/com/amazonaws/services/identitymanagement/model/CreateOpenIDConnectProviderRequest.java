/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest) CreateOpenIDConnectProvider operation}.
 * <p>
 * Creates an IAM entity to describe an identity provider (IdP) that
 * supports
 * <a href="http://openid.net/connect/"> OpenID Connect (OIDC) </a>
 * .
 * </p>
 * <p>
 * The OIDC provider that you create with this operation can be used as a
 * principal in a role's trust policy to establish a trust relationship
 * between AWS and the OIDC provider.
 * </p>
 * <p>
 * When you create the IAM OIDC provider, you specify the URL of the OIDC
 * identity provider (IdP) to trust, a list of client IDs (also known as
 * audiences) that identify the application or applications that are
 * allowed to authenticate using the OIDC provider, and a list of
 * thumbprints of the server certificate(s) that the IdP uses. You get
 * all of this information from the OIDC IdP that you want to use for
 * access to AWS.
 * </p>
 * <p>
 * <b>NOTE:</b>Because trust for the OIDC provider is ultimately derived
 * from the IAM provider that this action creates, it is a best practice
 * to limit access to the CreateOpenIDConnectProvider action to
 * highly-privileged users.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest)
 */
public class CreateOpenIDConnectProviderRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The URL of the identity provider. The URL must begin with "https://"
     * and should correspond to the <code>iss</code> claim in the provider's
     * OpenID Connect ID tokens. Per the OIDC standard, path components are
     * allowed but query parameters are not. Typically the URL consists of
     * only a host name, like "https://server.example.org" or
     * "https://example.com". <p>You cannot register the same provider
     * multiple times in a single AWS account. If you try to submit a URL
     * that has already been used for an OpenID Connect provider in the AWS
     * account, you will get an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String url;

    /**
     * A list of client IDs (also known as audiences). When a mobile or web
     * app registers with an OpenID Connect provider, they establish a value
     * that identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.) <p>You can
     * register multiple client IDs with the same provider. For example, you
     * might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC
     * provider. <p>There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     * IDs up to 255 characters long.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clientIDList;

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificate(s). Typically this list
     * includes only one entry. However, IAM lets you have up to five
     * thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates. <p>The
     * server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * <p>You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, if the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * "https://keys.server.example.com/openid-connect", the thumbprint
     * string would be the hex-encoded SHA-1 hash value of the certificate
     * used by https://keys.server.example.com.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintList;

    /**
     * The URL of the identity provider. The URL must begin with "https://"
     * and should correspond to the <code>iss</code> claim in the provider's
     * OpenID Connect ID tokens. Per the OIDC standard, path components are
     * allowed but query parameters are not. Typically the URL consists of
     * only a host name, like "https://server.example.org" or
     * "https://example.com". <p>You cannot register the same provider
     * multiple times in a single AWS account. If you try to submit a URL
     * that has already been used for an OpenID Connect provider in the AWS
     * account, you will get an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The URL of the identity provider. The URL must begin with "https://"
     *         and should correspond to the <code>iss</code> claim in the provider's
     *         OpenID Connect ID tokens. Per the OIDC standard, path components are
     *         allowed but query parameters are not. Typically the URL consists of
     *         only a host name, like "https://server.example.org" or
     *         "https://example.com". <p>You cannot register the same provider
     *         multiple times in a single AWS account. If you try to submit a URL
     *         that has already been used for an OpenID Connect provider in the AWS
     *         account, you will get an error.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The URL of the identity provider. The URL must begin with "https://"
     * and should correspond to the <code>iss</code> claim in the provider's
     * OpenID Connect ID tokens. Per the OIDC standard, path components are
     * allowed but query parameters are not. Typically the URL consists of
     * only a host name, like "https://server.example.org" or
     * "https://example.com". <p>You cannot register the same provider
     * multiple times in a single AWS account. If you try to submit a URL
     * that has already been used for an OpenID Connect provider in the AWS
     * account, you will get an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url The URL of the identity provider. The URL must begin with "https://"
     *         and should correspond to the <code>iss</code> claim in the provider's
     *         OpenID Connect ID tokens. Per the OIDC standard, path components are
     *         allowed but query parameters are not. Typically the URL consists of
     *         only a host name, like "https://server.example.org" or
     *         "https://example.com". <p>You cannot register the same provider
     *         multiple times in a single AWS account. If you try to submit a URL
     *         that has already been used for an OpenID Connect provider in the AWS
     *         account, you will get an error.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The URL of the identity provider. The URL must begin with "https://"
     * and should correspond to the <code>iss</code> claim in the provider's
     * OpenID Connect ID tokens. Per the OIDC standard, path components are
     * allowed but query parameters are not. Typically the URL consists of
     * only a host name, like "https://server.example.org" or
     * "https://example.com". <p>You cannot register the same provider
     * multiple times in a single AWS account. If you try to submit a URL
     * that has already been used for an OpenID Connect provider in the AWS
     * account, you will get an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url The URL of the identity provider. The URL must begin with "https://"
     *         and should correspond to the <code>iss</code> claim in the provider's
     *         OpenID Connect ID tokens. Per the OIDC standard, path components are
     *         allowed but query parameters are not. Typically the URL consists of
     *         only a host name, like "https://server.example.org" or
     *         "https://example.com". <p>You cannot register the same provider
     *         multiple times in a single AWS account. If you try to submit a URL
     *         that has already been used for an OpenID Connect provider in the AWS
     *         account, you will get an error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOpenIDConnectProviderRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * A list of client IDs (also known as audiences). When a mobile or web
     * app registers with an OpenID Connect provider, they establish a value
     * that identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.) <p>You can
     * register multiple client IDs with the same provider. For example, you
     * might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC
     * provider. <p>There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     * IDs up to 255 characters long.
     *
     * @return A list of client IDs (also known as audiences). When a mobile or web
     *         app registers with an OpenID Connect provider, they establish a value
     *         that identifies the application. (This is the value that's sent as the
     *         <code>client_id</code> parameter on OAuth requests.) <p>You can
     *         register multiple client IDs with the same provider. For example, you
     *         might have multiple applications that use the same OIDC provider. You
     *         cannot register more than 100 client IDs with a single IAM OIDC
     *         provider. <p>There is no defined format for a client ID. The
     *         <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     *         IDs up to 255 characters long.
     */
    public java.util.List<String> getClientIDList() {
        if (clientIDList == null) {
              clientIDList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clientIDList.setAutoConstruct(true);
        }
        return clientIDList;
    }
    
    /**
     * A list of client IDs (also known as audiences). When a mobile or web
     * app registers with an OpenID Connect provider, they establish a value
     * that identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.) <p>You can
     * register multiple client IDs with the same provider. For example, you
     * might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC
     * provider. <p>There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     * IDs up to 255 characters long.
     *
     * @param clientIDList A list of client IDs (also known as audiences). When a mobile or web
     *         app registers with an OpenID Connect provider, they establish a value
     *         that identifies the application. (This is the value that's sent as the
     *         <code>client_id</code> parameter on OAuth requests.) <p>You can
     *         register multiple client IDs with the same provider. For example, you
     *         might have multiple applications that use the same OIDC provider. You
     *         cannot register more than 100 client IDs with a single IAM OIDC
     *         provider. <p>There is no defined format for a client ID. The
     *         <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     *         IDs up to 255 characters long.
     */
    public void setClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clientIDListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clientIDList.size());
        clientIDListCopy.addAll(clientIDList);
        this.clientIDList = clientIDListCopy;
    }
    
    /**
     * A list of client IDs (also known as audiences). When a mobile or web
     * app registers with an OpenID Connect provider, they establish a value
     * that identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.) <p>You can
     * register multiple client IDs with the same provider. For example, you
     * might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC
     * provider. <p>There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     * IDs up to 255 characters long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientIDList A list of client IDs (also known as audiences). When a mobile or web
     *         app registers with an OpenID Connect provider, they establish a value
     *         that identifies the application. (This is the value that's sent as the
     *         <code>client_id</code> parameter on OAuth requests.) <p>You can
     *         register multiple client IDs with the same provider. For example, you
     *         might have multiple applications that use the same OIDC provider. You
     *         cannot register more than 100 client IDs with a single IAM OIDC
     *         provider. <p>There is no defined format for a client ID. The
     *         <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     *         IDs up to 255 characters long.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOpenIDConnectProviderRequest withClientIDList(String... clientIDList) {
        if (getClientIDList() == null) setClientIDList(new java.util.ArrayList<String>(clientIDList.length));
        for (String value : clientIDList) {
            getClientIDList().add(value);
        }
        return this;
    }
    
    /**
     * A list of client IDs (also known as audiences). When a mobile or web
     * app registers with an OpenID Connect provider, they establish a value
     * that identifies the application. (This is the value that's sent as the
     * <code>client_id</code> parameter on OAuth requests.) <p>You can
     * register multiple client IDs with the same provider. For example, you
     * might have multiple applications that use the same OIDC provider. You
     * cannot register more than 100 client IDs with a single IAM OIDC
     * provider. <p>There is no defined format for a client ID. The
     * <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     * IDs up to 255 characters long.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientIDList A list of client IDs (also known as audiences). When a mobile or web
     *         app registers with an OpenID Connect provider, they establish a value
     *         that identifies the application. (This is the value that's sent as the
     *         <code>client_id</code> parameter on OAuth requests.) <p>You can
     *         register multiple client IDs with the same provider. For example, you
     *         might have multiple applications that use the same OIDC provider. You
     *         cannot register more than 100 client IDs with a single IAM OIDC
     *         provider. <p>There is no defined format for a client ID. The
     *         <code>CreateOpenIDConnectProviderRequest</code> action accepts client
     *         IDs up to 255 characters long.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOpenIDConnectProviderRequest withClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clientIDListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clientIDList.size());
            clientIDListCopy.addAll(clientIDList);
            this.clientIDList = clientIDListCopy;
        }

        return this;
    }

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificate(s). Typically this list
     * includes only one entry. However, IAM lets you have up to five
     * thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates. <p>The
     * server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * <p>You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, if the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * "https://keys.server.example.com/openid-connect", the thumbprint
     * string would be the hex-encoded SHA-1 hash value of the certificate
     * used by https://keys.server.example.com.
     *
     * @return A list of server certificate thumbprints for the OpenID Connect (OIDC)
     *         identity provider's server certificate(s). Typically this list
     *         includes only one entry. However, IAM lets you have up to five
     *         thumbprints for an OIDC provider. This lets you maintain multiple
     *         thumbprints if the identity provider is rotating certificates. <p>The
     *         server certificate thumbprint is the hex-encoded SHA-1 hash value of
     *         the X.509 certificate used by the domain where the OpenID Connect
     *         provider makes its keys available. It is always a 40-character string.
     *         <p>You must provide at least one thumbprint when creating an IAM OIDC
     *         provider. For example, if the OIDC provider is
     *         <code>server.example.com</code> and the provider stores its keys at
     *         "https://keys.server.example.com/openid-connect", the thumbprint
     *         string would be the hex-encoded SHA-1 hash value of the certificate
     *         used by https://keys.server.example.com.
     */
    public java.util.List<String> getThumbprintList() {
        if (thumbprintList == null) {
              thumbprintList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              thumbprintList.setAutoConstruct(true);
        }
        return thumbprintList;
    }
    
    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificate(s). Typically this list
     * includes only one entry. However, IAM lets you have up to five
     * thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates. <p>The
     * server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * <p>You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, if the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * "https://keys.server.example.com/openid-connect", the thumbprint
     * string would be the hex-encoded SHA-1 hash value of the certificate
     * used by https://keys.server.example.com.
     *
     * @param thumbprintList A list of server certificate thumbprints for the OpenID Connect (OIDC)
     *         identity provider's server certificate(s). Typically this list
     *         includes only one entry. However, IAM lets you have up to five
     *         thumbprints for an OIDC provider. This lets you maintain multiple
     *         thumbprints if the identity provider is rotating certificates. <p>The
     *         server certificate thumbprint is the hex-encoded SHA-1 hash value of
     *         the X.509 certificate used by the domain where the OpenID Connect
     *         provider makes its keys available. It is always a 40-character string.
     *         <p>You must provide at least one thumbprint when creating an IAM OIDC
     *         provider. For example, if the OIDC provider is
     *         <code>server.example.com</code> and the provider stores its keys at
     *         "https://keys.server.example.com/openid-connect", the thumbprint
     *         string would be the hex-encoded SHA-1 hash value of the certificate
     *         used by https://keys.server.example.com.
     */
    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(thumbprintList.size());
        thumbprintListCopy.addAll(thumbprintList);
        this.thumbprintList = thumbprintListCopy;
    }
    
    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificate(s). Typically this list
     * includes only one entry. However, IAM lets you have up to five
     * thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates. <p>The
     * server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * <p>You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, if the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * "https://keys.server.example.com/openid-connect", the thumbprint
     * string would be the hex-encoded SHA-1 hash value of the certificate
     * used by https://keys.server.example.com.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbprintList A list of server certificate thumbprints for the OpenID Connect (OIDC)
     *         identity provider's server certificate(s). Typically this list
     *         includes only one entry. However, IAM lets you have up to five
     *         thumbprints for an OIDC provider. This lets you maintain multiple
     *         thumbprints if the identity provider is rotating certificates. <p>The
     *         server certificate thumbprint is the hex-encoded SHA-1 hash value of
     *         the X.509 certificate used by the domain where the OpenID Connect
     *         provider makes its keys available. It is always a 40-character string.
     *         <p>You must provide at least one thumbprint when creating an IAM OIDC
     *         provider. For example, if the OIDC provider is
     *         <code>server.example.com</code> and the provider stores its keys at
     *         "https://keys.server.example.com/openid-connect", the thumbprint
     *         string would be the hex-encoded SHA-1 hash value of the certificate
     *         used by https://keys.server.example.com.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOpenIDConnectProviderRequest withThumbprintList(String... thumbprintList) {
        if (getThumbprintList() == null) setThumbprintList(new java.util.ArrayList<String>(thumbprintList.length));
        for (String value : thumbprintList) {
            getThumbprintList().add(value);
        }
        return this;
    }
    
    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC)
     * identity provider's server certificate(s). Typically this list
     * includes only one entry. However, IAM lets you have up to five
     * thumbprints for an OIDC provider. This lets you maintain multiple
     * thumbprints if the identity provider is rotating certificates. <p>The
     * server certificate thumbprint is the hex-encoded SHA-1 hash value of
     * the X.509 certificate used by the domain where the OpenID Connect
     * provider makes its keys available. It is always a 40-character string.
     * <p>You must provide at least one thumbprint when creating an IAM OIDC
     * provider. For example, if the OIDC provider is
     * <code>server.example.com</code> and the provider stores its keys at
     * "https://keys.server.example.com/openid-connect", the thumbprint
     * string would be the hex-encoded SHA-1 hash value of the certificate
     * used by https://keys.server.example.com.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbprintList A list of server certificate thumbprints for the OpenID Connect (OIDC)
     *         identity provider's server certificate(s). Typically this list
     *         includes only one entry. However, IAM lets you have up to five
     *         thumbprints for an OIDC provider. This lets you maintain multiple
     *         thumbprints if the identity provider is rotating certificates. <p>The
     *         server certificate thumbprint is the hex-encoded SHA-1 hash value of
     *         the X.509 certificate used by the domain where the OpenID Connect
     *         provider makes its keys available. It is always a 40-character string.
     *         <p>You must provide at least one thumbprint when creating an IAM OIDC
     *         provider. For example, if the OIDC provider is
     *         <code>server.example.com</code> and the provider stores its keys at
     *         "https://keys.server.example.com/openid-connect", the thumbprint
     *         string would be the hex-encoded SHA-1 hash value of the certificate
     *         used by https://keys.server.example.com.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOpenIDConnectProviderRequest withThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(thumbprintList.size());
            thumbprintListCopy.addAll(thumbprintList);
            this.thumbprintList = thumbprintListCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUrl() != null) sb.append("Url: " + getUrl() + ",");
        if (getClientIDList() != null) sb.append("ClientIDList: " + getClientIDList() + ",");
        if (getThumbprintList() != null) sb.append("ThumbprintList: " + getThumbprintList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        hashCode = prime * hashCode + ((getClientIDList() == null) ? 0 : getClientIDList().hashCode()); 
        hashCode = prime * hashCode + ((getThumbprintList() == null) ? 0 : getThumbprintList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateOpenIDConnectProviderRequest == false) return false;
        CreateOpenIDConnectProviderRequest other = (CreateOpenIDConnectProviderRequest)obj;
        
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        if (other.getClientIDList() == null ^ this.getClientIDList() == null) return false;
        if (other.getClientIDList() != null && other.getClientIDList().equals(this.getClientIDList()) == false) return false; 
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null) return false;
        if (other.getThumbprintList() != null && other.getThumbprintList().equals(this.getThumbprintList()) == false) return false; 
        return true;
    }
    
}
    