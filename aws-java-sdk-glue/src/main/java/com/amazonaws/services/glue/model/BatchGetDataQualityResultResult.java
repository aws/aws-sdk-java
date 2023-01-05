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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDataQualityResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDataQualityResultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>DataQualityResult</code> objects representing the data quality results.
     * </p>
     */
    private java.util.List<DataQualityResult> results;
    /**
     * <p>
     * A list of result IDs for which results were not found.
     * </p>
     */
    private java.util.List<String> resultsNotFound;

    /**
     * <p>
     * A list of <code>DataQualityResult</code> objects representing the data quality results.
     * </p>
     * 
     * @return A list of <code>DataQualityResult</code> objects representing the data quality results.
     */

    public java.util.List<DataQualityResult> getResults() {
        return results;
    }

    /**
     * <p>
     * A list of <code>DataQualityResult</code> objects representing the data quality results.
     * </p>
     * 
     * @param results
     *        A list of <code>DataQualityResult</code> objects representing the data quality results.
     */

    public void setResults(java.util.Collection<DataQualityResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<DataQualityResult>(results);
    }

    /**
     * <p>
     * A list of <code>DataQualityResult</code> objects representing the data quality results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A list of <code>DataQualityResult</code> objects representing the data quality results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDataQualityResultResult withResults(DataQualityResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<DataQualityResult>(results.length));
        }
        for (DataQualityResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataQualityResult</code> objects representing the data quality results.
     * </p>
     * 
     * @param results
     *        A list of <code>DataQualityResult</code> objects representing the data quality results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDataQualityResultResult withResults(java.util.Collection<DataQualityResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * A list of result IDs for which results were not found.
     * </p>
     * 
     * @return A list of result IDs for which results were not found.
     */

    public java.util.List<String> getResultsNotFound() {
        return resultsNotFound;
    }

    /**
     * <p>
     * A list of result IDs for which results were not found.
     * </p>
     * 
     * @param resultsNotFound
     *        A list of result IDs for which results were not found.
     */

    public void setResultsNotFound(java.util.Collection<String> resultsNotFound) {
        if (resultsNotFound == null) {
            this.resultsNotFound = null;
            return;
        }

        this.resultsNotFound = new java.util.ArrayList<String>(resultsNotFound);
    }

    /**
     * <p>
     * A list of result IDs for which results were not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultsNotFound(java.util.Collection)} or {@link #withResultsNotFound(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resultsNotFound
     *        A list of result IDs for which results were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDataQualityResultResult withResultsNotFound(String... resultsNotFound) {
        if (this.resultsNotFound == null) {
            setResultsNotFound(new java.util.ArrayList<String>(resultsNotFound.length));
        }
        for (String ele : resultsNotFound) {
            this.resultsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of result IDs for which results were not found.
     * </p>
     * 
     * @param resultsNotFound
     *        A list of result IDs for which results were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDataQualityResultResult withResultsNotFound(java.util.Collection<String> resultsNotFound) {
        setResultsNotFound(resultsNotFound);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getResultsNotFound() != null)
            sb.append("ResultsNotFound: ").append(getResultsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDataQualityResultResult == false)
            return false;
        BatchGetDataQualityResultResult other = (BatchGetDataQualityResultResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getResultsNotFound() == null ^ this.getResultsNotFound() == null)
            return false;
        if (other.getResultsNotFound() != null && other.getResultsNotFound().equals(this.getResultsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getResultsNotFound() == null) ? 0 : getResultsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDataQualityResultResult clone() {
        try {
            return (BatchGetDataQualityResultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
