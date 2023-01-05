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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Search" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     */
    private Integer maxResults;
    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A string that includes keywords and filters that specify the resources that you want to include in the results.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * The search is completely case insensitive. You can specify an empty string to return all results up to the limit
     * of 1,000 total results.
     * </p>
     * <note>
     * <p>
     * The operation can return only the first 1,000 results. If the resource you want is not included, then use a
     * different value for <code>QueryString</code> to refine the results.
     * </p>
     * </note>
     */
    private String queryString;
    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this parameter, then
     * the operation automatically uses the default view for the Amazon Web Services Region in which you called this
     * operation. If the Region either doesn't have a default view or if you don't have permission to use the default
     * view, then the operation fails with a <code>401 Unauthorized</code> exception.
     * </p>
     */
    private String viewArn;

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     *        those included in the current response, the <code>NextToken</code> response element is present and has a
     *        value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results.</p> <note>
     *        <p>
     *        An API operation can return fewer results than the maximum even when there are more results available. You
     *        should check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @return The maximum number of results that you want included on each page of the response. If you do not include
     *         this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     *         those included in the current response, the <code>NextToken</code> response element is present and has a
     *         value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results.</p> <note>
     *         <p>
     *         An API operation can return fewer results than the maximum even when there are more results available.
     *         You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     *         results.
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included
     * in the current response, the <code>NextToken</code> response element is present and has a value (is not null).
     * Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next part of the results.
     * </p>
     * <note>
     * <p>
     * An API operation can return fewer results than the maximum even when there are more results available. You should
     * check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond
     *        those included in the current response, the <code>NextToken</code> response element is present and has a
     *        value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results.</p> <note>
     *        <p>
     *        An API operation can return fewer results than the maximum even when there are more results available. You
     *        should check <code>NextToken</code> after every operation to ensure that you receive all of the results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *         previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value of the previous call's <code>NextToken</code> response to indicate where the
     *         output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A string that includes keywords and filters that specify the resources that you want to include in the results.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * The search is completely case insensitive. You can specify an empty string to return all results up to the limit
     * of 1,000 total results.
     * </p>
     * <note>
     * <p>
     * The operation can return only the first 1,000 results. If the resource you want is not included, then use a
     * different value for <code>QueryString</code> to refine the results.
     * </p>
     * </note>
     * 
     * @param queryString
     *        A string that includes keywords and filters that specify the resources that you want to include in the
     *        results.</p>
     *        <p>
     *        For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html"
     *        >Search query syntax reference for Resource Explorer</a>.
     *        </p>
     *        <p>
     *        The search is completely case insensitive. You can specify an empty string to return all results up to the
     *        limit of 1,000 total results.
     *        </p>
     *        <note>
     *        <p>
     *        The operation can return only the first 1,000 results. If the resource you want is not included, then use
     *        a different value for <code>QueryString</code> to refine the results.
     *        </p>
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * A string that includes keywords and filters that specify the resources that you want to include in the results.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * The search is completely case insensitive. You can specify an empty string to return all results up to the limit
     * of 1,000 total results.
     * </p>
     * <note>
     * <p>
     * The operation can return only the first 1,000 results. If the resource you want is not included, then use a
     * different value for <code>QueryString</code> to refine the results.
     * </p>
     * </note>
     * 
     * @return A string that includes keywords and filters that specify the resources that you want to include in the
     *         results.</p>
     *         <p>
     *         For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     *         href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html"
     *         >Search query syntax reference for Resource Explorer</a>.
     *         </p>
     *         <p>
     *         The search is completely case insensitive. You can specify an empty string to return all results up to
     *         the limit of 1,000 total results.
     *         </p>
     *         <note>
     *         <p>
     *         The operation can return only the first 1,000 results. If the resource you want is not included, then use
     *         a different value for <code>QueryString</code> to refine the results.
     *         </p>
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * A string that includes keywords and filters that specify the resources that you want to include in the results.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * The search is completely case insensitive. You can specify an empty string to return all results up to the limit
     * of 1,000 total results.
     * </p>
     * <note>
     * <p>
     * The operation can return only the first 1,000 results. If the resource you want is not included, then use a
     * different value for <code>QueryString</code> to refine the results.
     * </p>
     * </note>
     * 
     * @param queryString
     *        A string that includes keywords and filters that specify the resources that you want to include in the
     *        results.</p>
     *        <p>
     *        For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/using-search-query-syntax.html"
     *        >Search query syntax reference for Resource Explorer</a>.
     *        </p>
     *        <p>
     *        The search is completely case insensitive. You can specify an empty string to return all results up to the
     *        limit of 1,000 total results.
     *        </p>
     *        <note>
     *        <p>
     *        The operation can return only the first 1,000 results. If the resource you want is not included, then use
     *        a different value for <code>QueryString</code> to refine the results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this parameter, then
     * the operation automatically uses the default view for the Amazon Web Services Region in which you called this
     * operation. If the Region either doesn't have a default view or if you don't have permission to use the default
     * view, then the operation fails with a <code>401 Unauthorized</code> exception.
     * </p>
     * 
     * @param viewArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this parameter,
     *        then the operation automatically uses the default view for the Amazon Web Services Region in which you
     *        called this operation. If the Region either doesn't have a default view or if you don't have permission to
     *        use the default view, then the operation fails with a <code>401 Unauthorized</code> exception.
     */

    public void setViewArn(String viewArn) {
        this.viewArn = viewArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this parameter, then
     * the operation automatically uses the default view for the Amazon Web Services Region in which you called this
     * operation. If the Region either doesn't have a default view or if you don't have permission to use the default
     * view, then the operation fails with a <code>401 Unauthorized</code> exception.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this
     *         parameter, then the operation automatically uses the default view for the Amazon Web Services Region in
     *         which you called this operation. If the Region either doesn't have a default view or if you don't have
     *         permission to use the default view, then the operation fails with a <code>401 Unauthorized</code>
     *         exception.
     */

    public String getViewArn() {
        return this.viewArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this parameter, then
     * the operation automatically uses the default view for the Amazon Web Services Region in which you called this
     * operation. If the Region either doesn't have a default view or if you don't have permission to use the default
     * view, then the operation fails with a <code>401 Unauthorized</code> exception.
     * </p>
     * 
     * @param viewArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        resource name (ARN)</a> of the view to use for the query. If you don't specify a value for this parameter,
     *        then the operation automatically uses the default view for the Amazon Web Services Region in which you
     *        called this operation. If the Region either doesn't have a default view or if you don't have permission to
     *        use the default view, then the operation fails with a <code>401 Unauthorized</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withViewArn(String viewArn) {
        setViewArn(viewArn);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***").append(",");
        if (getViewArn() != null)
            sb.append("ViewArn: ").append(getViewArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRequest == false)
            return false;
        SearchRequest other = (SearchRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getViewArn() == null ^ this.getViewArn() == null)
            return false;
        if (other.getViewArn() != null && other.getViewArn().equals(this.getViewArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getViewArn() == null) ? 0 : getViewArn().hashCode());
        return hashCode;
    }

    @Override
    public SearchRequest clone() {
        return (SearchRequest) super.clone();
    }

}
