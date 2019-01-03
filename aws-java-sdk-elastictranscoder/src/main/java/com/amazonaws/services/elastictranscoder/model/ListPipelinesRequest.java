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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>ListPipelineRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To list pipelines in chronological order by the date and time that they were created, enter <code>true</code>. To
     * list pipelines in reverse chronological order, enter <code>false</code>.
     * </p>
     */
    private String ascending;
    /**
     * <p>
     * When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     * <code>GET</code> requests to get each successive page of results.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * To list pipelines in chronological order by the date and time that they were created, enter <code>true</code>. To
     * list pipelines in reverse chronological order, enter <code>false</code>.
     * </p>
     * 
     * @param ascending
     *        To list pipelines in chronological order by the date and time that they were created, enter
     *        <code>true</code>. To list pipelines in reverse chronological order, enter <code>false</code>.
     */

    public void setAscending(String ascending) {
        this.ascending = ascending;
    }

    /**
     * <p>
     * To list pipelines in chronological order by the date and time that they were created, enter <code>true</code>. To
     * list pipelines in reverse chronological order, enter <code>false</code>.
     * </p>
     * 
     * @return To list pipelines in chronological order by the date and time that they were created, enter
     *         <code>true</code>. To list pipelines in reverse chronological order, enter <code>false</code>.
     */

    public String getAscending() {
        return this.ascending;
    }

    /**
     * <p>
     * To list pipelines in chronological order by the date and time that they were created, enter <code>true</code>. To
     * list pipelines in reverse chronological order, enter <code>false</code>.
     * </p>
     * 
     * @param ascending
     *        To list pipelines in chronological order by the date and time that they were created, enter
     *        <code>true</code>. To list pipelines in reverse chronological order, enter <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withAscending(String ascending) {
        setAscending(ascending);
        return this;
    }

    /**
     * <p>
     * When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     * <code>GET</code> requests to get each successive page of results.
     * </p>
     * 
     * @param pageToken
     *        When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     *        <code>GET</code> requests to get each successive page of results.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     * <code>GET</code> requests to get each successive page of results.
     * </p>
     * 
     * @return When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     *         <code>GET</code> requests to get each successive page of results.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     * <code>GET</code> requests to get each successive page of results.
     * </p>
     * 
     * @param pageToken
     *        When Elastic Transcoder returns more than one page of results, use <code>pageToken</code> in subsequent
     *        <code>GET</code> requests to get each successive page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getAscending() != null)
            sb.append("Ascending: ").append(getAscending()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPipelinesRequest == false)
            return false;
        ListPipelinesRequest other = (ListPipelinesRequest) obj;
        if (other.getAscending() == null ^ this.getAscending() == null)
            return false;
        if (other.getAscending() != null && other.getAscending().equals(this.getAscending()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
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
    public ListPipelinesRequest clone() {
        return (ListPipelinesRequest) super.clone();
    }

}
