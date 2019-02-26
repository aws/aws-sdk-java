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
 * Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TrackSourceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackSourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the
     * captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL.
     * For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions
     * track in your job outputs, create multiple input captions selectors. Specify one track per selector.
     */
    private Integer trackNumber;

    /**
     * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the
     * captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL.
     * For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions
     * track in your job outputs, create multiple input captions selectors. Specify one track per selector.
     * 
     * @param trackNumber
     *        Use this setting to select a single captions track from a source. Track numbers correspond to the order in
     *        the captions source file. For IMF sources, track numbering is based on the order that the captions appear
     *        in the CPL. For example, use 1 to select the captions asset that is listed first in the CPL. To include
     *        more than one captions track in your job outputs, create multiple input captions selectors. Specify one
     *        track per selector.
     */

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the
     * captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL.
     * For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions
     * track in your job outputs, create multiple input captions selectors. Specify one track per selector.
     * 
     * @return Use this setting to select a single captions track from a source. Track numbers correspond to the order
     *         in the captions source file. For IMF sources, track numbering is based on the order that the captions
     *         appear in the CPL. For example, use 1 to select the captions asset that is listed first in the CPL. To
     *         include more than one captions track in your job outputs, create multiple input captions selectors.
     *         Specify one track per selector.
     */

    public Integer getTrackNumber() {
        return this.trackNumber;
    }

    /**
     * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the
     * captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL.
     * For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions
     * track in your job outputs, create multiple input captions selectors. Specify one track per selector.
     * 
     * @param trackNumber
     *        Use this setting to select a single captions track from a source. Track numbers correspond to the order in
     *        the captions source file. For IMF sources, track numbering is based on the order that the captions appear
     *        in the CPL. For example, use 1 to select the captions asset that is listed first in the CPL. To include
     *        more than one captions track in your job outputs, create multiple input captions selectors. Specify one
     *        track per selector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackSourceSettings withTrackNumber(Integer trackNumber) {
        setTrackNumber(trackNumber);
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
        if (getTrackNumber() != null)
            sb.append("TrackNumber: ").append(getTrackNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackSourceSettings == false)
            return false;
        TrackSourceSettings other = (TrackSourceSettings) obj;
        if (other.getTrackNumber() == null ^ this.getTrackNumber() == null)
            return false;
        if (other.getTrackNumber() != null && other.getTrackNumber().equals(this.getTrackNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrackNumber() == null) ? 0 : getTrackNumber().hashCode());
        return hashCode;
    }

    @Override
    public TrackSourceSettings clone() {
        try {
            return (TrackSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TrackSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
