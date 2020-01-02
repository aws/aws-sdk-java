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
 * An object that represents the criteria for determining a request match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GrpcRouteMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcRouteMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     */
    private java.util.List<GrpcRouteMetadata> metadata;
    /**
     * <p>
     * The method name to match from the request. If you specify a name, you must also specify a
     * <code>serviceName</code>.
     * </p>
     */
    private String methodName;
    /**
     * <p>
     * The fully qualified domain name for the service to match from the request.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * 
     * @return An object that represents the data to match from the request.
     */

    public java.util.List<GrpcRouteMetadata> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * 
     * @param metadata
     *        An object that represents the data to match from the request.
     */

    public void setMetadata(java.util.Collection<GrpcRouteMetadata> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new java.util.ArrayList<GrpcRouteMetadata>(metadata);
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadata(java.util.Collection)} or {@link #withMetadata(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metadata
     *        An object that represents the data to match from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcRouteMatch withMetadata(GrpcRouteMetadata... metadata) {
        if (this.metadata == null) {
            setMetadata(new java.util.ArrayList<GrpcRouteMetadata>(metadata.length));
        }
        for (GrpcRouteMetadata ele : metadata) {
            this.metadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * 
     * @param metadata
     *        An object that represents the data to match from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcRouteMatch withMetadata(java.util.Collection<GrpcRouteMetadata> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you must also specify a
     * <code>serviceName</code>.
     * </p>
     * 
     * @param methodName
     *        The method name to match from the request. If you specify a name, you must also specify a
     *        <code>serviceName</code>.
     */

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you must also specify a
     * <code>serviceName</code>.
     * </p>
     * 
     * @return The method name to match from the request. If you specify a name, you must also specify a
     *         <code>serviceName</code>.
     */

    public String getMethodName() {
        return this.methodName;
    }

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you must also specify a
     * <code>serviceName</code>.
     * </p>
     * 
     * @param methodName
     *        The method name to match from the request. If you specify a name, you must also specify a
     *        <code>serviceName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcRouteMatch withMethodName(String methodName) {
        setMethodName(methodName);
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

    public GrpcRouteMatch withServiceName(String serviceName) {
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getMethodName() != null)
            sb.append("MethodName: ").append(getMethodName()).append(",");
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

        if (obj instanceof GrpcRouteMatch == false)
            return false;
        GrpcRouteMatch other = (GrpcRouteMatch) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getMethodName() == null ^ this.getMethodName() == null)
            return false;
        if (other.getMethodName() != null && other.getMethodName().equals(this.getMethodName()) == false)
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

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getMethodName() == null) ? 0 : getMethodName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public GrpcRouteMatch clone() {
        try {
            return (GrpcRouteMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GrpcRouteMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
