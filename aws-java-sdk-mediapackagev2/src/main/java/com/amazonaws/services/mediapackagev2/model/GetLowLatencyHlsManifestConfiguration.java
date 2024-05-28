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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieve the low-latency HTTP live streaming (HLS) manifest configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetLowLatencyHlsManifestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLowLatencyHlsManifestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     */
    private String manifestName;
    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     */
    private String url;
    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     */
    private String childManifestName;
    /**
     * <p>
     * The total duration (in seconds) of the manifest's content.
     * </p>
     */
    private Integer manifestWindowSeconds;
    /**
     * <p>
     * Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you don't enter
     * an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the stream to the wall
     * clock so that viewers can seek to a specific time in the playback timeline on the player. ID3Timed metadata
     * messages generate every 5 seconds whenever the content is ingested.
     * </p>
     * <p>
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the HLS
     * output.
     * </p>
     */
    private Integer programDateTimeIntervalSeconds;

    private ScteHls scteHls;

    private FilterConfiguration filterConfiguration;

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     * 
     * @param manifestName
     *        A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     *        automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use
     *        HLS manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the
     *        manifestName you provided on the originEndpoint object.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     * 
     * @return A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *         endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     *         automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you
     *         use HLS manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the
     *         manifestName you provided on the originEndpoint object.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     * 
     * @param manifestName
     *        A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     *        automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use
     *        HLS manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the
     *        manifestName you provided on the originEndpoint object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @param url
     *        The egress domain URL for stream delivery from MediaPackage.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @return The egress domain URL for stream delivery from MediaPackage.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @param url
     *        The egress domain URL for stream delivery from MediaPackage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     * 
     * @param childManifestName
     *        A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     *        manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint
     *        object.
     */

    public void setChildManifestName(String childManifestName) {
        this.childManifestName = childManifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     * 
     * @return A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     *         endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     *         manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint
     *         object.
     */

    public String getChildManifestName() {
        return this.childManifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     * 
     * @param childManifestName
     *        A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     *        manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withChildManifestName(String childManifestName) {
        setChildManifestName(childManifestName);
        return this;
    }

    /**
     * <p>
     * The total duration (in seconds) of the manifest's content.
     * </p>
     * 
     * @param manifestWindowSeconds
     *        The total duration (in seconds) of the manifest's content.
     */

    public void setManifestWindowSeconds(Integer manifestWindowSeconds) {
        this.manifestWindowSeconds = manifestWindowSeconds;
    }

    /**
     * <p>
     * The total duration (in seconds) of the manifest's content.
     * </p>
     * 
     * @return The total duration (in seconds) of the manifest's content.
     */

    public Integer getManifestWindowSeconds() {
        return this.manifestWindowSeconds;
    }

    /**
     * <p>
     * The total duration (in seconds) of the manifest's content.
     * </p>
     * 
     * @param manifestWindowSeconds
     *        The total duration (in seconds) of the manifest's content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withManifestWindowSeconds(Integer manifestWindowSeconds) {
        setManifestWindowSeconds(manifestWindowSeconds);
        return this;
    }

    /**
     * <p>
     * Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you don't enter
     * an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the stream to the wall
     * clock so that viewers can seek to a specific time in the playback timeline on the player. ID3Timed metadata
     * messages generate every 5 seconds whenever the content is ingested.
     * </p>
     * <p>
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the HLS
     * output.
     * </p>
     * 
     * @param programDateTimeIntervalSeconds
     *        Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you don't
     *        enter an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the stream
     *        to the wall clock so that viewers can seek to a specific time in the playback timeline on the player.
     *        ID3Timed metadata messages generate every 5 seconds whenever the content is ingested.</p>
     *        <p>
     *        Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the
     *        HLS output.
     */

    public void setProgramDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
    }

    /**
     * <p>
     * Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you don't enter
     * an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the stream to the wall
     * clock so that viewers can seek to a specific time in the playback timeline on the player. ID3Timed metadata
     * messages generate every 5 seconds whenever the content is ingested.
     * </p>
     * <p>
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the HLS
     * output.
     * </p>
     * 
     * @return Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you
     *         don't enter an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the
     *         stream to the wall clock so that viewers can seek to a specific time in the playback timeline on the
     *         player. ID3Timed metadata messages generate every 5 seconds whenever the content is ingested.</p>
     *         <p>
     *         Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the
     *         HLS output.
     */

    public Integer getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds;
    }

    /**
     * <p>
     * Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you don't enter
     * an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the stream to the wall
     * clock so that viewers can seek to a specific time in the playback timeline on the player. ID3Timed metadata
     * messages generate every 5 seconds whenever the content is ingested.
     * </p>
     * <p>
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the HLS
     * output.
     * </p>
     * 
     * @param programDateTimeIntervalSeconds
     *        Inserts EXT-X-PROGRAM-DATE-TIME tags in the output manifest at the interval that you specify. If you don't
     *        enter an interval, EXT-X-PROGRAM-DATE-TIME tags aren't included in the manifest. The tags sync the stream
     *        to the wall clock so that viewers can seek to a specific time in the playback timeline on the player.
     *        ID3Timed metadata messages generate every 5 seconds whenever the content is ingested.</p>
     *        <p>
     *        Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed through to the
     *        HLS output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withProgramDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
        setProgramDateTimeIntervalSeconds(programDateTimeIntervalSeconds);
        return this;
    }

    /**
     * @param scteHls
     */

    public void setScteHls(ScteHls scteHls) {
        this.scteHls = scteHls;
    }

    /**
     * @return
     */

    public ScteHls getScteHls() {
        return this.scteHls;
    }

    /**
     * @param scteHls
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withScteHls(ScteHls scteHls) {
        setScteHls(scteHls);
        return this;
    }

    /**
     * @param filterConfiguration
     */

    public void setFilterConfiguration(FilterConfiguration filterConfiguration) {
        this.filterConfiguration = filterConfiguration;
    }

    /**
     * @return
     */

    public FilterConfiguration getFilterConfiguration() {
        return this.filterConfiguration;
    }

    /**
     * @param filterConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLowLatencyHlsManifestConfiguration withFilterConfiguration(FilterConfiguration filterConfiguration) {
        setFilterConfiguration(filterConfiguration);
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
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getChildManifestName() != null)
            sb.append("ChildManifestName: ").append(getChildManifestName()).append(",");
        if (getManifestWindowSeconds() != null)
            sb.append("ManifestWindowSeconds: ").append(getManifestWindowSeconds()).append(",");
        if (getProgramDateTimeIntervalSeconds() != null)
            sb.append("ProgramDateTimeIntervalSeconds: ").append(getProgramDateTimeIntervalSeconds()).append(",");
        if (getScteHls() != null)
            sb.append("ScteHls: ").append(getScteHls()).append(",");
        if (getFilterConfiguration() != null)
            sb.append("FilterConfiguration: ").append(getFilterConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLowLatencyHlsManifestConfiguration == false)
            return false;
        GetLowLatencyHlsManifestConfiguration other = (GetLowLatencyHlsManifestConfiguration) obj;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getChildManifestName() == null ^ this.getChildManifestName() == null)
            return false;
        if (other.getChildManifestName() != null && other.getChildManifestName().equals(this.getChildManifestName()) == false)
            return false;
        if (other.getManifestWindowSeconds() == null ^ this.getManifestWindowSeconds() == null)
            return false;
        if (other.getManifestWindowSeconds() != null && other.getManifestWindowSeconds().equals(this.getManifestWindowSeconds()) == false)
            return false;
        if (other.getProgramDateTimeIntervalSeconds() == null ^ this.getProgramDateTimeIntervalSeconds() == null)
            return false;
        if (other.getProgramDateTimeIntervalSeconds() != null
                && other.getProgramDateTimeIntervalSeconds().equals(this.getProgramDateTimeIntervalSeconds()) == false)
            return false;
        if (other.getScteHls() == null ^ this.getScteHls() == null)
            return false;
        if (other.getScteHls() != null && other.getScteHls().equals(this.getScteHls()) == false)
            return false;
        if (other.getFilterConfiguration() == null ^ this.getFilterConfiguration() == null)
            return false;
        if (other.getFilterConfiguration() != null && other.getFilterConfiguration().equals(this.getFilterConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getChildManifestName() == null) ? 0 : getChildManifestName().hashCode());
        hashCode = prime * hashCode + ((getManifestWindowSeconds() == null) ? 0 : getManifestWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getProgramDateTimeIntervalSeconds() == null) ? 0 : getProgramDateTimeIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getScteHls() == null) ? 0 : getScteHls().hashCode());
        hashCode = prime * hashCode + ((getFilterConfiguration() == null) ? 0 : getFilterConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetLowLatencyHlsManifestConfiguration clone() {
        try {
            return (GetLowLatencyHlsManifestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.GetLowLatencyHlsManifestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
