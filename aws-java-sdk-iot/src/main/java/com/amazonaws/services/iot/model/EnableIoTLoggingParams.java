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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters used when defining a mitigation action that enable AWS IoT logging.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableIoTLoggingParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role used for logging.
     * </p>
     */
    private String roleArnForLogging;
    /**
     * <p>
     * Specifies the types of information to be logged.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * The ARN of the IAM role used for logging.
     * </p>
     * 
     * @param roleArnForLogging
     *        The ARN of the IAM role used for logging.
     */

    public void setRoleArnForLogging(String roleArnForLogging) {
        this.roleArnForLogging = roleArnForLogging;
    }

    /**
     * <p>
     * The ARN of the IAM role used for logging.
     * </p>
     * 
     * @return The ARN of the IAM role used for logging.
     */

    public String getRoleArnForLogging() {
        return this.roleArnForLogging;
    }

    /**
     * <p>
     * The ARN of the IAM role used for logging.
     * </p>
     * 
     * @param roleArnForLogging
     *        The ARN of the IAM role used for logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableIoTLoggingParams withRoleArnForLogging(String roleArnForLogging) {
        setRoleArnForLogging(roleArnForLogging);
        return this;
    }

    /**
     * <p>
     * Specifies the types of information to be logged.
     * </p>
     * 
     * @param logLevel
     *        Specifies the types of information to be logged.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Specifies the types of information to be logged.
     * </p>
     * 
     * @return Specifies the types of information to be logged.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Specifies the types of information to be logged.
     * </p>
     * 
     * @param logLevel
     *        Specifies the types of information to be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public EnableIoTLoggingParams withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Specifies the types of information to be logged.
     * </p>
     * 
     * @param logLevel
     *        Specifies the types of information to be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public EnableIoTLoggingParams withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
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
        if (getRoleArnForLogging() != null)
            sb.append("RoleArnForLogging: ").append(getRoleArnForLogging()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableIoTLoggingParams == false)
            return false;
        EnableIoTLoggingParams other = (EnableIoTLoggingParams) obj;
        if (other.getRoleArnForLogging() == null ^ this.getRoleArnForLogging() == null)
            return false;
        if (other.getRoleArnForLogging() != null && other.getRoleArnForLogging().equals(this.getRoleArnForLogging()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArnForLogging() == null) ? 0 : getRoleArnForLogging().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public EnableIoTLoggingParams clone() {
        try {
            return (EnableIoTLoggingParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.EnableIoTLoggingParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
