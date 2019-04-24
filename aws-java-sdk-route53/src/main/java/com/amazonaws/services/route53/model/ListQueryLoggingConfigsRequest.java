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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListQueryLoggingConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueryLoggingConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is associated with a hosted zone, specify the
     * ID in <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in response
     * to the current request. If the current AWS account has more than <code>MaxResults</code> configurations, use the
     * value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     * </p>
     */
    private String maxResults;

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is associated with a hosted zone, specify the
     * ID in <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * 
     * @param hostedZoneId
     *        (Optional) If you want to list the query logging configuration that is associated with a hosted zone,
     *        specify the ID in <code>HostedZoneId</code>. </p>
     *        <p>
     *        If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the
     *        configurations that are associated with the current AWS account.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is associated with a hosted zone, specify the
     * ID in <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * 
     * @return (Optional) If you want to list the query logging configuration that is associated with a hosted zone,
     *         specify the ID in <code>HostedZoneId</code>. </p>
     *         <p>
     *         If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the
     *         configurations that are associated with the current AWS account.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is associated with a hosted zone, specify the
     * ID in <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * 
     * @param hostedZoneId
     *        (Optional) If you want to list the query logging configuration that is associated with a hosted zone,
     *        specify the ID in <code>HostedZoneId</code>. </p>
     *        <p>
     *        If you don't specify a hosted zone ID, <code>ListQueryLoggingConfigs</code> returns all of the
     *        configurations that are associated with the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryLoggingConfigsRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations,
     *        use <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @return (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations,
     *         use <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *         <p>
     *         For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     *         </p>
     *         <p>
     *         For the second and subsequent requests, get the value of <code>NextToken</code> from the previous
     *         response and specify that value for <code>NextToken</code> in the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the current AWS account has more than <code>MaxResults</code> query logging configurations,
     *        use <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListQueryLoggingConfigs</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryLoggingConfigsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in response
     * to the current request. If the current AWS account has more than <code>MaxResults</code> configurations, use the
     * value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     * </p>
     * 
     * @param maxResults
     *        (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in
     *        response to the current request. If the current AWS account has more than <code>MaxResults</code>
     *        configurations, use the value of <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     *        >NextToken</a> in the response to get the next page of results.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in response
     * to the current request. If the current AWS account has more than <code>MaxResults</code> configurations, use the
     * value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     * </p>
     * 
     * @return (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in
     *         response to the current request. If the current AWS account has more than <code>MaxResults</code>
     *         configurations, use the value of <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     *         >NextToken</a> in the response to get the next page of results.</p>
     *         <p>
     *         If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in response
     * to the current request. If the current AWS account has more than <code>MaxResults</code> configurations, use the
     * value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     * </p>
     * 
     * @param maxResults
     *        (Optional) The maximum number of query logging configurations that you want Amazon Route 53 to return in
     *        response to the current request. If the current AWS account has more than <code>MaxResults</code>
     *        configurations, use the value of <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     *        >NextToken</a> in the response to get the next page of results.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100 configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueryLoggingConfigsRequest withMaxResults(String maxResults) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
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

        if (obj instanceof ListQueryLoggingConfigsRequest == false)
            return false;
        ListQueryLoggingConfigsRequest other = (ListQueryLoggingConfigsRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
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

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListQueryLoggingConfigsRequest clone() {
        return (ListQueryLoggingConfigsRequest) super.clone();
    }

}
