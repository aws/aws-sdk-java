/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The desired instance type and desired number of replicas of each index
 * partition.
 * </p>
 */
public class ScalingParameters implements Serializable, Cloneable {

    /**
     * The instance type that you want to preconfigure for your domain. For
     * example, <code>search.m1.small</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>search.m1.small, search.m1.large, search.m2.xlarge, search.m2.2xlarge, search.m3.medium, search.m3.large, search.m3.xlarge, search.m3.2xlarge
     */
    private String desiredInstanceType;

    /**
     * The number of replicas you want to preconfigure for each index
     * partition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer desiredReplicationCount;

    /**
     * The number of partitions you want to preconfigure for your domain.
     * Only valid when you select <code>m2.2xlarge</code> as the desired
     * instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer desiredPartitionCount;

    /**
     * The instance type that you want to preconfigure for your domain. For
     * example, <code>search.m1.small</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>search.m1.small, search.m1.large, search.m2.xlarge, search.m2.2xlarge, search.m3.medium, search.m3.large, search.m3.xlarge, search.m3.2xlarge
     *
     * @return The instance type that you want to preconfigure for your domain. For
     *         example, <code>search.m1.small</code>.
     *
     * @see PartitionInstanceType
     */
    public String getDesiredInstanceType() {
        return desiredInstanceType;
    }
    
    /**
     * The instance type that you want to preconfigure for your domain. For
     * example, <code>search.m1.small</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>search.m1.small, search.m1.large, search.m2.xlarge, search.m2.2xlarge, search.m3.medium, search.m3.large, search.m3.xlarge, search.m3.2xlarge
     *
     * @param desiredInstanceType The instance type that you want to preconfigure for your domain. For
     *         example, <code>search.m1.small</code>.
     *
     * @see PartitionInstanceType
     */
    public void setDesiredInstanceType(String desiredInstanceType) {
        this.desiredInstanceType = desiredInstanceType;
    }
    
    /**
     * The instance type that you want to preconfigure for your domain. For
     * example, <code>search.m1.small</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>search.m1.small, search.m1.large, search.m2.xlarge, search.m2.2xlarge, search.m3.medium, search.m3.large, search.m3.xlarge, search.m3.2xlarge
     *
     * @param desiredInstanceType The instance type that you want to preconfigure for your domain. For
     *         example, <code>search.m1.small</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PartitionInstanceType
     */
    public ScalingParameters withDesiredInstanceType(String desiredInstanceType) {
        this.desiredInstanceType = desiredInstanceType;
        return this;
    }

    /**
     * The instance type that you want to preconfigure for your domain. For
     * example, <code>search.m1.small</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>search.m1.small, search.m1.large, search.m2.xlarge, search.m2.2xlarge, search.m3.medium, search.m3.large, search.m3.xlarge, search.m3.2xlarge
     *
     * @param desiredInstanceType The instance type that you want to preconfigure for your domain. For
     *         example, <code>search.m1.small</code>.
     *
     * @see PartitionInstanceType
     */
    public void setDesiredInstanceType(PartitionInstanceType desiredInstanceType) {
        this.desiredInstanceType = desiredInstanceType.toString();
    }
    
    /**
     * The instance type that you want to preconfigure for your domain. For
     * example, <code>search.m1.small</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>search.m1.small, search.m1.large, search.m2.xlarge, search.m2.2xlarge, search.m3.medium, search.m3.large, search.m3.xlarge, search.m3.2xlarge
     *
     * @param desiredInstanceType The instance type that you want to preconfigure for your domain. For
     *         example, <code>search.m1.small</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PartitionInstanceType
     */
    public ScalingParameters withDesiredInstanceType(PartitionInstanceType desiredInstanceType) {
        this.desiredInstanceType = desiredInstanceType.toString();
        return this;
    }

    /**
     * The number of replicas you want to preconfigure for each index
     * partition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of replicas you want to preconfigure for each index
     *         partition.
     */
    public Integer getDesiredReplicationCount() {
        return desiredReplicationCount;
    }
    
    /**
     * The number of replicas you want to preconfigure for each index
     * partition.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param desiredReplicationCount The number of replicas you want to preconfigure for each index
     *         partition.
     */
    public void setDesiredReplicationCount(Integer desiredReplicationCount) {
        this.desiredReplicationCount = desiredReplicationCount;
    }
    
    /**
     * The number of replicas you want to preconfigure for each index
     * partition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param desiredReplicationCount The number of replicas you want to preconfigure for each index
     *         partition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingParameters withDesiredReplicationCount(Integer desiredReplicationCount) {
        this.desiredReplicationCount = desiredReplicationCount;
        return this;
    }

    /**
     * The number of partitions you want to preconfigure for your domain.
     * Only valid when you select <code>m2.2xlarge</code> as the desired
     * instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of partitions you want to preconfigure for your domain.
     *         Only valid when you select <code>m2.2xlarge</code> as the desired
     *         instance type.
     */
    public Integer getDesiredPartitionCount() {
        return desiredPartitionCount;
    }
    
    /**
     * The number of partitions you want to preconfigure for your domain.
     * Only valid when you select <code>m2.2xlarge</code> as the desired
     * instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param desiredPartitionCount The number of partitions you want to preconfigure for your domain.
     *         Only valid when you select <code>m2.2xlarge</code> as the desired
     *         instance type.
     */
    public void setDesiredPartitionCount(Integer desiredPartitionCount) {
        this.desiredPartitionCount = desiredPartitionCount;
    }
    
    /**
     * The number of partitions you want to preconfigure for your domain.
     * Only valid when you select <code>m2.2xlarge</code> as the desired
     * instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param desiredPartitionCount The number of partitions you want to preconfigure for your domain.
     *         Only valid when you select <code>m2.2xlarge</code> as the desired
     *         instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingParameters withDesiredPartitionCount(Integer desiredPartitionCount) {
        this.desiredPartitionCount = desiredPartitionCount;
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
        if (getDesiredInstanceType() != null) sb.append("DesiredInstanceType: " + getDesiredInstanceType() + ",");
        if (getDesiredReplicationCount() != null) sb.append("DesiredReplicationCount: " + getDesiredReplicationCount() + ",");
        if (getDesiredPartitionCount() != null) sb.append("DesiredPartitionCount: " + getDesiredPartitionCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDesiredInstanceType() == null) ? 0 : getDesiredInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredReplicationCount() == null) ? 0 : getDesiredReplicationCount().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredPartitionCount() == null) ? 0 : getDesiredPartitionCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScalingParameters == false) return false;
        ScalingParameters other = (ScalingParameters)obj;
        
        if (other.getDesiredInstanceType() == null ^ this.getDesiredInstanceType() == null) return false;
        if (other.getDesiredInstanceType() != null && other.getDesiredInstanceType().equals(this.getDesiredInstanceType()) == false) return false; 
        if (other.getDesiredReplicationCount() == null ^ this.getDesiredReplicationCount() == null) return false;
        if (other.getDesiredReplicationCount() != null && other.getDesiredReplicationCount().equals(this.getDesiredReplicationCount()) == false) return false; 
        if (other.getDesiredPartitionCount() == null ^ this.getDesiredPartitionCount() == null) return false;
        if (other.getDesiredPartitionCount() != null && other.getDesiredPartitionCount().equals(this.getDesiredPartitionCount()) == false) return false; 
        return true;
    }
    
    @Override
    public ScalingParameters clone() {
        try {
            return (ScalingParameters) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    