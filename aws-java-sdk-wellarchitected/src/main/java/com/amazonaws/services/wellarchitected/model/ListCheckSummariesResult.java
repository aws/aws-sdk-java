/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckSummaries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCheckSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of Trusted Advisor summaries related to the Well-Architected best practice.
     * </p>
     */
    private java.util.List<CheckSummary> checkSummaries;

    private String nextToken;

    /**
     * <p>
     * List of Trusted Advisor summaries related to the Well-Architected best practice.
     * </p>
     * 
     * @return List of Trusted Advisor summaries related to the Well-Architected best practice.
     */

    public java.util.List<CheckSummary> getCheckSummaries() {
        return checkSummaries;
    }

    /**
     * <p>
     * List of Trusted Advisor summaries related to the Well-Architected best practice.
     * </p>
     * 
     * @param checkSummaries
     *        List of Trusted Advisor summaries related to the Well-Architected best practice.
     */

    public void setCheckSummaries(java.util.Collection<CheckSummary> checkSummaries) {
        if (checkSummaries == null) {
            this.checkSummaries = null;
            return;
        }

        this.checkSummaries = new java.util.ArrayList<CheckSummary>(checkSummaries);
    }

    /**
     * <p>
     * List of Trusted Advisor summaries related to the Well-Architected best practice.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckSummaries(java.util.Collection)} or {@link #withCheckSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param checkSummaries
     *        List of Trusted Advisor summaries related to the Well-Architected best practice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesResult withCheckSummaries(CheckSummary... checkSummaries) {
        if (this.checkSummaries == null) {
            setCheckSummaries(new java.util.ArrayList<CheckSummary>(checkSummaries.length));
        }
        for (CheckSummary ele : checkSummaries) {
            this.checkSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Trusted Advisor summaries related to the Well-Architected best practice.
     * </p>
     * 
     * @param checkSummaries
     *        List of Trusted Advisor summaries related to the Well-Architected best practice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesResult withCheckSummaries(java.util.Collection<CheckSummary> checkSummaries) {
        setCheckSummaries(checkSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesResult withNextToken(String nextToken) {
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
        if (getCheckSummaries() != null)
            sb.append("CheckSummaries: ").append(getCheckSummaries()).append(",");
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

        if (obj instanceof ListCheckSummariesResult == false)
            return false;
        ListCheckSummariesResult other = (ListCheckSummariesResult) obj;
        if (other.getCheckSummaries() == null ^ this.getCheckSummaries() == null)
            return false;
        if (other.getCheckSummaries() != null && other.getCheckSummaries().equals(this.getCheckSummaries()) == false)
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

        hashCode = prime * hashCode + ((getCheckSummaries() == null) ? 0 : getCheckSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCheckSummariesResult clone() {
        try {
            return (ListCheckSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
