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
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#connectDirectory(ConnectDirectoryRequest) ConnectDirectory operation}.
 * <p>
 * Creates an AD Connector to connect an on-premises directory.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#connectDirectory(ConnectDirectoryRequest)
 */
public class ConnectDirectoryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     */
    private String name;

    /**
     * The NetBIOS name of the on-premises directory, such as
     * <code>CORP</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     */
    private String shortName;

    /**
     * The password for the on-premises user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String password;

    /**
     * A textual description for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     */
    private String description;

    /**
     * The size of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     */
    private String size;

    /**
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     */
    private DirectoryConnectSettings connectSettings;

    /**
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     *
     * @return The fully-qualified name of the on-premises directory, such as
     *         <code>corp.example.com</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     *
     * @param name The fully-qualified name of the on-premises directory, such as
     *         <code>corp.example.com</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     *
     * @param name The fully-qualified name of the on-premises directory, such as
     *         <code>corp.example.com</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectDirectoryRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The NetBIOS name of the on-premises directory, such as
     * <code>CORP</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     *
     * @return The NetBIOS name of the on-premises directory, such as
     *         <code>CORP</code>.
     */
    public String getShortName() {
        return shortName;
    }
    
    /**
     * The NetBIOS name of the on-premises directory, such as
     * <code>CORP</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     *
     * @param shortName The NetBIOS name of the on-premises directory, such as
     *         <code>CORP</code>.
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    /**
     * The NetBIOS name of the on-premises directory, such as
     * <code>CORP</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     *
     * @param shortName The NetBIOS name of the on-premises directory, such as
     *         <code>CORP</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectDirectoryRequest withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * The password for the on-premises user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The password for the on-premises user account.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The password for the on-premises user account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param password The password for the on-premises user account.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The password for the on-premises user account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param password The password for the on-premises user account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectDirectoryRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * A textual description for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @return A textual description for the directory.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A textual description for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description A textual description for the directory.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A textual description for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description A textual description for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectDirectoryRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The size of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @return The size of the directory.
     *
     * @see DirectorySize
     */
    public String getSize() {
        return size;
    }
    
    /**
     * The size of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The size of the directory.
     *
     * @see DirectorySize
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    /**
     * The size of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The size of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectorySize
     */
    public ConnectDirectoryRequest withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * The size of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The size of the directory.
     *
     * @see DirectorySize
     */
    public void setSize(DirectorySize size) {
        this.size = size.toString();
    }
    
    /**
     * The size of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The size of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectorySize
     */
    public ConnectDirectoryRequest withSize(DirectorySize size) {
        this.size = size.toString();
        return this;
    }

    /**
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     *
     * @return A <a>DirectoryConnectSettings</a> object that contains additional
     *         information for the operation.
     */
    public DirectoryConnectSettings getConnectSettings() {
        return connectSettings;
    }
    
    /**
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     *
     * @param connectSettings A <a>DirectoryConnectSettings</a> object that contains additional
     *         information for the operation.
     */
    public void setConnectSettings(DirectoryConnectSettings connectSettings) {
        this.connectSettings = connectSettings;
    }
    
    /**
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectSettings A <a>DirectoryConnectSettings</a> object that contains additional
     *         information for the operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectDirectoryRequest withConnectSettings(DirectoryConnectSettings connectSettings) {
        this.connectSettings = connectSettings;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getShortName() != null) sb.append("ShortName: " + getShortName() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getConnectSettings() != null) sb.append("ConnectSettings: " + getConnectSettings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getShortName() == null) ? 0 : getShortName().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getConnectSettings() == null) ? 0 : getConnectSettings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConnectDirectoryRequest == false) return false;
        ConnectDirectoryRequest other = (ConnectDirectoryRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getShortName() == null ^ this.getShortName() == null) return false;
        if (other.getShortName() != null && other.getShortName().equals(this.getShortName()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getConnectSettings() == null ^ this.getConnectSettings() == null) return false;
        if (other.getConnectSettings() != null && other.getConnectSettings().equals(this.getConnectSettings()) == false) return false; 
        return true;
    }
    
    @Override
    public ConnectDirectoryRequest clone() {
        
            return (ConnectDirectoryRequest) super.clone();
    }

}
    