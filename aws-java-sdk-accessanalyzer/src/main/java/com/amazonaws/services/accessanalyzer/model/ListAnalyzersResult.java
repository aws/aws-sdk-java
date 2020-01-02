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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnalyzersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     */
    private java.util.List<AnalyzerSummary> analyzers;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     * 
     * @return The analyzers retrieved.
     */

    public java.util.List<AnalyzerSummary> getAnalyzers() {
        return analyzers;
    }

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     * 
     * @param analyzers
     *        The analyzers retrieved.
     */

    public void setAnalyzers(java.util.Collection<AnalyzerSummary> analyzers) {
        if (analyzers == null) {
            this.analyzers = null;
            return;
        }

        this.analyzers = new java.util.ArrayList<AnalyzerSummary>(analyzers);
    }

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalyzers(java.util.Collection)} or {@link #withAnalyzers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param analyzers
     *        The analyzers retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzersResult withAnalyzers(AnalyzerSummary... analyzers) {
        if (this.analyzers == null) {
            setAnalyzers(new java.util.ArrayList<AnalyzerSummary>(analyzers.length));
        }
        for (AnalyzerSummary ele : analyzers) {
            this.analyzers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     * 
     * @param analyzers
     *        The analyzers retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzersResult withAnalyzers(java.util.Collection<AnalyzerSummary> analyzers) {
        setAnalyzers(analyzers);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzersResult withNextToken(String nextToken) {
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
        if (getAnalyzers() != null)
            sb.append("Analyzers: ").append(getAnalyzers()).append(",");
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

        if (obj instanceof ListAnalyzersResult == false)
            return false;
        ListAnalyzersResult other = (ListAnalyzersResult) obj;
        if (other.getAnalyzers() == null ^ this.getAnalyzers() == null)
            return false;
        if (other.getAnalyzers() != null && other.getAnalyzers().equals(this.getAnalyzers()) == false)
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

        hashCode = prime * hashCode + ((getAnalyzers() == null) ? 0 : getAnalyzers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnalyzersResult clone() {
        try {
            return (ListAnalyzersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
