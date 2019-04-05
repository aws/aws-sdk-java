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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the requirements for a route to match HTTP requests for a virtual router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpRouteMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpRouteMatch implements Serializable, Cloneable, StructuredPojo {

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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
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
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
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
