/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListHarvestJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHarvestJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of HarvestJob records. */
    private java.util.List<HarvestJob> harvestJobs;
    /** A token that can be used to resume pagination from the end of the collection. */
    private String nextToken;

    /**
     * A list of HarvestJob records.
     * 
     * @return A list of HarvestJob records.
     */

    public java.util.List<HarvestJob> getHarvestJobs() {
        return harvestJobs;
    }

    /**
     * A list of HarvestJob records.
     * 
     * @param harvestJobs
     *        A list of HarvestJob records.
     */

    public void setHarvestJobs(java.util.Collection<HarvestJob> harvestJobs) {
        if (harvestJobs == null) {
            this.harvestJobs = null;
            return;
        }

        this.harvestJobs = new java.util.ArrayList<HarvestJob>(harvestJobs);
    }

    /**
     * A list of HarvestJob records.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHarvestJobs(java.util.Collection)} or {@link #withHarvestJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param harvestJobs
     *        A list of HarvestJob records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsResult withHarvestJobs(HarvestJob... harvestJobs) {
        if (this.harvestJobs == null) {
            setHarvestJobs(new java.util.ArrayList<HarvestJob>(harvestJobs.length));
        }
        for (HarvestJob ele : harvestJobs) {
            this.harvestJobs.add(ele);
        }
        return this;
    }

    /**
     * A list of HarvestJob records.
     * 
     * @param harvestJobs
     *        A list of HarvestJob records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsResult withHarvestJobs(java.util.Collection<HarvestJob> harvestJobs) {
        setHarvestJobs(harvestJobs);
        return this;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @return A token that can be used to resume pagination from the end of the collection.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHarvestJobsResult withNextToken(String nextToken) {
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
        if (getHarvestJobs() != null)
            sb.append("HarvestJobs: ").append(getHarvestJobs()).append(",");
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

        if (obj instanceof ListHarvestJobsResult == false)
            return false;
        ListHarvestJobsResult other = (ListHarvestJobsResult) obj;
        if (other.getHarvestJobs() == null ^ this.getHarvestJobs() == null)
            return false;
        if (other.getHarvestJobs() != null && other.getHarvestJobs().equals(this.getHarvestJobs()) == false)
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

        hashCode = prime * hashCode + ((getHarvestJobs() == null) ? 0 : getHarvestJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHarvestJobsResult clone() {
        try {
            return (ListHarvestJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
