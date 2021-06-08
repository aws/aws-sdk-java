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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateProxySession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProxySessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The proxy session ID.
     * </p>
     */
    private String proxySessionId;
    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     */
    private Integer expiryMinutes;

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime voice connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * 
     * @return The Amazon Chime voice connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime voice connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime voice connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProxySessionRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The proxy session ID.
     * </p>
     * 
     * @param proxySessionId
     *        The proxy session ID.
     */

    public void setProxySessionId(String proxySessionId) {
        this.proxySessionId = proxySessionId;
    }

    /**
     * <p>
     * The proxy session ID.
     * </p>
     * 
     * @return The proxy session ID.
     */

    public String getProxySessionId() {
        return this.proxySessionId;
    }

    /**
     * <p>
     * The proxy session ID.
     * </p>
     * 
     * @param proxySessionId
     *        The proxy session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProxySessionRequest withProxySessionId(String proxySessionId) {
        setProxySessionId(proxySessionId);
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @return The proxy session capabilities.
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateProxySessionRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateProxySessionRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The proxy session capabilities.
     * </p>
     * 
     * @param capabilities
     *        The proxy session capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateProxySessionRequest withCapabilities(Capability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * 
     * @param expiryMinutes
     *        The number of minutes allowed for the proxy session.
     */

    public void setExpiryMinutes(Integer expiryMinutes) {
        this.expiryMinutes = expiryMinutes;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * 
     * @return The number of minutes allowed for the proxy session.
     */

    public Integer getExpiryMinutes() {
        return this.expiryMinutes;
    }

    /**
     * <p>
     * The number of minutes allowed for the proxy session.
     * </p>
     * 
     * @param expiryMinutes
     *        The number of minutes allowed for the proxy session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProxySessionRequest withExpiryMinutes(Integer expiryMinutes) {
        setExpiryMinutes(expiryMinutes);
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getProxySessionId() != null)
            sb.append("ProxySessionId: ").append(getProxySessionId()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getExpiryMinutes() != null)
            sb.append("ExpiryMinutes: ").append(getExpiryMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProxySessionRequest == false)
            return false;
        UpdateProxySessionRequest other = (UpdateProxySessionRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getProxySessionId() == null ^ this.getProxySessionId() == null)
            return false;
        if (other.getProxySessionId() != null && other.getProxySessionId().equals(this.getProxySessionId()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getExpiryMinutes() == null ^ this.getExpiryMinutes() == null)
            return false;
        if (other.getExpiryMinutes() != null && other.getExpiryMinutes().equals(this.getExpiryMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getProxySessionId() == null) ? 0 : getProxySessionId().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getExpiryMinutes() == null) ? 0 : getExpiryMinutes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProxySessionRequest clone() {
        return (UpdateProxySessionRequest) super.clone();
    }

}
