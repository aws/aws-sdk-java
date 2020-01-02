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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Multiplex Program settings configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexProgramSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexProgramSettings implements Serializable, Cloneable, StructuredPojo {

    /** Unique program number. */
    private Integer programNumber;
    /** Transport stream service descriptor configuration for the Multiplex program. */
    private MultiplexProgramServiceDescriptor serviceDescriptor;
    /** Program video settings configuration. */
    private MultiplexVideoSettings videoSettings;

    /**
     * Unique program number.
     * 
     * @param programNumber
     *        Unique program number.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Unique program number.
     * 
     * @return Unique program number.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * Unique program number.
     * 
     * @param programNumber
     *        Unique program number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramSettings withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * Transport stream service descriptor configuration for the Multiplex program.
     * 
     * @param serviceDescriptor
     *        Transport stream service descriptor configuration for the Multiplex program.
     */

    public void setServiceDescriptor(MultiplexProgramServiceDescriptor serviceDescriptor) {
        this.serviceDescriptor = serviceDescriptor;
    }

    /**
     * Transport stream service descriptor configuration for the Multiplex program.
     * 
     * @return Transport stream service descriptor configuration for the Multiplex program.
     */

    public MultiplexProgramServiceDescriptor getServiceDescriptor() {
        return this.serviceDescriptor;
    }

    /**
     * Transport stream service descriptor configuration for the Multiplex program.
     * 
     * @param serviceDescriptor
     *        Transport stream service descriptor configuration for the Multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramSettings withServiceDescriptor(MultiplexProgramServiceDescriptor serviceDescriptor) {
        setServiceDescriptor(serviceDescriptor);
        return this;
    }

    /**
     * Program video settings configuration.
     * 
     * @param videoSettings
     *        Program video settings configuration.
     */

    public void setVideoSettings(MultiplexVideoSettings videoSettings) {
        this.videoSettings = videoSettings;
    }

    /**
     * Program video settings configuration.
     * 
     * @return Program video settings configuration.
     */

    public MultiplexVideoSettings getVideoSettings() {
        return this.videoSettings;
    }

    /**
     * Program video settings configuration.
     * 
     * @param videoSettings
     *        Program video settings configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramSettings withVideoSettings(MultiplexVideoSettings videoSettings) {
        setVideoSettings(videoSettings);
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
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getServiceDescriptor() != null)
            sb.append("ServiceDescriptor: ").append(getServiceDescriptor()).append(",");
        if (getVideoSettings() != null)
            sb.append("VideoSettings: ").append(getVideoSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexProgramSettings == false)
            return false;
        MultiplexProgramSettings other = (MultiplexProgramSettings) obj;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getServiceDescriptor() == null ^ this.getServiceDescriptor() == null)
            return false;
        if (other.getServiceDescriptor() != null && other.getServiceDescriptor().equals(this.getServiceDescriptor()) == false)
            return false;
        if (other.getVideoSettings() == null ^ this.getVideoSettings() == null)
            return false;
        if (other.getVideoSettings() != null && other.getVideoSettings().equals(this.getVideoSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getServiceDescriptor() == null) ? 0 : getServiceDescriptor().hashCode());
        hashCode = prime * hashCode + ((getVideoSettings() == null) ? 0 : getVideoSettings().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexProgramSettings clone() {
        try {
            return (MultiplexProgramSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexProgramSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
