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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a configuration to record a stage stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/RecordingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recording format for storing a recording in Amazon S3.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @param format
     *        The recording format for storing a recording in Amazon S3.
     * @see RecordingConfigurationFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @return The recording format for storing a recording in Amazon S3.
     * @see RecordingConfigurationFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @param format
     *        The recording format for storing a recording in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingConfigurationFormat
     */

    public RecordingConfiguration withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @param format
     *        The recording format for storing a recording in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingConfigurationFormat
     */

    public RecordingConfiguration withFormat(RecordingConfigurationFormat format) {
        this.format = format.toString();
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingConfiguration == false)
            return false;
        RecordingConfiguration other = (RecordingConfiguration) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public RecordingConfiguration clone() {
        try {
            return (RecordingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.RecordingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
