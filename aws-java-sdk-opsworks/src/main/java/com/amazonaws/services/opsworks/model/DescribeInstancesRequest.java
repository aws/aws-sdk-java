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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified layer.
     * </p>
     */
    private String layerId;
    /**
     * <p>
     * An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code> returns a
     * description of the specified instances. Otherwise, it returns a description of every instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;

    /**
     * <p>
     * A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified stack.
     * </p>
     * 
     * @param stackId
     *        A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the
     *        instances associated with the specified stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified stack.
     * </p>
     * 
     * @return A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the
     *         instances associated with the specified stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified stack.
     * </p>
     * 
     * @param stackId
     *        A stack ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the
     *        instances associated with the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified layer.
     * </p>
     * 
     * @param layerId
     *        A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the
     *        instances associated with the specified layer.
     */

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * <p>
     * A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified layer.
     * </p>
     * 
     * @return A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the
     *         instances associated with the specified layer.
     */

    public String getLayerId() {
        return this.layerId;
    }

    /**
     * <p>
     * A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the instances
     * associated with the specified layer.
     * </p>
     * 
     * @param layerId
     *        A layer ID. If you use this parameter, <code>DescribeInstances</code> returns descriptions of the
     *        instances associated with the specified layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * <p>
     * An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code> returns a
     * description of the specified instances. Otherwise, it returns a description of every instance.
     * </p>
     * 
     * @return An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code>
     *         returns a description of the specified instances. Otherwise, it returns a description of every instance.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code> returns a
     * description of the specified instances. Otherwise, it returns a description of every instance.
     * </p>
     * 
     * @param instanceIds
     *        An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code>
     *        returns a description of the specified instances. Otherwise, it returns a description of every instance.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code> returns a
     * description of the specified instances. Otherwise, it returns a description of every instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code>
     *        returns a description of the specified instances. Otherwise, it returns a description of every instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code> returns a
     * description of the specified instances. Otherwise, it returns a description of every instance.
     * </p>
     * 
     * @param instanceIds
     *        An array of instance IDs to be described. If you use this parameter, <code>DescribeInstances</code>
     *        returns a description of the specified instances. Otherwise, it returns a description of every instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getLayerId() != null)
            sb.append("LayerId: ").append(getLayerId()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancesRequest == false)
            return false;
        DescribeInstancesRequest other = (DescribeInstancesRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLayerId() == null ^ this.getLayerId() == null)
            return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancesRequest clone() {
        return (DescribeInstancesRequest) super.clone();
    }

}
