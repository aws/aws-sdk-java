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
 * Describes a connection alias association that is used for cross-Region redirection. For more information, see <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
 * Redirection for Amazon WorkSpaces</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ConnectionAliasAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionAliasAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * The identifier of the AWS account that associated the connection alias with a directory.
     * </p>
     */
    private String associatedAccountId;
    /**
     * <p>
     * The identifier of the directory associated with a connection alias.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     */
    private String connectionIdentifier;

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @param associationStatus
     *        The association status of the connection alias.
     * @see AssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @return The association status of the connection alias.
     * @see AssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @param associationStatus
     *        The association status of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public ConnectionAliasAssociation withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * The association status of the connection alias.
     * </p>
     * 
     * @param associationStatus
     *        The association status of the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public ConnectionAliasAssociation withAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS account that associated the connection alias with a directory.
     * </p>
     * 
     * @param associatedAccountId
     *        The identifier of the AWS account that associated the connection alias with a directory.
     */

    public void setAssociatedAccountId(String associatedAccountId) {
        this.associatedAccountId = associatedAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that associated the connection alias with a directory.
     * </p>
     * 
     * @return The identifier of the AWS account that associated the connection alias with a directory.
     */

    public String getAssociatedAccountId() {
        return this.associatedAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that associated the connection alias with a directory.
     * </p>
     * 
     * @param associatedAccountId
     *        The identifier of the AWS account that associated the connection alias with a directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAliasAssociation withAssociatedAccountId(String associatedAccountId) {
        setAssociatedAccountId(associatedAccountId);
        return this;
    }

    /**
     * <p>
     * The identifier of the directory associated with a connection alias.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory associated with a connection alias.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the directory associated with a connection alias.
     * </p>
     * 
     * @return The identifier of the directory associated with a connection alias.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the directory associated with a connection alias.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory associated with a connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAliasAssociation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     * 
     * @param connectionIdentifier
     *        The identifier of the connection alias association. You use the connection identifier in the DNS TXT
     *        record when you're configuring your DNS routing policies.
     */

    public void setConnectionIdentifier(String connectionIdentifier) {
        this.connectionIdentifier = connectionIdentifier;
    }

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     * 
     * @return The identifier of the connection alias association. You use the connection identifier in the DNS TXT
     *         record when you're configuring your DNS routing policies.
     */

    public String getConnectionIdentifier() {
        return this.connectionIdentifier;
    }

    /**
     * <p>
     * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when
     * you're configuring your DNS routing policies.
     * </p>
     * 
     * @param connectionIdentifier
     *        The identifier of the connection alias association. You use the connection identifier in the DNS TXT
     *        record when you're configuring your DNS routing policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionAliasAssociation withConnectionIdentifier(String connectionIdentifier) {
        setConnectionIdentifier(connectionIdentifier);
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
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getAssociatedAccountId() != null)
            sb.append("AssociatedAccountId: ").append(getAssociatedAccountId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getConnectionIdentifier() != null)
            sb.append("ConnectionIdentifier: ").append(getConnectionIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionAliasAssociation == false)
            return false;
        ConnectionAliasAssociation other = (ConnectionAliasAssociation) obj;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getAssociatedAccountId() == null ^ this.getAssociatedAccountId() == null)
            return false;
        if (other.getAssociatedAccountId() != null && other.getAssociatedAccountId().equals(this.getAssociatedAccountId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getConnectionIdentifier() == null ^ this.getConnectionIdentifier() == null)
            return false;
        if (other.getConnectionIdentifier() != null && other.getConnectionIdentifier().equals(this.getConnectionIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getAssociatedAccountId() == null) ? 0 : getAssociatedAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getConnectionIdentifier() == null) ? 0 : getConnectionIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionAliasAssociation clone() {
        try {
            return (ConnectionAliasAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.ConnectionAliasAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
