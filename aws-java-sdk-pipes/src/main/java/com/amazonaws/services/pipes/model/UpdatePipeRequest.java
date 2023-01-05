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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The parameters required to set up a source for your pipe.
     * </p>
     */
    private UpdatePipeSourceParameters sourceParameters;
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

    public UpdatePipeRequest withDescription(String description) {
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
     * @see RequestedPipeState
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
     * @see RequestedPipeState
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
     * @see RequestedPipeState
     */

    public UpdatePipeRequest withDesiredState(String desiredState) {
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
     * @see RequestedPipeState
     */

    public UpdatePipeRequest withDesiredState(RequestedPipeState desiredState) {
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

    public UpdatePipeRequest withEnrichment(String enrichment) {
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

    public UpdatePipeRequest withEnrichmentParameters(PipeEnrichmentParameters enrichmentParameters) {
        setEnrichmentParameters(enrichmentParameters);
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

    public UpdatePipeRequest withName(String name) {
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

    public UpdatePipeRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public void setSourceParameters(UpdatePipeSourceParameters sourceParameters) {
        this.sourceParameters = sourceParameters;
    }

    /**
     * <p>
     * The parameters required to set up a source for your pipe.
     * </p>
     * 
     * @return The parameters required to set up a source for your pipe.
     */

    public UpdatePipeSourceParameters getSourceParameters() {
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

    public UpdatePipeRequest withSourceParameters(UpdatePipeSourceParameters sourceParameters) {
        setSourceParameters(sourceParameters);
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

    public UpdatePipeRequest withTarget(String target) {
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

    public UpdatePipeRequest withTargetParameters(PipeTargetParameters targetParameters) {
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getEnrichment() != null)
            sb.append("Enrichment: ").append(getEnrichment()).append(",");
        if (getEnrichmentParameters() != null)
            sb.append("EnrichmentParameters: ").append(getEnrichmentParameters()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSourceParameters() != null)
            sb.append("SourceParameters: ").append(getSourceParameters()).append(",");
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

        if (obj instanceof UpdatePipeRequest == false)
            return false;
        UpdatePipeRequest other = (UpdatePipeRequest) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSourceParameters() == null ^ this.getSourceParameters() == null)
            return false;
        if (other.getSourceParameters() != null && other.getSourceParameters().equals(this.getSourceParameters()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getEnrichment() == null) ? 0 : getEnrichment().hashCode());
        hashCode = prime * hashCode + ((getEnrichmentParameters() == null) ? 0 : getEnrichmentParameters().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSourceParameters() == null) ? 0 : getSourceParameters().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTargetParameters() == null) ? 0 : getTargetParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipeRequest clone() {
        return (UpdatePipeRequest) super.clone();
    }

}
