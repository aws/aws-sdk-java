/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that represents the requirements for a route to match HTTP requests for a virtual router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpRouteMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpRouteMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     */
    private java.util.List<HttpRouteHeader> headers;
    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     */
    private String method;
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
     * The client request scheme to match on. Specify only one.
     * </p>
     */
    private String scheme;

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     * 
     * @return An object that represents the client request headers to match on.
     */

    public java.util.List<HttpRouteHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     * 
     * @param headers
     *        An object that represents the client request headers to match on.
     */

    public void setHeaders(java.util.Collection<HttpRouteHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HttpRouteHeader>(headers);
    }

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        An object that represents the client request headers to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRouteMatch withHeaders(HttpRouteHeader... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<HttpRouteHeader>(headers.length));
        }
        for (HttpRouteHeader ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the client request headers to match on.
     * </p>
     * 
     * @param headers
     *        An object that represents the client request headers to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRouteMatch withHeaders(java.util.Collection<HttpRouteHeader> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * 
     * @param method
     *        The client request method to match on. Specify only one.
     * @see HttpMethod
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * 
     * @return The client request method to match on. Specify only one.
     * @see HttpMethod
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * 
     * @param method
     *        The client request method to match on. Specify only one.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public HttpRouteMatch withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The client request method to match on. Specify only one.
     * </p>
     * 
     * @param method
     *        The client request method to match on. Specify only one.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public HttpRouteMatch withMethod(HttpMethod method) {
        this.method = method.toString();
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

    public HttpRouteMatch withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * 
     * @param scheme
     *        The client request scheme to match on. Specify only one.
     * @see HttpScheme
     */

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * 
     * @return The client request scheme to match on. Specify only one.
     * @see HttpScheme
     */

    public String getScheme() {
        return this.scheme;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * 
     * @param scheme
     *        The client request scheme to match on. Specify only one.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpScheme
     */

    public HttpRouteMatch withScheme(String scheme) {
        setScheme(scheme);
        return this;
    }

    /**
     * <p>
     * The client request scheme to match on. Specify only one.
     * </p>
     * 
     * @param scheme
     *        The client request scheme to match on. Specify only one.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpScheme
     */

    public HttpRouteMatch withScheme(HttpScheme scheme) {
        this.scheme = scheme.toString();
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
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getScheme() != null)
            sb.append("Scheme: ").append(getScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRouteMatch == false)
            return false;
        HttpRouteMatch other = (HttpRouteMatch) obj;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        return hashCode;
    }

    @Override
    public HttpRouteMatch clone() {
        try {
            return (HttpRouteMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpRouteMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
