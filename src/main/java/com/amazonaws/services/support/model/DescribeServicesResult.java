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
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 */
public class DescribeServicesResult implements Serializable {

    /**
     * JSON-formatted list of AWS services.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Service> services;

    /**
     * JSON-formatted list of AWS services.
     *
     * @return JSON-formatted list of AWS services.
     */
    public java.util.List<Service> getServices() {
        if (services == null) {
              services = new com.amazonaws.internal.ListWithAutoConstructFlag<Service>();
              services.setAutoConstruct(true);
        }
        return services;
    }
    
    /**
     * JSON-formatted list of AWS services.
     *
     * @param services JSON-formatted list of AWS services.
     */
    public void setServices(java.util.Collection<Service> services) {
        if (services == null) {
            this.services = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Service> servicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Service>(services.size());
        servicesCopy.addAll(services);
        this.services = servicesCopy;
    }
    
    /**
     * JSON-formatted list of AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param services JSON-formatted list of AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServicesResult withServices(Service... services) {
        if (getServices() == null) setServices(new java.util.ArrayList<Service>(services.length));
        for (Service value : services) {
            getServices().add(value);
        }
        return this;
    }
    
    /**
     * JSON-formatted list of AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param services JSON-formatted list of AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServicesResult withServices(java.util.Collection<Service> services) {
        if (services == null) {
            this.services = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Service> servicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Service>(services.size());
            servicesCopy.addAll(services);
            this.services = servicesCopy;
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
        if (getServices() != null) sb.append("Services: " + getServices() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeServicesResult == false) return false;
        DescribeServicesResult other = (DescribeServicesResult)obj;
        
        if (other.getServices() == null ^ this.getServices() == null) return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false) return false; 
        return true;
    }
    
}
    