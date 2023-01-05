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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTemplateActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters to apply when listing template post migration custom actions.
     * </p>
     */
    private TemplateActionsRequestFilters filters;
    /**
     * <p>
     * Launch configuration template ID.
     * </p>
     */
    private String launchConfigurationTemplateID;
    /**
     * <p>
     * Maximum amount of items to return when listing template post migration custom actions.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Next token to use when listing template post migration custom actions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters to apply when listing template post migration custom actions.
     * </p>
     * 
     * @param filters
     *        Filters to apply when listing template post migration custom actions.
     */

    public void setFilters(TemplateActionsRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters to apply when listing template post migration custom actions.
     * </p>
     * 
     * @return Filters to apply when listing template post migration custom actions.
     */

    public TemplateActionsRequestFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters to apply when listing template post migration custom actions.
     * </p>
     * 
     * @param filters
     *        Filters to apply when listing template post migration custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsRequest withFilters(TemplateActionsRequestFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Launch configuration template ID.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        Launch configuration template ID.
     */

    public void setLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        this.launchConfigurationTemplateID = launchConfigurationTemplateID;
    }

    /**
     * <p>
     * Launch configuration template ID.
     * </p>
     * 
     * @return Launch configuration template ID.
     */

    public String getLaunchConfigurationTemplateID() {
        return this.launchConfigurationTemplateID;
    }

    /**
     * <p>
     * Launch configuration template ID.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        Launch configuration template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsRequest withLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        setLaunchConfigurationTemplateID(launchConfigurationTemplateID);
        return this;
    }

    /**
     * <p>
     * Maximum amount of items to return when listing template post migration custom actions.
     * </p>
     * 
     * @param maxResults
     *        Maximum amount of items to return when listing template post migration custom actions.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum amount of items to return when listing template post migration custom actions.
     * </p>
     * 
     * @return Maximum amount of items to return when listing template post migration custom actions.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum amount of items to return when listing template post migration custom actions.
     * </p>
     * 
     * @param maxResults
     *        Maximum amount of items to return when listing template post migration custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Next token to use when listing template post migration custom actions.
     * </p>
     * 
     * @param nextToken
     *        Next token to use when listing template post migration custom actions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token to use when listing template post migration custom actions.
     * </p>
     * 
     * @return Next token to use when listing template post migration custom actions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token to use when listing template post migration custom actions.
     * </p>
     * 
     * @param nextToken
     *        Next token to use when listing template post migration custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getLaunchConfigurationTemplateID() != null)
            sb.append("LaunchConfigurationTemplateID: ").append(getLaunchConfigurationTemplateID()).append(",");
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

        if (obj instanceof ListTemplateActionsRequest == false)
            return false;
        ListTemplateActionsRequest other = (ListTemplateActionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getLaunchConfigurationTemplateID() == null ^ this.getLaunchConfigurationTemplateID() == null)
            return false;
        if (other.getLaunchConfigurationTemplateID() != null
                && other.getLaunchConfigurationTemplateID().equals(this.getLaunchConfigurationTemplateID()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationTemplateID() == null) ? 0 : getLaunchConfigurationTemplateID().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateActionsRequest clone() {
        return (ListTemplateActionsRequest) super.clone();
    }

}
