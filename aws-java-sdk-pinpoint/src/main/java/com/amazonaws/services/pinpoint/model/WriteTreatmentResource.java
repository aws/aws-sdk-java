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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Used to create a campaign treatment.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/WriteTreatmentResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteTreatmentResource implements Serializable, Cloneable, StructuredPojo {

    /** The message configuration settings. */
    private MessageConfiguration messageConfiguration;
    /** The campaign schedule. */
    private Schedule schedule;
    /** The allocated percentage of users for this treatment. */
    private Integer sizePercent;
    /** A custom description for the treatment. */
    private String treatmentDescription;
    /** The custom name of a variation of the campaign used for A/B testing. */
    private String treatmentName;

    /**
     * The message configuration settings.
     * 
     * @param messageConfiguration
     *        The message configuration settings.
     */

    public void setMessageConfiguration(MessageConfiguration messageConfiguration) {
        this.messageConfiguration = messageConfiguration;
    }

    /**
     * The message configuration settings.
     * 
     * @return The message configuration settings.
     */

    public MessageConfiguration getMessageConfiguration() {
        return this.messageConfiguration;
    }

    /**
     * The message configuration settings.
     * 
     * @param messageConfiguration
     *        The message configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withMessageConfiguration(MessageConfiguration messageConfiguration) {
        setMessageConfiguration(messageConfiguration);
        return this;
    }

    /**
     * The campaign schedule.
     * 
     * @param schedule
     *        The campaign schedule.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * The campaign schedule.
     * 
     * @return The campaign schedule.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * The campaign schedule.
     * 
     * @param schedule
     *        The campaign schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * The allocated percentage of users for this treatment.
     * 
     * @param sizePercent
     *        The allocated percentage of users for this treatment.
     */

    public void setSizePercent(Integer sizePercent) {
        this.sizePercent = sizePercent;
    }

    /**
     * The allocated percentage of users for this treatment.
     * 
     * @return The allocated percentage of users for this treatment.
     */

    public Integer getSizePercent() {
        return this.sizePercent;
    }

    /**
     * The allocated percentage of users for this treatment.
     * 
     * @param sizePercent
     *        The allocated percentage of users for this treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withSizePercent(Integer sizePercent) {
        setSizePercent(sizePercent);
        return this;
    }

    /**
     * A custom description for the treatment.
     * 
     * @param treatmentDescription
     *        A custom description for the treatment.
     */

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     * 
     * @return A custom description for the treatment.
     */

    public String getTreatmentDescription() {
        return this.treatmentDescription;
    }

    /**
     * A custom description for the treatment.
     * 
     * @param treatmentDescription
     *        A custom description for the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withTreatmentDescription(String treatmentDescription) {
        setTreatmentDescription(treatmentDescription);
        return this;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign used for A/B testing.
     */

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * 
     * @return The custom name of a variation of the campaign used for A/B testing.
     */

    public String getTreatmentName() {
        return this.treatmentName;
    }

    /**
     * The custom name of a variation of the campaign used for A/B testing.
     * 
     * @param treatmentName
     *        The custom name of a variation of the campaign used for A/B testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteTreatmentResource withTreatmentName(String treatmentName) {
        setTreatmentName(treatmentName);
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
        if (getMessageConfiguration() != null)
            sb.append("MessageConfiguration: ").append(getMessageConfiguration()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSizePercent() != null)
            sb.append("SizePercent: ").append(getSizePercent()).append(",");
        if (getTreatmentDescription() != null)
            sb.append("TreatmentDescription: ").append(getTreatmentDescription()).append(",");
        if (getTreatmentName() != null)
            sb.append("TreatmentName: ").append(getTreatmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteTreatmentResource == false)
            return false;
        WriteTreatmentResource other = (WriteTreatmentResource) obj;
        if (other.getMessageConfiguration() == null ^ this.getMessageConfiguration() == null)
            return false;
        if (other.getMessageConfiguration() != null && other.getMessageConfiguration().equals(this.getMessageConfiguration()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSizePercent() == null ^ this.getSizePercent() == null)
            return false;
        if (other.getSizePercent() != null && other.getSizePercent().equals(this.getSizePercent()) == false)
            return false;
        if (other.getTreatmentDescription() == null ^ this.getTreatmentDescription() == null)
            return false;
        if (other.getTreatmentDescription() != null && other.getTreatmentDescription().equals(this.getTreatmentDescription()) == false)
            return false;
        if (other.getTreatmentName() == null ^ this.getTreatmentName() == null)
            return false;
        if (other.getTreatmentName() != null && other.getTreatmentName().equals(this.getTreatmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageConfiguration() == null) ? 0 : getMessageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSizePercent() == null) ? 0 : getSizePercent().hashCode());
        hashCode = prime * hashCode + ((getTreatmentDescription() == null) ? 0 : getTreatmentDescription().hashCode());
        hashCode = prime * hashCode + ((getTreatmentName() == null) ? 0 : getTreatmentName().hashCode());
        return hashCode;
    }

    @Override
    public WriteTreatmentResource clone() {
        try {
            return (WriteTreatmentResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.WriteTreatmentResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
