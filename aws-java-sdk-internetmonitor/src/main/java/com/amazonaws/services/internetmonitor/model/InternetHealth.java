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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Internet health includes measurements calculated by Amazon CloudWatch Internet Monitor about the performance and
 * availability for your application on the internet. Amazon Web Services has substantial historical data about internet
 * performance and availability between Amazon Web Services services and different network providers and geographies. By
 * applying statistical analysis to the data, Internet Monitor can detect when the performance and availability for your
 * application has dropped, compared to an estimated baseline that's already calculated. To make it easier to see those
 * drops, Internet Monitor reports the information to you in the form of health scores: a performance score and an
 * availability score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/InternetHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternetHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     * availability drop. For example, an availability score of 99% for an end user and service location pair is
     * equivalent to 1% of the traffic experiencing an availability drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private AvailabilityMeasurement availability;
    /**
     * <p>
     * Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a performance
     * drop. For example, a performance score of 99% for an end user and service location pair is equivalent to 1% of
     * the traffic experiencing a performance drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private PerformanceMeasurement performance;

    /**
     * <p>
     * Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     * availability drop. For example, an availability score of 99% for an end user and service location pair is
     * equivalent to 1% of the traffic experiencing an availability drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param availability
     *        Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     *        availability drop. For example, an availability score of 99% for an end user and service location pair is
     *        equivalent to 1% of the traffic experiencing an availability drop for that pair.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     *        Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public void setAvailability(AvailabilityMeasurement availability) {
        this.availability = availability;
    }

    /**
     * <p>
     * Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     * availability drop. For example, an availability score of 99% for an end user and service location pair is
     * equivalent to 1% of the traffic experiencing an availability drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     *         availability drop. For example, an availability score of 99% for an end user and service location pair is
     *         equivalent to 1% of the traffic experiencing an availability drop for that pair.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *         >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch
     *         Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public AvailabilityMeasurement getAvailability() {
        return this.availability;
    }

    /**
     * <p>
     * Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     * availability drop. For example, an availability score of 99% for an end user and service location pair is
     * equivalent to 1% of the traffic experiencing an availability drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param availability
     *        Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an
     *        availability drop. For example, an availability score of 99% for an end user and service location pair is
     *        equivalent to 1% of the traffic experiencing an availability drop for that pair.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     *        Monitor section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetHealth withAvailability(AvailabilityMeasurement availability) {
        setAvailability(availability);
        return this;
    }

    /**
     * <p>
     * Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a performance
     * drop. For example, a performance score of 99% for an end user and service location pair is equivalent to 1% of
     * the traffic experiencing a performance drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param performance
     *        Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a
     *        performance drop. For example, a performance score of 99% for an end user and service location pair is
     *        equivalent to 1% of the traffic experiencing a performance drop for that pair.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     *        Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public void setPerformance(PerformanceMeasurement performance) {
        this.performance = performance;
    }

    /**
     * <p>
     * Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a performance
     * drop. For example, a performance score of 99% for an end user and service location pair is equivalent to 1% of
     * the traffic experiencing a performance drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a
     *         performance drop. For example, a performance score of 99% for an end user and service location pair is
     *         equivalent to 1% of the traffic experiencing a performance drop for that pair.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *         >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch
     *         Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public PerformanceMeasurement getPerformance() {
        return this.performance;
    }

    /**
     * <p>
     * Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a performance
     * drop. For example, a performance score of 99% for an end user and service location pair is equivalent to 1% of
     * the traffic experiencing a performance drop for that pair.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param performance
     *        Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a
     *        performance drop. For example, a performance score of 99% for an end user and service location pair is
     *        equivalent to 1% of the traffic experiencing a performance drop for that pair.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     *        Monitor section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetHealth withPerformance(PerformanceMeasurement performance) {
        setPerformance(performance);
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
        if (getAvailability() != null)
            sb.append("Availability: ").append(getAvailability()).append(",");
        if (getPerformance() != null)
            sb.append("Performance: ").append(getPerformance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InternetHealth == false)
            return false;
        InternetHealth other = (InternetHealth) obj;
        if (other.getAvailability() == null ^ this.getAvailability() == null)
            return false;
        if (other.getAvailability() != null && other.getAvailability().equals(this.getAvailability()) == false)
            return false;
        if (other.getPerformance() == null ^ this.getPerformance() == null)
            return false;
        if (other.getPerformance() != null && other.getPerformance().equals(this.getPerformance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
        hashCode = prime * hashCode + ((getPerformance() == null) ? 0 : getPerformance().hashCode());
        return hashCode;
    }

    @Override
    public InternetHealth clone() {
        try {
            return (InternetHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.InternetHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
