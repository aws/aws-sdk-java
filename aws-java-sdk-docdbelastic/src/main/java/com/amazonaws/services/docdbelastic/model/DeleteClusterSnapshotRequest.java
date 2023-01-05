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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteClusterSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot that is to be deleted.
     * </p>
     */
    private String snapshotArn;

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot that is to be deleted.
     * </p>
     * 
     * @param snapshotArn
     *        The arn of the Elastic DocumentDB snapshot that is to be deleted.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot that is to be deleted.
     * </p>
     * 
     * @return The arn of the Elastic DocumentDB snapshot that is to be deleted.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot that is to be deleted.
     * </p>
     * 
     * @param snapshotArn
     *        The arn of the Elastic DocumentDB snapshot that is to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterSnapshotRequest withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
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
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterSnapshotRequest == false)
            return false;
        DeleteClusterSnapshotRequest other = (DeleteClusterSnapshotRequest) obj;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterSnapshotRequest clone() {
        return (DeleteClusterSnapshotRequest) super.clone();
    }

}
