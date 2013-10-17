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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyReservedInstances(ModifyReservedInstancesRequest) ModifyReservedInstances operation}.
 * <p>
 * The ModifyReservedInstances operation modifies the Availability Zone, instance count, instance type, or network platform (EC2-Classic or EC2-VPC) of
 * your Reserved Instances.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyReservedInstances(ModifyReservedInstancesRequest)
 */
public class ModifyReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A unique, case-sensitive, token you provide to ensure idempotency of
     * your modification request.
     */
    private String clientToken;

    /**
     * The IDs of the Reserved Instances to modify.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIds;

    /**
     * The configuration settings for the Reserved Instances to modify.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesConfiguration> targetConfigurations;

    /**
     * A unique, case-sensitive, token you provide to ensure idempotency of
     * your modification request.
     *
     * @return A unique, case-sensitive, token you provide to ensure idempotency of
     *         your modification request.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * A unique, case-sensitive, token you provide to ensure idempotency of
     * your modification request.
     *
     * @param clientToken A unique, case-sensitive, token you provide to ensure idempotency of
     *         your modification request.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * A unique, case-sensitive, token you provide to ensure idempotency of
     * your modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken A unique, case-sensitive, token you provide to ensure idempotency of
     *         your modification request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReservedInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The IDs of the Reserved Instances to modify.
     *
     * @return The IDs of the Reserved Instances to modify.
     */
    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
              reservedInstancesIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesIds.setAutoConstruct(true);
        }
        return reservedInstancesIds;
    }
    
    /**
     * The IDs of the Reserved Instances to modify.
     *
     * @param reservedInstancesIds The IDs of the Reserved Instances to modify.
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesIds.size());
        reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        this.reservedInstancesIds = reservedInstancesIdsCopy;
    }
    
    /**
     * The IDs of the Reserved Instances to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The IDs of the Reserved Instances to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) setReservedInstancesIds(new java.util.ArrayList<String>(reservedInstancesIds.length));
        for (String value : reservedInstancesIds) {
            getReservedInstancesIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Reserved Instances to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The IDs of the Reserved Instances to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesIds.size());
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
            this.reservedInstancesIds = reservedInstancesIdsCopy;
        }

        return this;
    }

    /**
     * The configuration settings for the Reserved Instances to modify.
     *
     * @return The configuration settings for the Reserved Instances to modify.
     */
    public java.util.List<ReservedInstancesConfiguration> getTargetConfigurations() {
        if (targetConfigurations == null) {
              targetConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesConfiguration>();
              targetConfigurations.setAutoConstruct(true);
        }
        return targetConfigurations;
    }
    
    /**
     * The configuration settings for the Reserved Instances to modify.
     *
     * @param targetConfigurations The configuration settings for the Reserved Instances to modify.
     */
    public void setTargetConfigurations(java.util.Collection<ReservedInstancesConfiguration> targetConfigurations) {
        if (targetConfigurations == null) {
            this.targetConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesConfiguration> targetConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesConfiguration>(targetConfigurations.size());
        targetConfigurationsCopy.addAll(targetConfigurations);
        this.targetConfigurations = targetConfigurationsCopy;
    }
    
    /**
     * The configuration settings for the Reserved Instances to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetConfigurations The configuration settings for the Reserved Instances to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReservedInstancesRequest withTargetConfigurations(ReservedInstancesConfiguration... targetConfigurations) {
        if (getTargetConfigurations() == null) setTargetConfigurations(new java.util.ArrayList<ReservedInstancesConfiguration>(targetConfigurations.length));
        for (ReservedInstancesConfiguration value : targetConfigurations) {
            getTargetConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * The configuration settings for the Reserved Instances to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetConfigurations The configuration settings for the Reserved Instances to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReservedInstancesRequest withTargetConfigurations(java.util.Collection<ReservedInstancesConfiguration> targetConfigurations) {
        if (targetConfigurations == null) {
            this.targetConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesConfiguration> targetConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedInstancesConfiguration>(targetConfigurations.size());
            targetConfigurationsCopy.addAll(targetConfigurations);
            this.targetConfigurations = targetConfigurationsCopy;
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
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getReservedInstancesIds() != null) sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getTargetConfigurations() != null) sb.append("TargetConfigurations: " + getTargetConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode()); 
        hashCode = prime * hashCode + ((getTargetConfigurations() == null) ? 0 : getTargetConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyReservedInstancesRequest == false) return false;
        ModifyReservedInstancesRequest other = (ModifyReservedInstancesRequest)obj;
        
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null) return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false) return false; 
        if (other.getTargetConfigurations() == null ^ this.getTargetConfigurations() == null) return false;
        if (other.getTargetConfigurations() != null && other.getTargetConfigurations().equals(this.getTargetConfigurations()) == false) return false; 
        return true;
    }
    
}
    