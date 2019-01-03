/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The desired instance type and desired number of replicas of each index partition.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingParameters implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>.
     * </p>
     */
    private String desiredInstanceType;
    /**
     * <p>
     * The number of replicas you want to preconfigure for each index partition.
     * </p>
     */
    private Integer desiredReplicationCount;
    /**
     * <p>
     * The number of partitions you want to preconfigure for your domain. Only valid when you select
     * <code>m2.2xlarge</code> as the desired instance type.
     * </p>
     */
    private Integer desiredPartitionCount;

    /**
     * <p>
     * The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>.
     * </p>
     * 
     * @param desiredInstanceType
     *        The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>
     *        .
     * @see PartitionInstanceType
     */

    public void setDesiredInstanceType(String desiredInstanceType) {
        this.desiredInstanceType = desiredInstanceType;
    }

    /**
     * <p>
     * The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>.
     * </p>
     * 
     * @return The instance type that you want to preconfigure for your domain. For example,
     *         <code>search.m1.small</code>.
     * @see PartitionInstanceType
     */

    public String getDesiredInstanceType() {
        return this.desiredInstanceType;
    }

    /**
     * <p>
     * The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>.
     * </p>
     * 
     * @param desiredInstanceType
     *        The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionInstanceType
     */

    public ScalingParameters withDesiredInstanceType(String desiredInstanceType) {
        setDesiredInstanceType(desiredInstanceType);
        return this;
    }

    /**
     * <p>
     * The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>.
     * </p>
     * 
     * @param desiredInstanceType
     *        The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>
     *        .
     * @see PartitionInstanceType
     */

    public void setDesiredInstanceType(PartitionInstanceType desiredInstanceType) {
        withDesiredInstanceType(desiredInstanceType);
    }

    /**
     * <p>
     * The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>.
     * </p>
     * 
     * @param desiredInstanceType
     *        The instance type that you want to preconfigure for your domain. For example, <code>search.m1.small</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionInstanceType
     */

    public ScalingParameters withDesiredInstanceType(PartitionInstanceType desiredInstanceType) {
        this.desiredInstanceType = desiredInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of replicas you want to preconfigure for each index partition.
     * </p>
     * 
     * @param desiredReplicationCount
     *        The number of replicas you want to preconfigure for each index partition.
     */

    public void setDesiredReplicationCount(Integer desiredReplicationCount) {
        this.desiredReplicationCount = desiredReplicationCount;
    }

    /**
     * <p>
     * The number of replicas you want to preconfigure for each index partition.
     * </p>
     * 
     * @return The number of replicas you want to preconfigure for each index partition.
     */

    public Integer getDesiredReplicationCount() {
        return this.desiredReplicationCount;
    }

    /**
     * <p>
     * The number of replicas you want to preconfigure for each index partition.
     * </p>
     * 
     * @param desiredReplicationCount
     *        The number of replicas you want to preconfigure for each index partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingParameters withDesiredReplicationCount(Integer desiredReplicationCount) {
        setDesiredReplicationCount(desiredReplicationCount);
        return this;
    }

    /**
     * <p>
     * The number of partitions you want to preconfigure for your domain. Only valid when you select
     * <code>m2.2xlarge</code> as the desired instance type.
     * </p>
     * 
     * @param desiredPartitionCount
     *        The number of partitions you want to preconfigure for your domain. Only valid when you select
     *        <code>m2.2xlarge</code> as the desired instance type.
     */

    public void setDesiredPartitionCount(Integer desiredPartitionCount) {
        this.desiredPartitionCount = desiredPartitionCount;
    }

    /**
     * <p>
     * The number of partitions you want to preconfigure for your domain. Only valid when you select
     * <code>m2.2xlarge</code> as the desired instance type.
     * </p>
     * 
     * @return The number of partitions you want to preconfigure for your domain. Only valid when you select
     *         <code>m2.2xlarge</code> as the desired instance type.
     */

    public Integer getDesiredPartitionCount() {
        return this.desiredPartitionCount;
    }

    /**
     * <p>
     * The number of partitions you want to preconfigure for your domain. Only valid when you select
     * <code>m2.2xlarge</code> as the desired instance type.
     * </p>
     * 
     * @param desiredPartitionCount
     *        The number of partitions you want to preconfigure for your domain. Only valid when you select
     *        <code>m2.2xlarge</code> as the desired instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingParameters withDesiredPartitionCount(Integer desiredPartitionCount) {
        setDesiredPartitionCount(desiredPartitionCount);
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
        if (getDesiredInstanceType() != null)
            sb.append("DesiredInstanceType: ").append(getDesiredInstanceType()).append(",");
        if (getDesiredReplicationCount() != null)
            sb.append("DesiredReplicationCount: ").append(getDesiredReplicationCount()).append(",");
        if (getDesiredPartitionCount() != null)
            sb.append("DesiredPartitionCount: ").append(getDesiredPartitionCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingParameters == false)
            return false;
        ScalingParameters other = (ScalingParameters) obj;
        if (other.getDesiredInstanceType() == null ^ this.getDesiredInstanceType() == null)
            return false;
        if (other.getDesiredInstanceType() != null && other.getDesiredInstanceType().equals(this.getDesiredInstanceType()) == false)
            return false;
        if (other.getDesiredReplicationCount() == null ^ this.getDesiredReplicationCount() == null)
            return false;
        if (other.getDesiredReplicationCount() != null && other.getDesiredReplicationCount().equals(this.getDesiredReplicationCount()) == false)
            return false;
        if (other.getDesiredPartitionCount() == null ^ this.getDesiredPartitionCount() == null)
            return false;
        if (other.getDesiredPartitionCount() != null && other.getDesiredPartitionCount().equals(this.getDesiredPartitionCount()) == false)
            return false;
        return true;
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
    public ScalingParameters clone() {
        try {
            return (ScalingParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
