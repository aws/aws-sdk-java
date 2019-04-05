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
public class SetV2LoggingLevelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The log target.
     * </p>
     */
    private LogTarget logTarget;
    /**
     * <p>
     * The log level.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * The log target.
     * </p>
     * 
     * @param logTarget
     *        The log target.
     */

    public void setLogTarget(LogTarget logTarget) {
        this.logTarget = logTarget;
    }

    /**
     * <p>
     * The log target.
     * </p>
     * 
     * @return The log target.
     */

    public LogTarget getLogTarget() {
        return this.logTarget;
    }

    /**
     * <p>
     * The log target.
     * </p>
     * 
     * @param logTarget
     *        The log target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetV2LoggingLevelRequest withLogTarget(LogTarget logTarget) {
        setLogTarget(logTarget);
        return this;
    }

    /**
     * <p>
     * The log level.
     * </p>
     * 
     * @param logLevel
     *        The log level.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * The log level.
     * </p>
     * 
     * @return The log level.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * The log level.
     * </p>
     * 
     * @param logLevel
     *        The log level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public SetV2LoggingLevelRequest withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * The log level.
     * </p>
     * 
     * @param logLevel
     *        The log level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public SetV2LoggingLevelRequest withLogLevel(LogLevel logLevel) {
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
        if (getLogTarget() != null)
            sb.append("LogTarget: ").append(getLogTarget()).append(",");
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

        if (obj instanceof SetV2LoggingLevelRequest == false)
            return false;
        SetV2LoggingLevelRequest other = (SetV2LoggingLevelRequest) obj;
        if (other.getLogTarget() == null ^ this.getLogTarget() == null)
            return false;
        if (other.getLogTarget() != null && other.getLogTarget().equals(this.getLogTarget()) == false)
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

        hashCode = prime * hashCode + ((getLogTarget() == null) ? 0 : getLogTarget().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public SetV2LoggingLevelRequest clone() {
        return (SetV2LoggingLevelRequest) super.clone();
    }

}
