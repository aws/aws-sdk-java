/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeServicesResult implements Serializable, Cloneable {

    /**
     * The list of services described.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Service> services;

    /**
     * Any failures associated with the call.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failures;

    /**
     * The list of services described.
     *
     * @return The list of services described.
     */
    public java.util.List<Service> getServices() {
        if (services == null) {
              services = new com.amazonaws.internal.ListWithAutoConstructFlag<Service>();
              services.setAutoConstruct(true);
        }
        return services;
    }
    
    /**
     * The list of services described.
     *
     * @param services The list of services described.
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
     * The list of services described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param services The list of services described.
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
     * The list of services described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param services The list of services described.
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
     * Any failures associated with the call.
     *
     * @return Any failures associated with the call.
     */
    public java.util.List<Failure> getFailures() {
        if (failures == null) {
              failures = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>();
              failures.setAutoConstruct(true);
        }
        return failures;
    }
    
    /**
     * Any failures associated with the call.
     *
     * @param failures Any failures associated with the call.
     */
    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failuresCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>(failures.size());
        failuresCopy.addAll(failures);
        this.failures = failuresCopy;
    }
    
    /**
     * Any failures associated with the call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failures Any failures associated with the call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeServicesResult withFailures(Failure... failures) {
        if (getFailures() == null) setFailures(new java.util.ArrayList<Failure>(failures.length));
        for (Failure value : failures) {
            getFailures().add(value);
        }
        return this;
    }
    
    /**
     * Any failures associated with the call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failures Any failures associated with the call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeServicesResult withFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failuresCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>(failures.size());
            failuresCopy.addAll(failures);
            this.failures = failuresCopy;
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
        if (getServices() != null) sb.append("Services: " + getServices() + ",");
        if (getFailures() != null) sb.append("Failures: " + getFailures() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode()); 
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode()); 
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
        if (other.getFailures() == null ^ this.getFailures() == null) return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeServicesResult clone() {
        try {
            return (DescribeServicesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    