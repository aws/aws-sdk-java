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
 * Contains the output for DescribeImportImageTasks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImportImageTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous
     * 7 days.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImportImageTask> importImageTasks;
    /**
     * <p>
     * The token to use to get the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous
     * 7 days.
     * </p>
     * 
     * @return A list of zero or more import image tasks that are currently active or were completed or canceled in the
     *         previous 7 days.
     */

    public java.util.List<ImportImageTask> getImportImageTasks() {
        if (importImageTasks == null) {
            importImageTasks = new com.amazonaws.internal.SdkInternalList<ImportImageTask>();
        }
        return importImageTasks;
    }

    /**
     * <p>
     * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous
     * 7 days.
     * </p>
     * 
     * @param importImageTasks
     *        A list of zero or more import image tasks that are currently active or were completed or canceled in the
     *        previous 7 days.
     */

    public void setImportImageTasks(java.util.Collection<ImportImageTask> importImageTasks) {
        if (importImageTasks == null) {
            this.importImageTasks = null;
            return;
        }

        this.importImageTasks = new com.amazonaws.internal.SdkInternalList<ImportImageTask>(importImageTasks);
    }

    /**
     * <p>
     * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous
     * 7 days.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportImageTasks(java.util.Collection)} or {@link #withImportImageTasks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param importImageTasks
     *        A list of zero or more import image tasks that are currently active or were completed or canceled in the
     *        previous 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportImageTasksResult withImportImageTasks(ImportImageTask... importImageTasks) {
        if (this.importImageTasks == null) {
            setImportImageTasks(new com.amazonaws.internal.SdkInternalList<ImportImageTask>(importImageTasks.length));
        }
        for (ImportImageTask ele : importImageTasks) {
            this.importImageTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous
     * 7 days.
     * </p>
     * 
     * @param importImageTasks
     *        A list of zero or more import image tasks that are currently active or were completed or canceled in the
     *        previous 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportImageTasksResult withImportImageTasks(java.util.Collection<ImportImageTask> importImageTasks) {
        setImportImageTasks(importImageTasks);
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

    public DescribeImportImageTasksResult withNextToken(String nextToken) {
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
        if (getImportImageTasks() != null)
            sb.append("ImportImageTasks: ").append(getImportImageTasks()).append(",");
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

        if (obj instanceof DescribeImportImageTasksResult == false)
            return false;
        DescribeImportImageTasksResult other = (DescribeImportImageTasksResult) obj;
        if (other.getImportImageTasks() == null ^ this.getImportImageTasks() == null)
            return false;
        if (other.getImportImageTasks() != null && other.getImportImageTasks().equals(this.getImportImageTasks()) == false)
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

        hashCode = prime * hashCode + ((getImportImageTasks() == null) ? 0 : getImportImageTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImportImageTasksResult clone() {
        try {
            return (DescribeImportImageTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
