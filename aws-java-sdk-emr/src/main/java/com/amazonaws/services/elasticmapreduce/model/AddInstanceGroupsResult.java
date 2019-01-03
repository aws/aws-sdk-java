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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Output from an AddInstanceGroups call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddInstanceGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     */
    private String jobFlowId;
    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceGroupIds;

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * 
     * @param jobFlowId
     *        The job flow ID in which the instance groups are added.
     */

    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * 
     * @return The job flow ID in which the instance groups are added.
     */

    public String getJobFlowId() {
        return this.jobFlowId;
    }

    /**
     * <p>
     * The job flow ID in which the instance groups are added.
     * </p>
     * 
     * @param jobFlowId
     *        The job flow ID in which the instance groups are added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddInstanceGroupsResult withJobFlowId(String jobFlowId) {
        setJobFlowId(jobFlowId);
        return this;
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     * 
     * @return Instance group IDs of the newly created instance groups.
     */

    public java.util.List<String> getInstanceGroupIds() {
        if (instanceGroupIds == null) {
            instanceGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceGroupIds;
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     * 
     * @param instanceGroupIds
     *        Instance group IDs of the newly created instance groups.
     */

    public void setInstanceGroupIds(java.util.Collection<String> instanceGroupIds) {
        if (instanceGroupIds == null) {
            this.instanceGroupIds = null;
            return;
        }

        this.instanceGroupIds = new com.amazonaws.internal.SdkInternalList<String>(instanceGroupIds);
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroupIds(java.util.Collection)} or {@link #withInstanceGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceGroupIds
     *        Instance group IDs of the newly created instance groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddInstanceGroupsResult withInstanceGroupIds(String... instanceGroupIds) {
        if (this.instanceGroupIds == null) {
            setInstanceGroupIds(new com.amazonaws.internal.SdkInternalList<String>(instanceGroupIds.length));
        }
        for (String ele : instanceGroupIds) {
            this.instanceGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Instance group IDs of the newly created instance groups.
     * </p>
     * 
     * @param instanceGroupIds
     *        Instance group IDs of the newly created instance groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddInstanceGroupsResult withInstanceGroupIds(java.util.Collection<String> instanceGroupIds) {
        setInstanceGroupIds(instanceGroupIds);
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: ").append(getJobFlowId()).append(",");
        if (getInstanceGroupIds() != null)
            sb.append("InstanceGroupIds: ").append(getInstanceGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceGroupsResult == false)
            return false;
        AddInstanceGroupsResult other = (AddInstanceGroupsResult) obj;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        if (other.getInstanceGroupIds() == null ^ this.getInstanceGroupIds() == null)
            return false;
        if (other.getInstanceGroupIds() != null && other.getInstanceGroupIds().equals(this.getInstanceGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupIds() == null) ? 0 : getInstanceGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public AddInstanceGroupsResult clone() {
        try {
            return (AddInstanceGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
