/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Initialization scripts for studio components.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StudioComponentInitializationScript"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioComponentInitializationScript implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     */
    private String launchProfileProtocolVersion;
    /**
     * <p>
     * The platform of the initialization script, either WINDOWS or LINUX.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The method to use when running the initialization script.
     * </p>
     */
    private String runContext;
    /**
     * <p>
     * The initialization script.
     * </p>
     */
    private String script;

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @param launchProfileProtocolVersion
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     */

    public void setLaunchProfileProtocolVersion(String launchProfileProtocolVersion) {
        this.launchProfileProtocolVersion = launchProfileProtocolVersion;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @return The version number of the protocol that is used by the launch profile. The only valid version is
     *         "2021-03-31".
     */

    public String getLaunchProfileProtocolVersion() {
        return this.launchProfileProtocolVersion;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @param launchProfileProtocolVersion
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentInitializationScript withLaunchProfileProtocolVersion(String launchProfileProtocolVersion) {
        setLaunchProfileProtocolVersion(launchProfileProtocolVersion);
        return this;
    }

    /**
     * <p>
     * The platform of the initialization script, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the initialization script, either WINDOWS or LINUX.
     * @see LaunchProfilePlatform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the initialization script, either WINDOWS or LINUX.
     * </p>
     * 
     * @return The platform of the initialization script, either WINDOWS or LINUX.
     * @see LaunchProfilePlatform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the initialization script, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the initialization script, either WINDOWS or LINUX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfilePlatform
     */

    public StudioComponentInitializationScript withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the initialization script, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the initialization script, either WINDOWS or LINUX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfilePlatform
     */

    public StudioComponentInitializationScript withPlatform(LaunchProfilePlatform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The method to use when running the initialization script.
     * </p>
     * 
     * @param runContext
     *        The method to use when running the initialization script.
     * @see StudioComponentInitializationScriptRunContext
     */

    public void setRunContext(String runContext) {
        this.runContext = runContext;
    }

    /**
     * <p>
     * The method to use when running the initialization script.
     * </p>
     * 
     * @return The method to use when running the initialization script.
     * @see StudioComponentInitializationScriptRunContext
     */

    public String getRunContext() {
        return this.runContext;
    }

    /**
     * <p>
     * The method to use when running the initialization script.
     * </p>
     * 
     * @param runContext
     *        The method to use when running the initialization script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentInitializationScriptRunContext
     */

    public StudioComponentInitializationScript withRunContext(String runContext) {
        setRunContext(runContext);
        return this;
    }

    /**
     * <p>
     * The method to use when running the initialization script.
     * </p>
     * 
     * @param runContext
     *        The method to use when running the initialization script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioComponentInitializationScriptRunContext
     */

    public StudioComponentInitializationScript withRunContext(StudioComponentInitializationScriptRunContext runContext) {
        this.runContext = runContext.toString();
        return this;
    }

    /**
     * <p>
     * The initialization script.
     * </p>
     * 
     * @param script
     *        The initialization script.
     */

    public void setScript(String script) {
        this.script = script;
    }

    /**
     * <p>
     * The initialization script.
     * </p>
     * 
     * @return The initialization script.
     */

    public String getScript() {
        return this.script;
    }

    /**
     * <p>
     * The initialization script.
     * </p>
     * 
     * @param script
     *        The initialization script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioComponentInitializationScript withScript(String script) {
        setScript(script);
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
        if (getLaunchProfileProtocolVersion() != null)
            sb.append("LaunchProfileProtocolVersion: ").append(getLaunchProfileProtocolVersion()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getRunContext() != null)
            sb.append("RunContext: ").append(getRunContext()).append(",");
        if (getScript() != null)
            sb.append("Script: ").append(getScript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudioComponentInitializationScript == false)
            return false;
        StudioComponentInitializationScript other = (StudioComponentInitializationScript) obj;
        if (other.getLaunchProfileProtocolVersion() == null ^ this.getLaunchProfileProtocolVersion() == null)
            return false;
        if (other.getLaunchProfileProtocolVersion() != null && other.getLaunchProfileProtocolVersion().equals(this.getLaunchProfileProtocolVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRunContext() == null ^ this.getRunContext() == null)
            return false;
        if (other.getRunContext() != null && other.getRunContext().equals(this.getRunContext()) == false)
            return false;
        if (other.getScript() == null ^ this.getScript() == null)
            return false;
        if (other.getScript() != null && other.getScript().equals(this.getScript()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchProfileProtocolVersion() == null) ? 0 : getLaunchProfileProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRunContext() == null) ? 0 : getRunContext().hashCode());
        hashCode = prime * hashCode + ((getScript() == null) ? 0 : getScript().hashCode());
        return hashCode;
    }

    @Override
    public StudioComponentInitializationScript clone() {
        try {
            return (StudioComponentInitializationScript) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StudioComponentInitializationScriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
