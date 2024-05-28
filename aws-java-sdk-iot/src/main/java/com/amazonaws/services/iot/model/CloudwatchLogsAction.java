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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action that sends data to CloudWatch Logs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudwatchLogsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch log.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The CloudWatch log group to which the action sends data.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     * <code>true</code> or <code>false</code> <i>(default)</i>.
     * </p>
     */
    private Boolean batchMode;

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch log.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the CloudWatch log.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch log.
     * </p>
     * 
     * @return The IAM role that allows access to the CloudWatch log.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch log.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the CloudWatch log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The CloudWatch log group to which the action sends data.
     * </p>
     * 
     * @param logGroupName
     *        The CloudWatch log group to which the action sends data.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The CloudWatch log group to which the action sends data.
     * </p>
     * 
     * @return The CloudWatch log group to which the action sends data.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The CloudWatch log group to which the action sends data.
     * </p>
     * 
     * @param logGroupName
     *        The CloudWatch log group to which the action sends data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsAction withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     * <code>true</code> or <code>false</code> <i>(default)</i>.
     * </p>
     * 
     * @param batchMode
     *        Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     *        <code>true</code> or <code>false</code> <i>(default)</i>.
     */

    public void setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
    }

    /**
     * <p>
     * Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     * <code>true</code> or <code>false</code> <i>(default)</i>.
     * </p>
     * 
     * @return Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     *         <code>true</code> or <code>false</code> <i>(default)</i>.
     */

    public Boolean getBatchMode() {
        return this.batchMode;
    }

    /**
     * <p>
     * Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     * <code>true</code> or <code>false</code> <i>(default)</i>.
     * </p>
     * 
     * @param batchMode
     *        Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     *        <code>true</code> or <code>false</code> <i>(default)</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsAction withBatchMode(Boolean batchMode) {
        setBatchMode(batchMode);
        return this;
    }

    /**
     * <p>
     * Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     * <code>true</code> or <code>false</code> <i>(default)</i>.
     * </p>
     * 
     * @return Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include
     *         <code>true</code> or <code>false</code> <i>(default)</i>.
     */

    public Boolean isBatchMode() {
        return this.batchMode;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getBatchMode() != null)
            sb.append("BatchMode: ").append(getBatchMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchLogsAction == false)
            return false;
        CloudwatchLogsAction other = (CloudwatchLogsAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getBatchMode() == null ^ this.getBatchMode() == null)
            return false;
        if (other.getBatchMode() != null && other.getBatchMode().equals(this.getBatchMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getBatchMode() == null) ? 0 : getBatchMode().hashCode());
        return hashCode;
    }

    @Override
    public CloudwatchLogsAction clone() {
        try {
            return (CloudwatchLogsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CloudwatchLogsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
