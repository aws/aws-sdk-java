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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile credentials required by Infor Nexus.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/InforNexusConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InforNexusConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The identifier for the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The encryption keys used to encrypt data.
     * </p>
     */
    private String datakey;

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The Access Key portion of the credentials.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * 
     * @return The Access Key portion of the credentials.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The Access Key portion of the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InforNexusConnectorProfileCredentials withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * 
     * @param userId
     *        The identifier for the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * 
     * @return The identifier for the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * 
     * @param userId
     *        The identifier for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InforNexusConnectorProfileCredentials withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret key used to sign requests.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * 
     * @return The secret key used to sign requests.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The secret key used to sign requests.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret key used to sign requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InforNexusConnectorProfileCredentials withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The encryption keys used to encrypt data.
     * </p>
     * 
     * @param datakey
     *        The encryption keys used to encrypt data.
     */

    public void setDatakey(String datakey) {
        this.datakey = datakey;
    }

    /**
     * <p>
     * The encryption keys used to encrypt data.
     * </p>
     * 
     * @return The encryption keys used to encrypt data.
     */

    public String getDatakey() {
        return this.datakey;
    }

    /**
     * <p>
     * The encryption keys used to encrypt data.
     * </p>
     * 
     * @param datakey
     *        The encryption keys used to encrypt data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InforNexusConnectorProfileCredentials withDatakey(String datakey) {
        setDatakey(datakey);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append(getSecretAccessKey()).append(",");
        if (getDatakey() != null)
            sb.append("Datakey: ").append(getDatakey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InforNexusConnectorProfileCredentials == false)
            return false;
        InforNexusConnectorProfileCredentials other = (InforNexusConnectorProfileCredentials) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getDatakey() == null ^ this.getDatakey() == null)
            return false;
        if (other.getDatakey() != null && other.getDatakey().equals(this.getDatakey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getDatakey() == null) ? 0 : getDatakey().hashCode());
        return hashCode;
    }

    @Override
    public InforNexusConnectorProfileCredentials clone() {
        try {
            return (InforNexusConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.InforNexusConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
