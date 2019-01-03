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
 * Configures retry behavior in case Kinesis Data Firehose is unable to deliver documents to Splunk, or if it doesn't
 * receive an acknowledgment from Splunk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SplunkRetryOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SplunkRetryOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial
     * attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for
     * acknowledgment from Splunk after each attempt.
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial
     * attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for
     * acknowledgment from Splunk after each attempt.
     * </p>
     * 
     * @param durationInSeconds
     *        The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the
     *        initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data
     *        Firehose waits for acknowledgment from Splunk after each attempt.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial
     * attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for
     * acknowledgment from Splunk after each attempt.
     * </p>
     * 
     * @return The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the
     *         initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data
     *         Firehose waits for acknowledgment from Splunk after each attempt.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial
     * attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for
     * acknowledgment from Splunk after each attempt.
     * </p>
     * 
     * @param durationInSeconds
     *        The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the
     *        initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data
     *        Firehose waits for acknowledgment from Splunk after each attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkRetryOptions withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
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
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplunkRetryOptions == false)
            return false;
        SplunkRetryOptions other = (SplunkRetryOptions) obj;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public SplunkRetryOptions clone() {
        try {
            return (SplunkRetryOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SplunkRetryOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
