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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Credentials for the master user for a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MasterUserOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     * <code>false</code>.
     * </p>
     */
    private String masterUserARN;
    /**
     * <p>
     * User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     */
    private String masterUserName;
    /**
     * <p>
     * Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     * <code>false</code>.
     * </p>
     * 
     * @param masterUserARN
     *        Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code>
     *        is <code>false</code>.
     */

    public void setMasterUserARN(String masterUserARN) {
        this.masterUserARN = masterUserARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     * <code>false</code>.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code>
     *         is <code>false</code>.
     */

    public String getMasterUserARN() {
        return this.masterUserARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     * <code>false</code>.
     * </p>
     * 
     * @param masterUserARN
     *        Amazon Resource Name (ARN) for the master user. Only specify if <code>InternalUserDatabaseEnabled</code>
     *        is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MasterUserOptions withMasterUserARN(String masterUserARN) {
        setMasterUserARN(masterUserARN);
        return this;
    }

    /**
     * <p>
     * User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @param masterUserName
     *        User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     *        <code>true</code>.
     */

    public void setMasterUserName(String masterUserName) {
        this.masterUserName = masterUserName;
    }

    /**
     * <p>
     * User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @return User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     *         <code>true</code>.
     */

    public String getMasterUserName() {
        return this.masterUserName;
    }

    /**
     * <p>
     * User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @param masterUserName
     *        User name for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MasterUserOptions withMasterUserName(String masterUserName) {
        setMasterUserName(masterUserName);
        return this;
    }

    /**
     * <p>
     * Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @param masterUserPassword
     *        Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     *        <code>true</code>.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @return Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     *         <code>true</code>.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @param masterUserPassword
     *        Password for the master user. Only specify if <code>InternalUserDatabaseEnabled</code> is
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MasterUserOptions withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
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
        if (getMasterUserARN() != null)
            sb.append("MasterUserARN: ").append(getMasterUserARN()).append(",");
        if (getMasterUserName() != null)
            sb.append("MasterUserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MasterUserOptions == false)
            return false;
        MasterUserOptions other = (MasterUserOptions) obj;
        if (other.getMasterUserARN() == null ^ this.getMasterUserARN() == null)
            return false;
        if (other.getMasterUserARN() != null && other.getMasterUserARN().equals(this.getMasterUserARN()) == false)
            return false;
        if (other.getMasterUserName() == null ^ this.getMasterUserName() == null)
            return false;
        if (other.getMasterUserName() != null && other.getMasterUserName().equals(this.getMasterUserName()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasterUserARN() == null) ? 0 : getMasterUserARN().hashCode());
        hashCode = prime * hashCode + ((getMasterUserName() == null) ? 0 : getMasterUserName().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        return hashCode;
    }

    @Override
    public MasterUserOptions clone() {
        try {
            return (MasterUserOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.MasterUserOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
