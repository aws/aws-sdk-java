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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a connection alias. Connection aliases are used for cross-Region redirection. For more information, see <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
 * Redirection for Amazon WorkSpaces</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ConnectionAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connection string specified for the connection alias. The connection string must be in the form of a fully
     * qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     */
    private String connectionString;
    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * The current state of the connection alias.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The identifier of the AWS account that owns the connection alias.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConnectionAliasAssociation> associations;

    /**
     * <p>
     * The connection string specified for the connection alias. The connection string must be in the form of a fully
     * qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * 
     * @param connectionString
     *        The connection string specified for the connection alias. The connection string must be in the form of a
     *        fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     */

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * <p>
     * The connection string specified for the connection alias. The connection string must be in the form of a fully
     * qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * 
     * @return The connection string specified for the connection alias. The connection string must be in the form of a
     *         fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     */

    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * <p>
     * The connection string specified for the connection alias. The connection string must be in the form of a fully
     * qualified domain name (FQDN), such as <code>www.example.com</code>.
     * </p>
     * 
     * @param connectionString
     *        The connection string specified for the connection alias. The connection string must be in the form of a
     *        fully qualified domain name (FQDN), such as <code>www.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAlias withConnectionString(String connectionString) {
        setConnectionString(connectionString);
        return this;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @return The identifier of the connection alias.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAlias withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * The current state of the connection alias.
     * </p>
     * 
     * @param state
     *        The current state of the connection alias.
     * @see ConnectionAliasState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the connection alias.
     * </p>
     * 
     * @return The current state of the connection alias.
     * @see ConnectionAliasState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the connection alias.
     * </p>
     * 
     * @param state
     *        The current state of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionAliasState
     */

    public ConnectionAlias withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the connection alias.
     * </p>
     * 
     * @param state
     *        The current state of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionAliasState
     */

    public ConnectionAlias withState(ConnectionAliasState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the connection alias.
     * </p>
     * 
     * @param ownerAccountId
     *        The identifier of the AWS account that owns the connection alias.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the connection alias.
     * </p>
     * 
     * @return The identifier of the AWS account that owns the connection alias.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the connection alias.
     * </p>
     * 
     * @param ownerAccountId
     *        The identifier of the AWS account that owns the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAlias withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @return The association status of the connection alias.
     */

    public java.util.List<ConnectionAliasAssociation> getAssociations() {
        if (associations == null) {
            associations = new com.amazonaws.internal.SdkInternalList<ConnectionAliasAssociation>();
        }
        return associations;
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @param associations
     *        The association status of the connection alias.
     */

    public void setAssociations(java.util.Collection<ConnectionAliasAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new com.amazonaws.internal.SdkInternalList<ConnectionAliasAssociation>(associations);
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        The association status of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAlias withAssociations(ConnectionAliasAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new com.amazonaws.internal.SdkInternalList<ConnectionAliasAssociation>(associations.length));
        }
        for (ConnectionAliasAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @param associations
     *        The association status of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAlias withAssociations(java.util.Collection<ConnectionAliasAssociation> associations) {
        setAssociations(associations);
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
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionAlias == false)
            return false;
        ConnectionAlias other = (ConnectionAlias) obj;
        if (other.getConnectionString() == null ^ this.getConnectionString() == null)
            return false;
        if (other.getConnectionString() != null && other.getConnectionString().equals(this.getConnectionString()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionString() == null) ? 0 : getConnectionString().hashCode());
        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionAlias clone() {
        try {
            return (ConnectionAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.ConnectionAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
