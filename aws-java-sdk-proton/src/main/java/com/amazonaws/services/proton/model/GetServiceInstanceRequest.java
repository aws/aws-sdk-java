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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a service instance that you want to get the detail data for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of a service instance that you want to get the detail data for.
     * </p>
     * 
     * @param name
     *        The name of a service instance that you want to get the detail data for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a service instance that you want to get the detail data for.
     * </p>
     * 
     * @return The name of a service instance that you want to get the detail data for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a service instance that you want to get the detail data for.
     * </p>
     * 
     * @param name
     *        The name of a service instance that you want to get the detail data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @return The name of the service that the service instance belongs to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceInstanceRequest withServiceName(String serviceName) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof GetServiceInstanceRequest == false)
            return false;
        GetServiceInstanceRequest other = (GetServiceInstanceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceInstanceRequest clone() {
        return (GetServiceInstanceRequest) super.clone();
    }

}
