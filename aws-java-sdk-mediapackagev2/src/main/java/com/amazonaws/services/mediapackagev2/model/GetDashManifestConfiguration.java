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
 * Retrieve the DASH manifest configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetDashManifestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDashManifestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
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
     * The total duration (in seconds) of the manifest's content.
     * </p>
     */
    private Integer manifestWindowSeconds;

    private FilterConfiguration filterConfiguration;
    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * </p>
     */
    private Integer minUpdatePeriodSeconds;
    /**
     * <p>
     * Minimum amount of content (in seconds) that a player must keep available in the buffer.
     * </p>
     */
    private Integer minBufferTimeSeconds;
    /**
     * <p>
     * The amount of time (in seconds) that the player should be from the end of the manifest.
     * </p>
     */
    private Integer suggestedPresentationDelaySeconds;
    /**
     * <p>
     * Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag in the
     * manifest. Also specifies if segment timeline information is included in <code>SegmentTimeline</code> or
     * <code>SegmentTemplate</code>.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code> URL. The
     * value of this variable is the sequential number of the segment. A full <code>SegmentTimeline</code> object is
     * presented in each <code>SegmentTemplate</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String segmentTemplateFormat;
    /**
     * <p>
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into multiple
     * periods. Leave this value empty to indicate that the manifest is contained all in one period. For more
     * information about periods in the DASH manifest, see <a
     * href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in AWS
     * Elemental MediaPackage</a>.
     * </p>
     */
    private java.util.List<String> periodTriggers;
    /**
     * <p>
     * The SCTE configuration.
     * </p>
     */
    private ScteDash scteDash;
    /**
     * <p>
     * Determines how the DASH manifest signals the DRM content.
     * </p>
     */
    private String drmSignaling;
    /**
     * <p>
     * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     * </p>
     */
    private DashUtcTiming utcTiming;

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     * 
     * @param manifestName
     *        A short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     * 
     * @return A short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *         endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     * 
     * @param manifestName
     *        A short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashManifestConfiguration withManifestName(String manifestName) {
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

    public GetDashManifestConfiguration withUrl(String url) {
        setUrl(url);
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

    public GetDashManifestConfiguration withManifestWindowSeconds(Integer manifestWindowSeconds) {
        setManifestWindowSeconds(manifestWindowSeconds);
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

    public GetDashManifestConfiguration withFilterConfiguration(FilterConfiguration filterConfiguration) {
        setFilterConfiguration(filterConfiguration);
        return this;
    }

    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * </p>
     * 
     * @param minUpdatePeriodSeconds
     *        Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     */

    public void setMinUpdatePeriodSeconds(Integer minUpdatePeriodSeconds) {
        this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
    }

    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * </p>
     * 
     * @return Minimum amount of time (in seconds) that the player should wait before requesting updates to the
     *         manifest.
     */

    public Integer getMinUpdatePeriodSeconds() {
        return this.minUpdatePeriodSeconds;
    }

    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * </p>
     * 
     * @param minUpdatePeriodSeconds
     *        Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashManifestConfiguration withMinUpdatePeriodSeconds(Integer minUpdatePeriodSeconds) {
        setMinUpdatePeriodSeconds(minUpdatePeriodSeconds);
        return this;
    }

    /**
     * <p>
     * Minimum amount of content (in seconds) that a player must keep available in the buffer.
     * </p>
     * 
     * @param minBufferTimeSeconds
     *        Minimum amount of content (in seconds) that a player must keep available in the buffer.
     */

    public void setMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        this.minBufferTimeSeconds = minBufferTimeSeconds;
    }

    /**
     * <p>
     * Minimum amount of content (in seconds) that a player must keep available in the buffer.
     * </p>
     * 
     * @return Minimum amount of content (in seconds) that a player must keep available in the buffer.
     */

    public Integer getMinBufferTimeSeconds() {
        return this.minBufferTimeSeconds;
    }

    /**
     * <p>
     * Minimum amount of content (in seconds) that a player must keep available in the buffer.
     * </p>
     * 
     * @param minBufferTimeSeconds
     *        Minimum amount of content (in seconds) that a player must keep available in the buffer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashManifestConfiguration withMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        setMinBufferTimeSeconds(minBufferTimeSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the player should be from the end of the manifest.
     * </p>
     * 
     * @param suggestedPresentationDelaySeconds
     *        The amount of time (in seconds) that the player should be from the end of the manifest.
     */

    public void setSuggestedPresentationDelaySeconds(Integer suggestedPresentationDelaySeconds) {
        this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the player should be from the end of the manifest.
     * </p>
     * 
     * @return The amount of time (in seconds) that the player should be from the end of the manifest.
     */

    public Integer getSuggestedPresentationDelaySeconds() {
        return this.suggestedPresentationDelaySeconds;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the player should be from the end of the manifest.
     * </p>
     * 
     * @param suggestedPresentationDelaySeconds
     *        The amount of time (in seconds) that the player should be from the end of the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashManifestConfiguration withSuggestedPresentationDelaySeconds(Integer suggestedPresentationDelaySeconds) {
        setSuggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds);
        return this;
    }

    /**
     * <p>
     * Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag in the
     * manifest. Also specifies if segment timeline information is included in <code>SegmentTimeline</code> or
     * <code>SegmentTemplate</code>.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code> URL. The
     * value of this variable is the sequential number of the segment. A full <code>SegmentTimeline</code> object is
     * presented in each <code>SegmentTemplate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentTemplateFormat
     *        Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag
     *        in the manifest. Also specifies if segment timeline information is included in
     *        <code>SegmentTimeline</code> or <code>SegmentTemplate</code>.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code>
     *        URL. The value of this variable is the sequential number of the segment. A full
     *        <code>SegmentTimeline</code> object is presented in each <code>SegmentTemplate</code>.
     *        </p>
     *        </li>
     * @see DashSegmentTemplateFormat
     */

    public void setSegmentTemplateFormat(String segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat;
    }

    /**
     * <p>
     * Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag in the
     * manifest. Also specifies if segment timeline information is included in <code>SegmentTimeline</code> or
     * <code>SegmentTemplate</code>.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code> URL. The
     * value of this variable is the sequential number of the segment. A full <code>SegmentTimeline</code> object is
     * presented in each <code>SegmentTemplate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code>
     *         tag in the manifest. Also specifies if segment timeline information is included in
     *         <code>SegmentTimeline</code> or <code>SegmentTemplate</code>.</p>
     *         <p>
     *         Value description:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code>
     *         URL. The value of this variable is the sequential number of the segment. A full
     *         <code>SegmentTimeline</code> object is presented in each <code>SegmentTemplate</code>.
     *         </p>
     *         </li>
     * @see DashSegmentTemplateFormat
     */

    public String getSegmentTemplateFormat() {
        return this.segmentTemplateFormat;
    }

    /**
     * <p>
     * Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag in the
     * manifest. Also specifies if segment timeline information is included in <code>SegmentTimeline</code> or
     * <code>SegmentTemplate</code>.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code> URL. The
     * value of this variable is the sequential number of the segment. A full <code>SegmentTimeline</code> object is
     * presented in each <code>SegmentTemplate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentTemplateFormat
     *        Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag
     *        in the manifest. Also specifies if segment timeline information is included in
     *        <code>SegmentTimeline</code> or <code>SegmentTemplate</code>.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code>
     *        URL. The value of this variable is the sequential number of the segment. A full
     *        <code>SegmentTimeline</code> object is presented in each <code>SegmentTemplate</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashSegmentTemplateFormat
     */

    public GetDashManifestConfiguration withSegmentTemplateFormat(String segmentTemplateFormat) {
        setSegmentTemplateFormat(segmentTemplateFormat);
        return this;
    }

    /**
     * <p>
     * Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag in the
     * manifest. Also specifies if segment timeline information is included in <code>SegmentTimeline</code> or
     * <code>SegmentTemplate</code>.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code> URL. The
     * value of this variable is the sequential number of the segment. A full <code>SegmentTimeline</code> object is
     * presented in each <code>SegmentTemplate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param segmentTemplateFormat
     *        Determines the type of variable used in the <code>media</code> URL of the <code>SegmentTemplate</code> tag
     *        in the manifest. Also specifies if segment timeline information is included in
     *        <code>SegmentTimeline</code> or <code>SegmentTemplate</code>.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NUMBER_WITH_TIMELINE</code> - The <code>$Number$</code> variable is used in the <code>media</code>
     *        URL. The value of this variable is the sequential number of the segment. A full
     *        <code>SegmentTimeline</code> object is presented in each <code>SegmentTemplate</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashSegmentTemplateFormat
     */

    public GetDashManifestConfiguration withSegmentTemplateFormat(DashSegmentTemplateFormat segmentTemplateFormat) {
        this.segmentTemplateFormat = segmentTemplateFormat.toString();
        return this;
    }

    /**
     * <p>
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into multiple
     * periods. Leave this value empty to indicate that the manifest is contained all in one period. For more
     * information about periods in the DASH manifest, see <a
     * href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in AWS
     * Elemental MediaPackage</a>.
     * </p>
     * 
     * @return A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into
     *         multiple periods. Leave this value empty to indicate that the manifest is contained all in one period.
     *         For more information about periods in the DASH manifest, see <a
     *         href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in
     *         AWS Elemental MediaPackage</a>.
     * @see DashPeriodTrigger
     */

    public java.util.List<String> getPeriodTriggers() {
        return periodTriggers;
    }

    /**
     * <p>
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into multiple
     * periods. Leave this value empty to indicate that the manifest is contained all in one period. For more
     * information about periods in the DASH manifest, see <a
     * href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in AWS
     * Elemental MediaPackage</a>.
     * </p>
     * 
     * @param periodTriggers
     *        A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into
     *        multiple periods. Leave this value empty to indicate that the manifest is contained all in one period. For
     *        more information about periods in the DASH manifest, see <a
     *        href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in
     *        AWS Elemental MediaPackage</a>.
     * @see DashPeriodTrigger
     */

    public void setPeriodTriggers(java.util.Collection<String> periodTriggers) {
        if (periodTriggers == null) {
            this.periodTriggers = null;
            return;
        }

        this.periodTriggers = new java.util.ArrayList<String>(periodTriggers);
    }

    /**
     * <p>
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into multiple
     * periods. Leave this value empty to indicate that the manifest is contained all in one period. For more
     * information about periods in the DASH manifest, see <a
     * href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in AWS
     * Elemental MediaPackage</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPeriodTriggers(java.util.Collection)} or {@link #withPeriodTriggers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param periodTriggers
     *        A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into
     *        multiple periods. Leave this value empty to indicate that the manifest is contained all in one period. For
     *        more information about periods in the DASH manifest, see <a
     *        href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in
     *        AWS Elemental MediaPackage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashPeriodTrigger
     */

    public GetDashManifestConfiguration withPeriodTriggers(String... periodTriggers) {
        if (this.periodTriggers == null) {
            setPeriodTriggers(new java.util.ArrayList<String>(periodTriggers.length));
        }
        for (String ele : periodTriggers) {
            this.periodTriggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into multiple
     * periods. Leave this value empty to indicate that the manifest is contained all in one period. For more
     * information about periods in the DASH manifest, see <a
     * href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in AWS
     * Elemental MediaPackage</a>.
     * </p>
     * 
     * @param periodTriggers
     *        A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into
     *        multiple periods. Leave this value empty to indicate that the manifest is contained all in one period. For
     *        more information about periods in the DASH manifest, see <a
     *        href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in
     *        AWS Elemental MediaPackage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashPeriodTrigger
     */

    public GetDashManifestConfiguration withPeriodTriggers(java.util.Collection<String> periodTriggers) {
        setPeriodTriggers(periodTriggers);
        return this;
    }

    /**
     * <p>
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into multiple
     * periods. Leave this value empty to indicate that the manifest is contained all in one period. For more
     * information about periods in the DASH manifest, see <a
     * href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in AWS
     * Elemental MediaPackage</a>.
     * </p>
     * 
     * @param periodTriggers
     *        A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH manifest into
     *        multiple periods. Leave this value empty to indicate that the manifest is contained all in one period. For
     *        more information about periods in the DASH manifest, see <a
     *        href="https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html">Multi-period DASH in
     *        AWS Elemental MediaPackage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashPeriodTrigger
     */

    public GetDashManifestConfiguration withPeriodTriggers(DashPeriodTrigger... periodTriggers) {
        java.util.ArrayList<String> periodTriggersCopy = new java.util.ArrayList<String>(periodTriggers.length);
        for (DashPeriodTrigger value : periodTriggers) {
            periodTriggersCopy.add(value.toString());
        }
        if (getPeriodTriggers() == null) {
            setPeriodTriggers(periodTriggersCopy);
        } else {
            getPeriodTriggers().addAll(periodTriggersCopy);
        }
        return this;
    }

    /**
     * <p>
     * The SCTE configuration.
     * </p>
     * 
     * @param scteDash
     *        The SCTE configuration.
     */

    public void setScteDash(ScteDash scteDash) {
        this.scteDash = scteDash;
    }

    /**
     * <p>
     * The SCTE configuration.
     * </p>
     * 
     * @return The SCTE configuration.
     */

    public ScteDash getScteDash() {
        return this.scteDash;
    }

    /**
     * <p>
     * The SCTE configuration.
     * </p>
     * 
     * @param scteDash
     *        The SCTE configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashManifestConfiguration withScteDash(ScteDash scteDash) {
        setScteDash(scteDash);
        return this;
    }

    /**
     * <p>
     * Determines how the DASH manifest signals the DRM content.
     * </p>
     * 
     * @param drmSignaling
     *        Determines how the DASH manifest signals the DRM content.
     * @see DashDrmSignaling
     */

    public void setDrmSignaling(String drmSignaling) {
        this.drmSignaling = drmSignaling;
    }

    /**
     * <p>
     * Determines how the DASH manifest signals the DRM content.
     * </p>
     * 
     * @return Determines how the DASH manifest signals the DRM content.
     * @see DashDrmSignaling
     */

    public String getDrmSignaling() {
        return this.drmSignaling;
    }

    /**
     * <p>
     * Determines how the DASH manifest signals the DRM content.
     * </p>
     * 
     * @param drmSignaling
     *        Determines how the DASH manifest signals the DRM content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashDrmSignaling
     */

    public GetDashManifestConfiguration withDrmSignaling(String drmSignaling) {
        setDrmSignaling(drmSignaling);
        return this;
    }

    /**
     * <p>
     * Determines how the DASH manifest signals the DRM content.
     * </p>
     * 
     * @param drmSignaling
     *        Determines how the DASH manifest signals the DRM content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashDrmSignaling
     */

    public GetDashManifestConfiguration withDrmSignaling(DashDrmSignaling drmSignaling) {
        this.drmSignaling = drmSignaling.toString();
        return this;
    }

    /**
     * <p>
     * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     * </p>
     * 
     * @param utcTiming
     *        Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     */

    public void setUtcTiming(DashUtcTiming utcTiming) {
        this.utcTiming = utcTiming;
    }

    /**
     * <p>
     * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     * </p>
     * 
     * @return Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     */

    public DashUtcTiming getUtcTiming() {
        return this.utcTiming;
    }

    /**
     * <p>
     * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     * </p>
     * 
     * @param utcTiming
     *        Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDashManifestConfiguration withUtcTiming(DashUtcTiming utcTiming) {
        setUtcTiming(utcTiming);
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
        if (getManifestWindowSeconds() != null)
            sb.append("ManifestWindowSeconds: ").append(getManifestWindowSeconds()).append(",");
        if (getFilterConfiguration() != null)
            sb.append("FilterConfiguration: ").append(getFilterConfiguration()).append(",");
        if (getMinUpdatePeriodSeconds() != null)
            sb.append("MinUpdatePeriodSeconds: ").append(getMinUpdatePeriodSeconds()).append(",");
        if (getMinBufferTimeSeconds() != null)
            sb.append("MinBufferTimeSeconds: ").append(getMinBufferTimeSeconds()).append(",");
        if (getSuggestedPresentationDelaySeconds() != null)
            sb.append("SuggestedPresentationDelaySeconds: ").append(getSuggestedPresentationDelaySeconds()).append(",");
        if (getSegmentTemplateFormat() != null)
            sb.append("SegmentTemplateFormat: ").append(getSegmentTemplateFormat()).append(",");
        if (getPeriodTriggers() != null)
            sb.append("PeriodTriggers: ").append(getPeriodTriggers()).append(",");
        if (getScteDash() != null)
            sb.append("ScteDash: ").append(getScteDash()).append(",");
        if (getDrmSignaling() != null)
            sb.append("DrmSignaling: ").append(getDrmSignaling()).append(",");
        if (getUtcTiming() != null)
            sb.append("UtcTiming: ").append(getUtcTiming());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDashManifestConfiguration == false)
            return false;
        GetDashManifestConfiguration other = (GetDashManifestConfiguration) obj;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getManifestWindowSeconds() == null ^ this.getManifestWindowSeconds() == null)
            return false;
        if (other.getManifestWindowSeconds() != null && other.getManifestWindowSeconds().equals(this.getManifestWindowSeconds()) == false)
            return false;
        if (other.getFilterConfiguration() == null ^ this.getFilterConfiguration() == null)
            return false;
        if (other.getFilterConfiguration() != null && other.getFilterConfiguration().equals(this.getFilterConfiguration()) == false)
            return false;
        if (other.getMinUpdatePeriodSeconds() == null ^ this.getMinUpdatePeriodSeconds() == null)
            return false;
        if (other.getMinUpdatePeriodSeconds() != null && other.getMinUpdatePeriodSeconds().equals(this.getMinUpdatePeriodSeconds()) == false)
            return false;
        if (other.getMinBufferTimeSeconds() == null ^ this.getMinBufferTimeSeconds() == null)
            return false;
        if (other.getMinBufferTimeSeconds() != null && other.getMinBufferTimeSeconds().equals(this.getMinBufferTimeSeconds()) == false)
            return false;
        if (other.getSuggestedPresentationDelaySeconds() == null ^ this.getSuggestedPresentationDelaySeconds() == null)
            return false;
        if (other.getSuggestedPresentationDelaySeconds() != null
                && other.getSuggestedPresentationDelaySeconds().equals(this.getSuggestedPresentationDelaySeconds()) == false)
            return false;
        if (other.getSegmentTemplateFormat() == null ^ this.getSegmentTemplateFormat() == null)
            return false;
        if (other.getSegmentTemplateFormat() != null && other.getSegmentTemplateFormat().equals(this.getSegmentTemplateFormat()) == false)
            return false;
        if (other.getPeriodTriggers() == null ^ this.getPeriodTriggers() == null)
            return false;
        if (other.getPeriodTriggers() != null && other.getPeriodTriggers().equals(this.getPeriodTriggers()) == false)
            return false;
        if (other.getScteDash() == null ^ this.getScteDash() == null)
            return false;
        if (other.getScteDash() != null && other.getScteDash().equals(this.getScteDash()) == false)
            return false;
        if (other.getDrmSignaling() == null ^ this.getDrmSignaling() == null)
            return false;
        if (other.getDrmSignaling() != null && other.getDrmSignaling().equals(this.getDrmSignaling()) == false)
            return false;
        if (other.getUtcTiming() == null ^ this.getUtcTiming() == null)
            return false;
        if (other.getUtcTiming() != null && other.getUtcTiming().equals(this.getUtcTiming()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getManifestWindowSeconds() == null) ? 0 : getManifestWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getFilterConfiguration() == null) ? 0 : getFilterConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMinUpdatePeriodSeconds() == null) ? 0 : getMinUpdatePeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTimeSeconds() == null) ? 0 : getMinBufferTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getSuggestedPresentationDelaySeconds() == null) ? 0 : getSuggestedPresentationDelaySeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentTemplateFormat() == null) ? 0 : getSegmentTemplateFormat().hashCode());
        hashCode = prime * hashCode + ((getPeriodTriggers() == null) ? 0 : getPeriodTriggers().hashCode());
        hashCode = prime * hashCode + ((getScteDash() == null) ? 0 : getScteDash().hashCode());
        hashCode = prime * hashCode + ((getDrmSignaling() == null) ? 0 : getDrmSignaling().hashCode());
        hashCode = prime * hashCode + ((getUtcTiming() == null) ? 0 : getUtcTiming().hashCode());
        return hashCode;
    }

    @Override
    public GetDashManifestConfiguration clone() {
        try {
            return (GetDashManifestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.GetDashManifestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
