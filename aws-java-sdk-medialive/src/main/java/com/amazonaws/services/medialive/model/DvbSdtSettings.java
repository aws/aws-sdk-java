/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DVB Service Description Table (SDT)
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DvbSdtSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbSdtSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from
     * input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output
     * stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The
     * sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not
     * contain SDT information.
     */
    private String outputSdt;
    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer repInterval;
    /**
     * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     */
    private String serviceName;
    /**
     * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     */
    private String serviceProviderName;

    /**
     * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from
     * input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output
     * stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The
     * sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not
     * contain SDT information.
     * 
     * @param outputSdt
     *        Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT
     *        information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from
     *        input stream to output stream if SDT information is present in the input, otherwise it will fall back on
     *        the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone
     *        setting means output stream will not contain SDT information.
     * @see DvbSdtOutputSdt
     */

    public void setOutputSdt(String outputSdt) {
        this.outputSdt = outputSdt;
    }

    /**
     * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from
     * input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output
     * stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The
     * sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not
     * contain SDT information.
     * 
     * @return Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT
     *         information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information
     *         from input stream to output stream if SDT information is present in the input, otherwise it will fall
     *         back on the user-defined values. The sdtManual setting means user will enter the SDT information. The
     *         sdtNone setting means output stream will not contain SDT information.
     * @see DvbSdtOutputSdt
     */

    public String getOutputSdt() {
        return this.outputSdt;
    }

    /**
     * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from
     * input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output
     * stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The
     * sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not
     * contain SDT information.
     * 
     * @param outputSdt
     *        Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT
     *        information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from
     *        input stream to output stream if SDT information is present in the input, otherwise it will fall back on
     *        the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone
     *        setting means output stream will not contain SDT information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSdtOutputSdt
     */

    public DvbSdtSettings withOutputSdt(String outputSdt) {
        setOutputSdt(outputSdt);
        return this;
    }

    /**
     * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from
     * input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output
     * stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The
     * sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not
     * contain SDT information.
     * 
     * @param outputSdt
     *        Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT
     *        information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from
     *        input stream to output stream if SDT information is present in the input, otherwise it will fall back on
     *        the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone
     *        setting means output stream will not contain SDT information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DvbSdtOutputSdt
     */

    public DvbSdtSettings withOutputSdt(DvbSdtOutputSdt outputSdt) {
        this.outputSdt = outputSdt.toString();
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param repInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     */

    public void setRepInterval(Integer repInterval) {
        this.repInterval = repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream.
     */

    public Integer getRepInterval() {
        return this.repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param repInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSdtSettings withRepInterval(Integer repInterval) {
        setRepInterval(repInterval);
        return this;
    }

    /**
     * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     * 
     * @param serviceName
     *        The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     *        characters.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     * 
     * @return The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     *         characters.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     * 
     * @param serviceName
     *        The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSdtSettings withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     * 
     * @param serviceProviderName
     *        The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length
     *        is 256 characters.
     */

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    /**
     * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     * 
     * @return The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum
     *         length is 256 characters.
     */

    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    /**
     * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256
     * characters.
     * 
     * @param serviceProviderName
     *        The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length
     *        is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSdtSettings withServiceProviderName(String serviceProviderName) {
        setServiceProviderName(serviceProviderName);
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
        if (getOutputSdt() != null)
            sb.append("OutputSdt: ").append(getOutputSdt()).append(",");
        if (getRepInterval() != null)
            sb.append("RepInterval: ").append(getRepInterval()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceProviderName() != null)
            sb.append("ServiceProviderName: ").append(getServiceProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbSdtSettings == false)
            return false;
        DvbSdtSettings other = (DvbSdtSettings) obj;
        if (other.getOutputSdt() == null ^ this.getOutputSdt() == null)
            return false;
        if (other.getOutputSdt() != null && other.getOutputSdt().equals(this.getOutputSdt()) == false)
            return false;
        if (other.getRepInterval() == null ^ this.getRepInterval() == null)
            return false;
        if (other.getRepInterval() != null && other.getRepInterval().equals(this.getRepInterval()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceProviderName() == null ^ this.getServiceProviderName() == null)
            return false;
        if (other.getServiceProviderName() != null && other.getServiceProviderName().equals(this.getServiceProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputSdt() == null) ? 0 : getOutputSdt().hashCode());
        hashCode = prime * hashCode + ((getRepInterval() == null) ? 0 : getRepInterval().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceProviderName() == null) ? 0 : getServiceProviderName().hashCode());
        return hashCode;
    }

    @Override
    public DvbSdtSettings clone() {
        try {
            return (DvbSdtSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.DvbSdtSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
