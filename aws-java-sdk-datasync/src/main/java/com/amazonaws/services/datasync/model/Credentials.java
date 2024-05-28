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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The credentials that provide DataSync Discovery read access to your on-premises storage system's management
 * interface.
 * </p>
 * <p>
 * DataSync Discovery stores these credentials in <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">Secrets Manager</a>. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html">Accessing your
 * on-premises storage system</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Credentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the user name for your storage system's management interface.
     * </p>
     */
    private String username;
    /**
     * <p>
     * Specifies the password for your storage system's management interface.
     * </p>
     */
    private String password;

    /**
     * <p>
     * Specifies the user name for your storage system's management interface.
     * </p>
     * 
     * @param username
     *        Specifies the user name for your storage system's management interface.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * Specifies the user name for your storage system's management interface.
     * </p>
     * 
     * @return Specifies the user name for your storage system's management interface.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * Specifies the user name for your storage system's management interface.
     * </p>
     * 
     * @param username
     *        Specifies the user name for your storage system's management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * Specifies the password for your storage system's management interface.
     * </p>
     * 
     * @param password
     *        Specifies the password for your storage system's management interface.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Specifies the password for your storage system's management interface.
     * </p>
     * 
     * @return Specifies the password for your storage system's management interface.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Specifies the password for your storage system's management interface.
     * </p>
     * 
     * @param password
     *        Specifies the password for your storage system's management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withPassword(String password) {
        setPassword(password);
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
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credentials == false)
            return false;
        Credentials other = (Credentials) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public Credentials clone() {
        try {
            return (Credentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.CredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
