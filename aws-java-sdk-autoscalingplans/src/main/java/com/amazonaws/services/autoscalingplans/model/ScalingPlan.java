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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a scaling plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPlan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     */
    private String scalingPlanName;
    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     */
    private Long scalingPlanVersion;
    /**
     * <p>
     * The application source.
     * </p>
     */
    private ApplicationSource applicationSource;
    /**
     * <p>
     * The scaling instructions.
     * </p>
     */
    private java.util.List<ScalingInstruction> scalingInstructions;
    /**
     * <p>
     * The status of the scaling plan.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling plan is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or more
     * resources could not be applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationInProgress</code> - The scaling plan is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationFailed</code> - The scaling plan could not be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionInProgress</code> - The scaling plan is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionFailed</code> - The scaling plan could not be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - The scaling plan is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateFailed</code> - The scaling plan could not be updated.
     * </p>
     * </li>
     * </ul>
     */
    private String statusCode;
    /**
     * <p>
     * A simple message about the current status of the scaling plan.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The Unix time stamp when the scaling plan entered the current status.
     * </p>
     */
    private java.util.Date statusStartTime;
    /**
     * <p>
     * The Unix time stamp when the scaling plan was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     * 
     * @param scalingPlanName
     *        The name of the scaling plan.
     */

    public void setScalingPlanName(String scalingPlanName) {
        this.scalingPlanName = scalingPlanName;
    }

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     * 
     * @return The name of the scaling plan.
     */

    public String getScalingPlanName() {
        return this.scalingPlanName;
    }

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     * 
     * @param scalingPlanName
     *        The name of the scaling plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withScalingPlanName(String scalingPlanName) {
        setScalingPlanName(scalingPlanName);
        return this;
    }

    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan.
     */

    public void setScalingPlanVersion(Long scalingPlanVersion) {
        this.scalingPlanVersion = scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     * 
     * @return The version number of the scaling plan.
     */

    public Long getScalingPlanVersion() {
        return this.scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
        return this;
    }

    /**
     * <p>
     * The application source.
     * </p>
     * 
     * @param applicationSource
     *        The application source.
     */

    public void setApplicationSource(ApplicationSource applicationSource) {
        this.applicationSource = applicationSource;
    }

    /**
     * <p>
     * The application source.
     * </p>
     * 
     * @return The application source.
     */

    public ApplicationSource getApplicationSource() {
        return this.applicationSource;
    }

    /**
     * <p>
     * The application source.
     * </p>
     * 
     * @param applicationSource
     *        The application source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withApplicationSource(ApplicationSource applicationSource) {
        setApplicationSource(applicationSource);
        return this;
    }

    /**
     * <p>
     * The scaling instructions.
     * </p>
     * 
     * @return The scaling instructions.
     */

    public java.util.List<ScalingInstruction> getScalingInstructions() {
        return scalingInstructions;
    }

    /**
     * <p>
     * The scaling instructions.
     * </p>
     * 
     * @param scalingInstructions
     *        The scaling instructions.
     */

    public void setScalingInstructions(java.util.Collection<ScalingInstruction> scalingInstructions) {
        if (scalingInstructions == null) {
            this.scalingInstructions = null;
            return;
        }

        this.scalingInstructions = new java.util.ArrayList<ScalingInstruction>(scalingInstructions);
    }

    /**
     * <p>
     * The scaling instructions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingInstructions(java.util.Collection)} or {@link #withScalingInstructions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scalingInstructions
     *        The scaling instructions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withScalingInstructions(ScalingInstruction... scalingInstructions) {
        if (this.scalingInstructions == null) {
            setScalingInstructions(new java.util.ArrayList<ScalingInstruction>(scalingInstructions.length));
        }
        for (ScalingInstruction ele : scalingInstructions) {
            this.scalingInstructions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scaling instructions.
     * </p>
     * 
     * @param scalingInstructions
     *        The scaling instructions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withScalingInstructions(java.util.Collection<ScalingInstruction> scalingInstructions) {
        setScalingInstructions(scalingInstructions);
        return this;
    }

    /**
     * <p>
     * The status of the scaling plan.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling plan is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or more
     * resources could not be applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationInProgress</code> - The scaling plan is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationFailed</code> - The scaling plan could not be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionInProgress</code> - The scaling plan is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionFailed</code> - The scaling plan could not be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - The scaling plan is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateFailed</code> - The scaling plan could not be updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status of the scaling plan.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - The scaling plan is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or
     *        more resources could not be applied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationInProgress</code> - The scaling plan is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationFailed</code> - The scaling plan could not be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletionInProgress</code> - The scaling plan is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletionFailed</code> - The scaling plan could not be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - The scaling plan is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateFailed</code> - The scaling plan could not be updated.
     *        </p>
     *        </li>
     * @see ScalingPlanStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status of the scaling plan.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling plan is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or more
     * resources could not be applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationInProgress</code> - The scaling plan is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationFailed</code> - The scaling plan could not be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionInProgress</code> - The scaling plan is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionFailed</code> - The scaling plan could not be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - The scaling plan is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateFailed</code> - The scaling plan could not be updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the scaling plan.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code> - The scaling plan is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or
     *         more resources could not be applied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreationInProgress</code> - The scaling plan is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreationFailed</code> - The scaling plan could not be created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeletionInProgress</code> - The scaling plan is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DeletionFailed</code> - The scaling plan could not be deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UpdateInProgress</code> - The scaling plan is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UpdateFailed</code> - The scaling plan could not be updated.
     *         </p>
     *         </li>
     * @see ScalingPlanStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status of the scaling plan.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling plan is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or more
     * resources could not be applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationInProgress</code> - The scaling plan is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationFailed</code> - The scaling plan could not be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionInProgress</code> - The scaling plan is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionFailed</code> - The scaling plan could not be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - The scaling plan is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateFailed</code> - The scaling plan could not be updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status of the scaling plan.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - The scaling plan is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or
     *        more resources could not be applied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationInProgress</code> - The scaling plan is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationFailed</code> - The scaling plan could not be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletionInProgress</code> - The scaling plan is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletionFailed</code> - The scaling plan could not be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - The scaling plan is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateFailed</code> - The scaling plan could not be updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingPlanStatusCode
     */

    public ScalingPlan withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status of the scaling plan.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling plan is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or more
     * resources could not be applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationInProgress</code> - The scaling plan is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationFailed</code> - The scaling plan could not be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionInProgress</code> - The scaling plan is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeletionFailed</code> - The scaling plan could not be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateInProgress</code> - The scaling plan is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UpdateFailed</code> - The scaling plan could not be updated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status of the scaling plan.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - The scaling plan is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ActiveWithProblems</code> - The scaling plan is active, but the scaling configuration for one or
     *        more resources could not be applied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationInProgress</code> - The scaling plan is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CreationFailed</code> - The scaling plan could not be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletionInProgress</code> - The scaling plan is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DeletionFailed</code> - The scaling plan could not be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateInProgress</code> - The scaling plan is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UpdateFailed</code> - The scaling plan could not be updated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingPlanStatusCode
     */

    public ScalingPlan withStatusCode(ScalingPlanStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A simple message about the current status of the scaling plan.
     * </p>
     * 
     * @param statusMessage
     *        A simple message about the current status of the scaling plan.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A simple message about the current status of the scaling plan.
     * </p>
     * 
     * @return A simple message about the current status of the scaling plan.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A simple message about the current status of the scaling plan.
     * </p>
     * 
     * @param statusMessage
     *        A simple message about the current status of the scaling plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The Unix time stamp when the scaling plan entered the current status.
     * </p>
     * 
     * @param statusStartTime
     *        The Unix time stamp when the scaling plan entered the current status.
     */

    public void setStatusStartTime(java.util.Date statusStartTime) {
        this.statusStartTime = statusStartTime;
    }

    /**
     * <p>
     * The Unix time stamp when the scaling plan entered the current status.
     * </p>
     * 
     * @return The Unix time stamp when the scaling plan entered the current status.
     */

    public java.util.Date getStatusStartTime() {
        return this.statusStartTime;
    }

    /**
     * <p>
     * The Unix time stamp when the scaling plan entered the current status.
     * </p>
     * 
     * @param statusStartTime
     *        The Unix time stamp when the scaling plan entered the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withStatusStartTime(java.util.Date statusStartTime) {
        setStatusStartTime(statusStartTime);
        return this;
    }

    /**
     * <p>
     * The Unix time stamp when the scaling plan was created.
     * </p>
     * 
     * @param creationTime
     *        The Unix time stamp when the scaling plan was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The Unix time stamp when the scaling plan was created.
     * </p>
     * 
     * @return The Unix time stamp when the scaling plan was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The Unix time stamp when the scaling plan was created.
     * </p>
     * 
     * @param creationTime
     *        The Unix time stamp when the scaling plan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlan withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getScalingPlanName() != null)
            sb.append("ScalingPlanName: ").append(getScalingPlanName()).append(",");
        if (getScalingPlanVersion() != null)
            sb.append("ScalingPlanVersion: ").append(getScalingPlanVersion()).append(",");
        if (getApplicationSource() != null)
            sb.append("ApplicationSource: ").append(getApplicationSource()).append(",");
        if (getScalingInstructions() != null)
            sb.append("ScalingInstructions: ").append(getScalingInstructions()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStatusStartTime() != null)
            sb.append("StatusStartTime: ").append(getStatusStartTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPlan == false)
            return false;
        ScalingPlan other = (ScalingPlan) obj;
        if (other.getScalingPlanName() == null ^ this.getScalingPlanName() == null)
            return false;
        if (other.getScalingPlanName() != null && other.getScalingPlanName().equals(this.getScalingPlanName()) == false)
            return false;
        if (other.getScalingPlanVersion() == null ^ this.getScalingPlanVersion() == null)
            return false;
        if (other.getScalingPlanVersion() != null && other.getScalingPlanVersion().equals(this.getScalingPlanVersion()) == false)
            return false;
        if (other.getApplicationSource() == null ^ this.getApplicationSource() == null)
            return false;
        if (other.getApplicationSource() != null && other.getApplicationSource().equals(this.getApplicationSource()) == false)
            return false;
        if (other.getScalingInstructions() == null ^ this.getScalingInstructions() == null)
            return false;
        if (other.getScalingInstructions() != null && other.getScalingInstructions().equals(this.getScalingInstructions()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatusStartTime() == null ^ this.getStatusStartTime() == null)
            return false;
        if (other.getStatusStartTime() != null && other.getStatusStartTime().equals(this.getStatusStartTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingPlanName() == null) ? 0 : getScalingPlanName().hashCode());
        hashCode = prime * hashCode + ((getScalingPlanVersion() == null) ? 0 : getScalingPlanVersion().hashCode());
        hashCode = prime * hashCode + ((getApplicationSource() == null) ? 0 : getApplicationSource().hashCode());
        hashCode = prime * hashCode + ((getScalingInstructions() == null) ? 0 : getScalingInstructions().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusStartTime() == null) ? 0 : getStatusStartTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPlan clone() {
        try {
            return (ScalingPlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingPlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
