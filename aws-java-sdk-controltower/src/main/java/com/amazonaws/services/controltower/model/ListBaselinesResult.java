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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListBaselines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBaselinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>Baseline</code> object details.
     * </p>
     */
    private java.util.List<BaselineSummary> baselines;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>Baseline</code> object details.
     * </p>
     * 
     * @return A list of <code>Baseline</code> object details.
     */

    public java.util.List<BaselineSummary> getBaselines() {
        return baselines;
    }

    /**
     * <p>
     * A list of <code>Baseline</code> object details.
     * </p>
     * 
     * @param baselines
     *        A list of <code>Baseline</code> object details.
     */

    public void setBaselines(java.util.Collection<BaselineSummary> baselines) {
        if (baselines == null) {
            this.baselines = null;
            return;
        }

        this.baselines = new java.util.ArrayList<BaselineSummary>(baselines);
    }

    /**
     * <p>
     * A list of <code>Baseline</code> object details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaselines(java.util.Collection)} or {@link #withBaselines(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param baselines
     *        A list of <code>Baseline</code> object details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBaselinesResult withBaselines(BaselineSummary... baselines) {
        if (this.baselines == null) {
            setBaselines(new java.util.ArrayList<BaselineSummary>(baselines.length));
        }
        for (BaselineSummary ele : baselines) {
            this.baselines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Baseline</code> object details.
     * </p>
     * 
     * @param baselines
     *        A list of <code>Baseline</code> object details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBaselinesResult withBaselines(java.util.Collection<BaselineSummary> baselines) {
        setBaselines(baselines);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBaselinesResult withNextToken(String nextToken) {
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
        if (getBaselines() != null)
            sb.append("Baselines: ").append(getBaselines()).append(",");
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

        if (obj instanceof ListBaselinesResult == false)
            return false;
        ListBaselinesResult other = (ListBaselinesResult) obj;
        if (other.getBaselines() == null ^ this.getBaselines() == null)
            return false;
        if (other.getBaselines() != null && other.getBaselines().equals(this.getBaselines()) == false)
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

        hashCode = prime * hashCode + ((getBaselines() == null) ? 0 : getBaselines().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBaselinesResult clone() {
        try {
            return (ListBaselinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
