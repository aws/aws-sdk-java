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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The launch profile initialization script is used when start streaming session runs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/LaunchProfileInitializationScript"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfileInitializationScript implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     * resources at anytime while the instance is running.
     * </p>
     */
    private String runtimeRoleArn;
    /**
     * <p>
     * The initialization script.
     * </p>
     */
    private String script;
    /**
     * <p>
     * An IAM role attached to Studio Component when the system initialization script runs which give the studio
     * component access to Amazon Web Services resources when the system initialization script runs.
     * </p>
     */
    private String secureInitializationRoleArn;
    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     */
    private String studioComponentId;
    /**
     * <p>
     * The name for the studio component.
     * </p>
     */
    private String studioComponentName;

    /**
     * <p>
     * An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     * resources at anytime while the instance is running.
     * </p>
     * 
     * @param runtimeRoleArn
     *        An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     *        resources at anytime while the instance is running.
     */

    public void setRuntimeRoleArn(String runtimeRoleArn) {
        this.runtimeRoleArn = runtimeRoleArn;
    }

    /**
     * <p>
     * An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     * resources at anytime while the instance is running.
     * </p>
     * 
     * @return An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     *         resources at anytime while the instance is running.
     */

    public String getRuntimeRoleArn() {
        return this.runtimeRoleArn;
    }

    /**
     * <p>
     * An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     * resources at anytime while the instance is running.
     * </p>
     * 
     * @param runtimeRoleArn
     *        An IAM role attached to a Studio Component that gives the studio component access to Amazon Web Services
     *        resources at anytime while the instance is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationScript withRuntimeRoleArn(String runtimeRoleArn) {
        setRuntimeRoleArn(runtimeRoleArn);
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

    public LaunchProfileInitializationScript withScript(String script) {
        setScript(script);
        return this;
    }

    /**
     * <p>
     * An IAM role attached to Studio Component when the system initialization script runs which give the studio
     * component access to Amazon Web Services resources when the system initialization script runs.
     * </p>
     * 
     * @param secureInitializationRoleArn
     *        An IAM role attached to Studio Component when the system initialization script runs which give the studio
     *        component access to Amazon Web Services resources when the system initialization script runs.
     */

    public void setSecureInitializationRoleArn(String secureInitializationRoleArn) {
        this.secureInitializationRoleArn = secureInitializationRoleArn;
    }

    /**
     * <p>
     * An IAM role attached to Studio Component when the system initialization script runs which give the studio
     * component access to Amazon Web Services resources when the system initialization script runs.
     * </p>
     * 
     * @return An IAM role attached to Studio Component when the system initialization script runs which give the studio
     *         component access to Amazon Web Services resources when the system initialization script runs.
     */

    public String getSecureInitializationRoleArn() {
        return this.secureInitializationRoleArn;
    }

    /**
     * <p>
     * An IAM role attached to Studio Component when the system initialization script runs which give the studio
     * component access to Amazon Web Services resources when the system initialization script runs.
     * </p>
     * 
     * @param secureInitializationRoleArn
     *        An IAM role attached to Studio Component when the system initialization script runs which give the studio
     *        component access to Amazon Web Services resources when the system initialization script runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationScript withSecureInitializationRoleArn(String secureInitializationRoleArn) {
        setSecureInitializationRoleArn(secureInitializationRoleArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     */

    public void setStudioComponentId(String studioComponentId) {
        this.studioComponentId = studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @return The unique identifier for a studio component resource.
     */

    public String getStudioComponentId() {
        return this.studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationScript withStudioComponentId(String studioComponentId) {
        setStudioComponentId(studioComponentId);
        return this;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param studioComponentName
     *        The name for the studio component.
     */

    public void setStudioComponentName(String studioComponentName) {
        this.studioComponentName = studioComponentName;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @return The name for the studio component.
     */

    public String getStudioComponentName() {
        return this.studioComponentName;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param studioComponentName
     *        The name for the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationScript withStudioComponentName(String studioComponentName) {
        setStudioComponentName(studioComponentName);
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
        if (getRuntimeRoleArn() != null)
            sb.append("RuntimeRoleArn: ").append(getRuntimeRoleArn()).append(",");
        if (getScript() != null)
            sb.append("Script: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecureInitializationRoleArn() != null)
            sb.append("SecureInitializationRoleArn: ").append(getSecureInitializationRoleArn()).append(",");
        if (getStudioComponentId() != null)
            sb.append("StudioComponentId: ").append(getStudioComponentId()).append(",");
        if (getStudioComponentName() != null)
            sb.append("StudioComponentName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchProfileInitializationScript == false)
            return false;
        LaunchProfileInitializationScript other = (LaunchProfileInitializationScript) obj;
        if (other.getRuntimeRoleArn() == null ^ this.getRuntimeRoleArn() == null)
            return false;
        if (other.getRuntimeRoleArn() != null && other.getRuntimeRoleArn().equals(this.getRuntimeRoleArn()) == false)
            return false;
        if (other.getScript() == null ^ this.getScript() == null)
            return false;
        if (other.getScript() != null && other.getScript().equals(this.getScript()) == false)
            return false;
        if (other.getSecureInitializationRoleArn() == null ^ this.getSecureInitializationRoleArn() == null)
            return false;
        if (other.getSecureInitializationRoleArn() != null && other.getSecureInitializationRoleArn().equals(this.getSecureInitializationRoleArn()) == false)
            return false;
        if (other.getStudioComponentId() == null ^ this.getStudioComponentId() == null)
            return false;
        if (other.getStudioComponentId() != null && other.getStudioComponentId().equals(this.getStudioComponentId()) == false)
            return false;
        if (other.getStudioComponentName() == null ^ this.getStudioComponentName() == null)
            return false;
        if (other.getStudioComponentName() != null && other.getStudioComponentName().equals(this.getStudioComponentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeRoleArn() == null) ? 0 : getRuntimeRoleArn().hashCode());
        hashCode = prime * hashCode + ((getScript() == null) ? 0 : getScript().hashCode());
        hashCode = prime * hashCode + ((getSecureInitializationRoleArn() == null) ? 0 : getSecureInitializationRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentId() == null) ? 0 : getStudioComponentId().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentName() == null) ? 0 : getStudioComponentName().hashCode());
        return hashCode;
    }

    @Override
    public LaunchProfileInitializationScript clone() {
        try {
            return (LaunchProfileInitializationScript) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.LaunchProfileInitializationScriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
