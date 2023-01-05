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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteNamespace"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the snapshot to be created before the namespace is deleted.
     * </p>
     */
    private String finalSnapshotName;
    /**
     * <p>
     * How long to retain the final snapshot.
     * </p>
     */
    private Integer finalSnapshotRetentionPeriod;
    /**
     * <p>
     * The name of the namespace to delete.
     * </p>
     */
    private String namespaceName;

    /**
     * <p>
     * The name of the snapshot to be created before the namespace is deleted.
     * </p>
     * 
     * @param finalSnapshotName
     *        The name of the snapshot to be created before the namespace is deleted.
     */

    public void setFinalSnapshotName(String finalSnapshotName) {
        this.finalSnapshotName = finalSnapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to be created before the namespace is deleted.
     * </p>
     * 
     * @return The name of the snapshot to be created before the namespace is deleted.
     */

    public String getFinalSnapshotName() {
        return this.finalSnapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to be created before the namespace is deleted.
     * </p>
     * 
     * @param finalSnapshotName
     *        The name of the snapshot to be created before the namespace is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNamespaceRequest withFinalSnapshotName(String finalSnapshotName) {
        setFinalSnapshotName(finalSnapshotName);
        return this;
    }

    /**
     * <p>
     * How long to retain the final snapshot.
     * </p>
     * 
     * @param finalSnapshotRetentionPeriod
     *        How long to retain the final snapshot.
     */

    public void setFinalSnapshotRetentionPeriod(Integer finalSnapshotRetentionPeriod) {
        this.finalSnapshotRetentionPeriod = finalSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * How long to retain the final snapshot.
     * </p>
     * 
     * @return How long to retain the final snapshot.
     */

    public Integer getFinalSnapshotRetentionPeriod() {
        return this.finalSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * How long to retain the final snapshot.
     * </p>
     * 
     * @param finalSnapshotRetentionPeriod
     *        How long to retain the final snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNamespaceRequest withFinalSnapshotRetentionPeriod(Integer finalSnapshotRetentionPeriod) {
        setFinalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the namespace to delete.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to delete.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to delete.
     * </p>
     * 
     * @return The name of the namespace to delete.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to delete.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNamespaceRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
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
        if (getFinalSnapshotName() != null)
            sb.append("FinalSnapshotName: ").append(getFinalSnapshotName()).append(",");
        if (getFinalSnapshotRetentionPeriod() != null)
            sb.append("FinalSnapshotRetentionPeriod: ").append(getFinalSnapshotRetentionPeriod()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNamespaceRequest == false)
            return false;
        DeleteNamespaceRequest other = (DeleteNamespaceRequest) obj;
        if (other.getFinalSnapshotName() == null ^ this.getFinalSnapshotName() == null)
            return false;
        if (other.getFinalSnapshotName() != null && other.getFinalSnapshotName().equals(this.getFinalSnapshotName()) == false)
            return false;
        if (other.getFinalSnapshotRetentionPeriod() == null ^ this.getFinalSnapshotRetentionPeriod() == null)
            return false;
        if (other.getFinalSnapshotRetentionPeriod() != null && other.getFinalSnapshotRetentionPeriod().equals(this.getFinalSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinalSnapshotName() == null) ? 0 : getFinalSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getFinalSnapshotRetentionPeriod() == null) ? 0 : getFinalSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNamespaceRequest clone() {
        return (DeleteNamespaceRequest) super.clone();
    }

}
