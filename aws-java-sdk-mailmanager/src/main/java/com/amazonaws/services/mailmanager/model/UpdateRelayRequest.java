/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateRelay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRelayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     */
    private RelayAuthentication authentication;
    /**
     * <p>
     * The unique relay identifier.
     * </p>
     */
    private String relayId;
    /**
     * <p>
     * The name of the relay resource.
     * </p>
     */
    private String relayName;
    /**
     * <p>
     * The destination relay server address.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The destination relay server port.
     * </p>
     */
    private Integer serverPort;

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     * 
     * @param authentication
     *        Authentication for the relay destination server—specify the secretARN where the SMTP credentials are
     *        stored.
     */

    public void setAuthentication(RelayAuthentication authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     * 
     * @return Authentication for the relay destination server—specify the secretARN where the SMTP credentials are
     *         stored.
     */

    public RelayAuthentication getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     * 
     * @param authentication
     *        Authentication for the relay destination server—specify the secretARN where the SMTP credentials are
     *        stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelayRequest withAuthentication(RelayAuthentication authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * The unique relay identifier.
     * </p>
     * 
     * @param relayId
     *        The unique relay identifier.
     */

    public void setRelayId(String relayId) {
        this.relayId = relayId;
    }

    /**
     * <p>
     * The unique relay identifier.
     * </p>
     * 
     * @return The unique relay identifier.
     */

    public String getRelayId() {
        return this.relayId;
    }

    /**
     * <p>
     * The unique relay identifier.
     * </p>
     * 
     * @param relayId
     *        The unique relay identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelayRequest withRelayId(String relayId) {
        setRelayId(relayId);
        return this;
    }

    /**
     * <p>
     * The name of the relay resource.
     * </p>
     * 
     * @param relayName
     *        The name of the relay resource.
     */

    public void setRelayName(String relayName) {
        this.relayName = relayName;
    }

    /**
     * <p>
     * The name of the relay resource.
     * </p>
     * 
     * @return The name of the relay resource.
     */

    public String getRelayName() {
        return this.relayName;
    }

    /**
     * <p>
     * The name of the relay resource.
     * </p>
     * 
     * @param relayName
     *        The name of the relay resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelayRequest withRelayName(String relayName) {
        setRelayName(relayName);
        return this;
    }

    /**
     * <p>
     * The destination relay server address.
     * </p>
     * 
     * @param serverName
     *        The destination relay server address.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The destination relay server address.
     * </p>
     * 
     * @return The destination relay server address.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The destination relay server address.
     * </p>
     * 
     * @param serverName
     *        The destination relay server address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelayRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The destination relay server port.
     * </p>
     * 
     * @param serverPort
     *        The destination relay server port.
     */

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * <p>
     * The destination relay server port.
     * </p>
     * 
     * @return The destination relay server port.
     */

    public Integer getServerPort() {
        return this.serverPort;
    }

    /**
     * <p>
     * The destination relay server port.
     * </p>
     * 
     * @param serverPort
     *        The destination relay server port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelayRequest withServerPort(Integer serverPort) {
        setServerPort(serverPort);
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
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getRelayId() != null)
            sb.append("RelayId: ").append(getRelayId()).append(",");
        if (getRelayName() != null)
            sb.append("RelayName: ").append(getRelayName()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getServerPort() != null)
            sb.append("ServerPort: ").append(getServerPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRelayRequest == false)
            return false;
        UpdateRelayRequest other = (UpdateRelayRequest) obj;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getRelayId() == null ^ this.getRelayId() == null)
            return false;
        if (other.getRelayId() != null && other.getRelayId().equals(this.getRelayId()) == false)
            return false;
        if (other.getRelayName() == null ^ this.getRelayName() == null)
            return false;
        if (other.getRelayName() != null && other.getRelayName().equals(this.getRelayName()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServerPort() == null ^ this.getServerPort() == null)
            return false;
        if (other.getServerPort() != null && other.getServerPort().equals(this.getServerPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getRelayId() == null) ? 0 : getRelayId().hashCode());
        hashCode = prime * hashCode + ((getRelayName() == null) ? 0 : getRelayName().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServerPort() == null) ? 0 : getServerPort().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRelayRequest clone() {
        return (UpdateRelayRequest) super.clone();
    }

}
