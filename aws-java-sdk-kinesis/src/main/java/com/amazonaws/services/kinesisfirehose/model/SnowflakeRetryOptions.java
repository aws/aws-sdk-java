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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data, Firehose first
 * waits for an acknowledgment from the HTTP endpoint. If an error occurs or the acknowledgment doesn’t arrive within
 * the acknowledgment timeout period, Firehose starts the retry duration counter. It keeps retrying until the retry
 * duration expires. After that, Firehose considers it a data delivery failure and backs up the data to your Amazon S3
 * bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a retry), it restarts
 * the acknowledgement timeout counter and waits for an acknowledgement from the HTTP endpoint. Even if the retry
 * duration expires, Firehose still waits for the acknowledgment until it receives it or the acknowledgement timeout
 * period is reached. If the acknowledgment times out, Firehose determines whether there's time left in the retry
 * counter. If there is time left, it retries again and repeats the logic until it receives an acknowledgment or
 * determines that the retry time has expired. If you don't want Firehose to retry sending data, set this value to 0.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SnowflakeRetryOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeRetryOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     * 
     * @param durationInSeconds
     *        the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     * 
     * @return the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     * 
     * @param durationInSeconds
     *        the time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeRetryOptions withDurationInSeconds(Integer durationInSeconds) {
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

        if (obj instanceof SnowflakeRetryOptions == false)
            return false;
        SnowflakeRetryOptions other = (SnowflakeRetryOptions) obj;
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
    public SnowflakeRetryOptions clone() {
        try {
            return (SnowflakeRetryOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SnowflakeRetryOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
