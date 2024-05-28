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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of the matching stages (summary information only).
     * </p>
     */
    private java.util.List<StageSummary> stages;

    /**
     * <p>
     * If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @param nextToken
     *        If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @return If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *         the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @param nextToken
     *        If there are more stages than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of the matching stages (summary information only).
     * </p>
     * 
     * @return List of the matching stages (summary information only).
     */

    public java.util.List<StageSummary> getStages() {
        return stages;
    }

    /**
     * <p>
     * List of the matching stages (summary information only).
     * </p>
     * 
     * @param stages
     *        List of the matching stages (summary information only).
     */

    public void setStages(java.util.Collection<StageSummary> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<StageSummary>(stages);
    }

    /**
     * <p>
     * List of the matching stages (summary information only).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        List of the matching stages (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStagesResult withStages(StageSummary... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<StageSummary>(stages.length));
        }
        for (StageSummary ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching stages (summary information only).
     * </p>
     * 
     * @param stages
     *        List of the matching stages (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStagesResult withStages(java.util.Collection<StageSummary> stages) {
        setStages(stages);
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
        if (getStages() != null)
            sb.append("Stages: ").append(getStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStagesResult == false)
            return false;
        ListStagesResult other = (ListStagesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        return hashCode;
    }

    @Override
    public ListStagesResult clone() {
        try {
            return (ListStagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
