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
 * ESAM ManifestConfirmConditionNotification defined by OC-SP-ESAM-API-I03-131025.
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/EsamManifestConfirmConditionNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EsamManifestConfirmConditionNotification implements Serializable, Cloneable, StructuredPojo {

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML
     * document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the
     * message that you supply.
     */
    private String mccXml;

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML
     * document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the
     * message that you supply.
     * 
     * @param mccXml
     *        Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form
     *        the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning
     *        instructions in the message that you supply.
     */

    public void setMccXml(String mccXml) {
        this.mccXml = mccXml;
    }

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML
     * document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the
     * message that you supply.
     * 
     * @return Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form
     *         the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning
     *         instructions in the message that you supply.
     */

    public String getMccXml() {
        return this.mccXml;
    }

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML
     * document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the
     * message that you supply.
     * 
     * @param mccXml
     *        Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form
     *        the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning
     *        instructions in the message that you supply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EsamManifestConfirmConditionNotification withMccXml(String mccXml) {
        setMccXml(mccXml);
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
        if (getMccXml() != null)
            sb.append("MccXml: ").append(getMccXml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EsamManifestConfirmConditionNotification == false)
            return false;
        EsamManifestConfirmConditionNotification other = (EsamManifestConfirmConditionNotification) obj;
        if (other.getMccXml() == null ^ this.getMccXml() == null)
            return false;
        if (other.getMccXml() != null && other.getMccXml().equals(this.getMccXml()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMccXml() == null) ? 0 : getMccXml().hashCode());
        return hashCode;
    }

    @Override
    public EsamManifestConfirmConditionNotification clone() {
        try {
            return (EsamManifestConfirmConditionNotification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.EsamManifestConfirmConditionNotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
