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

/**
 * <p>
 * A list of the pipelines associated with the current AWS account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Pipeline</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Pipeline> pipelines;
    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of <code>Pipeline</code> objects.
     * </p>
     * 
     * @return An array of <code>Pipeline</code> objects.
     */

    public java.util.List<Pipeline> getPipelines() {
        if (pipelines == null) {
            pipelines = new com.amazonaws.internal.SdkInternalList<Pipeline>();
        }
        return pipelines;
    }

    /**
     * <p>
     * An array of <code>Pipeline</code> objects.
     * </p>
     * 
     * @param pipelines
     *        An array of <code>Pipeline</code> objects.
     */

    public void setPipelines(java.util.Collection<Pipeline> pipelines) {
        if (pipelines == null) {
            this.pipelines = null;
            return;
        }

        this.pipelines = new com.amazonaws.internal.SdkInternalList<Pipeline>(pipelines);
    }

    /**
     * <p>
     * An array of <code>Pipeline</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelines(java.util.Collection)} or {@link #withPipelines(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelines
     *        An array of <code>Pipeline</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelines(Pipeline... pipelines) {
        if (this.pipelines == null) {
            setPipelines(new com.amazonaws.internal.SdkInternalList<Pipeline>(pipelines.length));
        }
        for (Pipeline ele : pipelines) {
            this.pipelines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Pipeline</code> objects.
     * </p>
     * 
     * @param pipelines
     *        An array of <code>Pipeline</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelines(java.util.Collection<Pipeline> pipelines) {
        setPipelines(pipelines);
        return this;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     * 
     * @param nextPageToken
     *        A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit
     *        on one page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     *        <code>null</code>.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     * 
     * @return A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit
     *         on one page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     *         <code>null</code>.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one
     * page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     * <code>null</code>.
     * </p>
     * 
     * @param nextPageToken
     *        A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit
     *        on one page or when you've reached the last page of results, the value of <code>NextPageToken</code> is
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getPipelines() != null)
            sb.append("Pipelines: ").append(getPipelines()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPipelinesResult == false)
            return false;
        ListPipelinesResult other = (ListPipelinesResult) obj;
        if (other.getPipelines() == null ^ this.getPipelines() == null)
            return false;
        if (other.getPipelines() != null && other.getPipelines().equals(this.getPipelines()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesResult clone() {
        try {
            return (ListPipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
