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
 * Settings for a SCTE-35 return_to_network message.
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35ReturnToNetworkScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35ReturnToNetworkScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /** The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35. */
    private Long spliceEventId;

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * 
     * @param spliceEventId
     *        The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     */

    public void setSpliceEventId(Long spliceEventId) {
        this.spliceEventId = spliceEventId;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * 
     * @return The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     */

    public Long getSpliceEventId() {
        return this.spliceEventId;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * 
     * @param spliceEventId
     *        The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35ReturnToNetworkScheduleActionSettings withSpliceEventId(Long spliceEventId) {
        setSpliceEventId(spliceEventId);
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
        if (getSpliceEventId() != null)
            sb.append("SpliceEventId: ").append(getSpliceEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35ReturnToNetworkScheduleActionSettings == false)
            return false;
        Scte35ReturnToNetworkScheduleActionSettings other = (Scte35ReturnToNetworkScheduleActionSettings) obj;
        if (other.getSpliceEventId() == null ^ this.getSpliceEventId() == null)
            return false;
        if (other.getSpliceEventId() != null && other.getSpliceEventId().equals(this.getSpliceEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpliceEventId() == null) ? 0 : getSpliceEventId().hashCode());
        return hashCode;
    }

    @Override
    public Scte35ReturnToNetworkScheduleActionSettings clone() {
        try {
            return (Scte35ReturnToNetworkScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35ReturnToNetworkScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
