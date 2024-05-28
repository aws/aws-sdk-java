/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for information about VPC endpoints that were created to other services
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ServiceVpcEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceVpcEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service for which a VPC endpoint was created.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The unique identifier of the VPC endpoint that was created.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The name of the service for which a VPC endpoint was created.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which a VPC endpoint was created.
     * @see VpcEndpointServiceName
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service for which a VPC endpoint was created.
     * </p>
     * 
     * @return The name of the service for which a VPC endpoint was created.
     * @see VpcEndpointServiceName
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service for which a VPC endpoint was created.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which a VPC endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointServiceName
     */

    public ServiceVpcEndpoint withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the service for which a VPC endpoint was created.
     * </p>
     * 
     * @param serviceName
     *        The name of the service for which a VPC endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointServiceName
     */

    public ServiceVpcEndpoint withServiceName(VpcEndpointServiceName serviceName) {
        this.serviceName = serviceName.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC endpoint that was created.
     * </p>
     * 
     * @param vpcEndpointId
     *        The unique identifier of the VPC endpoint that was created.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The unique identifier of the VPC endpoint that was created.
     * </p>
     * 
     * @return The unique identifier of the VPC endpoint that was created.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The unique identifier of the VPC endpoint that was created.
     * </p>
     * 
     * @param vpcEndpointId
     *        The unique identifier of the VPC endpoint that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceVpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceVpcEndpoint == false)
            return false;
        ServiceVpcEndpoint other = (ServiceVpcEndpoint) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public ServiceVpcEndpoint clone() {
        try {
            return (ServiceVpcEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.ServiceVpcEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
