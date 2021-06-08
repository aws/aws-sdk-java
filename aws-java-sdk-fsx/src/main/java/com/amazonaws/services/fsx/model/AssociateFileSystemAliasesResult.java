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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The system generated response showing the DNS aliases that Amazon FSx is attempting to associate with the file
 * system. Use the API operation to monitor the status of the aliases Amazon FSx is associating with the file system. It
 * can take up to 2.5 minutes for the alias status to change from <code>CREATING</code> to <code>AVAILABLE</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateFileSystemAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of the DNS aliases that Amazon FSx is associating with the file system.
     * </p>
     */
    private java.util.List<Alias> aliases;

    /**
     * <p>
     * An array of the DNS aliases that Amazon FSx is associating with the file system.
     * </p>
     * 
     * @return An array of the DNS aliases that Amazon FSx is associating with the file system.
     */

    public java.util.List<Alias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * An array of the DNS aliases that Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param aliases
     *        An array of the DNS aliases that Amazon FSx is associating with the file system.
     */

    public void setAliases(java.util.Collection<Alias> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<Alias>(aliases);
    }

    /**
     * <p>
     * An array of the DNS aliases that Amazon FSx is associating with the file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        An array of the DNS aliases that Amazon FSx is associating with the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemAliasesResult withAliases(Alias... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<Alias>(aliases.length));
        }
        for (Alias ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the DNS aliases that Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param aliases
     *        An array of the DNS aliases that Amazon FSx is associating with the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFileSystemAliasesResult withAliases(java.util.Collection<Alias> aliases) {
        setAliases(aliases);
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
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateFileSystemAliasesResult == false)
            return false;
        AssociateFileSystemAliasesResult other = (AssociateFileSystemAliasesResult) obj;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        return hashCode;
    }

    @Override
    public AssociateFileSystemAliasesResult clone() {
        try {
            return (AssociateFileSystemAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
