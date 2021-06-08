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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListAutoScalingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAutoScalingConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner lists
     * revisions that share this name. If not specified, App Runner returns revisions of all configurations.
     * </p>
     */
    private String autoScalingConfigurationName;
    /**
     * <p>
     * Set to <code>true</code> to list only the latest revision for each requested configuration name.
     * </p>
     * <p>
     * Keep as <code>false</code> to list all revisions for each requested configuration name.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean latestOnly;
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
     * A token from a previous result page. It's used for a paginated request. The request retrieves the next result
     * page. All other parameter values must be identical to the ones that are specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner lists
     * revisions that share this name. If not specified, App Runner returns revisions of all configurations.
     * </p>
     * 
     * @param autoScalingConfigurationName
     *        The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner
     *        lists revisions that share this name. If not specified, App Runner returns revisions of all
     *        configurations.
     */

    public void setAutoScalingConfigurationName(String autoScalingConfigurationName) {
        this.autoScalingConfigurationName = autoScalingConfigurationName;
    }

    /**
     * <p>
     * The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner lists
     * revisions that share this name. If not specified, App Runner returns revisions of all configurations.
     * </p>
     * 
     * @return The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner
     *         lists revisions that share this name. If not specified, App Runner returns revisions of all
     *         configurations.
     */

    public String getAutoScalingConfigurationName() {
        return this.autoScalingConfigurationName;
    }

    /**
     * <p>
     * The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner lists
     * revisions that share this name. If not specified, App Runner returns revisions of all configurations.
     * </p>
     * 
     * @param autoScalingConfigurationName
     *        The name of the App Runner auto scaling configuration that you want to list. If specified, App Runner
     *        lists revisions that share this name. If not specified, App Runner returns revisions of all
     *        configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoScalingConfigurationsRequest withAutoScalingConfigurationName(String autoScalingConfigurationName) {
        setAutoScalingConfigurationName(autoScalingConfigurationName);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to list only the latest revision for each requested configuration name.
     * </p>
     * <p>
     * Keep as <code>false</code> to list all revisions for each requested configuration name.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param latestOnly
     *        Set to <code>true</code> to list only the latest revision for each requested configuration name.</p>
     *        <p>
     *        Keep as <code>false</code> to list all revisions for each requested configuration name.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
    }

    /**
     * <p>
     * Set to <code>true</code> to list only the latest revision for each requested configuration name.
     * </p>
     * <p>
     * Keep as <code>false</code> to list all revisions for each requested configuration name.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to list only the latest revision for each requested configuration name.</p>
     *         <p>
     *         Keep as <code>false</code> to list all revisions for each requested configuration name.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getLatestOnly() {
        return this.latestOnly;
    }

    /**
     * <p>
     * Set to <code>true</code> to list only the latest revision for each requested configuration name.
     * </p>
     * <p>
     * Keep as <code>false</code> to list all revisions for each requested configuration name.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param latestOnly
     *        Set to <code>true</code> to list only the latest revision for each requested configuration name.</p>
     *        <p>
     *        Keep as <code>false</code> to list all revisions for each requested configuration name.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoScalingConfigurationsRequest withLatestOnly(Boolean latestOnly) {
        setLatestOnly(latestOnly);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to list only the latest revision for each requested configuration name.
     * </p>
     * <p>
     * Keep as <code>false</code> to list all revisions for each requested configuration name.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to list only the latest revision for each requested configuration name.</p>
     *         <p>
     *         Keep as <code>false</code> to list all revisions for each requested configuration name.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isLatestOnly() {
        return this.latestOnly;
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

    public ListAutoScalingConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token from a previous result page. It's used for a paginated request. The request retrieves the next result
     * page. All other parameter values must be identical to the ones that are specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @param nextToken
     *        A token from a previous result page. It's used for a paginated request. The request retrieves the next
     *        result page. All other parameter values must be identical to the ones that are specified in the initial
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
     * page. All other parameter values must be identical to the ones that are specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @return A token from a previous result page. It's used for a paginated request. The request retrieves the next
     *         result page. All other parameter values must be identical to the ones that are specified in the initial
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
     * page. All other parameter values must be identical to the ones that are specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @param nextToken
     *        A token from a previous result page. It's used for a paginated request. The request retrieves the next
     *        result page. All other parameter values must be identical to the ones that are specified in the initial
     *        request.</p>
     *        <p>
     *        If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoScalingConfigurationsRequest withNextToken(String nextToken) {
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
        if (getAutoScalingConfigurationName() != null)
            sb.append("AutoScalingConfigurationName: ").append(getAutoScalingConfigurationName()).append(",");
        if (getLatestOnly() != null)
            sb.append("LatestOnly: ").append(getLatestOnly()).append(",");
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

        if (obj instanceof ListAutoScalingConfigurationsRequest == false)
            return false;
        ListAutoScalingConfigurationsRequest other = (ListAutoScalingConfigurationsRequest) obj;
        if (other.getAutoScalingConfigurationName() == null ^ this.getAutoScalingConfigurationName() == null)
            return false;
        if (other.getAutoScalingConfigurationName() != null && other.getAutoScalingConfigurationName().equals(this.getAutoScalingConfigurationName()) == false)
            return false;
        if (other.getLatestOnly() == null ^ this.getLatestOnly() == null)
            return false;
        if (other.getLatestOnly() != null && other.getLatestOnly().equals(this.getLatestOnly()) == false)
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

        hashCode = prime * hashCode + ((getAutoScalingConfigurationName() == null) ? 0 : getAutoScalingConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLatestOnly() == null) ? 0 : getLatestOnly().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAutoScalingConfigurationsRequest clone() {
        return (ListAutoScalingConfigurationsRequest) super.clone();
    }

}
