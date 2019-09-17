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
 * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/EsamSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EsamSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     * the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     */
    private EsamManifestConfirmConditionNotification manifestConfirmConditionNotification;
    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the
     * splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than
     * this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
     */
    private Integer responseSignalPreroll;
    /**
     * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the
     * signal processing instructions that you provide in the setting SCC XML (sccXml).
     */
    private EsamSignalProcessingNotification signalProcessingNotification;

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     * the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     * 
     * @param manifestConfirmConditionNotification
     *        Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The
     *        transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     */

    public void setManifestConfirmConditionNotification(EsamManifestConfirmConditionNotification manifestConfirmConditionNotification) {
        this.manifestConfirmConditionNotification = manifestConfirmConditionNotification;
    }

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     * the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     * 
     * @return Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The
     *         transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     */

    public EsamManifestConfirmConditionNotification getManifestConfirmConditionNotification() {
        return this.manifestConfirmConditionNotification;
    }

    /**
     * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     * the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     * 
     * @param manifestConfirmConditionNotification
     *        Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The
     *        transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EsamSettings withManifestConfirmConditionNotification(EsamManifestConfirmConditionNotification manifestConfirmConditionNotification) {
        setManifestConfirmConditionNotification(manifestConfirmConditionNotification);
        return this;
    }

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the
     * splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than
     * this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
     * 
     * @param responseSignalPreroll
     *        Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places
     *        and the splice points that they refer to. If the time between the start of the asset and the SCTE-35
     *        message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the
     *        stream.
     */

    public void setResponseSignalPreroll(Integer responseSignalPreroll) {
        this.responseSignalPreroll = responseSignalPreroll;
    }

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the
     * splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than
     * this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
     * 
     * @return Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places
     *         and the splice points that they refer to. If the time between the start of the asset and the SCTE-35
     *         message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the
     *         stream.
     */

    public Integer getResponseSignalPreroll() {
        return this.responseSignalPreroll;
    }

    /**
     * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the
     * splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than
     * this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
     * 
     * @param responseSignalPreroll
     *        Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places
     *        and the splice points that they refer to. If the time between the start of the asset and the SCTE-35
     *        message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the
     *        stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EsamSettings withResponseSignalPreroll(Integer responseSignalPreroll) {
        setResponseSignalPreroll(responseSignalPreroll);
        return this;
    }

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the
     * signal processing instructions that you provide in the setting SCC XML (sccXml).
     * 
     * @param signalProcessingNotification
     *        Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     *        the signal processing instructions that you provide in the setting SCC XML (sccXml).
     */

    public void setSignalProcessingNotification(EsamSignalProcessingNotification signalProcessingNotification) {
        this.signalProcessingNotification = signalProcessingNotification;
    }

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the
     * signal processing instructions that you provide in the setting SCC XML (sccXml).
     * 
     * @return Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     *         the signal processing instructions that you provide in the setting SCC XML (sccXml).
     */

    public EsamSignalProcessingNotification getSignalProcessingNotification() {
        return this.signalProcessingNotification;
    }

    /**
     * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the
     * signal processing instructions that you provide in the setting SCC XML (sccXml).
     * 
     * @param signalProcessingNotification
     *        Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses
     *        the signal processing instructions that you provide in the setting SCC XML (sccXml).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EsamSettings withSignalProcessingNotification(EsamSignalProcessingNotification signalProcessingNotification) {
        setSignalProcessingNotification(signalProcessingNotification);
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
        if (getManifestConfirmConditionNotification() != null)
            sb.append("ManifestConfirmConditionNotification: ").append(getManifestConfirmConditionNotification()).append(",");
        if (getResponseSignalPreroll() != null)
            sb.append("ResponseSignalPreroll: ").append(getResponseSignalPreroll()).append(",");
        if (getSignalProcessingNotification() != null)
            sb.append("SignalProcessingNotification: ").append(getSignalProcessingNotification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EsamSettings == false)
            return false;
        EsamSettings other = (EsamSettings) obj;
        if (other.getManifestConfirmConditionNotification() == null ^ this.getManifestConfirmConditionNotification() == null)
            return false;
        if (other.getManifestConfirmConditionNotification() != null
                && other.getManifestConfirmConditionNotification().equals(this.getManifestConfirmConditionNotification()) == false)
            return false;
        if (other.getResponseSignalPreroll() == null ^ this.getResponseSignalPreroll() == null)
            return false;
        if (other.getResponseSignalPreroll() != null && other.getResponseSignalPreroll().equals(this.getResponseSignalPreroll()) == false)
            return false;
        if (other.getSignalProcessingNotification() == null ^ this.getSignalProcessingNotification() == null)
            return false;
        if (other.getSignalProcessingNotification() != null && other.getSignalProcessingNotification().equals(this.getSignalProcessingNotification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestConfirmConditionNotification() == null) ? 0 : getManifestConfirmConditionNotification().hashCode());
        hashCode = prime * hashCode + ((getResponseSignalPreroll() == null) ? 0 : getResponseSignalPreroll().hashCode());
        hashCode = prime * hashCode + ((getSignalProcessingNotification() == null) ? 0 : getSignalProcessingNotification().hashCode());
        return hashCode;
    }

    @Override
    public EsamSettings clone() {
        try {
            return (EsamSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.EsamSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
