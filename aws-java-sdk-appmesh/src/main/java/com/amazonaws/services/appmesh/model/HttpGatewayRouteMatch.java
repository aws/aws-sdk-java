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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the criteria for determining a request match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpGatewayRouteMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpGatewayRouteMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The client request headers to match on.
     * </p>
     */
    private java.util.List<HttpGatewayRouteHeader> headers;
    /**
     * <p>
     * The host name to match on.
     * </p>
     */
    private GatewayRouteHostnameMatch hostname;
    /**
     * <p>
     * The method to match on.
     * </p>
     */
    private String method;
    /**
     * <p>
     * The path to match on.
     * </p>
     */
    private HttpPathMatch path;
    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by itself
     * matches all requests to the virtual service name. You can also match for path-based routing of requests. For
     * example, if your virtual service name is <code>my-service.local</code> and you want the route to match requests
     * to <code>my-service.local/metrics</code>, your prefix should be <code>/metrics</code>.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The query parameter to match on.
     * </p>
     */
    private java.util.List<HttpQueryParameter> queryParameters;

    /**
     * <p>
     * The client request headers to match on.
     * </p>
     * 
     * @return The client request headers to match on.
     */

    public java.util.List<HttpGatewayRouteHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The client request headers to match on.
     * </p>
     * 
     * @param headers
     *        The client request headers to match on.
     */

    public void setHeaders(java.util.Collection<HttpGatewayRouteHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HttpGatewayRouteHeader>(headers);
    }

    /**
     * <p>
     * The client request headers to match on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        The client request headers to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withHeaders(HttpGatewayRouteHeader... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<HttpGatewayRouteHeader>(headers.length));
        }
        for (HttpGatewayRouteHeader ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The client request headers to match on.
     * </p>
     * 
     * @param headers
     *        The client request headers to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withHeaders(java.util.Collection<HttpGatewayRouteHeader> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The host name to match on.
     * </p>
     * 
     * @param hostname
     *        The host name to match on.
     */

    public void setHostname(GatewayRouteHostnameMatch hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The host name to match on.
     * </p>
     * 
     * @return The host name to match on.
     */

    public GatewayRouteHostnameMatch getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The host name to match on.
     * </p>
     * 
     * @param hostname
     *        The host name to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withHostname(GatewayRouteHostnameMatch hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The method to match on.
     * </p>
     * 
     * @param method
     *        The method to match on.
     * @see HttpMethod
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The method to match on.
     * </p>
     * 
     * @return The method to match on.
     * @see HttpMethod
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The method to match on.
     * </p>
     * 
     * @param method
     *        The method to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public HttpGatewayRouteMatch withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The method to match on.
     * </p>
     * 
     * @param method
     *        The method to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public HttpGatewayRouteMatch withMethod(HttpMethod method) {
        this.method = method.toString();
        return this;
    }

    /**
     * <p>
     * The path to match on.
     * </p>
     * 
     * @param path
     *        The path to match on.
     */

    public void setPath(HttpPathMatch path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to match on.
     * </p>
     * 
     * @return The path to match on.
     */

    public HttpPathMatch getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to match on.
     * </p>
     * 
     * @param path
     *        The path to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withPath(HttpPathMatch path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by itself
     * matches all requests to the virtual service name. You can also match for path-based routing of requests. For
     * example, if your virtual service name is <code>my-service.local</code> and you want the route to match requests
     * to <code>my-service.local/metrics</code>, your prefix should be <code>/metrics</code>.
     * </p>
     * 
     * @param prefix
     *        Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by
     *        itself matches all requests to the virtual service name. You can also match for path-based routing of
     *        requests. For example, if your virtual service name is <code>my-service.local</code> and you want the
     *        route to match requests to <code>my-service.local/metrics</code>, your prefix should be
     *        <code>/metrics</code>.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by itself
     * matches all requests to the virtual service name. You can also match for path-based routing of requests. For
     * example, if your virtual service name is <code>my-service.local</code> and you want the route to match requests
     * to <code>my-service.local/metrics</code>, your prefix should be <code>/metrics</code>.
     * </p>
     * 
     * @return Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by
     *         itself matches all requests to the virtual service name. You can also match for path-based routing of
     *         requests. For example, if your virtual service name is <code>my-service.local</code> and you want the
     *         route to match requests to <code>my-service.local/metrics</code>, your prefix should be
     *         <code>/metrics</code>.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by itself
     * matches all requests to the virtual service name. You can also match for path-based routing of requests. For
     * example, if your virtual service name is <code>my-service.local</code> and you want the route to match requests
     * to <code>my-service.local/metrics</code>, your prefix should be <code>/metrics</code>.
     * </p>
     * 
     * @param prefix
     *        Specifies the path to match requests with. This parameter must always start with <code>/</code>, which by
     *        itself matches all requests to the virtual service name. You can also match for path-based routing of
     *        requests. For example, if your virtual service name is <code>my-service.local</code> and you want the
     *        route to match requests to <code>my-service.local/metrics</code>, your prefix should be
     *        <code>/metrics</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The query parameter to match on.
     * </p>
     * 
     * @return The query parameter to match on.
     */

    public java.util.List<HttpQueryParameter> getQueryParameters() {
        return queryParameters;
    }

    /**
     * <p>
     * The query parameter to match on.
     * </p>
     * 
     * @param queryParameters
     *        The query parameter to match on.
     */

    public void setQueryParameters(java.util.Collection<HttpQueryParameter> queryParameters) {
        if (queryParameters == null) {
            this.queryParameters = null;
            return;
        }

        this.queryParameters = new java.util.ArrayList<HttpQueryParameter>(queryParameters);
    }

    /**
     * <p>
     * The query parameter to match on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryParameters(java.util.Collection)} or {@link #withQueryParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queryParameters
     *        The query parameter to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withQueryParameters(HttpQueryParameter... queryParameters) {
        if (this.queryParameters == null) {
            setQueryParameters(new java.util.ArrayList<HttpQueryParameter>(queryParameters.length));
        }
        for (HttpQueryParameter ele : queryParameters) {
            this.queryParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The query parameter to match on.
     * </p>
     * 
     * @param queryParameters
     *        The query parameter to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpGatewayRouteMatch withQueryParameters(java.util.Collection<HttpQueryParameter> queryParameters) {
        setQueryParameters(queryParameters);
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
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getQueryParameters() != null)
            sb.append("QueryParameters: ").append(getQueryParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpGatewayRouteMatch == false)
            return false;
        HttpGatewayRouteMatch other = (HttpGatewayRouteMatch) obj;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getQueryParameters() == null ^ this.getQueryParameters() == null)
            return false;
        if (other.getQueryParameters() != null && other.getQueryParameters().equals(this.getQueryParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getQueryParameters() == null) ? 0 : getQueryParameters().hashCode());
        return hashCode;
    }

    @Override
    public HttpGatewayRouteMatch clone() {
        try {
            return (HttpGatewayRouteMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpGatewayRouteMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
