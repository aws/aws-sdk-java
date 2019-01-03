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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tasks;
    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the tags are
     * included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> include;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you
     *        do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to describe. If you
     *        do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTasksRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     * 
     * @return A list of up to 100 task IDs or full ARN entries.
     */

    public java.util.List<String> getTasks() {
        if (tasks == null) {
            tasks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tasks;
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     * 
     * @param tasks
     *        A list of up to 100 task IDs or full ARN entries.
     */

    public void setTasks(java.util.Collection<String> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new com.amazonaws.internal.SdkInternalList<String>(tasks);
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of up to 100 task IDs or full ARN entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTasksRequest withTasks(String... tasks) {
        if (this.tasks == null) {
            setTasks(new com.amazonaws.internal.SdkInternalList<String>(tasks.length));
        }
        for (String ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 task IDs or full ARN entries.
     * </p>
     * 
     * @param tasks
     *        A list of up to 100 task IDs or full ARN entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTasksRequest withTasks(java.util.Collection<String> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the tags are
     * included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @return Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the
     *         tags are included in the response. If this field is omitted, tags are not included in the response.
     * @see TaskField
     */

    public java.util.List<String> getInclude() {
        if (include == null) {
            include = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return include;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the tags are
     * included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @see TaskField
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new com.amazonaws.internal.SdkInternalList<String>(include);
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the tags are
     * included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskField
     */

    public DescribeTasksRequest withInclude(String... include) {
        if (this.include == null) {
            setInclude(new com.amazonaws.internal.SdkInternalList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the tags are
     * included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskField
     */

    public DescribeTasksRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the tags are
     * included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the task. If <code>TAGS</code> is specified, the
     *        tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskField
     */

    public DescribeTasksRequest withInclude(TaskField... include) {
        com.amazonaws.internal.SdkInternalList<String> includeCopy = new com.amazonaws.internal.SdkInternalList<String>(include.length);
        for (TaskField value : include) {
            includeCopy.add(value.toString());
        }
        if (getInclude() == null) {
            setInclude(includeCopy);
        } else {
            getInclude().addAll(includeCopy);
        }
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
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTasksRequest == false)
            return false;
        DescribeTasksRequest other = (DescribeTasksRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTasksRequest clone() {
        return (DescribeTasksRequest) super.clone();
    }

}
