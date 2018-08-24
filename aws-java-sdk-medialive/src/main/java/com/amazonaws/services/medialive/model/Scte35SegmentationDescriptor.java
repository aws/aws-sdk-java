/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SCTE-35 Segmentation Descriptor.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35SegmentationDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35SegmentationDescriptor implements Serializable, Cloneable, StructuredPojo {

    /** SCTE-35 delivery restrictions. */
    private Scte35DeliveryRestrictions deliveryRestrictions;
    /** SCTE-35 segmentation_descriptor segment_num. */
    private Integer segmentNum;
    /** SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator. */
    private String segmentationCancelIndicator;
    /** SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks. */
    private Long segmentationDuration;
    /** SCTE-35 segmentation_descriptor segmentation_event_id. */
    private Long segmentationEventId;
    /** SCTE-35 segmentation_descriptor segmentation_type_id. */
    private Integer segmentationTypeId;
    /** SCTE-35 segmentation_descriptor segmentation_upid as a hex string. */
    private String segmentationUpid;
    /** SCTE-35 segmentation_descriptor segmentation_upid_type. */
    private Integer segmentationUpidType;
    /** SCTE-35 segmentation_descriptor segments_expected. */
    private Integer segmentsExpected;
    /** SCTE-35 segmentation_descriptor sub_segment_num. */
    private Integer subSegmentNum;
    /** SCTE-35 segmentation_descriptor sub_segments_expected. */
    private Integer subSegmentsExpected;

    /**
     * SCTE-35 delivery restrictions.
     * 
     * @param deliveryRestrictions
     *        SCTE-35 delivery restrictions.
     */

    public void setDeliveryRestrictions(Scte35DeliveryRestrictions deliveryRestrictions) {
        this.deliveryRestrictions = deliveryRestrictions;
    }

    /**
     * SCTE-35 delivery restrictions.
     * 
     * @return SCTE-35 delivery restrictions.
     */

    public Scte35DeliveryRestrictions getDeliveryRestrictions() {
        return this.deliveryRestrictions;
    }

    /**
     * SCTE-35 delivery restrictions.
     * 
     * @param deliveryRestrictions
     *        SCTE-35 delivery restrictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withDeliveryRestrictions(Scte35DeliveryRestrictions deliveryRestrictions) {
        setDeliveryRestrictions(deliveryRestrictions);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segment_num.
     * 
     * @param segmentNum
     *        SCTE-35 segmentation_descriptor segment_num.
     */

    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    /**
     * SCTE-35 segmentation_descriptor segment_num.
     * 
     * @return SCTE-35 segmentation_descriptor segment_num.
     */

    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    /**
     * SCTE-35 segmentation_descriptor segment_num.
     * 
     * @param segmentNum
     *        SCTE-35 segmentation_descriptor segment_num.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentNum(Integer segmentNum) {
        setSegmentNum(segmentNum);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * 
     * @param segmentationCancelIndicator
     *        SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */

    public void setSegmentationCancelIndicator(String segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * 
     * @return SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * @see Scte35SegmentationCancelIndicator
     */

    public String getSegmentationCancelIndicator() {
        return this.segmentationCancelIndicator;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * 
     * @param segmentationCancelIndicator
     *        SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35SegmentationCancelIndicator
     */

    public Scte35SegmentationDescriptor withSegmentationCancelIndicator(String segmentationCancelIndicator) {
        setSegmentationCancelIndicator(segmentationCancelIndicator);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * 
     * @param segmentationCancelIndicator
     *        SCTE-35 segmentation_descriptor segmentation_event_cancel_indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35SegmentationCancelIndicator
     */

    public Scte35SegmentationDescriptor withSegmentationCancelIndicator(Scte35SegmentationCancelIndicator segmentationCancelIndicator) {
        this.segmentationCancelIndicator = segmentationCancelIndicator.toString();
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks.
     * 
     * @param segmentationDuration
     *        SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks.
     */

    public void setSegmentationDuration(Long segmentationDuration) {
        this.segmentationDuration = segmentationDuration;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks.
     * 
     * @return SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks.
     */

    public Long getSegmentationDuration() {
        return this.segmentationDuration;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks.
     * 
     * @param segmentationDuration
     *        SCTE-35 segmentation_descriptor segmentation_duration specified in 90 KHz clock ticks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationDuration(Long segmentationDuration) {
        setSegmentationDuration(segmentationDuration);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_id.
     * 
     * @param segmentationEventId
     *        SCTE-35 segmentation_descriptor segmentation_event_id.
     */

    public void setSegmentationEventId(Long segmentationEventId) {
        this.segmentationEventId = segmentationEventId;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_id.
     * 
     * @return SCTE-35 segmentation_descriptor segmentation_event_id.
     */

    public Long getSegmentationEventId() {
        return this.segmentationEventId;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_event_id.
     * 
     * @param segmentationEventId
     *        SCTE-35 segmentation_descriptor segmentation_event_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationEventId(Long segmentationEventId) {
        setSegmentationEventId(segmentationEventId);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_type_id.
     * 
     * @param segmentationTypeId
     *        SCTE-35 segmentation_descriptor segmentation_type_id.
     */

    public void setSegmentationTypeId(Integer segmentationTypeId) {
        this.segmentationTypeId = segmentationTypeId;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_type_id.
     * 
     * @return SCTE-35 segmentation_descriptor segmentation_type_id.
     */

    public Integer getSegmentationTypeId() {
        return this.segmentationTypeId;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_type_id.
     * 
     * @param segmentationTypeId
     *        SCTE-35 segmentation_descriptor segmentation_type_id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationTypeId(Integer segmentationTypeId) {
        setSegmentationTypeId(segmentationTypeId);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_upid as a hex string.
     * 
     * @param segmentationUpid
     *        SCTE-35 segmentation_descriptor segmentation_upid as a hex string.
     */

    public void setSegmentationUpid(String segmentationUpid) {
        this.segmentationUpid = segmentationUpid;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_upid as a hex string.
     * 
     * @return SCTE-35 segmentation_descriptor segmentation_upid as a hex string.
     */

    public String getSegmentationUpid() {
        return this.segmentationUpid;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_upid as a hex string.
     * 
     * @param segmentationUpid
     *        SCTE-35 segmentation_descriptor segmentation_upid as a hex string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationUpid(String segmentationUpid) {
        setSegmentationUpid(segmentationUpid);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_upid_type.
     * 
     * @param segmentationUpidType
     *        SCTE-35 segmentation_descriptor segmentation_upid_type.
     */

    public void setSegmentationUpidType(Integer segmentationUpidType) {
        this.segmentationUpidType = segmentationUpidType;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_upid_type.
     * 
     * @return SCTE-35 segmentation_descriptor segmentation_upid_type.
     */

    public Integer getSegmentationUpidType() {
        return this.segmentationUpidType;
    }

    /**
     * SCTE-35 segmentation_descriptor segmentation_upid_type.
     * 
     * @param segmentationUpidType
     *        SCTE-35 segmentation_descriptor segmentation_upid_type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentationUpidType(Integer segmentationUpidType) {
        setSegmentationUpidType(segmentationUpidType);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor segments_expected.
     * 
     * @param segmentsExpected
     *        SCTE-35 segmentation_descriptor segments_expected.
     */

    public void setSegmentsExpected(Integer segmentsExpected) {
        this.segmentsExpected = segmentsExpected;
    }

    /**
     * SCTE-35 segmentation_descriptor segments_expected.
     * 
     * @return SCTE-35 segmentation_descriptor segments_expected.
     */

    public Integer getSegmentsExpected() {
        return this.segmentsExpected;
    }

    /**
     * SCTE-35 segmentation_descriptor segments_expected.
     * 
     * @param segmentsExpected
     *        SCTE-35 segmentation_descriptor segments_expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSegmentsExpected(Integer segmentsExpected) {
        setSegmentsExpected(segmentsExpected);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor sub_segment_num.
     * 
     * @param subSegmentNum
     *        SCTE-35 segmentation_descriptor sub_segment_num.
     */

    public void setSubSegmentNum(Integer subSegmentNum) {
        this.subSegmentNum = subSegmentNum;
    }

    /**
     * SCTE-35 segmentation_descriptor sub_segment_num.
     * 
     * @return SCTE-35 segmentation_descriptor sub_segment_num.
     */

    public Integer getSubSegmentNum() {
        return this.subSegmentNum;
    }

    /**
     * SCTE-35 segmentation_descriptor sub_segment_num.
     * 
     * @param subSegmentNum
     *        SCTE-35 segmentation_descriptor sub_segment_num.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSubSegmentNum(Integer subSegmentNum) {
        setSubSegmentNum(subSegmentNum);
        return this;
    }

    /**
     * SCTE-35 segmentation_descriptor sub_segments_expected.
     * 
     * @param subSegmentsExpected
     *        SCTE-35 segmentation_descriptor sub_segments_expected.
     */

    public void setSubSegmentsExpected(Integer subSegmentsExpected) {
        this.subSegmentsExpected = subSegmentsExpected;
    }

    /**
     * SCTE-35 segmentation_descriptor sub_segments_expected.
     * 
     * @return SCTE-35 segmentation_descriptor sub_segments_expected.
     */

    public Integer getSubSegmentsExpected() {
        return this.subSegmentsExpected;
    }

    /**
     * SCTE-35 segmentation_descriptor sub_segments_expected.
     * 
     * @param subSegmentsExpected
     *        SCTE-35 segmentation_descriptor sub_segments_expected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35SegmentationDescriptor withSubSegmentsExpected(Integer subSegmentsExpected) {
        setSubSegmentsExpected(subSegmentsExpected);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
