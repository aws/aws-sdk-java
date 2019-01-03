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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateContainerInstancesState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContainerInstancesStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to update. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> containerInstances;
    /**
     * <p>
     * The container instance state with which to update the container instance.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to update. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to
     *        update. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to update. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to
     *         update. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to update. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to
     *        update. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerInstancesStateRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     * 
     * @return A list of container instance IDs or full ARN entries.
     */

    public java.util.List<String> getContainerInstances() {
        if (containerInstances == null) {
            containerInstances = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return containerInstances;
    }

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     * 
     * @param containerInstances
     *        A list of container instance IDs or full ARN entries.
     */

    public void setContainerInstances(java.util.Collection<String> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
            return;
        }

        this.containerInstances = new com.amazonaws.internal.SdkInternalList<String>(containerInstances);
    }

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerInstances(java.util.Collection)} or {@link #withContainerInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerInstances
     *        A list of container instance IDs or full ARN entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerInstancesStateRequest withContainerInstances(String... containerInstances) {
        if (this.containerInstances == null) {
            setContainerInstances(new com.amazonaws.internal.SdkInternalList<String>(containerInstances.length));
        }
        for (String ele : containerInstances) {
            this.containerInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     * 
     * @param containerInstances
     *        A list of container instance IDs or full ARN entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContainerInstancesStateRequest withContainerInstances(java.util.Collection<String> containerInstances) {
        setContainerInstances(containerInstances);
        return this;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * </p>
     * 
     * @param status
     *        The container instance state with which to update the container instance.
     * @see ContainerInstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * </p>
     * 
     * @return The container instance state with which to update the container instance.
     * @see ContainerInstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * </p>
     * 
     * @param status
     *        The container instance state with which to update the container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerInstanceStatus
     */

    public UpdateContainerInstancesStateRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * </p>
     * 
     * @param status
     *        The container instance state with which to update the container instance.
     * @see ContainerInstanceStatus
     */

    public void setStatus(ContainerInstanceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * </p>
     * 
     * @param status
     *        The container instance state with which to update the container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerInstanceStatus
     */

    public UpdateContainerInstancesStateRequest withStatus(ContainerInstanceStatus status) {
        this.status = status.toString();
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getContainerInstances() != null)
            sb.append("ContainerInstances: ").append(getContainerInstances()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContainerInstancesStateRequest == false)
            return false;
        UpdateContainerInstancesStateRequest other = (UpdateContainerInstancesStateRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null)
            return false;
        if (other.getContainerInstances() != null && other.getContainerInstances().equals(this.getContainerInstances()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getContainerInstances() == null) ? 0 : getContainerInstances().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContainerInstancesStateRequest clone() {
        return (UpdateContainerInstancesStateRequest) super.clone();
    }

}
