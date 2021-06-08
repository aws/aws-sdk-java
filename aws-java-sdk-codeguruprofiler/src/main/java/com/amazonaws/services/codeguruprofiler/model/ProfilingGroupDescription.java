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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a profiling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ProfilingGroupDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfilingGroupDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     * <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for profiled
     * or not.
     * </p>
     */
    private AgentOrchestrationConfig agentOrchestrationConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     * application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs on a
     * compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different
     * platform. The default is <code>Default</code>.
     * </p>
     */
    private String computePlatform;
    /**
     * <p>
     * The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the profiling group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     * <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent pinged
     * back, the last time a profile was received, and the aggregation period and start time for the most recent
     * aggregated profile.
     * </p>
     */
    private ProfilingStatus profilingStatus;
    /**
     * <p>
     * A list of the tags that belong to this profiling group.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     * <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for profiled
     * or not.
     * </p>
     * 
     * @param agentOrchestrationConfig
     *        An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     *        <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for
     *        profiled or not.
     */

    public void setAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        this.agentOrchestrationConfig = agentOrchestrationConfig;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     * <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for profiled
     * or not.
     * </p>
     * 
     * @return An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     *         <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for
     *         profiled or not.
     */

    public AgentOrchestrationConfig getAgentOrchestrationConfig() {
        return this.agentOrchestrationConfig;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     * <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for profiled
     * or not.
     * </p>
     * 
     * @param agentOrchestrationConfig
     *        An <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AgentOrchestrationConfig.html">
     *        <code>AgentOrchestrationConfig</code> </a> object that indicates if the profiling group is enabled for
     *        profiled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withAgentOrchestrationConfig(AgentOrchestrationConfig agentOrchestrationConfig) {
        setAgentOrchestrationConfig(agentOrchestrationConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) identifying the profiling group resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) identifying the profiling group resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the profiling group resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) identifying the profiling group resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     * application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs on a
     * compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different
     * platform. The default is <code>Default</code>.
     * </p>
     * 
     * @param computePlatform
     *        The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     *        application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs
     *        on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a
     *        different platform. The default is <code>Default</code>.
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     * application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs on a
     * compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different
     * platform. The default is <code>Default</code>.
     * </p>
     * 
     * @return The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     *         application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs
     *         on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a
     *         different platform. The default is <code>Default</code>.
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     * application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs on a
     * compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different
     * platform. The default is <code>Default</code>.
     * </p>
     * 
     * @param computePlatform
     *        The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     *        application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs
     *        on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a
     *        different platform. The default is <code>Default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public ProfilingGroupDescription withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     * application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs on a
     * compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different
     * platform. The default is <code>Default</code>.
     * </p>
     * 
     * @param computePlatform
     *        The compute platform of the profiling group. If it is set to <code>AWSLambda</code>, then the profiled
     *        application runs on AWS Lambda. If it is set to <code>Default</code>, then the profiled application runs
     *        on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a
     *        different platform. The default is <code>Default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public ProfilingGroupDescription withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param createdAt
     *        The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     *        2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     *         2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param createdAt
     *        The time when the profiling group was created. Specify using the ISO 8601 format. For example,
     *        2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param name
     *        The name of the profiling group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @return The name of the profiling group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param name
     *        The name of the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     * <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent pinged
     * back, the last time a profile was received, and the aggregation period and start time for the most recent
     * aggregated profile.
     * </p>
     * 
     * @param profilingStatus
     *        A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     *        <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent
     *        pinged back, the last time a profile was received, and the aggregation period and start time for the most
     *        recent aggregated profile.
     */

    public void setProfilingStatus(ProfilingStatus profilingStatus) {
        this.profilingStatus = profilingStatus;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     * <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent pinged
     * back, the last time a profile was received, and the aggregation period and start time for the most recent
     * aggregated profile.
     * </p>
     * 
     * @return A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     *         <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent
     *         pinged back, the last time a profile was received, and the aggregation period and start time for the most
     *         recent aggregated profile.
     */

    public ProfilingStatus getProfilingStatus() {
        return this.profilingStatus;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     * <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent pinged
     * back, the last time a profile was received, and the aggregation period and start time for the most recent
     * aggregated profile.
     * </p>
     * 
     * @param profilingStatus
     *        A <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ProfilingStatus.html">
     *        <code>ProfilingStatus</code> </a> object that includes information about the last time a profile agent
     *        pinged back, the last time a profile was received, and the aggregation period and start time for the most
     *        recent aggregated profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withProfilingStatus(ProfilingStatus profilingStatus) {
        setProfilingStatus(profilingStatus);
        return this;
    }

    /**
     * <p>
     * A list of the tags that belong to this profiling group.
     * </p>
     * 
     * @return A list of the tags that belong to this profiling group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tags that belong to this profiling group.
     * </p>
     * 
     * @param tags
     *        A list of the tags that belong to this profiling group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of the tags that belong to this profiling group.
     * </p>
     * 
     * @param tags
     *        A list of the tags that belong to this profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ProfilingGroupDescription#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription addTagsEntry(String key, String value) {
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

    public ProfilingGroupDescription clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For
     *         example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the profiling group was last updated. Specify using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingGroupDescription withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProfilingStatus() != null)
            sb.append("ProfilingStatus: ").append(getProfilingStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfilingGroupDescription == false)
            return false;
        ProfilingGroupDescription other = (ProfilingGroupDescription) obj;
        if (other.getAgentOrchestrationConfig() == null ^ this.getAgentOrchestrationConfig() == null)
            return false;
        if (other.getAgentOrchestrationConfig() != null && other.getAgentOrchestrationConfig().equals(this.getAgentOrchestrationConfig()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfilingStatus() == null ^ this.getProfilingStatus() == null)
            return false;
        if (other.getProfilingStatus() != null && other.getProfilingStatus().equals(this.getProfilingStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentOrchestrationConfig() == null) ? 0 : getAgentOrchestrationConfig().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProfilingStatus() == null) ? 0 : getProfilingStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProfilingGroupDescription clone() {
        try {
            return (ProfilingGroupDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.ProfilingGroupDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
