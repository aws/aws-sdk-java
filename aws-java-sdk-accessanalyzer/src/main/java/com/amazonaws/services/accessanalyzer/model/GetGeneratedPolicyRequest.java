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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetGeneratedPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeneratedPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate policies with placeholders for
     * resource ARNs for actions that support resource level granularity in policies.
     * </p>
     * <p>
     * For example, in the resource section of a policy, you can receive a placeholder such as
     * <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     * </p>
     */
    private Boolean includeResourcePlaceholders;
    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate service-level policies.
     * </p>
     * <p>
     * Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used recently to
     * create this service-level template.
     * </p>
     */
    private Boolean includeServiceLevelTemplate;
    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate policies with placeholders for
     * resource ARNs for actions that support resource level granularity in policies.
     * </p>
     * <p>
     * For example, in the resource section of a policy, you can receive a placeholder such as
     * <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     * </p>
     * 
     * @param includeResourcePlaceholders
     *        The level of detail that you want to generate. You can specify whether to generate policies with
     *        placeholders for resource ARNs for actions that support resource level granularity in policies.</p>
     *        <p>
     *        For example, in the resource section of a policy, you can receive a placeholder such as
     *        <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     */

    public void setIncludeResourcePlaceholders(Boolean includeResourcePlaceholders) {
        this.includeResourcePlaceholders = includeResourcePlaceholders;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate policies with placeholders for
     * resource ARNs for actions that support resource level granularity in policies.
     * </p>
     * <p>
     * For example, in the resource section of a policy, you can receive a placeholder such as
     * <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     * </p>
     * 
     * @return The level of detail that you want to generate. You can specify whether to generate policies with
     *         placeholders for resource ARNs for actions that support resource level granularity in policies.</p>
     *         <p>
     *         For example, in the resource section of a policy, you can receive a placeholder such as
     *         <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     */

    public Boolean getIncludeResourcePlaceholders() {
        return this.includeResourcePlaceholders;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate policies with placeholders for
     * resource ARNs for actions that support resource level granularity in policies.
     * </p>
     * <p>
     * For example, in the resource section of a policy, you can receive a placeholder such as
     * <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     * </p>
     * 
     * @param includeResourcePlaceholders
     *        The level of detail that you want to generate. You can specify whether to generate policies with
     *        placeholders for resource ARNs for actions that support resource level granularity in policies.</p>
     *        <p>
     *        For example, in the resource section of a policy, you can receive a placeholder such as
     *        <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedPolicyRequest withIncludeResourcePlaceholders(Boolean includeResourcePlaceholders) {
        setIncludeResourcePlaceholders(includeResourcePlaceholders);
        return this;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate policies with placeholders for
     * resource ARNs for actions that support resource level granularity in policies.
     * </p>
     * <p>
     * For example, in the resource section of a policy, you can receive a placeholder such as
     * <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     * </p>
     * 
     * @return The level of detail that you want to generate. You can specify whether to generate policies with
     *         placeholders for resource ARNs for actions that support resource level granularity in policies.</p>
     *         <p>
     *         For example, in the resource section of a policy, you can receive a placeholder such as
     *         <code>"Resource":"arn:aws:s3:::${BucketName}"</code> instead of <code>"*"</code>.
     */

    public Boolean isIncludeResourcePlaceholders() {
        return this.includeResourcePlaceholders;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate service-level policies.
     * </p>
     * <p>
     * Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used recently to
     * create this service-level template.
     * </p>
     * 
     * @param includeServiceLevelTemplate
     *        The level of detail that you want to generate. You can specify whether to generate service-level policies.
     *        </p>
     *        <p>
     *        Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used
     *        recently to create this service-level template.
     */

    public void setIncludeServiceLevelTemplate(Boolean includeServiceLevelTemplate) {
        this.includeServiceLevelTemplate = includeServiceLevelTemplate;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate service-level policies.
     * </p>
     * <p>
     * Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used recently to
     * create this service-level template.
     * </p>
     * 
     * @return The level of detail that you want to generate. You can specify whether to generate service-level
     *         policies. </p>
     *         <p>
     *         Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used
     *         recently to create this service-level template.
     */

    public Boolean getIncludeServiceLevelTemplate() {
        return this.includeServiceLevelTemplate;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate service-level policies.
     * </p>
     * <p>
     * Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used recently to
     * create this service-level template.
     * </p>
     * 
     * @param includeServiceLevelTemplate
     *        The level of detail that you want to generate. You can specify whether to generate service-level policies.
     *        </p>
     *        <p>
     *        Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used
     *        recently to create this service-level template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedPolicyRequest withIncludeServiceLevelTemplate(Boolean includeServiceLevelTemplate) {
        setIncludeServiceLevelTemplate(includeServiceLevelTemplate);
        return this;
    }

    /**
     * <p>
     * The level of detail that you want to generate. You can specify whether to generate service-level policies.
     * </p>
     * <p>
     * Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used recently to
     * create this service-level template.
     * </p>
     * 
     * @return The level of detail that you want to generate. You can specify whether to generate service-level
     *         policies. </p>
     *         <p>
     *         Access Analyzer uses <code>iam:servicelastaccessed</code> to identify services that have been used
     *         recently to create this service-level template.
     */

    public Boolean isIncludeServiceLevelTemplate() {
        return this.includeServiceLevelTemplate;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @param jobId
     *        The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *        <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *        used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @return The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *         <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *         used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @param jobId
     *        The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *        <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *        used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeneratedPolicyRequest withJobId(String jobId) {
        setJobId(jobId);
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
        if (getIncludeResourcePlaceholders() != null)
            sb.append("IncludeResourcePlaceholders: ").append(getIncludeResourcePlaceholders()).append(",");
        if (getIncludeServiceLevelTemplate() != null)
            sb.append("IncludeServiceLevelTemplate: ").append(getIncludeServiceLevelTemplate()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeneratedPolicyRequest == false)
            return false;
        GetGeneratedPolicyRequest other = (GetGeneratedPolicyRequest) obj;
        if (other.getIncludeResourcePlaceholders() == null ^ this.getIncludeResourcePlaceholders() == null)
            return false;
        if (other.getIncludeResourcePlaceholders() != null && other.getIncludeResourcePlaceholders().equals(this.getIncludeResourcePlaceholders()) == false)
            return false;
        if (other.getIncludeServiceLevelTemplate() == null ^ this.getIncludeServiceLevelTemplate() == null)
            return false;
        if (other.getIncludeServiceLevelTemplate() != null && other.getIncludeServiceLevelTemplate().equals(this.getIncludeServiceLevelTemplate()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeResourcePlaceholders() == null) ? 0 : getIncludeResourcePlaceholders().hashCode());
        hashCode = prime * hashCode + ((getIncludeServiceLevelTemplate() == null) ? 0 : getIncludeServiceLevelTemplate().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public GetGeneratedPolicyRequest clone() {
        return (GetGeneratedPolicyRequest) super.clone();
    }

}
