/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data source credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSourceCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Credential pair.
     * </p>
     */
    private CredentialPair credentialPair;

    /**
     * <p>
     * Credential pair.
     * </p>
     * 
     * @param credentialPair
     *        Credential pair.
     */

    public void setCredentialPair(CredentialPair credentialPair) {
        this.credentialPair = credentialPair;
    }

    /**
     * <p>
     * Credential pair.
     * </p>
     * 
     * @return Credential pair.
     */

    public CredentialPair getCredentialPair() {
        return this.credentialPair;
    }

    /**
     * <p>
     * Credential pair.
     * </p>
     * 
     * @param credentialPair
     *        Credential pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceCredentials withCredentialPair(CredentialPair credentialPair) {
        setCredentialPair(credentialPair);
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
        if (getCredentialPair() != null)
            sb.append("CredentialPair: ").append(getCredentialPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceCredentials == false)
            return false;
        DataSourceCredentials other = (DataSourceCredentials) obj;
        if (other.getCredentialPair() == null ^ this.getCredentialPair() == null)
            return false;
        if (other.getCredentialPair() != null && other.getCredentialPair().equals(this.getCredentialPair()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentialPair() == null) ? 0 : getCredentialPair().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceCredentials clone() {
        try {
            return (DataSourceCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSourceCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
