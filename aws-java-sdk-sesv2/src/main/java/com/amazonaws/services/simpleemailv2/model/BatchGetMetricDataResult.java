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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the result of processing your metric data batch request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/BatchGetMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of successfully retrieved <code>MetricDataResult</code>.
     * </p>
     */
    private java.util.List<MetricDataResult> results;
    /**
     * <p>
     * A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * </p>
     */
    private java.util.List<MetricDataError> errors;

    /**
     * <p>
     * A list of successfully retrieved <code>MetricDataResult</code>.
     * </p>
     * 
     * @return A list of successfully retrieved <code>MetricDataResult</code>.
     */

    public java.util.List<MetricDataResult> getResults() {
        return results;
    }

    /**
     * <p>
     * A list of successfully retrieved <code>MetricDataResult</code>.
     * </p>
     * 
     * @param results
     *        A list of successfully retrieved <code>MetricDataResult</code>.
     */

    public void setResults(java.util.Collection<MetricDataResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<MetricDataResult>(results);
    }

    /**
     * <p>
     * A list of successfully retrieved <code>MetricDataResult</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A list of successfully retrieved <code>MetricDataResult</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataResult withResults(MetricDataResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<MetricDataResult>(results.length));
        }
        for (MetricDataResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of successfully retrieved <code>MetricDataResult</code>.
     * </p>
     * 
     * @param results
     *        A list of successfully retrieved <code>MetricDataResult</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataResult withResults(java.util.Collection<MetricDataResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * </p>
     * 
     * @return A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     */

    public java.util.List<MetricDataError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * </p>
     * 
     * @param errors
     *        A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     */

    public void setErrors(java.util.Collection<MetricDataError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<MetricDataError>(errors);
    }

    /**
     * <p>
     * A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataResult withErrors(MetricDataError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<MetricDataError>(errors.length));
        }
        for (MetricDataError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * </p>
     * 
     * @param errors
     *        A list of <code>MetricDataError</code> encountered while processing your metric data batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataResult withErrors(java.util.Collection<MetricDataError> errors) {
        setErrors(errors);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetMetricDataResult == false)
            return false;
        BatchGetMetricDataResult other = (BatchGetMetricDataResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetMetricDataResult clone() {
        try {
            return (BatchGetMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
