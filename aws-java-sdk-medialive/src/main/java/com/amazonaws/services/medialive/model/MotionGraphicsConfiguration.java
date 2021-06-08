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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Motion Graphics Configuration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MotionGraphicsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MotionGraphicsConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String motionGraphicsInsertion;
    /** Motion Graphics Settings */
    private MotionGraphicsSettings motionGraphicsSettings;

    /**
     * @param motionGraphicsInsertion
     * @see MotionGraphicsInsertion
     */

    public void setMotionGraphicsInsertion(String motionGraphicsInsertion) {
        this.motionGraphicsInsertion = motionGraphicsInsertion;
    }

    /**
     * @return
     * @see MotionGraphicsInsertion
     */

    public String getMotionGraphicsInsertion() {
        return this.motionGraphicsInsertion;
    }

    /**
     * @param motionGraphicsInsertion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MotionGraphicsInsertion
     */

    public MotionGraphicsConfiguration withMotionGraphicsInsertion(String motionGraphicsInsertion) {
        setMotionGraphicsInsertion(motionGraphicsInsertion);
        return this;
    }

    /**
     * @param motionGraphicsInsertion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MotionGraphicsInsertion
     */

    public MotionGraphicsConfiguration withMotionGraphicsInsertion(MotionGraphicsInsertion motionGraphicsInsertion) {
        this.motionGraphicsInsertion = motionGraphicsInsertion.toString();
        return this;
    }

    /**
     * Motion Graphics Settings
     * 
     * @param motionGraphicsSettings
     *        Motion Graphics Settings
     */

    public void setMotionGraphicsSettings(MotionGraphicsSettings motionGraphicsSettings) {
        this.motionGraphicsSettings = motionGraphicsSettings;
    }

    /**
     * Motion Graphics Settings
     * 
     * @return Motion Graphics Settings
     */

    public MotionGraphicsSettings getMotionGraphicsSettings() {
        return this.motionGraphicsSettings;
    }

    /**
     * Motion Graphics Settings
     * 
     * @param motionGraphicsSettings
     *        Motion Graphics Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionGraphicsConfiguration withMotionGraphicsSettings(MotionGraphicsSettings motionGraphicsSettings) {
        setMotionGraphicsSettings(motionGraphicsSettings);
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
        if (getMotionGraphicsInsertion() != null)
            sb.append("MotionGraphicsInsertion: ").append(getMotionGraphicsInsertion()).append(",");
        if (getMotionGraphicsSettings() != null)
            sb.append("MotionGraphicsSettings: ").append(getMotionGraphicsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MotionGraphicsConfiguration == false)
            return false;
        MotionGraphicsConfiguration other = (MotionGraphicsConfiguration) obj;
        if (other.getMotionGraphicsInsertion() == null ^ this.getMotionGraphicsInsertion() == null)
            return false;
        if (other.getMotionGraphicsInsertion() != null && other.getMotionGraphicsInsertion().equals(this.getMotionGraphicsInsertion()) == false)
            return false;
        if (other.getMotionGraphicsSettings() == null ^ this.getMotionGraphicsSettings() == null)
            return false;
        if (other.getMotionGraphicsSettings() != null && other.getMotionGraphicsSettings().equals(this.getMotionGraphicsSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMotionGraphicsInsertion() == null) ? 0 : getMotionGraphicsInsertion().hashCode());
        hashCode = prime * hashCode + ((getMotionGraphicsSettings() == null) ? 0 : getMotionGraphicsSettings().hashCode());
        return hashCode;
    }

    @Override
    public MotionGraphicsConfiguration clone() {
        try {
            return (MotionGraphicsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MotionGraphicsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
