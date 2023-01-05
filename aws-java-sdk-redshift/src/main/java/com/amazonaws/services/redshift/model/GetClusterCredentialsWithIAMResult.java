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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentialsWithIAM"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsWithIAMResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A database user name that you provide when you connect to a database. The database user is mapped 1:1 to the
     * source IAM identity.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * A temporary password that you provide when you connect to a database.
     * </p>
     */
    private String dbPassword;
    /**
     * <p>
     * The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary password
     * fails.
     * </p>
     */
    private java.util.Date expiration;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.Date nextRefreshTime;

    /**
     * <p>
     * A database user name that you provide when you connect to a database. The database user is mapped 1:1 to the
     * source IAM identity.
     * </p>
     * 
     * @param dbUser
     *        A database user name that you provide when you connect to a database. The database user is mapped 1:1 to
     *        the source IAM identity.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * A database user name that you provide when you connect to a database. The database user is mapped 1:1 to the
     * source IAM identity.
     * </p>
     * 
     * @return A database user name that you provide when you connect to a database. The database user is mapped 1:1 to
     *         the source IAM identity.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * A database user name that you provide when you connect to a database. The database user is mapped 1:1 to the
     * source IAM identity.
     * </p>
     * 
     * @param dbUser
     *        A database user name that you provide when you connect to a database. The database user is mapped 1:1 to
     *        the source IAM identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMResult withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * A temporary password that you provide when you connect to a database.
     * </p>
     * 
     * @param dbPassword
     *        A temporary password that you provide when you connect to a database.
     */

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * <p>
     * A temporary password that you provide when you connect to a database.
     * </p>
     * 
     * @return A temporary password that you provide when you connect to a database.
     */

    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * <p>
     * A temporary password that you provide when you connect to a database.
     * </p>
     * 
     * @param dbPassword
     *        A temporary password that you provide when you connect to a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMResult withDbPassword(String dbPassword) {
        setDbPassword(dbPassword);
        return this;
    }

    /**
     * <p>
     * The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary password
     * fails.
     * </p>
     * 
     * @param expiration
     *        The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary
     *        password fails.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary password
     * fails.
     * </p>
     * 
     * @return The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary
     *         password fails.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary password
     * fails.
     * </p>
     * 
     * @param expiration
     *        The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary
     *        password fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMResult withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextRefreshTime
     *        Reserved for future use.
     */

    public void setNextRefreshTime(java.util.Date nextRefreshTime) {
        this.nextRefreshTime = nextRefreshTime;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public java.util.Date getNextRefreshTime() {
        return this.nextRefreshTime;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextRefreshTime
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMResult withNextRefreshTime(java.util.Date nextRefreshTime) {
        setNextRefreshTime(nextRefreshTime);
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
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getNextRefreshTime() != null)
            sb.append("NextRefreshTime: ").append(getNextRefreshTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClusterCredentialsWithIAMResult == false)
            return false;
        GetClusterCredentialsWithIAMResult other = (GetClusterCredentialsWithIAMResult) obj;
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
        if (other.getNextRefreshTime() == null ^ this.getNextRefreshTime() == null)
            return false;
        if (other.getNextRefreshTime() != null && other.getNextRefreshTime().equals(this.getNextRefreshTime()) == false)
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
        hashCode = prime * hashCode + ((getNextRefreshTime() == null) ? 0 : getNextRefreshTime().hashCode());
        return hashCode;
    }

    @Override
    public GetClusterCredentialsWithIAMResult clone() {
        try {
            return (GetClusterCredentialsWithIAMResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
