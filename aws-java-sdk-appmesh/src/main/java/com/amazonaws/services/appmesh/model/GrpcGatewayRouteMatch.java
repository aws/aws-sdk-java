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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GrpcGatewayRouteMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcGatewayRouteMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The gateway route host name to be matched on.
     * </p>
     */
    private GatewayRouteHostnameMatch hostname;
    /**
     * <p>
     * The gateway route metadata to be matched on.
     * </p>
     */
    private java.util.List<GrpcGatewayRouteMetadata> metadata;
    /**
     * <p>
     * The fully qualified domain name for the service to match from the request.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The gateway route host name to be matched on.
     * </p>
     * 
     * @param hostname
     *        The gateway route host name to be matched on.
     */

    public void setHostname(GatewayRouteHostnameMatch hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The gateway route host name to be matched on.
     * </p>
     * 
     * @return The gateway route host name to be matched on.
     */

    public GatewayRouteHostnameMatch getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The gateway route host name to be matched on.
     * </p>
     * 
     * @param hostname
     *        The gateway route host name to be matched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcGatewayRouteMatch withHostname(GatewayRouteHostnameMatch hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The gateway route metadata to be matched on.
     * </p>
     * 
     * @return The gateway route metadata to be matched on.
     */

    public java.util.List<GrpcGatewayRouteMetadata> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The gateway route metadata to be matched on.
     * </p>
     * 
     * @param metadata
     *        The gateway route metadata to be matched on.
     */

    public void setMetadata(java.util.Collection<GrpcGatewayRouteMetadata> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new java.util.ArrayList<GrpcGatewayRouteMetadata>(metadata);
    }

    /**
     * <p>
     * The gateway route metadata to be matched on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadata(java.util.Collection)} or {@link #withMetadata(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metadata
     *        The gateway route metadata to be matched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcGatewayRouteMatch withMetadata(GrpcGatewayRouteMetadata... metadata) {
        if (this.metadata == null) {
            setMetadata(new java.util.ArrayList<GrpcGatewayRouteMetadata>(metadata.length));
        }
        for (GrpcGatewayRouteMetadata ele : metadata) {
            this.metadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The gateway route metadata to be matched on.
     * </p>
     * 
     * @param metadata
     *        The gateway route metadata to be matched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcGatewayRouteMatch withMetadata(java.util.Collection<GrpcGatewayRouteMetadata> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name for the service to match from the request.
     * </p>
     * 
     * @param serviceName
     *        The fully qualified domain name for the service to match from the request.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The fully qualified domain name for the service to match from the request.
     * </p>
     * 
     * @return The fully qualified domain name for the service to match from the request.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The fully qualified domain name for the service to match from the request.
     * </p>
     * 
     * @param serviceName
     *        The fully qualified domain name for the service to match from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcGatewayRouteMatch withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrpcGatewayRouteMatch == false)
            return false;
        GrpcGatewayRouteMatch other = (GrpcGatewayRouteMatch) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public GrpcGatewayRouteMatch clone() {
        try {
            return (GrpcGatewayRouteMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GrpcGatewayRouteMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
