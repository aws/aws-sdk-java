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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/ListHumanLoops"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHumanLoopsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects containing information about the human loops.
     * </p>
     */
    private java.util.List<HumanLoopSummary> humanLoopSummaries;
    /**
     * <p>
     * A token to resume pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects containing information about the human loops.
     * </p>
     * 
     * @return An array of objects containing information about the human loops.
     */

    public java.util.List<HumanLoopSummary> getHumanLoopSummaries() {
        return humanLoopSummaries;
    }

    /**
     * <p>
     * An array of objects containing information about the human loops.
     * </p>
     * 
     * @param humanLoopSummaries
     *        An array of objects containing information about the human loops.
     */

    public void setHumanLoopSummaries(java.util.Collection<HumanLoopSummary> humanLoopSummaries) {
        if (humanLoopSummaries == null) {
            this.humanLoopSummaries = null;
            return;
        }

        this.humanLoopSummaries = new java.util.ArrayList<HumanLoopSummary>(humanLoopSummaries);
    }

    /**
     * <p>
     * An array of objects containing information about the human loops.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHumanLoopSummaries(java.util.Collection)} or {@link #withHumanLoopSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param humanLoopSummaries
     *        An array of objects containing information about the human loops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsResult withHumanLoopSummaries(HumanLoopSummary... humanLoopSummaries) {
        if (this.humanLoopSummaries == null) {
            setHumanLoopSummaries(new java.util.ArrayList<HumanLoopSummary>(humanLoopSummaries.length));
        }
        for (HumanLoopSummary ele : humanLoopSummaries) {
            this.humanLoopSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects containing information about the human loops.
     * </p>
     * 
     * @param humanLoopSummaries
     *        An array of objects containing information about the human loops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsResult withHumanLoopSummaries(java.util.Collection<HumanLoopSummary> humanLoopSummaries) {
        setHumanLoopSummaries(humanLoopSummaries);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @return A token to resume pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanLoopsResult withNextToken(String nextToken) {
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
        if (getHumanLoopSummaries() != null)
            sb.append("HumanLoopSummaries: ").append(getHumanLoopSummaries()).append(",");
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

        if (obj instanceof ListHumanLoopsResult == false)
            return false;
        ListHumanLoopsResult other = (ListHumanLoopsResult) obj;
        if (other.getHumanLoopSummaries() == null ^ this.getHumanLoopSummaries() == null)
            return false;
        if (other.getHumanLoopSummaries() != null && other.getHumanLoopSummaries().equals(this.getHumanLoopSummaries()) == false)
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

        hashCode = prime * hashCode + ((getHumanLoopSummaries() == null) ? 0 : getHumanLoopSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHumanLoopsResult clone() {
        try {
            return (ListHumanLoopsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
