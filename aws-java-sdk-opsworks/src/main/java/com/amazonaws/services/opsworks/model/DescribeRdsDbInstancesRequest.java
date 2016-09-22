/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeRdsDbInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID that the instances are registered with. The operation returns descriptions of all registered Amazon
     * RDS instances.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * An array containing the ARNs of the instances to be described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> rdsDbInstanceArns;

    /**
     * <p>
     * The stack ID that the instances are registered with. The operation returns descriptions of all registered Amazon
     * RDS instances.
     * </p>
     * 
     * @param stackId
     *        The stack ID that the instances are registered with. The operation returns descriptions of all registered
     *        Amazon RDS instances.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID that the instances are registered with. The operation returns descriptions of all registered Amazon
     * RDS instances.
     * </p>
     * 
     * @return The stack ID that the instances are registered with. The operation returns descriptions of all registered
     *         Amazon RDS instances.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID that the instances are registered with. The operation returns descriptions of all registered Amazon
     * RDS instances.
     * </p>
     * 
     * @param stackId
     *        The stack ID that the instances are registered with. The operation returns descriptions of all registered
     *        Amazon RDS instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRdsDbInstancesRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * An array containing the ARNs of the instances to be described.
     * </p>
     * 
     * @return An array containing the ARNs of the instances to be described.
     */

    public java.util.List<String> getRdsDbInstanceArns() {
        if (rdsDbInstanceArns == null) {
            rdsDbInstanceArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return rdsDbInstanceArns;
    }

    /**
     * <p>
     * An array containing the ARNs of the instances to be described.
     * </p>
     * 
     * @param rdsDbInstanceArns
     *        An array containing the ARNs of the instances to be described.
     */

    public void setRdsDbInstanceArns(java.util.Collection<String> rdsDbInstanceArns) {
        if (rdsDbInstanceArns == null) {
            this.rdsDbInstanceArns = null;
            return;
        }

        this.rdsDbInstanceArns = new com.amazonaws.internal.SdkInternalList<String>(rdsDbInstanceArns);
    }

    /**
     * <p>
     * An array containing the ARNs of the instances to be described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRdsDbInstanceArns(java.util.Collection)} or {@link #withRdsDbInstanceArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param rdsDbInstanceArns
     *        An array containing the ARNs of the instances to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRdsDbInstancesRequest withRdsDbInstanceArns(String... rdsDbInstanceArns) {
        if (this.rdsDbInstanceArns == null) {
            setRdsDbInstanceArns(new com.amazonaws.internal.SdkInternalList<String>(rdsDbInstanceArns.length));
        }
        for (String ele : rdsDbInstanceArns) {
            this.rdsDbInstanceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the ARNs of the instances to be described.
     * </p>
     * 
     * @param rdsDbInstanceArns
     *        An array containing the ARNs of the instances to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRdsDbInstancesRequest withRdsDbInstanceArns(java.util.Collection<String> rdsDbInstanceArns) {
        setRdsDbInstanceArns(rdsDbInstanceArns);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getRdsDbInstanceArns() != null)
            sb.append("RdsDbInstanceArns: " + getRdsDbInstanceArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRdsDbInstancesRequest == false)
            return false;
        DescribeRdsDbInstancesRequest other = (DescribeRdsDbInstancesRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getRdsDbInstanceArns() == null ^ this.getRdsDbInstanceArns() == null)
            return false;
        if (other.getRdsDbInstanceArns() != null && other.getRdsDbInstanceArns().equals(this.getRdsDbInstanceArns()) == false)
            return false;
        return true;
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
    public DescribeRdsDbInstancesRequest clone() {
        return (DescribeRdsDbInstancesRequest) super.clone();
    }
}
