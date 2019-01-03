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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The result of the <code>DeleteSnapshotCopyGrant</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotCopyGrant" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSnapshotCopyGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the snapshot copy grant to delete.
     * </p>
     */
    private String snapshotCopyGrantName;

    /**
     * <p>
     * The name of the snapshot copy grant to delete.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant to delete.
     */

    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant to delete.
     * </p>
     * 
     * @return The name of the snapshot copy grant to delete.
     */

    public String getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant to delete.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSnapshotCopyGrantRequest withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        setSnapshotCopyGrantName(snapshotCopyGrantName);
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
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: ").append(getSnapshotCopyGrantName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotCopyGrantRequest == false)
            return false;
        DeleteSnapshotCopyGrantRequest other = (DeleteSnapshotCopyGrantRequest) obj;
        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSnapshotCopyGrantRequest clone() {
        return (DeleteSnapshotCopyGrantRequest) super.clone();
    }

}
