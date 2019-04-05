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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon Resource Name (ARN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CloudWatchLoggingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLoggingOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the CloudWatch log to receive application messages.
     * </p>
     */
    private String logStreamARN;

    /**
     * <p>
     * The ARN of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @param logStreamARN
     *        The ARN of the CloudWatch log to receive application messages.
     */

    public void setLogStreamARN(String logStreamARN) {
        this.logStreamARN = logStreamARN;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @return The ARN of the CloudWatch log to receive application messages.
     */

    public String getLogStreamARN() {
        return this.logStreamARN;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log to receive application messages.
     * </p>
     * 
     * @param logStreamARN
     *        The ARN of the CloudWatch log to receive application messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingOption withLogStreamARN(String logStreamARN) {
        setLogStreamARN(logStreamARN);
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
        if (getLogStreamARN() != null)
            sb.append("LogStreamARN: ").append(getLogStreamARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLoggingOption == false)
            return false;
        CloudWatchLoggingOption other = (CloudWatchLoggingOption) obj;
        if (other.getLogStreamARN() == null ^ this.getLogStreamARN() == null)
            return false;
        if (other.getLogStreamARN() != null && other.getLogStreamARN().equals(this.getLogStreamARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreamARN() == null) ? 0 : getLogStreamARN().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLoggingOption clone() {
        try {
            return (CloudWatchLoggingOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CloudWatchLoggingOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
