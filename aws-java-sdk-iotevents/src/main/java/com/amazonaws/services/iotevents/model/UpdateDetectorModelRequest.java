/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateDetectorModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDetectorModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the detector model that is updated.
     * </p>
     */
    private String detectorModelName;
    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     */
    private DetectorModelDefinition detectorModelDefinition;
    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     */
    private String detectorModelDescription;
    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     */
    private String evaluationMethod;

    /**
     * <p>
     * The name of the detector model that is updated.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model that is updated.
     */

    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model that is updated.
     * </p>
     * 
     * @return The name of the detector model that is updated.
     */

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model that is updated.
     * </p>
     * 
     * @param detectorModelName
     *        The name of the detector model that is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorModelRequest withDetectorModelName(String detectorModelName) {
        setDetectorModelName(detectorModelName);
        return this;
    }

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     * 
     * @param detectorModelDefinition
     *        Information that defines how a detector operates.
     */

    public void setDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        this.detectorModelDefinition = detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     * 
     * @return Information that defines how a detector operates.
     */

    public DetectorModelDefinition getDetectorModelDefinition() {
        return this.detectorModelDefinition;
    }

    /**
     * <p>
     * Information that defines how a detector operates.
     * </p>
     * 
     * @param detectorModelDefinition
     *        Information that defines how a detector operates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorModelRequest withDetectorModelDefinition(DetectorModelDefinition detectorModelDefinition) {
        setDetectorModelDefinition(detectorModelDefinition);
        return this;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @param detectorModelDescription
     *        A brief description of the detector model.
     */

    public void setDetectorModelDescription(String detectorModelDescription) {
        this.detectorModelDescription = detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @return A brief description of the detector model.
     */

    public String getDetectorModelDescription() {
        return this.detectorModelDescription;
    }

    /**
     * <p>
     * A brief description of the detector model.
     * </p>
     * 
     * @param detectorModelDescription
     *        A brief description of the detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorModelRequest withDetectorModelDescription(String detectorModelDescription) {
        setDetectorModelDescription(detectorModelDescription);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     * 
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDetectorModelRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @param evaluationMethod
     *        Information about the order in which events are evaluated and how actions are executed.
     * @see EvaluationMethod
     */

    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @return Information about the order in which events are evaluated and how actions are executed.
     * @see EvaluationMethod
     */

    public String getEvaluationMethod() {
        return this.evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @param evaluationMethod
     *        Information about the order in which events are evaluated and how actions are executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMethod
     */

    public UpdateDetectorModelRequest withEvaluationMethod(String evaluationMethod) {
        setEvaluationMethod(evaluationMethod);
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions are executed.
     * </p>
     * 
     * @param evaluationMethod
     *        Information about the order in which events are evaluated and how actions are executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMethod
     */

    public UpdateDetectorModelRequest withEvaluationMethod(EvaluationMethod evaluationMethod) {
        this.evaluationMethod = evaluationMethod.toString();
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
        if (getDetectorModelName() != null)
            sb.append("DetectorModelName: ").append(getDetectorModelName()).append(",");
        if (getDetectorModelDefinition() != null)
            sb.append("DetectorModelDefinition: ").append(getDetectorModelDefinition()).append(",");
        if (getDetectorModelDescription() != null)
            sb.append("DetectorModelDescription: ").append(getDetectorModelDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEvaluationMethod() != null)
            sb.append("EvaluationMethod: ").append(getEvaluationMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorModelRequest == false)
            return false;
        UpdateDetectorModelRequest other = (UpdateDetectorModelRequest) obj;
        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelDefinition() == null ^ this.getDetectorModelDefinition() == null)
            return false;
        if (other.getDetectorModelDefinition() != null && other.getDetectorModelDefinition().equals(this.getDetectorModelDefinition()) == false)
            return false;
        if (other.getDetectorModelDescription() == null ^ this.getDetectorModelDescription() == null)
            return false;
        if (other.getDetectorModelDescription() != null && other.getDetectorModelDescription().equals(this.getDetectorModelDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEvaluationMethod() == null ^ this.getEvaluationMethod() == null)
            return false;
        if (other.getEvaluationMethod() != null && other.getEvaluationMethod().equals(this.getEvaluationMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelDefinition() == null) ? 0 : getDetectorModelDefinition().hashCode());
        hashCode = prime * hashCode + ((getDetectorModelDescription() == null) ? 0 : getDetectorModelDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMethod() == null) ? 0 : getEvaluationMethod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDetectorModelRequest clone() {
        return (UpdateDetectorModelRequest) super.clone();
    }

}
