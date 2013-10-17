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
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipelineStatus(UpdatePipelineStatusRequest) UpdatePipelineStatus operation}.
 * <p>
 * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the processing of jobs.
 * </p>
 * <p>
 * Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after Elastic Transcoder has started processing
 * them; if you pause the pipeline to which you submitted the jobs, you have more time to get the job IDs for the jobs that you want to cancel, and to
 * send a CancelJob request.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipelineStatus(UpdatePipelineStatusRequest)
 */
public class UpdatePipelineStatusRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the pipeline to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

    /**
     * The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     * pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     */
    private String status;

    /**
     * The identifier of the pipeline to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The identifier of the pipeline to update.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the pipeline to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier of the pipeline to update.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the pipeline to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier of the pipeline to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineStatusRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     * pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     *
     * @return The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     *         pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     *         pipeline is not currently processing jobs.</li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     * pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     *
     * @param status The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     *         pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     *         pipeline is not currently processing jobs.</li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     * pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     * pipeline is not currently processing jobs.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Active$)|(^Paused$)<br/>
     *
     * @param status The desired status of the pipeline: <ul> <li> <code>Active</code>: The
     *         pipeline is processing jobs.</li> <li> <code>Paused</code>: The
     *         pipeline is not currently processing jobs.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineStatusRequest withStatus(String status) {
        this.status = status;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdatePipelineStatusRequest == false) return false;
        UpdatePipelineStatusRequest other = (UpdatePipelineStatusRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    