/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetExportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReadSetExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of jobs.
     * </p>
     */
    private java.util.List<ExportReadSetJobDetail> exportJobs;
    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @return A list of jobs.
     */

    public java.util.List<ExportReadSetJobDetail> getExportJobs() {
        return exportJobs;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @param exportJobs
     *        A list of jobs.
     */

    public void setExportJobs(java.util.Collection<ExportReadSetJobDetail> exportJobs) {
        if (exportJobs == null) {
            this.exportJobs = null;
            return;
        }

        this.exportJobs = new java.util.ArrayList<ExportReadSetJobDetail>(exportJobs);
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportJobs(java.util.Collection)} or {@link #withExportJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportJobs
     *        A list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetExportJobsResult withExportJobs(ExportReadSetJobDetail... exportJobs) {
        if (this.exportJobs == null) {
            setExportJobs(new java.util.ArrayList<ExportReadSetJobDetail>(exportJobs.length));
        }
        for (ExportReadSetJobDetail ele : exportJobs) {
            this.exportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @param exportJobs
     *        A list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetExportJobsResult withExportJobs(java.util.Collection<ExportReadSetJobDetail> exportJobs) {
        setExportJobs(exportJobs);
        return this;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @return A pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetExportJobsResult withNextToken(String nextToken) {
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
        if (getExportJobs() != null)
            sb.append("ExportJobs: ").append(getExportJobs()).append(",");
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

        if (obj instanceof ListReadSetExportJobsResult == false)
            return false;
        ListReadSetExportJobsResult other = (ListReadSetExportJobsResult) obj;
        if (other.getExportJobs() == null ^ this.getExportJobs() == null)
            return false;
        if (other.getExportJobs() != null && other.getExportJobs().equals(this.getExportJobs()) == false)
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

        hashCode = prime * hashCode + ((getExportJobs() == null) ? 0 : getExportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReadSetExportJobsResult clone() {
        try {
            return (ListReadSetExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
