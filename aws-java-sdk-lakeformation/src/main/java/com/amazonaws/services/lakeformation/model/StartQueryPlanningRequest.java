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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartQueryPlanning" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartQueryPlanningRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing information about the query plan.
     * </p>
     */
    private QueryPlanningContext queryPlanningContext;
    /**
     * <p>
     * A PartiQL query statement used as an input to the planner service.
     * </p>
     */
    private String queryString;

    /**
     * <p>
     * A structure containing information about the query plan.
     * </p>
     * 
     * @param queryPlanningContext
     *        A structure containing information about the query plan.
     */

    public void setQueryPlanningContext(QueryPlanningContext queryPlanningContext) {
        this.queryPlanningContext = queryPlanningContext;
    }

    /**
     * <p>
     * A structure containing information about the query plan.
     * </p>
     * 
     * @return A structure containing information about the query plan.
     */

    public QueryPlanningContext getQueryPlanningContext() {
        return this.queryPlanningContext;
    }

    /**
     * <p>
     * A structure containing information about the query plan.
     * </p>
     * 
     * @param queryPlanningContext
     *        A structure containing information about the query plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryPlanningRequest withQueryPlanningContext(QueryPlanningContext queryPlanningContext) {
        setQueryPlanningContext(queryPlanningContext);
        return this;
    }

    /**
     * <p>
     * A PartiQL query statement used as an input to the planner service.
     * </p>
     * 
     * @param queryString
     *        A PartiQL query statement used as an input to the planner service.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * A PartiQL query statement used as an input to the planner service.
     * </p>
     * 
     * @return A PartiQL query statement used as an input to the planner service.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * A PartiQL query statement used as an input to the planner service.
     * </p>
     * 
     * @param queryString
     *        A PartiQL query statement used as an input to the planner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryPlanningRequest withQueryString(String queryString) {
        setQueryString(queryString);
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
        if (getQueryPlanningContext() != null)
            sb.append("QueryPlanningContext: ").append(getQueryPlanningContext()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryPlanningRequest == false)
            return false;
        StartQueryPlanningRequest other = (StartQueryPlanningRequest) obj;
        if (other.getQueryPlanningContext() == null ^ this.getQueryPlanningContext() == null)
            return false;
        if (other.getQueryPlanningContext() != null && other.getQueryPlanningContext().equals(this.getQueryPlanningContext()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryPlanningContext() == null) ? 0 : getQueryPlanningContext().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public StartQueryPlanningRequest clone() {
        return (StartQueryPlanningRequest) super.clone();
    }

}
