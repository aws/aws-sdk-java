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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Diagnostic information about executable scripts that are part of a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/Diagnostics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Diagnostics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     */
    private String errorCode;
    /**
     * <p>
     * The name of the script.
     * </p>
     */
    private String scriptName;
    /**
     * <p>
     * The message associated with the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     * </p>
     */
    private String logTail;

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The associated error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Success: The specified script ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptMissing: The specified script was not found in the specified location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptNotExecutable: The specified script is not a recognized executable file type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptTimedOut: The specified script did not finish running in the specified time period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptFailed: The specified script failed to run as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnknownError: The specified script did not run for an unknown reason.
     *        </p>
     *        </li>
     * @see LifecycleErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The associated error code:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Success: The specified script ran.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptMissing: The specified script was not found in the specified location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptNotExecutable: The specified script is not a recognized executable file type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptTimedOut: The specified script did not finish running in the specified time period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptFailed: The specified script failed to run as expected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UnknownError: The specified script did not run for an unknown reason.
     *         </p>
     *         </li>
     * @see LifecycleErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The associated error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Success: The specified script ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptMissing: The specified script was not found in the specified location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptNotExecutable: The specified script is not a recognized executable file type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptTimedOut: The specified script did not finish running in the specified time period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptFailed: The specified script failed to run as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnknownError: The specified script did not run for an unknown reason.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleErrorCode
     */

    public Diagnostics withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The associated error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Success: The specified script ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptMissing: The specified script was not found in the specified location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptNotExecutable: The specified script is not a recognized executable file type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptTimedOut: The specified script did not finish running in the specified time period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptFailed: The specified script failed to run as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnknownError: The specified script did not run for an unknown reason.
     *        </p>
     *        </li>
     * @see LifecycleErrorCode
     */

    public void setErrorCode(LifecycleErrorCode errorCode) {
        withErrorCode(errorCode);
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The associated error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Success: The specified script ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptMissing: The specified script was not found in the specified location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptNotExecutable: The specified script is not a recognized executable file type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptTimedOut: The specified script did not finish running in the specified time period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ScriptFailed: The specified script failed to run as expected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UnknownError: The specified script did not run for an unknown reason.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleErrorCode
     */

    public Diagnostics withErrorCode(LifecycleErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the script.
     * </p>
     * 
     * @param scriptName
     *        The name of the script.
     */

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    /**
     * <p>
     * The name of the script.
     * </p>
     * 
     * @return The name of the script.
     */

    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * <p>
     * The name of the script.
     * </p>
     * 
     * @param scriptName
     *        The name of the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Diagnostics withScriptName(String scriptName) {
        setScriptName(scriptName);
        return this;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @param message
     *        The message associated with the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @return The message associated with the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @param message
     *        The message associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Diagnostics withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     * </p>
     * 
     * @param logTail
     *        The last portion of the diagnostic log.</p>
     *        <p>
     *        If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     */

    public void setLogTail(String logTail) {
        this.logTail = logTail;
    }

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     * </p>
     * 
     * @return The last portion of the diagnostic log.</p>
     *         <p>
     *         If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     */

    public String getLogTail() {
        return this.logTail;
    }

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     * </p>
     * 
     * @param logTail
     *        The last portion of the diagnostic log.</p>
     *        <p>
     *        If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Diagnostics withLogTail(String logTail) {
        setLogTail(logTail);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getScriptName() != null)
            sb.append("ScriptName: ").append(getScriptName()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getLogTail() != null)
            sb.append("LogTail: ").append(getLogTail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Diagnostics == false)
            return false;
        Diagnostics other = (Diagnostics) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getScriptName() == null ^ this.getScriptName() == null)
            return false;
        if (other.getScriptName() != null && other.getScriptName().equals(this.getScriptName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLogTail() == null ^ this.getLogTail() == null)
            return false;
        if (other.getLogTail() != null && other.getLogTail().equals(this.getLogTail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getScriptName() == null) ? 0 : getScriptName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLogTail() == null) ? 0 : getLogTail().hashCode());
        return hashCode;
    }

    @Override
    public Diagnostics clone() {
        try {
            return (Diagnostics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.DiagnosticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
