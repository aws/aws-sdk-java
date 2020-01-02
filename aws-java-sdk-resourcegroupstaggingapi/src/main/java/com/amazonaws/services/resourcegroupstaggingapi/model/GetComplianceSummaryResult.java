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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     */
    private java.util.List<Summary> summaryList;
    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     * 
     * @return A table that shows counts of noncompliant resources.
     */

    public java.util.List<Summary> getSummaryList() {
        return summaryList;
    }

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     * 
     * @param summaryList
     *        A table that shows counts of noncompliant resources.
     */

    public void setSummaryList(java.util.Collection<Summary> summaryList) {
        if (summaryList == null) {
            this.summaryList = null;
            return;
        }

        this.summaryList = new java.util.ArrayList<Summary>(summaryList);
    }

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryList(java.util.Collection)} or {@link #withSummaryList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaryList
     *        A table that shows counts of noncompliant resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryResult withSummaryList(Summary... summaryList) {
        if (this.summaryList == null) {
            setSummaryList(new java.util.ArrayList<Summary>(summaryList.length));
        }
        for (Summary ele : summaryList) {
            this.summaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     * 
     * @param summaryList
     *        A table that shows counts of noncompliant resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryResult withSummaryList(java.util.Collection<Summary> summaryList) {
        setSummaryList(summaryList);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that the response contains more data than can be returned in a single response. To
     *        receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent
     *        request.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @return A string that indicates that the response contains more data than can be returned in a single response.
     *         To receive additional data, specify this string for the <code>PaginationToken</code> value in a
     *         subsequent request.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be returned in a single response. To
     * receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent request.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that the response contains more data than can be returned in a single response. To
     *        receive additional data, specify this string for the <code>PaginationToken</code> value in a subsequent
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryResult withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getSummaryList() != null)
            sb.append("SummaryList: ").append(getSummaryList()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceSummaryResult == false)
            return false;
        GetComplianceSummaryResult other = (GetComplianceSummaryResult) obj;
        if (other.getSummaryList() == null ^ this.getSummaryList() == null)
            return false;
        if (other.getSummaryList() != null && other.getSummaryList().equals(this.getSummaryList()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaryList() == null) ? 0 : getSummaryList().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceSummaryResult clone() {
        try {
            return (GetComplianceSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
