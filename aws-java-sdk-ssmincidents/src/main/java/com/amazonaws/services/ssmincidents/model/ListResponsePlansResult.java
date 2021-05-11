/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListResponsePlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResponsePlansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Details of each response plan.
     * </p>
     */
    private java.util.List<ResponsePlanSummary> responsePlanSummaries;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResponsePlansResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Details of each response plan.
     * </p>
     * 
     * @return Details of each response plan.
     */

    public java.util.List<ResponsePlanSummary> getResponsePlanSummaries() {
        return responsePlanSummaries;
    }

    /**
     * <p>
     * Details of each response plan.
     * </p>
     * 
     * @param responsePlanSummaries
     *        Details of each response plan.
     */

    public void setResponsePlanSummaries(java.util.Collection<ResponsePlanSummary> responsePlanSummaries) {
        if (responsePlanSummaries == null) {
            this.responsePlanSummaries = null;
            return;
        }

        this.responsePlanSummaries = new java.util.ArrayList<ResponsePlanSummary>(responsePlanSummaries);
    }

    /**
     * <p>
     * Details of each response plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponsePlanSummaries(java.util.Collection)} or
     * {@link #withResponsePlanSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param responsePlanSummaries
     *        Details of each response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResponsePlansResult withResponsePlanSummaries(ResponsePlanSummary... responsePlanSummaries) {
        if (this.responsePlanSummaries == null) {
            setResponsePlanSummaries(new java.util.ArrayList<ResponsePlanSummary>(responsePlanSummaries.length));
        }
        for (ResponsePlanSummary ele : responsePlanSummaries) {
            this.responsePlanSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of each response plan.
     * </p>
     * 
     * @param responsePlanSummaries
     *        Details of each response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResponsePlansResult withResponsePlanSummaries(java.util.Collection<ResponsePlanSummary> responsePlanSummaries) {
        setResponsePlanSummaries(responsePlanSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResponsePlanSummaries() != null)
            sb.append("ResponsePlanSummaries: ").append(getResponsePlanSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResponsePlansResult == false)
            return false;
        ListResponsePlansResult other = (ListResponsePlansResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResponsePlanSummaries() == null ^ this.getResponsePlanSummaries() == null)
            return false;
        if (other.getResponsePlanSummaries() != null && other.getResponsePlanSummaries().equals(this.getResponsePlanSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResponsePlanSummaries() == null) ? 0 : getResponsePlanSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListResponsePlansResult clone() {
        try {
            return (ListResponsePlansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
