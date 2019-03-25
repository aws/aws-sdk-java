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
 * Settings for video outputs
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify
     * whether the service includes AFD values in the output video data and what those values are. * Choose None to
     * remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value
     * specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
     */
    private String afdSignaling;
    /**
     * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED
     * for AntiAlias. If you specify that in your job, the service will ignore the setting.
     */
    private String antiAlias;
    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video
     * encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings *
     * FRAME_CAPTURE, FrameCaptureSettings
     */
    private VideoCodecSettings codecSettings;
    /**
     * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by
     * default.
     */
    private String colorMetadata;
    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping rectangle
     * (Crop) to specify the video area the service will include in the output. This will crop the input source, causing
     * video pixels to be removed on encode. If you crop your input frame size to smaller than your output frame size,
     * make sure to specify the behavior you want in your output setting "Scaling behavior".
     */
    private Rectangle crop;
    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on
     * outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This
     * setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     */
    private String dropFrameTimecode;
    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit
     * AFD value which the service will write on all frames of this video output.
     */
    private Integer fixedAfd;
    /**
     * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you
     * don't provide a value here, the service will use the input height.
     */
    private Integer height;
    /**
     * Use Position (Position) to point to a rectangle object to define your position. This setting overrides any other
     * aspect ratio.
     */
    private Rectangle position;
    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values
     * in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect
     * ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this
     * when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE)
     * and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
     */
    private String respondToAfd;
    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Choose "Stretch to output" to
     * have the service stretch your video image to fit. Keep the setting "Default" to allow the service to letterbox
     * your video instead. This setting overrides any positioning value you specify elsewhere in the job.
     */
    private String scalingBehavior;
    /**
     * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the
     * anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from
     * your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     */
    private Integer sharpness;
    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate
     * is identical to the output frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the
     * service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are
     * present, the service will set the timecode for the first output frame to zero. To change this default behavior,
     * adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located
     * under Job > Job settings > Timecode configuration. Note - Timecode source under input settings
     * (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings >
     * Timecode configuration (TimecodeSource) does.
     */
    private String timecodeInsertion;
    /**
     * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output
     * individually. These features are disabled by default.
     */
    private VideoPreprocessor videoPreprocessors;
    /**
     * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value
     * here, the service will use the input width.
     */
    private Integer width;

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify
     * whether the service includes AFD values in the output video data and what those values are. * Choose None to
     * remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value
     * specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
     * 
     * @param afdSignaling
     *        This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to
     *        specify whether the service includes AFD values in the output video data and what those values are. *
     *        Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and
     *        instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the
     *        input AFD scaler data.
     * @see AfdSignaling
     */

    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify
     * whether the service includes AFD values in the output video data and what those values are. * Choose None to
     * remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value
     * specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
     * 
     * @return This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to
     *         specify whether the service includes AFD values in the output video data and what those values are. *
     *         Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and
     *         instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the
     *         input AFD scaler data.
     * @see AfdSignaling
     */

    public String getAfdSignaling() {
        return this.afdSignaling;
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify
     * whether the service includes AFD values in the output video data and what those values are. * Choose None to
     * remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value
     * specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
     * 
     * @param afdSignaling
     *        This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to
     *        specify whether the service includes AFD values in the output video data and what those values are. *
     *        Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and
     *        instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the
     *        input AFD scaler data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AfdSignaling
     */

    public VideoDescription withAfdSignaling(String afdSignaling) {
        setAfdSignaling(afdSignaling);
        return this;
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify
     * whether the service includes AFD values in the output video data and what those values are. * Choose None to
     * remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value
     * specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
     * 
     * @param afdSignaling
     *        This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to
     *        specify whether the service includes AFD values in the output video data and what those values are. *
     *        Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and
     *        instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the
     *        input AFD scaler data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AfdSignaling
     */

    public VideoDescription withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED
     * for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * 
     * @param antiAlias
     *        The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value
     *        DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * @see AntiAlias
     */

    public void setAntiAlias(String antiAlias) {
        this.antiAlias = antiAlias;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED
     * for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * 
     * @return The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value
     *         DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * @see AntiAlias
     */

    public String getAntiAlias() {
        return this.antiAlias;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED
     * for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * 
     * @param antiAlias
     *        The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value
     *        DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntiAlias
     */

    public VideoDescription withAntiAlias(String antiAlias) {
        setAntiAlias(antiAlias);
        return this;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED
     * for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * 
     * @param antiAlias
     *        The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value
     *        DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntiAlias
     */

    public VideoDescription withAntiAlias(AntiAlias antiAlias) {
        this.antiAlias = antiAlias.toString();
        return this;
    }

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video
     * encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings *
     * FRAME_CAPTURE, FrameCaptureSettings
     * 
     * @param codecSettings
     *        Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to
     *        video encoding. The settings in this group vary depending on the value you choose for Video codec (Codec).
     *        For each codec enum you choose, define the corresponding settings object. The following lists the codec
     *        enum, settings object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     *        ProresSettings * FRAME_CAPTURE, FrameCaptureSettings
     */

    public void setCodecSettings(VideoCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video
     * encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings *
     * FRAME_CAPTURE, FrameCaptureSettings
     * 
     * @return Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to
     *         video encoding. The settings in this group vary depending on the value you choose for Video codec
     *         (Codec). For each codec enum you choose, define the corresponding settings object. The following lists
     *         the codec enum, settings object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings
     *         * PRORES, ProresSettings * FRAME_CAPTURE, FrameCaptureSettings
     */

    public VideoCodecSettings getCodecSettings() {
        return this.codecSettings;
    }

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video
     * encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each
     * codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings
     * object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings *
     * FRAME_CAPTURE, FrameCaptureSettings
     * 
     * @param codecSettings
     *        Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to
     *        video encoding. The settings in this group vary depending on the value you choose for Video codec (Codec).
     *        For each codec enum you choose, define the corresponding settings object. The following lists the codec
     *        enum, settings object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     *        ProresSettings * FRAME_CAPTURE, FrameCaptureSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withCodecSettings(VideoCodecSettings codecSettings) {
        setCodecSettings(codecSettings);
        return this;
    }

    /**
     * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by
     * default.
     * 
     * @param colorMetadata
     *        Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is
     *        enabled by default.
     * @see ColorMetadata
     */

    public void setColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
    }

    /**
     * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by
     * default.
     * 
     * @return Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is
     *         enabled by default.
     * @see ColorMetadata
     */

    public String getColorMetadata() {
        return this.colorMetadata;
    }

    /**
     * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by
     * default.
     * 
     * @param colorMetadata
     *        Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is
     *        enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorMetadata
     */

    public VideoDescription withColorMetadata(String colorMetadata) {
        setColorMetadata(colorMetadata);
        return this;
    }

    /**
     * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by
     * default.
     * 
     * @param colorMetadata
     *        Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is
     *        enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorMetadata
     */

    public VideoDescription withColorMetadata(ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping rectangle
     * (Crop) to specify the video area the service will include in the output. This will crop the input source, causing
     * video pixels to be removed on encode. If you crop your input frame size to smaller than your output frame size,
     * make sure to specify the behavior you want in your output setting "Scaling behavior".
     * 
     * @param crop
     *        Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping
     *        rectangle (Crop) to specify the video area the service will include in the output. This will crop the
     *        input source, causing video pixels to be removed on encode. If you crop your input frame size to smaller
     *        than your output frame size, make sure to specify the behavior you want in your output setting
     *        "Scaling behavior".
     */

    public void setCrop(Rectangle crop) {
        this.crop = crop;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping rectangle
     * (Crop) to specify the video area the service will include in the output. This will crop the input source, causing
     * video pixels to be removed on encode. If you crop your input frame size to smaller than your output frame size,
     * make sure to specify the behavior you want in your output setting "Scaling behavior".
     * 
     * @return Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping
     *         rectangle (Crop) to specify the video area the service will include in the output. This will crop the
     *         input source, causing video pixels to be removed on encode. If you crop your input frame size to smaller
     *         than your output frame size, make sure to specify the behavior you want in your output setting
     *         "Scaling behavior".
     */

    public Rectangle getCrop() {
        return this.crop;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping rectangle
     * (Crop) to specify the video area the service will include in the output. This will crop the input source, causing
     * video pixels to be removed on encode. If you crop your input frame size to smaller than your output frame size,
     * make sure to specify the behavior you want in your output setting "Scaling behavior".
     * 
     * @param crop
     *        Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping
     *        rectangle (Crop) to specify the video area the service will include in the output. This will crop the
     *        input source, causing video pixels to be removed on encode. If you crop your input frame size to smaller
     *        than your output frame size, make sure to specify the behavior you want in your output setting
     *        "Scaling behavior".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withCrop(Rectangle crop) {
        setCrop(crop);
        return this;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on
     * outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This
     * setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * 
     * @param dropFrameTimecode
     *        Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode
     *        on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame.
     *        This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * @see DropFrameTimecode
     */

    public void setDropFrameTimecode(String dropFrameTimecode) {
        this.dropFrameTimecode = dropFrameTimecode;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on
     * outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This
     * setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * 
     * @return Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode
     *         on outputs. If it is not possible to use drop-frame timecode, the system will fall back to
     *         non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is
     *         enabled.
     * @see DropFrameTimecode
     */

    public String getDropFrameTimecode() {
        return this.dropFrameTimecode;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on
     * outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This
     * setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * 
     * @param dropFrameTimecode
     *        Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode
     *        on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame.
     *        This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DropFrameTimecode
     */

    public VideoDescription withDropFrameTimecode(String dropFrameTimecode) {
        setDropFrameTimecode(dropFrameTimecode);
        return this;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on
     * outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This
     * setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * 
     * @param dropFrameTimecode
     *        Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode
     *        on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame.
     *        This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DropFrameTimecode
     */

    public VideoDescription withDropFrameTimecode(DropFrameTimecode dropFrameTimecode) {
        this.dropFrameTimecode = dropFrameTimecode.toString();
        return this;
    }

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit
     * AFD value which the service will write on all frames of this video output.
     * 
     * @param fixedAfd
     *        Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a
     *        four-bit AFD value which the service will write on all frames of this video output.
     */

    public void setFixedAfd(Integer fixedAfd) {
        this.fixedAfd = fixedAfd;
    }

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit
     * AFD value which the service will write on all frames of this video output.
     * 
     * @return Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a
     *         four-bit AFD value which the service will write on all frames of this video output.
     */

    public Integer getFixedAfd() {
        return this.fixedAfd;
    }

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit
     * AFD value which the service will write on all frames of this video output.
     * 
     * @param fixedAfd
     *        Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a
     *        four-bit AFD value which the service will write on all frames of this video output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withFixedAfd(Integer fixedAfd) {
        setFixedAfd(fixedAfd);
        return this;
    }

    /**
     * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you
     * don't provide a value here, the service will use the input height.
     * 
     * @param height
     *        Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels.
     *        If you don't provide a value here, the service will use the input height.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you
     * don't provide a value here, the service will use the input height.
     * 
     * @return Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels.
     *         If you don't provide a value here, the service will use the input height.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you
     * don't provide a value here, the service will use the input height.
     * 
     * @param height
     *        Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels.
     *        If you don't provide a value here, the service will use the input height.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * Use Position (Position) to point to a rectangle object to define your position. This setting overrides any other
     * aspect ratio.
     * 
     * @param position
     *        Use Position (Position) to point to a rectangle object to define your position. This setting overrides any
     *        other aspect ratio.
     */

    public void setPosition(Rectangle position) {
        this.position = position;
    }

    /**
     * Use Position (Position) to point to a rectangle object to define your position. This setting overrides any other
     * aspect ratio.
     * 
     * @return Use Position (Position) to point to a rectangle object to define your position. This setting overrides
     *         any other aspect ratio.
     */

    public Rectangle getPosition() {
        return this.position;
    }

    /**
     * Use Position (Position) to point to a rectangle object to define your position. This setting overrides any other
     * aspect ratio.
     * 
     * @param position
     *        Use Position (Position) to point to a rectangle object to define your position. This setting overrides any
     *        other aspect ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withPosition(Rectangle position) {
        setPosition(position);
        return this;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values
     * in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect
     * ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this
     * when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE)
     * and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
     * 
     * @param respondToAfd
     *        Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD
     *        values in the input. * Choose Respond to clip the input video frame according to the AFD value, input
     *        display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD
     *        values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow
     *        is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD
     *        values from this output.
     * @see RespondToAfd
     */

    public void setRespondToAfd(String respondToAfd) {
        this.respondToAfd = respondToAfd;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values
     * in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect
     * ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this
     * when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE)
     * and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
     * 
     * @return Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD
     *         values in the input. * Choose Respond to clip the input video frame according to the AFD value, input
     *         display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD
     *         values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this
     *         workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all
     *         input AFD values from this output.
     * @see RespondToAfd
     */

    public String getRespondToAfd() {
        return this.respondToAfd;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values
     * in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect
     * ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this
     * when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE)
     * and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
     * 
     * @param respondToAfd
     *        Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD
     *        values in the input. * Choose Respond to clip the input video frame according to the AFD value, input
     *        display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD
     *        values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow
     *        is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD
     *        values from this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RespondToAfd
     */

    public VideoDescription withRespondToAfd(String respondToAfd) {
        setRespondToAfd(respondToAfd);
        return this;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values
     * in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect
     * ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this
     * when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE)
     * and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
     * 
     * @param respondToAfd
     *        Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD
     *        values in the input. * Choose Respond to clip the input video frame according to the AFD value, input
     *        display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD
     *        values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow
     *        is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD
     *        values from this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RespondToAfd
     */

    public VideoDescription withRespondToAfd(RespondToAfd respondToAfd) {
        this.respondToAfd = respondToAfd.toString();
        return this;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Choose "Stretch to output" to
     * have the service stretch your video image to fit. Keep the setting "Default" to allow the service to letterbox
     * your video instead. This setting overrides any positioning value you specify elsewhere in the job.
     * 
     * @param scalingBehavior
     *        Applies only if your input aspect ratio is different from your output aspect ratio. Choose
     *        "Stretch to output" to have the service stretch your video image to fit. Keep the setting "Default" to
     *        allow the service to letterbox your video instead. This setting overrides any positioning value you
     *        specify elsewhere in the job.
     * @see ScalingBehavior
     */

    public void setScalingBehavior(String scalingBehavior) {
        this.scalingBehavior = scalingBehavior;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Choose "Stretch to output" to
     * have the service stretch your video image to fit. Keep the setting "Default" to allow the service to letterbox
     * your video instead. This setting overrides any positioning value you specify elsewhere in the job.
     * 
     * @return Applies only if your input aspect ratio is different from your output aspect ratio. Choose
     *         "Stretch to output" to have the service stretch your video image to fit. Keep the setting "Default" to
     *         allow the service to letterbox your video instead. This setting overrides any positioning value you
     *         specify elsewhere in the job.
     * @see ScalingBehavior
     */

    public String getScalingBehavior() {
        return this.scalingBehavior;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Choose "Stretch to output" to
     * have the service stretch your video image to fit. Keep the setting "Default" to allow the service to letterbox
     * your video instead. This setting overrides any positioning value you specify elsewhere in the job.
     * 
     * @param scalingBehavior
     *        Applies only if your input aspect ratio is different from your output aspect ratio. Choose
     *        "Stretch to output" to have the service stretch your video image to fit. Keep the setting "Default" to
     *        allow the service to letterbox your video instead. This setting overrides any positioning value you
     *        specify elsewhere in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingBehavior
     */

    public VideoDescription withScalingBehavior(String scalingBehavior) {
        setScalingBehavior(scalingBehavior);
        return this;
    }

    /**
     * Applies only if your input aspect ratio is different from your output aspect ratio. Choose "Stretch to output" to
     * have the service stretch your video image to fit. Keep the setting "Default" to allow the service to letterbox
     * your video instead. This setting overrides any positioning value you specify elsewhere in the job.
     * 
     * @param scalingBehavior
     *        Applies only if your input aspect ratio is different from your output aspect ratio. Choose
     *        "Stretch to output" to have the service stretch your video image to fit. Keep the setting "Default" to
     *        allow the service to letterbox your video instead. This setting overrides any positioning value you
     *        specify elsewhere in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingBehavior
     */

    public VideoDescription withScalingBehavior(ScalingBehavior scalingBehavior) {
        this.scalingBehavior = scalingBehavior.toString();
        return this;
    }

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the
     * anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from
     * your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     * 
     * @param sharpness
     *        Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width
     *        of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is
     *        different from your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for
     *        most content.
     */

    public void setSharpness(Integer sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the
     * anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from
     * your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     * 
     * @return Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the
     *         width of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution
     *         is different from your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended
     *         for most content.
     */

    public Integer getSharpness() {
        return this.sharpness;
    }

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the
     * anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from
     * your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     * 
     * @param sharpness
     *        Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width
     *        of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is
     *        different from your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for
     *        most content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withSharpness(Integer sharpness) {
        setSharpness(sharpness);
        return this;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate
     * is identical to the output frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the
     * service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are
     * present, the service will set the timecode for the first output frame to zero. To change this default behavior,
     * adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located
     * under Job > Job settings > Timecode configuration. Note - Timecode source under input settings
     * (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings >
     * Timecode configuration (TimecodeSource) does.
     * 
     * @param timecodeInsertion
     *        Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input
     *        frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode
     *        insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is
     *        DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from
     *        the input. If none are present, the service will set the timecode for the first output frame to zero. To
     *        change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the
     *        console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode
     *        source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the
     *        output. Source under Job settings > Timecode configuration (TimecodeSource) does.
     * @see VideoTimecodeInsertion
     */

    public void setTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate
     * is identical to the output frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the
     * service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are
     * present, the service will set the timecode for the first output frame to zero. To change this default behavior,
     * adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located
     * under Job > Job settings > Timecode configuration. Note - Timecode source under input settings
     * (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings >
     * Timecode configuration (TimecodeSource) does.
     * 
     * @return Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input
     *         frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode
     *         insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is
     *         DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes
     *         from the input. If none are present, the service will set the timecode for the first output frame to
     *         zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig).
     *         In the console, these settings are located under Job > Job settings > Timecode configuration. Note -
     *         Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are
     *         inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
     * @see VideoTimecodeInsertion
     */

    public String getTimecodeInsertion() {
        return this.timecodeInsertion;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate
     * is identical to the output frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the
     * service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are
     * present, the service will set the timecode for the first output frame to zero. To change this default behavior,
     * adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located
     * under Job > Job settings > Timecode configuration. Note - Timecode source under input settings
     * (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings >
     * Timecode configuration (TimecodeSource) does.
     * 
     * @param timecodeInsertion
     *        Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input
     *        frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode
     *        insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is
     *        DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from
     *        the input. If none are present, the service will set the timecode for the first output frame to zero. To
     *        change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the
     *        console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode
     *        source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the
     *        output. Source under Job settings > Timecode configuration (TimecodeSource) does.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoTimecodeInsertion
     */

    public VideoDescription withTimecodeInsertion(String timecodeInsertion) {
        setTimecodeInsertion(timecodeInsertion);
        return this;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate
     * is identical to the output frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the
     * service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are
     * present, the service will set the timecode for the first output frame to zero. To change this default behavior,
     * adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located
     * under Job > Job settings > Timecode configuration. Note - Timecode source under input settings
     * (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings >
     * Timecode configuration (TimecodeSource) does.
     * 
     * @param timecodeInsertion
     *        Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input
     *        frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode
     *        insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is
     *        DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from
     *        the input. If none are present, the service will set the timecode for the first output frame to zero. To
     *        change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the
     *        console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode
     *        source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the
     *        output. Source under Job settings > Timecode configuration (TimecodeSource) does.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoTimecodeInsertion
     */

    public VideoDescription withTimecodeInsertion(VideoTimecodeInsertion timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion.toString();
        return this;
    }

    /**
     * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output
     * individually. These features are disabled by default.
     * 
     * @param videoPreprocessors
     *        Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each
     *        output individually. These features are disabled by default.
     */

    public void setVideoPreprocessors(VideoPreprocessor videoPreprocessors) {
        this.videoPreprocessors = videoPreprocessors;
    }

    /**
     * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output
     * individually. These features are disabled by default.
     * 
     * @return Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at
     *         each output individually. These features are disabled by default.
     */

    public VideoPreprocessor getVideoPreprocessors() {
        return this.videoPreprocessors;
    }

    /**
     * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output
     * individually. These features are disabled by default.
     * 
     * @param videoPreprocessors
     *        Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each
     *        output individually. These features are disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withVideoPreprocessors(VideoPreprocessor videoPreprocessors) {
        setVideoPreprocessors(videoPreprocessors);
        return this;
    }

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value
     * here, the service will use the input width.
     * 
     * @param width
     *        Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a
     *        value here, the service will use the input width.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value
     * here, the service will use the input width.
     * 
     * @return Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide
     *         a value here, the service will use the input width.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value
     * here, the service will use the input width.
     * 
     * @param width
     *        Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a
     *        value here, the service will use the input width.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withWidth(Integer width) {
        setWidth(width);
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
        if (getAfdSignaling() != null)
            sb.append("AfdSignaling: ").append(getAfdSignaling()).append(",");
        if (getAntiAlias() != null)
            sb.append("AntiAlias: ").append(getAntiAlias()).append(",");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: ").append(getCodecSettings()).append(",");
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: ").append(getColorMetadata()).append(",");
        if (getCrop() != null)
            sb.append("Crop: ").append(getCrop()).append(",");
        if (getDropFrameTimecode() != null)
            sb.append("DropFrameTimecode: ").append(getDropFrameTimecode()).append(",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: ").append(getFixedAfd()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getRespondToAfd() != null)
            sb.append("RespondToAfd: ").append(getRespondToAfd()).append(",");
        if (getScalingBehavior() != null)
            sb.append("ScalingBehavior: ").append(getScalingBehavior()).append(",");
        if (getSharpness() != null)
            sb.append("Sharpness: ").append(getSharpness()).append(",");
        if (getTimecodeInsertion() != null)
            sb.append("TimecodeInsertion: ").append(getTimecodeInsertion()).append(",");
        if (getVideoPreprocessors() != null)
            sb.append("VideoPreprocessors: ").append(getVideoPreprocessors()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoDescription == false)
            return false;
        VideoDescription other = (VideoDescription) obj;
        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getAntiAlias() == null ^ this.getAntiAlias() == null)
            return false;
        if (other.getAntiAlias() != null && other.getAntiAlias().equals(this.getAntiAlias()) == false)
            return false;
        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getColorMetadata() == null ^ this.getColorMetadata() == null)
            return false;
        if (other.getColorMetadata() != null && other.getColorMetadata().equals(this.getColorMetadata()) == false)
            return false;
        if (other.getCrop() == null ^ this.getCrop() == null)
            return false;
        if (other.getCrop() != null && other.getCrop().equals(this.getCrop()) == false)
            return false;
        if (other.getDropFrameTimecode() == null ^ this.getDropFrameTimecode() == null)
            return false;
        if (other.getDropFrameTimecode() != null && other.getDropFrameTimecode().equals(this.getDropFrameTimecode()) == false)
            return false;
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getRespondToAfd() == null ^ this.getRespondToAfd() == null)
            return false;
        if (other.getRespondToAfd() != null && other.getRespondToAfd().equals(this.getRespondToAfd()) == false)
            return false;
        if (other.getScalingBehavior() == null ^ this.getScalingBehavior() == null)
            return false;
        if (other.getScalingBehavior() != null && other.getScalingBehavior().equals(this.getScalingBehavior()) == false)
            return false;
        if (other.getSharpness() == null ^ this.getSharpness() == null)
            return false;
        if (other.getSharpness() != null && other.getSharpness().equals(this.getSharpness()) == false)
            return false;
        if (other.getTimecodeInsertion() == null ^ this.getTimecodeInsertion() == null)
            return false;
        if (other.getTimecodeInsertion() != null && other.getTimecodeInsertion().equals(this.getTimecodeInsertion()) == false)
            return false;
        if (other.getVideoPreprocessors() == null ^ this.getVideoPreprocessors() == null)
            return false;
        if (other.getVideoPreprocessors() != null && other.getVideoPreprocessors().equals(this.getVideoPreprocessors()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfdSignaling() == null) ? 0 : getAfdSignaling().hashCode());
        hashCode = prime * hashCode + ((getAntiAlias() == null) ? 0 : getAntiAlias().hashCode());
        hashCode = prime * hashCode + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode + ((getCrop() == null) ? 0 : getCrop().hashCode());
        hashCode = prime * hashCode + ((getDropFrameTimecode() == null) ? 0 : getDropFrameTimecode().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getRespondToAfd() == null) ? 0 : getRespondToAfd().hashCode());
        hashCode = prime * hashCode + ((getScalingBehavior() == null) ? 0 : getScalingBehavior().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
        hashCode = prime * hashCode + ((getTimecodeInsertion() == null) ? 0 : getTimecodeInsertion().hashCode());
        hashCode = prime * hashCode + ((getVideoPreprocessors() == null) ? 0 : getVideoPreprocessors().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public VideoDescription clone() {
        try {
            return (VideoDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
