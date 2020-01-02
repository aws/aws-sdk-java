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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportImageTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExportImageTask> exportImageTasks;
    /**
     * <p>
     * The token to use to get the next page of results. This value is <code>null</code> when there are no more results
     * to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     * 
     * @return Information about the export image tasks.
     */

    public java.util.List<ExportImageTask> getExportImageTasks() {
        if (exportImageTasks == null) {
            exportImageTasks = new com.amazonaws.internal.SdkInternalList<ExportImageTask>();
        }
        return exportImageTasks;
    }

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     * 
     * @param exportImageTasks
     *        Information about the export image tasks.
     */

    public void setExportImageTasks(java.util.Collection<ExportImageTask> exportImageTasks) {
        if (exportImageTasks == null) {
            this.exportImageTasks = null;
            return;
        }

        this.exportImageTasks = new com.amazonaws.internal.SdkInternalList<ExportImageTask>(exportImageTasks);
    }

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportImageTasks(java.util.Collection)} or {@link #withExportImageTasks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exportImageTasks
     *        Information about the export image tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksResult withExportImageTasks(ExportImageTask... exportImageTasks) {
        if (this.exportImageTasks == null) {
            setExportImageTasks(new com.amazonaws.internal.SdkInternalList<ExportImageTask>(exportImageTasks.length));
        }
        for (ExportImageTask ele : exportImageTasks) {
            this.exportImageTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     * 
     * @param exportImageTasks
     *        Information about the export image tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportImageTasksResult withExportImageTasks(java.util.Collection<ExportImageTask> exportImageTasks) {
        setExportImageTasks(exportImageTasks);
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

    public DescribeExportImageTasksResult withNextToken(String nextToken) {
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
        if (getExportImageTasks() != null)
            sb.append("ExportImageTasks: ").append(getExportImageTasks()).append(",");
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

        if (obj instanceof DescribeExportImageTasksResult == false)
            return false;
        DescribeExportImageTasksResult other = (DescribeExportImageTasksResult) obj;
        if (other.getExportImageTasks() == null ^ this.getExportImageTasks() == null)
            return false;
        if (other.getExportImageTasks() != null && other.getExportImageTasks().equals(this.getExportImageTasks()) == false)
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

        hashCode = prime * hashCode + ((getExportImageTasks() == null) ? 0 : getExportImageTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportImageTasksResult clone() {
        try {
            return (DescribeExportImageTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
