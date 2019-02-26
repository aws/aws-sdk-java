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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object that contains information about an event destination that sends data to Amazon CloudWatch Logs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/CloudWatchLogsDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event
     * data to an Amazon CloudWatch destination.
     */
    private String iamRoleArn;
    /** The name of the Amazon CloudWatch Log Group that you want to record events in. */
    private String logGroupArn;

    /**
     * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event
     * data to an Amazon CloudWatch destination.
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to
     *        write event data to an Amazon CloudWatch destination.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event
     * data to an Amazon CloudWatch destination.
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to
     *         write event data to an Amazon CloudWatch destination.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event
     * data to an Amazon CloudWatch destination.
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to
     *        write event data to an Amazon CloudWatch destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsDestination withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * The name of the Amazon CloudWatch Log Group that you want to record events in.
     * 
     * @param logGroupArn
     *        The name of the Amazon CloudWatch Log Group that you want to record events in.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * The name of the Amazon CloudWatch Log Group that you want to record events in.
     * 
     * @return The name of the Amazon CloudWatch Log Group that you want to record events in.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * The name of the Amazon CloudWatch Log Group that you want to record events in.
     * 
     * @param logGroupArn
     *        The name of the Amazon CloudWatch Log Group that you want to record events in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogsDestination withLogGroupArn(String logGroupArn) {
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
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
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

        if (obj instanceof CloudWatchLogsDestination == false)
            return false;
        CloudWatchLogsDestination other = (CloudWatchLogsDestination) obj;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogsDestination clone() {
        try {
            return (CloudWatchLogsDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoice.model.transform.CloudWatchLogsDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
