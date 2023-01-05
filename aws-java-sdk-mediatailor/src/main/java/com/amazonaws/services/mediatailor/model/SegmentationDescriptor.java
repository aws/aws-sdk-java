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
 * The <code>segmentation_descriptor</code> message can contain advanced metadata fields, like content identifiers, to
 * convey a wide range of information about the ad break. MediaTailor writes the ad metadata in the egress manifest as
 * part of the <code>EXT-X-DATERANGE</code> or <code>EventStream</code> ad marker's SCTE-35 data.
 * </p>
 * <p>
 * <code>segmentation_descriptor</code> messages must be sent with the <code>time_signal</code> message type.
 * </p>
 * <p>
 * See the <code>segmentation_descriptor()</code> table of the 2022 SCTE-35 specification for more information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/SegmentationDescriptor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentationDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value
     * is 0.
     * </p>
     */
    private Integer segmentNum;
    /**
     * <p>
     * The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     * </p>
     */
    private Integer segmentationEventId;
    /**
     * <p>
     * The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The
     * default value is 48.
     * </p>
     */
    private Integer segmentationTypeId;
    /**
     * <p>
     * The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in section
     * 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only the characters
     * 0 though 9 and A through F. The default value is "" (an empty string).
     * </p>
     */
    private String segmentationUpid;
    /**
     * <p>
     * The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default
     * value is 14.
     * </p>
     */
    private Integer segmentationUpidType;
    /**
     * <p>
     * The number of segments expected, which is assigned to the <code>segmentation_descriptor.segments_expectedS</code>
     * message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256,
     * inclusive. The default value is 0.
     * </p>
     */
    private Integer segmentsExpected;
    /**
     * <p>
     * The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as defined
     * in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The defualt
     * value is null.
     * </p>
     */
    private Integer subSegmentNum;
    /**
     * <p>
     * The number of sub-segments expected, which is assigned to the
     * <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the 2022
     * SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     * </p>
     */
    private Integer subSegmentsExpected;

    /**
     * <p>
     * The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value
     * is 0.
     * </p>
     * 
     * @param segmentNum
     *        The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined
     *        in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The
     *        default value is 0.
     */

    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    /**
     * <p>
     * The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value
     * is 0.
     * </p>
     * 
     * @return The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined
     *         in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The
     *         default value is 0.
     */

    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    /**
     * <p>
     * The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value
     * is 0.
     * </p>
     * 
     * @param segmentNum
     *        The segment number to assign to the <code>segmentation_descriptor.segment_num</code> message, as defined
     *        in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The
     *        default value is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSegmentNum(Integer segmentNum) {
        setSegmentNum(segmentNum);
        return this;
    }

    /**
     * <p>
     * The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     * </p>
     * 
     * @param segmentationEventId
     *        The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message,
     *        as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     */

    public void setSegmentationEventId(Integer segmentationEventId) {
        this.segmentationEventId = segmentationEventId;
    }

    /**
     * <p>
     * The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     * </p>
     * 
     * @return The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message,
     *         as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     */

    public Integer getSegmentationEventId() {
        return this.segmentationEventId;
    }

    /**
     * <p>
     * The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     * </p>
     * 
     * @param segmentationEventId
     *        The Event Identifier to assign to the <code>segmentation_descriptor.segmentation_event_id</code> message,
     *        as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSegmentationEventId(Integer segmentationEventId) {
        setSegmentationEventId(segmentationEventId);
        return this;
    }

    /**
     * <p>
     * The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The
     * default value is 48.
     * </p>
     * 
     * @param segmentationTypeId
     *        The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message, as
     *        defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *        inclusive. The default value is 48.
     */

    public void setSegmentationTypeId(Integer segmentationTypeId) {
        this.segmentationTypeId = segmentationTypeId;
    }

    /**
     * <p>
     * The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The
     * default value is 48.
     * </p>
     * 
     * @return The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message,
     *         as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *         inclusive. The default value is 48.
     */

    public Integer getSegmentationTypeId() {
        return this.segmentationTypeId;
    }

    /**
     * <p>
     * The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message, as
     * defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The
     * default value is 48.
     * </p>
     * 
     * @param segmentationTypeId
     *        The Type Identifier to assign to the <code>segmentation_descriptor.segmentation_type_id</code> message, as
     *        defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *        inclusive. The default value is 48.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSegmentationTypeId(Integer segmentationTypeId) {
        setSegmentationTypeId(segmentationTypeId);
        return this;
    }

    /**
     * <p>
     * The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in section
     * 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only the characters
     * 0 though 9 and A through F. The default value is "" (an empty string).
     * </p>
     * 
     * @param segmentationUpid
     *        The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in
     *        section 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only
     *        the characters 0 though 9 and A through F. The default value is "" (an empty string).
     */

    public void setSegmentationUpid(String segmentationUpid) {
        this.segmentationUpid = segmentationUpid;
    }

    /**
     * <p>
     * The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in section
     * 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only the characters
     * 0 though 9 and A through F. The default value is "" (an empty string).
     * </p>
     * 
     * @return The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in
     *         section 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing
     *         only the characters 0 though 9 and A through F. The default value is "" (an empty string).
     */

    public String getSegmentationUpid() {
        return this.segmentationUpid;
    }

    /**
     * <p>
     * The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in section
     * 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only the characters
     * 0 though 9 and A through F. The default value is "" (an empty string).
     * </p>
     * 
     * @param segmentationUpid
     *        The Upid to assign to the <code>segmentation_descriptor.segmentation_upid</code> message, as defined in
     *        section 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only
     *        the characters 0 though 9 and A through F. The default value is "" (an empty string).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSegmentationUpid(String segmentationUpid) {
        setSegmentationUpid(segmentationUpid);
        return this;
    }

    /**
     * <p>
     * The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default
     * value is 14.
     * </p>
     * 
     * @param segmentationUpidType
     *        The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as
     *        defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *        inclusive. The default value is 14.
     */

    public void setSegmentationUpidType(Integer segmentationUpidType) {
        this.segmentationUpidType = segmentationUpidType;
    }

    /**
     * <p>
     * The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default
     * value is 14.
     * </p>
     * 
     * @return The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as
     *         defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *         inclusive. The default value is 14.
     */

    public Integer getSegmentationUpidType() {
        return this.segmentationUpidType;
    }

    /**
     * <p>
     * The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as defined in
     * section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default
     * value is 14.
     * </p>
     * 
     * @param segmentationUpidType
     *        The Upid Type to assign to the <code>segmentation_descriptor.segmentation_upid_type</code> message, as
     *        defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *        inclusive. The default value is 14.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSegmentationUpidType(Integer segmentationUpidType) {
        setSegmentationUpidType(segmentationUpidType);
        return this;
    }

    /**
     * <p>
     * The number of segments expected, which is assigned to the <code>segmentation_descriptor.segments_expectedS</code>
     * message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256,
     * inclusive. The default value is 0.
     * </p>
     * 
     * @param segmentsExpected
     *        The number of segments expected, which is assigned to the
     *        <code>segmentation_descriptor.segments_expectedS</code> message, as defined in section 10.3.3.1 of the
     *        2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value is 0.
     */

    public void setSegmentsExpected(Integer segmentsExpected) {
        this.segmentsExpected = segmentsExpected;
    }

    /**
     * <p>
     * The number of segments expected, which is assigned to the <code>segmentation_descriptor.segments_expectedS</code>
     * message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256,
     * inclusive. The default value is 0.
     * </p>
     * 
     * @return The number of segments expected, which is assigned to the
     *         <code>segmentation_descriptor.segments_expectedS</code> message, as defined in section 10.3.3.1 of the
     *         2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value is 0.
     */

    public Integer getSegmentsExpected() {
        return this.segmentsExpected;
    }

    /**
     * <p>
     * The number of segments expected, which is assigned to the <code>segmentation_descriptor.segments_expectedS</code>
     * message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256,
     * inclusive. The default value is 0.
     * </p>
     * 
     * @param segmentsExpected
     *        The number of segments expected, which is assigned to the
     *        <code>segmentation_descriptor.segments_expectedS</code> message, as defined in section 10.3.3.1 of the
     *        2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSegmentsExpected(Integer segmentsExpected) {
        setSegmentsExpected(segmentsExpected);
        return this;
    }

    /**
     * <p>
     * The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as defined
     * in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The defualt
     * value is null.
     * </p>
     * 
     * @param subSegmentNum
     *        The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as
     *        defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *        inclusive. The defualt value is null.
     */

    public void setSubSegmentNum(Integer subSegmentNum) {
        this.subSegmentNum = subSegmentNum;
    }

    /**
     * <p>
     * The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as defined
     * in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The defualt
     * value is null.
     * </p>
     * 
     * @return The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as
     *         defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *         inclusive. The defualt value is null.
     */

    public Integer getSubSegmentNum() {
        return this.subSegmentNum;
    }

    /**
     * <p>
     * The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as defined
     * in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The defualt
     * value is null.
     * </p>
     * 
     * @param subSegmentNum
     *        The sub-segment number to assign to the <code>segmentation_descriptor.sub_segment_num</code> message, as
     *        defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256,
     *        inclusive. The defualt value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSubSegmentNum(Integer subSegmentNum) {
        setSubSegmentNum(subSegmentNum);
        return this;
    }

    /**
     * <p>
     * The number of sub-segments expected, which is assigned to the
     * <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the 2022
     * SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     * </p>
     * 
     * @param subSegmentsExpected
     *        The number of sub-segments expected, which is assigned to the
     *        <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the
     *        2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     */

    public void setSubSegmentsExpected(Integer subSegmentsExpected) {
        this.subSegmentsExpected = subSegmentsExpected;
    }

    /**
     * <p>
     * The number of sub-segments expected, which is assigned to the
     * <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the 2022
     * SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     * </p>
     * 
     * @return The number of sub-segments expected, which is assigned to the
     *         <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the
     *         2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     */

    public Integer getSubSegmentsExpected() {
        return this.subSegmentsExpected;
    }

    /**
     * <p>
     * The number of sub-segments expected, which is assigned to the
     * <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the 2022
     * SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     * </p>
     * 
     * @param subSegmentsExpected
     *        The number of sub-segments expected, which is assigned to the
     *        <code>segmentation_descriptor.sub_segments_expected</code> message, as defined in section 10.3.3.1 of the
     *        2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentationDescriptor withSubSegmentsExpected(Integer subSegmentsExpected) {
        setSubSegmentsExpected(subSegmentsExpected);
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
        if (getSegmentNum() != null)
            sb.append("SegmentNum: ").append(getSegmentNum()).append(",");
        if (getSegmentationEventId() != null)
            sb.append("SegmentationEventId: ").append(getSegmentationEventId()).append(",");
        if (getSegmentationTypeId() != null)
            sb.append("SegmentationTypeId: ").append(getSegmentationTypeId()).append(",");
        if (getSegmentationUpid() != null)
            sb.append("SegmentationUpid: ").append(getSegmentationUpid()).append(",");
        if (getSegmentationUpidType() != null)
            sb.append("SegmentationUpidType: ").append(getSegmentationUpidType()).append(",");
        if (getSegmentsExpected() != null)
            sb.append("SegmentsExpected: ").append(getSegmentsExpected()).append(",");
        if (getSubSegmentNum() != null)
            sb.append("SubSegmentNum: ").append(getSubSegmentNum()).append(",");
        if (getSubSegmentsExpected() != null)
            sb.append("SubSegmentsExpected: ").append(getSubSegmentsExpected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentationDescriptor == false)
            return false;
        SegmentationDescriptor other = (SegmentationDescriptor) obj;
        if (other.getSegmentNum() == null ^ this.getSegmentNum() == null)
            return false;
        if (other.getSegmentNum() != null && other.getSegmentNum().equals(this.getSegmentNum()) == false)
            return false;
        if (other.getSegmentationEventId() == null ^ this.getSegmentationEventId() == null)
            return false;
        if (other.getSegmentationEventId() != null && other.getSegmentationEventId().equals(this.getSegmentationEventId()) == false)
            return false;
        if (other.getSegmentationTypeId() == null ^ this.getSegmentationTypeId() == null)
            return false;
        if (other.getSegmentationTypeId() != null && other.getSegmentationTypeId().equals(this.getSegmentationTypeId()) == false)
            return false;
        if (other.getSegmentationUpid() == null ^ this.getSegmentationUpid() == null)
            return false;
        if (other.getSegmentationUpid() != null && other.getSegmentationUpid().equals(this.getSegmentationUpid()) == false)
            return false;
        if (other.getSegmentationUpidType() == null ^ this.getSegmentationUpidType() == null)
            return false;
        if (other.getSegmentationUpidType() != null && other.getSegmentationUpidType().equals(this.getSegmentationUpidType()) == false)
            return false;
        if (other.getSegmentsExpected() == null ^ this.getSegmentsExpected() == null)
            return false;
        if (other.getSegmentsExpected() != null && other.getSegmentsExpected().equals(this.getSegmentsExpected()) == false)
            return false;
        if (other.getSubSegmentNum() == null ^ this.getSubSegmentNum() == null)
            return false;
        if (other.getSubSegmentNum() != null && other.getSubSegmentNum().equals(this.getSubSegmentNum()) == false)
            return false;
        if (other.getSubSegmentsExpected() == null ^ this.getSubSegmentsExpected() == null)
            return false;
        if (other.getSubSegmentsExpected() != null && other.getSubSegmentsExpected().equals(this.getSubSegmentsExpected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSegmentNum() == null) ? 0 : getSegmentNum().hashCode());
        hashCode = prime * hashCode + ((getSegmentationEventId() == null) ? 0 : getSegmentationEventId().hashCode());
        hashCode = prime * hashCode + ((getSegmentationTypeId() == null) ? 0 : getSegmentationTypeId().hashCode());
        hashCode = prime * hashCode + ((getSegmentationUpid() == null) ? 0 : getSegmentationUpid().hashCode());
        hashCode = prime * hashCode + ((getSegmentationUpidType() == null) ? 0 : getSegmentationUpidType().hashCode());
        hashCode = prime * hashCode + ((getSegmentsExpected() == null) ? 0 : getSegmentsExpected().hashCode());
        hashCode = prime * hashCode + ((getSubSegmentNum() == null) ? 0 : getSubSegmentNum().hashCode());
        hashCode = prime * hashCode + ((getSubSegmentsExpected() == null) ? 0 : getSubSegmentsExpected().hashCode());
        return hashCode;
    }

    @Override
    public SegmentationDescriptor clone() {
        try {
            return (SegmentationDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.SegmentationDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
