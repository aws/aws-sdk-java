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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetV2LoggingOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The default logging level.
     * </p>
     */
    private String defaultLogLevel;
    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     */
    private Boolean disableAllLogs;

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that allows IoT to write to Cloudwatch logs.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     * 
     * @return The ARN of the role that allows IoT to write to Cloudwatch logs.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that allows IoT to write to Cloudwatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetV2LoggingOptionsRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * 
     * @param defaultLogLevel
     *        The default logging level.
     * @see LogLevel
     */

    public void setDefaultLogLevel(String defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * 
     * @return The default logging level.
     * @see LogLevel
     */

    public String getDefaultLogLevel() {
        return this.defaultLogLevel;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * 
     * @param defaultLogLevel
     *        The default logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public SetV2LoggingOptionsRequest withDefaultLogLevel(String defaultLogLevel) {
        setDefaultLogLevel(defaultLogLevel);
        return this;
    }

    /**
     * <p>
     * The default logging level.
     * </p>
     * 
     * @param defaultLogLevel
     *        The default logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public SetV2LoggingOptionsRequest withDefaultLogLevel(LogLevel defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     * 
     * @param disableAllLogs
     *        If true all logs are disabled. The default is false.
     */

    public void setDisableAllLogs(Boolean disableAllLogs) {
        this.disableAllLogs = disableAllLogs;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     * 
     * @return If true all logs are disabled. The default is false.
     */

    public Boolean getDisableAllLogs() {
        return this.disableAllLogs;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     * 
     * @param disableAllLogs
     *        If true all logs are disabled. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetV2LoggingOptionsRequest withDisableAllLogs(Boolean disableAllLogs) {
        setDisableAllLogs(disableAllLogs);
        return this;
    }

    /**
     * <p>
     * If true all logs are disabled. The default is false.
     * </p>
     * 
     * @return If true all logs are disabled. The default is false.
     */

    public Boolean isDisableAllLogs() {
        return this.disableAllLogs;
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
        if (getDefaultLogLevel() != null)
            sb.append("DefaultLogLevel: ").append(getDefaultLogLevel()).append(",");
        if (getDisableAllLogs() != null)
            sb.append("DisableAllLogs: ").append(getDisableAllLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetV2LoggingOptionsRequest == false)
            return false;
        SetV2LoggingOptionsRequest other = (SetV2LoggingOptionsRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDefaultLogLevel() == null ^ this.getDefaultLogLevel() == null)
            return false;
        if (other.getDefaultLogLevel() != null && other.getDefaultLogLevel().equals(this.getDefaultLogLevel()) == false)
            return false;
        if (other.getDisableAllLogs() == null ^ this.getDisableAllLogs() == null)
            return false;
        if (other.getDisableAllLogs() != null && other.getDisableAllLogs().equals(this.getDisableAllLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultLogLevel() == null) ? 0 : getDefaultLogLevel().hashCode());
        hashCode = prime * hashCode + ((getDisableAllLogs() == null) ? 0 : getDisableAllLogs().hashCode());
        return hashCode;
    }

    @Override
    public SetV2LoggingOptionsRequest clone() {
        return (SetV2LoggingOptionsRequest) super.clone();
    }

}
