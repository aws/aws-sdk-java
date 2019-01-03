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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     */
    private InsightResults insightResults;

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     * 
     * @param insightResults
     *        The insight results returned by the operation.
     */

    public void setInsightResults(InsightResults insightResults) {
        this.insightResults = insightResults;
    }

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     * 
     * @return The insight results returned by the operation.
     */

    public InsightResults getInsightResults() {
        return this.insightResults;
    }

    /**
     * <p>
     * The insight results returned by the operation.
     * </p>
     * 
     * @param insightResults
     *        The insight results returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightResultsResult withInsightResults(InsightResults insightResults) {
        setInsightResults(insightResults);
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
        if (getInsightResults() != null)
            sb.append("InsightResults: ").append(getInsightResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightResultsResult == false)
            return false;
        GetInsightResultsResult other = (GetInsightResultsResult) obj;
        if (other.getInsightResults() == null ^ this.getInsightResults() == null)
            return false;
        if (other.getInsightResults() != null && other.getInsightResults().equals(this.getInsightResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightResults() == null) ? 0 : getInsightResults().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightResultsResult clone() {
        try {
            return (GetInsightResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
