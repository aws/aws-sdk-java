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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The name of the snapshot to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     * </p>
     */
    private String snapshotId;

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

    public UpdateSnapshotRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot to update.
     * </p>
     * 
     * @param name
     *        The name of the snapshot to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the snapshot to update.
     * </p>
     * 
     * @return The name of the snapshot to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the snapshot to update.
     * </p>
     * 
     * @param name
     *        The name of the snapshot to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     * </p>
     * 
     * @return The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot that you want to update, in the format <code>fsvolsnap-0123456789abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSnapshotRequest == false)
            return false;
        UpdateSnapshotRequest other = (UpdateSnapshotRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSnapshotRequest clone() {
        return (UpdateSnapshotRequest) super.clone();
    }

}
