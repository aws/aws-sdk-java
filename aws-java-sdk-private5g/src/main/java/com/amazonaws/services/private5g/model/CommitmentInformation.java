/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Shows the duration, the date and time that the contract started and ends, and the renewal status of the commitment
 * period for the radio unit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CommitmentInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitmentInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration and renewal status of the commitment period for the radio unit.
     * </p>
     */
    private CommitmentConfiguration commitmentConfiguration;
    /**
     * <p>
     * The date and time that the commitment period ends. If you do not cancel or renew the commitment before the
     * expiration date, you will be billed at the 60-day-commitment rate.
     * </p>
     */
    private java.util.Date expiresOn;
    /**
     * <p>
     * The date and time that the commitment period started.
     * </p>
     */
    private java.util.Date startAt;

    /**
     * <p>
     * The duration and renewal status of the commitment period for the radio unit.
     * </p>
     * 
     * @param commitmentConfiguration
     *        The duration and renewal status of the commitment period for the radio unit.
     */

    public void setCommitmentConfiguration(CommitmentConfiguration commitmentConfiguration) {
        this.commitmentConfiguration = commitmentConfiguration;
    }

    /**
     * <p>
     * The duration and renewal status of the commitment period for the radio unit.
     * </p>
     * 
     * @return The duration and renewal status of the commitment period for the radio unit.
     */

    public CommitmentConfiguration getCommitmentConfiguration() {
        return this.commitmentConfiguration;
    }

    /**
     * <p>
     * The duration and renewal status of the commitment period for the radio unit.
     * </p>
     * 
     * @param commitmentConfiguration
     *        The duration and renewal status of the commitment period for the radio unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitmentInformation withCommitmentConfiguration(CommitmentConfiguration commitmentConfiguration) {
        setCommitmentConfiguration(commitmentConfiguration);
        return this;
    }

    /**
     * <p>
     * The date and time that the commitment period ends. If you do not cancel or renew the commitment before the
     * expiration date, you will be billed at the 60-day-commitment rate.
     * </p>
     * 
     * @param expiresOn
     *        The date and time that the commitment period ends. If you do not cancel or renew the commitment before the
     *        expiration date, you will be billed at the 60-day-commitment rate.
     */

    public void setExpiresOn(java.util.Date expiresOn) {
        this.expiresOn = expiresOn;
    }

    /**
     * <p>
     * The date and time that the commitment period ends. If you do not cancel or renew the commitment before the
     * expiration date, you will be billed at the 60-day-commitment rate.
     * </p>
     * 
     * @return The date and time that the commitment period ends. If you do not cancel or renew the commitment before
     *         the expiration date, you will be billed at the 60-day-commitment rate.
     */

    public java.util.Date getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * <p>
     * The date and time that the commitment period ends. If you do not cancel or renew the commitment before the
     * expiration date, you will be billed at the 60-day-commitment rate.
     * </p>
     * 
     * @param expiresOn
     *        The date and time that the commitment period ends. If you do not cancel or renew the commitment before the
     *        expiration date, you will be billed at the 60-day-commitment rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitmentInformation withExpiresOn(java.util.Date expiresOn) {
        setExpiresOn(expiresOn);
        return this;
    }

    /**
     * <p>
     * The date and time that the commitment period started.
     * </p>
     * 
     * @param startAt
     *        The date and time that the commitment period started.
     */

    public void setStartAt(java.util.Date startAt) {
        this.startAt = startAt;
    }

    /**
     * <p>
     * The date and time that the commitment period started.
     * </p>
     * 
     * @return The date and time that the commitment period started.
     */

    public java.util.Date getStartAt() {
        return this.startAt;
    }

    /**
     * <p>
     * The date and time that the commitment period started.
     * </p>
     * 
     * @param startAt
     *        The date and time that the commitment period started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitmentInformation withStartAt(java.util.Date startAt) {
        setStartAt(startAt);
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
        if (getCommitmentConfiguration() != null)
            sb.append("CommitmentConfiguration: ").append(getCommitmentConfiguration()).append(",");
        if (getExpiresOn() != null)
            sb.append("ExpiresOn: ").append(getExpiresOn()).append(",");
        if (getStartAt() != null)
            sb.append("StartAt: ").append(getStartAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitmentInformation == false)
            return false;
        CommitmentInformation other = (CommitmentInformation) obj;
        if (other.getCommitmentConfiguration() == null ^ this.getCommitmentConfiguration() == null)
            return false;
        if (other.getCommitmentConfiguration() != null && other.getCommitmentConfiguration().equals(this.getCommitmentConfiguration()) == false)
            return false;
        if (other.getExpiresOn() == null ^ this.getExpiresOn() == null)
            return false;
        if (other.getExpiresOn() != null && other.getExpiresOn().equals(this.getExpiresOn()) == false)
            return false;
        if (other.getStartAt() == null ^ this.getStartAt() == null)
            return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitmentConfiguration() == null) ? 0 : getCommitmentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getExpiresOn() == null) ? 0 : getExpiresOn().hashCode());
        hashCode = prime * hashCode + ((getStartAt() == null) ? 0 : getStartAt().hashCode());
        return hashCode;
    }

    @Override
    public CommitmentInformation clone() {
        try {
            return (CommitmentInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.CommitmentInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
