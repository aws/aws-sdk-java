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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon CloudWatch Logs logging configuration settings for the pipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/CloudwatchLogsLogDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudwatchLogsLogDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the log
     * records.
     * </p>
     */
    private String logGroupArn;

    /**
     * <p>
     * The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the log
     * records.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the
     *        log records.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the log
     * records.
     * </p>
     * 
     * @return The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the
     *         log records.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the log
     * records.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Web Services Resource Name (ARN) for the CloudWatch log group to which EventBridge sends the
     *        log records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsLogDestination withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
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
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchLogsLogDestination == false)
            return false;
        CloudwatchLogsLogDestination other = (CloudwatchLogsLogDestination) obj;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public CloudwatchLogsLogDestination clone() {
        try {
            return (CloudwatchLogsLogDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.CloudwatchLogsLogDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
