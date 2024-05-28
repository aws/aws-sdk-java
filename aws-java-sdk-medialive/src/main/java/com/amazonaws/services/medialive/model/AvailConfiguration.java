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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Avail Configuration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AvailConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals traditionally. With
     * Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create segment breaks. With ESAM
     * mode, signals are forwarded to an ESAM server for possible update.
     */
    private AvailSettings availSettings;
    /**
     * Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented outputs.
     * Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular cadence of
     * breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if any).
     * 
     * ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs. This is
     * the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups that have SCTE
     * 35 passthrough enabled. This is the recommended value, because it reduces unnecessary segment breaks.
     */
    private String scte35SegmentationScope;

    /**
     * Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals traditionally. With
     * Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create segment breaks. With ESAM
     * mode, signals are forwarded to an ESAM server for possible update.
     * 
     * @param availSettings
     *        Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals
     *        traditionally. With Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create
     *        segment breaks. With ESAM mode, signals are forwarded to an ESAM server for possible update.
     */

    public void setAvailSettings(AvailSettings availSettings) {
        this.availSettings = availSettings;
    }

    /**
     * Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals traditionally. With
     * Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create segment breaks. With ESAM
     * mode, signals are forwarded to an ESAM server for possible update.
     * 
     * @return Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals
     *         traditionally. With Time Signal APOS mode only Time Signal Placement Opportunity and Break messages
     *         create segment breaks. With ESAM mode, signals are forwarded to an ESAM server for possible update.
     */

    public AvailSettings getAvailSettings() {
        return this.availSettings;
    }

    /**
     * Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals traditionally. With
     * Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create segment breaks. With ESAM
     * mode, signals are forwarded to an ESAM server for possible update.
     * 
     * @param availSettings
     *        Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals
     *        traditionally. With Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create
     *        segment breaks. With ESAM mode, signals are forwarded to an ESAM server for possible update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailConfiguration withAvailSettings(AvailSettings availSettings) {
        setAvailSettings(availSettings);
        return this;
    }

    /**
     * Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented outputs.
     * Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular cadence of
     * breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if any).
     * 
     * ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs. This is
     * the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups that have SCTE
     * 35 passthrough enabled. This is the recommended value, because it reduces unnecessary segment breaks.
     * 
     * @param scte35SegmentationScope
     *        Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented
     *        outputs. Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular
     *        cadence of breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if
     *        any).
     * 
     *        ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs.
     *        This is the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups
     *        that have SCTE 35 passthrough enabled. This is the recommended value, because it reduces unnecessary
     *        segment breaks.
     * @see Scte35SegmentationScope
     */

    public void setScte35SegmentationScope(String scte35SegmentationScope) {
        this.scte35SegmentationScope = scte35SegmentationScope;
    }

    /**
     * Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented outputs.
     * Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular cadence of
     * breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if any).
     * 
     * ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs. This is
     * the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups that have SCTE
     * 35 passthrough enabled. This is the recommended value, because it reduces unnecessary segment breaks.
     * 
     * @return Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented
     *         outputs. Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular
     *         cadence of breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if
     *         any).
     * 
     *         ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs.
     *         This is the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups
     *         that have SCTE 35 passthrough enabled. This is the recommended value, because it reduces unnecessary
     *         segment breaks.
     * @see Scte35SegmentationScope
     */

    public String getScte35SegmentationScope() {
        return this.scte35SegmentationScope;
    }

    /**
     * Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented outputs.
     * Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular cadence of
     * breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if any).
     * 
     * ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs. This is
     * the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups that have SCTE
     * 35 passthrough enabled. This is the recommended value, because it reduces unnecessary segment breaks.
     * 
     * @param scte35SegmentationScope
     *        Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented
     *        outputs. Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular
     *        cadence of breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if
     *        any).
     * 
     *        ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs.
     *        This is the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups
     *        that have SCTE 35 passthrough enabled. This is the recommended value, because it reduces unnecessary
     *        segment breaks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35SegmentationScope
     */

    public AvailConfiguration withScte35SegmentationScope(String scte35SegmentationScope) {
        setScte35SegmentationScope(scte35SegmentationScope);
        return this;
    }

    /**
     * Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented outputs.
     * Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular cadence of
     * breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if any).
     * 
     * ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs. This is
     * the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups that have SCTE
     * 35 passthrough enabled. This is the recommended value, because it reduces unnecessary segment breaks.
     * 
     * @param scte35SegmentationScope
     *        Configures whether SCTE 35 passthrough triggers segment breaks in all output groups that use segmented
     *        outputs. Insertion of a SCTE 35 message typically results in a segment break, in addition to the regular
     *        cadence of breaks. The segment breaks appear in video outputs, audio outputs, and captions outputs (if
     *        any).
     * 
     *        ALL_OUTPUT_GROUPS: Default. Insert the segment break in in all output groups that have segmented outputs.
     *        This is the legacy behavior. SCTE35_ENABLED_OUTPUT_GROUPS: Insert the segment break only in output groups
     *        that have SCTE 35 passthrough enabled. This is the recommended value, because it reduces unnecessary
     *        segment breaks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35SegmentationScope
     */

    public AvailConfiguration withScte35SegmentationScope(Scte35SegmentationScope scte35SegmentationScope) {
        this.scte35SegmentationScope = scte35SegmentationScope.toString();
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
        if (getAvailSettings() != null)
            sb.append("AvailSettings: ").append(getAvailSettings()).append(",");
        if (getScte35SegmentationScope() != null)
            sb.append("Scte35SegmentationScope: ").append(getScte35SegmentationScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailConfiguration == false)
            return false;
        AvailConfiguration other = (AvailConfiguration) obj;
        if (other.getAvailSettings() == null ^ this.getAvailSettings() == null)
            return false;
        if (other.getAvailSettings() != null && other.getAvailSettings().equals(this.getAvailSettings()) == false)
            return false;
        if (other.getScte35SegmentationScope() == null ^ this.getScte35SegmentationScope() == null)
            return false;
        if (other.getScte35SegmentationScope() != null && other.getScte35SegmentationScope().equals(this.getScte35SegmentationScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailSettings() == null) ? 0 : getAvailSettings().hashCode());
        hashCode = prime * hashCode + ((getScte35SegmentationScope() == null) ? 0 : getScte35SegmentationScope().hashCode());
        return hashCode;
    }

    @Override
    public AvailConfiguration clone() {
        try {
            return (AvailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AvailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
