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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configurations defining enrollment behavior for the batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/EnrollmentConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnrollmentConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to take when the specified speaker is already enrolled in the specified domain. The default value is
     * <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     * <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker with new
     * data generated from the latest audio.
     * </p>
     */
    private String existingEnrollmentAction;
    /**
     * <p>
     * The fraud detection configuration to use for the speaker enrollment job.
     * </p>
     */
    private EnrollmentJobFraudDetectionConfig fraudDetectionConfig;

    /**
     * <p>
     * The action to take when the specified speaker is already enrolled in the specified domain. The default value is
     * <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     * <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker with new
     * data generated from the latest audio.
     * </p>
     * 
     * @param existingEnrollmentAction
     *        The action to take when the specified speaker is already enrolled in the specified domain. The default
     *        value is <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     *        <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker
     *        with new data generated from the latest audio.
     * @see ExistingEnrollmentAction
     */

    public void setExistingEnrollmentAction(String existingEnrollmentAction) {
        this.existingEnrollmentAction = existingEnrollmentAction;
    }

    /**
     * <p>
     * The action to take when the specified speaker is already enrolled in the specified domain. The default value is
     * <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     * <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker with new
     * data generated from the latest audio.
     * </p>
     * 
     * @return The action to take when the specified speaker is already enrolled in the specified domain. The default
     *         value is <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     *         <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker
     *         with new data generated from the latest audio.
     * @see ExistingEnrollmentAction
     */

    public String getExistingEnrollmentAction() {
        return this.existingEnrollmentAction;
    }

    /**
     * <p>
     * The action to take when the specified speaker is already enrolled in the specified domain. The default value is
     * <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     * <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker with new
     * data generated from the latest audio.
     * </p>
     * 
     * @param existingEnrollmentAction
     *        The action to take when the specified speaker is already enrolled in the specified domain. The default
     *        value is <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     *        <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker
     *        with new data generated from the latest audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExistingEnrollmentAction
     */

    public EnrollmentConfig withExistingEnrollmentAction(String existingEnrollmentAction) {
        setExistingEnrollmentAction(existingEnrollmentAction);
        return this;
    }

    /**
     * <p>
     * The action to take when the specified speaker is already enrolled in the specified domain. The default value is
     * <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     * <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker with new
     * data generated from the latest audio.
     * </p>
     * 
     * @param existingEnrollmentAction
     *        The action to take when the specified speaker is already enrolled in the specified domain. The default
     *        value is <code>SKIP</code>, which skips the enrollment for the existing speaker. Setting the value to
     *        <code>OVERWRITE</code> replaces the existing voice prints and enrollment audio stored for that speaker
     *        with new data generated from the latest audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExistingEnrollmentAction
     */

    public EnrollmentConfig withExistingEnrollmentAction(ExistingEnrollmentAction existingEnrollmentAction) {
        this.existingEnrollmentAction = existingEnrollmentAction.toString();
        return this;
    }

    /**
     * <p>
     * The fraud detection configuration to use for the speaker enrollment job.
     * </p>
     * 
     * @param fraudDetectionConfig
     *        The fraud detection configuration to use for the speaker enrollment job.
     */

    public void setFraudDetectionConfig(EnrollmentJobFraudDetectionConfig fraudDetectionConfig) {
        this.fraudDetectionConfig = fraudDetectionConfig;
    }

    /**
     * <p>
     * The fraud detection configuration to use for the speaker enrollment job.
     * </p>
     * 
     * @return The fraud detection configuration to use for the speaker enrollment job.
     */

    public EnrollmentJobFraudDetectionConfig getFraudDetectionConfig() {
        return this.fraudDetectionConfig;
    }

    /**
     * <p>
     * The fraud detection configuration to use for the speaker enrollment job.
     * </p>
     * 
     * @param fraudDetectionConfig
     *        The fraud detection configuration to use for the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnrollmentConfig withFraudDetectionConfig(EnrollmentJobFraudDetectionConfig fraudDetectionConfig) {
        setFraudDetectionConfig(fraudDetectionConfig);
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
        if (getExistingEnrollmentAction() != null)
            sb.append("ExistingEnrollmentAction: ").append(getExistingEnrollmentAction()).append(",");
        if (getFraudDetectionConfig() != null)
            sb.append("FraudDetectionConfig: ").append(getFraudDetectionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnrollmentConfig == false)
            return false;
        EnrollmentConfig other = (EnrollmentConfig) obj;
        if (other.getExistingEnrollmentAction() == null ^ this.getExistingEnrollmentAction() == null)
            return false;
        if (other.getExistingEnrollmentAction() != null && other.getExistingEnrollmentAction().equals(this.getExistingEnrollmentAction()) == false)
            return false;
        if (other.getFraudDetectionConfig() == null ^ this.getFraudDetectionConfig() == null)
            return false;
        if (other.getFraudDetectionConfig() != null && other.getFraudDetectionConfig().equals(this.getFraudDetectionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExistingEnrollmentAction() == null) ? 0 : getExistingEnrollmentAction().hashCode());
        hashCode = prime * hashCode + ((getFraudDetectionConfig() == null) ? 0 : getFraudDetectionConfig().hashCode());
        return hashCode;
    }

    @Override
    public EnrollmentConfig clone() {
        try {
            return (EnrollmentConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.EnrollmentConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
