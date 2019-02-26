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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Temporary credentials with authorization to log on to an Amazon Redshift database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A database user name that is authorized to log on to the database <code>DbName</code> using the password
     * <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same database
     * privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the <code>DbGroups</code>
     * parameter is specifed, <code>DbUser</code> is added to the listed groups for any sessions created using these
     * credentials.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the database
     * <code>DbName</code>.
     * </p>
     */
    private String dbPassword;
    /**
     * <p>
     * The date and time the password in <code>DbPassword</code> expires.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * A database user name that is authorized to log on to the database <code>DbName</code> using the password
     * <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same database
     * privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the <code>DbGroups</code>
     * parameter is specifed, <code>DbUser</code> is added to the listed groups for any sessions created using these
     * credentials.
     * </p>
     * 
     * @param dbUser
     *        A database user name that is authorized to log on to the database <code>DbName</code> using the password
     *        <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same
     *        database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the
     *        <code>DbGroups</code> parameter is specifed, <code>DbUser</code> is added to the listed groups for any
     *        sessions created using these credentials.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * A database user name that is authorized to log on to the database <code>DbName</code> using the password
     * <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same database
     * privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the <code>DbGroups</code>
     * parameter is specifed, <code>DbUser</code> is added to the listed groups for any sessions created using these
     * credentials.
     * </p>
     * 
     * @return A database user name that is authorized to log on to the database <code>DbName</code> using the password
     *         <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same
     *         database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the
     *         <code>DbGroups</code> parameter is specifed, <code>DbUser</code> is added to the listed groups for any
     *         sessions created using these credentials.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * A database user name that is authorized to log on to the database <code>DbName</code> using the password
     * <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same database
     * privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the <code>DbGroups</code>
     * parameter is specifed, <code>DbUser</code> is added to the listed groups for any sessions created using these
     * credentials.
     * </p>
     * 
     * @param dbUser
     *        A database user name that is authorized to log on to the database <code>DbName</code> using the password
     *        <code>DbPassword</code>. If the specified DbUser exists in the database, the new user name has the same
     *        database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the
     *        <code>DbGroups</code> parameter is specifed, <code>DbUser</code> is added to the listed groups for any
     *        sessions created using these credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsResult withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the database
     * <code>DbName</code>.
     * </p>
     * 
     * @param dbPassword
     *        A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the
     *        database <code>DbName</code>.
     */

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * <p>
     * A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the database
     * <code>DbName</code>.
     * </p>
     * 
     * @return A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the
     *         database <code>DbName</code>.
     */

    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * <p>
     * A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the database
     * <code>DbName</code>.
     * </p>
     * 
     * @param dbPassword
     *        A temporary password that authorizes the user name returned by <code>DbUser</code> to log on to the
     *        database <code>DbName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsResult withDbPassword(String dbPassword) {
        setDbPassword(dbPassword);
        return this;
    }

    /**
     * <p>
     * The date and time the password in <code>DbPassword</code> expires.
     * </p>
     * 
     * @param expiration
     *        The date and time the password in <code>DbPassword</code> expires.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date and time the password in <code>DbPassword</code> expires.
     * </p>
     * 
     * @return The date and time the password in <code>DbPassword</code> expires.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date and time the password in <code>DbPassword</code> expires.
     * </p>
     * 
     * @param expiration
     *        The date and time the password in <code>DbPassword</code> expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsResult withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
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
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getDbPassword() != null)
            sb.append("DbPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClusterCredentialsResult == false)
            return false;
        GetClusterCredentialsResult other = (GetClusterCredentialsResult) obj;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getDbPassword() == null ^ this.getDbPassword() == null)
            return false;
        if (other.getDbPassword() != null && other.getDbPassword().equals(this.getDbPassword()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public GetClusterCredentialsResult clone() {
        try {
            return (GetClusterCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
