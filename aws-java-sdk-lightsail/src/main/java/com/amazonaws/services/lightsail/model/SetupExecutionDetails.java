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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns details about the commands that were run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetupExecutionDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetupExecutionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The command that was executed.
     * </p>
     */
    private String command;
    /**
     * <p>
     * The timestamp for when the request was run.
     * </p>
     */
    private java.util.Date dateTime;
    /**
     * <p>
     * The name of the target resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the <code>SetupInstanceHttps</code> request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The text written by the command to stderr.
     * </p>
     */
    private String standardError;
    /**
     * <p>
     * The text written by the command to stdout.
     * </p>
     */
    private String standardOutput;
    /**
     * <p>
     * The current version of the script..
     * </p>
     */
    private String version;

    /**
     * <p>
     * The command that was executed.
     * </p>
     * 
     * @param command
     *        The command that was executed.
     */

    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * <p>
     * The command that was executed.
     * </p>
     * 
     * @return The command that was executed.
     */

    public String getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The command that was executed.
     * </p>
     * 
     * @param command
     *        The command that was executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupExecutionDetails withCommand(String command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the request was run.
     * </p>
     * 
     * @param dateTime
     *        The timestamp for when the request was run.
     */

    public void setDateTime(java.util.Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * <p>
     * The timestamp for when the request was run.
     * </p>
     * 
     * @return The timestamp for when the request was run.
     */

    public java.util.Date getDateTime() {
        return this.dateTime;
    }

    /**
     * <p>
     * The timestamp for when the request was run.
     * </p>
     * 
     * @param dateTime
     *        The timestamp for when the request was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupExecutionDetails withDateTime(java.util.Date dateTime) {
        setDateTime(dateTime);
        return this;
    }

    /**
     * <p>
     * The name of the target resource.
     * </p>
     * 
     * @param name
     *        The name of the target resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target resource.
     * </p>
     * 
     * @return The name of the target resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target resource.
     * </p>
     * 
     * @param name
     *        The name of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupExecutionDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the <code>SetupInstanceHttps</code> request.
     * </p>
     * 
     * @param status
     *        The status of the <code>SetupInstanceHttps</code> request.
     * @see SetupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>SetupInstanceHttps</code> request.
     * </p>
     * 
     * @return The status of the <code>SetupInstanceHttps</code> request.
     * @see SetupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>SetupInstanceHttps</code> request.
     * </p>
     * 
     * @param status
     *        The status of the <code>SetupInstanceHttps</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SetupStatus
     */

    public SetupExecutionDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>SetupInstanceHttps</code> request.
     * </p>
     * 
     * @param status
     *        The status of the <code>SetupInstanceHttps</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SetupStatus
     */

    public SetupExecutionDetails withStatus(SetupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The text written by the command to stderr.
     * </p>
     * 
     * @param standardError
     *        The text written by the command to stderr.
     */

    public void setStandardError(String standardError) {
        this.standardError = standardError;
    }

    /**
     * <p>
     * The text written by the command to stderr.
     * </p>
     * 
     * @return The text written by the command to stderr.
     */

    public String getStandardError() {
        return this.standardError;
    }

    /**
     * <p>
     * The text written by the command to stderr.
     * </p>
     * 
     * @param standardError
     *        The text written by the command to stderr.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupExecutionDetails withStandardError(String standardError) {
        setStandardError(standardError);
        return this;
    }

    /**
     * <p>
     * The text written by the command to stdout.
     * </p>
     * 
     * @param standardOutput
     *        The text written by the command to stdout.
     */

    public void setStandardOutput(String standardOutput) {
        this.standardOutput = standardOutput;
    }

    /**
     * <p>
     * The text written by the command to stdout.
     * </p>
     * 
     * @return The text written by the command to stdout.
     */

    public String getStandardOutput() {
        return this.standardOutput;
    }

    /**
     * <p>
     * The text written by the command to stdout.
     * </p>
     * 
     * @param standardOutput
     *        The text written by the command to stdout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupExecutionDetails withStandardOutput(String standardOutput) {
        setStandardOutput(standardOutput);
        return this;
    }

    /**
     * <p>
     * The current version of the script..
     * </p>
     * 
     * @param version
     *        The current version of the script..
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the script..
     * </p>
     * 
     * @return The current version of the script..
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the script..
     * </p>
     * 
     * @param version
     *        The current version of the script..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupExecutionDetails withVersion(String version) {
        setVersion(version);
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
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDateTime() != null)
            sb.append("DateTime: ").append(getDateTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStandardError() != null)
            sb.append("StandardError: ").append(getStandardError()).append(",");
        if (getStandardOutput() != null)
            sb.append("StandardOutput: ").append(getStandardOutput()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetupExecutionDetails == false)
            return false;
        SetupExecutionDetails other = (SetupExecutionDetails) obj;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDateTime() == null ^ this.getDateTime() == null)
            return false;
        if (other.getDateTime() != null && other.getDateTime().equals(this.getDateTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStandardError() == null ^ this.getStandardError() == null)
            return false;
        if (other.getStandardError() != null && other.getStandardError().equals(this.getStandardError()) == false)
            return false;
        if (other.getStandardOutput() == null ^ this.getStandardOutput() == null)
            return false;
        if (other.getStandardOutput() != null && other.getStandardOutput().equals(this.getStandardOutput()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStandardError() == null) ? 0 : getStandardError().hashCode());
        hashCode = prime * hashCode + ((getStandardOutput() == null) ? 0 : getStandardOutput().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SetupExecutionDetails clone() {
        try {
            return (SetupExecutionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.SetupExecutionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
