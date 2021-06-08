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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the createProfiliingGroupRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/CreateProfilingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfilingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether profiling is enabled or disabled for the created profiling group.
     * </p>
     */
    private AgentOrchestrationConfig agentOrchestrationConfig;
    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation of
     * duplicate profiling groups if there are failures and retries.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS Lambda.
     * Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda, such an Amazon
     * EC2 instance, an on-premises server, or a different platform. If not specified, <code>Default</code> is used.
     * </p>
     */
    private String computePlatform;
    /**
     * <p>
     * The name of the profiling group to create.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * A list of tags to add to the created profiling group.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specifies whether profiling is enabled or disabled for the created profiling group.
     * </p>
     * 
     * @param agentOrchestrationConfig
     *        Specifies whether profiling is enabled or disabled for the created profiling group.
     */

    public void setAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        this.agentOrchestrationConfig = agentOrchestrationConfig;
    }

    /**
     * <p>
     * Specifies whether profiling is enabled or disabled for the created profiling group.
     * </p>
     * 
     * @return Specifies whether profiling is enabled or disabled for the created profiling group.
     */

    public AgentOrchestrationConfig getAgentOrchestrationConfig() {
        return this.agentOrchestrationConfig;
    }

    /**
     * <p>
     * Specifies whether profiling is enabled or disabled for the created profiling group.
     * </p>
     * 
     * @param agentOrchestrationConfig
     *        Specifies whether profiling is enabled or disabled for the created profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfilingGroupRequest withAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        setAgentOrchestrationConfig(agentOrchestrationConfig);
        return this;
    }

    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation of
     * duplicate profiling groups if there are failures and retries.
     * </p>
     * 
     * @param clientToken
     *        Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation
     *        of duplicate profiling groups if there are failures and retries.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation of
     * duplicate profiling groups if there are failures and retries.
     * </p>
     * 
     * @return Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental
     *         creation of duplicate profiling groups if there are failures and retries.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation of
     * duplicate profiling groups if there are failures and retries.
     * </p>
     * 
     * @param clientToken
     *        Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation
     *        of duplicate profiling groups if there are failures and retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfilingGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS Lambda.
     * Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda, such an Amazon
     * EC2 instance, an on-premises server, or a different platform. If not specified, <code>Default</code> is used.
     * </p>
     * 
     * @param computePlatform
     *        The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS
     *        Lambda. Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda,
     *        such an Amazon EC2 instance, an on-premises server, or a different platform. If not specified,
     *        <code>Default</code> is used.
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS Lambda.
     * Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda, such an Amazon
     * EC2 instance, an on-premises server, or a different platform. If not specified, <code>Default</code> is used.
     * </p>
     * 
     * @return The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS
     *         Lambda. Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda,
     *         such an Amazon EC2 instance, an on-premises server, or a different platform. If not specified,
     *         <code>Default</code> is used.
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS Lambda.
     * Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda, such an Amazon
     * EC2 instance, an on-premises server, or a different platform. If not specified, <code>Default</code> is used.
     * </p>
     * 
     * @param computePlatform
     *        The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS
     *        Lambda. Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda,
     *        such an Amazon EC2 instance, an on-premises server, or a different platform. If not specified,
     *        <code>Default</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public CreateProfilingGroupRequest withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS Lambda.
     * Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda, such an Amazon
     * EC2 instance, an on-premises server, or a different platform. If not specified, <code>Default</code> is used.
     * </p>
     * 
     * @param computePlatform
     *        The compute platform of the profiling group. Use <code>AWSLambda</code> if your application runs on AWS
     *        Lambda. Use <code>Default</code> if your application runs on a compute platform that is not AWS Lambda,
     *        such an Amazon EC2 instance, an on-premises server, or a different platform. If not specified,
     *        <code>Default</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public CreateProfilingGroupRequest withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The name of the profiling group to create.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to create.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to create.
     * </p>
     * 
     * @return The name of the profiling group to create.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to create.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfilingGroupRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the created profiling group.
     * </p>
     * 
     * @return A list of tags to add to the created profiling group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the created profiling group.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the created profiling group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to add to the created profiling group.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the created profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfilingGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProfilingGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfilingGroupRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfilingGroupRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAgentOrchestrationConfig() != null)
            sb.append("AgentOrchestrationConfig: ").append(getAgentOrchestrationConfig()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProfilingGroupRequest == false)
            return false;
        CreateProfilingGroupRequest other = (CreateProfilingGroupRequest) obj;
        if (other.getAgentOrchestrationConfig() == null ^ this.getAgentOrchestrationConfig() == null)
            return false;
        if (other.getAgentOrchestrationConfig() != null && other.getAgentOrchestrationConfig().equals(this.getAgentOrchestrationConfig()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentOrchestrationConfig() == null) ? 0 : getAgentOrchestrationConfig().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProfilingGroupRequest clone() {
        return (CreateProfilingGroupRequest) super.clone();
    }

}
