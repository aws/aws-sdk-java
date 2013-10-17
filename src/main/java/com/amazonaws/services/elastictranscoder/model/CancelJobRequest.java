/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#cancelJob(CancelJobRequest) CancelJob operation}.
 * <p>
 * The CancelJob operation cancels an unfinished job.
 * </p>
 * <p>
 * <b>NOTE:</b>You can only cancel a job that has a status of Submitted. To prevent a pipeline from starting to process a job while you're getting the
 * job identifier, use UpdatePipelineStatus to temporarily pause the pipeline.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#cancelJob(CancelJobRequest)
 */
public class CancelJobRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the job that you want to cancel. <p>To get a list of
     * the jobs (including their <code>jobId</code>) that have a status of
     * <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

    /**
     * The identifier of the job that you want to cancel. <p>To get a list of
     * the jobs (including their <code>jobId</code>) that have a status of
     * <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The identifier of the job that you want to cancel. <p>To get a list of
     *         the jobs (including their <code>jobId</code>) that have a status of
     *         <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the job that you want to cancel. <p>To get a list of
     * the jobs (including their <code>jobId</code>) that have a status of
     * <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier of the job that you want to cancel. <p>To get a list of
     *         the jobs (including their <code>jobId</code>) that have a status of
     *         <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the job that you want to cancel. <p>To get a list of
     * the jobs (including their <code>jobId</code>) that have a status of
     * <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier of the job that you want to cancel. <p>To get a list of
     *         the jobs (including their <code>jobId</code>) that have a status of
     *         <code>Submitted</code>, use the <a>ListJobsByStatus</a> API action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CancelJobRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelJobRequest == false) return false;
        CancelJobRequest other = (CancelJobRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    