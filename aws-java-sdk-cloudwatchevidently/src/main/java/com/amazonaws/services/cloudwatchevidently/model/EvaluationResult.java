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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure displays the results of one feature evaluation assignment to one user session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluationResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     * </p>
     */
    private String details;
    /**
     * <p>
     * An internal ID that represents a unique user session of the application.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     */
    private String project;
    /**
     * <p>
     * Specifies the reason that the user session was assigned this variation. Possible values include
     * <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>, if the
     * user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session was enrolled in
     * an experiment.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The value assigned to this variation to differentiate it from the other variations of this feature.
     * </p>
     */
    private VariableValue value;
    /**
     * <p>
     * The name of the variation that was served to the user session.
     * </p>
     */
    private String variation;

    /**
     * <p>
     * If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param details
     *        If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param details
     *        If this user was assigned to a launch or experiment, this field lists the launch or experiment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * An internal ID that represents a unique user session of the application.
     * </p>
     * 
     * @param entityId
     *        An internal ID that represents a unique user session of the application.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * An internal ID that represents a unique user session of the application.
     * </p>
     * 
     * @return An internal ID that represents a unique user session of the application.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * An internal ID that represents a unique user session of the application.
     * </p>
     * 
     * @param entityId
     *        An internal ID that represents a unique user session of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     * 
     * @param feature
     *        The name of the feature being evaluated.
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     * 
     * @return The name of the feature being evaluated.
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * The name of the feature being evaluated.
     * </p>
     * 
     * @param feature
     *        The name of the feature being evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature being evaluated.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     * 
     * @return The name or ARN of the project that contains the feature being evaluated.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the feature being evaluated.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the feature being evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * Specifies the reason that the user session was assigned this variation. Possible values include
     * <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>, if the
     * user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session was enrolled in
     * an experiment.
     * </p>
     * 
     * @param reason
     *        Specifies the reason that the user session was assigned this variation. Possible values include
     *        <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>,
     *        if the user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session
     *        was enrolled in an experiment.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Specifies the reason that the user session was assigned this variation. Possible values include
     * <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>, if the
     * user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session was enrolled in
     * an experiment.
     * </p>
     * 
     * @return Specifies the reason that the user session was assigned this variation. Possible values include
     *         <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>,
     *         if the user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session
     *         was enrolled in an experiment.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Specifies the reason that the user session was assigned this variation. Possible values include
     * <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>, if the
     * user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session was enrolled in
     * an experiment.
     * </p>
     * 
     * @param reason
     *        Specifies the reason that the user session was assigned this variation. Possible values include
     *        <code>DEFAULT</code>, meaning the user was served the default variation; <code>LAUNCH_RULE_MATCH</code>,
     *        if the user session was enrolled in a launch; or <code>EXPERIMENT_RULE_MATCH</code>, if the user session
     *        was enrolled in an experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The value assigned to this variation to differentiate it from the other variations of this feature.
     * </p>
     * 
     * @param value
     *        The value assigned to this variation to differentiate it from the other variations of this feature.
     */

    public void setValue(VariableValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value assigned to this variation to differentiate it from the other variations of this feature.
     * </p>
     * 
     * @return The value assigned to this variation to differentiate it from the other variations of this feature.
     */

    public VariableValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value assigned to this variation to differentiate it from the other variations of this feature.
     * </p>
     * 
     * @param value
     *        The value assigned to this variation to differentiate it from the other variations of this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withValue(VariableValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The name of the variation that was served to the user session.
     * </p>
     * 
     * @param variation
     *        The name of the variation that was served to the user session.
     */

    public void setVariation(String variation) {
        this.variation = variation;
    }

    /**
     * <p>
     * The name of the variation that was served to the user session.
     * </p>
     * 
     * @return The name of the variation that was served to the user session.
     */

    public String getVariation() {
        return this.variation;
    }

    /**
     * <p>
     * The name of the variation that was served to the user session.
     * </p>
     * 
     * @param variation
     *        The name of the variation that was served to the user session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withVariation(String variation) {
        setVariation(variation);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getVariation() != null)
            sb.append("Variation: ").append(getVariation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getVariation() == null ^ this.getVariation() == null)
            return false;
        if (other.getVariation() != null && other.getVariation().equals(this.getVariation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getVariation() == null) ? 0 : getVariation().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.EvaluationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
