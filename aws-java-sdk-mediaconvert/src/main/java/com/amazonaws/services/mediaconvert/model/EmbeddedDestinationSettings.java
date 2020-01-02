/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/EmbeddedDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmbeddedDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video
     * stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers
     * that aren't in the same field. For example, choose 1 and 3. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     */
    private Integer destination608ChannelNumber;
    /**
     * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in
     * your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a
     * different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to
     * Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708
     * service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber)
     * for the 708 service number. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     */
    private Integer destination708ServiceNumber;

    /**
     * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video
     * stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers
     * that aren't in the same field. For example, choose 1 and 3. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * 
     * @param destination608ChannelNumber
     *        Ignore this setting unless your input captions are SCC format and your output captions are embedded in the
     *        video stream. Specify a CC number for each captions channel in this output. If you have two channels,
     *        choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see
     *        https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     */

    public void setDestination608ChannelNumber(Integer destination608ChannelNumber) {
        this.destination608ChannelNumber = destination608ChannelNumber;
    }

    /**
     * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video
     * stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers
     * that aren't in the same field. For example, choose 1 and 3. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * 
     * @return Ignore this setting unless your input captions are SCC format and your output captions are embedded in
     *         the video stream. Specify a CC number for each captions channel in this output. If you have two channels,
     *         choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see
     *         https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     */

    public Integer getDestination608ChannelNumber() {
        return this.destination608ChannelNumber;
    }

    /**
     * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video
     * stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers
     * that aren't in the same field. For example, choose 1 and 3. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * 
     * @param destination608ChannelNumber
     *        Ignore this setting unless your input captions are SCC format and your output captions are embedded in the
     *        video stream. Specify a CC number for each captions channel in this output. If you have two channels,
     *        choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see
     *        https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddedDestinationSettings withDestination608ChannelNumber(Integer destination608ChannelNumber) {
        setDestination608ChannelNumber(destination608ChannelNumber);
        return this;
    }

    /**
     * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in
     * your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a
     * different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to
     * Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708
     * service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber)
     * for the 708 service number. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * 
     * @param destination708ServiceNumber
     *        Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions
     *        embedded in your output stream. Optionally, specify the 708 service number for each output captions
     *        channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708
     *        upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you
     *        choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify
     *        for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see
     *        https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     */

    public void setDestination708ServiceNumber(Integer destination708ServiceNumber) {
        this.destination708ServiceNumber = destination708ServiceNumber;
    }

    /**
     * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in
     * your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a
     * different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to
     * Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708
     * service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber)
     * for the 708 service number. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * 
     * @return Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions
     *         embedded in your output stream. Optionally, specify the 708 service number for each output captions
     *         channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708
     *         upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you
     *         choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify
     *         for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see
     *         https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     */

    public Integer getDestination708ServiceNumber() {
        return this.destination708ServiceNumber;
    }

    /**
     * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in
     * your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a
     * different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to
     * Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708
     * service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber)
     * for the 708 service number. For more information, see
     * https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * 
     * @param destination708ServiceNumber
     *        Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions
     *        embedded in your output stream. Optionally, specify the 708 service number for each output captions
     *        channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708
     *        upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you
     *        choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify
     *        for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see
     *        https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddedDestinationSettings withDestination708ServiceNumber(Integer destination708ServiceNumber) {
        setDestination708ServiceNumber(destination708ServiceNumber);
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
        if (getDestination608ChannelNumber() != null)
            sb.append("Destination608ChannelNumber: ").append(getDestination608ChannelNumber()).append(",");
        if (getDestination708ServiceNumber() != null)
            sb.append("Destination708ServiceNumber: ").append(getDestination708ServiceNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmbeddedDestinationSettings == false)
            return false;
        EmbeddedDestinationSettings other = (EmbeddedDestinationSettings) obj;
        if (other.getDestination608ChannelNumber() == null ^ this.getDestination608ChannelNumber() == null)
            return false;
        if (other.getDestination608ChannelNumber() != null && other.getDestination608ChannelNumber().equals(this.getDestination608ChannelNumber()) == false)
            return false;
        if (other.getDestination708ServiceNumber() == null ^ this.getDestination708ServiceNumber() == null)
            return false;
        if (other.getDestination708ServiceNumber() != null && other.getDestination708ServiceNumber().equals(this.getDestination708ServiceNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination608ChannelNumber() == null) ? 0 : getDestination608ChannelNumber().hashCode());
        hashCode = prime * hashCode + ((getDestination708ServiceNumber() == null) ? 0 : getDestination708ServiceNumber().hashCode());
        return hashCode;
    }

    @Override
    public EmbeddedDestinationSettings clone() {
        try {
            return (EmbeddedDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.EmbeddedDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
