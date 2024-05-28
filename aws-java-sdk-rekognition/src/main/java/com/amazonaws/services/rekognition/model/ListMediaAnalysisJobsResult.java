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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMediaAnalysisJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     */
    private java.util.List<MediaAnalysisJobDescription> mediaAnalysisJobs;

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * 
     * @param nextToken
     *        Pagination token, if the previous response was incomplete.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * 
     * @return Pagination token, if the previous response was incomplete.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * 
     * @param nextToken
     *        Pagination token, if the previous response was incomplete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaAnalysisJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     * 
     * @return Contains a list of all media analysis jobs.
     */

    public java.util.List<MediaAnalysisJobDescription> getMediaAnalysisJobs() {
        return mediaAnalysisJobs;
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     * 
     * @param mediaAnalysisJobs
     *        Contains a list of all media analysis jobs.
     */

    public void setMediaAnalysisJobs(java.util.Collection<MediaAnalysisJobDescription> mediaAnalysisJobs) {
        if (mediaAnalysisJobs == null) {
            this.mediaAnalysisJobs = null;
            return;
        }

        this.mediaAnalysisJobs = new java.util.ArrayList<MediaAnalysisJobDescription>(mediaAnalysisJobs);
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaAnalysisJobs(java.util.Collection)} or {@link #withMediaAnalysisJobs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param mediaAnalysisJobs
     *        Contains a list of all media analysis jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaAnalysisJobsResult withMediaAnalysisJobs(MediaAnalysisJobDescription... mediaAnalysisJobs) {
        if (this.mediaAnalysisJobs == null) {
            setMediaAnalysisJobs(new java.util.ArrayList<MediaAnalysisJobDescription>(mediaAnalysisJobs.length));
        }
        for (MediaAnalysisJobDescription ele : mediaAnalysisJobs) {
            this.mediaAnalysisJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     * 
     * @param mediaAnalysisJobs
     *        Contains a list of all media analysis jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMediaAnalysisJobsResult withMediaAnalysisJobs(java.util.Collection<MediaAnalysisJobDescription> mediaAnalysisJobs) {
        setMediaAnalysisJobs(mediaAnalysisJobs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMediaAnalysisJobs() != null)
            sb.append("MediaAnalysisJobs: ").append(getMediaAnalysisJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMediaAnalysisJobsResult == false)
            return false;
        ListMediaAnalysisJobsResult other = (ListMediaAnalysisJobsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMediaAnalysisJobs() == null ^ this.getMediaAnalysisJobs() == null)
            return false;
        if (other.getMediaAnalysisJobs() != null && other.getMediaAnalysisJobs().equals(this.getMediaAnalysisJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMediaAnalysisJobs() == null) ? 0 : getMediaAnalysisJobs().hashCode());
        return hashCode;
    }

    @Override
    public ListMediaAnalysisJobsResult clone() {
        try {
            return (ListMediaAnalysisJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
