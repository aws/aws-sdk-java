/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>DescribeServiceErrors</code> request.
 * </p>
 */
public class DescribeServiceErrorsResult implements Serializable {

    /**
     * An array of <code>ServiceError</code> objects that describe the
     * specified service errors.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ServiceError> serviceErrors;

    /**
     * An array of <code>ServiceError</code> objects that describe the
     * specified service errors.
     *
     * @return An array of <code>ServiceError</code> objects that describe the
     *         specified service errors.
     */
    public java.util.List<ServiceError> getServiceErrors() {
        if (serviceErrors == null) {
              serviceErrors = new com.amazonaws.internal.ListWithAutoConstructFlag<ServiceError>();
              serviceErrors.setAutoConstruct(true);
        }
        return serviceErrors;
    }
    
    /**
     * An array of <code>ServiceError</code> objects that describe the
     * specified service errors.
     *
     * @param serviceErrors An array of <code>ServiceError</code> objects that describe the
     *         specified service errors.
     */
    public void setServiceErrors(java.util.Collection<ServiceError> serviceErrors) {
        if (serviceErrors == null) {
            this.serviceErrors = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ServiceError> serviceErrorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ServiceError>(serviceErrors.size());
        serviceErrorsCopy.addAll(serviceErrors);
        this.serviceErrors = serviceErrorsCopy;
    }
    
    /**
     * An array of <code>ServiceError</code> objects that describe the
     * specified service errors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceErrors An array of <code>ServiceError</code> objects that describe the
     *         specified service errors.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServiceErrorsResult withServiceErrors(ServiceError... serviceErrors) {
        if (getServiceErrors() == null) setServiceErrors(new java.util.ArrayList<ServiceError>(serviceErrors.length));
        for (ServiceError value : serviceErrors) {
            getServiceErrors().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>ServiceError</code> objects that describe the
     * specified service errors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceErrors An array of <code>ServiceError</code> objects that describe the
     *         specified service errors.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServiceErrorsResult withServiceErrors(java.util.Collection<ServiceError> serviceErrors) {
        if (serviceErrors == null) {
            this.serviceErrors = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ServiceError> serviceErrorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ServiceError>(serviceErrors.size());
            serviceErrorsCopy.addAll(serviceErrors);
            this.serviceErrors = serviceErrorsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceErrors() != null) sb.append("ServiceErrors: " + getServiceErrors() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServiceErrors() == null) ? 0 : getServiceErrors().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeServiceErrorsResult == false) return false;
        DescribeServiceErrorsResult other = (DescribeServiceErrorsResult)obj;
        
        if (other.getServiceErrors() == null ^ this.getServiceErrors() == null) return false;
        if (other.getServiceErrors() != null && other.getServiceErrors().equals(this.getServiceErrors()) == false) return false; 
        return true;
    }
    
}
    