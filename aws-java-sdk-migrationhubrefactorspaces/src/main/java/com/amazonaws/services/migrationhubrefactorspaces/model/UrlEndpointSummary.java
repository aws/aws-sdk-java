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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the configuration for the URL endpoint type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UrlEndpointSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UrlEndpointSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health check URL of the URL endpoint type. If the URL is a public endpoint, the <code>HealthUrl</code> must
     * also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the health URL
     * must also be a private endpoint, and the host must be the same as the URL.
     * </p>
     */
    private String healthUrl;
    /**
     * <p>
     * The URL to route traffic to. The URL must be an <a
     * href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain name, the
     * name must be resolvable over the public internet. If the scheme is <code>https</code>, the top level domain of
     * the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root zone database</a>.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The health check URL of the URL endpoint type. If the URL is a public endpoint, the <code>HealthUrl</code> must
     * also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the health URL
     * must also be a private endpoint, and the host must be the same as the URL.
     * </p>
     * 
     * @param healthUrl
     *        The health check URL of the URL endpoint type. If the URL is a public endpoint, the <code>HealthUrl</code>
     *        must also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the
     *        health URL must also be a private endpoint, and the host must be the same as the URL.
     */

    public void setHealthUrl(String healthUrl) {
        this.healthUrl = healthUrl;
    }

    /**
     * <p>
     * The health check URL of the URL endpoint type. If the URL is a public endpoint, the <code>HealthUrl</code> must
     * also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the health URL
     * must also be a private endpoint, and the host must be the same as the URL.
     * </p>
     * 
     * @return The health check URL of the URL endpoint type. If the URL is a public endpoint, the
     *         <code>HealthUrl</code> must also be a public endpoint. If the URL is a private endpoint inside a virtual
     *         private cloud (VPC), the health URL must also be a private endpoint, and the host must be the same as the
     *         URL.
     */

    public String getHealthUrl() {
        return this.healthUrl;
    }

    /**
     * <p>
     * The health check URL of the URL endpoint type. If the URL is a public endpoint, the <code>HealthUrl</code> must
     * also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the health URL
     * must also be a private endpoint, and the host must be the same as the URL.
     * </p>
     * 
     * @param healthUrl
     *        The health check URL of the URL endpoint type. If the URL is a public endpoint, the <code>HealthUrl</code>
     *        must also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the
     *        health URL must also be a private endpoint, and the host must be the same as the URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UrlEndpointSummary withHealthUrl(String healthUrl) {
        setHealthUrl(healthUrl);
        return this;
    }

    /**
     * <p>
     * The URL to route traffic to. The URL must be an <a
     * href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain name, the
     * name must be resolvable over the public internet. If the scheme is <code>https</code>, the top level domain of
     * the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root zone database</a>.
     * </p>
     * 
     * @param url
     *        The URL to route traffic to. The URL must be an <a
     *        href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain
     *        name, the name must be resolvable over the public internet. If the scheme is <code>https</code>, the top
     *        level domain of the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root
     *        zone database</a>.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to route traffic to. The URL must be an <a
     * href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain name, the
     * name must be resolvable over the public internet. If the scheme is <code>https</code>, the top level domain of
     * the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root zone database</a>.
     * </p>
     * 
     * @return The URL to route traffic to. The URL must be an <a
     *         href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain
     *         name, the name must be resolvable over the public internet. If the scheme is <code>https</code>, the top
     *         level domain of the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root
     *         zone database</a>.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to route traffic to. The URL must be an <a
     * href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain name, the
     * name must be resolvable over the public internet. If the scheme is <code>https</code>, the top level domain of
     * the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root zone database</a>.
     * </p>
     * 
     * @param url
     *        The URL to route traffic to. The URL must be an <a
     *        href="https://datatracker.ietf.org/doc/html/rfc3986">rfc3986-formatted URL</a>. If the host is a domain
     *        name, the name must be resolvable over the public internet. If the scheme is <code>https</code>, the top
     *        level domain of the host must be listed in the <a href="https://www.iana.org/domains/root/db">IANA root
     *        zone database</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UrlEndpointSummary withUrl(String url) {
        setUrl(url);
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
        if (getHealthUrl() != null)
            sb.append("HealthUrl: ").append(getHealthUrl()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UrlEndpointSummary == false)
            return false;
        UrlEndpointSummary other = (UrlEndpointSummary) obj;
        if (other.getHealthUrl() == null ^ this.getHealthUrl() == null)
            return false;
        if (other.getHealthUrl() != null && other.getHealthUrl().equals(this.getHealthUrl()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthUrl() == null) ? 0 : getHealthUrl().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public UrlEndpointSummary clone() {
        try {
            return (UrlEndpointSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.UrlEndpointSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
