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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListDiscoveryJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveryJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The discovery jobs that you've run.
     * </p>
     */
    private java.util.List<DiscoveryJobListEntry> discoveryJobs;
    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The discovery jobs that you've run.
     * </p>
     * 
     * @return The discovery jobs that you've run.
     */

    public java.util.List<DiscoveryJobListEntry> getDiscoveryJobs() {
        return discoveryJobs;
    }

    /**
     * <p>
     * The discovery jobs that you've run.
     * </p>
     * 
     * @param discoveryJobs
     *        The discovery jobs that you've run.
     */

    public void setDiscoveryJobs(java.util.Collection<DiscoveryJobListEntry> discoveryJobs) {
        if (discoveryJobs == null) {
            this.discoveryJobs = null;
            return;
        }

        this.discoveryJobs = new java.util.ArrayList<DiscoveryJobListEntry>(discoveryJobs);
    }

    /**
     * <p>
     * The discovery jobs that you've run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiscoveryJobs(java.util.Collection)} or {@link #withDiscoveryJobs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param discoveryJobs
     *        The discovery jobs that you've run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveryJobsResult withDiscoveryJobs(DiscoveryJobListEntry... discoveryJobs) {
        if (this.discoveryJobs == null) {
            setDiscoveryJobs(new java.util.ArrayList<DiscoveryJobListEntry>(discoveryJobs.length));
        }
        for (DiscoveryJobListEntry ele : discoveryJobs) {
            this.discoveryJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The discovery jobs that you've run.
     * </p>
     * 
     * @param discoveryJobs
     *        The discovery jobs that you've run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveryJobsResult withDiscoveryJobs(java.util.Collection<DiscoveryJobListEntry> discoveryJobs) {
        setDiscoveryJobs(discoveryJobs);
        return this;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return The opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveryJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDiscoveryJobs() != null)
            sb.append("DiscoveryJobs: ").append(getDiscoveryJobs()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDiscoveryJobsResult == false)
            return false;
        ListDiscoveryJobsResult other = (ListDiscoveryJobsResult) obj;
        if (other.getDiscoveryJobs() == null ^ this.getDiscoveryJobs() == null)
            return false;
        if (other.getDiscoveryJobs() != null && other.getDiscoveryJobs().equals(this.getDiscoveryJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveryJobs() == null) ? 0 : getDiscoveryJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveryJobsResult clone() {
        try {
            return (ListDiscoveryJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
