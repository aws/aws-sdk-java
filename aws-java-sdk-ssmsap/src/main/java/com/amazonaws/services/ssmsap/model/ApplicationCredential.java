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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ApplicationCredential" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationCredential implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String databaseName;
    /** <p/> */
    private String credentialType;
    /** <p/> */
    private String secretId;

    /**
     * <p/>
     * 
     * @param databaseName
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p/>
     * 
     * @param databaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationCredential withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param credentialType
     * @see CredentialType
     */

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see CredentialType
     */

    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * <p/>
     * 
     * @param credentialType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CredentialType
     */

    public ApplicationCredential withCredentialType(String credentialType) {
        setCredentialType(credentialType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param credentialType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CredentialType
     */

    public ApplicationCredential withCredentialType(CredentialType credentialType) {
        this.credentialType = credentialType.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param secretId
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p/>
     * 
     * @param secretId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationCredential withSecretId(String secretId) {
        setSecretId(secretId);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getCredentialType() != null)
            sb.append("CredentialType: ").append(getCredentialType()).append(",");
        if (getSecretId() != null)
            sb.append("SecretId: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationCredential == false)
            return false;
        ApplicationCredential other = (ApplicationCredential) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getCredentialType() == null ^ this.getCredentialType() == null)
            return false;
        if (other.getCredentialType() != null && other.getCredentialType().equals(this.getCredentialType()) == false)
            return false;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getCredentialType() == null) ? 0 : getCredentialType().hashCode());
        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationCredential clone() {
        try {
            return (ApplicationCredential) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ApplicationCredentialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
