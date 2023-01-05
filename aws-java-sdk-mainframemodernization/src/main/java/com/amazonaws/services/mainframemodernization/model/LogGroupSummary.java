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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A subset of the attributes that describe a log group. In CloudWatch a log group is a group of log streams that share
 * the same retention, monitoring, and access control settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/LogGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The type of log.
     * </p>
     */
    private String logType;

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroupSummary withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The type of log.
     * </p>
     * 
     * @param logType
     *        The type of log.
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * The type of log.
     * </p>
     * 
     * @return The type of log.
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * The type of log.
     * </p>
     * 
     * @param logType
     *        The type of log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroupSummary withLogType(String logType) {
        setLogType(logType);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroupSummary == false)
            return false;
        LogGroupSummary other = (LogGroupSummary) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        return hashCode;
    }

    @Override
    public LogGroupSummary clone() {
        try {
            return (LogGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.LogGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
