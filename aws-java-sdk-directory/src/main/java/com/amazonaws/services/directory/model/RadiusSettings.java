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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a Remote Authentication Dial In User Service (RADIUS) server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RadiusSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RadiusSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your
     * RADIUS server load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> radiusServers;
    /**
     * <p>
     * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic
     * over this port from the AWS Directory Service servers.
     * </p>
     */
    private Integer radiusPort;
    /**
     * <p>
     * The amount of time, in seconds, to wait for the RADIUS server to respond.
     * </p>
     */
    private Integer radiusTimeout;
    /**
     * <p>
     * The maximum number of times that communication with the RADIUS server is attempted.
     * </p>
     */
    private Integer radiusRetries;
    /**
     * <p>
     * Required for enabling RADIUS on the directory.
     * </p>
     */
    private String sharedSecret;
    /**
     * <p>
     * The protocol specified for your RADIUS endpoints.
     * </p>
     */
    private String authenticationProtocol;
    /**
     * <p>
     * Not currently used.
     * </p>
     */
    private String displayLabel;
    /**
     * <p>
     * Not currently used.
     * </p>
     */
    private Boolean useSameUsername;

    /**
     * <p>
     * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your
     * RADIUS server load balancer.
     * </p>
     * 
     * @return An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of
     *         your RADIUS server load balancer.
     */

    public java.util.List<String> getRadiusServers() {
        if (radiusServers == null) {
            radiusServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return radiusServers;
    }

    /**
     * <p>
     * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your
     * RADIUS server load balancer.
     * </p>
     * 
     * @param radiusServers
     *        An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of
     *        your RADIUS server load balancer.
     */

    public void setRadiusServers(java.util.Collection<String> radiusServers) {
        if (radiusServers == null) {
            this.radiusServers = null;
            return;
        }

        this.radiusServers = new com.amazonaws.internal.SdkInternalList<String>(radiusServers);
    }

    /**
     * <p>
     * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your
     * RADIUS server load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRadiusServers(java.util.Collection)} or {@link #withRadiusServers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param radiusServers
     *        An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of
     *        your RADIUS server load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withRadiusServers(String... radiusServers) {
        if (this.radiusServers == null) {
            setRadiusServers(new com.amazonaws.internal.SdkInternalList<String>(radiusServers.length));
        }
        for (String ele : radiusServers) {
            this.radiusServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your
     * RADIUS server load balancer.
     * </p>
     * 
     * @param radiusServers
     *        An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of
     *        your RADIUS server load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withRadiusServers(java.util.Collection<String> radiusServers) {
        setRadiusServers(radiusServers);
        return this;
    }

    /**
     * <p>
     * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic
     * over this port from the AWS Directory Service servers.
     * </p>
     * 
     * @param radiusPort
     *        The port that your RADIUS server is using for communications. Your on-premises network must allow inbound
     *        traffic over this port from the AWS Directory Service servers.
     */

    public void setRadiusPort(Integer radiusPort) {
        this.radiusPort = radiusPort;
    }

    /**
     * <p>
     * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic
     * over this port from the AWS Directory Service servers.
     * </p>
     * 
     * @return The port that your RADIUS server is using for communications. Your on-premises network must allow inbound
     *         traffic over this port from the AWS Directory Service servers.
     */

    public Integer getRadiusPort() {
        return this.radiusPort;
    }

    /**
     * <p>
     * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic
     * over this port from the AWS Directory Service servers.
     * </p>
     * 
     * @param radiusPort
     *        The port that your RADIUS server is using for communications. Your on-premises network must allow inbound
     *        traffic over this port from the AWS Directory Service servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withRadiusPort(Integer radiusPort) {
        setRadiusPort(radiusPort);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for the RADIUS server to respond.
     * </p>
     * 
     * @param radiusTimeout
     *        The amount of time, in seconds, to wait for the RADIUS server to respond.
     */

    public void setRadiusTimeout(Integer radiusTimeout) {
        this.radiusTimeout = radiusTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for the RADIUS server to respond.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait for the RADIUS server to respond.
     */

    public Integer getRadiusTimeout() {
        return this.radiusTimeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for the RADIUS server to respond.
     * </p>
     * 
     * @param radiusTimeout
     *        The amount of time, in seconds, to wait for the RADIUS server to respond.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withRadiusTimeout(Integer radiusTimeout) {
        setRadiusTimeout(radiusTimeout);
        return this;
    }

    /**
     * <p>
     * The maximum number of times that communication with the RADIUS server is attempted.
     * </p>
     * 
     * @param radiusRetries
     *        The maximum number of times that communication with the RADIUS server is attempted.
     */

    public void setRadiusRetries(Integer radiusRetries) {
        this.radiusRetries = radiusRetries;
    }

    /**
     * <p>
     * The maximum number of times that communication with the RADIUS server is attempted.
     * </p>
     * 
     * @return The maximum number of times that communication with the RADIUS server is attempted.
     */

    public Integer getRadiusRetries() {
        return this.radiusRetries;
    }

    /**
     * <p>
     * The maximum number of times that communication with the RADIUS server is attempted.
     * </p>
     * 
     * @param radiusRetries
     *        The maximum number of times that communication with the RADIUS server is attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withRadiusRetries(Integer radiusRetries) {
        setRadiusRetries(radiusRetries);
        return this;
    }

    /**
     * <p>
     * Required for enabling RADIUS on the directory.
     * </p>
     * 
     * @param sharedSecret
     *        Required for enabling RADIUS on the directory.
     */

    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    /**
     * <p>
     * Required for enabling RADIUS on the directory.
     * </p>
     * 
     * @return Required for enabling RADIUS on the directory.
     */

    public String getSharedSecret() {
        return this.sharedSecret;
    }

    /**
     * <p>
     * Required for enabling RADIUS on the directory.
     * </p>
     * 
     * @param sharedSecret
     *        Required for enabling RADIUS on the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withSharedSecret(String sharedSecret) {
        setSharedSecret(sharedSecret);
        return this;
    }

    /**
     * <p>
     * The protocol specified for your RADIUS endpoints.
     * </p>
     * 
     * @param authenticationProtocol
     *        The protocol specified for your RADIUS endpoints.
     * @see RadiusAuthenticationProtocol
     */

    public void setAuthenticationProtocol(String authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol;
    }

    /**
     * <p>
     * The protocol specified for your RADIUS endpoints.
     * </p>
     * 
     * @return The protocol specified for your RADIUS endpoints.
     * @see RadiusAuthenticationProtocol
     */

    public String getAuthenticationProtocol() {
        return this.authenticationProtocol;
    }

    /**
     * <p>
     * The protocol specified for your RADIUS endpoints.
     * </p>
     * 
     * @param authenticationProtocol
     *        The protocol specified for your RADIUS endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadiusAuthenticationProtocol
     */

    public RadiusSettings withAuthenticationProtocol(String authenticationProtocol) {
        setAuthenticationProtocol(authenticationProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol specified for your RADIUS endpoints.
     * </p>
     * 
     * @param authenticationProtocol
     *        The protocol specified for your RADIUS endpoints.
     * @see RadiusAuthenticationProtocol
     */

    public void setAuthenticationProtocol(RadiusAuthenticationProtocol authenticationProtocol) {
        withAuthenticationProtocol(authenticationProtocol);
    }

    /**
     * <p>
     * The protocol specified for your RADIUS endpoints.
     * </p>
     * 
     * @param authenticationProtocol
     *        The protocol specified for your RADIUS endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadiusAuthenticationProtocol
     */

    public RadiusSettings withAuthenticationProtocol(RadiusAuthenticationProtocol authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol.toString();
        return this;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param displayLabel
     *        Not currently used.
     */

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @return Not currently used.
     */

    public String getDisplayLabel() {
        return this.displayLabel;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param displayLabel
     *        Not currently used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withDisplayLabel(String displayLabel) {
        setDisplayLabel(displayLabel);
        return this;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param useSameUsername
     *        Not currently used.
     */

    public void setUseSameUsername(Boolean useSameUsername) {
        this.useSameUsername = useSameUsername;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @return Not currently used.
     */

    public Boolean getUseSameUsername() {
        return this.useSameUsername;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param useSameUsername
     *        Not currently used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadiusSettings withUseSameUsername(Boolean useSameUsername) {
        setUseSameUsername(useSameUsername);
        return this;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @return Not currently used.
     */

    public Boolean isUseSameUsername() {
        return this.useSameUsername;
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
        if (getRadiusServers() != null)
            sb.append("RadiusServers: ").append(getRadiusServers()).append(",");
        if (getRadiusPort() != null)
            sb.append("RadiusPort: ").append(getRadiusPort()).append(",");
        if (getRadiusTimeout() != null)
            sb.append("RadiusTimeout: ").append(getRadiusTimeout()).append(",");
        if (getRadiusRetries() != null)
            sb.append("RadiusRetries: ").append(getRadiusRetries()).append(",");
        if (getSharedSecret() != null)
            sb.append("SharedSecret: ").append("***Sensitive Data Redacted***").append(",");
        if (getAuthenticationProtocol() != null)
            sb.append("AuthenticationProtocol: ").append(getAuthenticationProtocol()).append(",");
        if (getDisplayLabel() != null)
            sb.append("DisplayLabel: ").append(getDisplayLabel()).append(",");
        if (getUseSameUsername() != null)
            sb.append("UseSameUsername: ").append(getUseSameUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RadiusSettings == false)
            return false;
        RadiusSettings other = (RadiusSettings) obj;
        if (other.getRadiusServers() == null ^ this.getRadiusServers() == null)
            return false;
        if (other.getRadiusServers() != null && other.getRadiusServers().equals(this.getRadiusServers()) == false)
            return false;
        if (other.getRadiusPort() == null ^ this.getRadiusPort() == null)
            return false;
        if (other.getRadiusPort() != null && other.getRadiusPort().equals(this.getRadiusPort()) == false)
            return false;
        if (other.getRadiusTimeout() == null ^ this.getRadiusTimeout() == null)
            return false;
        if (other.getRadiusTimeout() != null && other.getRadiusTimeout().equals(this.getRadiusTimeout()) == false)
            return false;
        if (other.getRadiusRetries() == null ^ this.getRadiusRetries() == null)
            return false;
        if (other.getRadiusRetries() != null && other.getRadiusRetries().equals(this.getRadiusRetries()) == false)
            return false;
        if (other.getSharedSecret() == null ^ this.getSharedSecret() == null)
            return false;
        if (other.getSharedSecret() != null && other.getSharedSecret().equals(this.getSharedSecret()) == false)
            return false;
        if (other.getAuthenticationProtocol() == null ^ this.getAuthenticationProtocol() == null)
            return false;
        if (other.getAuthenticationProtocol() != null && other.getAuthenticationProtocol().equals(this.getAuthenticationProtocol()) == false)
            return false;
        if (other.getDisplayLabel() == null ^ this.getDisplayLabel() == null)
            return false;
        if (other.getDisplayLabel() != null && other.getDisplayLabel().equals(this.getDisplayLabel()) == false)
            return false;
        if (other.getUseSameUsername() == null ^ this.getUseSameUsername() == null)
            return false;
        if (other.getUseSameUsername() != null && other.getUseSameUsername().equals(this.getUseSameUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRadiusServers() == null) ? 0 : getRadiusServers().hashCode());
        hashCode = prime * hashCode + ((getRadiusPort() == null) ? 0 : getRadiusPort().hashCode());
        hashCode = prime * hashCode + ((getRadiusTimeout() == null) ? 0 : getRadiusTimeout().hashCode());
        hashCode = prime * hashCode + ((getRadiusRetries() == null) ? 0 : getRadiusRetries().hashCode());
        hashCode = prime * hashCode + ((getSharedSecret() == null) ? 0 : getSharedSecret().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationProtocol() == null) ? 0 : getAuthenticationProtocol().hashCode());
        hashCode = prime * hashCode + ((getDisplayLabel() == null) ? 0 : getDisplayLabel().hashCode());
        hashCode = prime * hashCode + ((getUseSameUsername() == null) ? 0 : getUseSameUsername().hashCode());
        return hashCode;
    }

    @Override
    public RadiusSettings clone() {
        try {
            return (RadiusSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.RadiusSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
