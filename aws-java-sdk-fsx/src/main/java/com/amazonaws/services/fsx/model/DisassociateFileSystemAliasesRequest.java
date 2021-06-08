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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFileSystemAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * Specifies the file system from which to disassociate the DNS aliases.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * </p>
     */
    private java.util.List<String> aliases;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemAliasesRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Specifies the file system from which to disassociate the DNS aliases.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies the file system from which to disassociate the DNS aliases.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Specifies the file system from which to disassociate the DNS aliases.
     * </p>
     * 
     * @return Specifies the file system from which to disassociate the DNS aliases.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * Specifies the file system from which to disassociate the DNS aliases.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies the file system from which to disassociate the DNS aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemAliasesRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * </p>
     * 
     * @return An array of one or more DNS alias names to disassociate, or remove, from the file system.
     */

    public java.util.List<String> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * </p>
     * 
     * @param aliases
     *        An array of one or more DNS alias names to disassociate, or remove, from the file system.
     */

    public void setAliases(java.util.Collection<String> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<String>(aliases);
    }

    /**
     * <p>
     * An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemAliasesRequest withAliases(String... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<String>(aliases.length));
        }
        for (String ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * </p>
     * 
     * @param aliases
     *        An array of one or more DNS alias names to disassociate, or remove, from the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemAliasesRequest withAliases(java.util.Collection<String> aliases) {
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
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

        if (obj instanceof DisassociateFileSystemAliasesRequest == false)
            return false;
        DisassociateFileSystemAliasesRequest other = (DisassociateFileSystemAliasesRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateFileSystemAliasesRequest clone() {
        return (DisassociateFileSystemAliasesRequest) super.clone();
    }

}
