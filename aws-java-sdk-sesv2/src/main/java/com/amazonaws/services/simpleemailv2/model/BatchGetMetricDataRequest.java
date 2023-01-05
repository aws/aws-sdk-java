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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to retrieve a batch of metric data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/BatchGetMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of queries for metrics to be retrieved.
     * </p>
     */
    private java.util.List<BatchGetMetricDataQuery> queries;

    /**
     * <p>
     * A list of queries for metrics to be retrieved.
     * </p>
     * 
     * @return A list of queries for metrics to be retrieved.
     */

    public java.util.List<BatchGetMetricDataQuery> getQueries() {
        return queries;
    }

    /**
     * <p>
     * A list of queries for metrics to be retrieved.
     * </p>
     * 
     * @param queries
     *        A list of queries for metrics to be retrieved.
     */

    public void setQueries(java.util.Collection<BatchGetMetricDataQuery> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new java.util.ArrayList<BatchGetMetricDataQuery>(queries);
    }

    /**
     * <p>
     * A list of queries for metrics to be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueries(java.util.Collection)} or {@link #withQueries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queries
     *        A list of queries for metrics to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataRequest withQueries(BatchGetMetricDataQuery... queries) {
        if (this.queries == null) {
            setQueries(new java.util.ArrayList<BatchGetMetricDataQuery>(queries.length));
        }
        for (BatchGetMetricDataQuery ele : queries) {
            this.queries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of queries for metrics to be retrieved.
     * </p>
     * 
     * @param queries
     *        A list of queries for metrics to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataRequest withQueries(java.util.Collection<BatchGetMetricDataQuery> queries) {
        setQueries(queries);
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
        if (getQueries() != null)
            sb.append("Queries: ").append(getQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetMetricDataRequest == false)
            return false;
        BatchGetMetricDataRequest other = (BatchGetMetricDataRequest) obj;
        if (other.getQueries() == null ^ this.getQueries() == null)
            return false;
        if (other.getQueries() != null && other.getQueries().equals(this.getQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueries() == null) ? 0 : getQueries().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetMetricDataRequest clone() {
        return (BatchGetMetricDataRequest) super.clone();
    }

}
