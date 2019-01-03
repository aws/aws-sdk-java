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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SourceDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     * </p>
     */
    private KinesisStreamSourceDescription kinesisStreamSourceDescription;

    /**
     * <p>
     * The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     * </p>
     * 
     * @param kinesisStreamSourceDescription
     *        The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     */

    public void setKinesisStreamSourceDescription(KinesisStreamSourceDescription kinesisStreamSourceDescription) {
        this.kinesisStreamSourceDescription = kinesisStreamSourceDescription;
    }

    /**
     * <p>
     * The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     * </p>
     * 
     * @return The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     */

    public KinesisStreamSourceDescription getKinesisStreamSourceDescription() {
        return this.kinesisStreamSourceDescription;
    }

    /**
     * <p>
     * The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     * </p>
     * 
     * @param kinesisStreamSourceDescription
     *        The <a>KinesisStreamSourceDescription</a> value for the source Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceDescription withKinesisStreamSourceDescription(KinesisStreamSourceDescription kinesisStreamSourceDescription) {
        setKinesisStreamSourceDescription(kinesisStreamSourceDescription);
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
        if (getKinesisStreamSourceDescription() != null)
            sb.append("KinesisStreamSourceDescription: ").append(getKinesisStreamSourceDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceDescription == false)
            return false;
        SourceDescription other = (SourceDescription) obj;
        if (other.getKinesisStreamSourceDescription() == null ^ this.getKinesisStreamSourceDescription() == null)
            return false;
        if (other.getKinesisStreamSourceDescription() != null
                && other.getKinesisStreamSourceDescription().equals(this.getKinesisStreamSourceDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKinesisStreamSourceDescription() == null) ? 0 : getKinesisStreamSourceDescription().hashCode());
        return hashCode;
    }

    @Override
    public SourceDescription clone() {
        try {
            return (SourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
