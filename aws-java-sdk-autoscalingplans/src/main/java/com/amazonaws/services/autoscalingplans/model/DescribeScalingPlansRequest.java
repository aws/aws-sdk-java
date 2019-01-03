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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlans"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScalingPlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan
     * names.
     * </p>
     */
    private java.util.List<String> scalingPlanNames;
    /**
     * <p>
     * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling
     * plan name.
     * </p>
     */
    private Long scalingPlanVersion;
    /**
     * <p>
     * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application
     * sources.
     * </p>
     */
    private java.util.List<ApplicationSource> applicationSources;
    /**
     * <p>
     * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan
     * names.
     * </p>
     * 
     * @return The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling
     *         plan names.
     */

    public java.util.List<String> getScalingPlanNames() {
        return scalingPlanNames;
    }

    /**
     * <p>
     * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan
     * names.
     * </p>
     * 
     * @param scalingPlanNames
     *        The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling
     *        plan names.
     */

    public void setScalingPlanNames(java.util.Collection<String> scalingPlanNames) {
        if (scalingPlanNames == null) {
            this.scalingPlanNames = null;
            return;
        }

        this.scalingPlanNames = new java.util.ArrayList<String>(scalingPlanNames);
    }

    /**
     * <p>
     * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan
     * names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPlanNames(java.util.Collection)} or {@link #withScalingPlanNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingPlanNames
     *        The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling
     *        plan names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withScalingPlanNames(String... scalingPlanNames) {
        if (this.scalingPlanNames == null) {
            setScalingPlanNames(new java.util.ArrayList<String>(scalingPlanNames.length));
        }
        for (String ele : scalingPlanNames) {
            this.scalingPlanNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan
     * names.
     * </p>
     * 
     * @param scalingPlanNames
     *        The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling
     *        plan names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withScalingPlanNames(java.util.Collection<String> scalingPlanNames) {
        setScalingPlanNames(scalingPlanNames);
        return this;
    }

    /**
     * <p>
     * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling
     * plan name.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan. If you specify a scaling plan version, you must also specify a
     *        scaling plan name.
     */

    public void setScalingPlanVersion(Long scalingPlanVersion) {
        this.scalingPlanVersion = scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling
     * plan name.
     * </p>
     * 
     * @return The version number of the scaling plan. If you specify a scaling plan version, you must also specify a
     *         scaling plan name.
     */

    public Long getScalingPlanVersion() {
        return this.scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling
     * plan name.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan. If you specify a scaling plan version, you must also specify a
     *        scaling plan name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
        return this;
    }

    /**
     * <p>
     * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application
     * sources.
     * </p>
     * 
     * @return The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify
     *         application sources.
     */

    public java.util.List<ApplicationSource> getApplicationSources() {
        return applicationSources;
    }

    /**
     * <p>
     * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application
     * sources.
     * </p>
     * 
     * @param applicationSources
     *        The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify
     *        application sources.
     */

    public void setApplicationSources(java.util.Collection<ApplicationSource> applicationSources) {
        if (applicationSources == null) {
            this.applicationSources = null;
            return;
        }

        this.applicationSources = new java.util.ArrayList<ApplicationSource>(applicationSources);
    }

    /**
     * <p>
     * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application
     * sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationSources(java.util.Collection)} or {@link #withApplicationSources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param applicationSources
     *        The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify
     *        application sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withApplicationSources(ApplicationSource... applicationSources) {
        if (this.applicationSources == null) {
            setApplicationSources(new java.util.ArrayList<ApplicationSource>(applicationSources.length));
        }
        for (ApplicationSource ele : applicationSources) {
            this.applicationSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application
     * sources.
     * </p>
     * 
     * @param applicationSources
     *        The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify
     *        application sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withApplicationSources(java.util.Collection<ApplicationSource> applicationSources) {
        setApplicationSources(applicationSources);
        return this;
    }

    /**
     * <p>
     * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of scalable resources to return. This value can be between 1 and 50. The default value
     *        is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
     * </p>
     * 
     * @return The maximum number of scalable resources to return. This value can be between 1 and 50. The default value
     *         is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of scalable resources to return. This value can be between 1 and 50. The default value
     *        is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansRequest withNextToken(String nextToken) {
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
        if (getScalingPlanNames() != null)
            sb.append("ScalingPlanNames: ").append(getScalingPlanNames()).append(",");
        if (getScalingPlanVersion() != null)
            sb.append("ScalingPlanVersion: ").append(getScalingPlanVersion()).append(",");
        if (getApplicationSources() != null)
            sb.append("ApplicationSources: ").append(getApplicationSources()).append(",");
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

        if (obj instanceof DescribeScalingPlansRequest == false)
            return false;
        DescribeScalingPlansRequest other = (DescribeScalingPlansRequest) obj;
        if (other.getScalingPlanNames() == null ^ this.getScalingPlanNames() == null)
            return false;
        if (other.getScalingPlanNames() != null && other.getScalingPlanNames().equals(this.getScalingPlanNames()) == false)
            return false;
        if (other.getScalingPlanVersion() == null ^ this.getScalingPlanVersion() == null)
            return false;
        if (other.getScalingPlanVersion() != null && other.getScalingPlanVersion().equals(this.getScalingPlanVersion()) == false)
            return false;
        if (other.getApplicationSources() == null ^ this.getApplicationSources() == null)
            return false;
        if (other.getApplicationSources() != null && other.getApplicationSources().equals(this.getApplicationSources()) == false)
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

        hashCode = prime * hashCode + ((getScalingPlanNames() == null) ? 0 : getScalingPlanNames().hashCode());
        hashCode = prime * hashCode + ((getScalingPlanVersion() == null) ? 0 : getScalingPlanVersion().hashCode());
        hashCode = prime * hashCode + ((getApplicationSources() == null) ? 0 : getApplicationSources().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingPlansRequest clone() {
        return (DescribeScalingPlansRequest) super.clone();
    }

}
