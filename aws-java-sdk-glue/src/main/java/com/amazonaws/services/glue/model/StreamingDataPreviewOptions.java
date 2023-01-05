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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies options related to data preview for viewing a sample of your data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StreamingDataPreviewOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingDataPreviewOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The polling time in milliseconds.
     * </p>
     */
    private Long pollingTime;
    /**
     * <p>
     * The limit to the number of records polled.
     * </p>
     */
    private Long recordPollingLimit;

    /**
     * <p>
     * The polling time in milliseconds.
     * </p>
     * 
     * @param pollingTime
     *        The polling time in milliseconds.
     */

    public void setPollingTime(Long pollingTime) {
        this.pollingTime = pollingTime;
    }

    /**
     * <p>
     * The polling time in milliseconds.
     * </p>
     * 
     * @return The polling time in milliseconds.
     */

    public Long getPollingTime() {
        return this.pollingTime;
    }

    /**
     * <p>
     * The polling time in milliseconds.
     * </p>
     * 
     * @param pollingTime
     *        The polling time in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDataPreviewOptions withPollingTime(Long pollingTime) {
        setPollingTime(pollingTime);
        return this;
    }

    /**
     * <p>
     * The limit to the number of records polled.
     * </p>
     * 
     * @param recordPollingLimit
     *        The limit to the number of records polled.
     */

    public void setRecordPollingLimit(Long recordPollingLimit) {
        this.recordPollingLimit = recordPollingLimit;
    }

    /**
     * <p>
     * The limit to the number of records polled.
     * </p>
     * 
     * @return The limit to the number of records polled.
     */

    public Long getRecordPollingLimit() {
        return this.recordPollingLimit;
    }

    /**
     * <p>
     * The limit to the number of records polled.
     * </p>
     * 
     * @param recordPollingLimit
     *        The limit to the number of records polled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDataPreviewOptions withRecordPollingLimit(Long recordPollingLimit) {
        setRecordPollingLimit(recordPollingLimit);
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
        if (getPollingTime() != null)
            sb.append("PollingTime: ").append(getPollingTime()).append(",");
        if (getRecordPollingLimit() != null)
            sb.append("RecordPollingLimit: ").append(getRecordPollingLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDataPreviewOptions == false)
            return false;
        StreamingDataPreviewOptions other = (StreamingDataPreviewOptions) obj;
        if (other.getPollingTime() == null ^ this.getPollingTime() == null)
            return false;
        if (other.getPollingTime() != null && other.getPollingTime().equals(this.getPollingTime()) == false)
            return false;
        if (other.getRecordPollingLimit() == null ^ this.getRecordPollingLimit() == null)
            return false;
        if (other.getRecordPollingLimit() != null && other.getRecordPollingLimit().equals(this.getRecordPollingLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPollingTime() == null) ? 0 : getPollingTime().hashCode());
        hashCode = prime * hashCode + ((getRecordPollingLimit() == null) ? 0 : getRecordPollingLimit().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDataPreviewOptions clone() {
        try {
            return (StreamingDataPreviewOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StreamingDataPreviewOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
