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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service instance detail data that's returned by AWS Proton.
     * </p>
     */
    private ServiceInstance serviceInstance;

    /**
     * <p>
     * The service instance detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param serviceInstance
     *        The service instance detail data that's returned by AWS Proton.
     */

    public void setServiceInstance(ServiceInstance serviceInstance) {
        this.serviceInstance = serviceInstance;
    }

    /**
     * <p>
     * The service instance detail data that's returned by AWS Proton.
     * </p>
     * 
     * @return The service instance detail data that's returned by AWS Proton.
     */

    public ServiceInstance getServiceInstance() {
        return this.serviceInstance;
    }

    /**
     * <p>
     * The service instance detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param serviceInstance
     *        The service instance detail data that's returned by AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceInstanceResult withServiceInstance(ServiceInstance serviceInstance) {
        setServiceInstance(serviceInstance);
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
        if (getServiceInstance() != null)
            sb.append("ServiceInstance: ").append(getServiceInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceInstanceResult == false)
            return false;
        GetServiceInstanceResult other = (GetServiceInstanceResult) obj;
        if (other.getServiceInstance() == null ^ this.getServiceInstance() == null)
            return false;
        if (other.getServiceInstance() != null && other.getServiceInstance().equals(this.getServiceInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceInstance() == null) ? 0 : getServiceInstance().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceInstanceResult clone() {
        try {
            return (GetServiceInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
