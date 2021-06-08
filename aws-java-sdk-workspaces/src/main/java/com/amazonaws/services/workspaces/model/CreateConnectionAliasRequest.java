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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectionAlias" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A connection string in the form of a fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * <important>
     * <p>
     * After you create a connection string, it is always associated to your AWS account. You cannot recreate the same
     * connection string with a different account, even if you delete all instances of it from the original account. The
     * connection string is globally reserved for your account.
     * </p>
     * </important>
     */
    private String connectionString;
    /**
     * <p>
     * The tags to associate with the connection alias.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A connection string in the form of a fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * <important>
     * <p>
     * After you create a connection string, it is always associated to your AWS account. You cannot recreate the same
     * connection string with a different account, even if you delete all instances of it from the original account. The
     * connection string is globally reserved for your account.
     * </p>
     * </important>
     * 
     * @param connectionString
     *        A connection string in the form of a fully qualified domain name (FQDN), such as
     *        <code>www.example.com</code>.</p> <important>
     *        <p>
     *        After you create a connection string, it is always associated to your AWS account. You cannot recreate the
     *        same connection string with a different account, even if you delete all instances of it from the original
     *        account. The connection string is globally reserved for your account.
     *        </p>
     */

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * <p>
     * A connection string in the form of a fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * <important>
     * <p>
     * After you create a connection string, it is always associated to your AWS account. You cannot recreate the same
     * connection string with a different account, even if you delete all instances of it from the original account. The
     * connection string is globally reserved for your account.
     * </p>
     * </important>
     * 
     * @return A connection string in the form of a fully qualified domain name (FQDN), such as
     *         <code>www.example.com</code>.</p> <important>
     *         <p>
     *         After you create a connection string, it is always associated to your AWS account. You cannot recreate
     *         the same connection string with a different account, even if you delete all instances of it from the
     *         original account. The connection string is globally reserved for your account.
     *         </p>
     */

    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * <p>
     * A connection string in the form of a fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * <important>
     * <p>
     * After you create a connection string, it is always associated to your AWS account. You cannot recreate the same
     * connection string with a different account, even if you delete all instances of it from the original account. The
     * connection string is globally reserved for your account.
     * </p>
     * </important>
     * 
     * @param connectionString
     *        A connection string in the form of a fully qualified domain name (FQDN), such as
     *        <code>www.example.com</code>.</p> <important>
     *        <p>
     *        After you create a connection string, it is always associated to your AWS account. You cannot recreate the
     *        same connection string with a different account, even if you delete all instances of it from the original
     *        account. The connection string is globally reserved for your account.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAliasRequest withConnectionString(String connectionString) {
        setConnectionString(connectionString);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the connection alias.
     * </p>
     * 
     * @return The tags to associate with the connection alias.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the connection alias.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the connection alias.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to associate with the connection alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAliasRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to associate with the connection alias.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAliasRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getConnectionString() != null)
            sb.append("ConnectionString: ").append(getConnectionString()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionAliasRequest == false)
            return false;
        CreateConnectionAliasRequest other = (CreateConnectionAliasRequest) obj;
        if (other.getConnectionString() == null ^ this.getConnectionString() == null)
            return false;
        if (other.getConnectionString() != null && other.getConnectionString().equals(this.getConnectionString()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionString() == null) ? 0 : getConnectionString().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionAliasRequest clone() {
        return (CreateConnectionAliasRequest) super.clone();
    }

}
