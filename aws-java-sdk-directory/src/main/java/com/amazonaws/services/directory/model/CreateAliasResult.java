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

/**
 * <p>
 * Contains the results of the CreateAlias operation.
 * </p>
 */
public class CreateAliasResult implements Serializable, Cloneable {

    /**
     * The identifier of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The alias for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     */
    private String alias;

    /**
     * The identifier of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAliasResult withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The alias for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @return The alias for the directory.
     */
    public String getAlias() {
        return alias;
    }
    
    /**
     * The alias for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias The alias for the directory.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    /**
     * The alias for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias The alias for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAliasResult withAlias(String alias) {
        this.alias = alias;
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
        if (getAlias() != null) sb.append("Alias: " + getAlias() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAliasResult == false) return false;
        CreateAliasResult other = (CreateAliasResult)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getAlias() == null ^ this.getAlias() == null) return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateAliasResult clone() {
        try {
            return (CreateAliasResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    