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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Consists of the logging role and the log group name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/LoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to
     *        turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity
     *        in your CloudWatch logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to
     *         turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity
     *         in your CloudWatch logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on
     * Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your
     * CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to
     *        turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity
     *        in your CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     * </p>
     * 
     * @param logGroupName
     *        The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     * </p>
     * 
     * @return The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     * </p>
     * 
     * @param logGroupName
     *        The name of the CloudWatch logging group for the Transfer Family server to which this workflow belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfiguration withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
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
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfiguration == false)
            return false;
        LoggingConfiguration other = (LoggingConfiguration) obj;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfiguration clone() {
        try {
            return (LoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.LoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
