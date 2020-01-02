/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains logging configuration information for a type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/LoggingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * </p>
     */
    private String logRoleArn;
    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's
     * handlers.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * </p>
     * 
     * @param logRoleArn
     *        The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     */

    public void setLogRoleArn(String logRoleArn) {
        this.logRoleArn = logRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * </p>
     * 
     * @return The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     */

    public String getLogRoleArn() {
        return this.logRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * </p>
     * 
     * @param logRoleArn
     *        The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withLogRoleArn(String logRoleArn) {
        setLogRoleArn(logRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's
     * handlers.
     * </p>
     * 
     * @param logGroupName
     *        The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the
     *        type's handlers.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's
     * handlers.
     * </p>
     * 
     * @return The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the
     *         type's handlers.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's
     * handlers.
     * </p>
     * 
     * @param logGroupName
     *        The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the
     *        type's handlers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withLogGroupName(String logGroupName) {
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
        if (getLogRoleArn() != null)
            sb.append("LogRoleArn: ").append(getLogRoleArn()).append(",");
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

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;
        if (other.getLogRoleArn() == null ^ this.getLogRoleArn() == null)
            return false;
        if (other.getLogRoleArn() != null && other.getLogRoleArn().equals(this.getLogRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getLogRoleArn() == null) ? 0 : getLogRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfig clone() {
        try {
            return (LoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
