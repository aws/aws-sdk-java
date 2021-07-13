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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes Apple social federation configurations for allowing your app users to sign in using OAuth.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/BackendAuthAppleProviderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendAuthAppleProviderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the client_id (also called Services ID) that comes from Apple.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * Describes the key_id that comes from Apple.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Describes the private_key that comes from Apple.
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * Describes the team_id that comes from Apple.
     * </p>
     */
    private String teamId;

    /**
     * <p>
     * Describes the client_id (also called Services ID) that comes from Apple.
     * </p>
     * 
     * @param clientId
     *        Describes the client_id (also called Services ID) that comes from Apple.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * Describes the client_id (also called Services ID) that comes from Apple.
     * </p>
     * 
     * @return Describes the client_id (also called Services ID) that comes from Apple.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * Describes the client_id (also called Services ID) that comes from Apple.
     * </p>
     * 
     * @param clientId
     *        Describes the client_id (also called Services ID) that comes from Apple.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAuthAppleProviderConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * Describes the key_id that comes from Apple.
     * </p>
     * 
     * @param keyId
     *        Describes the key_id that comes from Apple.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Describes the key_id that comes from Apple.
     * </p>
     * 
     * @return Describes the key_id that comes from Apple.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Describes the key_id that comes from Apple.
     * </p>
     * 
     * @param keyId
     *        Describes the key_id that comes from Apple.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAuthAppleProviderConfig withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Describes the private_key that comes from Apple.
     * </p>
     * 
     * @param privateKey
     *        Describes the private_key that comes from Apple.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * Describes the private_key that comes from Apple.
     * </p>
     * 
     * @return Describes the private_key that comes from Apple.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * Describes the private_key that comes from Apple.
     * </p>
     * 
     * @param privateKey
     *        Describes the private_key that comes from Apple.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAuthAppleProviderConfig withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * Describes the team_id that comes from Apple.
     * </p>
     * 
     * @param teamId
     *        Describes the team_id that comes from Apple.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * Describes the team_id that comes from Apple.
     * </p>
     * 
     * @return Describes the team_id that comes from Apple.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * <p>
     * Describes the team_id that comes from Apple.
     * </p>
     * 
     * @param teamId
     *        Describes the team_id that comes from Apple.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendAuthAppleProviderConfig withTeamId(String teamId) {
        setTeamId(teamId);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendAuthAppleProviderConfig == false)
            return false;
        BackendAuthAppleProviderConfig other = (BackendAuthAppleProviderConfig) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        return hashCode;
    }

    @Override
    public BackendAuthAppleProviderConfig clone() {
        try {
            return (BackendAuthAppleProviderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.BackendAuthAppleProviderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
