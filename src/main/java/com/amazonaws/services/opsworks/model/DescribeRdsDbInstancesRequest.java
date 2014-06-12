/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeRdsDbInstances(DescribeRdsDbInstancesRequest) DescribeRdsDbInstances operation}.
 * <p>
 * Describes Amazon RDS instances.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeRdsDbInstances(DescribeRdsDbInstancesRequest)
 */
public class DescribeRdsDbInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack ID that the instances are registered with. The operation
     * returns descriptions of all registered Amazon RDS instances.
     */
    private String stackId;

    /**
     * An array containing the ARNs of the instances to be described.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> rdsDbInstanceArns;

    /**
     * The stack ID that the instances are registered with. The operation
     * returns descriptions of all registered Amazon RDS instances.
     *
     * @return The stack ID that the instances are registered with. The operation
     *         returns descriptions of all registered Amazon RDS instances.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID that the instances are registered with. The operation
     * returns descriptions of all registered Amazon RDS instances.
     *
     * @param stackId The stack ID that the instances are registered with. The operation
     *         returns descriptions of all registered Amazon RDS instances.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID that the instances are registered with. The operation
     * returns descriptions of all registered Amazon RDS instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID that the instances are registered with. The operation
     *         returns descriptions of all registered Amazon RDS instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeRdsDbInstancesRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * An array containing the ARNs of the instances to be described.
     *
     * @return An array containing the ARNs of the instances to be described.
     */
    public java.util.List<String> getRdsDbInstanceArns() {
        if (rdsDbInstanceArns == null) {
              rdsDbInstanceArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              rdsDbInstanceArns.setAutoConstruct(true);
        }
        return rdsDbInstanceArns;
    }
    
    /**
     * An array containing the ARNs of the instances to be described.
     *
     * @param rdsDbInstanceArns An array containing the ARNs of the instances to be described.
     */
    public void setRdsDbInstanceArns(java.util.Collection<String> rdsDbInstanceArns) {
        if (rdsDbInstanceArns == null) {
            this.rdsDbInstanceArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> rdsDbInstanceArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(rdsDbInstanceArns.size());
        rdsDbInstanceArnsCopy.addAll(rdsDbInstanceArns);
        this.rdsDbInstanceArns = rdsDbInstanceArnsCopy;
    }
    
    /**
     * An array containing the ARNs of the instances to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rdsDbInstanceArns An array containing the ARNs of the instances to be described.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeRdsDbInstancesRequest withRdsDbInstanceArns(String... rdsDbInstanceArns) {
        if (getRdsDbInstanceArns() == null) setRdsDbInstanceArns(new java.util.ArrayList<String>(rdsDbInstanceArns.length));
        for (String value : rdsDbInstanceArns) {
            getRdsDbInstanceArns().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the ARNs of the instances to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rdsDbInstanceArns An array containing the ARNs of the instances to be described.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeRdsDbInstancesRequest withRdsDbInstanceArns(java.util.Collection<String> rdsDbInstanceArns) {
        if (rdsDbInstanceArns == null) {
            this.rdsDbInstanceArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> rdsDbInstanceArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(rdsDbInstanceArns.size());
            rdsDbInstanceArnsCopy.addAll(rdsDbInstanceArns);
            this.rdsDbInstanceArns = rdsDbInstanceArnsCopy;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getRdsDbInstanceArns() != null) sb.append("RdsDbInstanceArns: " + getRdsDbInstanceArns() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getRdsDbInstanceArns() == null) ? 0 : getRdsDbInstanceArns().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRdsDbInstancesRequest == false) return false;
        DescribeRdsDbInstancesRequest other = (DescribeRdsDbInstancesRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getRdsDbInstanceArns() == null ^ this.getRdsDbInstanceArns() == null) return false;
        if (other.getRdsDbInstanceArns() != null && other.getRdsDbInstanceArns().equals(this.getRdsDbInstanceArns()) == false) return false; 
        return true;
    }
    
}
    