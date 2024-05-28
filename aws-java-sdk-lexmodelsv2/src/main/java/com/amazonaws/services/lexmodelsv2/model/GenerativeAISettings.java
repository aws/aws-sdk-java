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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains specifications about the generative AI capabilities from Amazon Bedrock that you can turn on for your bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GenerativeAISettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerativeAISettings implements Serializable, Cloneable, StructuredPojo {

    private RuntimeSettings runtimeSettings;

    private BuildtimeSettings buildtimeSettings;

    /**
     * @param runtimeSettings
     */

    public void setRuntimeSettings(RuntimeSettings runtimeSettings) {
        this.runtimeSettings = runtimeSettings;
    }

    /**
     * @return
     */

    public RuntimeSettings getRuntimeSettings() {
        return this.runtimeSettings;
    }

    /**
     * @param runtimeSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeAISettings withRuntimeSettings(RuntimeSettings runtimeSettings) {
        setRuntimeSettings(runtimeSettings);
        return this;
    }

    /**
     * @param buildtimeSettings
     */

    public void setBuildtimeSettings(BuildtimeSettings buildtimeSettings) {
        this.buildtimeSettings = buildtimeSettings;
    }

    /**
     * @return
     */

    public BuildtimeSettings getBuildtimeSettings() {
        return this.buildtimeSettings;
    }

    /**
     * @param buildtimeSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeAISettings withBuildtimeSettings(BuildtimeSettings buildtimeSettings) {
        setBuildtimeSettings(buildtimeSettings);
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
        if (getRuntimeSettings() != null)
            sb.append("RuntimeSettings: ").append(getRuntimeSettings()).append(",");
        if (getBuildtimeSettings() != null)
            sb.append("BuildtimeSettings: ").append(getBuildtimeSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerativeAISettings == false)
            return false;
        GenerativeAISettings other = (GenerativeAISettings) obj;
        if (other.getRuntimeSettings() == null ^ this.getRuntimeSettings() == null)
            return false;
        if (other.getRuntimeSettings() != null && other.getRuntimeSettings().equals(this.getRuntimeSettings()) == false)
            return false;
        if (other.getBuildtimeSettings() == null ^ this.getBuildtimeSettings() == null)
            return false;
        if (other.getBuildtimeSettings() != null && other.getBuildtimeSettings().equals(this.getBuildtimeSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeSettings() == null) ? 0 : getRuntimeSettings().hashCode());
        hashCode = prime * hashCode + ((getBuildtimeSettings() == null) ? 0 : getBuildtimeSettings().hashCode());
        return hashCode;
    }

    @Override
    public GenerativeAISettings clone() {
        try {
            return (GenerativeAISettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.GenerativeAISettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
