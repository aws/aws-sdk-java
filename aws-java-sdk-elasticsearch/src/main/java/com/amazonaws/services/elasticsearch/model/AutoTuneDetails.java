/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies details of the Auto-Tune action. See the <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
 * target="_blank">Developer Guide</a> for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneDetails implements Serializable, Cloneable, StructuredPojo {

    private ScheduledAutoTuneDetails scheduledAutoTuneDetails;

    /**
     * @param scheduledAutoTuneDetails
     */

    public void setScheduledAutoTuneDetails(ScheduledAutoTuneDetails scheduledAutoTuneDetails) {
        this.scheduledAutoTuneDetails = scheduledAutoTuneDetails;
    }

    /**
     * @return
     */

    public ScheduledAutoTuneDetails getScheduledAutoTuneDetails() {
        return this.scheduledAutoTuneDetails;
    }

    /**
     * @param scheduledAutoTuneDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneDetails withScheduledAutoTuneDetails(ScheduledAutoTuneDetails scheduledAutoTuneDetails) {
        setScheduledAutoTuneDetails(scheduledAutoTuneDetails);
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
        if (getScheduledAutoTuneDetails() != null)
            sb.append("ScheduledAutoTuneDetails: ").append(getScheduledAutoTuneDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoTuneDetails == false)
            return false;
        AutoTuneDetails other = (AutoTuneDetails) obj;
        if (other.getScheduledAutoTuneDetails() == null ^ this.getScheduledAutoTuneDetails() == null)
            return false;
        if (other.getScheduledAutoTuneDetails() != null && other.getScheduledAutoTuneDetails().equals(this.getScheduledAutoTuneDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledAutoTuneDetails() == null) ? 0 : getScheduledAutoTuneDetails().hashCode());
        return hashCode;
    }

    @Override
    public AutoTuneDetails clone() {
        try {
            return (AutoTuneDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.AutoTuneDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
