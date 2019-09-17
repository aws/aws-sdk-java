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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTaskSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> taskSets;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets
     *        exist in.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task
     *         sets exist in.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets
     *        exist in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     * 
     * @return The ID or full Amazon Resource Name (ARN) of task sets to describe.
     */

    public java.util.List<String> getTaskSets() {
        if (taskSets == null) {
            taskSets = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return taskSets;
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     * 
     * @param taskSets
     *        The ID or full Amazon Resource Name (ARN) of task sets to describe.
     */

    public void setTaskSets(java.util.Collection<String> taskSets) {
        if (taskSets == null) {
            this.taskSets = null;
            return;
        }

        this.taskSets = new com.amazonaws.internal.SdkInternalList<String>(taskSets);
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskSets(java.util.Collection)} or {@link #withTaskSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskSets
     *        The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsRequest withTaskSets(String... taskSets) {
        if (this.taskSets == null) {
            setTaskSets(new com.amazonaws.internal.SdkInternalList<String>(taskSets.length));
        }
        for (String ele : taskSets) {
            this.taskSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * </p>
     * 
     * @param taskSets
     *        The ID or full Amazon Resource Name (ARN) of task sets to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskSetsRequest withTaskSets(java.util.Collection<String> taskSets) {
        setTaskSets(taskSets);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getTaskSets() != null)
            sb.append("TaskSets: ").append(getTaskSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTaskSetsRequest == false)
            return false;
        DescribeTaskSetsRequest other = (DescribeTaskSetsRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getTaskSets() == null ^ this.getTaskSets() == null)
            return false;
        if (other.getTaskSets() != null && other.getTaskSets().equals(this.getTaskSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getTaskSets() == null) ? 0 : getTaskSets().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskSetsRequest clone() {
        return (DescribeTaskSetsRequest) super.clone();
    }

}
