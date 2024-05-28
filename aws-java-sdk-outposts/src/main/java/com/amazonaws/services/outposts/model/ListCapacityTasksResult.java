/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCapacityTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCapacityTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all the capacity tasks.
     * </p>
     */
    private java.util.List<CapacityTaskSummary> capacityTasks;

    private String nextToken;

    /**
     * <p>
     * Lists all the capacity tasks.
     * </p>
     * 
     * @return Lists all the capacity tasks.
     */

    public java.util.List<CapacityTaskSummary> getCapacityTasks() {
        return capacityTasks;
    }

    /**
     * <p>
     * Lists all the capacity tasks.
     * </p>
     * 
     * @param capacityTasks
     *        Lists all the capacity tasks.
     */

    public void setCapacityTasks(java.util.Collection<CapacityTaskSummary> capacityTasks) {
        if (capacityTasks == null) {
            this.capacityTasks = null;
            return;
        }

        this.capacityTasks = new java.util.ArrayList<CapacityTaskSummary>(capacityTasks);
    }

    /**
     * <p>
     * Lists all the capacity tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityTasks(java.util.Collection)} or {@link #withCapacityTasks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param capacityTasks
     *        Lists all the capacity tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCapacityTasksResult withCapacityTasks(CapacityTaskSummary... capacityTasks) {
        if (this.capacityTasks == null) {
            setCapacityTasks(new java.util.ArrayList<CapacityTaskSummary>(capacityTasks.length));
        }
        for (CapacityTaskSummary ele : capacityTasks) {
            this.capacityTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all the capacity tasks.
     * </p>
     * 
     * @param capacityTasks
     *        Lists all the capacity tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCapacityTasksResult withCapacityTasks(java.util.Collection<CapacityTaskSummary> capacityTasks) {
        setCapacityTasks(capacityTasks);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCapacityTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCapacityTasks() != null)
            sb.append("CapacityTasks: ").append(getCapacityTasks()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCapacityTasksResult == false)
            return false;
        ListCapacityTasksResult other = (ListCapacityTasksResult) obj;
        if (other.getCapacityTasks() == null ^ this.getCapacityTasks() == null)
            return false;
        if (other.getCapacityTasks() != null && other.getCapacityTasks().equals(this.getCapacityTasks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityTasks() == null) ? 0 : getCapacityTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCapacityTasksResult clone() {
        try {
            return (ListCapacityTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
