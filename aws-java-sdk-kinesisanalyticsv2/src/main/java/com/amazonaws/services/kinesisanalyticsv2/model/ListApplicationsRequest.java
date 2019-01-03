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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of applications to list.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results.
     * For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of applications to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of applications to list.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of applications to list.
     * </p>
     * 
     * @return The maximum number of applications to list.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of applications to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of applications to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results.
     * For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @param nextToken
     *        If a previous command returned a pagination token, pass it into this value to retrieve the next set of
     *        results. For more information about pagination, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *        Interface's Pagination Options</a>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results.
     * For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @return If a previous command returned a pagination token, pass it into this value to retrieve the next set of
     *         results. For more information about pagination, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *         Interface's Pagination Options</a>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results.
     * For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @param nextToken
     *        If a previous command returned a pagination token, pass it into this value to retrieve the next set of
     *        results. For more information about pagination, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *        Interface's Pagination Options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsRequest == false)
            return false;
        ListApplicationsRequest other = (ListApplicationsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequest clone() {
        return (ListApplicationsRequest) super.clone();
    }

}
