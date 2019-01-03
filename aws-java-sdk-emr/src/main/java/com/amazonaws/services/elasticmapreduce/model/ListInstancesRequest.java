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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This input determines which instances to list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     */
    private String instanceGroupId;
    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceGroupTypes;
    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private String instanceFleetId;
    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     */
    private String instanceFleetType;
    /**
     * <p>
     * A list of instance states that will filter the instances returned with this request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceStates;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     * 
     * @param clusterId
     *        The identifier of the cluster for which to list the instances.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     * 
     * @return The identifier of the cluster for which to list the instances.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the instances.
     * </p>
     * 
     * @param clusterId
     *        The identifier of the cluster for which to list the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     * 
     * @param instanceGroupId
     *        The identifier of the instance group for which to list the instances.
     */

    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     * 
     * @return The identifier of the instance group for which to list the instances.
     */

    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * <p>
     * The identifier of the instance group for which to list the instances.
     * </p>
     * 
     * @param instanceGroupId
     *        The identifier of the instance group for which to list the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesRequest withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
        return this;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * 
     * @return The type of instance group for which to list the instances.
     * @see InstanceGroupType
     */

    public java.util.List<String> getInstanceGroupTypes() {
        if (instanceGroupTypes == null) {
            instanceGroupTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceGroupTypes;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * 
     * @param instanceGroupTypes
     *        The type of instance group for which to list the instances.
     * @see InstanceGroupType
     */

    public void setInstanceGroupTypes(java.util.Collection<String> instanceGroupTypes) {
        if (instanceGroupTypes == null) {
            this.instanceGroupTypes = null;
            return;
        }

        this.instanceGroupTypes = new com.amazonaws.internal.SdkInternalList<String>(instanceGroupTypes);
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroupTypes(java.util.Collection)} or {@link #withInstanceGroupTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceGroupTypes
     *        The type of instance group for which to list the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupType
     */

    public ListInstancesRequest withInstanceGroupTypes(String... instanceGroupTypes) {
        if (this.instanceGroupTypes == null) {
            setInstanceGroupTypes(new com.amazonaws.internal.SdkInternalList<String>(instanceGroupTypes.length));
        }
        for (String ele : instanceGroupTypes) {
            this.instanceGroupTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * 
     * @param instanceGroupTypes
     *        The type of instance group for which to list the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupType
     */

    public ListInstancesRequest withInstanceGroupTypes(java.util.Collection<String> instanceGroupTypes) {
        setInstanceGroupTypes(instanceGroupTypes);
        return this;
    }

    /**
     * <p>
     * The type of instance group for which to list the instances.
     * </p>
     * 
     * @param instanceGroupTypes
     *        The type of instance group for which to list the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupType
     */

    public ListInstancesRequest withInstanceGroupTypes(InstanceGroupType... instanceGroupTypes) {
        com.amazonaws.internal.SdkInternalList<String> instanceGroupTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(instanceGroupTypes.length);
        for (InstanceGroupType value : instanceGroupTypes) {
            instanceGroupTypesCopy.add(value.toString());
        }
        if (getInstanceGroupTypes() == null) {
            setInstanceGroupTypes(instanceGroupTypesCopy);
        } else {
            getInstanceGroupTypes().addAll(instanceGroupTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @param instanceFleetId
     *        The unique identifier of the instance fleet.
     */

    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @return The unique identifier of the instance fleet.
     */

    public String getInstanceFleetId() {
        return this.instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @param instanceFleetId
     *        The unique identifier of the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesRequest withInstanceFleetId(String instanceFleetId) {
        setInstanceFleetId(instanceFleetId);
        return this;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * @see InstanceFleetType
     */

    public void setInstanceFleetType(String instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * 
     * @return The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * @see InstanceFleetType
     */

    public String getInstanceFleetType() {
        return this.instanceFleetType;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetType
     */

    public ListInstancesRequest withInstanceFleetType(String instanceFleetType) {
        setInstanceFleetType(instanceFleetType);
        return this;
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * @see InstanceFleetType
     */

    public void setInstanceFleetType(InstanceFleetType instanceFleetType) {
        withInstanceFleetType(instanceFleetType);
    }

    /**
     * <p>
     * The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * </p>
     * 
     * @param instanceFleetType
     *        The node type of the instance fleet. For example MASTER, CORE, or TASK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetType
     */

    public ListInstancesRequest withInstanceFleetType(InstanceFleetType instanceFleetType) {
        this.instanceFleetType = instanceFleetType.toString();
        return this;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with this request.
     * </p>
     * 
     * @return A list of instance states that will filter the instances returned with this request.
     * @see InstanceState
     */

    public java.util.List<String> getInstanceStates() {
        if (instanceStates == null) {
            instanceStates = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceStates;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with this request.
     * </p>
     * 
     * @param instanceStates
     *        A list of instance states that will filter the instances returned with this request.
     * @see InstanceState
     */

    public void setInstanceStates(java.util.Collection<String> instanceStates) {
        if (instanceStates == null) {
            this.instanceStates = null;
            return;
        }

        this.instanceStates = new com.amazonaws.internal.SdkInternalList<String>(instanceStates);
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceStates(java.util.Collection)} or {@link #withInstanceStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceStates
     *        A list of instance states that will filter the instances returned with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceState
     */

    public ListInstancesRequest withInstanceStates(String... instanceStates) {
        if (this.instanceStates == null) {
            setInstanceStates(new com.amazonaws.internal.SdkInternalList<String>(instanceStates.length));
        }
        for (String ele : instanceStates) {
            this.instanceStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with this request.
     * </p>
     * 
     * @param instanceStates
     *        A list of instance states that will filter the instances returned with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceState
     */

    public ListInstancesRequest withInstanceStates(java.util.Collection<String> instanceStates) {
        setInstanceStates(instanceStates);
        return this;
    }

    /**
     * <p>
     * A list of instance states that will filter the instances returned with this request.
     * </p>
     * 
     * @param instanceStates
     *        A list of instance states that will filter the instances returned with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceState
     */

    public ListInstancesRequest withInstanceStates(InstanceState... instanceStates) {
        com.amazonaws.internal.SdkInternalList<String> instanceStatesCopy = new com.amazonaws.internal.SdkInternalList<String>(instanceStates.length);
        for (InstanceState value : instanceStates) {
            instanceStatesCopy.add(value.toString());
        }
        if (getInstanceStates() == null) {
            setInstanceStates(instanceStatesCopy);
        } else {
            getInstanceStates().addAll(instanceStatesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstancesRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: ").append(getInstanceGroupId()).append(",");
        if (getInstanceGroupTypes() != null)
            sb.append("InstanceGroupTypes: ").append(getInstanceGroupTypes()).append(",");
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: ").append(getInstanceFleetId()).append(",");
        if (getInstanceFleetType() != null)
            sb.append("InstanceFleetType: ").append(getInstanceFleetType()).append(",");
        if (getInstanceStates() != null)
            sb.append("InstanceStates: ").append(getInstanceStates()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInstancesRequest == false)
            return false;
        ListInstancesRequest other = (ListInstancesRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getInstanceGroupTypes() == null ^ this.getInstanceGroupTypes() == null)
            return false;
        if (other.getInstanceGroupTypes() != null && other.getInstanceGroupTypes().equals(this.getInstanceGroupTypes()) == false)
            return false;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getInstanceFleetType() == null ^ this.getInstanceFleetType() == null)
            return false;
        if (other.getInstanceFleetType() != null && other.getInstanceFleetType().equals(this.getInstanceFleetType()) == false)
            return false;
        if (other.getInstanceStates() == null ^ this.getInstanceStates() == null)
            return false;
        if (other.getInstanceStates() != null && other.getInstanceStates().equals(this.getInstanceStates()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupTypes() == null) ? 0 : getInstanceGroupTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleetType() == null) ? 0 : getInstanceFleetType().hashCode());
        hashCode = prime * hashCode + ((getInstanceStates() == null) ? 0 : getInstanceStates().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListInstancesRequest clone() {
        return (ListInstancesRequest) super.clone();
    }

}
