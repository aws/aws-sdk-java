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
 * The retry behavior in case Firehose is unable to deliver data to an Amazon S3 prefix.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/RetryOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     * </p>
     * 
     * @param durationInSeconds
     *        The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     * </p>
     * 
     * @return The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     * </p>
     * 
     * @param durationInSeconds
     *        The period of time during which Firehose retries to deliver data to the specified Amazon S3 prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryOptions withDurationInSeconds(Integer durationInSeconds) {
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

        if (obj instanceof RetryOptions == false)
            return false;
        RetryOptions other = (RetryOptions) obj;
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
    public RetryOptions clone() {
        try {
            return (RetryOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.RetryOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
