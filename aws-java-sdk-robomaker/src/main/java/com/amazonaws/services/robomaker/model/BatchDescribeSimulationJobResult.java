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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDescribeSimulationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeSimulationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of simulation jobs.
     * </p>
     */
    private java.util.List<SimulationJob> jobs;
    /**
     * <p>
     * A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<String> unprocessedJobs;

    /**
     * <p>
     * A list of simulation jobs.
     * </p>
     * 
     * @return A list of simulation jobs.
     */

    public java.util.List<SimulationJob> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of simulation jobs.
     * </p>
     * 
     * @param jobs
     *        A list of simulation jobs.
     */

    public void setJobs(java.util.Collection<SimulationJob> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<SimulationJob>(jobs);
    }

    /**
     * <p>
     * A list of simulation jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        A list of simulation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeSimulationJobResult withJobs(SimulationJob... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<SimulationJob>(jobs.length));
        }
        for (SimulationJob ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of simulation jobs.
     * </p>
     * 
     * @param jobs
     *        A list of simulation jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeSimulationJobResult withJobs(java.util.Collection<SimulationJob> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return A list of unprocessed simulation job Amazon Resource Names (ARNs).
     */

    public java.util.List<String> getUnprocessedJobs() {
        return unprocessedJobs;
    }

    /**
     * <p>
     * A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param unprocessedJobs
     *        A list of unprocessed simulation job Amazon Resource Names (ARNs).
     */

    public void setUnprocessedJobs(java.util.Collection<String> unprocessedJobs) {
        if (unprocessedJobs == null) {
            this.unprocessedJobs = null;
            return;
        }

        this.unprocessedJobs = new java.util.ArrayList<String>(unprocessedJobs);
    }

    /**
     * <p>
     * A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedJobs(java.util.Collection)} or {@link #withUnprocessedJobs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param unprocessedJobs
     *        A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeSimulationJobResult withUnprocessedJobs(String... unprocessedJobs) {
        if (this.unprocessedJobs == null) {
            setUnprocessedJobs(new java.util.ArrayList<String>(unprocessedJobs.length));
        }
        for (String ele : unprocessedJobs) {
            this.unprocessedJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param unprocessedJobs
     *        A list of unprocessed simulation job Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeSimulationJobResult withUnprocessedJobs(java.util.Collection<String> unprocessedJobs) {
        setUnprocessedJobs(unprocessedJobs);
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
        if (getJobs() != null)
            sb.append("Jobs: ").append(getJobs()).append(",");
        if (getUnprocessedJobs() != null)
            sb.append("UnprocessedJobs: ").append(getUnprocessedJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeSimulationJobResult == false)
            return false;
        BatchDescribeSimulationJobResult other = (BatchDescribeSimulationJobResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getUnprocessedJobs() == null ^ this.getUnprocessedJobs() == null)
            return false;
        if (other.getUnprocessedJobs() != null && other.getUnprocessedJobs().equals(this.getUnprocessedJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedJobs() == null) ? 0 : getUnprocessedJobs().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeSimulationJobResult clone() {
        try {
            return (BatchDescribeSimulationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
