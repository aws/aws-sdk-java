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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the data needed by RDP clients such as the Microsoft Remote Desktop Connection to log in to the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/TemporaryCredential" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemporaryCredential implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the
     * user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be
     * automatically logged out.
     * </p>
     */
    private Integer validForInMinutes;
    /**
     * <p>
     * The instance's AWS OpsWorks Stacks ID.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The user name.
     * </p>
     * 
     * @param username
     *        The user name.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * 
     * @return The user name.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * 
     * @param username
     *        The user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemporaryCredential withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password.
     * </p>
     * 
     * @param password
     *        The password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password.
     * </p>
     * 
     * @return The password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password.
     * </p>
     * 
     * @param password
     *        The password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemporaryCredential withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the
     * user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be
     * automatically logged out.
     * </p>
     * 
     * @param validForInMinutes
     *        The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this
     *        period, the user will no longer be able to use the credentials to log in. If they are logged in at the
     *        time, they will be automatically logged out.
     */

    public void setValidForInMinutes(Integer validForInMinutes) {
        this.validForInMinutes = validForInMinutes;
    }

    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the
     * user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be
     * automatically logged out.
     * </p>
     * 
     * @return The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this
     *         period, the user will no longer be able to use the credentials to log in. If they are logged in at the
     *         time, they will be automatically logged out.
     */

    public Integer getValidForInMinutes() {
        return this.validForInMinutes;
    }

    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this period, the
     * user will no longer be able to use the credentials to log in. If they are logged in at the time, they will be
     * automatically logged out.
     * </p>
     * 
     * @param validForInMinutes
     *        The length of time (in minutes) that the grant is valid. When the grant expires, at the end of this
     *        period, the user will no longer be able to use the credentials to log in. If they are logged in at the
     *        time, they will be automatically logged out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemporaryCredential withValidForInMinutes(Integer validForInMinutes) {
        setValidForInMinutes(validForInMinutes);
        return this;
    }

    /**
     * <p>
     * The instance's AWS OpsWorks Stacks ID.
     * </p>
     * 
     * @param instanceId
     *        The instance's AWS OpsWorks Stacks ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance's AWS OpsWorks Stacks ID.
     * </p>
     * 
     * @return The instance's AWS OpsWorks Stacks ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance's AWS OpsWorks Stacks ID.
     * </p>
     * 
     * @param instanceId
     *        The instance's AWS OpsWorks Stacks ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemporaryCredential withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getValidForInMinutes() != null)
            sb.append("ValidForInMinutes: ").append(getValidForInMinutes()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemporaryCredential == false)
            return false;
        TemporaryCredential other = (TemporaryCredential) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getValidForInMinutes() == null ^ this.getValidForInMinutes() == null)
            return false;
        if (other.getValidForInMinutes() != null && other.getValidForInMinutes().equals(this.getValidForInMinutes()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getValidForInMinutes() == null) ? 0 : getValidForInMinutes().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public TemporaryCredential clone() {
        try {
            return (TemporaryCredential) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.TemporaryCredentialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
