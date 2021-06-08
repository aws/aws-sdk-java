/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Rtmp Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RtmpGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RtmpGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each
     * SCTE-35 message, format it for that marker type, and insert it in the datastream.
     */
    private java.util.List<String> adMarkers;
    /** Authentication scheme to use when connecting with CDN */
    private String authenticationScheme;
    /**
     * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not
     * accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by
     * cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force
     * a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP
     * output will wait up to 5 minutes to allow the origin server to begin accepting data again.
     */
    private String cacheFullBehavior;
    /** Cache length, in seconds, is used to calculate buffer size. */
    private Integer cacheLength;
    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried DTVCC
     * data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both
     * fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
     */
    private String captionData;
    /**
     * Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     * - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns. This
     * does not close the underlying RTMP connection.
     */
    private String inputLossAction;
    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     */
    private Integer restartDelay;

    /**
     * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each
     * SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * 
     * @return Choose the ad marker type for this output group. MediaLive will create a message based on the content of
     *         each SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * @see RtmpAdMarkers
     */

    public java.util.List<String> getAdMarkers() {
        return adMarkers;
    }

    /**
     * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each
     * SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * 
     * @param adMarkers
     *        Choose the ad marker type for this output group. MediaLive will create a message based on the content of
     *        each SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * @see RtmpAdMarkers
     */

    public void setAdMarkers(java.util.Collection<String> adMarkers) {
        if (adMarkers == null) {
            this.adMarkers = null;
            return;
        }

        this.adMarkers = new java.util.ArrayList<String>(adMarkers);
    }

    /**
     * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each
     * SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdMarkers(java.util.Collection)} or {@link #withAdMarkers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param adMarkers
     *        Choose the ad marker type for this output group. MediaLive will create a message based on the content of
     *        each SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpAdMarkers
     */

    public RtmpGroupSettings withAdMarkers(String... adMarkers) {
        if (this.adMarkers == null) {
            setAdMarkers(new java.util.ArrayList<String>(adMarkers.length));
        }
        for (String ele : adMarkers) {
            this.adMarkers.add(ele);
        }
        return this;
    }

    /**
     * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each
     * SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * 
     * @param adMarkers
     *        Choose the ad marker type for this output group. MediaLive will create a message based on the content of
     *        each SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpAdMarkers
     */

    public RtmpGroupSettings withAdMarkers(java.util.Collection<String> adMarkers) {
        setAdMarkers(adMarkers);
        return this;
    }

    /**
     * Choose the ad marker type for this output group. MediaLive will create a message based on the content of each
     * SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * 
     * @param adMarkers
     *        Choose the ad marker type for this output group. MediaLive will create a message based on the content of
     *        each SCTE-35 message, format it for that marker type, and insert it in the datastream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpAdMarkers
     */

    public RtmpGroupSettings withAdMarkers(RtmpAdMarkers... adMarkers) {
        java.util.ArrayList<String> adMarkersCopy = new java.util.ArrayList<String>(adMarkers.length);
        for (RtmpAdMarkers value : adMarkers) {
            adMarkersCopy.add(value.toString());
        }
        if (getAdMarkers() == null) {
            setAdMarkers(adMarkersCopy);
        } else {
            getAdMarkers().addAll(adMarkersCopy);
        }
        return this;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * 
     * @param authenticationScheme
     *        Authentication scheme to use when connecting with CDN
     * @see AuthenticationScheme
     */

    public void setAuthenticationScheme(String authenticationScheme) {
        this.authenticationScheme = authenticationScheme;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * 
     * @return Authentication scheme to use when connecting with CDN
     * @see AuthenticationScheme
     */

    public String getAuthenticationScheme() {
        return this.authenticationScheme;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * 
     * @param authenticationScheme
     *        Authentication scheme to use when connecting with CDN
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationScheme
     */

    public RtmpGroupSettings withAuthenticationScheme(String authenticationScheme) {
        setAuthenticationScheme(authenticationScheme);
        return this;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * 
     * @param authenticationScheme
     *        Authentication scheme to use when connecting with CDN
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationScheme
     */

    public RtmpGroupSettings withAuthenticationScheme(AuthenticationScheme authenticationScheme) {
        this.authenticationScheme = authenticationScheme.toString();
        return this;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not
     * accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by
     * cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force
     * a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP
     * output will wait up to 5 minutes to allow the origin server to begin accepting data again.
     * 
     * @param cacheFullBehavior
     *        Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does
     *        not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration
     *        specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the
     *        RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If
     *        set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin
     *        accepting data again.
     * @see RtmpCacheFullBehavior
     */

    public void setCacheFullBehavior(String cacheFullBehavior) {
        this.cacheFullBehavior = cacheFullBehavior;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not
     * accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by
     * cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force
     * a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP
     * output will wait up to 5 minutes to allow the origin server to begin accepting data again.
     * 
     * @return Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and
     *         does not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration
     *         specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the
     *         RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If
     *         set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin
     *         accepting data again.
     * @see RtmpCacheFullBehavior
     */

    public String getCacheFullBehavior() {
        return this.cacheFullBehavior;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not
     * accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by
     * cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force
     * a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP
     * output will wait up to 5 minutes to allow the origin server to begin accepting data again.
     * 
     * @param cacheFullBehavior
     *        Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does
     *        not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration
     *        specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the
     *        RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If
     *        set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin
     *        accepting data again.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpCacheFullBehavior
     */

    public RtmpGroupSettings withCacheFullBehavior(String cacheFullBehavior) {
        setCacheFullBehavior(cacheFullBehavior);
        return this;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not
     * accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by
     * cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force
     * a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP
     * output will wait up to 5 minutes to allow the origin server to begin accepting data again.
     * 
     * @param cacheFullBehavior
     *        Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does
     *        not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration
     *        specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the
     *        RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If
     *        set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin
     *        accepting data again.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpCacheFullBehavior
     */

    public RtmpGroupSettings withCacheFullBehavior(RtmpCacheFullBehavior cacheFullBehavior) {
        this.cacheFullBehavior = cacheFullBehavior.toString();
        return this;
    }

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * 
     * @param cacheLength
     *        Cache length, in seconds, is used to calculate buffer size.
     */

    public void setCacheLength(Integer cacheLength) {
        this.cacheLength = cacheLength;
    }

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * 
     * @return Cache length, in seconds, is used to calculate buffer size.
     */

    public Integer getCacheLength() {
        return this.cacheLength;
    }

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * 
     * @param cacheLength
     *        Cache length, in seconds, is used to calculate buffer size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RtmpGroupSettings withCacheLength(Integer cacheLength) {
        setCacheLength(cacheLength);
        return this;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried DTVCC
     * data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both
     * fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
     * 
     * @param captionData
     *        Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried
     *        DTVCC data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608
     *        data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1
     *        video will be passed.
     * @see RtmpCaptionData
     */

    public void setCaptionData(String captionData) {
        this.captionData = captionData;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried DTVCC
     * data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both
     * fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
     * 
     * @return Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried
     *         DTVCC data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608
     *         data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field
     *         1 video will be passed.
     * @see RtmpCaptionData
     */

    public String getCaptionData() {
        return this.captionData;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried DTVCC
     * data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both
     * fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
     * 
     * @param captionData
     *        Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried
     *        DTVCC data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608
     *        data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1
     *        video will be passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpCaptionData
     */

    public RtmpGroupSettings withCaptionData(String captionData) {
        setCaptionData(captionData);
        return this;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried DTVCC
     * data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both
     * fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
     * 
     * @param captionData
     *        Controls the types of data that passes to onCaptionInfo outputs. If set to 'all' then 608 and 708 carried
     *        DTVCC data will be passed. If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608
     *        data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1
     *        video will be passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RtmpCaptionData
     */

    public RtmpGroupSettings withCaptionData(RtmpCaptionData captionData) {
        this.captionData = captionData.toString();
        return this;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     * - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns. This
     * does not close the underlying RTMP connection.
     * 
     * @param inputLossAction
     *        Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     *        - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns.
     *        This does not close the underlying RTMP connection.
     * @see InputLossActionForRtmpOut
     */

    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     * - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns. This
     * does not close the underlying RTMP connection.
     * 
     * @return Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     *         - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input
     *         returns. This does not close the underlying RTMP connection.
     * @see InputLossActionForRtmpOut
     */

    public String getInputLossAction() {
        return this.inputLossAction;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     * - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns. This
     * does not close the underlying RTMP connection.
     * 
     * @param inputLossAction
     *        Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     *        - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns.
     *        This does not close the underlying RTMP connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForRtmpOut
     */

    public RtmpGroupSettings withInputLossAction(String inputLossAction) {
        setInputLossAction(inputLossAction);
        return this;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     * - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns. This
     * does not close the underlying RTMP connection.
     * 
     * @param inputLossAction
     *        Controls the behavior of this RTMP group if input becomes unavailable.
     * 
     *        - emitOutput: Emit a slate until input returns. - pauseOutput: Stop transmitting data until input returns.
     *        This does not close the underlying RTMP connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossActionForRtmpOut
     */

    public RtmpGroupSettings withInputLossAction(InputLossActionForRtmpOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     * 
     * @param restartDelay
     *        If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means
     *        never restart.
     */

    public void setRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     * 
     * @return If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means
     *         never restart.
     */

    public Integer getRestartDelay() {
        return this.restartDelay;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     * 
     * @param restartDelay
     *        If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means
     *        never restart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RtmpGroupSettings withRestartDelay(Integer restartDelay) {
        setRestartDelay(restartDelay);
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
        if (getAdMarkers() != null)
            sb.append("AdMarkers: ").append(getAdMarkers()).append(",");
        if (getAuthenticationScheme() != null)
            sb.append("AuthenticationScheme: ").append(getAuthenticationScheme()).append(",");
        if (getCacheFullBehavior() != null)
            sb.append("CacheFullBehavior: ").append(getCacheFullBehavior()).append(",");
        if (getCacheLength() != null)
            sb.append("CacheLength: ").append(getCacheLength()).append(",");
        if (getCaptionData() != null)
            sb.append("CaptionData: ").append(getCaptionData()).append(",");
        if (getInputLossAction() != null)
            sb.append("InputLossAction: ").append(getInputLossAction()).append(",");
        if (getRestartDelay() != null)
            sb.append("RestartDelay: ").append(getRestartDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RtmpGroupSettings == false)
            return false;
        RtmpGroupSettings other = (RtmpGroupSettings) obj;
        if (other.getAdMarkers() == null ^ this.getAdMarkers() == null)
            return false;
        if (other.getAdMarkers() != null && other.getAdMarkers().equals(this.getAdMarkers()) == false)
            return false;
        if (other.getAuthenticationScheme() == null ^ this.getAuthenticationScheme() == null)
            return false;
        if (other.getAuthenticationScheme() != null && other.getAuthenticationScheme().equals(this.getAuthenticationScheme()) == false)
            return false;
        if (other.getCacheFullBehavior() == null ^ this.getCacheFullBehavior() == null)
            return false;
        if (other.getCacheFullBehavior() != null && other.getCacheFullBehavior().equals(this.getCacheFullBehavior()) == false)
            return false;
        if (other.getCacheLength() == null ^ this.getCacheLength() == null)
            return false;
        if (other.getCacheLength() != null && other.getCacheLength().equals(this.getCacheLength()) == false)
            return false;
        if (other.getCaptionData() == null ^ this.getCaptionData() == null)
            return false;
        if (other.getCaptionData() != null && other.getCaptionData().equals(this.getCaptionData()) == false)
            return false;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getRestartDelay() == null ^ this.getRestartDelay() == null)
            return false;
        if (other.getRestartDelay() != null && other.getRestartDelay().equals(this.getRestartDelay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkers() == null) ? 0 : getAdMarkers().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationScheme() == null) ? 0 : getAuthenticationScheme().hashCode());
        hashCode = prime * hashCode + ((getCacheFullBehavior() == null) ? 0 : getCacheFullBehavior().hashCode());
        hashCode = prime * hashCode + ((getCacheLength() == null) ? 0 : getCacheLength().hashCode());
        hashCode = prime * hashCode + ((getCaptionData() == null) ? 0 : getCaptionData().hashCode());
        hashCode = prime * hashCode + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode + ((getRestartDelay() == null) ? 0 : getRestartDelay().hashCode());
        return hashCode;
    }

    @Override
    public RtmpGroupSettings clone() {
        try {
            return (RtmpGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.RtmpGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
