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
 * Contains the inputs for the <a>CreateAlias</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to create the alias.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The requested alias.
     * </p>
     * <p>
     * The alias must be unique amongst all aliases in AWS. This operation throws an
     * <code>EntityAlreadyExistsException</code> error if the alias already exists.
     * </p>
     */
    private String alias;

    /**
     * <p>
     * The identifier of the directory for which to create the alias.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to create the alias.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to create the alias.
     * </p>
     * 
     * @return The identifier of the directory for which to create the alias.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to create the alias.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to create the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The requested alias.
     * </p>
     * <p>
     * The alias must be unique amongst all aliases in AWS. This operation throws an
     * <code>EntityAlreadyExistsException</code> error if the alias already exists.
     * </p>
     * 
     * @param alias
     *        The requested alias.</p>
     *        <p>
     *        The alias must be unique amongst all aliases in AWS. This operation throws an
     *        <code>EntityAlreadyExistsException</code> error if the alias already exists.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The requested alias.
     * </p>
     * <p>
     * The alias must be unique amongst all aliases in AWS. This operation throws an
     * <code>EntityAlreadyExistsException</code> error if the alias already exists.
     * </p>
     * 
     * @return The requested alias.</p>
     *         <p>
     *         The alias must be unique amongst all aliases in AWS. This operation throws an
     *         <code>EntityAlreadyExistsException</code> error if the alias already exists.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The requested alias.
     * </p>
     * <p>
     * The alias must be unique amongst all aliases in AWS. This operation throws an
     * <code>EntityAlreadyExistsException</code> error if the alias already exists.
     * </p>
     * 
     * @param alias
     *        The requested alias.</p>
     *        <p>
     *        The alias must be unique amongst all aliases in AWS. This operation throws an
     *        <code>EntityAlreadyExistsException</code> error if the alias already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withAlias(String alias) {
        setAlias(alias);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
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
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }

}
