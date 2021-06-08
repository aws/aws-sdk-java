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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RegisterCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The certificate PEM string that needs to be registered.
     * </p>
     */
    private String certificateData;
    /**
     * <p>
     * The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     * <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     * </p>
     */
    private ClientCertAuthSettings clientCertAuthSettings;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCertificateRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The certificate PEM string that needs to be registered.
     * </p>
     * 
     * @param certificateData
     *        The certificate PEM string that needs to be registered.
     */

    public void setCertificateData(String certificateData) {
        this.certificateData = certificateData;
    }

    /**
     * <p>
     * The certificate PEM string that needs to be registered.
     * </p>
     * 
     * @return The certificate PEM string that needs to be registered.
     */

    public String getCertificateData() {
        return this.certificateData;
    }

    /**
     * <p>
     * The certificate PEM string that needs to be registered.
     * </p>
     * 
     * @param certificateData
     *        The certificate PEM string that needs to be registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCertificateRequest withCertificateData(String certificateData) {
        setCertificateData(certificateData);
        return this;
    }

    /**
     * <p>
     * The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     * <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * </p>
     * 
     * @param type
     *        The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     *        <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * @see CertificateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     * <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * </p>
     * 
     * @return The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     *         <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * @see CertificateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     * <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * </p>
     * 
     * @param type
     *        The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     *        <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public RegisterCertificateRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     * <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * </p>
     * 
     * @param type
     *        The function that the registered certificate performs. Valid values include <code>ClientLDAPS</code> or
     *        <code>ClientCertAuth</code>. The default value is <code>ClientLDAPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public RegisterCertificateRequest withType(CertificateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     * </p>
     * 
     * @param clientCertAuthSettings
     *        A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     */

    public void setClientCertAuthSettings(ClientCertAuthSettings clientCertAuthSettings) {
        this.clientCertAuthSettings = clientCertAuthSettings;
    }

    /**
     * <p>
     * A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     * </p>
     * 
     * @return A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     */

    public ClientCertAuthSettings getClientCertAuthSettings() {
        return this.clientCertAuthSettings;
    }

    /**
     * <p>
     * A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     * </p>
     * 
     * @param clientCertAuthSettings
     *        A <code>ClientCertAuthSettings</code> object that contains client certificate authentication settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCertificateRequest withClientCertAuthSettings(ClientCertAuthSettings clientCertAuthSettings) {
        setClientCertAuthSettings(clientCertAuthSettings);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getCertificateData() != null)
            sb.append("CertificateData: ").append(getCertificateData()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getClientCertAuthSettings() != null)
            sb.append("ClientCertAuthSettings: ").append(getClientCertAuthSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterCertificateRequest == false)
            return false;
        RegisterCertificateRequest other = (RegisterCertificateRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getCertificateData() == null ^ this.getCertificateData() == null)
            return false;
        if (other.getCertificateData() != null && other.getCertificateData().equals(this.getCertificateData()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getClientCertAuthSettings() == null ^ this.getClientCertAuthSettings() == null)
            return false;
        if (other.getClientCertAuthSettings() != null && other.getClientCertAuthSettings().equals(this.getClientCertAuthSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getCertificateData() == null) ? 0 : getCertificateData().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getClientCertAuthSettings() == null) ? 0 : getClientCertAuthSettings().hashCode());
        return hashCode;
    }

    @Override
    public RegisterCertificateRequest clone() {
        return (RegisterCertificateRequest) super.clone();
    }

}
