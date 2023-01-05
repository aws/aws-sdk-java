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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DNISEmergencyCallingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DNISEmergencyCallingConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String emergencyPhoneNumber;

    private String testPhoneNumber;

    private String callingCountry;

    /**
     * @param emergencyPhoneNumber
     */

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    /**
     * @return
     */

    public String getEmergencyPhoneNumber() {
        return this.emergencyPhoneNumber;
    }

    /**
     * @param emergencyPhoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNISEmergencyCallingConfiguration withEmergencyPhoneNumber(String emergencyPhoneNumber) {
        setEmergencyPhoneNumber(emergencyPhoneNumber);
        return this;
    }

    /**
     * @param testPhoneNumber
     */

    public void setTestPhoneNumber(String testPhoneNumber) {
        this.testPhoneNumber = testPhoneNumber;
    }

    /**
     * @return
     */

    public String getTestPhoneNumber() {
        return this.testPhoneNumber;
    }

    /**
     * @param testPhoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNISEmergencyCallingConfiguration withTestPhoneNumber(String testPhoneNumber) {
        setTestPhoneNumber(testPhoneNumber);
        return this;
    }

    /**
     * @param callingCountry
     */

    public void setCallingCountry(String callingCountry) {
        this.callingCountry = callingCountry;
    }

    /**
     * @return
     */

    public String getCallingCountry() {
        return this.callingCountry;
    }

    /**
     * @param callingCountry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNISEmergencyCallingConfiguration withCallingCountry(String callingCountry) {
        setCallingCountry(callingCountry);
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
        if (getEmergencyPhoneNumber() != null)
            sb.append("EmergencyPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getTestPhoneNumber() != null)
            sb.append("TestPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getCallingCountry() != null)
            sb.append("CallingCountry: ").append(getCallingCountry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DNISEmergencyCallingConfiguration == false)
            return false;
        DNISEmergencyCallingConfiguration other = (DNISEmergencyCallingConfiguration) obj;
        if (other.getEmergencyPhoneNumber() == null ^ this.getEmergencyPhoneNumber() == null)
            return false;
        if (other.getEmergencyPhoneNumber() != null && other.getEmergencyPhoneNumber().equals(this.getEmergencyPhoneNumber()) == false)
            return false;
        if (other.getTestPhoneNumber() == null ^ this.getTestPhoneNumber() == null)
            return false;
        if (other.getTestPhoneNumber() != null && other.getTestPhoneNumber().equals(this.getTestPhoneNumber()) == false)
            return false;
        if (other.getCallingCountry() == null ^ this.getCallingCountry() == null)
            return false;
        if (other.getCallingCountry() != null && other.getCallingCountry().equals(this.getCallingCountry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmergencyPhoneNumber() == null) ? 0 : getEmergencyPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getTestPhoneNumber() == null) ? 0 : getTestPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getCallingCountry() == null) ? 0 : getCallingCountry().hashCode());
        return hashCode;
    }

    @Override
    public DNISEmergencyCallingConfiguration clone() {
        try {
            return (DNISEmergencyCallingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.DNISEmergencyCallingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
