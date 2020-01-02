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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHumanTaskUis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHumanTaskUisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects describing the human task user interfaces.
     * </p>
     */
    private java.util.List<HumanTaskUiSummary> humanTaskUiSummaries;
    /**
     * <p>
     * A token to resume pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects describing the human task user interfaces.
     * </p>
     * 
     * @return An array of objects describing the human task user interfaces.
     */

    public java.util.List<HumanTaskUiSummary> getHumanTaskUiSummaries() {
        return humanTaskUiSummaries;
    }

    /**
     * <p>
     * An array of objects describing the human task user interfaces.
     * </p>
     * 
     * @param humanTaskUiSummaries
     *        An array of objects describing the human task user interfaces.
     */

    public void setHumanTaskUiSummaries(java.util.Collection<HumanTaskUiSummary> humanTaskUiSummaries) {
        if (humanTaskUiSummaries == null) {
            this.humanTaskUiSummaries = null;
            return;
        }

        this.humanTaskUiSummaries = new java.util.ArrayList<HumanTaskUiSummary>(humanTaskUiSummaries);
    }

    /**
     * <p>
     * An array of objects describing the human task user interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHumanTaskUiSummaries(java.util.Collection)} or {@link #withHumanTaskUiSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param humanTaskUiSummaries
     *        An array of objects describing the human task user interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanTaskUisResult withHumanTaskUiSummaries(HumanTaskUiSummary... humanTaskUiSummaries) {
        if (this.humanTaskUiSummaries == null) {
            setHumanTaskUiSummaries(new java.util.ArrayList<HumanTaskUiSummary>(humanTaskUiSummaries.length));
        }
        for (HumanTaskUiSummary ele : humanTaskUiSummaries) {
            this.humanTaskUiSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects describing the human task user interfaces.
     * </p>
     * 
     * @param humanTaskUiSummaries
     *        An array of objects describing the human task user interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHumanTaskUisResult withHumanTaskUiSummaries(java.util.Collection<HumanTaskUiSummary> humanTaskUiSummaries) {
        setHumanTaskUiSummaries(humanTaskUiSummaries);
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

    public ListHumanTaskUisResult withNextToken(String nextToken) {
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
        if (getHumanTaskUiSummaries() != null)
            sb.append("HumanTaskUiSummaries: ").append(getHumanTaskUiSummaries()).append(",");
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

        if (obj instanceof ListHumanTaskUisResult == false)
            return false;
        ListHumanTaskUisResult other = (ListHumanTaskUisResult) obj;
        if (other.getHumanTaskUiSummaries() == null ^ this.getHumanTaskUiSummaries() == null)
            return false;
        if (other.getHumanTaskUiSummaries() != null && other.getHumanTaskUiSummaries().equals(this.getHumanTaskUiSummaries()) == false)
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

        hashCode = prime * hashCode + ((getHumanTaskUiSummaries() == null) ? 0 : getHumanTaskUiSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHumanTaskUisResult clone() {
        try {
            return (ListHumanTaskUisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
