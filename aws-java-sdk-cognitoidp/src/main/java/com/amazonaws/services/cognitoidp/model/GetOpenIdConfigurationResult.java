/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response from the server to get the Open ID configuration
 * information.
 * </p>
 */
public class GetOpenIdConfigurationResult implements Serializable, Cloneable {

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     */
    private String jwks_uri;
    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     */
    private String authorization_endpoint;
    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     */
    private java.util.List<String> subject_types_supported;
    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     */
    private java.util.List<String> response_types_supported;
    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     */
    private java.util.List<String> id_token_signing_alg_values_supported;

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * 
     * @param issuer
     *        The issuer of the Open ID configuration response.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * 
     * @return The issuer of the Open ID configuration response.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * 
     * @param issuer
     *        The issuer of the Open ID configuration response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * 
     * @param jwks_uri
     *        The URI of the JSON Web keys in the server response to get Open ID
     *        configuration information.
     */

    public void setJwks_uri(String jwks_uri) {
        this.jwks_uri = jwks_uri;
    }

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * 
     * @return The URI of the JSON Web keys in the server response to get Open
     *         ID configuration information.
     */

    public String getJwks_uri() {
        return this.jwks_uri;
    }

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * 
     * @param jwks_uri
     *        The URI of the JSON Web keys in the server response to get Open ID
     *        configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withJwks_uri(String jwks_uri) {
        setJwks_uri(jwks_uri);
        return this;
    }

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @param authorization_endpoint
     *        The authorization endpoint returned by the server response to get
     *        the Open ID configuration information.
     */

    public void setAuthorization_endpoint(String authorization_endpoint) {
        this.authorization_endpoint = authorization_endpoint;
    }

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @return The authorization endpoint returned by the server response to get
     *         the Open ID configuration information.
     */

