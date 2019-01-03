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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains one or more sets of export request details. When the status of a request is <code>SUCCEEDED</code>, the
     * response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
     * </p>
     */
    private java.util.List<ExportInfo> exportsInfo;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When the
     * results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains one or more sets of export request details. When the status of a request is <code>SUCCEEDED</code>, the
     * response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
     * </p>
     * 
     * @return Contains one or more sets of export request details. When the status of a request is
     *         <code>SUCCEEDED</code>, the response includes a URL for an Amazon S3 bucket where you can view the data
     *         in a CSV file.
     */

    public java.util.List<ExportInfo> getExportsInfo() {
        return exportsInfo;
    }

    /**
     * <p>
     * Contains one or more sets of export request details. When the status of a request is <code>SUCCEEDED</code>, the
     * response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
     * </p>
     * 
     * @param exportsInfo
     *        Contains one or more sets of export request details. When the status of a request is
     *        <code>SUCCEEDED</code>, the response includes a URL for an Amazon S3 bucket where you can view the data in
     *        a CSV file.
     */

    public void setExportsInfo(java.util.Collection<ExportInfo> exportsInfo) {
        if (exportsInfo == null) {
            this.exportsInfo = null;
            return;
        }

        this.exportsInfo = new java.util.ArrayList<ExportInfo>(exportsInfo);
    }

    /**
     * <p>
     * Contains one or more sets of export request details. When the status of a request is <code>SUCCEEDED</code>, the
     * response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportsInfo(java.util.Collection)} or {@link #withExportsInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportsInfo
     *        Contains one or more sets of export request details. When the status of a request is
     *        <code>SUCCEEDED</code>, the response includes a URL for an Amazon S3 bucket where you can view the data in
     *        a CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksResult withExportsInfo(ExportInfo... exportsInfo) {
        if (this.exportsInfo == null) {
            setExportsInfo(new java.util.ArrayList<ExportInfo>(exportsInfo.length));
        }
        for (ExportInfo ele : exportsInfo) {
            this.exportsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more sets of export request details. When the status of a request is <code>SUCCEEDED</code>, the
     * response includes a URL for an Amazon S3 bucket where you can view the data in a CSV file.
     * </p>
     * 
     * @param exportsInfo
     *        Contains one or more sets of export request details. When the status of a request is
     *        <code>SUCCEEDED</code>, the response includes a URL for an Amazon S3 bucket where you can view the data in
     *        a CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksResult withExportsInfo(java.util.Collection<ExportInfo> exportsInfo) {
        setExportsInfo(exportsInfo);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When the
     * results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When the
     *        results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is null when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When the
     * results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When
     *         the results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can
     *         be used to retrieve the next page of results. This value is null when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When the
     * results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeExportTasks</code> request. When the
     *        results of a <code>DescribeExportTasks</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is null when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksResult withNextToken(String nextToken) {
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
        if (getExportsInfo() != null)
            sb.append("ExportsInfo: ").append(getExportsInfo()).append(",");
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

        if (obj instanceof DescribeExportTasksResult == false)
            return false;
        DescribeExportTasksResult other = (DescribeExportTasksResult) obj;
        if (other.getExportsInfo() == null ^ this.getExportsInfo() == null)
            return false;
        if (other.getExportsInfo() != null && other.getExportsInfo().equals(this.getExportsInfo()) == false)
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

        hashCode = prime * hashCode + ((getExportsInfo() == null) ? 0 : getExportsInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksResult clone() {
        try {
            return (DescribeExportTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
