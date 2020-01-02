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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the steps for a Candidate, and what step it is working on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLCandidateStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLCandidateStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the Candidate is at the transform, training, or processing step.
     * </p>
     */
    private String candidateStepType;
    /**
     * <p>
     * The ARN for the Candidate's step.
     * </p>
     */
    private String candidateStepArn;
    /**
     * <p>
     * The name for the Candidate's step.
     * </p>
     */
    private String candidateStepName;

    /**
     * <p>
     * Whether the Candidate is at the transform, training, or processing step.
     * </p>
     * 
     * @param candidateStepType
     *        Whether the Candidate is at the transform, training, or processing step.
     * @see CandidateStepType
     */

    public void setCandidateStepType(String candidateStepType) {
        this.candidateStepType = candidateStepType;
    }

    /**
     * <p>
     * Whether the Candidate is at the transform, training, or processing step.
     * </p>
     * 
     * @return Whether the Candidate is at the transform, training, or processing step.
     * @see CandidateStepType
     */

    public String getCandidateStepType() {
        return this.candidateStepType;
    }

    /**
     * <p>
     * Whether the Candidate is at the transform, training, or processing step.
     * </p>
     * 
     * @param candidateStepType
     *        Whether the Candidate is at the transform, training, or processing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateStepType
     */

    public AutoMLCandidateStep withCandidateStepType(String candidateStepType) {
        setCandidateStepType(candidateStepType);
        return this;
    }

    /**
     * <p>
     * Whether the Candidate is at the transform, training, or processing step.
     * </p>
     * 
     * @param candidateStepType
     *        Whether the Candidate is at the transform, training, or processing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateStepType
     */

    public AutoMLCandidateStep withCandidateStepType(CandidateStepType candidateStepType) {
        this.candidateStepType = candidateStepType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN for the Candidate's step.
     * </p>
     * 
     * @param candidateStepArn
     *        The ARN for the Candidate's step.
     */

    public void setCandidateStepArn(String candidateStepArn) {
        this.candidateStepArn = candidateStepArn;
    }

    /**
     * <p>
     * The ARN for the Candidate's step.
     * </p>
     * 
     * @return The ARN for the Candidate's step.
     */

    public String getCandidateStepArn() {
        return this.candidateStepArn;
    }

    /**
     * <p>
     * The ARN for the Candidate's step.
     * </p>
     * 
     * @param candidateStepArn
     *        The ARN for the Candidate's step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateStep withCandidateStepArn(String candidateStepArn) {
        setCandidateStepArn(candidateStepArn);
        return this;
    }

    /**
     * <p>
     * The name for the Candidate's step.
     * </p>
     * 
     * @param candidateStepName
     *        The name for the Candidate's step.
     */

    public void setCandidateStepName(String candidateStepName) {
        this.candidateStepName = candidateStepName;
    }

    /**
     * <p>
     * The name for the Candidate's step.
     * </p>
     * 
     * @return The name for the Candidate's step.
     */

    public String getCandidateStepName() {
        return this.candidateStepName;
    }

    /**
     * <p>
     * The name for the Candidate's step.
     * </p>
     * 
     * @param candidateStepName
     *        The name for the Candidate's step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidateStep withCandidateStepName(String candidateStepName) {
        setCandidateStepName(candidateStepName);
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
        if (getCandidateStepType() != null)
            sb.append("CandidateStepType: ").append(getCandidateStepType()).append(",");
        if (getCandidateStepArn() != null)
            sb.append("CandidateStepArn: ").append(getCandidateStepArn()).append(",");
        if (getCandidateStepName() != null)
            sb.append("CandidateStepName: ").append(getCandidateStepName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLCandidateStep == false)
            return false;
        AutoMLCandidateStep other = (AutoMLCandidateStep) obj;
        if (other.getCandidateStepType() == null ^ this.getCandidateStepType() == null)
            return false;
        if (other.getCandidateStepType() != null && other.getCandidateStepType().equals(this.getCandidateStepType()) == false)
            return false;
        if (other.getCandidateStepArn() == null ^ this.getCandidateStepArn() == null)
            return false;
        if (other.getCandidateStepArn() != null && other.getCandidateStepArn().equals(this.getCandidateStepArn()) == false)
            return false;
        if (other.getCandidateStepName() == null ^ this.getCandidateStepName() == null)
            return false;
        if (other.getCandidateStepName() != null && other.getCandidateStepName().equals(this.getCandidateStepName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCandidateStepType() == null) ? 0 : getCandidateStepType().hashCode());
        hashCode = prime * hashCode + ((getCandidateStepArn() == null) ? 0 : getCandidateStepArn().hashCode());
        hashCode = prime * hashCode + ((getCandidateStepName() == null) ? 0 : getCandidateStepName().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLCandidateStep clone() {
        try {
            return (AutoMLCandidateStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLCandidateStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