    public String getAuthorization_endpoint() {
        return this.authorization_endpoint;
    }

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @param authorization_endpoint
     *        The authorization endpoint returned by the server response to get
     *        the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withAuthorization_endpoint(
            String authorization_endpoint) {
        setAuthorization_endpoint(authorization_endpoint);
        return this;
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @return The subject types supported returned by the server response to
     *         get the Open ID configuration information.
     */

    public java.util.List<String> getSubject_types_supported() {
        return subject_types_supported;
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @param subject_types_supported
     *        The subject types supported returned by the server response to get
     *        the Open ID configuration information.
     */

    public void setSubject_types_supported(
            java.util.Collection<String> subject_types_supported) {
        if (subject_types_supported == null) {
            this.subject_types_supported = null;
            return;
        }

        this.subject_types_supported = new java.util.ArrayList<String>(
                subject_types_supported);
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubject_types_supported(java.util.Collection)} or
     * {@link #withSubject_types_supported(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subject_types_supported
     *        The subject types supported returned by the server response to get
     *        the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withSubject_types_supported(
            String... subject_types_supported) {
        if (this.subject_types_supported == null) {
            setSubject_types_supported(new java.util.ArrayList<String>(
                    subject_types_supported.length));
        }
        for (String ele : subject_types_supported) {
            this.subject_types_supported.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @param subject_types_supported
     *        The subject types supported returned by the server response to get
     *        the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withSubject_types_supported(
            java.util.Collection<String> subject_types_supported) {
        setSubject_types_supported(subject_types_supported);
        return this;
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @return The response types supported returned by the server response to
     *         get the Open ID configuration information.
     */

    public java.util.List<String> getResponse_types_supported() {
        return response_types_supported;
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @param response_types_supported
     *        The response types supported returned by the server response to
     *        get the Open ID configuration information.
     */

    public void setResponse_types_supported(
            java.util.Collection<String> response_types_supported) {
        if (response_types_supported == null) {
            this.response_types_supported = null;
            return;
        }

        this.response_types_supported = new java.util.ArrayList<String>(
                response_types_supported);
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResponse_types_supported(java.util.Collection)} or
     * {@link #withResponse_types_supported(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param response_types_supported
     *        The response types supported returned by the server response to
     *        get the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withResponse_types_supported(
            String... response_types_supported) {
        if (this.response_types_supported == null) {
            setResponse_types_supported(new java.util.ArrayList<String>(
                    response_types_supported.length));
        }
        for (String ele : response_types_supported) {
            this.response_types_supported.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * 
     * @param response_types_supported
     *        The response types supported returned by the server response to
     *        get the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withResponse_types_supported(
            java.util.Collection<String> response_types_supported) {
        setResponse_types_supported(response_types_supported);
        return this;
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     * 
     * @return The token-signing algorithm values supported returned by the
     *         server response to get the Open ID configuration information.
     */

    public java.util.List<String> getId_token_signing_alg_values_supported() {
        return id_token_signing_alg_values_supported;
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     * 
     * @param id_token_signing_alg_values_supported
     *        The token-signing algorithm values supported returned by the
     *        server response to get the Open ID configuration information.
     */

    public void setId_token_signing_alg_values_supported(
            java.util.Collection<String> id_token_signing_alg_values_supported) {
        if (id_token_signing_alg_values_supported == null) {
            this.id_token_signing_alg_values_supported = null;
            return;
        }

        this.id_token_signing_alg_values_supported = new java.util.ArrayList<String>(
                id_token_signing_alg_values_supported);
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use
     * {@link #setId_token_signing_alg_values_supported(java.util.Collection)}
     * or
     * {@link #withId_token_signing_alg_values_supported(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param id_token_signing_alg_values_supported
     *        The token-signing algorithm values supported returned by the
     *        server response to get the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withId_token_signing_alg_values_supported(
            String... id_token_signing_alg_values_supported) {
        if (this.id_token_signing_alg_values_supported == null) {
            setId_token_signing_alg_values_supported(new java.util.ArrayList<String>(
                    id_token_signing_alg_values_supported.length));
        }
        for (String ele : id_token_signing_alg_values_supported) {
            this.id_token_signing_alg_values_supported.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     * 
     * @param id_token_signing_alg_values_supported
     *        The token-signing algorithm values supported returned by the
     *        server response to get the Open ID configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetOpenIdConfigurationResult withId_token_signing_alg_values_supported(
            java.util.Collection<String> id_token_signing_alg_values_supported) {
        setId_token_signing_alg_values_supported(id_token_signing_alg_values_supported);
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
        if (getIssuer() != null)
            sb.append("Issuer: " + getIssuer() + ",");
        if (getJwks_uri() != null)
            sb.append("Jwks_uri: " + getJwks_uri() + ",");
        if (getAuthorization_endpoint() != null)
            sb.append("Authorization_endpoint: " + getAuthorization_endpoint()
                    + ",");
        if (getSubject_types_supported() != null)
            sb.append("Subject_types_supported: "
                    + getSubject_types_supported() + ",");
        if (getResponse_types_supported() != null)
            sb.append("Response_types_supported: "
                    + getResponse_types_supported() + ",");
        if (getId_token_signing_alg_values_supported() != null)
            sb.append("Id_token_signing_alg_values_supported: "
                    + getId_token_signing_alg_values_supported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIdConfigurationResult == false)
            return false;
        GetOpenIdConfigurationResult other = (GetOpenIdConfigurationResult) obj;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null
                && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getJwks_uri() == null ^ this.getJwks_uri() == null)
            return false;
        if (other.getJwks_uri() != null
                && other.getJwks_uri().equals(this.getJwks_uri()) == false)
            return false;
        if (other.getAuthorization_endpoint() == null
                ^ this.getAuthorization_endpoint() == null)
            return false;
        if (other.getAuthorization_endpoint() != null
                && other.getAuthorization_endpoint().equals(
                        this.getAuthorization_endpoint()) == false)
            return false;
        if (other.getSubject_types_supported() == null
                ^ this.getSubject_types_supported() == null)
            return false;
        if (other.getSubject_types_supported() != null
                && other.getSubject_types_supported().equals(
                        this.getSubject_types_supported()) == false)
            return false;
        if (other.getResponse_types_supported() == null
                ^ this.getResponse_types_supported() == null)
            return false;
        if (other.getResponse_types_supported() != null
                && other.getResponse_types_supported().equals(
                        this.getResponse_types_supported()) == false)
            return false;
        if (other.getId_token_signing_alg_values_supported() == null
                ^ this.getId_token_signing_alg_values_supported() == null)
            return false;
        if (other.getId_token_signing_alg_values_supported() != null
                && other.getId_token_signing_alg_values_supported().equals(
                        this.getId_token_signing_alg_values_supported()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode
                + ((getJwks_uri() == null) ? 0 : getJwks_uri().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorization_endpoint() == null) ? 0
                        : getAuthorization_endpoint().hashCode());
        hashCode = prime
                * hashCode
                + ((getSubject_types_supported() == null) ? 0
                        : getSubject_types_supported().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponse_types_supported() == null) ? 0
                        : getResponse_types_supported().hashCode());
        hashCode = prime
                * hashCode
                + ((getId_token_signing_alg_values_supported() == null) ? 0
                        : getId_token_signing_alg_values_supported().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenIdConfigurationResult clone() {
        try {
            return (GetOpenIdConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
