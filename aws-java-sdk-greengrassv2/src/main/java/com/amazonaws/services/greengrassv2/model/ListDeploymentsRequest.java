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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The filter for the list of deployments. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>LATEST_ONLY</code>
     * </p>
     */
    private String historyFilter;
    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target AWS IoT thing or thing group.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         target AWS IoT thing or thing group.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target AWS IoT thing or thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The filter for the list of deployments. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>LATEST_ONLY</code>
     * </p>
     * 
     * @param historyFilter
     *        The filter for the list of deployments. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>LATEST_ONLY</code>
     * @see DeploymentHistoryFilter
     */

    public void setHistoryFilter(String historyFilter) {
        this.historyFilter = historyFilter;
    }

    /**
     * <p>
     * The filter for the list of deployments. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>LATEST_ONLY</code>
     * </p>
     * 
     * @return The filter for the list of deployments. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code> – The list includes all deployments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>LATEST_ONLY</code>
     * @see DeploymentHistoryFilter
     */

    public String getHistoryFilter() {
        return this.historyFilter;
    }

    /**
     * <p>
     * The filter for the list of deployments. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>LATEST_ONLY</code>
     * </p>
     * 
     * @param historyFilter
     *        The filter for the list of deployments. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>LATEST_ONLY</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentHistoryFilter
     */

    public ListDeploymentsRequest withHistoryFilter(String historyFilter) {
        setHistoryFilter(historyFilter);
        return this;
    }

    /**
     * <p>
     * The filter for the list of deployments. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all deployments.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>LATEST_ONLY</code>
     * </p>
     * 
     * @param historyFilter
     *        The filter for the list of deployments. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all deployments.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_ONLY</code> – The list includes only the latest revision of each deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>LATEST_ONLY</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentHistoryFilter
     */

    public ListDeploymentsRequest withHistoryFilter(DeploymentHistoryFilter historyFilter) {
        this.historyFilter = historyFilter.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per paginated request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @return The maximum number of results to be returned per paginated request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentsRequest withNextToken(String nextToken) {
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getHistoryFilter() != null)
            sb.append("HistoryFilter: ").append(getHistoryFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListDeploymentsRequest == false)
            return false;
        ListDeploymentsRequest other = (ListDeploymentsRequest) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getHistoryFilter() == null ^ this.getHistoryFilter() == null)
            return false;
        if (other.getHistoryFilter() != null && other.getHistoryFilter().equals(this.getHistoryFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getHistoryFilter() == null) ? 0 : getHistoryFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentsRequest clone() {
        return (ListDeploymentsRequest) super.clone();
    }

}
