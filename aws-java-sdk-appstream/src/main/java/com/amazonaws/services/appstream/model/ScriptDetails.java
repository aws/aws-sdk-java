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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the details of the script.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ScriptDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScriptDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 object location for the script.
     * </p>
     */
    private S3Location scriptS3Location;
    /**
     * <p>
     * The run path for the script.
     * </p>
     */
    private String executablePath;
    /**
     * <p>
     * The runtime parameters passed to the run path for the script.
     * </p>
     */
    private String executableParameters;
    /**
     * <p>
     * The run timeout, in seconds, for the script.
     * </p>
     */
    private Integer timeoutInSeconds;

    /**
     * <p>
     * The S3 object location for the script.
     * </p>
     * 
     * @param scriptS3Location
     *        The S3 object location for the script.
     */

    public void setScriptS3Location(S3Location scriptS3Location) {
        this.scriptS3Location = scriptS3Location;
    }

    /**
     * <p>
     * The S3 object location for the script.
     * </p>
     * 
     * @return The S3 object location for the script.
     */

    public S3Location getScriptS3Location() {
        return this.scriptS3Location;
    }

    /**
     * <p>
     * The S3 object location for the script.
     * </p>
     * 
     * @param scriptS3Location
     *        The S3 object location for the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptDetails withScriptS3Location(S3Location scriptS3Location) {
        setScriptS3Location(scriptS3Location);
        return this;
    }

    /**
     * <p>
     * The run path for the script.
     * </p>
     * 
     * @param executablePath
     *        The run path for the script.
     */

    public void setExecutablePath(String executablePath) {
        this.executablePath = executablePath;
    }

    /**
     * <p>
     * The run path for the script.
     * </p>
     * 
     * @return The run path for the script.
     */

    public String getExecutablePath() {
        return this.executablePath;
    }

    /**
     * <p>
     * The run path for the script.
     * </p>
     * 
     * @param executablePath
     *        The run path for the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptDetails withExecutablePath(String executablePath) {
        setExecutablePath(executablePath);
        return this;
    }

    /**
     * <p>
     * The runtime parameters passed to the run path for the script.
     * </p>
     * 
     * @param executableParameters
     *        The runtime parameters passed to the run path for the script.
     */

    public void setExecutableParameters(String executableParameters) {
        this.executableParameters = executableParameters;
    }

    /**
     * <p>
     * The runtime parameters passed to the run path for the script.
     * </p>
     * 
     * @return The runtime parameters passed to the run path for the script.
     */

    public String getExecutableParameters() {
        return this.executableParameters;
    }

    /**
     * <p>
     * The runtime parameters passed to the run path for the script.
     * </p>
     * 
     * @param executableParameters
     *        The runtime parameters passed to the run path for the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptDetails withExecutableParameters(String executableParameters) {
        setExecutableParameters(executableParameters);
        return this;
    }

    /**
     * <p>
     * The run timeout, in seconds, for the script.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The run timeout, in seconds, for the script.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The run timeout, in seconds, for the script.
     * </p>
     * 
     * @return The run timeout, in seconds, for the script.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The run timeout, in seconds, for the script.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The run timeout, in seconds, for the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptDetails withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
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
        if (getScriptS3Location() != null)
            sb.append("ScriptS3Location: ").append(getScriptS3Location()).append(",");
        if (getExecutablePath() != null)
            sb.append("ExecutablePath: ").append(getExecutablePath()).append(",");
        if (getExecutableParameters() != null)
            sb.append("ExecutableParameters: ").append(getExecutableParameters()).append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScriptDetails == false)
            return false;
        ScriptDetails other = (ScriptDetails) obj;
        if (other.getScriptS3Location() == null ^ this.getScriptS3Location() == null)
            return false;
        if (other.getScriptS3Location() != null && other.getScriptS3Location().equals(this.getScriptS3Location()) == false)
            return false;
        if (other.getExecutablePath() == null ^ this.getExecutablePath() == null)
            return false;
        if (other.getExecutablePath() != null && other.getExecutablePath().equals(this.getExecutablePath()) == false)
            return false;
        if (other.getExecutableParameters() == null ^ this.getExecutableParameters() == null)
            return false;
        if (other.getExecutableParameters() != null && other.getExecutableParameters().equals(this.getExecutableParameters()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptS3Location() == null) ? 0 : getScriptS3Location().hashCode());
        hashCode = prime * hashCode + ((getExecutablePath() == null) ? 0 : getExecutablePath().hashCode());
        hashCode = prime * hashCode + ((getExecutableParameters() == null) ? 0 : getExecutableParameters().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ScriptDetails clone() {
        try {
            return (ScriptDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ScriptDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
