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
 * The response object for <code>DescribeFileSystemAliases</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of one or more DNS aliases currently associated with the specified file system.
     * </p>
     */
    private java.util.List<Alias> aliases;
    /**
     * <p>
     * Present if there are more DNS aliases than returned in the response (String). You can use the
     * <code>NextToken</code> value in a later request to fetch additional descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of one or more DNS aliases currently associated with the specified file system.
     * </p>
     * 
     * @return An array of one or more DNS aliases currently associated with the specified file system.
     */

    public java.util.List<Alias> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * An array of one or more DNS aliases currently associated with the specified file system.
     * </p>
     * 
     * @param aliases
     *        An array of one or more DNS aliases currently associated with the specified file system.
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
     * An array of one or more DNS aliases currently associated with the specified file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        An array of one or more DNS aliases currently associated with the specified file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesResult withAliases(Alias... aliases) {
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
     * An array of one or more DNS aliases currently associated with the specified file system.
     * </p>
     * 
     * @param aliases
     *        An array of one or more DNS aliases currently associated with the specified file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesResult withAliases(java.util.Collection<Alias> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * Present if there are more DNS aliases than returned in the response (String). You can use the
     * <code>NextToken</code> value in a later request to fetch additional descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more DNS aliases than returned in the response (String). You can use the
     *        <code>NextToken</code> value in a later request to fetch additional descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Present if there are more DNS aliases than returned in the response (String). You can use the
     * <code>NextToken</code> value in a later request to fetch additional descriptions.
     * </p>
     * 
     * @return Present if there are more DNS aliases than returned in the response (String). You can use the
     *         <code>NextToken</code> value in a later request to fetch additional descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Present if there are more DNS aliases than returned in the response (String). You can use the
     * <code>NextToken</code> value in a later request to fetch additional descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more DNS aliases than returned in the response (String). You can use the
     *        <code>NextToken</code> value in a later request to fetch additional descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("Aliases: ").append(getAliases()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemAliasesResult == false)
            return false;
        DescribeFileSystemAliasesResult other = (DescribeFileSystemAliasesResult) obj;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemAliasesResult clone() {
        try {
            return (DescribeFileSystemAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
