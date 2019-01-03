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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about email that was sent from the selected domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/OverallVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverallVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk
     * mail folders.
     * </p>
     */
    private VolumeStatistics volumeStatistics;
    /**
     * <p>
     * The percentage of emails that were sent from the domain that were read by their recipients.
     * </p>
     */
    private Double readRatePercent;
    /**
     * <p>
     * An object that contains inbox and junk mail placement metrics for individual email providers.
     * </p>
     */
    private java.util.List<DomainIspPlacement> domainIspPlacements;

    /**
     * <p>
     * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk
     * mail folders.
     * </p>
     * 
     * @param volumeStatistics
     *        An object that contains information about the numbers of messages that arrived in recipients' inboxes and
     *        junk mail folders.
     */

    public void setVolumeStatistics(VolumeStatistics volumeStatistics) {
        this.volumeStatistics = volumeStatistics;
    }

    /**
     * <p>
     * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk
     * mail folders.
     * </p>
     * 
     * @return An object that contains information about the numbers of messages that arrived in recipients' inboxes and
     *         junk mail folders.
     */

    public VolumeStatistics getVolumeStatistics() {
        return this.volumeStatistics;
    }

    /**
     * <p>
     * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk
     * mail folders.
     * </p>
     * 
     * @param volumeStatistics
     *        An object that contains information about the numbers of messages that arrived in recipients' inboxes and
     *        junk mail folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallVolume withVolumeStatistics(VolumeStatistics volumeStatistics) {
        setVolumeStatistics(volumeStatistics);
        return this;
    }

    /**
     * <p>
     * The percentage of emails that were sent from the domain that were read by their recipients.
     * </p>
     * 
     * @param readRatePercent
     *        The percentage of emails that were sent from the domain that were read by their recipients.
     */

    public void setReadRatePercent(Double readRatePercent) {
        this.readRatePercent = readRatePercent;
    }

    /**
     * <p>
     * The percentage of emails that were sent from the domain that were read by their recipients.
     * </p>
     * 
     * @return The percentage of emails that were sent from the domain that were read by their recipients.
     */

    public Double getReadRatePercent() {
        return this.readRatePercent;
    }

    /**
     * <p>
     * The percentage of emails that were sent from the domain that were read by their recipients.
     * </p>
     * 
     * @param readRatePercent
     *        The percentage of emails that were sent from the domain that were read by their recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallVolume withReadRatePercent(Double readRatePercent) {
        setReadRatePercent(readRatePercent);
        return this;
    }

    /**
     * <p>
     * An object that contains inbox and junk mail placement metrics for individual email providers.
     * </p>
     * 
     * @return An object that contains inbox and junk mail placement metrics for individual email providers.
     */

    public java.util.List<DomainIspPlacement> getDomainIspPlacements() {
        return domainIspPlacements;
    }

    /**
     * <p>
     * An object that contains inbox and junk mail placement metrics for individual email providers.
     * </p>
     * 
     * @param domainIspPlacements
     *        An object that contains inbox and junk mail placement metrics for individual email providers.
     */

    public void setDomainIspPlacements(java.util.Collection<DomainIspPlacement> domainIspPlacements) {
        if (domainIspPlacements == null) {
            this.domainIspPlacements = null;
            return;
        }

        this.domainIspPlacements = new java.util.ArrayList<DomainIspPlacement>(domainIspPlacements);
    }

    /**
     * <p>
     * An object that contains inbox and junk mail placement metrics for individual email providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainIspPlacements(java.util.Collection)} or {@link #withDomainIspPlacements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param domainIspPlacements
     *        An object that contains inbox and junk mail placement metrics for individual email providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallVolume withDomainIspPlacements(DomainIspPlacement... domainIspPlacements) {
        if (this.domainIspPlacements == null) {
            setDomainIspPlacements(new java.util.ArrayList<DomainIspPlacement>(domainIspPlacements.length));
        }
        for (DomainIspPlacement ele : domainIspPlacements) {
            this.domainIspPlacements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains inbox and junk mail placement metrics for individual email providers.
     * </p>
     * 
     * @param domainIspPlacements
     *        An object that contains inbox and junk mail placement metrics for individual email providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallVolume withDomainIspPlacements(java.util.Collection<DomainIspPlacement> domainIspPlacements) {
        setDomainIspPlacements(domainIspPlacements);
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
        if (getVolumeStatistics() != null)
            sb.append("VolumeStatistics: ").append(getVolumeStatistics()).append(",");
        if (getReadRatePercent() != null)
            sb.append("ReadRatePercent: ").append(getReadRatePercent()).append(",");
        if (getDomainIspPlacements() != null)
            sb.append("DomainIspPlacements: ").append(getDomainIspPlacements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverallVolume == false)
            return false;
        OverallVolume other = (OverallVolume) obj;
        if (other.getVolumeStatistics() == null ^ this.getVolumeStatistics() == null)
            return false;
        if (other.getVolumeStatistics() != null && other.getVolumeStatistics().equals(this.getVolumeStatistics()) == false)
            return false;
        if (other.getReadRatePercent() == null ^ this.getReadRatePercent() == null)
            return false;
        if (other.getReadRatePercent() != null && other.getReadRatePercent().equals(this.getReadRatePercent()) == false)
            return false;
        if (other.getDomainIspPlacements() == null ^ this.getDomainIspPlacements() == null)
            return false;
        if (other.getDomainIspPlacements() != null && other.getDomainIspPlacements().equals(this.getDomainIspPlacements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeStatistics() == null) ? 0 : getVolumeStatistics().hashCode());
        hashCode = prime * hashCode + ((getReadRatePercent() == null) ? 0 : getReadRatePercent().hashCode());
        hashCode = prime * hashCode + ((getDomainIspPlacements() == null) ? 0 : getDomainIspPlacements().hashCode());
        return hashCode;
    }

    @Override
    public OverallVolume clone() {
        try {
            return (OverallVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.OverallVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
