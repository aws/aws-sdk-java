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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The streaming configuration associated with an Amazon Chime Voice Connector. Specifies whether media streaming is
 * enabled for sending to Amazon Kinesis, and shows the retention period for the Amazon Kinesis data, in hours.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/StreamingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     */
    private Integer dataRetentionInHours;
    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The retention period, in hours, for the Amazon Kinesis data.
     */

    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @return The retention period, in hours, for the Amazon Kinesis data.
     */

    public Integer getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The retention period, in hours, for the Amazon Kinesis data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withDataRetentionInHours(Integer dataRetentionInHours) {
        setDataRetentionInHours(dataRetentionInHours);
        return this;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     * 
     * @param disabled
     *        When true, media streaming to Amazon Kinesis is turned off.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     * 
     * @return When true, media streaming to Amazon Kinesis is turned off.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     * 
     * @param disabled
     *        When true, media streaming to Amazon Kinesis is turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     * 
     * @return When true, media streaming to Amazon Kinesis is turned off.
     */

    public Boolean isDisabled() {
        return this.disabled;
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
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: ").append(getDataRetentionInHours()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingConfiguration == false)
            return false;
        StreamingConfiguration other = (StreamingConfiguration) obj;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public StreamingConfiguration clone() {
        try {
            return (StreamingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.StreamingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
