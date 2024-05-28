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
 * Amazon CloudWatch Internet Monitor calculates measurements about the availability for your application's internet
 * traffic between client locations and Amazon Web Services. Amazon Web Services has substantial historical data about
 * internet performance and availability between Amazon Web Services services and different network providers and
 * geographies. By applying statistical analysis to the data, Internet Monitor can detect when the performance and
 * availability for your application has dropped, compared to an estimated baseline that's already calculated. To make
 * it easier to see those drops, we report that information to you in the form of health scores: a performance score and
 * an availability score.
 * </p>
 * <p>
 * Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an availability
 * drop. For example, an availability score of 99% for an end user and service location pair is equivalent to 1% of the
 * traffic experiencing an availability drop for that pair.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
 * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet Monitor
 * section of the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/AvailabilityMeasurement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityMeasurement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Experience scores, or health scores are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also summed into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed information
     * about how Internet Monitor calculates health scores, including performance and availability scores, and when it
     * creates and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private Double experienceScore;
    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html">How
     * Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User Guide.
     * </p>
     */
    private Double percentOfTotalTrafficImpacted;
    /**
     * <p>
     * The percentage of impact caused by a health event for client location traffic globally.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     * >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User
     * Guide.
     * </p>
     */
    private Double percentOfClientLocationImpacted;

    /**
     * <p>
     * Experience scores, or health scores are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also summed into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed information
     * about how Internet Monitor calculates health scores, including performance and availability scores, and when it
     * creates and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param experienceScore
     *        Experience scores, or health scores are calculated for different geographic and network provider
     *        combinations (that is, different granularities) and also summed into global scores. If you view
     *        performance or availability scores without filtering for any specific geography or service provider,
     *        Amazon CloudWatch Internet Monitor provides global health scores.</p>
     *        <p>
     *        The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed
     *        information about how Internet Monitor calculates health scores, including performance and availability
     *        scores, and when it creates and resolves health events. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch
     *        Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public void setExperienceScore(Double experienceScore) {
        this.experienceScore = experienceScore;
    }

    /**
     * <p>
     * Experience scores, or health scores are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also summed into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed information
     * about how Internet Monitor calculates health scores, including performance and availability scores, and when it
     * creates and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return Experience scores, or health scores are calculated for different geographic and network provider
     *         combinations (that is, different granularities) and also summed into global scores. If you view
     *         performance or availability scores without filtering for any specific geography or service provider,
     *         Amazon CloudWatch Internet Monitor provides global health scores.</p>
     *         <p>
     *         The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed
     *         information about how Internet Monitor calculates health scores, including performance and availability
     *         scores, and when it creates and resolves health events. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *         >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch
     *         Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public Double getExperienceScore() {
        return this.experienceScore;
    }

    /**
     * <p>
     * Experience scores, or health scores are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also summed into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed information
     * about how Internet Monitor calculates health scores, including performance and availability scores, and when it
     * creates and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param experienceScore
     *        Experience scores, or health scores are calculated for different geographic and network provider
     *        combinations (that is, different granularities) and also summed into global scores. If you view
     *        performance or availability scores without filtering for any specific geography or service provider,
     *        Amazon CloudWatch Internet Monitor provides global health scores.</p>
     *        <p>
     *        The Amazon CloudWatch Internet Monitor chapter in the <i>CloudWatch User Guide</i> includes detailed
     *        information about how Internet Monitor calculates health scores, including performance and availability
     *        scores, and when it creates and resolves health events. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch
     *        Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityMeasurement withExperienceScore(Double experienceScore) {
        setExperienceScore(experienceScore);
        return this;
    }

    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html">How
     * Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User Guide.
     * </p>
     * 
     * @param percentOfTotalTrafficImpacted
     *        The impact on total traffic that a health event has, in increased latency or reduced availability. This is
     *        the percentage of how much latency has increased or availability has decreased during the event, compared
     *        to what is typical for traffic from this client location to the Amazon Web Services location using this
     *        client network.</p>
     *        <p>
     *        For information about how Internet Monitor calculates impact, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     *        >How Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch
     *        User Guide.
     */

    public void setPercentOfTotalTrafficImpacted(Double percentOfTotalTrafficImpacted) {
        this.percentOfTotalTrafficImpacted = percentOfTotalTrafficImpacted;
    }

    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html">How
     * Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User Guide.
     * </p>
     * 
     * @return The impact on total traffic that a health event has, in increased latency or reduced availability. This
     *         is the percentage of how much latency has increased or availability has decreased during the event,
     *         compared to what is typical for traffic from this client location to the Amazon Web Services location
     *         using this client network.</p>
     *         <p>
     *         For information about how Internet Monitor calculates impact, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     *         >How Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon
     *         CloudWatch User Guide.
     */

    public Double getPercentOfTotalTrafficImpacted() {
        return this.percentOfTotalTrafficImpacted;
    }

    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html">How
     * Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User Guide.
     * </p>
     * 
     * @param percentOfTotalTrafficImpacted
     *        The impact on total traffic that a health event has, in increased latency or reduced availability. This is
     *        the percentage of how much latency has increased or availability has decreased during the event, compared
     *        to what is typical for traffic from this client location to the Amazon Web Services location using this
     *        client network.</p>
     *        <p>
     *        For information about how Internet Monitor calculates impact, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     *        >How Internet Monitor works</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch
     *        User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityMeasurement withPercentOfTotalTrafficImpacted(Double percentOfTotalTrafficImpacted) {
        setPercentOfTotalTrafficImpacted(percentOfTotalTrafficImpacted);
        return this;
    }

    /**
     * <p>
     * The percentage of impact caused by a health event for client location traffic globally.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     * >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User
     * Guide.
     * </p>
     * 
     * @param percentOfClientLocationImpacted
     *        The percentage of impact caused by a health event for client location traffic globally.</p>
     *        <p>
     *        For information about how Internet Monitor calculates impact, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     *        >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch
     *        User Guide.
     */

    public void setPercentOfClientLocationImpacted(Double percentOfClientLocationImpacted) {
        this.percentOfClientLocationImpacted = percentOfClientLocationImpacted;
    }

    /**
     * <p>
     * The percentage of impact caused by a health event for client location traffic globally.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     * >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User
     * Guide.
     * </p>
     * 
     * @return The percentage of impact caused by a health event for client location traffic globally.</p>
     *         <p>
     *         For information about how Internet Monitor calculates impact, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     *         >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch
     *         User Guide.
     */

    public Double getPercentOfClientLocationImpacted() {
        return this.percentOfClientLocationImpacted;
    }

    /**
     * <p>
     * The percentage of impact caused by a health event for client location traffic globally.
     * </p>
     * <p>
     * For information about how Internet Monitor calculates impact, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     * >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User
     * Guide.
     * </p>
     * 
     * @param percentOfClientLocationImpacted
     *        The percentage of impact caused by a health event for client location traffic globally.</p>
     *        <p>
     *        For information about how Internet Monitor calculates impact, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html"
     *        >Inside Internet Monitor</a> in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch
     *        User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityMeasurement withPercentOfClientLocationImpacted(Double percentOfClientLocationImpacted) {
        setPercentOfClientLocationImpacted(percentOfClientLocationImpacted);
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
        if (getExperienceScore() != null)
            sb.append("ExperienceScore: ").append(getExperienceScore()).append(",");
        if (getPercentOfTotalTrafficImpacted() != null)
            sb.append("PercentOfTotalTrafficImpacted: ").append(getPercentOfTotalTrafficImpacted()).append(",");
        if (getPercentOfClientLocationImpacted() != null)
            sb.append("PercentOfClientLocationImpacted: ").append(getPercentOfClientLocationImpacted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityMeasurement == false)
            return false;
        AvailabilityMeasurement other = (AvailabilityMeasurement) obj;
        if (other.getExperienceScore() == null ^ this.getExperienceScore() == null)
            return false;
        if (other.getExperienceScore() != null && other.getExperienceScore().equals(this.getExperienceScore()) == false)
            return false;
        if (other.getPercentOfTotalTrafficImpacted() == null ^ this.getPercentOfTotalTrafficImpacted() == null)
            return false;
        if (other.getPercentOfTotalTrafficImpacted() != null
                && other.getPercentOfTotalTrafficImpacted().equals(this.getPercentOfTotalTrafficImpacted()) == false)
            return false;
        if (other.getPercentOfClientLocationImpacted() == null ^ this.getPercentOfClientLocationImpacted() == null)
            return false;
        if (other.getPercentOfClientLocationImpacted() != null
                && other.getPercentOfClientLocationImpacted().equals(this.getPercentOfClientLocationImpacted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperienceScore() == null) ? 0 : getExperienceScore().hashCode());
        hashCode = prime * hashCode + ((getPercentOfTotalTrafficImpacted() == null) ? 0 : getPercentOfTotalTrafficImpacted().hashCode());
        hashCode = prime * hashCode + ((getPercentOfClientLocationImpacted() == null) ? 0 : getPercentOfClientLocationImpacted().hashCode());
        return hashCode;
    }

    @Override
    public AvailabilityMeasurement clone() {
        try {
            return (AvailabilityMeasurement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.AvailabilityMeasurementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
