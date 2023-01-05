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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Secrets Manager secret that stores your stream credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/SelfManagedKafkaAccessConfigurationCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedKafkaAccessConfigurationCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     */
    private String basicAuth;
    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     */
    private String clientCertificateTlsAuth;
    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     */
    private String saslScram256Auth;
    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     */
    private String saslScram512Auth;

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param basicAuth
     *        The ARN of the Secrets Manager secret.
     */

    public void setBasicAuth(String basicAuth) {
        this.basicAuth = basicAuth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret.
     */

    public String getBasicAuth() {
        return this.basicAuth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param basicAuth
     *        The ARN of the Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationCredentials withBasicAuth(String basicAuth) {
        setBasicAuth(basicAuth);
        return this;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param clientCertificateTlsAuth
     *        The ARN of the Secrets Manager secret.
     */

    public void setClientCertificateTlsAuth(String clientCertificateTlsAuth) {
        this.clientCertificateTlsAuth = clientCertificateTlsAuth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret.
     */

    public String getClientCertificateTlsAuth() {
        return this.clientCertificateTlsAuth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param clientCertificateTlsAuth
     *        The ARN of the Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationCredentials withClientCertificateTlsAuth(String clientCertificateTlsAuth) {
        setClientCertificateTlsAuth(clientCertificateTlsAuth);
        return this;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param saslScram256Auth
     *        The ARN of the Secrets Manager secret.
     */

    public void setSaslScram256Auth(String saslScram256Auth) {
        this.saslScram256Auth = saslScram256Auth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret.
     */

    public String getSaslScram256Auth() {
        return this.saslScram256Auth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param saslScram256Auth
     *        The ARN of the Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationCredentials withSaslScram256Auth(String saslScram256Auth) {
        setSaslScram256Auth(saslScram256Auth);
        return this;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param saslScram512Auth
     *        The ARN of the Secrets Manager secret.
     */

    public void setSaslScram512Auth(String saslScram512Auth) {
        this.saslScram512Auth = saslScram512Auth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @return The ARN of the Secrets Manager secret.
     */

    public String getSaslScram512Auth() {
        return this.saslScram512Auth;
    }

    /**
     * <p>
     * The ARN of the Secrets Manager secret.
     * </p>
     * 
     * @param saslScram512Auth
     *        The ARN of the Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedKafkaAccessConfigurationCredentials withSaslScram512Auth(String saslScram512Auth) {
        setSaslScram512Auth(saslScram512Auth);
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
        if (getBasicAuth() != null)
            sb.append("BasicAuth: ").append(getBasicAuth()).append(",");
        if (getClientCertificateTlsAuth() != null)
            sb.append("ClientCertificateTlsAuth: ").append(getClientCertificateTlsAuth()).append(",");
        if (getSaslScram256Auth() != null)
            sb.append("SaslScram256Auth: ").append(getSaslScram256Auth()).append(",");
        if (getSaslScram512Auth() != null)
            sb.append("SaslScram512Auth: ").append(getSaslScram512Auth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManagedKafkaAccessConfigurationCredentials == false)
            return false;
        SelfManagedKafkaAccessConfigurationCredentials other = (SelfManagedKafkaAccessConfigurationCredentials) obj;
        if (other.getBasicAuth() == null ^ this.getBasicAuth() == null)
            return false;
        if (other.getBasicAuth() != null && other.getBasicAuth().equals(this.getBasicAuth()) == false)
            return false;
        if (other.getClientCertificateTlsAuth() == null ^ this.getClientCertificateTlsAuth() == null)
            return false;
        if (other.getClientCertificateTlsAuth() != null && other.getClientCertificateTlsAuth().equals(this.getClientCertificateTlsAuth()) == false)
            return false;
        if (other.getSaslScram256Auth() == null ^ this.getSaslScram256Auth() == null)
            return false;
        if (other.getSaslScram256Auth() != null && other.getSaslScram256Auth().equals(this.getSaslScram256Auth()) == false)
            return false;
        if (other.getSaslScram512Auth() == null ^ this.getSaslScram512Auth() == null)
            return false;
        if (other.getSaslScram512Auth() != null && other.getSaslScram512Auth().equals(this.getSaslScram512Auth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasicAuth() == null) ? 0 : getBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getClientCertificateTlsAuth() == null) ? 0 : getClientCertificateTlsAuth().hashCode());
        hashCode = prime * hashCode + ((getSaslScram256Auth() == null) ? 0 : getSaslScram256Auth().hashCode());
        hashCode = prime * hashCode + ((getSaslScram512Auth() == null) ? 0 : getSaslScram512Auth().hashCode());
        return hashCode;
    }

    @Override
    public SelfManagedKafkaAccessConfigurationCredentials clone() {
        try {
            return (SelfManagedKafkaAccessConfigurationCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.SelfManagedKafkaAccessConfigurationCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
