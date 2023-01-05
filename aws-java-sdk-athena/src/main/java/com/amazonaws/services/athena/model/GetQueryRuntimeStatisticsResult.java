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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryRuntimeStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryRuntimeStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Runtime statistics about the query execution.
     * </p>
     */
    private QueryRuntimeStatistics queryRuntimeStatistics;

    /**
     * <p>
     * Runtime statistics about the query execution.
     * </p>
     * 
     * @param queryRuntimeStatistics
     *        Runtime statistics about the query execution.
     */

    public void setQueryRuntimeStatistics(QueryRuntimeStatistics queryRuntimeStatistics) {
        this.queryRuntimeStatistics = queryRuntimeStatistics;
    }

    /**
     * <p>
     * Runtime statistics about the query execution.
     * </p>
     * 
     * @return Runtime statistics about the query execution.
     */

    public QueryRuntimeStatistics getQueryRuntimeStatistics() {
        return this.queryRuntimeStatistics;
    }

    /**
     * <p>
     * Runtime statistics about the query execution.
     * </p>
     * 
     * @param queryRuntimeStatistics
     *        Runtime statistics about the query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryRuntimeStatisticsResult withQueryRuntimeStatistics(QueryRuntimeStatistics queryRuntimeStatistics) {
        setQueryRuntimeStatistics(queryRuntimeStatistics);
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
        if (getQueryRuntimeStatistics() != null)
            sb.append("QueryRuntimeStatistics: ").append(getQueryRuntimeStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryRuntimeStatisticsResult == false)
            return false;
        GetQueryRuntimeStatisticsResult other = (GetQueryRuntimeStatisticsResult) obj;
        if (other.getQueryRuntimeStatistics() == null ^ this.getQueryRuntimeStatistics() == null)
            return false;
        if (other.getQueryRuntimeStatistics() != null && other.getQueryRuntimeStatistics().equals(this.getQueryRuntimeStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryRuntimeStatistics() == null) ? 0 : getQueryRuntimeStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryRuntimeStatisticsResult clone() {
        try {
            return (GetQueryRuntimeStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
