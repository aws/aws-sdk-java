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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Reserved Instance listing state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceCount implements Serializable, Cloneable {

    /**
     * <p>
     * The number of listed Reserved Instances in the state specified by the <code>state</code>.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The states of the listed Reserved Instances.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The number of listed Reserved Instances in the state specified by the <code>state</code>.
     * </p>
     * 
     * @param instanceCount
     *        The number of listed Reserved Instances in the state specified by the <code>state</code>.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of listed Reserved Instances in the state specified by the <code>state</code>.
     * </p>
     * 
     * @return The number of listed Reserved Instances in the state specified by the <code>state</code>.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of listed Reserved Instances in the state specified by the <code>state</code>.
     * </p>
     * 
     * @param instanceCount
     *        The number of listed Reserved Instances in the state specified by the <code>state</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCount withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The states of the listed Reserved Instances.
     * </p>
     * 
     * @param state
     *        The states of the listed Reserved Instances.
     * @see ListingState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The states of the listed Reserved Instances.
     * </p>
     * 
     * @return The states of the listed Reserved Instances.
     * @see ListingState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The states of the listed Reserved Instances.
     * </p>
     * 
     * @param state
     *        The states of the listed Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingState
     */

    public InstanceCount withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The states of the listed Reserved Instances.
     * </p>
     * 
     * @param state
     *        The states of the listed Reserved Instances.
     * @see ListingState
     */

    public void setState(ListingState state) {
        withState(state);
    }

    /**
     * <p>
     * The states of the listed Reserved Instances.
     * </p>
     * 
     * @param state
     *        The states of the listed Reserved Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingState
     */

    public InstanceCount withState(ListingState state) {
        this.state = state.toString();
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceCount == false)
            return false;
        InstanceCount other = (InstanceCount) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public InstanceCount clone() {
        try {
            return (InstanceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
