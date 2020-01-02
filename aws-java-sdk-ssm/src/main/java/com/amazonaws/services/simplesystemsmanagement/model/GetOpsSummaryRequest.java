/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpsSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the name of a resource data sync to get.
     * </p>
     */
    private String syncName;
    /**
     * <p>
     * Optional filters used to scope down the returned OpsItems.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsFilter> filters;
    /**
     * <p>
     * Optional aggregators that return counts of OpsItems based on one or more expressions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsAggregator> aggregators;
    /**
     * <p>
     * The OpsItem data type to return.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsResultAttribute> resultAttributes;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specify the name of a resource data sync to get.
     * </p>
     * 
     * @param syncName
     *        Specify the name of a resource data sync to get.
     */

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * Specify the name of a resource data sync to get.
     * </p>
     * 
     * @return Specify the name of a resource data sync to get.
     */

    public String getSyncName() {
        return this.syncName;
    }

    /**
     * <p>
     * Specify the name of a resource data sync to get.
     * </p>
     * 
     * @param syncName
     *        Specify the name of a resource data sync to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

    /**
     * <p>
     * Optional filters used to scope down the returned OpsItems.
     * </p>
     * 
     * @return Optional filters used to scope down the returned OpsItems.
     */

    public java.util.List<OpsFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<OpsFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Optional filters used to scope down the returned OpsItems.
     * </p>
     * 
     * @param filters
     *        Optional filters used to scope down the returned OpsItems.
     */

    public void setFilters(java.util.Collection<OpsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<OpsFilter>(filters);
    }

    /**
     * <p>
     * Optional filters used to scope down the returned OpsItems.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Optional filters used to scope down the returned OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withFilters(OpsFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<OpsFilter>(filters.length));
        }
        for (OpsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional filters used to scope down the returned OpsItems.
     * </p>
     * 
     * @param filters
     *        Optional filters used to scope down the returned OpsItems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withFilters(java.util.Collection<OpsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Optional aggregators that return counts of OpsItems based on one or more expressions.
     * </p>
     * 
     * @return Optional aggregators that return counts of OpsItems based on one or more expressions.
     */

    public java.util.List<OpsAggregator> getAggregators() {
        if (aggregators == null) {
            aggregators = new com.amazonaws.internal.SdkInternalList<OpsAggregator>();
        }
        return aggregators;
    }

    /**
     * <p>
     * Optional aggregators that return counts of OpsItems based on one or more expressions.
     * </p>
     * 
     * @param aggregators
     *        Optional aggregators that return counts of OpsItems based on one or more expressions.
     */

    public void setAggregators(java.util.Collection<OpsAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new com.amazonaws.internal.SdkInternalList<OpsAggregator>(aggregators);
    }

    /**
     * <p>
     * Optional aggregators that return counts of OpsItems based on one or more expressions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregators(java.util.Collection)} or {@link #withAggregators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregators
     *        Optional aggregators that return counts of OpsItems based on one or more expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withAggregators(OpsAggregator... aggregators) {
        if (this.aggregators == null) {
            setAggregators(new com.amazonaws.internal.SdkInternalList<OpsAggregator>(aggregators.length));
        }
        for (OpsAggregator ele : aggregators) {
            this.aggregators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional aggregators that return counts of OpsItems based on one or more expressions.
     * </p>
     * 
     * @param aggregators
     *        Optional aggregators that return counts of OpsItems based on one or more expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withAggregators(java.util.Collection<OpsAggregator> aggregators) {
        setAggregators(aggregators);
        return this;
    }

    /**
     * <p>
     * The OpsItem data type to return.
     * </p>
     * 
     * @return The OpsItem data type to return.
     */

    public java.util.List<OpsResultAttribute> getResultAttributes() {
        if (resultAttributes == null) {
            resultAttributes = new com.amazonaws.internal.SdkInternalList<OpsResultAttribute>();
        }
        return resultAttributes;
    }

    /**
     * <p>
     * The OpsItem data type to return.
     * </p>
     * 
     * @param resultAttributes
     *        The OpsItem data type to return.
     */

    public void setResultAttributes(java.util.Collection<OpsResultAttribute> resultAttributes) {
        if (resultAttributes == null) {
            this.resultAttributes = null;
            return;
        }

        this.resultAttributes = new com.amazonaws.internal.SdkInternalList<OpsResultAttribute>(resultAttributes);
    }

    /**
     * <p>
     * The OpsItem data type to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultAttributes(java.util.Collection)} or {@link #withResultAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resultAttributes
     *        The OpsItem data type to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withResultAttributes(OpsResultAttribute... resultAttributes) {
        if (this.resultAttributes == null) {
            setResultAttributes(new com.amazonaws.internal.SdkInternalList<OpsResultAttribute>(resultAttributes.length));
        }
        for (OpsResultAttribute ele : resultAttributes) {
            this.resultAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The OpsItem data type to return.
     * </p>
     * 
     * @param resultAttributes
     *        The OpsItem data type to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withResultAttributes(java.util.Collection<OpsResultAttribute> resultAttributes) {
        setResultAttributes(resultAttributes);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsSummaryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSyncName() != null)
            sb.append("SyncName: ").append(getSyncName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getAggregators() != null)
            sb.append("Aggregators: ").append(getAggregators()).append(",");
        if (getResultAttributes() != null)
            sb.append("ResultAttributes: ").append(getResultAttributes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpsSummaryRequest == false)
            return false;
        GetOpsSummaryRequest other = (GetOpsSummaryRequest) obj;
        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null)
            return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false)
            return false;
        if (other.getResultAttributes() == null ^ this.getResultAttributes() == null)
            return false;
        if (other.getResultAttributes() != null && other.getResultAttributes().equals(this.getResultAttributes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        hashCode = prime * hashCode + ((getResultAttributes() == null) ? 0 : getResultAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetOpsSummaryRequest clone() {
        return (GetOpsSummaryRequest) super.clone();
    }

}
