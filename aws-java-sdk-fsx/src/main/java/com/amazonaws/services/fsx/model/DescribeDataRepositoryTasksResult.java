/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataRepositoryTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     */
    private java.util.List<DataRepositoryTask> dataRepositoryTasks;

    private String nextToken;

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     * 
     * @return The collection of data repository task descriptions returned.
     */

    public java.util.List<DataRepositoryTask> getDataRepositoryTasks() {
        return dataRepositoryTasks;
    }

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     * 
     * @param dataRepositoryTasks
     *        The collection of data repository task descriptions returned.
     */

    public void setDataRepositoryTasks(java.util.Collection<DataRepositoryTask> dataRepositoryTasks) {
        if (dataRepositoryTasks == null) {
            this.dataRepositoryTasks = null;
            return;
        }

        this.dataRepositoryTasks = new java.util.ArrayList<DataRepositoryTask>(dataRepositoryTasks);
    }

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataRepositoryTasks(java.util.Collection)} or {@link #withDataRepositoryTasks(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dataRepositoryTasks
     *        The collection of data repository task descriptions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksResult withDataRepositoryTasks(DataRepositoryTask... dataRepositoryTasks) {
        if (this.dataRepositoryTasks == null) {
            setDataRepositoryTasks(new java.util.ArrayList<DataRepositoryTask>(dataRepositoryTasks.length));
        }
        for (DataRepositoryTask ele : dataRepositoryTasks) {
            this.dataRepositoryTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of data repository task descriptions returned.
     * </p>
     * 
     * @param dataRepositoryTasks
     *        The collection of data repository task descriptions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataRepositoryTasksResult withDataRepositoryTasks(java.util.Collection<DataRepositoryTask> dataRepositoryTasks) {
        setDataRepositoryTasks(dataRepositoryTasks);
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

    public DescribeDataRepositoryTasksResult withNextToken(String nextToken) {
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
        if (getDataRepositoryTasks() != null)
            sb.append("DataRepositoryTasks: ").append(getDataRepositoryTasks()).append(",");
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

        if (obj instanceof DescribeDataRepositoryTasksResult == false)
            return false;
        DescribeDataRepositoryTasksResult other = (DescribeDataRepositoryTasksResult) obj;
        if (other.getDataRepositoryTasks() == null ^ this.getDataRepositoryTasks() == null)
            return false;
        if (other.getDataRepositoryTasks() != null && other.getDataRepositoryTasks().equals(this.getDataRepositoryTasks()) == false)
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

        hashCode = prime * hashCode + ((getDataRepositoryTasks() == null) ? 0 : getDataRepositoryTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataRepositoryTasksResult clone() {
        try {
            return (DescribeDataRepositoryTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
