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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the user and authentication details for a database instance involved in the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RdsDbUserDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbUserDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name used in the anomalous login attempt.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The application name used in the anomalous login attempt.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The name of the database instance involved in the anomalous login attempt.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The version of the Secure Socket Layer (SSL) used for the network.
     * </p>
     */
    private String ssl;
    /**
     * <p>
     * The authentication method used by the user involved in the finding.
     * </p>
     */
    private String authMethod;

    /**
     * <p>
     * The user name used in the anomalous login attempt.
     * </p>
     * 
     * @param user
     *        The user name used in the anomalous login attempt.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user name used in the anomalous login attempt.
     * </p>
     * 
     * @return The user name used in the anomalous login attempt.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user name used in the anomalous login attempt.
     * </p>
     * 
     * @param user
     *        The user name used in the anomalous login attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbUserDetails withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The application name used in the anomalous login attempt.
     * </p>
     * 
     * @param application
     *        The application name used in the anomalous login attempt.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application name used in the anomalous login attempt.
     * </p>
     * 
     * @return The application name used in the anomalous login attempt.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application name used in the anomalous login attempt.
     * </p>
     * 
     * @param application
     *        The application name used in the anomalous login attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbUserDetails withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The name of the database instance involved in the anomalous login attempt.
     * </p>
     * 
     * @param database
     *        The name of the database instance involved in the anomalous login attempt.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database instance involved in the anomalous login attempt.
     * </p>
     * 
     * @return The name of the database instance involved in the anomalous login attempt.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database instance involved in the anomalous login attempt.
     * </p>
     * 
     * @param database
     *        The name of the database instance involved in the anomalous login attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbUserDetails withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The version of the Secure Socket Layer (SSL) used for the network.
     * </p>
     * 
     * @param ssl
     *        The version of the Secure Socket Layer (SSL) used for the network.
     */

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }

    /**
     * <p>
     * The version of the Secure Socket Layer (SSL) used for the network.
     * </p>
     * 
     * @return The version of the Secure Socket Layer (SSL) used for the network.
     */

    public String getSsl() {
        return this.ssl;
    }

    /**
     * <p>
     * The version of the Secure Socket Layer (SSL) used for the network.
     * </p>
     * 
     * @param ssl
     *        The version of the Secure Socket Layer (SSL) used for the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbUserDetails withSsl(String ssl) {
        setSsl(ssl);
        return this;
    }

    /**
     * <p>
     * The authentication method used by the user involved in the finding.
     * </p>
     * 
     * @param authMethod
     *        The authentication method used by the user involved in the finding.
     */

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    /**
     * <p>
     * The authentication method used by the user involved in the finding.
     * </p>
     * 
     * @return The authentication method used by the user involved in the finding.
     */

    public String getAuthMethod() {
        return this.authMethod;
    }

    /**
     * <p>
     * The authentication method used by the user involved in the finding.
     * </p>
     * 
     * @param authMethod
     *        The authentication method used by the user involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbUserDetails withAuthMethod(String authMethod) {
        setAuthMethod(authMethod);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getSsl() != null)
            sb.append("Ssl: ").append(getSsl()).append(",");
        if (getAuthMethod() != null)
            sb.append("AuthMethod: ").append(getAuthMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDbUserDetails == false)
            return false;
        RdsDbUserDetails other = (RdsDbUserDetails) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getSsl() == null ^ this.getSsl() == null)
            return false;
        if (other.getSsl() != null && other.getSsl().equals(this.getSsl()) == false)
            return false;
        if (other.getAuthMethod() == null ^ this.getAuthMethod() == null)
            return false;
        if (other.getAuthMethod() != null && other.getAuthMethod().equals(this.getAuthMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getSsl() == null) ? 0 : getSsl().hashCode());
        hashCode = prime * hashCode + ((getAuthMethod() == null) ? 0 : getAuthMethod().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbUserDetails clone() {
        try {
            return (RdsDbUserDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RdsDbUserDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
