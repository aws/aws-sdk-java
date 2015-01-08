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
public class DescribeContainerInstancesResult implements Serializable {

    /**
     * The list of container instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ContainerInstance> containerInstances;

    /**
     * 
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failures;

    /**
     * The list of container instances.
     *
     * @return The list of container instances.
     */
    public java.util.List<ContainerInstance> getContainerInstances() {
        if (containerInstances == null) {
              containerInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerInstance>();
              containerInstances.setAutoConstruct(true);
        }
        return containerInstances;
    }
    
    /**
     * The list of container instances.
     *
     * @param containerInstances The list of container instances.
     */
    public void setContainerInstances(java.util.Collection<ContainerInstance> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ContainerInstance> containerInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerInstance>(containerInstances.size());
        containerInstancesCopy.addAll(containerInstances);
        this.containerInstances = containerInstancesCopy;
    }
    
    /**
     * The list of container instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstances The list of container instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeContainerInstancesResult withContainerInstances(ContainerInstance... containerInstances) {
        if (getContainerInstances() == null) setContainerInstances(new java.util.ArrayList<ContainerInstance>(containerInstances.length));
        for (ContainerInstance value : containerInstances) {
            getContainerInstances().add(value);
        }
        return this;
    }
    
    /**
     * The list of container instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstances The list of container instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeContainerInstancesResult withContainerInstances(java.util.Collection<ContainerInstance> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ContainerInstance> containerInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerInstance>(containerInstances.size());
            containerInstancesCopy.addAll(containerInstances);
            this.containerInstances = containerInstancesCopy;
        }

        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public java.util.List<Failure> getFailures() {
        if (failures == null) {
              failures = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>();
              failures.setAutoConstruct(true);
        }
        return failures;
    }
    
    /**
     * 
     *
     * @param failures 
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
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failures 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeContainerInstancesResult withFailures(Failure... failures) {
        if (getFailures() == null) setFailures(new java.util.ArrayList<Failure>(failures.length));
        for (Failure value : failures) {
            getFailures().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failures 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeContainerInstancesResult withFailures(java.util.Collection<Failure> failures) {
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
        if (getContainerInstances() != null) sb.append("ContainerInstances: " + getContainerInstances() + ",");
        if (getFailures() != null) sb.append("Failures: " + getFailures() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerInstances() == null) ? 0 : getContainerInstances().hashCode()); 
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeContainerInstancesResult == false) return false;
        DescribeContainerInstancesResult other = (DescribeContainerInstancesResult)obj;
        
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null) return false;
        if (other.getContainerInstances() != null && other.getContainerInstances().equals(this.getContainerInstances()) == false) return false; 
        if (other.getFailures() == null ^ this.getFailures() == null) return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false) return false; 
        return true;
    }
    
}
    