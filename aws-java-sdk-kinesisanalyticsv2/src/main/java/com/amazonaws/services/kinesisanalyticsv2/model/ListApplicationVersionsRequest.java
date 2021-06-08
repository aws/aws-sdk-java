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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application for which you want to list all versions.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The maximum number of versions to list in this invocation of the operation.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If a previous invocation of this operation returned a pagination token, pass it into this value to retrieve the
     * next set of results. For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the application for which you want to list all versions.
     * </p>
     * 
     * @param applicationName
     *        The name of the application for which you want to list all versions.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application for which you want to list all versions.
     * </p>
     * 
     * @return The name of the application for which you want to list all versions.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application for which you want to list all versions.
     * </p>
     * 
     * @param applicationName
     *        The name of the application for which you want to list all versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The maximum number of versions to list in this invocation of the operation.
     * </p>
     * 
     * @param limit
     *        The maximum number of versions to list in this invocation of the operation.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of versions to list in this invocation of the operation.
     * </p>
     * 
     * @return The maximum number of versions to list in this invocation of the operation.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of versions to list in this invocation of the operation.
     * </p>
     * 
     * @param limit
     *        The maximum number of versions to list in this invocation of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If a previous invocation of this operation returned a pagination token, pass it into this value to retrieve the
     * next set of results. For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @param nextToken
     *        If a previous invocation of this operation returned a pagination token, pass it into this value to
     *        retrieve the next set of results. For more information about pagination, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *        Interface's Pagination Options</a>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a previous invocation of this operation returned a pagination token, pass it into this value to retrieve the
     * next set of results. For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @return If a previous invocation of this operation returned a pagination token, pass it into this value to
     *         retrieve the next set of results. For more information about pagination, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *         Interface's Pagination Options</a>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a previous invocation of this operation returned a pagination token, pass it into this value to retrieve the
     * next set of results. For more information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @param nextToken
     *        If a previous invocation of this operation returned a pagination token, pass it into this value to
     *        retrieve the next set of results. For more information about pagination, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *        Interface's Pagination Options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsRequest withNextToken(String nextToken) {
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
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

        if (obj instanceof ListApplicationVersionsRequest == false)
            return false;
        ListApplicationVersionsRequest other = (ListApplicationVersionsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationVersionsRequest clone() {
        return (ListApplicationVersionsRequest) super.clone();
    }

}
