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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the query execution.
     * </p>
     */
    private QueryExecution queryExecution;

    /**
     * <p>
     * Information about the query execution.
     * </p>
     * 
     * @param queryExecution
     *        Information about the query execution.
     */

    public void setQueryExecution(QueryExecution queryExecution) {
        this.queryExecution = queryExecution;
    }

    /**
     * <p>
     * Information about the query execution.
     * </p>
     * 
     * @return Information about the query execution.
     */

    public QueryExecution getQueryExecution() {
        return this.queryExecution;
    }

    /**
     * <p>
     * Information about the query execution.
     * </p>
     * 
     * @param queryExecution
     *        Information about the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryExecutionResult withQueryExecution(QueryExecution queryExecution) {
        setQueryExecution(queryExecution);
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
        if (getQueryExecution() != null)
            sb.append("QueryExecution: ").append(getQueryExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryExecutionResult == false)
            return false;
        GetQueryExecutionResult other = (GetQueryExecutionResult) obj;
        if (other.getQueryExecution() == null ^ this.getQueryExecution() == null)
            return false;
        if (other.getQueryExecution() != null && other.getQueryExecution().equals(this.getQueryExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecution() == null) ? 0 : getQueryExecution().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryExecutionResult clone() {
        try {
            return (GetQueryExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
