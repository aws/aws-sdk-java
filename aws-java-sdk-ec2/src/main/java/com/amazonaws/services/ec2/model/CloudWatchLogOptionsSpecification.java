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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for sending VPN tunnel logs to CloudWatch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CloudWatchLogOptionsSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     */
    private Boolean logEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * </p>
     */
    private String logGroupArn;
    /**
     * <p>
     * Set log format. Default format is <code>json</code>.
     * </p>
     * <p>
     * Valid values: <code>json</code> | <code>text</code>
     * </p>
     */
    private String logOutputFormat;

    /**
     * <p>
     * Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param logEnabled
     *        Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.</p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
     */

    public void setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
    }

    /**
     * <p>
     * Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.</p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean getLogEnabled() {
        return this.logEnabled;
    }

    /**
     * <p>
     * Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param logEnabled
     *        Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.</p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogOptionsSpecification withLogEnabled(Boolean logEnabled) {
        setLogEnabled(logEnabled);
        return this;
    }

    /**
     * <p>
     * Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Enable or disable VPN tunnel logging feature. Default value is <code>False</code>.</p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean isLogEnabled() {
        return this.logEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogOptionsSpecification withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
        return this;
    }

    /**
     * <p>
     * Set log format. Default format is <code>json</code>.
     * </p>
     * <p>
     * Valid values: <code>json</code> | <code>text</code>
     * </p>
     * 
     * @param logOutputFormat
     *        Set log format. Default format is <code>json</code>.</p>
     *        <p>
     *        Valid values: <code>json</code> | <code>text</code>
     */

    public void setLogOutputFormat(String logOutputFormat) {
        this.logOutputFormat = logOutputFormat;
    }

    /**
     * <p>
     * Set log format. Default format is <code>json</code>.
     * </p>
     * <p>
     * Valid values: <code>json</code> | <code>text</code>
     * </p>
     * 
     * @return Set log format. Default format is <code>json</code>.</p>
     *         <p>
     *         Valid values: <code>json</code> | <code>text</code>
     */

    public String getLogOutputFormat() {
        return this.logOutputFormat;
    }

    /**
     * <p>
     * Set log format. Default format is <code>json</code>.
     * </p>
     * <p>
     * Valid values: <code>json</code> | <code>text</code>
     * </p>
     * 
     * @param logOutputFormat
     *        Set log format. Default format is <code>json</code>.</p>
     *        <p>
     *        Valid values: <code>json</code> | <code>text</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLogOptionsSpecification withLogOutputFormat(String logOutputFormat) {
        setLogOutputFormat(logOutputFormat);
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
        if (getLogEnabled() != null)
            sb.append("LogEnabled: ").append(getLogEnabled()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn()).append(",");
        if (getLogOutputFormat() != null)
            sb.append("LogOutputFormat: ").append(getLogOutputFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLogOptionsSpecification == false)
            return false;
        CloudWatchLogOptionsSpecification other = (CloudWatchLogOptionsSpecification) obj;
        if (other.getLogEnabled() == null ^ this.getLogEnabled() == null)
            return false;
        if (other.getLogEnabled() != null && other.getLogEnabled().equals(this.getLogEnabled()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        if (other.getLogOutputFormat() == null ^ this.getLogOutputFormat() == null)
            return false;
        if (other.getLogOutputFormat() != null && other.getLogOutputFormat().equals(this.getLogOutputFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogEnabled() == null) ? 0 : getLogEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLogOutputFormat() == null) ? 0 : getLogOutputFormat().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLogOptionsSpecification clone() {
        try {
            return (CloudWatchLogOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
