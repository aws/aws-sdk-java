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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetServicesInScope" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServicesInScopeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata associated with the aAWS service.
     * </p>
     */
    private java.util.List<ServiceMetadata> serviceMetadata;

    /**
     * <p>
     * The metadata associated with the aAWS service.
     * </p>
     * 
     * @return The metadata associated with the aAWS service.
     */

    public java.util.List<ServiceMetadata> getServiceMetadata() {
        return serviceMetadata;
    }

    /**
     * <p>
     * The metadata associated with the aAWS service.
     * </p>
     * 
     * @param serviceMetadata
     *        The metadata associated with the aAWS service.
     */

    public void setServiceMetadata(java.util.Collection<ServiceMetadata> serviceMetadata) {
        if (serviceMetadata == null) {
            this.serviceMetadata = null;
            return;
        }

        this.serviceMetadata = new java.util.ArrayList<ServiceMetadata>(serviceMetadata);
    }

    /**
     * <p>
     * The metadata associated with the aAWS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceMetadata(java.util.Collection)} or {@link #withServiceMetadata(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serviceMetadata
     *        The metadata associated with the aAWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServicesInScopeResult withServiceMetadata(ServiceMetadata... serviceMetadata) {
        if (this.serviceMetadata == null) {
            setServiceMetadata(new java.util.ArrayList<ServiceMetadata>(serviceMetadata.length));
        }
        for (ServiceMetadata ele : serviceMetadata) {
            this.serviceMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata associated with the aAWS service.
     * </p>
     * 
     * @param serviceMetadata
     *        The metadata associated with the aAWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServicesInScopeResult withServiceMetadata(java.util.Collection<ServiceMetadata> serviceMetadata) {
        setServiceMetadata(serviceMetadata);
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
        if (getServiceMetadata() != null)
            sb.append("ServiceMetadata: ").append(getServiceMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServicesInScopeResult == false)
            return false;
        GetServicesInScopeResult other = (GetServicesInScopeResult) obj;
        if (other.getServiceMetadata() == null ^ this.getServiceMetadata() == null)
            return false;
        if (other.getServiceMetadata() != null && other.getServiceMetadata().equals(this.getServiceMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceMetadata() == null) ? 0 : getServiceMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetServicesInScopeResult clone() {
        try {
            return (GetServicesInScopeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
