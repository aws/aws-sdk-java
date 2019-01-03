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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The order in which compute environments are tried for job placement within a queue. Compute environments are tried in
 * ascending order. For example, if two compute environments are associated with a job queue, the compute environment
 * with a lower order integer value is tried for job placement first.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ComputeEnvironmentOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeEnvironmentOrder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The order of the compute environment.
     * </p>
     */
    private Integer order;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     */
    private String computeEnvironment;

    /**
     * <p>
     * The order of the compute environment.
     * </p>
     * 
     * @param order
     *        The order of the compute environment.
     */

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * <p>
     * The order of the compute environment.
     * </p>
     * 
     * @return The order of the compute environment.
     */

    public Integer getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order of the compute environment.
     * </p>
     * 
     * @param order
     *        The order of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentOrder withOrder(Integer order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @param computeEnvironment
     *        The Amazon Resource Name (ARN) of the compute environment.
     */

    public void setComputeEnvironment(String computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the compute environment.
     */

    public String getComputeEnvironment() {
        return this.computeEnvironment;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @param computeEnvironment
     *        The Amazon Resource Name (ARN) of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentOrder withComputeEnvironment(String computeEnvironment) {
        setComputeEnvironment(computeEnvironment);
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
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getComputeEnvironment() != null)
            sb.append("ComputeEnvironment: ").append(getComputeEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeEnvironmentOrder == false)
            return false;
        ComputeEnvironmentOrder other = (ComputeEnvironmentOrder) obj;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getComputeEnvironment() == null ^ this.getComputeEnvironment() == null)
            return false;
        if (other.getComputeEnvironment() != null && other.getComputeEnvironment().equals(this.getComputeEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironment() == null) ? 0 : getComputeEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public ComputeEnvironmentOrder clone() {
        try {
            return (ComputeEnvironmentOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ComputeEnvironmentOrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
