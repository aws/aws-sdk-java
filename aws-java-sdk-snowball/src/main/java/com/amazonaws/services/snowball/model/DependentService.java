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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name and version of the service dependant on the requested service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DependentService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DependentService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dependent service.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The version of the dependent service.
     * </p>
     */
    private ServiceVersion serviceVersion;

    /**
     * <p>
     * The name of the dependent service.
     * </p>
     * 
     * @param serviceName
     *        The name of the dependent service.
     * @see ServiceName
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the dependent service.
     * </p>
     * 
     * @return The name of the dependent service.
     * @see ServiceName
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the dependent service.
     * </p>
     * 
     * @param serviceName
     *        The name of the dependent service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceName
     */

    public DependentService withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the dependent service.
     * </p>
     * 
     * @param serviceName
     *        The name of the dependent service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceName
     */

    public DependentService withServiceName(ServiceName serviceName) {
        this.serviceName = serviceName.toString();
        return this;
    }

    /**
     * <p>
     * The version of the dependent service.
     * </p>
     * 
     * @param serviceVersion
     *        The version of the dependent service.
     */

    public void setServiceVersion(ServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    /**
     * <p>
     * The version of the dependent service.
     * </p>
     * 
     * @return The version of the dependent service.
     */

    public ServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * <p>
     * The version of the dependent service.
     * </p>
     * 
     * @param serviceVersion
     *        The version of the dependent service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependentService withServiceVersion(ServiceVersion serviceVersion) {
        setServiceVersion(serviceVersion);
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
        if (getServiceVersion() != null)
            sb.append("ServiceVersion: ").append(getServiceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DependentService == false)
            return false;
        DependentService other = (DependentService) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceVersion() == null ^ this.getServiceVersion() == null)
            return false;
        if (other.getServiceVersion() != null && other.getServiceVersion().equals(this.getServiceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceVersion() == null) ? 0 : getServiceVersion().hashCode());
        return hashCode;
    }

    @Override
    public DependentService clone() {
        try {
            return (DependentService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.DependentServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
