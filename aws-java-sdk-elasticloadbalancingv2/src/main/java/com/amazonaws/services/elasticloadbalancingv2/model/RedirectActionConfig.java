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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a redirect action.
 * </p>
 * <p>
 * A URI consists of the following components: protocol://hostname:port/path?query. You must modify at least one of the
 * following components to avoid a redirect loop: protocol, hostname, port, or path. Any components that you do not
 * modify retain their original values.
 * </p>
 * <p>
 * You can reuse URI components using the following reserved keywords:
 * </p>
 * <ul>
 * <li>
 * <p>
 * #{protocol}
 * </p>
 * </li>
 * <li>
 * <p>
 * #{host}
 * </p>
 * </li>
 * <li>
 * <p>
 * #{port}
 * </p>
 * </li>
 * <li>
 * <p>
 * #{path} (the leading "/" is removed)
 * </p>
 * </li>
 * <li>
 * <p>
 * #{query}
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or the query to
 * "#{query}&amp;value=xyz".
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RedirectActionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedirectActionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and
     * HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The port. You can specify a value from 1 to 65535 or #{port}.
     * </p>
     */
    private String port;
    /**
     * <p>
     * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     * </p>
     */
    private String host;
    /**
     * <p>
     * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain
     * #{host}, #{path}, and #{port}.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it
     * is automatically added. You can specify any of the reserved keywords.
     * </p>
     */
    private String query;
    /**
     * <p>
     * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and
     * HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     * </p>
     * 
     * @param protocol
     *        The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
     *        and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and
     * HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     * </p>
     * 
     * @return The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
     *         and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and
     * HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     * </p>
     * 
     * @param protocol
     *        The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
     *        and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedirectActionConfig withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The port. You can specify a value from 1 to 65535 or #{port}.
     * </p>
     * 
     * @param port
     *        The port. You can specify a value from 1 to 65535 or #{port}.
     */

    public void setPort(String port) {
        this.port = port;
    }

    /**
     * <p>
     * The port. You can specify a value from 1 to 65535 or #{port}.
     * </p>
     * 
     * @return The port. You can specify a value from 1 to 65535 or #{port}.
     */

    public String getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port. You can specify a value from 1 to 65535 or #{port}.
     * </p>
     * 
     * @param port
     *        The port. You can specify a value from 1 to 65535 or #{port}.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedirectActionConfig withPort(String port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     * </p>
     * 
     * @param host
     *        The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     * </p>
     * 
     * @return The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     * </p>
     * 
     * @param host
     *        The hostname. This component is not percent-encoded. The hostname can contain #{host}.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedirectActionConfig withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain
     * #{host}, #{path}, and #{port}.
     * </p>
     * 
     * @param path
     *        The absolute path, starting with the leading "/". This component is not percent-encoded. The path can
     *        contain #{host}, #{path}, and #{port}.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain
     * #{host}, #{path}, and #{port}.
     * </p>
     * 
     * @return The absolute path, starting with the leading "/". This component is not percent-encoded. The path can
     *         contain #{host}, #{path}, and #{port}.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain
     * #{host}, #{path}, and #{port}.
     * </p>
     * 
     * @param path
     *        The absolute path, starting with the leading "/". This component is not percent-encoded. The path can
     *        contain #{host}, #{path}, and #{port}.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedirectActionConfig withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it
     * is automatically added. You can specify any of the reserved keywords.
     * </p>
     * 
     * @param query
     *        The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?",
     *        as it is automatically added. You can specify any of the reserved keywords.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it
     * is automatically added. You can specify any of the reserved keywords.
     * </p>
     * 
     * @return The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading
     *         "?", as it is automatically added. You can specify any of the reserved keywords.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it
     * is automatically added. You can specify any of the reserved keywords.
     * </p>
     * 
     * @param query
     *        The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?",
     *        as it is automatically added. You can specify any of the reserved keywords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedirectActionConfig withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * </p>
     * 
     * @param statusCode
     *        The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * @see RedirectActionStatusCodeEnum
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * </p>
     * 
     * @return The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * @see RedirectActionStatusCodeEnum
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * </p>
     * 
     * @param statusCode
     *        The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedirectActionStatusCodeEnum
     */

    public RedirectActionConfig withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * </p>
     * 
     * @param statusCode
     *        The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedirectActionStatusCodeEnum
     */

    public RedirectActionConfig withStatusCode(RedirectActionStatusCodeEnum statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedirectActionConfig == false)
            return false;
        RedirectActionConfig other = (RedirectActionConfig) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public RedirectActionConfig clone() {
        try {
            return (RedirectActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
