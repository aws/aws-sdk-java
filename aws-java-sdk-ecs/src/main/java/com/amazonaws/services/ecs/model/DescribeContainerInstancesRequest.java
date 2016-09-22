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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeContainerInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> containerInstances;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to
     *        describe. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to
     *         describe. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to
     *        describe. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @return A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     */

    public java.util.List<String> getContainerInstances() {
        if (containerInstances == null) {
            containerInstances = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return containerInstances;
    }

    /**
     * <p>
     * A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param containerInstances
     *        A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
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
     * A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerInstances(java.util.Collection)} or {@link #withContainerInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerInstances
     *        A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesRequest withContainerInstances(String... containerInstances) {
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
     * A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * </p>
     * 
     * @param containerInstances
     *        A space-separated list of container instance IDs or full Amazon Resource Name (ARN) entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesRequest withContainerInstances(java.util.Collection<String> containerInstances) {
        setContainerInstances(containerInstances);
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
        if (getCluster() != null)
            sb.append("Cluster: " + getCluster() + ",");
        if (getContainerInstances() != null)
            sb.append("ContainerInstances: " + getContainerInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContainerInstancesRequest == false)
            return false;
        DescribeContainerInstancesRequest other = (DescribeContainerInstancesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null)
            return false;
        if (other.getContainerInstances() != null && other.getContainerInstances().equals(this.getContainerInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getContainerInstances() == null) ? 0 : getContainerInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContainerInstancesRequest clone() {
        return (DescribeContainerInstancesRequest) super.clone();
    }
}
