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
 * Amazon CloudWatch Internet Monitor calculates measurements about the performance for your application's internet
 * traffic between client locations and Amazon Web Services. Amazon Web Services has substantial historical data about
 * internet performance and availability between Amazon Web Services services and different network providers and
 * geographies. By applying statistical analysis to the data, Internet Monitor can detect when the performance and
 * availability for your application has dropped, compared to an estimated baseline that's already calculated. To make
 * it easier to see those drops, we report that information to you in the form of health scores: a performance score and
 * an availability score.
 * </p>
 * <p>
 * Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a performance drop.
 * For example, a performance score of 99% for an end user and service location pair is equivalent to 1% of the traffic
 * experiencing a performance drop for that pair.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
 * >How Internet Monitor calculates performance and availability scores</a> in the Amazon CloudWatch Internet Monitor
 * section of the <i>CloudWatch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/PerformanceMeasurement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceMeasurement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Experience scores, or health scores, are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also totaled into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information about
     * how Internet Monitor calculates health scores, including performance and availability scores, and when it creates
     * and resolves health events. For more information, see <a href=
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private Double percentOfTotalTrafficImpacted;
    /**
     * <p>
     * How much performance impact was caused by a health event at a client location. For performance, this is the
     * percentage of how much latency increased during the event compared to typical performance for traffic, from this
     * client location to an Amazon Web Services location, using a specific client network.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private Double percentOfClientLocationImpacted;
    /**
     * <p>
     * This is the percentage of how much round-trip time increased during the event compared to typical round-trip time
     * for your application for traffic.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     */
    private RoundTripTime roundTripTime;

    /**
     * <p>
     * Experience scores, or health scores, are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also totaled into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information about
     * how Internet Monitor calculates health scores, including performance and availability scores, and when it creates
     * and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param experienceScore
     *        Experience scores, or health scores, are calculated for different geographic and network provider
     *        combinations (that is, different granularities) and also totaled into global scores. If you view
     *        performance or availability scores without filtering for any specific geography or service provider,
     *        Amazon CloudWatch Internet Monitor provides global health scores.</p>
     *        <p>
     *        The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information
     *        about how Internet Monitor calculates health scores, including performance and availability scores, and
     *        when it creates and resolves health events. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch
     *        Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public void setExperienceScore(Double experienceScore) {
        this.experienceScore = experienceScore;
    }

    /**
     * <p>
     * Experience scores, or health scores, are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also totaled into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information about
     * how Internet Monitor calculates health scores, including performance and availability scores, and when it creates
     * and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return Experience scores, or health scores, are calculated for different geographic and network provider
     *         combinations (that is, different granularities) and also totaled into global scores. If you view
     *         performance or availability scores without filtering for any specific geography or service provider,
     *         Amazon CloudWatch Internet Monitor provides global health scores.</p>
     *         <p>
     *         The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information
     *         about how Internet Monitor calculates health scores, including performance and availability scores, and
     *         when it creates and resolves health events. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *         >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch
     *         Internet Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public Double getExperienceScore() {
        return this.experienceScore;
    }

    /**
     * <p>
     * Experience scores, or health scores, are calculated for different geographic and network provider combinations
     * (that is, different granularities) and also totaled into global scores. If you view performance or availability
     * scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor
     * provides global health scores.
     * </p>
     * <p>
     * The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information about
     * how Internet Monitor calculates health scores, including performance and availability scores, and when it creates
     * and resolves health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     * >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch Internet
     * Monitor section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param experienceScore
     *        Experience scores, or health scores, are calculated for different geographic and network provider
     *        combinations (that is, different granularities) and also totaled into global scores. If you view
     *        performance or availability scores without filtering for any specific geography or service provider,
     *        Amazon CloudWatch Internet Monitor provides global health scores.</p>
     *        <p>
     *        The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information
     *        about how Internet Monitor calculates health scores, including performance and availability scores, and
     *        when it creates and resolves health events. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMExperienceScores"
     *        >How Amazon Web Services calculates performance and availability scores</a> in the Amazon CloudWatch
     *        Internet Monitor section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceMeasurement withExperienceScore(Double experienceScore) {
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param percentOfTotalTrafficImpacted
     *        The impact on total traffic that a health event has, in increased latency or reduced availability. This is
     *        the percentage of how much latency has increased or availability has decreased during the event, compared
     *        to what is typical for traffic from this client location to the Amazon Web Services location using this
     *        client network.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *        >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     *        section of the <i>CloudWatch User Guide</i>.
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The impact on total traffic that a health event has, in increased latency or reduced availability. This
     *         is the percentage of how much latency has increased or availability has decreased during the event,
     *         compared to what is typical for traffic from this client location to the Amazon Web Services location
     *         using this client network.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *         >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet
     *         Monitor section of the <i>CloudWatch User Guide</i>.
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
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param percentOfTotalTrafficImpacted
     *        The impact on total traffic that a health event has, in increased latency or reduced availability. This is
     *        the percentage of how much latency has increased or availability has decreased during the event, compared
     *        to what is typical for traffic from this client location to the Amazon Web Services location using this
     *        client network.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *        >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     *        section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceMeasurement withPercentOfTotalTrafficImpacted(Double percentOfTotalTrafficImpacted) {
        setPercentOfTotalTrafficImpacted(percentOfTotalTrafficImpacted);
        return this;
    }

    /**
     * <p>
     * How much performance impact was caused by a health event at a client location. For performance, this is the
     * percentage of how much latency increased during the event compared to typical performance for traffic, from this
     * client location to an Amazon Web Services location, using a specific client network.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param percentOfClientLocationImpacted
     *        How much performance impact was caused by a health event at a client location. For performance, this is
     *        the percentage of how much latency increased during the event compared to typical performance for traffic,
     *        from this client location to an Amazon Web Services location, using a specific client network. </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *        >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     *        section of the <i>CloudWatch User Guide</i>.
     */

    public void setPercentOfClientLocationImpacted(Double percentOfClientLocationImpacted) {
        this.percentOfClientLocationImpacted = percentOfClientLocationImpacted;
    }

    /**
     * <p>
     * How much performance impact was caused by a health event at a client location. For performance, this is the
     * percentage of how much latency increased during the event compared to typical performance for traffic, from this
     * client location to an Amazon Web Services location, using a specific client network.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return How much performance impact was caused by a health event at a client location. For performance, this is
     *         the percentage of how much latency increased during the event compared to typical performance for
     *         traffic, from this client location to an Amazon Web Services location, using a specific client network.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *         >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet
     *         Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public Double getPercentOfClientLocationImpacted() {
        return this.percentOfClientLocationImpacted;
    }

    /**
     * <p>
     * How much performance impact was caused by a health event at a client location. For performance, this is the
     * percentage of how much latency increased during the event compared to typical performance for traffic, from this
     * client location to an Amazon Web Services location, using a specific client network.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param percentOfClientLocationImpacted
     *        How much performance impact was caused by a health event at a client location. For performance, this is
     *        the percentage of how much latency increased during the event compared to typical performance for traffic,
     *        from this client location to an Amazon Web Services location, using a specific client network. </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *        >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     *        section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceMeasurement withPercentOfClientLocationImpacted(Double percentOfClientLocationImpacted) {
        setPercentOfClientLocationImpacted(percentOfClientLocationImpacted);
        return this;
    }

    /**
     * <p>
     * This is the percentage of how much round-trip time increased during the event compared to typical round-trip time
     * for your application for traffic.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param roundTripTime
     *        This is the percentage of how much round-trip time increased during the event compared to typical
     *        round-trip time for your application for traffic. </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *        >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     *        section of the <i>CloudWatch User Guide</i>.
     */

    public void setRoundTripTime(RoundTripTime roundTripTime) {
        this.roundTripTime = roundTripTime;
    }

    /**
     * <p>
     * This is the percentage of how much round-trip time increased during the event compared to typical round-trip time
     * for your application for traffic.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @return This is the percentage of how much round-trip time increased during the event compared to typical
     *         round-trip time for your application for traffic. </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *         >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet
     *         Monitor section of the <i>CloudWatch User Guide</i>.
     */

    public RoundTripTime getRoundTripTime() {
        return this.roundTripTime;
    }

    /**
     * <p>
     * This is the percentage of how much round-trip time increased during the event compared to typical round-trip time
     * for your application for traffic.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     * >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     * section of the <i>CloudWatch User Guide</i>.
     * </p>
     * 
     * @param roundTripTime
     *        This is the percentage of how much round-trip time increased during the event compared to typical
     *        round-trip time for your application for traffic. </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-inside-internet-monitor.html#IMHealthEventStartStop"
     *        >When Amazon Web Services creates and resolves health events</a> in the Amazon CloudWatch Internet Monitor
     *        section of the <i>CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceMeasurement withRoundTripTime(RoundTripTime roundTripTime) {
        setRoundTripTime(roundTripTime);
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
            sb.append("PercentOfClientLocationImpacted: ").append(getPercentOfClientLocationImpacted()).append(",");
        if (getRoundTripTime() != null)
            sb.append("RoundTripTime: ").append(getRoundTripTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceMeasurement == false)
            return false;
        PerformanceMeasurement other = (PerformanceMeasurement) obj;
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
        if (other.getRoundTripTime() == null ^ this.getRoundTripTime() == null)
            return false;
        if (other.getRoundTripTime() != null && other.getRoundTripTime().equals(this.getRoundTripTime()) == false)
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
        hashCode = prime * hashCode + ((getRoundTripTime() == null) ? 0 : getRoundTripTime().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceMeasurement clone() {
        try {
            return (PerformanceMeasurement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.PerformanceMeasurementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
