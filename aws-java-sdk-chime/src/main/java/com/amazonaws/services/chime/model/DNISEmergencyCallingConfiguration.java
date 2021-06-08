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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Dialed Number Identification Service (DNIS) emergency calling configuration details associated with an Amazon
 * Chime Voice Connector's emergency calling configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DNISEmergencyCallingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DNISEmergencyCallingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNIS phone number to route emergency calls to, in E.164 format.
     * </p>
     */
    private String emergencyPhoneNumber;
    /**
     * <p>
     * The DNIS phone number to route test emergency calls to, in E.164 format.
     * </p>
     */
    private String testPhoneNumber;
    /**
     * <p>
     * The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
     * </p>
     */
    private String callingCountry;

    /**
     * <p>
     * The DNIS phone number to route emergency calls to, in E.164 format.
     * </p>
     * 
     * @param emergencyPhoneNumber
     *        The DNIS phone number to route emergency calls to, in E.164 format.
     */

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    /**
     * <p>
     * The DNIS phone number to route emergency calls to, in E.164 format.
     * </p>
     * 
     * @return The DNIS phone number to route emergency calls to, in E.164 format.
     */

    public String getEmergencyPhoneNumber() {
        return this.emergencyPhoneNumber;
    }

    /**
     * <p>
     * The DNIS phone number to route emergency calls to, in E.164 format.
     * </p>
     * 
     * @param emergencyPhoneNumber
     *        The DNIS phone number to route emergency calls to, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNISEmergencyCallingConfiguration withEmergencyPhoneNumber(String emergencyPhoneNumber) {
        setEmergencyPhoneNumber(emergencyPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The DNIS phone number to route test emergency calls to, in E.164 format.
     * </p>
     * 
     * @param testPhoneNumber
     *        The DNIS phone number to route test emergency calls to, in E.164 format.
     */

    public void setTestPhoneNumber(String testPhoneNumber) {
        this.testPhoneNumber = testPhoneNumber;
    }

    /**
     * <p>
     * The DNIS phone number to route test emergency calls to, in E.164 format.
     * </p>
     * 
     * @return The DNIS phone number to route test emergency calls to, in E.164 format.
     */

    public String getTestPhoneNumber() {
        return this.testPhoneNumber;
    }

    /**
     * <p>
     * The DNIS phone number to route test emergency calls to, in E.164 format.
     * </p>
     * 
     * @param testPhoneNumber
     *        The DNIS phone number to route test emergency calls to, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNISEmergencyCallingConfiguration withTestPhoneNumber(String testPhoneNumber) {
        setTestPhoneNumber(testPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
     * </p>
     * 
     * @param callingCountry
     *        The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
     */

    public void setCallingCountry(String callingCountry) {
        this.callingCountry = callingCountry;
    }

    /**
     * <p>
     * The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
     * </p>
     * 
     * @return The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
     */

    public String getCallingCountry() {
        return this.callingCountry;
    }

    /**
     * <p>
     * The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
     * </p>
     * 
     * @param callingCountry
     *        The country from which emergency calls are allowed, in ISO 3166-1 alpha-2 format.
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
        com.amazonaws.services.chime.model.transform.DNISEmergencyCallingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
