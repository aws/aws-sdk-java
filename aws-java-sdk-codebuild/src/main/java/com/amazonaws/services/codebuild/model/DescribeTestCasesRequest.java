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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DescribeTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestCasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     */
    private String reportArn;
    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate pages in
     * the list of returned <code>TestCase</code> objects. The default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A <code>TestCaseFilter</code> object used to filter the returned reports.
     * </p>
     */
    private TestCaseFilter filter;

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report for which test cases are returned.
     */

    public void setReportArn(String reportArn) {
        this.reportArn = reportArn;
    }

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     * 
     * @return The ARN of the report for which test cases are returned.
     */

    public String getReportArn() {
        return this.reportArn;
    }

    /**
     * <p>
     * The ARN of the report for which test cases are returned.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report for which test cases are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesRequest withReportArn(String reportArn) {
        setReportArn(reportArn);
        return this;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @return During a previous call, the maximum number of items that can be returned is the value specified in
     *         <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *         is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *         to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *         token that is returned, until no more next tokens are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned is the value specified in
     * <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i> is
     * returned. To get the next batch of items in the list, call this operation again, adding the next token to the
     * call. To get all of the items in the list, keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * 
     * @param nextToken
     *        During a previous call, the maximum number of items that can be returned is the value specified in
     *        <code>maxResults</code>. If there more items in the list, then a unique string called a <i>nextToken</i>
     *        is returned. To get the next batch of items in the list, call this operation again, adding the next token
     *        to the call. To get all of the items in the list, keep calling this operation with each subsequent next
     *        token that is returned, until no more next tokens are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate pages in
     * the list of returned <code>TestCase</code> objects. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate
     *        pages in the list of returned <code>TestCase</code> objects. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate pages in
     * the list of returned <code>TestCase</code> objects. The default value is 100.
     * </p>
     * 
     * @return The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate
     *         pages in the list of returned <code>TestCase</code> objects. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate pages in
     * the list of returned <code>TestCase</code> objects. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of paginated test cases returned per response. Use <code>nextToken</code> to iterate
     *        pages in the list of returned <code>TestCase</code> objects. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A <code>TestCaseFilter</code> object used to filter the returned reports.
     * </p>
     * 
     * @param filter
     *        A <code>TestCaseFilter</code> object used to filter the returned reports.
     */

    public void setFilter(TestCaseFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A <code>TestCaseFilter</code> object used to filter the returned reports.
     * </p>
     * 
     * @return A <code>TestCaseFilter</code> object used to filter the returned reports.
     */

    public TestCaseFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A <code>TestCaseFilter</code> object used to filter the returned reports.
     * </p>
     * 
     * @param filter
     *        A <code>TestCaseFilter</code> object used to filter the returned reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestCasesRequest withFilter(TestCaseFilter filter) {
        setFilter(filter);
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
        if (getReportArn() != null)
            sb.append("ReportArn: ").append(getReportArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTestCasesRequest == false)
            return false;
        DescribeTestCasesRequest other = (DescribeTestCasesRequest) obj;
        if (other.getReportArn() == null ^ this.getReportArn() == null)
            return false;
        if (other.getReportArn() != null && other.getReportArn().equals(this.getReportArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportArn() == null) ? 0 : getReportArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTestCasesRequest clone() {
        return (DescribeTestCasesRequest) super.clone();
    }

}
