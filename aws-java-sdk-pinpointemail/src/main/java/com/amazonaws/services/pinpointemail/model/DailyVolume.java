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
 * An object that contains information about the volume of email sent on each day of the analysis period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DailyVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DailyVolume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date that the DailyVolume metrics apply to, in Unix time.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * An object that contains inbox placement metrics for a specific day in the analysis period.
     * </p>
     */
    private VolumeStatistics volumeStatistics;
    /**
     * <p>
     * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the
     * recipient's email provider.
     * </p>
     */
    private java.util.List<DomainIspPlacement> domainIspPlacements;

    /**
     * <p>
     * The date that the DailyVolume metrics apply to, in Unix time.
     * </p>
     * 
     * @param startDate
     *        The date that the DailyVolume metrics apply to, in Unix time.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date that the DailyVolume metrics apply to, in Unix time.
     * </p>
     * 
     * @return The date that the DailyVolume metrics apply to, in Unix time.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date that the DailyVolume metrics apply to, in Unix time.
     * </p>
     * 
     * @param startDate
     *        The date that the DailyVolume metrics apply to, in Unix time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DailyVolume withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specific day in the analysis period.
     * </p>
     * 
     * @param volumeStatistics
     *        An object that contains inbox placement metrics for a specific day in the analysis period.
     */

    public void setVolumeStatistics(VolumeStatistics volumeStatistics) {
        this.volumeStatistics = volumeStatistics;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specific day in the analysis period.
     * </p>
     * 
     * @return An object that contains inbox placement metrics for a specific day in the analysis period.
     */

    public VolumeStatistics getVolumeStatistics() {
        return this.volumeStatistics;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specific day in the analysis period.
     * </p>
     * 
     * @param volumeStatistics
     *        An object that contains inbox placement metrics for a specific day in the analysis period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DailyVolume withVolumeStatistics(VolumeStatistics volumeStatistics) {
        setVolumeStatistics(volumeStatistics);
        return this;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the
     * recipient's email provider.
     * </p>
     * 
     * @return An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by
     *         the recipient's email provider.
     */

    public java.util.List<DomainIspPlacement> getDomainIspPlacements() {
        return domainIspPlacements;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the
     * recipient's email provider.
     * </p>
     * 
     * @param domainIspPlacements
     *        An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by
     *        the recipient's email provider.
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
     * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the
     * recipient's email provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainIspPlacements(java.util.Collection)} or {@link #withDomainIspPlacements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param domainIspPlacements
     *        An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by
     *        the recipient's email provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DailyVolume withDomainIspPlacements(DomainIspPlacement... domainIspPlacements) {
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
     * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the
     * recipient's email provider.
     * </p>
     * 
     * @param domainIspPlacements
     *        An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by
     *        the recipient's email provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DailyVolume withDomainIspPlacements(java.util.Collection<DomainIspPlacement> domainIspPlacements) {
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getVolumeStatistics() != null)
            sb.append("VolumeStatistics: ").append(getVolumeStatistics()).append(",");
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

        if (obj instanceof DailyVolume == false)
            return false;
        DailyVolume other = (DailyVolume) obj;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getVolumeStatistics() == null ^ this.getVolumeStatistics() == null)
            return false;
        if (other.getVolumeStatistics() != null && other.getVolumeStatistics().equals(this.getVolumeStatistics()) == false)
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

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getVolumeStatistics() == null) ? 0 : getVolumeStatistics().hashCode());
        hashCode = prime * hashCode + ((getDomainIspPlacements() == null) ? 0 : getDomainIspPlacements().hashCode());
        return hashCode;
    }

    @Override
    public DailyVolume clone() {
        try {
            return (DailyVolume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DailyVolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
