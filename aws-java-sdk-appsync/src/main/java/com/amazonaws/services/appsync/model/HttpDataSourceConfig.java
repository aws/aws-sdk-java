/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Http data source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/HttpDataSourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpDataSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Http url endpoint. You can either specify the domain name or ip and port combination and the url scheme must
     * be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http endpoint and port 443
     * for https endpoints.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The Http url endpoint. You can either specify the domain name or ip and port combination and the url scheme must
     * be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http endpoint and port 443
     * for https endpoints.
     * </p>
     * 
     * @param endpoint
     *        The Http url endpoint. You can either specify the domain name or ip and port combination and the url
     *        scheme must be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http
     *        endpoint and port 443 for https endpoints.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The Http url endpoint. You can either specify the domain name or ip and port combination and the url scheme must
     * be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http endpoint and port 443
     * for https endpoints.
     * </p>
     * 
     * @return The Http url endpoint. You can either specify the domain name or ip and port combination and the url
     *         scheme must be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http
     *         endpoint and port 443 for https endpoints.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The Http url endpoint. You can either specify the domain name or ip and port combination and the url scheme must
     * be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http endpoint and port 443
     * for https endpoints.
     * </p>
     * 
     * @param endpoint
     *        The Http url endpoint. You can either specify the domain name or ip and port combination and the url
     *        scheme must be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http
     *        endpoint and port 443 for https endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpDataSourceConfig withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpDataSourceConfig == false)
            return false;
        HttpDataSourceConfig other = (HttpDataSourceConfig) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public HttpDataSourceConfig clone() {
        try {
            return (HttpDataSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.HttpDataSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
