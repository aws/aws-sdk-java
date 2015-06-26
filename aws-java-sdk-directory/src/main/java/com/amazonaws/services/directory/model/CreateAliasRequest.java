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
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#createAlias(CreateAliasRequest) CreateAlias operation}.
 * <p>
 * Creates an alias for a directory and assigns the alias to the
 * directory. The alias is used to construct the access URL for the
 * directory, such as <code>http://<alias>.awsapps.com</code> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b> After an alias has been created, it cannot be
 * deleted or reused, so this operation should only be used when
 * absolutely necessary.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#createAlias(CreateAliasRequest)
 */
public class CreateAliasRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to create the alias for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The requested alias. <p>The alias must be unique amongst all aliases
     * in AWS. This operation will throw an
     * <code>EntityAlreadyExistsException</code> if this alias already
     * exists.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     */
    private String alias;

    /**
     * The identifier of the directory to create the alias for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to create the alias for.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to create the alias for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to create the alias for.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to create the alias for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to create the alias for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAliasRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The requested alias. <p>The alias must be unique amongst all aliases
     * in AWS. This operation will throw an
     * <code>EntityAlreadyExistsException</code> if this alias already
     * exists.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @return The requested alias. <p>The alias must be unique amongst all aliases
     *         in AWS. This operation will throw an
     *         <code>EntityAlreadyExistsException</code> if this alias already
     *         exists.
     */
    public String getAlias() {
        return alias;
    }
    
    /**
     * The requested alias. <p>The alias must be unique amongst all aliases
     * in AWS. This operation will throw an
     * <code>EntityAlreadyExistsException</code> if this alias already
     * exists.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias The requested alias. <p>The alias must be unique amongst all aliases
     *         in AWS. This operation will throw an
     *         <code>EntityAlreadyExistsException</code> if this alias already
     *         exists.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    /**
     * The requested alias. <p>The alias must be unique amongst all aliases
     * in AWS. This operation will throw an
     * <code>EntityAlreadyExistsException</code> if this alias already
     * exists.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias The requested alias. <p>The alias must be unique amongst all aliases
     *         in AWS. This operation will throw an
     *         <code>EntityAlreadyExistsException</code> if this alias already
     *         exists.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAliasRequest withAlias(String alias) {
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

        if (obj instanceof CreateAliasRequest == false) return false;
        CreateAliasRequest other = (CreateAliasRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getAlias() == null ^ this.getAlias() == null) return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateAliasRequest clone() {
        
            return (CreateAliasRequest) super.clone();
    }

}
    