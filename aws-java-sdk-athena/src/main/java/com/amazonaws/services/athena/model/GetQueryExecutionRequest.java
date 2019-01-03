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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     */
    private String queryExecutionId;

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique ID of the query execution.
     */

    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * 
     * @return The unique ID of the query execution.
     */

    public String getQueryExecutionId() {
        return this.queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique ID of the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryExecutionRequest withQueryExecutionId(String queryExecutionId) {
        setQueryExecutionId(queryExecutionId);
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: ").append(getQueryExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryExecutionRequest == false)
            return false;
        GetQueryExecutionRequest other = (GetQueryExecutionRequest) obj;
        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryExecutionRequest clone() {
        return (GetQueryExecutionRequest) super.clone();
    }

}
