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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Corresponds to SCTE-35 segmentation_descriptor.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35SegmentationDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35SegmentationDescriptor implements Serializable, Cloneable, StructuredPojo {

    /** Holds the four SCTE-35 delivery restriction parameters. */
    private Scte35DeliveryRestrictions deliveryRestrictions;
    /** Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id. */
    private Integer segmentNum;
    /** Corresponds to SCTE-35 segmentation_event_cancel_indicator. */
    private String segmentationCancelIndicator;
    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To
     * convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a
     * duration, the time_signal will continue until you insert a cancellation message.
     */
    private Long segmentationDuration;
    /** Corresponds to SCTE-35 segmentation_event_id. */
    private Long segmentationEventId;
    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     * specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the
     * ID in hex (for example, "0x34") or decimal (for example, "52").
     */
    private Integer segmentationTypeId;
    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     * characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do
     * not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex
     * "41445320496e666f726d6174696f6e.
     */
    private String segmentationUpid;
    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35
     * specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example,
     * "0x0C" ) or in decimal (for example, "12").
     */
    private Integer segmentationUpidType;
    /** Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id. */
    private Integer segmentsExpected;
    /** Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id. */
    private Integer subSegmentNum;
    /** Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id. */
    private Integer subSegmentsExpected;

    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     * 
     * @param deliveryRestrictions
     *        Holds the four SCTE-35 delivery restriction parameters.
     */

    public void setDeliveryRestrictions(Scte35DeliveryRestrictions deliveryRestrictions) {
        this.deliveryRestrictions = deliveryRestrictions;
    }

    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     * 
     * @return Holds the four SCTE-35 delivery restriction parameters.
     */

    public Scte35DeliveryRestrictions getDeliveryRestrictions() {
        return this.deliveryRestrictions;
    }

    /**
     * Holds the four SCTE-35 delivery restriction parameters.
     * 
     * @param deliveryRestrictions
     *        Holds the four SCTE-35 delivery restriction parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withDeliveryRestrictions(Scte35DeliveryRestrictions deliveryRestrictions) {
        setDeliveryRestrictions(deliveryRestrictions);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
     * 
     * @param segmentNum
     *        Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
     */

    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
     * 
     * @return Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
     */

    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    /**
     * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
     * 
     * @param segmentNum
     *        Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentNum(Integer segmentNum) {
        setSegmentNum(segmentNum);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * 
     * @param segmentationCancelIndicator
     *        Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */

    public void setSegmentationCancelIndicator(String segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * 
     * @return Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */

    public String getSegmentationCancelIndicator() {
        return this.segmentationCancelIndicator;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * 
     * @param segmentationCancelIndicator
     *        Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35SegmentationCancelIndicator
     */

    public Scte35SegmentationDescriptor withSegmentationCancelIndicator(String segmentationCancelIndicator) {
        setSegmentationCancelIndicator(segmentationCancelIndicator);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * 
     * @param segmentationCancelIndicator
     *        Corresponds to SCTE-35 segmentation_event_cancel_indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35SegmentationCancelIndicator
     */

    public Scte35SegmentationDescriptor withSegmentationCancelIndicator(Scte35SegmentationCancelIndicator segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator.toString();
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To
     * convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a
     * duration, the time_signal will continue until you insert a cancellation message.
     * 
     * @param segmentationDuration
     *        Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks.
     *        To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do
     *        not enter a duration, the time_signal will continue until you insert a cancellation message.
     */

    public void setSegmentationDuration(Long segmentationDuration) {
        this.segmentationDuration = segmentationDuration;
    }

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To
     * convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a
     * duration, the time_signal will continue until you insert a cancellation message.
     * 
     * @return Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz
     *         ticks. To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If
     *         you do not enter a duration, the time_signal will continue until you insert a cancellation message.
     */

    public Long getSegmentationDuration() {
        return this.segmentationDuration;
    }

    /**
     * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To
     * convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a
     * duration, the time_signal will continue until you insert a cancellation message.
     * 
     * @param segmentationDuration
     *        Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks.
     *        To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do
     *        not enter a duration, the time_signal will continue until you insert a cancellation message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationDuration(Long segmentationDuration) {
        setSegmentationDuration(segmentationDuration);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * 
     * @param segmentationEventId
     *        Corresponds to SCTE-35 segmentation_event_id.
     */

    public void setSegmentationEventId(Long segmentationEventId) {
        this.segmentationEventId = segmentationEventId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * 
     * @return Corresponds to SCTE-35 segmentation_event_id.
     */

    public Long getSegmentationEventId() {
        return this.segmentationEventId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_event_id.
     * 
     * @param segmentationEventId
     *        Corresponds to SCTE-35 segmentation_event_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationEventId(Long segmentationEventId) {
        setSegmentationEventId(segmentationEventId);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     * specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the
     * ID in hex (for example, "0x34") or decimal (for example, "52").
     * 
     * @param segmentationTypeId
     *        Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     *        specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK,
     *        enter the ID in hex (for example, "0x34") or decimal (for example, "52").
     */

    public void setSegmentationTypeId(Integer segmentationTypeId) {
        this.segmentationTypeId = segmentationTypeId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     * specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the
     * ID in hex (for example, "0x34") or decimal (for example, "52").
     * 
     * @return Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     *         specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK,
     *         enter the ID in hex (for example, "0x34") or decimal (for example, "52").
     */

    public Integer getSegmentationTypeId() {
        return this.segmentationTypeId;
    }

    /**
     * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     * specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the
     * ID in hex (for example, "0x34") or decimal (for example, "52").
     * 
     * @param segmentationTypeId
     *        Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35
     *        specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK,
     *        enter the ID in hex (for example, "0x34") or decimal (for example, "52").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationTypeId(Integer segmentationTypeId) {
        setSegmentationTypeId(segmentationTypeId);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     * characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do
     * not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex
     * "41445320496e666f726d6174696f6e.
     * 
     * @param segmentationUpid
     *        Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     *        characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex
     *        characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes
     *        hex "41445320496e666f726d6174696f6e.
     */

    public void setSegmentationUpid(String segmentationUpid) {
        this.segmentationUpid = segmentationUpid;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     * characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do
     * not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex
     * "41445320496e666f726d6174696f6e.
     * 
     * @return Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     *         characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex
     *         characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes
     *         hex "41445320496e666f726d6174696f6e.
     */

    public String getSegmentationUpid() {
        return this.segmentationUpid;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     * characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do
     * not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex
     * "41445320496e666f726d6174696f6e.
     * 
     * @param segmentationUpid
     *        Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the
     *        characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex
     *        characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes
     *        hex "41445320496e666f726d6174696f6e.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationUpid(String segmentationUpid) {
        setSegmentationUpid(segmentationUpid);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35
     * specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example,
     * "0x0C" ) or in decimal (for example, "12").
     * 
     * @param segmentationUpidType
     *        Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the
     *        SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in
     *        decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either
     *        hex (for example, "0x0C" ) or in decimal (for example, "12").
     */

    public void setSegmentationUpidType(Integer segmentationUpidType) {
        this.segmentationUpidType = segmentationUpidType;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35
     * specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example,
     * "0x0C" ) or in decimal (for example, "12").
     * 
     * @return Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the
     *         SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in
     *         decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in
     *         either hex (for example, "0x0C" ) or in decimal (for example, "12").
     */

    public Integer getSegmentationUpidType() {
        return this.segmentationUpidType;
    }

    /**
     * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35
     * specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the
     * CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example,
     * "0x0C" ) or in decimal (for example, "12").
     * 
     * @param segmentationUpidType
     *        Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the
     *        SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in
     *        decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either
     *        hex (for example, "0x0C" ) or in decimal (for example, "12").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationUpidType(Integer segmentationUpidType) {
        setSegmentationUpidType(segmentationUpidType);
        return this;
    }

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
     * 
     * @param segmentsExpected
     *        Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
     */

    public void setSegmentsExpected(Integer segmentsExpected) {
        this.segmentsExpected = segmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
     * 
     * @return Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
     */

    public Integer getSegmentsExpected() {
        return this.segmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
     * 
     * @param segmentsExpected
     *        Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentsExpected(Integer segmentsExpected) {
        setSegmentsExpected(segmentsExpected);
        return this;
    }

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
     * 
     * @param subSegmentNum
     *        Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
     */

    public void setSubSegmentNum(Integer subSegmentNum) {
        this.subSegmentNum = subSegmentNum;
    }

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
     * 
     * @return Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
     */

    public Integer getSubSegmentNum() {
        return this.subSegmentNum;
    }

    /**
     * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
     * 
     * @param subSegmentNum
     *        Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSubSegmentNum(Integer subSegmentNum) {
        setSubSegmentNum(subSegmentNum);
        return this;
    }

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
     * 
     * @param subSegmentsExpected
     *        Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified
     *        segmentation_type_id.
     */

    public void setSubSegmentsExpected(Integer subSegmentsExpected) {
        this.subSegmentsExpected = subSegmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
     * 
     * @return Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified
     *         segmentation_type_id.
     */

    public Integer getSubSegmentsExpected() {
        return this.subSegmentsExpected;
    }

    /**
     * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
     * 
     * @param subSegmentsExpected
     *        Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified
     *        segmentation_type_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSubSegmentsExpected(Integer subSegmentsExpected) {
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
        if (getDeliveryRestrictions() != null)
            sb.append("DeliveryRestrictions: ").append(getDeliveryRestrictions()).append(",");
        if (getSegmentNum() != null)
            sb.append("SegmentNum: ").append(getSegmentNum()).append(",");
        if (getSegmentationCancelIndicator() != null)
            sb.append("SegmentationCancelIndicator: ").append(getSegmentationCancelIndicator()).append(",");
        if (getSegmentationDuration() != null)
            sb.append("SegmentationDuration: ").append(getSegmentationDuration()).append(",");
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

        if (obj instanceof Scte35SegmentationDescriptor == false)
            return false;
        Scte35SegmentationDescriptor other = (Scte35SegmentationDescriptor) obj;
        if (other.getDeliveryRestrictions() == null ^ this.getDeliveryRestrictions() == null)
            return false;
        if (other.getDeliveryRestrictions() != null && other.getDeliveryRestrictions().equals(this.getDeliveryRestrictions()) == false)
            return false;
        if (other.getSegmentNum() == null ^ this.getSegmentNum() == null)
            return false;
        if (other.getSegmentNum() != null && other.getSegmentNum().equals(this.getSegmentNum()) == false)
            return false;
        if (other.getSegmentationCancelIndicator() == null ^ this.getSegmentationCancelIndicator() == null)
            return false;
        if (other.getSegmentationCancelIndicator() != null && other.getSegmentationCancelIndicator().equals(this.getSegmentationCancelIndicator()) == false)
            return false;
        if (other.getSegmentationDuration() == null ^ this.getSegmentationDuration() == null)
            return false;
        if (other.getSegmentationDuration() != null && other.getSegmentationDuration().equals(this.getSegmentationDuration()) == false)
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

        hashCode = prime * hashCode + ((getDeliveryRestrictions() == null) ? 0 : getDeliveryRestrictions().hashCode());
        hashCode = prime * hashCode + ((getSegmentNum() == null) ? 0 : getSegmentNum().hashCode());
        hashCode = prime * hashCode + ((getSegmentationCancelIndicator() == null) ? 0 : getSegmentationCancelIndicator().hashCode());
        hashCode = prime * hashCode + ((getSegmentationDuration() == null) ? 0 : getSegmentationDuration().hashCode());
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
    public Scte35SegmentationDescriptor clone() {
        try {
            return (Scte35SegmentationDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35SegmentationDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
