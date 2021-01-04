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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorEmergencyCallingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutVoiceConnectorEmergencyCallingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The emergency calling configuration details.
     * </p>
     */
    private EmergencyCallingConfiguration emergencyCallingConfiguration;

    /**
     * <p>
     * The emergency calling configuration details.
     * </p>
     * 
     * @param emergencyCallingConfiguration
     *        The emergency calling configuration details.
     */

    public void setEmergencyCallingConfiguration(EmergencyCallingConfiguration emergencyCallingConfiguration) {
        this.emergencyCallingConfiguration = emergencyCallingConfiguration;
    }

    /**
     * <p>
     * The emergency calling configuration details.
     * </p>
     * 
     * @return The emergency calling configuration details.
     */

    public EmergencyCallingConfiguration getEmergencyCallingConfiguration() {
        return this.emergencyCallingConfiguration;
    }

    /**
     * <p>
     * The emergency calling configuration details.
     * </p>
     * 
     * @param emergencyCallingConfiguration
     *        The emergency calling configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVoiceConnectorEmergencyCallingConfigurationResult withEmergencyCallingConfiguration(EmergencyCallingConfiguration emergencyCallingConfiguration) {
        setEmergencyCallingConfiguration(emergencyCallingConfiguration);
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
        if (getEmergencyCallingConfiguration() != null)
            sb.append("EmergencyCallingConfiguration: ").append(getEmergencyCallingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorEmergencyCallingConfigurationResult == false)
            return false;
        PutVoiceConnectorEmergencyCallingConfigurationResult other = (PutVoiceConnectorEmergencyCallingConfigurationResult) obj;
        if (other.getEmergencyCallingConfiguration() == null ^ this.getEmergencyCallingConfiguration() == null)
            return false;
        if (other.getEmergencyCallingConfiguration() != null
                && other.getEmergencyCallingConfiguration().equals(this.getEmergencyCallingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmergencyCallingConfiguration() == null) ? 0 : getEmergencyCallingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutVoiceConnectorEmergencyCallingConfigurationResult clone() {
        try {
            return (PutVoiceConnectorEmergencyCallingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
