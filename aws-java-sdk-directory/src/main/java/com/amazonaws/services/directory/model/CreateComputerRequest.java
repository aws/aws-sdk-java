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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>CreateComputer</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateComputer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComputerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory in which to create the computer account.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the computer account.
     * </p>
     */
    private String computerName;
    /**
     * <p>
     * A one-time password that is used to join the computer to the directory. You should generate a random, strong
     * password to use for this parameter.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The fully-qualified distinguished name of the organizational unit to place the computer account in.
     * </p>
     */
    private String organizationalUnitDistinguishedName;
    /**
     * <p>
     * An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> computerAttributes;

    /**
     * <p>
     * The identifier of the directory in which to create the computer account.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory in which to create the computer account.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory in which to create the computer account.
     * </p>
     * 
     * @return The identifier of the directory in which to create the computer account.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory in which to create the computer account.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory in which to create the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the computer account.
     * </p>
     * 
     * @param computerName
     *        The name of the computer account.
     */

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    /**
     * <p>
     * The name of the computer account.
     * </p>
     * 
     * @return The name of the computer account.
     */

    public String getComputerName() {
        return this.computerName;
    }

    /**
     * <p>
     * The name of the computer account.
     * </p>
     * 
     * @param computerName
     *        The name of the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerRequest withComputerName(String computerName) {
        setComputerName(computerName);
        return this;
    }

    /**
     * <p>
     * A one-time password that is used to join the computer to the directory. You should generate a random, strong
     * password to use for this parameter.
     * </p>
     * 
     * @param password
     *        A one-time password that is used to join the computer to the directory. You should generate a random,
     *        strong password to use for this parameter.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * A one-time password that is used to join the computer to the directory. You should generate a random, strong
     * password to use for this parameter.
     * </p>
     * 
     * @return A one-time password that is used to join the computer to the directory. You should generate a random,
     *         strong password to use for this parameter.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * A one-time password that is used to join the computer to the directory. You should generate a random, strong
     * password to use for this parameter.
     * </p>
     * 
     * @param password
     *        A one-time password that is used to join the computer to the directory. You should generate a random,
     *        strong password to use for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The fully-qualified distinguished name of the organizational unit to place the computer account in.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The fully-qualified distinguished name of the organizational unit to place the computer account in.
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The fully-qualified distinguished name of the organizational unit to place the computer account in.
     * </p>
     * 
     * @return The fully-qualified distinguished name of the organizational unit to place the computer account in.
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The fully-qualified distinguished name of the organizational unit to place the computer account in.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The fully-qualified distinguished name of the organizational unit to place the computer account in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerRequest withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
        return this;
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * </p>
     * 
     * @return An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     */

    public java.util.List<Attribute> getComputerAttributes() {
        if (computerAttributes == null) {
            computerAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return computerAttributes;
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * </p>
     * 
     * @param computerAttributes
     *        An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     */

    public void setComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
            return;
        }

        this.computerAttributes = new com.amazonaws.internal.SdkInternalList<Attribute>(computerAttributes);
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputerAttributes(java.util.Collection)} or {@link #withComputerAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param computerAttributes
     *        An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerRequest withComputerAttributes(Attribute... computerAttributes) {
        if (this.computerAttributes == null) {
            setComputerAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(computerAttributes.length));
        }
        for (Attribute ele : computerAttributes) {
            this.computerAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * </p>
     * 
     * @param computerAttributes
     *        An array of <a>Attribute</a> objects that contain any LDAP attributes to apply to the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerRequest withComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        setComputerAttributes(computerAttributes);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getComputerName() != null)
            sb.append("ComputerName: ").append(getComputerName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: ").append(getOrganizationalUnitDistinguishedName()).append(",");
        if (getComputerAttributes() != null)
            sb.append("ComputerAttributes: ").append(getComputerAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateComputerRequest == false)
            return false;
        CreateComputerRequest other = (CreateComputerRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getComputerName() == null ^ this.getComputerName() == null)
            return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() == null ^ this.getOrganizationalUnitDistinguishedName() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() != null
                && other.getOrganizationalUnitDistinguishedName().equals(this.getOrganizationalUnitDistinguishedName()) == false)
            return false;
        if (other.getComputerAttributes() == null ^ this.getComputerAttributes() == null)
            return false;
        if (other.getComputerAttributes() != null && other.getComputerAttributes().equals(this.getComputerAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedName() == null) ? 0 : getOrganizationalUnitDistinguishedName().hashCode());
        hashCode = prime * hashCode + ((getComputerAttributes() == null) ? 0 : getComputerAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreateComputerRequest clone() {
        return (CreateComputerRequest) super.clone();
    }

}
