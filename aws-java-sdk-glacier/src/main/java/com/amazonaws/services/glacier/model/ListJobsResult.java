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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job objects. Each job object contains metadata describing the job.
     * </p>
     */
    private java.util.List<GlacierJobDescription> jobList;
    /**
     * <p>
     * An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get
     * the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are
     * continuing the pagination of the results started in a previous List Jobs request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of job objects. Each job object contains metadata describing the job.
     * </p>
     * 
     * @return A list of job objects. Each job object contains metadata describing the job.
     */

    public java.util.List<GlacierJobDescription> getJobList() {
        return jobList;
    }

    /**
     * <p>
     * A list of job objects. Each job object contains metadata describing the job.
     * </p>
     * 
     * @param jobList
     *        A list of job objects. Each job object contains metadata describing the job.
     */

    public void setJobList(java.util.Collection<GlacierJobDescription> jobList) {
        if (jobList == null) {
            this.jobList = null;
            return;
        }

        this.jobList = new java.util.ArrayList<GlacierJobDescription>(jobList);
    }

    /**
     * <p>
     * A list of job objects. Each job object contains metadata describing the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobList(java.util.Collection)} or {@link #withJobList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobList
     *        A list of job objects. Each job object contains metadata describing the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobList(GlacierJobDescription... jobList) {
        if (this.jobList == null) {
            setJobList(new java.util.ArrayList<GlacierJobDescription>(jobList.length));
        }
        for (GlacierJobDescription ele : jobList) {
            this.jobList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job objects. Each job object contains metadata describing the job.
     * </p>
     * 
     * @param jobList
     *        A list of job objects. Each job object contains metadata describing the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withJobList(java.util.Collection<GlacierJobDescription> jobList) {
        setJobList(jobList);
        return this;
    }

    /**
     * <p>
     * An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get
     * the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are
     * continuing the pagination of the results started in a previous List Jobs request.
     * </p>
     * 
     * @param marker
     *        An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You
     *        get the <code>marker</code> value from a previous List Jobs response. You only need to include the marker
     *        if you are continuing the pagination of the results started in a previous List Jobs request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get
     * the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are
     * continuing the pagination of the results started in a previous List Jobs request.
     * </p>
     * 
     * @return An opaque string used for pagination that specifies the job at which the listing of jobs should begin.
     *         You get the <code>marker</code> value from a previous List Jobs response. You only need to include the
     *         marker if you are continuing the pagination of the results started in a previous List Jobs request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get
     * the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are
     * continuing the pagination of the results started in a previous List Jobs request.
     * </p>
     * 
     * @param marker
     *        An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You
     *        get the <code>marker</code> value from a previous List Jobs response. You only need to include the marker
     *        if you are continuing the pagination of the results started in a previous List Jobs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getJobList() != null)
            sb.append("JobList: ").append(getJobList()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsResult == false)
            return false;
        ListJobsResult other = (ListJobsResult) obj;
        if (other.getJobList() == null ^ this.getJobList() == null)
            return false;
        if (other.getJobList() != null && other.getJobList().equals(this.getJobList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobList() == null) ? 0 : getJobList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsResult clone() {
        try {
            return (ListJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
