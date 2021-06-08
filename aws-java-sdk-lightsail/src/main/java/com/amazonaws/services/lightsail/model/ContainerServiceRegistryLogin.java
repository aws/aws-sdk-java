/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the login information for the container image registry of an Amazon Lightsail account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceRegistryLogin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceRegistryLogin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container service registry username to use to push container images to the container image registry of a
     * Lightsail account.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The container service registry password to use to push container images to the container image registry of a
     * Lightsail account
     * </p>
     */
    private String password;
    /**
     * <p>
     * The timestamp of when the container image registry username and password expire.
     * </p>
     * <p>
     * The log in credentials expire 12 hours after they are created, at which point you will need to create a new set
     * of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     * </p>
     */
    private java.util.Date expiresAt;
    /**
     * <p>
     * The address to use to push container images to the container image registry of a Lightsail account.
     * </p>
     */
    private String registry;

    /**
     * <p>
     * The container service registry username to use to push container images to the container image registry of a
     * Lightsail account.
     * </p>
     * 
     * @param username
     *        The container service registry username to use to push container images to the container image registry of
     *        a Lightsail account.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The container service registry username to use to push container images to the container image registry of a
     * Lightsail account.
     * </p>
     * 
     * @return The container service registry username to use to push container images to the container image registry
     *         of a Lightsail account.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The container service registry username to use to push container images to the container image registry of a
     * Lightsail account.
     * </p>
     * 
     * @param username
     *        The container service registry username to use to push container images to the container image registry of
     *        a Lightsail account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceRegistryLogin withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The container service registry password to use to push container images to the container image registry of a
     * Lightsail account
     * </p>
     * 
     * @param password
     *        The container service registry password to use to push container images to the container image registry of
     *        a Lightsail account
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The container service registry password to use to push container images to the container image registry of a
     * Lightsail account
     * </p>
     * 
     * @return The container service registry password to use to push container images to the container image registry
     *         of a Lightsail account
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The container service registry password to use to push container images to the container image registry of a
     * Lightsail account
     * </p>
     * 
     * @param password
     *        The container service registry password to use to push container images to the container image registry of
     *        a Lightsail account
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceRegistryLogin withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the container image registry username and password expire.
     * </p>
     * <p>
     * The log in credentials expire 12 hours after they are created, at which point you will need to create a new set
     * of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     * </p>
     * 
     * @param expiresAt
     *        The timestamp of when the container image registry username and password expire.</p>
     *        <p>
     *        The log in credentials expire 12 hours after they are created, at which point you will need to create a
     *        new set of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The timestamp of when the container image registry username and password expire.
     * </p>
     * <p>
     * The log in credentials expire 12 hours after they are created, at which point you will need to create a new set
     * of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     * </p>
     * 
     * @return The timestamp of when the container image registry username and password expire.</p>
     *         <p>
     *         The log in credentials expire 12 hours after they are created, at which point you will need to create a
     *         new set of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * The timestamp of when the container image registry username and password expire.
     * </p>
     * <p>
     * The log in credentials expire 12 hours after they are created, at which point you will need to create a new set
     * of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     * </p>
     * 
     * @param expiresAt
     *        The timestamp of when the container image registry username and password expire.</p>
     *        <p>
     *        The log in credentials expire 12 hours after they are created, at which point you will need to create a
     *        new set of log in credentials using the <code>CreateContainerServiceRegistryLogin</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceRegistryLogin withExpiresAt(java.util.Date expiresAt) {
        setExpiresAt(expiresAt);
        return this;
    }

    /**
     * <p>
     * The address to use to push container images to the container image registry of a Lightsail account.
     * </p>
     * 
     * @param registry
     *        The address to use to push container images to the container image registry of a Lightsail account.
     */

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    /**
     * <p>
     * The address to use to push container images to the container image registry of a Lightsail account.
     * </p>
     * 
     * @return The address to use to push container images to the container image registry of a Lightsail account.
     */

    public String getRegistry() {
        return this.registry;
    }

    /**
     * <p>
     * The address to use to push container images to the container image registry of a Lightsail account.
     * </p>
     * 
     * @param registry
     *        The address to use to push container images to the container image registry of a Lightsail account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceRegistryLogin withRegistry(String registry) {
        setRegistry(registry);
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
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt()).append(",");
        if (getRegistry() != null)
            sb.append("Registry: ").append(getRegistry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServiceRegistryLogin == false)
            return false;
        ContainerServiceRegistryLogin other = (ContainerServiceRegistryLogin) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getRegistry() == null ^ this.getRegistry() == null)
            return false;
        if (other.getRegistry() != null && other.getRegistry().equals(this.getRegistry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getRegistry() == null) ? 0 : getRegistry().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServiceRegistryLogin clone() {
        try {
            return (ContainerServiceRegistryLogin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceRegistryLoginMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
