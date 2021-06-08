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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListOperations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOperationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * A token from a previous result page. It's used for a paginated request. The request retrieves the next result
     * page. All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to include in each response (result page). It's used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * A token from a previous result page. It's used for a paginated request. The request retrieves the next result
     * page. All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @param nextToken
     *        A token from a previous result page. It's used for a paginated request. The request retrieves the next
     *        result page. All other parameter values must be identical to the ones specified in the initial
     *        request.</p>
     *        <p>
     *        If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token from a previous result page. It's used for a paginated request. The request retrieves the next result
     * page. All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @return A token from a previous result page. It's used for a paginated request. The request retrieves the next
     *         result page. All other parameter values must be identical to the ones specified in the initial
     *         request.</p>
     *         <p>
     *         If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token from a previous result page. It's used for a paginated request. The request retrieves the next result
     * page. All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @param nextToken
     *        A token from a previous result page. It's used for a paginated request. The request retrieves the next
     *        result page. All other parameter values must be identical to the ones specified in the initial
     *        request.</p>
     *        <p>
     *        If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in each response (result page). It's used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in each response (result page). It's used for a paginated
     *        request.</p>
     *        <p>
     *        If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single
     *        response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in each response (result page). It's used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     * 
     * @return The maximum number of results to include in each response (result page). It's used for a paginated
     *         request.</p>
     *         <p>
     *         If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single
     *         response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in each response (result page). It's used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in each response (result page). It's used for a paginated
     *        request.</p>
     *        <p>
     *        If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationsRequest withMaxResults(Integer maxResults) {
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
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
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

        if (obj instanceof ListOperationsRequest == false)
            return false;
        ListOperationsRequest other = (ListOperationsRequest) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
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

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListOperationsRequest clone() {
        return (ListOperationsRequest) super.clone();
    }

}
