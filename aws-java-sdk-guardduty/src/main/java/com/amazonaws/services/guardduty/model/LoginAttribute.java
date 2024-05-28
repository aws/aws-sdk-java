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
 * Information about the login attempts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/LoginAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoginAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the user name which attempted to log in.
     * </p>
     */
    private String user;
    /**
     * <p>
     * Indicates the application name used to attempt log in.
     * </p>
     */
    private String application;
    /**
     * <p>
     * Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     * instance.
     * </p>
     */
    private Integer failedLoginAttempts;
    /**
     * <p>
     * Represents the sum of successful connections (a correct combination of login attributes) made to the database
     * instance by the actor.
     * </p>
     */
    private Integer successfulLoginAttempts;

    /**
     * <p>
     * Indicates the user name which attempted to log in.
     * </p>
     * 
     * @param user
     *        Indicates the user name which attempted to log in.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * Indicates the user name which attempted to log in.
     * </p>
     * 
     * @return Indicates the user name which attempted to log in.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * Indicates the user name which attempted to log in.
     * </p>
     * 
     * @param user
     *        Indicates the user name which attempted to log in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAttribute withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * Indicates the application name used to attempt log in.
     * </p>
     * 
     * @param application
     *        Indicates the application name used to attempt log in.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * Indicates the application name used to attempt log in.
     * </p>
     * 
     * @return Indicates the application name used to attempt log in.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * Indicates the application name used to attempt log in.
     * </p>
     * 
     * @param application
     *        Indicates the application name used to attempt log in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAttribute withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     * instance.
     * </p>
     * 
     * @param failedLoginAttempts
     *        Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     *        instance.
     */

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    /**
     * <p>
     * Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     * instance.
     * </p>
     * 
     * @return Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     *         instance.
     */

    public Integer getFailedLoginAttempts() {
        return this.failedLoginAttempts;
    }

    /**
     * <p>
     * Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     * instance.
     * </p>
     * 
     * @param failedLoginAttempts
     *        Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAttribute withFailedLoginAttempts(Integer failedLoginAttempts) {
        setFailedLoginAttempts(failedLoginAttempts);
        return this;
    }

    /**
     * <p>
     * Represents the sum of successful connections (a correct combination of login attributes) made to the database
     * instance by the actor.
     * </p>
     * 
     * @param successfulLoginAttempts
     *        Represents the sum of successful connections (a correct combination of login attributes) made to the
     *        database instance by the actor.
     */

    public void setSuccessfulLoginAttempts(Integer successfulLoginAttempts) {
        this.successfulLoginAttempts = successfulLoginAttempts;
    }

    /**
     * <p>
     * Represents the sum of successful connections (a correct combination of login attributes) made to the database
     * instance by the actor.
     * </p>
     * 
     * @return Represents the sum of successful connections (a correct combination of login attributes) made to the
     *         database instance by the actor.
     */

    public Integer getSuccessfulLoginAttempts() {
        return this.successfulLoginAttempts;
    }

    /**
     * <p>
     * Represents the sum of successful connections (a correct combination of login attributes) made to the database
     * instance by the actor.
     * </p>
     * 
     * @param successfulLoginAttempts
     *        Represents the sum of successful connections (a correct combination of login attributes) made to the
     *        database instance by the actor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoginAttribute withSuccessfulLoginAttempts(Integer successfulLoginAttempts) {
        setSuccessfulLoginAttempts(successfulLoginAttempts);
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
        if (getFailedLoginAttempts() != null)
            sb.append("FailedLoginAttempts: ").append(getFailedLoginAttempts()).append(",");
        if (getSuccessfulLoginAttempts() != null)
            sb.append("SuccessfulLoginAttempts: ").append(getSuccessfulLoginAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoginAttribute == false)
            return false;
        LoginAttribute other = (LoginAttribute) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getFailedLoginAttempts() == null ^ this.getFailedLoginAttempts() == null)
            return false;
        if (other.getFailedLoginAttempts() != null && other.getFailedLoginAttempts().equals(this.getFailedLoginAttempts()) == false)
            return false;
        if (other.getSuccessfulLoginAttempts() == null ^ this.getSuccessfulLoginAttempts() == null)
            return false;
        if (other.getSuccessfulLoginAttempts() != null && other.getSuccessfulLoginAttempts().equals(this.getSuccessfulLoginAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getFailedLoginAttempts() == null) ? 0 : getFailedLoginAttempts().hashCode());
        hashCode = prime * hashCode + ((getSuccessfulLoginAttempts() == null) ? 0 : getSuccessfulLoginAttempts().hashCode());
        return hashCode;
    }

    @Override
    public LoginAttribute clone() {
        try {
            return (LoginAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.LoginAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
