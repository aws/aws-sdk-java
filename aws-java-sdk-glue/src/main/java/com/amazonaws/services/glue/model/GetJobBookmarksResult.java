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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetJobBookmarks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobBookmarksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job bookmark entries that defines a point that a job can resume processing.
     * </p>
     */
    private java.util.List<JobBookmarkEntry> jobBookmarkEntries;
    /**
     * <p>
     * A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all requested job
     * runs have been returned.
     * </p>
     */
    private Integer nextToken;

    /**
     * <p>
     * A list of job bookmark entries that defines a point that a job can resume processing.
     * </p>
     * 
     * @return A list of job bookmark entries that defines a point that a job can resume processing.
     */

    public java.util.List<JobBookmarkEntry> getJobBookmarkEntries() {
        return jobBookmarkEntries;
    }

    /**
     * <p>
     * A list of job bookmark entries that defines a point that a job can resume processing.
     * </p>
     * 
     * @param jobBookmarkEntries
     *        A list of job bookmark entries that defines a point that a job can resume processing.
     */

    public void setJobBookmarkEntries(java.util.Collection<JobBookmarkEntry> jobBookmarkEntries) {
        if (jobBookmarkEntries == null) {
            this.jobBookmarkEntries = null;
            return;
        }

        this.jobBookmarkEntries = new java.util.ArrayList<JobBookmarkEntry>(jobBookmarkEntries);
    }

    /**
     * <p>
     * A list of job bookmark entries that defines a point that a job can resume processing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobBookmarkEntries(java.util.Collection)} or {@link #withJobBookmarkEntries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param jobBookmarkEntries
     *        A list of job bookmark entries that defines a point that a job can resume processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobBookmarksResult withJobBookmarkEntries(JobBookmarkEntry... jobBookmarkEntries) {
        if (this.jobBookmarkEntries == null) {
            setJobBookmarkEntries(new java.util.ArrayList<JobBookmarkEntry>(jobBookmarkEntries.length));
        }
        for (JobBookmarkEntry ele : jobBookmarkEntries) {
            this.jobBookmarkEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job bookmark entries that defines a point that a job can resume processing.
     * </p>
     * 
     * @param jobBookmarkEntries
     *        A list of job bookmark entries that defines a point that a job can resume processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobBookmarksResult withJobBookmarkEntries(java.util.Collection<JobBookmarkEntry> jobBookmarkEntries) {
        setJobBookmarkEntries(jobBookmarkEntries);
        return this;
    }

    /**
     * <p>
     * A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all requested job
     * runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all
     *        requested job runs have been returned.
     */

    public void setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all requested job
     * runs have been returned.
     * </p>
     * 
     * @return A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all
     *         requested job runs have been returned.
     */

    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all requested job
     * runs have been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all
     *        requested job runs have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobBookmarksResult withNextToken(Integer nextToken) {
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
        if (getJobBookmarkEntries() != null)
            sb.append("JobBookmarkEntries: ").append(getJobBookmarkEntries()).append(",");
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

        if (obj instanceof GetJobBookmarksResult == false)
            return false;
        GetJobBookmarksResult other = (GetJobBookmarksResult) obj;
        if (other.getJobBookmarkEntries() == null ^ this.getJobBookmarkEntries() == null)
            return false;
        if (other.getJobBookmarkEntries() != null && other.getJobBookmarkEntries().equals(this.getJobBookmarkEntries()) == false)
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

        hashCode = prime * hashCode + ((getJobBookmarkEntries() == null) ? 0 : getJobBookmarkEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetJobBookmarksResult clone() {
        try {
            return (GetJobBookmarksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
