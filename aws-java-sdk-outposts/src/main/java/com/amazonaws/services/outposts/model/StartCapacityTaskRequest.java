/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartCapacityTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCapacityTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or ARN of the Outposts associated with the specified capacity task.
     * </p>
     */
    private String outpostIdentifier;
    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     * </p>
     */
    private String orderId;
    /**
     * <p>
     * The instance pools specified in the capacity task.
     * </p>
     */
    private java.util.List<InstanceTypeCapacity> instancePools;
    /**
     * <p>
     * You can request a dry run to determine if the instance type and instance size changes is above or below available
     * instance capacity. Requesting a dry run does not make any changes to your plan.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID or ARN of the Outposts associated with the specified capacity task.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or ARN of the Outposts associated with the specified capacity task.
     */

    public void setOutpostIdentifier(String outpostIdentifier) {
        this.outpostIdentifier = outpostIdentifier;
    }

    /**
     * <p>
     * The ID or ARN of the Outposts associated with the specified capacity task.
     * </p>
     * 
     * @return The ID or ARN of the Outposts associated with the specified capacity task.
     */

    public String getOutpostIdentifier() {
        return this.outpostIdentifier;
    }

    /**
     * <p>
     * The ID or ARN of the Outposts associated with the specified capacity task.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or ARN of the Outposts associated with the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskRequest withOutpostIdentifier(String outpostIdentifier) {
        setOutpostIdentifier(outpostIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     * </p>
     * 
     * @param orderId
     *        The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     */

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     */

    public String getOrderId() {
        return this.orderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     * </p>
     * 
     * @param orderId
     *        The ID of the Amazon Web Services Outposts order associated with the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskRequest withOrderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    /**
     * <p>
     * The instance pools specified in the capacity task.
     * </p>
     * 
     * @return The instance pools specified in the capacity task.
     */

    public java.util.List<InstanceTypeCapacity> getInstancePools() {
        return instancePools;
    }

    /**
     * <p>
     * The instance pools specified in the capacity task.
     * </p>
     * 
     * @param instancePools
     *        The instance pools specified in the capacity task.
     */

    public void setInstancePools(java.util.Collection<InstanceTypeCapacity> instancePools) {
        if (instancePools == null) {
            this.instancePools = null;
            return;
        }

        this.instancePools = new java.util.ArrayList<InstanceTypeCapacity>(instancePools);
    }

    /**
     * <p>
     * The instance pools specified in the capacity task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstancePools(java.util.Collection)} or {@link #withInstancePools(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instancePools
     *        The instance pools specified in the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskRequest withInstancePools(InstanceTypeCapacity... instancePools) {
        if (this.instancePools == null) {
            setInstancePools(new java.util.ArrayList<InstanceTypeCapacity>(instancePools.length));
        }
        for (InstanceTypeCapacity ele : instancePools) {
            this.instancePools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance pools specified in the capacity task.
     * </p>
     * 
     * @param instancePools
     *        The instance pools specified in the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskRequest withInstancePools(java.util.Collection<InstanceTypeCapacity> instancePools) {
        setInstancePools(instancePools);
        return this;
    }

    /**
     * <p>
     * You can request a dry run to determine if the instance type and instance size changes is above or below available
     * instance capacity. Requesting a dry run does not make any changes to your plan.
     * </p>
     * 
     * @param dryRun
     *        You can request a dry run to determine if the instance type and instance size changes is above or below
     *        available instance capacity. Requesting a dry run does not make any changes to your plan.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * You can request a dry run to determine if the instance type and instance size changes is above or below available
     * instance capacity. Requesting a dry run does not make any changes to your plan.
     * </p>
     * 
     * @return You can request a dry run to determine if the instance type and instance size changes is above or below
     *         available instance capacity. Requesting a dry run does not make any changes to your plan.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * You can request a dry run to determine if the instance type and instance size changes is above or below available
     * instance capacity. Requesting a dry run does not make any changes to your plan.
     * </p>
     * 
     * @param dryRun
     *        You can request a dry run to determine if the instance type and instance size changes is above or below
     *        available instance capacity. Requesting a dry run does not make any changes to your plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * You can request a dry run to determine if the instance type and instance size changes is above or below available
     * instance capacity. Requesting a dry run does not make any changes to your plan.
     * </p>
     * 
     * @return You can request a dry run to determine if the instance type and instance size changes is above or below
     *         available instance capacity. Requesting a dry run does not make any changes to your plan.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getOutpostIdentifier() != null)
            sb.append("OutpostIdentifier: ").append(getOutpostIdentifier()).append(",");
        if (getOrderId() != null)
            sb.append("OrderId: ").append(getOrderId()).append(",");
        if (getInstancePools() != null)
            sb.append("InstancePools: ").append(getInstancePools()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCapacityTaskRequest == false)
            return false;
        StartCapacityTaskRequest other = (StartCapacityTaskRequest) obj;
        if (other.getOutpostIdentifier() == null ^ this.getOutpostIdentifier() == null)
            return false;
        if (other.getOutpostIdentifier() != null && other.getOutpostIdentifier().equals(this.getOutpostIdentifier()) == false)
            return false;
        if (other.getOrderId() == null ^ this.getOrderId() == null)
            return false;
        if (other.getOrderId() != null && other.getOrderId().equals(this.getOrderId()) == false)
            return false;
        if (other.getInstancePools() == null ^ this.getInstancePools() == null)
            return false;
        if (other.getInstancePools() != null && other.getInstancePools().equals(this.getInstancePools()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostIdentifier() == null) ? 0 : getOutpostIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        hashCode = prime * hashCode + ((getInstancePools() == null) ? 0 : getInstancePools().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public StartCapacityTaskRequest clone() {
        return (StartCapacityTaskRequest) super.clone();
    }

}
