/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directory.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#createComputer(CreateComputerRequest) CreateComputer operation}.
 * <p>
 * Creates a computer account in the specified directory, and joins the
 * computer to the directory.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#createComputer(CreateComputerRequest)
 */
public class CreateComputerRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to create the computer account in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The name of the computer account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     */
    private String computerName;

    /**
     * A one-time password that is used to join the computer to the
     * directory. You should generate a random, strong password to use for
     * this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String password;

    /**
     * The fully-qualified distinguished name of the organizational unit to
     * place the computer account in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String organizationalUnitDistinguishedName;

    /**
     * An array of <a>Attribute</a> objects that contain any LDAP attributes
     * to apply to the computer account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> computerAttributes;

    /**
     * The identifier of the directory to create the computer account in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to create the computer account in.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to create the computer account in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to create the computer account in.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to create the computer account in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to create the computer account in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateComputerRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The name of the computer account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @return The name of the computer account.
     */
    public String getComputerName() {
        return computerName;
    }
    
    /**
     * The name of the computer account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @param computerName The name of the computer account.
     */
    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
    
    /**
     * The name of the computer account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @param computerName The name of the computer account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateComputerRequest withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * A one-time password that is used to join the computer to the
     * directory. You should generate a random, strong password to use for
     * this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return A one-time password that is used to join the computer to the
     *         directory. You should generate a random, strong password to use for
     *         this parameter.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * A one-time password that is used to join the computer to the
     * directory. You should generate a random, strong password to use for
     * this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param password A one-time password that is used to join the computer to the
     *         directory. You should generate a random, strong password to use for
     *         this parameter.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * A one-time password that is used to join the computer to the
     * directory. You should generate a random, strong password to use for
     * this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param password A one-time password that is used to join the computer to the
     *         directory. You should generate a random, strong password to use for
     *         this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateComputerRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * The fully-qualified distinguished name of the organizational unit to
     * place the computer account in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return The fully-qualified distinguished name of the organizational unit to
     *         place the computer account in.
     */
    public String getOrganizationalUnitDistinguishedName() {
        return organizationalUnitDistinguishedName;
    }
    
    /**
     * The fully-qualified distinguished name of the organizational unit to
     * place the computer account in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param organizationalUnitDistinguishedName The fully-qualified distinguished name of the organizational unit to
     *         place the computer account in.
     */
    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }
    
    /**
     * The fully-qualified distinguished name of the organizational unit to
     * place the computer account in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param organizationalUnitDistinguishedName The fully-qualified distinguished name of the organizational unit to
     *         place the computer account in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateComputerRequest withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        return this;
    }

    /**
     * An array of <a>Attribute</a> objects that contain any LDAP attributes
     * to apply to the computer account.
     *
     * @return An array of <a>Attribute</a> objects that contain any LDAP attributes
     *         to apply to the computer account.
     */
    public java.util.List<Attribute> getComputerAttributes() {
        if (computerAttributes == null) {
              computerAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>();
              computerAttributes.setAutoConstruct(true);
        }
        return computerAttributes;
    }
    
    /**
     * An array of <a>Attribute</a> objects that contain any LDAP attributes
     * to apply to the computer account.
     *
     * @param computerAttributes An array of <a>Attribute</a> objects that contain any LDAP attributes
     *         to apply to the computer account.
     */
    public void setComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> computerAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>(computerAttributes.size());
        computerAttributesCopy.addAll(computerAttributes);
        this.computerAttributes = computerAttributesCopy;
    }
    
    /**
     * An array of <a>Attribute</a> objects that contain any LDAP attributes
     * to apply to the computer account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setComputerAttributes(java.util.Collection)} or
     * {@link #withComputerAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computerAttributes An array of <a>Attribute</a> objects that contain any LDAP attributes
     *         to apply to the computer account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateComputerRequest withComputerAttributes(Attribute... computerAttributes) {
        if (getComputerAttributes() == null) setComputerAttributes(new java.util.ArrayList<Attribute>(computerAttributes.length));
        for (Attribute value : computerAttributes) {
            getComputerAttributes().add(value);
        }
        return this;
    }
    
    /**
     * An array of <a>Attribute</a> objects that contain any LDAP attributes
     * to apply to the computer account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computerAttributes An array of <a>Attribute</a> objects that contain any LDAP attributes
     *         to apply to the computer account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateComputerRequest withComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> computerAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>(computerAttributes.size());
            computerAttributesCopy.addAll(computerAttributes);
            this.computerAttributes = computerAttributesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getComputerName() != null) sb.append("ComputerName: " + getComputerName() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (getOrganizationalUnitDistinguishedName() != null) sb.append("OrganizationalUnitDistinguishedName: " + getOrganizationalUnitDistinguishedName() + ",");
        if (getComputerAttributes() != null) sb.append("ComputerAttributes: " + getComputerAttributes() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateComputerRequest == false) return false;
        CreateComputerRequest other = (CreateComputerRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getComputerName() == null ^ this.getComputerName() == null) return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.getOrganizationalUnitDistinguishedName() == null ^ this.getOrganizationalUnitDistinguishedName() == null) return false;
        if (other.getOrganizationalUnitDistinguishedName() != null && other.getOrganizationalUnitDistinguishedName().equals(this.getOrganizationalUnitDistinguishedName()) == false) return false; 
        if (other.getComputerAttributes() == null ^ this.getComputerAttributes() == null) return false;
        if (other.getComputerAttributes() != null && other.getComputerAttributes().equals(this.getComputerAttributes()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateComputerRequest clone() {
        
            return (CreateComputerRequest) super.clone();
    }

}
    