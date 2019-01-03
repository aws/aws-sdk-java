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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output for DescribeImportSnapshotTasks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImportSnapshotTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the
     * previous 7 days.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImportSnapshotTask> importSnapshotTasks;
    /**
     * <p>
     * The token to use to get the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the
     * previous 7 days.
     * </p>
     * 
     * @return A list of zero or more import snapshot tasks that are currently active or were completed or canceled in
     *         the previous 7 days.
     */

    public java.util.List<ImportSnapshotTask> getImportSnapshotTasks() {
        if (importSnapshotTasks == null) {
            importSnapshotTasks = new com.amazonaws.internal.SdkInternalList<ImportSnapshotTask>();
        }
        return importSnapshotTasks;
    }

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the
     * previous 7 days.
     * </p>
     * 
     * @param importSnapshotTasks
     *        A list of zero or more import snapshot tasks that are currently active or were completed or canceled in
     *        the previous 7 days.
     */

    public void setImportSnapshotTasks(java.util.Collection<ImportSnapshotTask> importSnapshotTasks) {
        if (importSnapshotTasks == null) {
            this.importSnapshotTasks = null;
            return;
        }

        this.importSnapshotTasks = new com.amazonaws.internal.SdkInternalList<ImportSnapshotTask>(importSnapshotTasks);
    }

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the
     * previous 7 days.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportSnapshotTasks(java.util.Collection)} or {@link #withImportSnapshotTasks(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param importSnapshotTasks
     *        A list of zero or more import snapshot tasks that are currently active or were completed or canceled in
     *        the previous 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportSnapshotTasksResult withImportSnapshotTasks(ImportSnapshotTask... importSnapshotTasks) {
        if (this.importSnapshotTasks == null) {
            setImportSnapshotTasks(new com.amazonaws.internal.SdkInternalList<ImportSnapshotTask>(importSnapshotTasks.length));
        }
        for (ImportSnapshotTask ele : importSnapshotTasks) {
            this.importSnapshotTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the
     * previous 7 days.
     * </p>
     * 
     * @param importSnapshotTasks
     *        A list of zero or more import snapshot tasks that are currently active or were completed or canceled in
     *        the previous 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportSnapshotTasksResult withImportSnapshotTasks(java.util.Collection<ImportSnapshotTask> importSnapshotTasks) {
        setImportSnapshotTasks(importSnapshotTasks);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     * 
     * @return The token to use to get the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results. This value is <code>null</code> when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportSnapshotTasksResult withNextToken(String nextToken) {
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
        if (getImportSnapshotTasks() != null)
            sb.append("ImportSnapshotTasks: ").append(getImportSnapshotTasks()).append(",");
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

        if (obj instanceof DescribeImportSnapshotTasksResult == false)
            return false;
        DescribeImportSnapshotTasksResult other = (DescribeImportSnapshotTasksResult) obj;
        if (other.getImportSnapshotTasks() == null ^ this.getImportSnapshotTasks() == null)
            return false;
        if (other.getImportSnapshotTasks() != null && other.getImportSnapshotTasks().equals(this.getImportSnapshotTasks()) == false)
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

        hashCode = prime * hashCode + ((getImportSnapshotTasks() == null) ? 0 : getImportSnapshotTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImportSnapshotTasksResult clone() {
        try {
            return (DescribeImportSnapshotTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
