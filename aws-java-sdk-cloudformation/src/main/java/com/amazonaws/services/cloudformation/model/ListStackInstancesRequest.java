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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack instances for.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     * parameter value is set to a token. To retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     */
    private String stackInstanceAccount;
    /**
     * <p>
     * The name of the region where you want to list stack instances.
     * </p>
     */
    private String stackInstanceRegion;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack instances for.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to list stack instances for.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack instances for.
     * </p>
     * 
     * @return The name or unique ID of the stack set that you want to list stack instances for.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack instances for.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to list stack instances for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     * parameter value is set to a token. To retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     *        parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListStackInstances</code> again and assign that token to the request object's <code>NextToken</code>
     *        parameter. If there are no remaining results, the previous response object's <code>NextToken</code>
     *        parameter is set to <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     * parameter value is set to a token. To retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     *         parameter value is set to a token. To retrieve the next set of results, call
     *         <code>ListStackInstances</code> again and assign that token to the request object's
     *         <code>NextToken</code> parameter. If there are no remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     * parameter value is set to a token. To retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous request didn't return all of the remaining results, the response's <code>NextToken</code>
     *        parameter value is set to a token. To retrieve the next set of results, call
     *        <code>ListStackInstances</code> again and assign that token to the request object's <code>NextToken</code>
     *        parameter. If there are no remaining results, the previous response object's <code>NextToken</code>
     *        parameter is set to <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @return The maximum number of results to be returned with a single call. If the number of available results
     *         exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * 
     * @param stackInstanceAccount
     *        The name of the AWS account that you want to list stack instances for.
     */

    public void setStackInstanceAccount(String stackInstanceAccount) {
        this.stackInstanceAccount = stackInstanceAccount;
    }

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * 
     * @return The name of the AWS account that you want to list stack instances for.
     */

    public String getStackInstanceAccount() {
        return this.stackInstanceAccount;
    }

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * 
     * @param stackInstanceAccount
     *        The name of the AWS account that you want to list stack instances for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesRequest withStackInstanceAccount(String stackInstanceAccount) {
        setStackInstanceAccount(stackInstanceAccount);
        return this;
    }

    /**
     * <p>
     * The name of the region where you want to list stack instances.
     * </p>
     * 
     * @param stackInstanceRegion
     *        The name of the region where you want to list stack instances.
     */

    public void setStackInstanceRegion(String stackInstanceRegion) {
        this.stackInstanceRegion = stackInstanceRegion;
    }

    /**
     * <p>
     * The name of the region where you want to list stack instances.
     * </p>
     * 
     * @return The name of the region where you want to list stack instances.
     */

    public String getStackInstanceRegion() {
        return this.stackInstanceRegion;
    }

    /**
     * <p>
     * The name of the region where you want to list stack instances.
     * </p>
     * 
     * @param stackInstanceRegion
     *        The name of the region where you want to list stack instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstancesRequest withStackInstanceRegion(String stackInstanceRegion) {
        setStackInstanceRegion(stackInstanceRegion);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStackInstanceAccount() != null)
            sb.append("StackInstanceAccount: ").append(getStackInstanceAccount()).append(",");
        if (getStackInstanceRegion() != null)
            sb.append("StackInstanceRegion: ").append(getStackInstanceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStackInstancesRequest == false)
            return false;
        ListStackInstancesRequest other = (ListStackInstancesRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStackInstanceAccount() == null ^ this.getStackInstanceAccount() == null)
            return false;
        if (other.getStackInstanceAccount() != null && other.getStackInstanceAccount().equals(this.getStackInstanceAccount()) == false)
            return false;
        if (other.getStackInstanceRegion() == null ^ this.getStackInstanceRegion() == null)
            return false;
        if (other.getStackInstanceRegion() != null && other.getStackInstanceRegion().equals(this.getStackInstanceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceAccount() == null) ? 0 : getStackInstanceAccount().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceRegion() == null) ? 0 : getStackInstanceRegion().hashCode());
        return hashCode;
    }

    @Override
    public ListStackInstancesRequest clone() {
        return (ListStackInstancesRequest) super.clone();
    }

}
