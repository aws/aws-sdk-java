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

/**
 * <p>
 * An object that includes statistics that are related to the domain that you specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainStatisticsReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainStatisticsReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. The data in this object is a
     * summary of all of the data that was collected from the <code>StartDate</code> to the <code>EndDate</code>.
     * </p>
     */
    private OverallVolume overallVolume;
    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. This object contains data for
     * each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * </p>
     */
    private java.util.List<DailyVolume> dailyVolumes;

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. The data in this object is a
     * summary of all of the data that was collected from the <code>StartDate</code> to the <code>EndDate</code>.
     * </p>
     * 
     * @param overallVolume
     *        An object that contains deliverability metrics for the domain that you specified. The data in this object
     *        is a summary of all of the data that was collected from the <code>StartDate</code> to the
     *        <code>EndDate</code>.
     */

    public void setOverallVolume(OverallVolume overallVolume) {
        this.overallVolume = overallVolume;
    }

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. The data in this object is a
     * summary of all of the data that was collected from the <code>StartDate</code> to the <code>EndDate</code>.
     * </p>
     * 
     * @return An object that contains deliverability metrics for the domain that you specified. The data in this object
     *         is a summary of all of the data that was collected from the <code>StartDate</code> to the
     *         <code>EndDate</code>.
     */

    public OverallVolume getOverallVolume() {
        return this.overallVolume;
    }

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. The data in this object is a
     * summary of all of the data that was collected from the <code>StartDate</code> to the <code>EndDate</code>.
     * </p>
     * 
     * @param overallVolume
     *        An object that contains deliverability metrics for the domain that you specified. The data in this object
     *        is a summary of all of the data that was collected from the <code>StartDate</code> to the
     *        <code>EndDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainStatisticsReportResult withOverallVolume(OverallVolume overallVolume) {
        setOverallVolume(overallVolume);
        return this;
    }

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. This object contains data for
     * each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * </p>
     * 
     * @return An object that contains deliverability metrics for the domain that you specified. This object contains
     *         data for each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     */

    public java.util.List<DailyVolume> getDailyVolumes() {
        return dailyVolumes;
    }

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. This object contains data for
     * each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * </p>
     * 
     * @param dailyVolumes
     *        An object that contains deliverability metrics for the domain that you specified. This object contains
     *        data for each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     */

    public void setDailyVolumes(java.util.Collection<DailyVolume> dailyVolumes) {
        if (dailyVolumes == null) {
            this.dailyVolumes = null;
            return;
        }

        this.dailyVolumes = new java.util.ArrayList<DailyVolume>(dailyVolumes);
    }

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. This object contains data for
     * each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDailyVolumes(java.util.Collection)} or {@link #withDailyVolumes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dailyVolumes
     *        An object that contains deliverability metrics for the domain that you specified. This object contains
     *        data for each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainStatisticsReportResult withDailyVolumes(DailyVolume... dailyVolumes) {
        if (this.dailyVolumes == null) {
            setDailyVolumes(new java.util.ArrayList<DailyVolume>(dailyVolumes.length));
        }
        for (DailyVolume ele : dailyVolumes) {
            this.dailyVolumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains deliverability metrics for the domain that you specified. This object contains data for
     * each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * </p>
     * 
     * @param dailyVolumes
     *        An object that contains deliverability metrics for the domain that you specified. This object contains
     *        data for each day, starting on the <code>StartDate</code> and ending on the <code>EndDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainStatisticsReportResult withDailyVolumes(java.util.Collection<DailyVolume> dailyVolumes) {
        setDailyVolumes(dailyVolumes);
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
        if (getOverallVolume() != null)
            sb.append("OverallVolume: ").append(getOverallVolume()).append(",");
        if (getDailyVolumes() != null)
            sb.append("DailyVolumes: ").append(getDailyVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainStatisticsReportResult == false)
            return false;
        GetDomainStatisticsReportResult other = (GetDomainStatisticsReportResult) obj;
        if (other.getOverallVolume() == null ^ this.getOverallVolume() == null)
            return false;
        if (other.getOverallVolume() != null && other.getOverallVolume().equals(this.getOverallVolume()) == false)
            return false;
        if (other.getDailyVolumes() == null ^ this.getDailyVolumes() == null)
            return false;
        if (other.getDailyVolumes() != null && other.getDailyVolumes().equals(this.getDailyVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverallVolume() == null) ? 0 : getOverallVolume().hashCode());
        hashCode = prime * hashCode + ((getDailyVolumes() == null) ? 0 : getDailyVolumes().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainStatisticsReportResult clone() {
        try {
            return (GetDomainStatisticsReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
