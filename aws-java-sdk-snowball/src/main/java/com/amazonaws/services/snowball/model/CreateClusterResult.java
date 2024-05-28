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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * List of jobs created for this cluster. For syntax, see <a
     * href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     * >ListJobsResult$JobListEntries</a> in this guide.
     * </p>
     */
    private java.util.List<JobListEntry> jobListEntries;

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @param clusterId
     *        The automatically generated ID for a cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @return The automatically generated ID for a cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @param clusterId
     *        The automatically generated ID for a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterResult withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * List of jobs created for this cluster. For syntax, see <a
     * href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     * >ListJobsResult$JobListEntries</a> in this guide.
     * </p>
     * 
     * @return List of jobs created for this cluster. For syntax, see <a
     *         href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     *         >ListJobsResult$JobListEntries</a> in this guide.
     */

    public java.util.List<JobListEntry> getJobListEntries() {
        return jobListEntries;
    }

    /**
     * <p>
     * List of jobs created for this cluster. For syntax, see <a
     * href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     * >ListJobsResult$JobListEntries</a> in this guide.
     * </p>
     * 
     * @param jobListEntries
     *        List of jobs created for this cluster. For syntax, see <a
     *        href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     *        >ListJobsResult$JobListEntries</a> in this guide.
     */

    public void setJobListEntries(java.util.Collection<JobListEntry> jobListEntries) {
        if (jobListEntries == null) {
            this.jobListEntries = null;
            return;
        }

        this.jobListEntries = new java.util.ArrayList<JobListEntry>(jobListEntries);
    }

    /**
     * <p>
     * List of jobs created for this cluster. For syntax, see <a
     * href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     * >ListJobsResult$JobListEntries</a> in this guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobListEntries(java.util.Collection)} or {@link #withJobListEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param jobListEntries
     *        List of jobs created for this cluster. For syntax, see <a
     *        href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     *        >ListJobsResult$JobListEntries</a> in this guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterResult withJobListEntries(JobListEntry... jobListEntries) {
        if (this.jobListEntries == null) {
            setJobListEntries(new java.util.ArrayList<JobListEntry>(jobListEntries.length));
        }
        for (JobListEntry ele : jobListEntries) {
            this.jobListEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of jobs created for this cluster. For syntax, see <a
     * href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     * >ListJobsResult$JobListEntries</a> in this guide.
     * </p>
     * 
     * @param jobListEntries
     *        List of jobs created for this cluster. For syntax, see <a
     *        href="http://amazonaws.com/snowball/latest/api-reference/API_ListJobs.html#API_ListJobs_ResponseSyntax"
     *        >ListJobsResult$JobListEntries</a> in this guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterResult withJobListEntries(java.util.Collection<JobListEntry> jobListEntries) {
        setJobListEntries(jobListEntries);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getJobListEntries() != null)
            sb.append("JobListEntries: ").append(getJobListEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterResult == false)
            return false;
        CreateClusterResult other = (CreateClusterResult) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getJobListEntries() == null ^ this.getJobListEntries() == null)
            return false;
        if (other.getJobListEntries() != null && other.getJobListEntries().equals(this.getJobListEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getJobListEntries() == null) ? 0 : getJobListEntries().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterResult clone() {
        try {
            return (CreateClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
