/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on when data collection began for a source package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/TimestampForCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestampForCollection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data and time when data collection began for a source package. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The data and time when data collection began for a source package. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param timestamp
     *        The data and time when data collection began for a source package. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The data and time when data collection began for a source package. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The data and time when data collection began for a source package. The value is an ISO8601 formatted
     *         string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The data and time when data collection began for a source package. The value is an ISO8601 formatted string. For
     * example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param timestamp
     *        The data and time when data collection began for a source package. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampForCollection withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestampForCollection == false)
            return false;
        TimestampForCollection other = (TimestampForCollection) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public TimestampForCollection clone() {
        try {
            return (TimestampForCollection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.TimestampForCollectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
