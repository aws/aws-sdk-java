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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Transport stream service descriptor configuration for the Multiplex program.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexProgramServiceDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexProgramServiceDescriptor implements Serializable, Cloneable, StructuredPojo {

    /** Name of the provider. */
    private String providerName;
    /** Name of the service. */
    private String serviceName;

    /**
     * Name of the provider.
     * 
     * @param providerName
     *        Name of the provider.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Name of the provider.
     * 
     * @return Name of the provider.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * Name of the provider.
     * 
     * @param providerName
     *        Name of the provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramServiceDescriptor withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * Name of the service.
     * 
     * @param serviceName
     *        Name of the service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Name of the service.
     * 
     * @return Name of the service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Name of the service.
     * 
     * @param serviceName
     *        Name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramServiceDescriptor withServiceName(String serviceName) {
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
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
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

        if (obj instanceof MultiplexProgramServiceDescriptor == false)
            return false;
        MultiplexProgramServiceDescriptor other = (MultiplexProgramServiceDescriptor) obj;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
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

        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexProgramServiceDescriptor clone() {
        try {
            return (MultiplexProgramServiceDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexProgramServiceDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
