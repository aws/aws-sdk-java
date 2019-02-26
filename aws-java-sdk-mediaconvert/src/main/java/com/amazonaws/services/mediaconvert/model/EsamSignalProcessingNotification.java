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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/EsamSignalProcessingNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EsamSignalProcessingNotification implements Serializable, Cloneable, StructuredPojo {

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML document
     * as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in the message that
     * you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. If you want
     * the service to place SCTE-35 markers at the insertion points you specify in the XML document, you must also enable
     * SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML document or enable SCTE-35 passthrough.
     * You can't do both.
     */
    private String sccXml;

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML document
     * as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in the message that
     * you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. If you want
     * the service to place SCTE-35 markers at the insertion points you specify in the XML document, you must also enable
     * SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML document or enable SCTE-35 passthrough.
     * You can't do both.
     * 
     * @param sccXml
     *        Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML
     *        document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in
     *        the message that you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON
     *        job settings. If you want the service to place SCTE-35 markers at the insertion points you specify in the
     *        XML document, you must also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML
     *        document or enable SCTE-35 passthrough. You can't do both.
     */

    public void setSccXml(String sccXml) {
        this.sccXml = sccXml;
    }

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML document
     * as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in the message that
     * you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. If you want
     * the service to place SCTE-35 markers at the insertion points you specify in the XML document, you must also enable
     * SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML document or enable SCTE-35 passthrough.
     * You can't do both.
     * 
     * @return Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML
     *         document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in
     *         the message that you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON
     *         job settings. If you want the service to place SCTE-35 markers at the insertion points you specify in the
     *         XML document, you must also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM
     *         XML document or enable SCTE-35 passthrough. You can't do both.
     */

    public String getSccXml() {
        return this.sccXml;
    }

    /**
     * Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML document
     * as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in the message that
     * you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. If you want
     * the service to place SCTE-35 markers at the insertion points you specify in the XML document, you must also enable
     * SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML document or enable SCTE-35 passthrough.
     * You can't do both.
     * 
     * @param sccXml
     *        Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML
     *        document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in
     *        the message that you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON
     *        job settings. If you want the service to place SCTE-35 markers at the insertion points you specify in the
     *        XML document, you must also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML
     *        document or enable SCTE-35 passthrough. You can't do both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EsamSignalProcessingNotification withSccXml(String sccXml) {
        setSccXml(sccXml);
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
        if (getSccXml() != null)
            sb.append("SccXml: ").append(getSccXml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EsamSignalProcessingNotification == false)
            return false;
        EsamSignalProcessingNotification other = (EsamSignalProcessingNotification) obj;
        if (other.getSccXml() == null ^ this.getSccXml() == null)
            return false;
        if (other.getSccXml() != null && other.getSccXml().equals(this.getSccXml()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSccXml() == null) ? 0 : getSccXml().hashCode());
        return hashCode;
    }

    @Override
    public EsamSignalProcessingNotification clone() {
        try {
            return (EsamSignalProcessingNotification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.EsamSignalProcessingNotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
