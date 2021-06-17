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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to websites that require basic user authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BasicAuthenticationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BasicAuthenticationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the host name of https://a.example.com/page1.html is "a.example.com".
     * </p>
     */
    private String host;
    /**
     * <p>
     * The port number of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Your secret ARN, which you can create in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>
     * </p>
     * <p>
     * You use a secret if basic authentication credentials are required to connect to a website. The secret stores your
     * credentials of user name and password.
     * </p>
     */
    private String credentials;

    /**
     * <p>
     * The name of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the host name of https://a.example.com/page1.html is "a.example.com".
     * </p>
     * 
     * @param host
     *        The name of the website host you want to connect to using authentication credentials.</p>
     *        <p>
     *        For example, the host name of https://a.example.com/page1.html is "a.example.com".
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The name of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the host name of https://a.example.com/page1.html is "a.example.com".
     * </p>
     * 
     * @return The name of the website host you want to connect to using authentication credentials.</p>
     *         <p>
     *         For example, the host name of https://a.example.com/page1.html is "a.example.com".
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The name of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the host name of https://a.example.com/page1.html is "a.example.com".
     * </p>
     * 
     * @param host
     *        The name of the website host you want to connect to using authentication credentials.</p>
     *        <p>
     *        For example, the host name of https://a.example.com/page1.html is "a.example.com".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicAuthenticationConfiguration withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The port number of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     * </p>
     * 
     * @param port
     *        The port number of the website host you want to connect to using authentication credentials.</p>
     *        <p>
     *        For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     * </p>
     * 
     * @return The port number of the website host you want to connect to using authentication credentials.</p>
     *         <p>
     *         For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number of the website host you want to connect to using authentication credentials.
     * </p>
     * <p>
     * For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     * </p>
     * 
     * @param port
     *        The port number of the website host you want to connect to using authentication credentials.</p>
     *        <p>
     *        For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicAuthenticationConfiguration withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Your secret ARN, which you can create in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>
     * </p>
     * <p>
     * You use a secret if basic authentication credentials are required to connect to a website. The secret stores your
     * credentials of user name and password.
     * </p>
     * 
     * @param credentials
     *        Your secret ARN, which you can create in <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a> </p>
     *        <p>
     *        You use a secret if basic authentication credentials are required to connect to a website. The secret
     *        stores your credentials of user name and password.
     */

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Your secret ARN, which you can create in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>
     * </p>
     * <p>
     * You use a secret if basic authentication credentials are required to connect to a website. The secret stores your
     * credentials of user name and password.
     * </p>
     * 
     * @return Your secret ARN, which you can create in <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>
     *         </p>
     *         <p>
     *         You use a secret if basic authentication credentials are required to connect to a website. The secret
     *         stores your credentials of user name and password.
     */

    public String getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Your secret ARN, which you can create in <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a>
     * </p>
     * <p>
     * You use a secret if basic authentication credentials are required to connect to a website. The secret stores your
     * credentials of user name and password.
     * </p>
     * 
     * @param credentials
     *        Your secret ARN, which you can create in <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">AWS Secrets Manager</a> </p>
     *        <p>
     *        You use a secret if basic authentication credentials are required to connect to a website. The secret
     *        stores your credentials of user name and password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasicAuthenticationConfiguration withCredentials(String credentials) {
        setCredentials(credentials);
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BasicAuthenticationConfiguration == false)
            return false;
        BasicAuthenticationConfiguration other = (BasicAuthenticationConfiguration) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public BasicAuthenticationConfiguration clone() {
        try {
            return (BasicAuthenticationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.BasicAuthenticationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
