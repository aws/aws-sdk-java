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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseMasterUserPassword"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseMasterUserPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords respectively.
     * Specifying <code>PENDING</code> returns the newest version of the password that will rotate to
     * <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     * <code>PENDING</code> password is no longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     */
    private String passwordVersion;

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to get the master user password.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * 
     * @return The name of your database for which to get the master user password.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to get the master user password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseMasterUserPasswordRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords respectively.
     * Specifying <code>PENDING</code> returns the newest version of the password that will rotate to
     * <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     * <code>PENDING</code> password is no longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * 
     * @param passwordVersion
     *        The password version to return.</p>
     *        <p>
     *        Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords
     *        respectively. Specifying <code>PENDING</code> returns the newest version of the password that will rotate
     *        to <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     *        <code>PENDING</code> password is no longer available.
     *        </p>
     *        <p>
     *        Default: <code>CURRENT</code>
     * @see RelationalDatabasePasswordVersion
     */

    public void setPasswordVersion(String passwordVersion) {
        this.passwordVersion = passwordVersion;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords respectively.
     * Specifying <code>PENDING</code> returns the newest version of the password that will rotate to
     * <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     * <code>PENDING</code> password is no longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * 
     * @return The password version to return.</p>
     *         <p>
     *         Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords
     *         respectively. Specifying <code>PENDING</code> returns the newest version of the password that will rotate
     *         to <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     *         <code>PENDING</code> password is no longer available.
     *         </p>
     *         <p>
     *         Default: <code>CURRENT</code>
     * @see RelationalDatabasePasswordVersion
     */

    public String getPasswordVersion() {
        return this.passwordVersion;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords respectively.
     * Specifying <code>PENDING</code> returns the newest version of the password that will rotate to
     * <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     * <code>PENDING</code> password is no longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * 
     * @param passwordVersion
     *        The password version to return.</p>
     *        <p>
     *        Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords
     *        respectively. Specifying <code>PENDING</code> returns the newest version of the password that will rotate
     *        to <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     *        <code>PENDING</code> password is no longer available.
     *        </p>
     *        <p>
     *        Default: <code>CURRENT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabasePasswordVersion
     */

    public GetRelationalDatabaseMasterUserPasswordRequest withPasswordVersion(String passwordVersion) {
        setPasswordVersion(passwordVersion);
        return this;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords respectively.
     * Specifying <code>PENDING</code> returns the newest version of the password that will rotate to
     * <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     * <code>PENDING</code> password is no longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * 
     * @param passwordVersion
     *        The password version to return.</p>
     *        <p>
     *        Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the current or previous passwords
     *        respectively. Specifying <code>PENDING</code> returns the newest version of the password that will rotate
     *        to <code>CURRENT</code>. After the <code>PENDING</code> password rotates to <code>CURRENT</code>, the
     *        <code>PENDING</code> password is no longer available.
     *        </p>
     *        <p>
     *        Default: <code>CURRENT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabasePasswordVersion
     */

    public GetRelationalDatabaseMasterUserPasswordRequest withPasswordVersion(RelationalDatabasePasswordVersion passwordVersion) {
        this.passwordVersion = passwordVersion.toString();
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getPasswordVersion() != null)
            sb.append("PasswordVersion: ").append(getPasswordVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseMasterUserPasswordRequest == false)
            return false;
        GetRelationalDatabaseMasterUserPasswordRequest other = (GetRelationalDatabaseMasterUserPasswordRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getPasswordVersion() == null ^ this.getPasswordVersion() == null)
            return false;
        if (other.getPasswordVersion() != null && other.getPasswordVersion().equals(this.getPasswordVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getPasswordVersion() == null) ? 0 : getPasswordVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseMasterUserPasswordRequest clone() {
        return (GetRelationalDatabaseMasterUserPasswordRequest) super.clone();
    }

}
