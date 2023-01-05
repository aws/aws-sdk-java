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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Answering Machine Detection config
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/AnswerMachineDetectionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnswerMachineDetectionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enable or disable answering machine detection
     * </p>
     */
    private Boolean enableAnswerMachineDetection;

    /**
     * <p>
     * Enable or disable answering machine detection
     * </p>
     * 
     * @param enableAnswerMachineDetection
     *        Enable or disable answering machine detection
     */

    public void setEnableAnswerMachineDetection(Boolean enableAnswerMachineDetection) {
        this.enableAnswerMachineDetection = enableAnswerMachineDetection;
    }

    /**
     * <p>
     * Enable or disable answering machine detection
     * </p>
     * 
     * @return Enable or disable answering machine detection
     */

    public Boolean getEnableAnswerMachineDetection() {
        return this.enableAnswerMachineDetection;
    }

    /**
     * <p>
     * Enable or disable answering machine detection
     * </p>
     * 
     * @param enableAnswerMachineDetection
     *        Enable or disable answering machine detection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnswerMachineDetectionConfig withEnableAnswerMachineDetection(Boolean enableAnswerMachineDetection) {
        setEnableAnswerMachineDetection(enableAnswerMachineDetection);
        return this;
    }

    /**
     * <p>
     * Enable or disable answering machine detection
     * </p>
     * 
     * @return Enable or disable answering machine detection
     */

    public Boolean isEnableAnswerMachineDetection() {
        return this.enableAnswerMachineDetection;
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
            sb.append("EnableAnswerMachineDetection: ").append(getEnableAnswerMachineDetection());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableAnswerMachineDetection() == null) ? 0 : getEnableAnswerMachineDetection().hashCode());
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
        com.amazonaws.services.connectcampaign.model.transform.AnswerMachineDetectionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
