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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExplainabilitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability resource.
     * </p>
     */
    private java.util.List<ExplainabilitySummary> explainabilities;
    /**
     * <p>
     * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability resource.
     * </p>
     * 
     * @return An array of objects that summarize the properties of each Explainability resource.
     */

    public java.util.List<ExplainabilitySummary> getExplainabilities() {
        return explainabilities;
    }

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability resource.
     * </p>
     * 
     * @param explainabilities
     *        An array of objects that summarize the properties of each Explainability resource.
     */

    public void setExplainabilities(java.util.Collection<ExplainabilitySummary> explainabilities) {
        if (explainabilities == null) {
            this.explainabilities = null;
            return;
        }

        this.explainabilities = new java.util.ArrayList<ExplainabilitySummary>(explainabilities);
    }

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplainabilities(java.util.Collection)} or {@link #withExplainabilities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param explainabilities
     *        An array of objects that summarize the properties of each Explainability resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExplainabilitiesResult withExplainabilities(ExplainabilitySummary... explainabilities) {
        if (this.explainabilities == null) {
            setExplainabilities(new java.util.ArrayList<ExplainabilitySummary>(explainabilities.length));
        }
        for (ExplainabilitySummary ele : explainabilities) {
            this.explainabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability resource.
     * </p>
     * 
     * @param explainabilities
     *        An array of objects that summarize the properties of each Explainability resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExplainabilitiesResult withExplainabilities(java.util.Collection<ExplainabilitySummary> explainabilities) {
        setExplainabilities(explainabilities);
        return this;
    }

    /**
     * <p>
     * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        Returns this token if the response is truncated. To retrieve the next set of results, use the token in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next
     * request.
     * </p>
     * 
     * @return Returns this token if the response is truncated. To retrieve the next set of results, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        Returns this token if the response is truncated. To retrieve the next set of results, use the token in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExplainabilitiesResult withNextToken(String nextToken) {
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
        if (getExplainabilities() != null)
            sb.append("Explainabilities: ").append(getExplainabilities()).append(",");
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

        if (obj instanceof ListExplainabilitiesResult == false)
            return false;
        ListExplainabilitiesResult other = (ListExplainabilitiesResult) obj;
        if (other.getExplainabilities() == null ^ this.getExplainabilities() == null)
            return false;
        if (other.getExplainabilities() != null && other.getExplainabilities().equals(this.getExplainabilities()) == false)
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

        hashCode = prime * hashCode + ((getExplainabilities() == null) ? 0 : getExplainabilities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExplainabilitiesResult clone() {
        try {
            return (ListExplainabilitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
