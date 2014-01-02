/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#listPipelines(ListPipelinesRequest) ListPipelines operation}.
 * <p>
 * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#listPipelines(ListPipelinesRequest)
 */
public class ListPipelinesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * To list pipelines in chronological order by the date and time that
     * they were created, enter <code>true</code>. To list pipelines in
     * reverse chronological order, enter <code>false</code>.
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
     * To list pipelines in chronological order by the date and time that
     * they were created, enter <code>true</code>. To list pipelines in
     * reverse chronological order, enter <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @return To list pipelines in chronological order by the date and time that
     *         they were created, enter <code>true</code>. To list pipelines in
     *         reverse chronological order, enter <code>false</code>.
     */
    public String getAscending() {
        return ascending;
    }
    
    /**
     * To list pipelines in chronological order by the date and time that
     * they were created, enter <code>true</code>. To list pipelines in
     * reverse chronological order, enter <code>false</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param ascending To list pipelines in chronological order by the date and time that
     *         they were created, enter <code>true</code>. To list pipelines in
     *         reverse chronological order, enter <code>false</code>.
     */
    public void setAscending(String ascending) {
        this.ascending = ascending;
    }
    
    /**
     * To list pipelines in chronological order by the date and time that
     * they were created, enter <code>true</code>. To list pipelines in
     * reverse chronological order, enter <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^true$)|(^false$)<br/>
     *
     * @param ascending To list pipelines in chronological order by the date and time that
     *         they were created, enter <code>true</code>. To list pipelines in
     *         reverse chronological order, enter <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListPipelinesRequest withAscending(String ascending) {
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
    public ListPipelinesRequest withPageToken(String pageToken) {
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
        if (getAscending() != null) sb.append("Ascending: " + getAscending() + ",");
        if (getPageToken() != null) sb.append("PageToken: " + getPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAscending() == null) ? 0 : getAscending().hashCode()); 
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPipelinesRequest == false) return false;
        ListPipelinesRequest other = (ListPipelinesRequest)obj;
        
        if (other.getAscending() == null ^ this.getAscending() == null) return false;
        if (other.getAscending() != null && other.getAscending().equals(this.getAscending()) == false) return false; 
        if (other.getPageToken() == null ^ this.getPageToken() == null) return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false) return false; 
        return true;
    }
    
}
    