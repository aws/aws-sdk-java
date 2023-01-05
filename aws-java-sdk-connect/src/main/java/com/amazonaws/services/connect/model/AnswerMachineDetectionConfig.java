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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of the answering machine detection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AnswerMachineDetectionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnswerMachineDetectionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set to
     * <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     */
    private Boolean enableAnswerMachineDetection;
    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     */
    private Boolean awaitAnswerMachinePrompt;

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set to
     * <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     * 
     * @param enableAnswerMachineDetection
     *        The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set
     *        to <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     */

    public void setEnableAnswerMachineDetection(Boolean enableAnswerMachineDetection) {
        this.enableAnswerMachineDetection = enableAnswerMachineDetection;
    }

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set to
     * <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     * 
     * @return The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set
     *         to <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     */

    public Boolean getEnableAnswerMachineDetection() {
        return this.enableAnswerMachineDetection;
    }

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set to
     * <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     * 
     * @param enableAnswerMachineDetection
     *        The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set
     *        to <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerMachineDetectionConfig withEnableAnswerMachineDetection(Boolean enableAnswerMachineDetection) {
        setEnableAnswerMachineDetection(enableAnswerMachineDetection);
        return this;
    }

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set to
     * <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     * 
     * @return The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set
     *         to <code>true</code>, <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     */

    public Boolean isEnableAnswerMachineDetection() {
        return this.enableAnswerMachineDetection;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     * 
     * @param awaitAnswerMachinePrompt
     *        Wait for the answering machine prompt.
     */

    public void setAwaitAnswerMachinePrompt(Boolean awaitAnswerMachinePrompt) {
        this.awaitAnswerMachinePrompt = awaitAnswerMachinePrompt;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     * 
     * @return Wait for the answering machine prompt.
     */

    public Boolean getAwaitAnswerMachinePrompt() {
        return this.awaitAnswerMachinePrompt;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     * 
     * @param awaitAnswerMachinePrompt
     *        Wait for the answering machine prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerMachineDetectionConfig withAwaitAnswerMachinePrompt(Boolean awaitAnswerMachinePrompt) {
        setAwaitAnswerMachinePrompt(awaitAnswerMachinePrompt);
        return this;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     * 
     * @return Wait for the answering machine prompt.
     */

    public Boolean isAwaitAnswerMachinePrompt() {
        return this.awaitAnswerMachinePrompt;
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
        if (getEnableAnswerMachineDetection() != null)
            sb.append("EnableAnswerMachineDetection: ").append(getEnableAnswerMachineDetection()).append(",");
        if (getAwaitAnswerMachinePrompt() != null)
            sb.append("AwaitAnswerMachinePrompt: ").append(getAwaitAnswerMachinePrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnswerMachineDetectionConfig == false)
            return false;
        AnswerMachineDetectionConfig other = (AnswerMachineDetectionConfig) obj;
        if (other.getEnableAnswerMachineDetection() == null ^ this.getEnableAnswerMachineDetection() == null)
            return false;
        if (other.getEnableAnswerMachineDetection() != null && other.getEnableAnswerMachineDetection().equals(this.getEnableAnswerMachineDetection()) == false)
            return false;
        if (other.getAwaitAnswerMachinePrompt() == null ^ this.getAwaitAnswerMachinePrompt() == null)
            return false;
        if (other.getAwaitAnswerMachinePrompt() != null && other.getAwaitAnswerMachinePrompt().equals(this.getAwaitAnswerMachinePrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableAnswerMachineDetection() == null) ? 0 : getEnableAnswerMachineDetection().hashCode());
        hashCode = prime * hashCode + ((getAwaitAnswerMachinePrompt() == null) ? 0 : getAwaitAnswerMachinePrompt().hashCode());
        return hashCode;
    }

    @Override
    public AnswerMachineDetectionConfig clone() {
        try {
            return (AnswerMachineDetectionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AnswerMachineDetectionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
