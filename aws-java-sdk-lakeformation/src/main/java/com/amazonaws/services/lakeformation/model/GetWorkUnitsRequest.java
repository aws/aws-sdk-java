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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkUnitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The size of each page to get in the Amazon Web Services service call. This does not affect the number of items
     * returned in the command's output. Setting a smaller page size results in more calls to the Amazon Web Services
     * service, retrieving fewer items in each call. This can help prevent the Amazon Web Services service calls from
     * timing out.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     */
    private String queryId;

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The size of each page to get in the Amazon Web Services service call. This does not affect the number of items
     * returned in the command's output. Setting a smaller page size results in more calls to the Amazon Web Services
     * service, retrieving fewer items in each call. This can help prevent the Amazon Web Services service calls from
     * timing out.
     * </p>
     * 
     * @param pageSize
     *        The size of each page to get in the Amazon Web Services service call. This does not affect the number of
     *        items returned in the command's output. Setting a smaller page size results in more calls to the Amazon
     *        Web Services service, retrieving fewer items in each call. This can help prevent the Amazon Web Services
     *        service calls from timing out.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The size of each page to get in the Amazon Web Services service call. This does not affect the number of items
     * returned in the command's output. Setting a smaller page size results in more calls to the Amazon Web Services
     * service, retrieving fewer items in each call. This can help prevent the Amazon Web Services service calls from
     * timing out.
     * </p>
     * 
     * @return The size of each page to get in the Amazon Web Services service call. This does not affect the number of
     *         items returned in the command's output. Setting a smaller page size results in more calls to the Amazon
     *         Web Services service, retrieving fewer items in each call. This can help prevent the Amazon Web Services
     *         service calls from timing out.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The size of each page to get in the Amazon Web Services service call. This does not affect the number of items
     * returned in the command's output. Setting a smaller page size results in more calls to the Amazon Web Services
     * service, retrieving fewer items in each call. This can help prevent the Amazon Web Services service calls from
     * timing out.
     * </p>
     * 
     * @param pageSize
     *        The size of each page to get in the Amazon Web Services service call. This does not affect the number of
     *        items returned in the command's output. Setting a smaller page size results in more calls to the Amazon
     *        Web Services service, retrieving fewer items in each call. This can help prevent the Amazon Web Services
     *        service calls from timing out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the plan query operation.
     */

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     * 
     * @return The ID of the plan query operation.
     */

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * <p>
     * The ID of the plan query operation.
     * </p>
     * 
     * @param queryId
     *        The ID of the plan query operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkUnitsRequest withQueryId(String queryId) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
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

        if (obj instanceof GetWorkUnitsRequest == false)
            return false;
        GetWorkUnitsRequest other = (GetWorkUnitsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkUnitsRequest clone() {
        return (GetWorkUnitsRequest) super.clone();
    }

}
