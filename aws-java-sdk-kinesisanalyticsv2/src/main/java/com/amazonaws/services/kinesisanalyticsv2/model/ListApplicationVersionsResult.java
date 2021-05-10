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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the application versions and the associated configuration summaries. The list includes application
     * versions that were rolled back.
     * </p>
     * <p>
     * To get the complete description of a specific application version, invoke the <a>DescribeApplicationVersion</a>
     * operation.
     * </p>
     */
    private java.util.List<ApplicationVersionSummary> applicationVersionSummaries;
    /**
     * <p>
     * The pagination token for the next set of results, or <code>null</code> if there are no additional results. To
     * retrieve the next set of items, pass this token into a subsequent invocation of this operation. For more
     * information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the application versions and the associated configuration summaries. The list includes application
     * versions that were rolled back.
     * </p>
     * <p>
     * To get the complete description of a specific application version, invoke the <a>DescribeApplicationVersion</a>
     * operation.
     * </p>
     * 
     * @return A list of the application versions and the associated configuration summaries. The list includes
     *         application versions that were rolled back.</p>
     *         <p>
     *         To get the complete description of a specific application version, invoke the
     *         <a>DescribeApplicationVersion</a> operation.
     */

    public java.util.List<ApplicationVersionSummary> getApplicationVersionSummaries() {
        return applicationVersionSummaries;
    }

    /**
     * <p>
     * A list of the application versions and the associated configuration summaries. The list includes application
     * versions that were rolled back.
     * </p>
     * <p>
     * To get the complete description of a specific application version, invoke the <a>DescribeApplicationVersion</a>
     * operation.
     * </p>
     * 
     * @param applicationVersionSummaries
     *        A list of the application versions and the associated configuration summaries. The list includes
     *        application versions that were rolled back.</p>
     *        <p>
     *        To get the complete description of a specific application version, invoke the
     *        <a>DescribeApplicationVersion</a> operation.
     */

    public void setApplicationVersionSummaries(java.util.Collection<ApplicationVersionSummary> applicationVersionSummaries) {
        if (applicationVersionSummaries == null) {
            this.applicationVersionSummaries = null;
            return;
        }

        this.applicationVersionSummaries = new java.util.ArrayList<ApplicationVersionSummary>(applicationVersionSummaries);
    }

    /**
     * <p>
     * A list of the application versions and the associated configuration summaries. The list includes application
     * versions that were rolled back.
     * </p>
     * <p>
     * To get the complete description of a specific application version, invoke the <a>DescribeApplicationVersion</a>
     * operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationVersionSummaries(java.util.Collection)} or
     * {@link #withApplicationVersionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationVersionSummaries
     *        A list of the application versions and the associated configuration summaries. The list includes
     *        application versions that were rolled back.</p>
     *        <p>
     *        To get the complete description of a specific application version, invoke the
     *        <a>DescribeApplicationVersion</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsResult withApplicationVersionSummaries(ApplicationVersionSummary... applicationVersionSummaries) {
        if (this.applicationVersionSummaries == null) {
            setApplicationVersionSummaries(new java.util.ArrayList<ApplicationVersionSummary>(applicationVersionSummaries.length));
        }
        for (ApplicationVersionSummary ele : applicationVersionSummaries) {
            this.applicationVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the application versions and the associated configuration summaries. The list includes application
     * versions that were rolled back.
     * </p>
     * <p>
     * To get the complete description of a specific application version, invoke the <a>DescribeApplicationVersion</a>
     * operation.
     * </p>
     * 
     * @param applicationVersionSummaries
     *        A list of the application versions and the associated configuration summaries. The list includes
     *        application versions that were rolled back.</p>
     *        <p>
     *        To get the complete description of a specific application version, invoke the
     *        <a>DescribeApplicationVersion</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsResult withApplicationVersionSummaries(java.util.Collection<ApplicationVersionSummary> applicationVersionSummaries) {
        setApplicationVersionSummaries(applicationVersionSummaries);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next set of results, or <code>null</code> if there are no additional results. To
     * retrieve the next set of items, pass this token into a subsequent invocation of this operation. For more
     * information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next set of results, or <code>null</code> if there are no additional results.
     *        To retrieve the next set of items, pass this token into a subsequent invocation of this operation. For
     *        more information about pagination, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *        Interface's Pagination Options</a>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the next set of results, or <code>null</code> if there are no additional results. To
     * retrieve the next set of items, pass this token into a subsequent invocation of this operation. For more
     * information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @return The pagination token for the next set of results, or <code>null</code> if there are no additional
     *         results. To retrieve the next set of items, pass this token into a subsequent invocation of this
     *         operation. For more information about pagination, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *         Interface's Pagination Options</a>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the next set of results, or <code>null</code> if there are no additional results. To
     * retrieve the next set of items, pass this token into a subsequent invocation of this operation. For more
     * information about pagination, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line Interface's
     * Pagination Options</a>.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next set of results, or <code>null</code> if there are no additional results.
     *        To retrieve the next set of items, pass this token into a subsequent invocation of this operation. For
     *        more information about pagination, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Using the AWS Command Line
     *        Interface's Pagination Options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsResult withNextToken(String nextToken) {
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
        if (getApplicationVersionSummaries() != null)
            sb.append("ApplicationVersionSummaries: ").append(getApplicationVersionSummaries()).append(",");
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

        if (obj instanceof ListApplicationVersionsResult == false)
            return false;
        ListApplicationVersionsResult other = (ListApplicationVersionsResult) obj;
        if (other.getApplicationVersionSummaries() == null ^ this.getApplicationVersionSummaries() == null)
            return false;
        if (other.getApplicationVersionSummaries() != null && other.getApplicationVersionSummaries().equals(this.getApplicationVersionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getApplicationVersionSummaries() == null) ? 0 : getApplicationVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationVersionsResult clone() {
        try {
            return (ListApplicationVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
