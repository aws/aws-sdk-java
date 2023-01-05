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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilityExports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExplainabilityExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability export.
     * </p>
     */
    private java.util.List<ExplainabilityExportSummary> explainabilityExports;
    /**
     * <p>
     * Returns this token if the response is truncated. To retrieve the next set of results, use the token in the next
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability export.
     * </p>
     * 
     * @return An array of objects that summarize the properties of each Explainability export.
     */

    public java.util.List<ExplainabilityExportSummary> getExplainabilityExports() {
        return explainabilityExports;
    }

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability export.
     * </p>
     * 
     * @param explainabilityExports
     *        An array of objects that summarize the properties of each Explainability export.
     */

    public void setExplainabilityExports(java.util.Collection<ExplainabilityExportSummary> explainabilityExports) {
        if (explainabilityExports == null) {
            this.explainabilityExports = null;
            return;
        }

        this.explainabilityExports = new java.util.ArrayList<ExplainabilityExportSummary>(explainabilityExports);
    }

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability export.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplainabilityExports(java.util.Collection)} or
     * {@link #withExplainabilityExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param explainabilityExports
     *        An array of objects that summarize the properties of each Explainability export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExplainabilityExportsResult withExplainabilityExports(ExplainabilityExportSummary... explainabilityExports) {
        if (this.explainabilityExports == null) {
            setExplainabilityExports(new java.util.ArrayList<ExplainabilityExportSummary>(explainabilityExports.length));
        }
        for (ExplainabilityExportSummary ele : explainabilityExports) {
            this.explainabilityExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize the properties of each Explainability export.
     * </p>
     * 
     * @param explainabilityExports
     *        An array of objects that summarize the properties of each Explainability export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExplainabilityExportsResult withExplainabilityExports(java.util.Collection<ExplainabilityExportSummary> explainabilityExports) {
        setExplainabilityExports(explainabilityExports);
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

    public ListExplainabilityExportsResult withNextToken(String nextToken) {
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
        if (getExplainabilityExports() != null)
            sb.append("ExplainabilityExports: ").append(getExplainabilityExports()).append(",");
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

        if (obj instanceof ListExplainabilityExportsResult == false)
            return false;
        ListExplainabilityExportsResult other = (ListExplainabilityExportsResult) obj;
        if (other.getExplainabilityExports() == null ^ this.getExplainabilityExports() == null)
            return false;
        if (other.getExplainabilityExports() != null && other.getExplainabilityExports().equals(this.getExplainabilityExports()) == false)
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

        hashCode = prime * hashCode + ((getExplainabilityExports() == null) ? 0 : getExplainabilityExports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExplainabilityExportsResult clone() {
        try {
            return (ListExplainabilityExportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
