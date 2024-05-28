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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListAnalysisTemplates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnalysisTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists analysis template metadata.
     * </p>
     */
    private java.util.List<AnalysisTemplateSummary> analysisTemplateSummaries;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalysisTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists analysis template metadata.
     * </p>
     * 
     * @return Lists analysis template metadata.
     */

    public java.util.List<AnalysisTemplateSummary> getAnalysisTemplateSummaries() {
        return analysisTemplateSummaries;
    }

    /**
     * <p>
     * Lists analysis template metadata.
     * </p>
     * 
     * @param analysisTemplateSummaries
     *        Lists analysis template metadata.
     */

    public void setAnalysisTemplateSummaries(java.util.Collection<AnalysisTemplateSummary> analysisTemplateSummaries) {
        if (analysisTemplateSummaries == null) {
            this.analysisTemplateSummaries = null;
            return;
        }

        this.analysisTemplateSummaries = new java.util.ArrayList<AnalysisTemplateSummary>(analysisTemplateSummaries);
    }

    /**
     * <p>
     * Lists analysis template metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisTemplateSummaries(java.util.Collection)} or
     * {@link #withAnalysisTemplateSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param analysisTemplateSummaries
     *        Lists analysis template metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalysisTemplatesResult withAnalysisTemplateSummaries(AnalysisTemplateSummary... analysisTemplateSummaries) {
        if (this.analysisTemplateSummaries == null) {
            setAnalysisTemplateSummaries(new java.util.ArrayList<AnalysisTemplateSummary>(analysisTemplateSummaries.length));
        }
        for (AnalysisTemplateSummary ele : analysisTemplateSummaries) {
            this.analysisTemplateSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists analysis template metadata.
     * </p>
     * 
     * @param analysisTemplateSummaries
     *        Lists analysis template metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalysisTemplatesResult withAnalysisTemplateSummaries(java.util.Collection<AnalysisTemplateSummary> analysisTemplateSummaries) {
        setAnalysisTemplateSummaries(analysisTemplateSummaries);
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
        if (getAnalysisTemplateSummaries() != null)
            sb.append("AnalysisTemplateSummaries: ").append(getAnalysisTemplateSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnalysisTemplatesResult == false)
            return false;
        ListAnalysisTemplatesResult other = (ListAnalysisTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAnalysisTemplateSummaries() == null ^ this.getAnalysisTemplateSummaries() == null)
            return false;
        if (other.getAnalysisTemplateSummaries() != null && other.getAnalysisTemplateSummaries().equals(this.getAnalysisTemplateSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAnalysisTemplateSummaries() == null) ? 0 : getAnalysisTemplateSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListAnalysisTemplatesResult clone() {
        try {
            return (ListAnalysisTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
