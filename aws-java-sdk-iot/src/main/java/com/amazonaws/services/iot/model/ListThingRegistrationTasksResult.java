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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingRegistrationTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of bulk thing provisioning task IDs.
     * </p>
     */
    private java.util.List<String> taskIds;
    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of bulk thing provisioning task IDs.
     * </p>
     * 
     * @return A list of bulk thing provisioning task IDs.
     */

    public java.util.List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * <p>
     * A list of bulk thing provisioning task IDs.
     * </p>
     * 
     * @param taskIds
     *        A list of bulk thing provisioning task IDs.
     */

    public void setTaskIds(java.util.Collection<String> taskIds) {
        if (taskIds == null) {
            this.taskIds = null;
            return;
        }

        this.taskIds = new java.util.ArrayList<String>(taskIds);
    }

    /**
     * <p>
     * A list of bulk thing provisioning task IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskIds(java.util.Collection)} or {@link #withTaskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskIds
     *        A list of bulk thing provisioning task IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTasksResult withTaskIds(String... taskIds) {
        if (this.taskIds == null) {
            setTaskIds(new java.util.ArrayList<String>(taskIds.length));
        }
        for (String ele : taskIds) {
            this.taskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of bulk thing provisioning task IDs.
     * </p>
     * 
     * @param taskIds
     *        A list of bulk thing provisioning task IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTasksResult withTaskIds(java.util.Collection<String> taskIds) {
        setTaskIds(taskIds);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token used to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token used to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingRegistrationTasksResult withNextToken(String nextToken) {
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
        if (getTaskIds() != null)
            sb.append("TaskIds: ").append(getTaskIds()).append(",");
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

        if (obj instanceof ListThingRegistrationTasksResult == false)
            return false;
        ListThingRegistrationTasksResult other = (ListThingRegistrationTasksResult) obj;
        if (other.getTaskIds() == null ^ this.getTaskIds() == null)
            return false;
        if (other.getTaskIds() != null && other.getTaskIds().equals(this.getTaskIds()) == false)
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

        hashCode = prime * hashCode + ((getTaskIds() == null) ? 0 : getTaskIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListThingRegistrationTasksResult clone() {
        try {
            return (ListThingRegistrationTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
