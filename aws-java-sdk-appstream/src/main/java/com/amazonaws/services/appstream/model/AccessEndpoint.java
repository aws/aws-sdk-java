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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an interface VPC endpoint (interface endpoint) that lets you create a private connection between the
 * virtual private cloud (VPC) that you specify and AppStream 2.0. When you specify an interface endpoint for a stack,
 * users of the stack can connect to AppStream 2.0 only through that endpoint. When you specify an interface endpoint
 * for an image builder, administrators can connect to the image builder only through that endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AccessEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of interface endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     * </p>
     */
    private String vpceId;

    /**
     * <p>
     * The type of interface endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of interface endpoint.
     * @see AccessEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of interface endpoint.
     * </p>
     * 
     * @return The type of interface endpoint.
     * @see AccessEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of interface endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of interface endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessEndpointType
     */

    public AccessEndpoint withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of interface endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of interface endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessEndpointType
     */

    public AccessEndpoint withEndpointType(AccessEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     * </p>
     * 
     * @param vpceId
     *        The identifier (ID) of the VPC in which the interface endpoint is used.
     */

    public void setVpceId(String vpceId) {
        this.vpceId = vpceId;
    }

    /**
     * <p>
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     * </p>
     * 
     * @return The identifier (ID) of the VPC in which the interface endpoint is used.
     */

    public String getVpceId() {
        return this.vpceId;
    }

    /**
     * <p>
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     * </p>
     * 
     * @param vpceId
     *        The identifier (ID) of the VPC in which the interface endpoint is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEndpoint withVpceId(String vpceId) {
        setVpceId(vpceId);
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
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getVpceId() != null)
            sb.append("VpceId: ").append(getVpceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessEndpoint == false)
            return false;
        AccessEndpoint other = (AccessEndpoint) obj;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getVpceId() == null ^ this.getVpceId() == null)
            return false;
        if (other.getVpceId() != null && other.getVpceId().equals(this.getVpceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getVpceId() == null) ? 0 : getVpceId().hashCode());
        return hashCode;
    }

    @Override
    public AccessEndpoint clone() {
        try {
            return (AccessEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.AccessEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
