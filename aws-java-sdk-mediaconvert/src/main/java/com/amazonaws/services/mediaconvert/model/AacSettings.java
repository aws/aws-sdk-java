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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of
 * two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate
 * control mode (rateControlMode) to "VBR" or "CBR". In VBR mode, you control the audio quality with the setting VBR
 * quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the
 * rate control mode.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AacSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AacSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo
     * pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in
     * AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio
     * description (AD). In this case, the encoder will use any values you provide for AudioType and
     * FollowInputAudioType.
     */
    private String audioDescriptionBroadcasterMix;
    /**
     * Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000,
     * 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000,
     * 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set
     * is also constrained by the values you choose for Profile (codecProfile), Bitrate control mode (codingMode), and
     * Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
     */
    private Integer bitrate;
    /** AAC Profile. */
    private String codecProfile;
    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and
     * profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and
     * emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101
     * 154 Annex E.
     */
    private String codingMode;
    /** Rate Control Mode. */
    private String rateControlMode;
    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for
     * the output container.
     */
    private String rawFormat;
    /** Sample rate in Hz. Valid values depend on rate control mode and profile. */
    private Integer sampleRate;
    /** Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers. */
    private String specification;
    /** VBR Quality Level - Only used if rate_control_mode is VBR. */
    private String vbrQuality;

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo
     * pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in
     * AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio
     * description (AD). In this case, the encoder will use any values you provide for AudioType and
     * FollowInputAudioType.
     * 
     * @param audioDescriptionBroadcasterMix
     *        Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a
     *        stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this
     *        stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed
     *        audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores
     *        any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the input does not
     *        contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you
     *        provide for AudioType and FollowInputAudioType.
     * @see AacAudioDescriptionBroadcasterMix
     */

    public void setAudioDescriptionBroadcasterMix(String audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix;
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo
     * pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in
     * AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio
     * description (AD). In this case, the encoder will use any values you provide for AudioType and
     * FollowInputAudioType.
     * 
     * @return Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a
     *         stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this
     *         stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain
     *         pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the
     *         encoder ignores any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the
     *         input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any
     *         values you provide for AudioType and FollowInputAudioType.
     * @see AacAudioDescriptionBroadcasterMix
     */

    public String getAudioDescriptionBroadcasterMix() {
        return this.audioDescriptionBroadcasterMix;
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo
     * pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in
     * AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio
     * description (AD). In this case, the encoder will use any values you provide for AudioType and
     * FollowInputAudioType.
     * 
     * @param audioDescriptionBroadcasterMix
     *        Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a
     *        stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this
     *        stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed
     *        audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores
     *        any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the input does not
     *        contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you
     *        provide for AudioType and FollowInputAudioType.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacAudioDescriptionBroadcasterMix
     */

    public AacSettings withAudioDescriptionBroadcasterMix(String audioDescriptionBroadcasterMix) {
        setAudioDescriptionBroadcasterMix(audioDescriptionBroadcasterMix);
        return this;
    }

    /**
     * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo
     * pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains
     * "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does
     * not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in
     * AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio
     * description (AD). In this case, the encoder will use any values you provide for AudioType and
     * FollowInputAudioType.
     * 
     * @param audioDescriptionBroadcasterMix
     *        Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a
     *        stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this
     *        stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed
     *        audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores
     *        any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the input does not
     *        contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you
     *        provide for AudioType and FollowInputAudioType.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacAudioDescriptionBroadcasterMix
     */

    public AacSettings withAudioDescriptionBroadcasterMix(AacAudioDescriptionBroadcasterMix audioDescriptionBroadcasterMix) {
        this.audioDescriptionBroadcasterMix = audioDescriptionBroadcasterMix.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000,
     * 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000,
     * 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set
     * is also constrained by the values you choose for Profile (codecProfile), Bitrate control mode (codingMode), and
     * Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000,
     *        14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000,
     *        160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000,
     *        1024000. The value you set is also constrained by the values you choose for Profile (codecProfile),
     *        Bitrate control mode (codingMode), and Sample rate (sampleRate). Default values depend on Bitrate control
     *        mode and Profile.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000,
     * 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000,
     * 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set
     * is also constrained by the values you choose for Profile (codecProfile), Bitrate control mode (codingMode), and
     * Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
     * 
     * @return Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000,
     *         14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000,
     *         160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000,
     *         1024000. The value you set is also constrained by the values you choose for Profile (codecProfile),
     *         Bitrate control mode (codingMode), and Sample rate (sampleRate). Default values depend on Bitrate control
     *         mode and Profile.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000,
     * 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000,
     * 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set
     * is also constrained by the values you choose for Profile (codecProfile), Bitrate control mode (codingMode), and
     * Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. The set of valid values for this setting is: 6000, 8000, 10000, 12000,
     *        14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000,
     *        160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000,
     *        1024000. The value you set is also constrained by the values you choose for Profile (codecProfile),
     *        Bitrate control mode (codingMode), and Sample rate (sampleRate). Default values depend on Bitrate control
     *        mode and Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AacSettings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * AAC Profile.
     * 
     * @param codecProfile
     *        AAC Profile.
     * @see AacCodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * AAC Profile.
     * 
     * @return AAC Profile.
     * @see AacCodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * AAC Profile.
     * 
     * @param codecProfile
     *        AAC Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodecProfile
     */

    public AacSettings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * AAC Profile.
     * 
     * @param codecProfile
     *        AAC Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodecProfile
     */

    public AacSettings withCodecProfile(AacCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and
     * profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and
     * emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101
     * 154 Annex E.
     * 
     * @param codingMode
     *        Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode
     *        and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control
     *        track and emits a mono AAC encode of the description track, with control data emitted in the PES header as
     *        per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */

    public void setCodingMode(String codingMode) {
        this.codingMode = codingMode;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and
     * profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and
     * emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101
     * 154 Annex E.
     * 
     * @return Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode
     *         and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control
     *         track and emits a mono AAC encode of the description track, with control data emitted in the PES header
     *         as per ETSI TS 101 154 Annex E.
     * @see AacCodingMode
     */

    public String getCodingMode() {
        return this.codingMode;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and
     * profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and
     * emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101
     * 154 Annex E.
     * 
     * @param codingMode
     *        Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode
     *        and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control
     *        track and emits a mono AAC encode of the description track, with control data emitted in the PES header as
     *        per ETSI TS 101 154 Annex E.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodingMode
     */

    public AacSettings withCodingMode(String codingMode) {
        setCodingMode(codingMode);
        return this;
    }

    /**
     * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and
     * profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and
     * emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101
     * 154 Annex E.
     * 
     * @param codingMode
     *        Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode
     *        and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control
     *        track and emits a mono AAC encode of the description track, with control data emitted in the PES header as
     *        per ETSI TS 101 154 Annex E.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacCodingMode
     */

    public AacSettings withCodingMode(AacCodingMode codingMode) {
        this.codingMode = codingMode.toString();
        return this;
    }

    /**
     * Rate Control Mode.
     * 
     * @param rateControlMode
     *        Rate Control Mode.
     * @see AacRateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Rate Control Mode.
     * 
     * @return Rate Control Mode.
     * @see AacRateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Rate Control Mode.
     * 
     * @param rateControlMode
     *        Rate Control Mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRateControlMode
     */

    public AacSettings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Rate Control Mode.
     * 
     * @param rateControlMode
     *        Rate Control Mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRateControlMode
     */

    public AacSettings withRateControlMode(AacRateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for
     * the output container.
     * 
     * @param rawFormat
     *        Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose
     *        "No container" for the output container.
     * @see AacRawFormat
     */

    public void setRawFormat(String rawFormat) {
        this.rawFormat = rawFormat;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for
     * the output container.
     * 
     * @return Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose
     *         "No container" for the output container.
     * @see AacRawFormat
     */

    public String getRawFormat() {
        return this.rawFormat;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for
     * the output container.
     * 
     * @param rawFormat
     *        Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose
     *        "No container" for the output container.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRawFormat
     */

    public AacSettings withRawFormat(String rawFormat) {
        setRawFormat(rawFormat);
        return this;
    }

    /**
     * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for
     * the output container.
     * 
     * @param rawFormat
     *        Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose
     *        "No container" for the output container.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacRawFormat
     */

    public AacSettings withRawFormat(AacRawFormat rawFormat) {
        this.rawFormat = rawFormat.toString();
        return this;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @param sampleRate
     *        Sample rate in Hz. Valid values depend on rate control mode and profile.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @return Sample rate in Hz. Valid values depend on rate control mode and profile.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Sample rate in Hz. Valid values depend on rate control mode and profile.
     * 
     * @param sampleRate
     *        Sample rate in Hz. Valid values depend on rate control mode and profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AacSettings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @param specification
     *        Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @see AacSpecification
     */

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @return Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @see AacSpecification
     */

    public String getSpecification() {
        return this.specification;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @param specification
     *        Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacSpecification
     */

    public AacSettings withSpecification(String specification) {
        setSpecification(specification);
        return this;
    }

    /**
     * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * 
     * @param specification
     *        Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacSpecification
     */

    public AacSettings withSpecification(AacSpecification specification) {
        this.specification = specification.toString();
        return this;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * 
     * @param vbrQuality
     *        VBR Quality Level - Only used if rate_control_mode is VBR.
     * @see AacVbrQuality
     */

    public void setVbrQuality(String vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * 
     * @return VBR Quality Level - Only used if rate_control_mode is VBR.
     * @see AacVbrQuality
     */

    public String getVbrQuality() {
        return this.vbrQuality;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * 
     * @param vbrQuality
     *        VBR Quality Level - Only used if rate_control_mode is VBR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacVbrQuality
     */

    public AacSettings withVbrQuality(String vbrQuality) {
        setVbrQuality(vbrQuality);
        return this;
    }

    /**
     * VBR Quality Level - Only used if rate_control_mode is VBR.
     * 
     * @param vbrQuality
     *        VBR Quality Level - Only used if rate_control_mode is VBR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AacVbrQuality
     */

    public AacSettings withVbrQuality(AacVbrQuality vbrQuality) {
        this.vbrQuality = vbrQuality.toString();
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
        if (getAudioDescriptionBroadcasterMix() != null)
            sb.append("AudioDescriptionBroadcasterMix: ").append(getAudioDescriptionBroadcasterMix()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getCodingMode() != null)
            sb.append("CodingMode: ").append(getCodingMode()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getRawFormat() != null)
            sb.append("RawFormat: ").append(getRawFormat()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSpecification() != null)
            sb.append("Specification: ").append(getSpecification()).append(",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: ").append(getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AacSettings == false)
            return false;
        AacSettings other = (AacSettings) obj;
        if (other.getAudioDescriptionBroadcasterMix() == null ^ this.getAudioDescriptionBroadcasterMix() == null)
            return false;
        if (other.getAudioDescriptionBroadcasterMix() != null
                && other.getAudioDescriptionBroadcasterMix().equals(this.getAudioDescriptionBroadcasterMix()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getCodingMode() == null ^ this.getCodingMode() == null)
            return false;
        if (other.getCodingMode() != null && other.getCodingMode().equals(this.getCodingMode()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getRawFormat() == null ^ this.getRawFormat() == null)
            return false;
        if (other.getRawFormat() != null && other.getRawFormat().equals(this.getRawFormat()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDescriptionBroadcasterMix() == null) ? 0 : getAudioDescriptionBroadcasterMix().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getCodingMode() == null) ? 0 : getCodingMode().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRawFormat() == null) ? 0 : getRawFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public AacSettings clone() {
        try {
            return (AacSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AacSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
