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
 * Selector for video.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to
     * the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input
     * video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is
     * HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or
     * if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in
     * the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */
    private String colorSpace;
    /**
     * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and
     * HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes
     * precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values
     * for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK)
     * to use color metadata from the source when it is present. If there's no color metadata in your input file, the
     * service defaults to using values you specify in the input settings.
     */
    private String colorSpaceUsage;
    /**
     * Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video. Appropriate
     * values vary depending on the input video and must be provided by a color grader. The color grader generates these
     * values during the HDR 10 mastering process. The valid range for each of these settings is 0 to 50,000. Each
     * increment represents 0.00002 in CIE1931 color coordinate. Related settings - When you specify these values, you
     * must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify whether the the values you specify here take
     * precedence over the values in the metadata of your input file, set Color space usage (ColorSpaceUsage). To specify
     * whether color metadata is included in an output, set Color metadata (ColorMetadata). For more information about
     * MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */
    private Hdr10Metadata hdr10Metadata;
    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     */
    private Integer pid;
    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     */
    private Integer programNumber;
    /**
     * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or
     * specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video
     * container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service
     * rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of
     * 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no
     * rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service
     * doesn't pass through rotation metadata.
     */
    private String rotate;

    /**
     * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to
     * the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input
     * video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is
     * HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or
     * if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in
     * the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @param colorSpace
     *        If your input video has accurate color space metadata, or if you don't know about color space, leave this
     *        set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If
     *        your input video has metadata indicating the wrong color space, specify the accurate color space here. If
     *        your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't
     *        present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10
     *        (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For
     *        more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * @see ColorSpace
     */

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    /**
     * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to
     * the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input
     * video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is
     * HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or
     * if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in
     * the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @return If your input video has accurate color space metadata, or if you don't know about color space, leave this
     *         set to the default value Follow (FOLLOW). The service will automatically detect your input color space.
     *         If your input video has metadata indicating the wrong color space, specify the accurate color space here.
     *         If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't
     *         present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10
     *         (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For
     *         more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * @see ColorSpace
     */

    public String getColorSpace() {
        return this.colorSpace;
    }

    /**
     * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to
     * the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input
     * video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is
     * HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or
     * if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in
     * the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @param colorSpace
     *        If your input video has accurate color space metadata, or if you don't know about color space, leave this
     *        set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If
     *        your input video has metadata indicating the wrong color space, specify the accurate color space here. If
     *        your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't
     *        present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10
     *        (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For
     *        more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public VideoSelector withColorSpace(String colorSpace) {
        setColorSpace(colorSpace);
        return this;
    }

    /**
     * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to
     * the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input
     * video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is
     * HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or
     * if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in
     * the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see
     * https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @param colorSpace
     *        If your input video has accurate color space metadata, or if you don't know about color space, leave this
     *        set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If
     *        your input video has metadata indicating the wrong color space, specify the accurate color space here. If
     *        your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't
     *        present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10
     *        (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For
     *        more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public VideoSelector withColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace.toString();
        return this;
    }

    /**
     * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and
     * HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes
     * precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values
     * for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK)
     * to use color metadata from the source when it is present. If there's no color metadata in your input file, the
     * service defaults to using values you specify in the input settings.
     * 
     * @param colorSpaceUsage
     *        There are two sources for color metadata, the input file and the job input settings Color space
     *        (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting
     *        determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings.
     *        If you don't specify values for those settings, the service defaults to using metadata from your input.
     *        FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's
     *        no color metadata in your input file, the service defaults to using values you specify in the input
     *        settings.
     * @see ColorSpaceUsage
     */

    public void setColorSpaceUsage(String colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
    }

    /**
     * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and
     * HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes
     * precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values
     * for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK)
     * to use color metadata from the source when it is present. If there's no color metadata in your input file, the
     * service defaults to using values you specify in the input settings.
     * 
     * @return There are two sources for color metadata, the input file and the job input settings Color space
     *         (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting
     *         determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job
     *         settings. If you don't specify values for those settings, the service defaults to using metadata from
     *         your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is
     *         present. If there's no color metadata in your input file, the service defaults to using values you
     *         specify in the input settings.
     * @see ColorSpaceUsage
     */

    public String getColorSpaceUsage() {
        return this.colorSpaceUsage;
    }

    /**
     * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and
     * HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes
     * precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values
     * for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK)
     * to use color metadata from the source when it is present. If there's no color metadata in your input file, the
     * service defaults to using values you specify in the input settings.
     * 
     * @param colorSpaceUsage
     *        There are two sources for color metadata, the input file and the job input settings Color space
     *        (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting
     *        determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings.
     *        If you don't specify values for those settings, the service defaults to using metadata from your input.
     *        FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's
     *        no color metadata in your input file, the service defaults to using values you specify in the input
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpaceUsage
     */

    public VideoSelector withColorSpaceUsage(String colorSpaceUsage) {
        setColorSpaceUsage(colorSpaceUsage);
        return this;
    }

    /**
     * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and
     * HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes
     * precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values
     * for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK)
     * to use color metadata from the source when it is present. If there's no color metadata in your input file, the
     * service defaults to using values you specify in the input settings.
     * 
     * @param colorSpaceUsage
     *        There are two sources for color metadata, the input file and the job input settings Color space
     *        (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting
     *        determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings.
     *        If you don't specify values for those settings, the service defaults to using metadata from your input.
     *        FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's
     *        no color metadata in your input file, the service defaults to using values you specify in the input
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpaceUsage
     */

    public VideoSelector withColorSpaceUsage(ColorSpaceUsage colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage.toString();
        return this;
    }

    /**
     * Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video. Appropriate
     * values vary depending on the input video and must be provided by a color grader. The color grader generates these
     * values during the HDR 10 mastering process. The valid range for each of these settings is 0 to 50,000. Each
     * increment represents 0.00002 in CIE1931 color coordinate. Related settings - When you specify these values, you
     * must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify whether the the values you specify here take
     * precedence over the values in the metadata of your input file, set Color space usage (ColorSpaceUsage). To specify
     * whether color metadata is included in an output, set Color metadata (ColorMetadata). For more information about
     * MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @param hdr10Metadata
     *        Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video.
     *        Appropriate values vary depending on the input video and must be provided by a color grader. The color
     *        grader generates these values during the HDR 10 mastering process. The valid range for each of these
     *        settings is 0 to 50,000. Each increment represents 0.00002 in CIE1931 color coordinate. Related settings -
     *        When you specify these values, you must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify
     *        whether the the values you specify here take precedence over the values in the metadata of your input
     *        file, set Color space usage (ColorSpaceUsage). To specify whether color metadata is included in an output,
     *        set Color metadata (ColorMetadata). For more information about MediaConvert HDR jobs, see
     *        https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */

    public void setHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        this.hdr10Metadata = hdr10Metadata;
    }

    /**
     * Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video. Appropriate
     * values vary depending on the input video and must be provided by a color grader. The color grader generates these
     * values during the HDR 10 mastering process. The valid range for each of these settings is 0 to 50,000. Each
     * increment represents 0.00002 in CIE1931 color coordinate. Related settings - When you specify these values, you
     * must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify whether the the values you specify here take
     * precedence over the values in the metadata of your input file, set Color space usage (ColorSpaceUsage). To specify
     * whether color metadata is included in an output, set Color metadata (ColorMetadata). For more information about
     * MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @return Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video.
     *         Appropriate values vary depending on the input video and must be provided by a color grader. The color
     *         grader generates these values during the HDR 10 mastering process. The valid range for each of these
     *         settings is 0 to 50,000. Each increment represents 0.00002 in CIE1931 color coordinate. Related settings
     *         - When you specify these values, you must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify
     *         whether the the values you specify here take precedence over the values in the metadata of your input
     *         file, set Color space usage (ColorSpaceUsage). To specify whether color metadata is included in an
     *         output, set Color metadata (ColorMetadata). For more information about MediaConvert HDR jobs, see
     *         https://docs.aws.amazon.com/console/mediaconvert/hdr.
     */

    public Hdr10Metadata getHdr10Metadata() {
        return this.hdr10Metadata;
    }

    /**
     * Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video. Appropriate
     * values vary depending on the input video and must be provided by a color grader. The color grader generates these
     * values during the HDR 10 mastering process. The valid range for each of these settings is 0 to 50,000. Each
     * increment represents 0.00002 in CIE1931 color coordinate. Related settings - When you specify these values, you
     * must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify whether the the values you specify here take
     * precedence over the values in the metadata of your input file, set Color space usage (ColorSpaceUsage). To specify
     * whether color metadata is included in an output, set Color metadata (ColorMetadata). For more information about
     * MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * 
     * @param hdr10Metadata
     *        Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video.
     *        Appropriate values vary depending on the input video and must be provided by a color grader. The color
     *        grader generates these values during the HDR 10 mastering process. The valid range for each of these
     *        settings is 0 to 50,000. Each increment represents 0.00002 in CIE1931 color coordinate. Related settings -
     *        When you specify these values, you must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify
     *        whether the the values you specify here take precedence over the values in the metadata of your input
     *        file, set Color space usage (ColorSpaceUsage). To specify whether color metadata is included in an output,
     *        set Color metadata (ColorMetadata). For more information about MediaConvert HDR jobs, see
     *        https://docs.aws.amazon.com/console/mediaconvert/hdr.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        setHdr10Metadata(hdr10Metadata);
        return this;
    }

    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * 
     * @param pid
     *        Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the
     *        system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or
     *        packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * 
     * @return Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the
     *         system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or
     *         packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * 
     * @param pid
     *        Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the
     *        system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or
     *        packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withPid(Integer pid) {
        setPid(pid);
        return this;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     * 
     * @param programNumber
     *        Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not
     *        currently supported.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     * 
     * @return Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not
     *         currently supported.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     * 
     * @param programNumber
     *        Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not
     *        currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or
     * specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video
     * container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service
     * rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of
     * 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no
     * rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service
     * doesn't pass through rotation metadata.
     * 
     * @param rotate
     *        Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation
     *        or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input
     *        video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the
     *        service rotate your video according to the rotation specified in the metadata. The rotation must be within
     *        one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service
     *        will default to no rotation. By default, the service does no rotation, even if your input video has
     *        rotation metadata. The service doesn't pass through rotation metadata.
     * @see InputRotate
     */

    public void setRotate(String rotate) {
        this.rotate = rotate;
    }

    /**
     * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or
     * specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video
     * container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service
     * rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of
     * 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no
     * rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service
     * doesn't pass through rotation metadata.
     * 
     * @return Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation
     *         or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input
     *         video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have
     *         the service rotate your video according to the rotation specified in the metadata. The rotation must be
     *         within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the
     *         service will default to no rotation. By default, the service does no rotation, even if your input video
     *         has rotation metadata. The service doesn't pass through rotation metadata.
     * @see InputRotate
     */

    public String getRotate() {
        return this.rotate;
    }

    /**
     * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or
     * specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video
     * container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service
     * rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of
     * 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no
     * rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service
     * doesn't pass through rotation metadata.
     * 
     * @param rotate
     *        Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation
     *        or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input
     *        video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the
     *        service rotate your video according to the rotation specified in the metadata. The rotation must be within
     *        one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service
     *        will default to no rotation. By default, the service does no rotation, even if your input video has
     *        rotation metadata. The service doesn't pass through rotation metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputRotate
     */

    public VideoSelector withRotate(String rotate) {
        setRotate(rotate);
        return this;
    }

    /**
     * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or
     * specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video
     * container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service
     * rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of
     * 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no
     * rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service
     * doesn't pass through rotation metadata.
     * 
     * @param rotate
     *        Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation
     *        or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input
     *        video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the
     *        service rotate your video according to the rotation specified in the metadata. The rotation must be within
     *        one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service
     *        will default to no rotation. By default, the service does no rotation, even if your input video has
     *        rotation metadata. The service doesn't pass through rotation metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputRotate
     */

    public VideoSelector withRotate(InputRotate rotate) {
        this.rotate = rotate.toString();
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
        if (getColorSpace() != null)
            sb.append("ColorSpace: ").append(getColorSpace()).append(",");
        if (getColorSpaceUsage() != null)
            sb.append("ColorSpaceUsage: ").append(getColorSpaceUsage()).append(",");
        if (getHdr10Metadata() != null)
            sb.append("Hdr10Metadata: ").append(getHdr10Metadata()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getRotate() != null)
            sb.append("Rotate: ").append(getRotate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelector == false)
            return false;
        VideoSelector other = (VideoSelector) obj;
        if (other.getColorSpace() == null ^ this.getColorSpace() == null)
            return false;
        if (other.getColorSpace() != null && other.getColorSpace().equals(this.getColorSpace()) == false)
            return false;
        if (other.getColorSpaceUsage() == null ^ this.getColorSpaceUsage() == null)
            return false;
        if (other.getColorSpaceUsage() != null && other.getColorSpaceUsage().equals(this.getColorSpaceUsage()) == false)
            return false;
        if (other.getHdr10Metadata() == null ^ this.getHdr10Metadata() == null)
            return false;
        if (other.getHdr10Metadata() != null && other.getHdr10Metadata().equals(this.getHdr10Metadata()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getRotate() == null ^ this.getRotate() == null)
            return false;
        if (other.getRotate() != null && other.getRotate().equals(this.getRotate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColorSpace() == null) ? 0 : getColorSpace().hashCode());
        hashCode = prime * hashCode + ((getColorSpaceUsage() == null) ? 0 : getColorSpaceUsage().hashCode());
        hashCode = prime * hashCode + ((getHdr10Metadata() == null) ? 0 : getHdr10Metadata().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getRotate() == null) ? 0 : getRotate().hashCode());
        return hashCode;
    }

    @Override
    public VideoSelector clone() {
        try {
            return (VideoSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
