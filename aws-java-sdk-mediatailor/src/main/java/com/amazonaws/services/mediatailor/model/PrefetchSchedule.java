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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A prefetch schedule allows you to tell MediaTailor to fetch and prepare certain ads before an ad break happens. For
 * more information about ad prefetching, see <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
 * <i>MediaTailor User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PrefetchSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefetchSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prefetch schedule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     * consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can designate
     * which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     * </p>
     */
    private PrefetchConsumption consumption;
    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the playback configuration to create the prefetch schedule for.
     * </p>
     */
    private String playbackConfigurationName;
    /**
     * <p>
     * A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     * </p>
     */
    private PrefetchRetrieval retrieval;
    /**
     * <p>
     * An optional stream identifier that you can specify in order to prefetch for multiple streams that use the same
     * playback configuration.
     * </p>
     */
    private String streamId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prefetch schedule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the prefetch schedule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prefetch schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the prefetch schedule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prefetch schedule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the prefetch schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchSchedule withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     * consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can designate
     * which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     * </p>
     * 
     * @param consumption
     *        Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     *        consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can
     *        designate which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     */

    public void setConsumption(PrefetchConsumption consumption) {
        this.consumption = consumption;
    }

    /**
     * <p>
     * Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     * consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can designate
     * which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     * </p>
     * 
     * @return Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     *         consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can
     *         designate which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     */

    public PrefetchConsumption getConsumption() {
        return this.consumption;
    }

    /**
     * <p>
     * Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     * consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can designate
     * which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     * </p>
     * 
     * @param consumption
     *        Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad
     *        consumption occurs within a span of time that you define, called a <i>consumption window</i>. You can
     *        designate which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchSchedule withConsumption(PrefetchConsumption consumption) {
        setConsumption(consumption);
        return this;
    }

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     * 
     * @param name
     *        The name of the prefetch schedule. The name must be unique among all prefetch schedules that are
     *        associated with the specified playback configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     * 
     * @return The name of the prefetch schedule. The name must be unique among all prefetch schedules that are
     *         associated with the specified playback configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     * 
     * @param name
     *        The name of the prefetch schedule. The name must be unique among all prefetch schedules that are
     *        associated with the specified playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchSchedule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the playback configuration to create the prefetch schedule for.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration to create the prefetch schedule for.
     */

    public void setPlaybackConfigurationName(String playbackConfigurationName) {
        this.playbackConfigurationName = playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration to create the prefetch schedule for.
     * </p>
     * 
     * @return The name of the playback configuration to create the prefetch schedule for.
     */

    public String getPlaybackConfigurationName() {
        return this.playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration to create the prefetch schedule for.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration to create the prefetch schedule for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchSchedule withPlaybackConfigurationName(String playbackConfigurationName) {
        setPlaybackConfigurationName(playbackConfigurationName);
        return this;
    }

    /**
     * <p>
     * A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     * </p>
     * 
     * @param retrieval
     *        A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     */

    public void setRetrieval(PrefetchRetrieval retrieval) {
        this.retrieval = retrieval;
    }

    /**
     * <p>
     * A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     * </p>
     * 
     * @return A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     */

    public PrefetchRetrieval getRetrieval() {
        return this.retrieval;
    }

    /**
     * <p>
     * A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     * </p>
     * 
     * @param retrieval
     *        A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchSchedule withRetrieval(PrefetchRetrieval retrieval) {
        setRetrieval(retrieval);
        return this;
    }

    /**
     * <p>
     * An optional stream identifier that you can specify in order to prefetch for multiple streams that use the same
     * playback configuration.
     * </p>
     * 
     * @param streamId
     *        An optional stream identifier that you can specify in order to prefetch for multiple streams that use the
     *        same playback configuration.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * An optional stream identifier that you can specify in order to prefetch for multiple streams that use the same
     * playback configuration.
     * </p>
     * 
     * @return An optional stream identifier that you can specify in order to prefetch for multiple streams that use the
     *         same playback configuration.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * An optional stream identifier that you can specify in order to prefetch for multiple streams that use the same
     * playback configuration.
     * </p>
     * 
     * @param streamId
     *        An optional stream identifier that you can specify in order to prefetch for multiple streams that use the
     *        same playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchSchedule withStreamId(String streamId) {
        setStreamId(streamId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConsumption() != null)
            sb.append("Consumption: ").append(getConsumption()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlaybackConfigurationName() != null)
            sb.append("PlaybackConfigurationName: ").append(getPlaybackConfigurationName()).append(",");
        if (getRetrieval() != null)
            sb.append("Retrieval: ").append(getRetrieval()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefetchSchedule == false)
            return false;
        PrefetchSchedule other = (PrefetchSchedule) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConsumption() == null ^ this.getConsumption() == null)
            return false;
        if (other.getConsumption() != null && other.getConsumption().equals(this.getConsumption()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlaybackConfigurationName() == null ^ this.getPlaybackConfigurationName() == null)
            return false;
        if (other.getPlaybackConfigurationName() != null && other.getPlaybackConfigurationName().equals(this.getPlaybackConfigurationName()) == false)
            return false;
        if (other.getRetrieval() == null ^ this.getRetrieval() == null)
            return false;
        if (other.getRetrieval() != null && other.getRetrieval().equals(this.getRetrieval()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConsumption() == null) ? 0 : getConsumption().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackConfigurationName() == null) ? 0 : getPlaybackConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getRetrieval() == null) ? 0 : getRetrieval().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public PrefetchSchedule clone() {
        try {
            return (PrefetchSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.PrefetchScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
