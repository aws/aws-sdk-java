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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile properties required when using SAPOData.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SAPODataConnectorProfileProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAPODataConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the SAPOData resource.
     * </p>
     */
    private String applicationHostUrl;
    /**
     * <p>
     * The application path to catalog service.
     * </p>
     */
    private String applicationServicePath;
    /**
     * <p>
     * The port number of the SAPOData instance.
     * </p>
     */
    private Integer portNumber;
    /**
     * <p>
     * The client number for the client creating the connection.
     * </p>
     */
    private String clientNumber;
    /**
     * <p>
     * The logon language of SAPOData instance.
     * </p>
     */
    private String logonLanguage;
    /**
     * <p>
     * The SAPOData Private Link service name to be used for private data transfers.
     * </p>
     */
    private String privateLinkServiceName;
    /**
     * <p>
     * The SAPOData OAuth properties required for OAuth type authentication.
     * </p>
     */
    private OAuthProperties oAuthProperties;

    /**
     * <p>
     * The location of the SAPOData resource.
     * </p>
     * 
     * @param applicationHostUrl
     *        The location of the SAPOData resource.
     */

    public void setApplicationHostUrl(String applicationHostUrl) {
        this.applicationHostUrl = applicationHostUrl;
    }

    /**
     * <p>
     * The location of the SAPOData resource.
     * </p>
     * 
     * @return The location of the SAPOData resource.
     */

    public String getApplicationHostUrl() {
        return this.applicationHostUrl;
    }

    /**
     * <p>
     * The location of the SAPOData resource.
     * </p>
     * 
     * @param applicationHostUrl
     *        The location of the SAPOData resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withApplicationHostUrl(String applicationHostUrl) {
        setApplicationHostUrl(applicationHostUrl);
        return this;
    }

    /**
     * <p>
     * The application path to catalog service.
     * </p>
     * 
     * @param applicationServicePath
     *        The application path to catalog service.
     */

    public void setApplicationServicePath(String applicationServicePath) {
        this.applicationServicePath = applicationServicePath;
    }

    /**
     * <p>
     * The application path to catalog service.
     * </p>
     * 
     * @return The application path to catalog service.
     */

    public String getApplicationServicePath() {
        return this.applicationServicePath;
    }

    /**
     * <p>
     * The application path to catalog service.
     * </p>
     * 
     * @param applicationServicePath
     *        The application path to catalog service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withApplicationServicePath(String applicationServicePath) {
        setApplicationServicePath(applicationServicePath);
        return this;
    }

    /**
     * <p>
     * The port number of the SAPOData instance.
     * </p>
     * 
     * @param portNumber
     *        The port number of the SAPOData instance.
     */

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    /**
     * <p>
     * The port number of the SAPOData instance.
     * </p>
     * 
     * @return The port number of the SAPOData instance.
     */

    public Integer getPortNumber() {
        return this.portNumber;
    }

    /**
     * <p>
     * The port number of the SAPOData instance.
     * </p>
     * 
     * @param portNumber
     *        The port number of the SAPOData instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withPortNumber(Integer portNumber) {
        setPortNumber(portNumber);
        return this;
    }

    /**
     * <p>
     * The client number for the client creating the connection.
     * </p>
     * 
     * @param clientNumber
     *        The client number for the client creating the connection.
     */

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    /**
     * <p>
     * The client number for the client creating the connection.
     * </p>
     * 
     * @return The client number for the client creating the connection.
     */

    public String getClientNumber() {
        return this.clientNumber;
    }

    /**
     * <p>
     * The client number for the client creating the connection.
     * </p>
     * 
     * @param clientNumber
     *        The client number for the client creating the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withClientNumber(String clientNumber) {
        setClientNumber(clientNumber);
        return this;
    }

    /**
     * <p>
     * The logon language of SAPOData instance.
     * </p>
     * 
     * @param logonLanguage
     *        The logon language of SAPOData instance.
     */

    public void setLogonLanguage(String logonLanguage) {
        this.logonLanguage = logonLanguage;
    }

    /**
     * <p>
     * The logon language of SAPOData instance.
     * </p>
     * 
     * @return The logon language of SAPOData instance.
     */

    public String getLogonLanguage() {
        return this.logonLanguage;
    }

    /**
     * <p>
     * The logon language of SAPOData instance.
     * </p>
     * 
     * @param logonLanguage
     *        The logon language of SAPOData instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withLogonLanguage(String logonLanguage) {
        setLogonLanguage(logonLanguage);
        return this;
    }

    /**
     * <p>
     * The SAPOData Private Link service name to be used for private data transfers.
     * </p>
     * 
     * @param privateLinkServiceName
     *        The SAPOData Private Link service name to be used for private data transfers.
     */

    public void setPrivateLinkServiceName(String privateLinkServiceName) {
        this.privateLinkServiceName = privateLinkServiceName;
    }

    /**
     * <p>
     * The SAPOData Private Link service name to be used for private data transfers.
     * </p>
     * 
     * @return The SAPOData Private Link service name to be used for private data transfers.
     */

    public String getPrivateLinkServiceName() {
        return this.privateLinkServiceName;
    }

    /**
     * <p>
     * The SAPOData Private Link service name to be used for private data transfers.
     * </p>
     * 
     * @param privateLinkServiceName
     *        The SAPOData Private Link service name to be used for private data transfers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withPrivateLinkServiceName(String privateLinkServiceName) {
        setPrivateLinkServiceName(privateLinkServiceName);
        return this;
    }

    /**
     * <p>
     * The SAPOData OAuth properties required for OAuth type authentication.
     * </p>
     * 
     * @param oAuthProperties
     *        The SAPOData OAuth properties required for OAuth type authentication.
     */

    public void setOAuthProperties(OAuthProperties oAuthProperties) {
        this.oAuthProperties = oAuthProperties;
    }

    /**
     * <p>
     * The SAPOData OAuth properties required for OAuth type authentication.
     * </p>
     * 
     * @return The SAPOData OAuth properties required for OAuth type authentication.
     */

    public OAuthProperties getOAuthProperties() {
        return this.oAuthProperties;
    }

    /**
     * <p>
     * The SAPOData OAuth properties required for OAuth type authentication.
     * </p>
     * 
     * @param oAuthProperties
     *        The SAPOData OAuth properties required for OAuth type authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataConnectorProfileProperties withOAuthProperties(OAuthProperties oAuthProperties) {
        setOAuthProperties(oAuthProperties);
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
        if (getApplicationHostUrl() != null)
            sb.append("ApplicationHostUrl: ").append(getApplicationHostUrl()).append(",");
        if (getApplicationServicePath() != null)
            sb.append("ApplicationServicePath: ").append(getApplicationServicePath()).append(",");
        if (getPortNumber() != null)
            sb.append("PortNumber: ").append(getPortNumber()).append(",");
        if (getClientNumber() != null)
            sb.append("ClientNumber: ").append(getClientNumber()).append(",");
        if (getLogonLanguage() != null)
            sb.append("LogonLanguage: ").append(getLogonLanguage()).append(",");
        if (getPrivateLinkServiceName() != null)
            sb.append("PrivateLinkServiceName: ").append(getPrivateLinkServiceName()).append(",");
        if (getOAuthProperties() != null)
            sb.append("OAuthProperties: ").append(getOAuthProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAPODataConnectorProfileProperties == false)
            return false;
        SAPODataConnectorProfileProperties other = (SAPODataConnectorProfileProperties) obj;
        if (other.getApplicationHostUrl() == null ^ this.getApplicationHostUrl() == null)
            return false;
        if (other.getApplicationHostUrl() != null && other.getApplicationHostUrl().equals(this.getApplicationHostUrl()) == false)
            return false;
        if (other.getApplicationServicePath() == null ^ this.getApplicationServicePath() == null)
            return false;
        if (other.getApplicationServicePath() != null && other.getApplicationServicePath().equals(this.getApplicationServicePath()) == false)
            return false;
        if (other.getPortNumber() == null ^ this.getPortNumber() == null)
            return false;
        if (other.getPortNumber() != null && other.getPortNumber().equals(this.getPortNumber()) == false)
            return false;
        if (other.getClientNumber() == null ^ this.getClientNumber() == null)
            return false;
        if (other.getClientNumber() != null && other.getClientNumber().equals(this.getClientNumber()) == false)
            return false;
        if (other.getLogonLanguage() == null ^ this.getLogonLanguage() == null)
            return false;
        if (other.getLogonLanguage() != null && other.getLogonLanguage().equals(this.getLogonLanguage()) == false)
            return false;
        if (other.getPrivateLinkServiceName() == null ^ this.getPrivateLinkServiceName() == null)
            return false;
        if (other.getPrivateLinkServiceName() != null && other.getPrivateLinkServiceName().equals(this.getPrivateLinkServiceName()) == false)
            return false;
        if (other.getOAuthProperties() == null ^ this.getOAuthProperties() == null)
            return false;
        if (other.getOAuthProperties() != null && other.getOAuthProperties().equals(this.getOAuthProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationHostUrl() == null) ? 0 : getApplicationHostUrl().hashCode());
        hashCode = prime * hashCode + ((getApplicationServicePath() == null) ? 0 : getApplicationServicePath().hashCode());
        hashCode = prime * hashCode + ((getPortNumber() == null) ? 0 : getPortNumber().hashCode());
        hashCode = prime * hashCode + ((getClientNumber() == null) ? 0 : getClientNumber().hashCode());
        hashCode = prime * hashCode + ((getLogonLanguage() == null) ? 0 : getLogonLanguage().hashCode());
        hashCode = prime * hashCode + ((getPrivateLinkServiceName() == null) ? 0 : getPrivateLinkServiceName().hashCode());
        hashCode = prime * hashCode + ((getOAuthProperties() == null) ? 0 : getOAuthProperties().hashCode());
        return hashCode;
    }

    @Override
    public SAPODataConnectorProfileProperties clone() {
        try {
            return (SAPODataConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SAPODataConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
