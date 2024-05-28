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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Output Locking Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/OutputLockingSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputLockingSettings implements Serializable, Cloneable, StructuredPojo {

    private EpochLockingSettings epochLockingSettings;

    private PipelineLockingSettings pipelineLockingSettings;

    /**
     * @param epochLockingSettings
     */

    public void setEpochLockingSettings(EpochLockingSettings epochLockingSettings) {
        this.epochLockingSettings = epochLockingSettings;
    }

    /**
     * @return
     */

    public EpochLockingSettings getEpochLockingSettings() {
        return this.epochLockingSettings;
    }

    /**
     * @param epochLockingSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputLockingSettings withEpochLockingSettings(EpochLockingSettings epochLockingSettings) {
        setEpochLockingSettings(epochLockingSettings);
        return this;
    }

    /**
     * @param pipelineLockingSettings
     */

    public void setPipelineLockingSettings(PipelineLockingSettings pipelineLockingSettings) {
        this.pipelineLockingSettings = pipelineLockingSettings;
    }

    /**
     * @return
     */

    public PipelineLockingSettings getPipelineLockingSettings() {
        return this.pipelineLockingSettings;
    }

    /**
     * @param pipelineLockingSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputLockingSettings withPipelineLockingSettings(PipelineLockingSettings pipelineLockingSettings) {
        setPipelineLockingSettings(pipelineLockingSettings);
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
        if (getEpochLockingSettings() != null)
            sb.append("EpochLockingSettings: ").append(getEpochLockingSettings()).append(",");
        if (getPipelineLockingSettings() != null)
            sb.append("PipelineLockingSettings: ").append(getPipelineLockingSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputLockingSettings == false)
            return false;
        OutputLockingSettings other = (OutputLockingSettings) obj;
        if (other.getEpochLockingSettings() == null ^ this.getEpochLockingSettings() == null)
            return false;
        if (other.getEpochLockingSettings() != null && other.getEpochLockingSettings().equals(this.getEpochLockingSettings()) == false)
            return false;
        if (other.getPipelineLockingSettings() == null ^ this.getPipelineLockingSettings() == null)
            return false;
        if (other.getPipelineLockingSettings() != null && other.getPipelineLockingSettings().equals(this.getPipelineLockingSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEpochLockingSettings() == null) ? 0 : getEpochLockingSettings().hashCode());
        hashCode = prime * hashCode + ((getPipelineLockingSettings() == null) ? 0 : getPipelineLockingSettings().hashCode());
        return hashCode;
    }

    @Override
    public OutputLockingSettings clone() {
        try {
            return (OutputLockingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputLockingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
