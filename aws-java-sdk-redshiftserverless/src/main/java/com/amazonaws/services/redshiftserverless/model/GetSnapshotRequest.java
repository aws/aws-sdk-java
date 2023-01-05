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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The owner Amazon Web Services account of a snapshot shared with another user.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to return.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * The name of the snapshot to return.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * The owner Amazon Web Services account of a snapshot shared with another user.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services account of a snapshot shared with another user.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services account of a snapshot shared with another user.
     * </p>
     * 
     * @return The owner Amazon Web Services account of a snapshot shared with another user.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services account of a snapshot shared with another user.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services account of a snapshot shared with another user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to return.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) of the snapshot to return.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to return.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot to return.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to return.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) of the snapshot to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotRequest withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot to return.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to return.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to return.
     * </p>
     * 
     * @return The name of the snapshot to return.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to return.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotRequest withSnapshotName(String snapshotName) {
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
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
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

        if (obj instanceof GetSnapshotRequest == false)
            return false;
        GetSnapshotRequest other = (GetSnapshotRequest) obj;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
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

        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public GetSnapshotRequest clone() {
        return (GetSnapshotRequest) super.clone();
    }

}
