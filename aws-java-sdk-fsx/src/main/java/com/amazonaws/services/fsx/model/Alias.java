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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A DNS alias that is associated with the file system. You can use a DNS alias to access a file system using
 * user-defined DNS names, in addition to the default DNS name that Amazon FSx assigns to the file system. For more
 * information, see <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">DNS
 * aliases</a> in the <i>FSx for Windows File Server User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/Alias" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DNS alias. The alias name has to meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     * <code>accounting.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain alphanumeric characters and the hyphen (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot start or end with a hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can start with a numeric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify
     * them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the state of the DNS alias.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;

    /**
     * <p>
     * The name of the DNS alias. The alias name has to meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     * <code>accounting.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain alphanumeric characters and the hyphen (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot start or end with a hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can start with a numeric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify
     * them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     * </p>
     * 
     * @param name
     *        The name of the DNS alias. The alias name has to meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     *        <code>accounting.example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can contain alphanumeric characters and the hyphen (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot start or end with a hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can start with a numeric.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you
     *        specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the DNS alias. The alias name has to meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     * <code>accounting.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain alphanumeric characters and the hyphen (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot start or end with a hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can start with a numeric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify
     * them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     * </p>
     * 
     * @return The name of the DNS alias. The alias name has to meet the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     *         <code>accounting.example.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can contain alphanumeric characters and the hyphen (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot start or end with a hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can start with a numeric.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you
     *         specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the DNS alias. The alias name has to meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     * <code>accounting.example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can contain alphanumeric characters and the hyphen (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot start or end with a hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can start with a numeric.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify
     * them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     * </p>
     * 
     * @param name
     *        The name of the DNS alias. The alias name has to meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Formatted as a fully-qualified domain name (FQDN), <code>hostname.domain</code>, for example,
     *        <code>accounting.example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can contain alphanumeric characters and the hyphen (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot start or end with a hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can start with a numeric.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For DNS names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you
     *        specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the state of the DNS alias.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of the DNS alias.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     *        </p>
     *        </li>
     * @see AliasLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Describes the state of the DNS alias.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the state of the DNS alias.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     *         </p>
     *         </li>
     * @see AliasLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Describes the state of the DNS alias.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of the DNS alias.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasLifecycle
     */

    public Alias withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the state of the DNS alias.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of the DNS alias.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AVAILABLE - The DNS alias is associated with an Amazon FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING - Amazon FSx is creating the DNS alias and associating it with the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED - Amazon FSx was unable to associate the DNS alias with the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING - Amazon FSx is disassociating the DNS alias from the file system and deleting it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED - Amazon FSx was unable to disassocate the DNS alias from the file system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AliasLifecycle
     */

    public Alias withLifecycle(AliasLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alias == false)
            return false;
        Alias other = (Alias) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public Alias clone() {
        try {
            return (Alias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.AliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
