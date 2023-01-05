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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure for the output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartQueryPlanning" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartQueryPlanningResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced as the
     * result of the operation. The ID is also used to get the query state and as an input to the <code>Execute</code>
     * operation.
     * </p>
     */
    private String queryId;

    /**
     * <p>
     * The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced as the
     * result of the operation. The ID is also used to get the query state and as an input to the <code>Execute</code>
     * operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced
     *        as the result of the operation. The ID is also used to get the query state and as an input to the
     *        <code>Execute</code> operation.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced as the
     * result of the operation. The ID is also used to get the query state and as an input to the <code>Execute</code>
     * operation.
     * </p>
     * 
     * @return The ID of the plan query operation can be used to fetch the actual work unit descriptors that are
     *         produced as the result of the operation. The ID is also used to get the query state and as an input to
     *         the <code>Execute</code> operation.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced as the
     * result of the operation. The ID is also used to get the query state and as an input to the <code>Execute</code>
     * operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the plan query operation can be used to fetch the actual work unit descriptors that are produced
     *        as the result of the operation. The ID is also used to get the query state and as an input to the
     *        <code>Execute</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryPlanningResult withQueryId(String queryId) {
        setQueryId(queryId);
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
        if (getQueryId() != null)
            sb.append("QueryId: ").append(getQueryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryPlanningResult == false)
            return false;
        StartQueryPlanningResult other = (StartQueryPlanningResult) obj;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        return hashCode;
    }

    @Override
    public StartQueryPlanningResult clone() {
        try {
            return (StartQueryPlanningResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
