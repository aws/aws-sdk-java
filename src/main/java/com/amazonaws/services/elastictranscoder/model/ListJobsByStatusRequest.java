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
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#listJobsByStatus(ListJobsByStatusRequest) ListJobsByStatus operation}.
 * <p>
 * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one element for each job that satisfies
 * the search criteria.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#listJobsByStatus(ListJobsByStatusRequest)
 */
public class ListJobsByStatusRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * To get information about all of the jobs associated with the current
     * AWS account that have a given status, specify the following status:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     */
    private String status;

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
     * To get information about all of the jobs associated with the current
     * AWS account that have a given status, specify the following status:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @return To get information about all of the jobs associated with the current
     *         AWS account that have a given status, specify the following status:
     *         <code>Submitted</code>, <code>Progressing</code>,
     *         <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * To get information about all of the jobs associated with the current
     * AWS account that have a given status, specify the following status:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status To get information about all of the jobs associated with the current
     *         AWS account that have a given status, specify the following status:
     *         <code>Submitted</code>, <code>Progressing</code>,
     *         <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * To get information about all of the jobs associated with the current
     * AWS account that have a given status, specify the following status:
     * <code>Submitted</code>, <code>Progressing</code>,
     * <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status To get information about all of the jobs associated with the current
     *         AWS account that have a given status, specify the following status:
     *         <code>Submitted</code>, <code>Progressing</code>,
     *         <code>Complete</code>, <code>Canceled</code>, or <code>Error</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByStatusRequest withStatus(String status) {
        this.status = status;
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
    public ListJobsByStatusRequest withAscending(String ascending) {
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
    public ListJobsByStatusRequest withPageToken(String pageToken) {
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getAscending() != null) sb.append("Ascending: " + getAscending() + ",");
        if (getPageToken() != null) sb.append("PageToken: " + getPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getAscending() == null) ? 0 : getAscending().hashCode()); 
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsByStatusRequest == false) return false;
        ListJobsByStatusRequest other = (ListJobsByStatusRequest)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getAscending() == null ^ this.getAscending() == null) return false;
        if (other.getAscending() != null && other.getAscending().equals(this.getAscending()) == false) return false; 
        if (other.getPageToken() == null ^ this.getPageToken() == null) return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false) return false; 
        return true;
    }
    
}
    