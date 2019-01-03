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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetQueryExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     */
    private java.util.List<String> queryExecutionIds;

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     * 
     * @return An array of query execution IDs.
     */

    public java.util.List<String> getQueryExecutionIds() {
        return queryExecutionIds;
    }

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     * 
     * @param queryExecutionIds
     *        An array of query execution IDs.
     */

    public void setQueryExecutionIds(java.util.Collection<String> queryExecutionIds) {
        if (queryExecutionIds == null) {
            this.queryExecutionIds = null;
            return;
        }

        this.queryExecutionIds = new java.util.ArrayList<String>(queryExecutionIds);
    }

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryExecutionIds(java.util.Collection)} or {@link #withQueryExecutionIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param queryExecutionIds
     *        An array of query execution IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetQueryExecutionRequest withQueryExecutionIds(String... queryExecutionIds) {
        if (this.queryExecutionIds == null) {
            setQueryExecutionIds(new java.util.ArrayList<String>(queryExecutionIds.length));
        }
        for (String ele : queryExecutionIds) {
            this.queryExecutionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     * 
     * @param queryExecutionIds
     *        An array of query execution IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetQueryExecutionRequest withQueryExecutionIds(java.util.Collection<String> queryExecutionIds) {
        setQueryExecutionIds(queryExecutionIds);
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
        if (getQueryExecutionIds() != null)
            sb.append("QueryExecutionIds: ").append(getQueryExecutionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetQueryExecutionRequest == false)
            return false;
        BatchGetQueryExecutionRequest other = (BatchGetQueryExecutionRequest) obj;
        if (other.getQueryExecutionIds() == null ^ this.getQueryExecutionIds() == null)
            return false;
        if (other.getQueryExecutionIds() != null && other.getQueryExecutionIds().equals(this.getQueryExecutionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecutionIds() == null) ? 0 : getQueryExecutionIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetQueryExecutionRequest clone() {
        return (BatchGetQueryExecutionRequest) super.clone();
    }

}
