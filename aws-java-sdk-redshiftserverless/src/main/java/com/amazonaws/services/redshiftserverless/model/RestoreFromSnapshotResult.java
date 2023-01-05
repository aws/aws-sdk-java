/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreFromSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Namespace namespace;
    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot that was restored.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The name of the snapshot used to restore the namespace.
     * </p>
     */
    private String snapshotName;

    /**
     * @param namespace
     */

    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    /**
     * @return
     */

    public Namespace getNamespace() {
        return this.namespace;
    }

    /**
     * @param namespace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotResult withNamespace(Namespace namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot that was restored.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services; account of the snapshot that was restored.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot that was restored.
     * </p>
     * 
     * @return The owner Amazon Web Services; account of the snapshot that was restored.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot that was restored.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services; account of the snapshot that was restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot used to restore the namespace.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot used to restore the namespace.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot used to restore the namespace.
     * </p>
     * 
     * @return The name of the snapshot used to restore the namespace.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot used to restore the namespace.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot used to restore the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotResult withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreFromSnapshotResult == false)
            return false;
        RestoreFromSnapshotResult other = (RestoreFromSnapshotResult) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public RestoreFromSnapshotResult clone() {
        try {
            return (RestoreFromSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
