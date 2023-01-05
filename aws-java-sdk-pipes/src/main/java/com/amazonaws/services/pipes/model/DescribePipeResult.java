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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DescribePipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time the pipe was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The state the pipe is in.
     * </p>
     */
    private String currentState;
    /**
     * <p>
     * A description of the pipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     */
    private String enrichment;
    /**
     * <p>
     * The parameters required to set up enrichment on your pipe.
     * </p>
     */
    private PipeEnrichmentParameters enrichmentParameters;
    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The name of the pipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the role that allows the pipe to send data to the target.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The parameters required to set up a source for your pipe.
     * </p>
     */
    private PipeSourceParameters sourceParameters;
    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The list of key-value pairs to associate with the pipe.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The parameters required to set up a target for your pipe.
     * </p>
     */
    private PipeTargetParameters targetParameters;

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     * 
     * @param arn
     *        The ARN of the pipe.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     * 
     * @return The ARN of the pipe.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     * 
     * @param arn
     *        The ARN of the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time the pipe was created.
     * </p>
     * 
     * @param creationTime
     *        The time the pipe was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the pipe was created.
     * </p>
     * 
     * @return The time the pipe was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the pipe was created.
     * </p>
     * 
     * @param creationTime
     *        The time the pipe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @see PipeState
     */

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @return The state the pipe is in.
     * @see PipeState
     */

    public String getCurrentState() {
        return this.currentState;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeState
     */

    public DescribePipeResult withCurrentState(String currentState) {
        setCurrentState(currentState);
        return this;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeState
     */

    public DescribePipeResult withCurrentState(PipeState currentState) {
        this.currentState = currentState.toString();
        return this;
    }

    /**
     * <p>
     * A description of the pipe.
     * </p>
     * 
     * @param description
     *        A description of the pipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the pipe.
     * </p>
     * 
     * @return A description of the pipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the pipe.
     * </p>
     * 
     * @param description
     *        A description of the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @see RequestedPipeStateDescribeResponse
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @return The state the pipe should be in.
     * @see RequestedPipeStateDescribeResponse
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedPipeStateDescribeResponse
     */

    public DescribePipeResult withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedPipeStateDescribeResponse
     */

    public DescribePipeResult withDesiredState(RequestedPipeStateDescribeResponse desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     * 
     * @param enrichment
     *        The ARN of the enrichment resource.
     */

    public void setEnrichment(String enrichment) {
        this.enrichment = enrichment;
    }

    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     * 
     * @return The ARN of the enrichment resource.
     */

    public String getEnrichment() {
        return this.enrichment;
    }

    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     * 
     * @param enrichment
     *        The ARN of the enrichment resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withEnrichment(String enrichment) {
        setEnrichment(enrichment);
        return this;
    }

    /**
     * <p>
     * The parameters required to set up enrichment on your pipe.
     * </p>
     * 
     * @param enrichmentParameters
     *        The parameters required to set up enrichment on your pipe.
     */

    public void setEnrichmentParameters(PipeEnrichmentParameters enrichmentParameters) {
        this.enrichmentParameters = enrichmentParameters;
    }

    /**
     * <p>
     * The parameters required to set up enrichment on your pipe.
     * </p>
     * 
     * @return The parameters required to set up enrichment on your pipe.
     */

    public PipeEnrichmentParameters getEnrichmentParameters() {
        return this.enrichmentParameters;
    }

    /**
     * <p>
     * The parameters required to set up enrichment on your pipe.
     * </p>
     * 
     * @param enrichmentParameters
     *        The parameters required to set up enrichment on your pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withEnrichmentParameters(PipeEnrichmentParameters enrichmentParameters) {
        setEnrichmentParameters(enrichmentParameters);
        return this;
    }

    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModifiedTime
     *        When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @return When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *         (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModifiedTime
     *        When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The name of the pipe.
     * </p>
     * 
     * @param name
     *        The name of the pipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipe.
     * </p>
     * 
     * @return The name of the pipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipe.
     * </p>
     * 
     * @param name
     *        The name of the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that allows the pipe to send data to the target.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that allows the pipe to send data to the target.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows the pipe to send data to the target.
     * </p>
     * 
     * @return The ARN of the role that allows the pipe to send data to the target.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows the pipe to send data to the target.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that allows the pipe to send data to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     * 
     * @param source
     *        The ARN of the source resource.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     * 
     * @return The ARN of the source resource.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     * 
     * @param source
     *        The ARN of the source resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The parameters required to set up a source for your pipe.
     * </p>
     * 
     * @param sourceParameters
     *        The parameters required to set up a source for your pipe.
     */

    public void setSourceParameters(PipeSourceParameters sourceParameters) {
        this.sourceParameters = sourceParameters;
    }

    /**
     * <p>
     * The parameters required to set up a source for your pipe.
     * </p>
     * 
     * @return The parameters required to set up a source for your pipe.
     */

    public PipeSourceParameters getSourceParameters() {
        return this.sourceParameters;
    }

    /**
     * <p>
     * The parameters required to set up a source for your pipe.
     * </p>
     * 
     * @param sourceParameters
     *        The parameters required to set up a source for your pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withSourceParameters(PipeSourceParameters sourceParameters) {
        setSourceParameters(sourceParameters);
        return this;
    }

    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the pipe is in its current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     * 
     * @return The reason the pipe is in its current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the pipe is in its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs to associate with the pipe.
     * </p>
     * 
     * @return The list of key-value pairs to associate with the pipe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value pairs to associate with the pipe.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs to associate with the pipe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of key-value pairs to associate with the pipe.
     * </p>
     * 
     * @param tags
     *        The list of key-value pairs to associate with the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribePipeResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult addTagsEntry(String key, String value) {
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

    public DescribePipeResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     * 
     * @param target
     *        The ARN of the target resource.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     * 
     * @return The ARN of the target resource.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     * 
     * @param target
     *        The ARN of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The parameters required to set up a target for your pipe.
     * </p>
     * 
     * @param targetParameters
     *        The parameters required to set up a target for your pipe.
     */

    public void setTargetParameters(PipeTargetParameters targetParameters) {
        this.targetParameters = targetParameters;
    }

    /**
     * <p>
     * The parameters required to set up a target for your pipe.
     * </p>
     * 
     * @return The parameters required to set up a target for your pipe.
     */

    public PipeTargetParameters getTargetParameters() {
        return this.targetParameters;
    }

    /**
     * <p>
     * The parameters required to set up a target for your pipe.
     * </p>
     * 
     * @param targetParameters
     *        The parameters required to set up a target for your pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePipeResult withTargetParameters(PipeTargetParameters targetParameters) {
        setTargetParameters(targetParameters);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCurrentState() != null)
            sb.append("CurrentState: ").append(getCurrentState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getEnrichment() != null)
            sb.append("Enrichment: ").append(getEnrichment()).append(",");
        if (getEnrichmentParameters() != null)
            sb.append("EnrichmentParameters: ").append(getEnrichmentParameters()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSourceParameters() != null)
            sb.append("SourceParameters: ").append(getSourceParameters()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTargetParameters() != null)
            sb.append("TargetParameters: ").append(getTargetParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePipeResult == false)
            return false;
        DescribePipeResult other = (DescribePipeResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentState() == null ^ this.getCurrentState() == null)
            return false;
        if (other.getCurrentState() != null && other.getCurrentState().equals(this.getCurrentState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getEnrichment() == null ^ this.getEnrichment() == null)
            return false;
        if (other.getEnrichment() != null && other.getEnrichment().equals(this.getEnrichment()) == false)
            return false;
        if (other.getEnrichmentParameters() == null ^ this.getEnrichmentParameters() == null)
            return false;
        if (other.getEnrichmentParameters() != null && other.getEnrichmentParameters().equals(this.getEnrichmentParameters()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceParameters() == null ^ this.getSourceParameters() == null)
            return false;
        if (other.getSourceParameters() != null && other.getSourceParameters().equals(this.getSourceParameters()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTargetParameters() == null ^ this.getTargetParameters() == null)
            return false;
        if (other.getTargetParameters() != null && other.getTargetParameters().equals(this.getTargetParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getEnrichment() == null) ? 0 : getEnrichment().hashCode());
        hashCode = prime * hashCode + ((getEnrichmentParameters() == null) ? 0 : getEnrichmentParameters().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceParameters() == null) ? 0 : getSourceParameters().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTargetParameters() == null) ? 0 : getTargetParameters().hashCode());
        return hashCode;
    }

    @Override
    public DescribePipeResult clone() {
        try {
            return (DescribePipeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
