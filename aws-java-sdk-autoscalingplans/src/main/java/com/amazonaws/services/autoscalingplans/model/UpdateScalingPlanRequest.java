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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/UpdateScalingPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScalingPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A CloudFormation stack or set of tags.
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

    public UpdateScalingPlanRequest withScalingPlanName(String scalingPlanName) {
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

    public UpdateScalingPlanRequest withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
        return this;
    }

    /**
     * <p>
     * A CloudFormation stack or set of tags.
     * </p>
     * 
     * @param applicationSource
     *        A CloudFormation stack or set of tags.
     */

    public void setApplicationSource(ApplicationSource applicationSource) {
        this.applicationSource = applicationSource;
    }

    /**
     * <p>
     * A CloudFormation stack or set of tags.
     * </p>
     * 
     * @return A CloudFormation stack or set of tags.
     */

    public ApplicationSource getApplicationSource() {
        return this.applicationSource;
    }

    /**
     * <p>
     * A CloudFormation stack or set of tags.
     * </p>
     * 
     * @param applicationSource
     *        A CloudFormation stack or set of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScalingPlanRequest withApplicationSource(ApplicationSource applicationSource) {
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

    public UpdateScalingPlanRequest withScalingInstructions(ScalingInstruction... scalingInstructions) {
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

    public UpdateScalingPlanRequest withScalingInstructions(java.util.Collection<ScalingInstruction> scalingInstructions) {
        setScalingInstructions(scalingInstructions);
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
            sb.append("ScalingInstructions: ").append(getScalingInstructions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScalingPlanRequest == false)
            return false;
        UpdateScalingPlanRequest other = (UpdateScalingPlanRequest) obj;
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
        return hashCode;
    }

    @Override
    public UpdateScalingPlanRequest clone() {
        return (UpdateScalingPlanRequest) super.clone();
    }

}
