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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRaidArrays" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRaidArraysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of
     * the specified arrays. Otherwise, it returns a description of every array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> raidArrayIds;

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the
     *        RAID arrays associated with the specified instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     * </p>
     * 
     * @return The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the
     *         RAID arrays associated with the specified instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the RAID
     * arrays associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of the
     *        RAID arrays associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRaidArraysRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRaidArraysRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of
     * the specified arrays. Otherwise, it returns a description of every array.
     * </p>
     * 
     * @return An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns
     *         descriptions of the specified arrays. Otherwise, it returns a description of every array.
     */

    public java.util.List<String> getRaidArrayIds() {
        if (raidArrayIds == null) {
            raidArrayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return raidArrayIds;
    }

    /**
     * <p>
     * An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of
     * the specified arrays. Otherwise, it returns a description of every array.
     * </p>
     * 
     * @param raidArrayIds
     *        An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns
     *        descriptions of the specified arrays. Otherwise, it returns a description of every array.
     */

    public void setRaidArrayIds(java.util.Collection<String> raidArrayIds) {
        if (raidArrayIds == null) {
            this.raidArrayIds = null;
            return;
        }

        this.raidArrayIds = new com.amazonaws.internal.SdkInternalList<String>(raidArrayIds);
    }

    /**
     * <p>
     * An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of
     * the specified arrays. Otherwise, it returns a description of every array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRaidArrayIds(java.util.Collection)} or {@link #withRaidArrayIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param raidArrayIds
     *        An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns
     *        descriptions of the specified arrays. Otherwise, it returns a description of every array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRaidArraysRequest withRaidArrayIds(String... raidArrayIds) {
        if (this.raidArrayIds == null) {
            setRaidArrayIds(new com.amazonaws.internal.SdkInternalList<String>(raidArrayIds.length));
        }
        for (String ele : raidArrayIds) {
            this.raidArrayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns descriptions of
     * the specified arrays. Otherwise, it returns a description of every array.
     * </p>
     * 
     * @param raidArrayIds
     *        An array of RAID array IDs. If you use this parameter, <code>DescribeRaidArrays</code> returns
     *        descriptions of the specified arrays. Otherwise, it returns a description of every array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRaidArraysRequest withRaidArrayIds(java.util.Collection<String> raidArrayIds) {
        setRaidArrayIds(raidArrayIds);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getRaidArrayIds() != null)
            sb.append("RaidArrayIds: ").append(getRaidArrayIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRaidArraysRequest == false)
            return false;
        DescribeRaidArraysRequest other = (DescribeRaidArraysRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getRaidArrayIds() == null ^ this.getRaidArrayIds() == null)
            return false;
        if (other.getRaidArrayIds() != null && other.getRaidArrayIds().equals(this.getRaidArrayIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getRaidArrayIds() == null) ? 0 : getRaidArrayIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRaidArraysRequest clone() {
        return (DescribeRaidArraysRequest) super.clone();
    }

}
