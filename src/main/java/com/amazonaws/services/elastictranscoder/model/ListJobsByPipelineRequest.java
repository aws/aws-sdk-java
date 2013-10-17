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
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#listJobsByPipeline(ListJobsByPipelineRequest) ListJobsByPipeline operation}.
 * <p>
 * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.
 * </p>
 * <p>
 * Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one element for each job that satisfies the
 * search criteria.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#listJobsByPipeline(ListJobsByPipelineRequest)
 */
public class ListJobsByPipelineRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the pipeline for which you want to get job information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String pipelineId;

    /**
     * To list jobs in chronological order by the date and time that they
     * were submitted, enter <code>true</code>. To list jobs in reverse
     * chronological order, enter <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     */
    private String ascending;

    /**
     * When Elastic Transcoder returns more than one page of results, use
     * <code>pageToken</code> in subsequent <code>GET</code> requests to get
     * each successive page of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String pageToken;

    /**
     * The ID of the pipeline for which you want to get job information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The ID of the pipeline for which you want to get job information.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID of the pipeline for which you want to get job information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param pipelineId The ID of the pipeline for which you want to get job information.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID of the pipeline for which you want to get job information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param pipelineId The ID of the pipeline for which you want to get job information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByPipelineRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * To list jobs in chronological order by the date and time that they
     * were submitted, enter <code>true</code>. To list jobs in reverse
     * chronological order, enter <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @return To list jobs in chronological order by the date and time that they
     *         were submitted, enter <code>true</code>. To list jobs in reverse
     *         chronological order, enter <code>false</code>.
     */
    public String getAscending() {
        return ascending;
    }
    
    /**
     * To list jobs in chronological order by the date and time that they
     * were submitted, enter <code>true</code>. To list jobs in reverse
     * chronological order, enter <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param ascending To list jobs in chronological order by the date and time that they
     *         were submitted, enter <code>true</code>. To list jobs in reverse
     *         chronological order, enter <code>false</code>.
     */
    public void setAscending(String ascending) {
        this.ascending = ascending;
    }
    
    /**
     * To list jobs in chronological order by the date and time that they
     * were submitted, enter <code>true</code>. To list jobs in reverse
     * chronological order, enter <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param ascending To list jobs in chronological order by the date and time that they
     *         were submitted, enter <code>true</code>. To list jobs in reverse
     *         chronological order, enter <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByPipelineRequest withAscending(String ascending) {
        this.ascending = ascending;
        return this;
    }

    /**
     * When Elastic Transcoder returns more than one page of results, use
     * <code>pageToken</code> in subsequent <code>GET</code> requests to get
     * each successive page of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return When Elastic Transcoder returns more than one page of results, use
     *         <code>pageToken</code> in subsequent <code>GET</code> requests to get
     *         each successive page of results.
     */
    public String getPageToken() {
        return pageToken;
    }
    
    /**
     * When Elastic Transcoder returns more than one page of results, use
     * <code>pageToken</code> in subsequent <code>GET</code> requests to get
     * each successive page of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param pageToken When Elastic Transcoder returns more than one page of results, use
     *         <code>pageToken</code> in subsequent <code>GET</code> requests to get
     *         each successive page of results.
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }
    
    /**
     * When Elastic Transcoder returns more than one page of results, use
     * <code>pageToken</code> in subsequent <code>GET</code> requests to get
     * each successive page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param pageToken When Elastic Transcoder returns more than one page of results, use
     *         <code>pageToken</code> in subsequent <code>GET</code> requests to get
     *         each successive page of results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByPipelineRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getAscending() != null) sb.append("Ascending: " + getAscending() + ",");
        if (getPageToken() != null) sb.append("PageToken: " + getPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getAscending() == null) ? 0 : getAscending().hashCode()); 
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsByPipelineRequest == false) return false;
        ListJobsByPipelineRequest other = (ListJobsByPipelineRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getAscending() == null ^ this.getAscending() == null) return false;
        if (other.getAscending() != null && other.getAscending().equals(this.getAscending()) == false) return false; 
        if (other.getPageToken() == null ^ this.getPageToken() == null) return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false) return false; 
        return true;
    }
    
}
    