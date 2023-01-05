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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteAddon" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAddonRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to delete the add-on from.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any settings
     * for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     * </p>
     */
    private Boolean preserve;

    /**
     * <p>
     * The name of the cluster to delete the add-on from.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to delete the add-on from.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to delete the add-on from.
     * </p>
     * 
     * @return The name of the cluster to delete the add-on from.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to delete the add-on from.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to delete the add-on from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAddonRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *        </a>.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @return The name of the add-on. The name must match one of the names returned by <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *         </a>.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on. The name must match one of the names returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code> </a>.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on. The name must match one of the names returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_ListAddons.html"> <code>ListAddons</code>
     *        </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAddonRequest withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any settings
     * for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     * </p>
     * 
     * @param preserve
     *        Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any
     *        settings for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     */

    public void setPreserve(Boolean preserve) {
        this.preserve = preserve;
    }

    /**
     * <p>
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any settings
     * for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     * </p>
     * 
     * @return Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any
     *         settings for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     */

    public Boolean getPreserve() {
        return this.preserve;
    }

    /**
     * <p>
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any settings
     * for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     * </p>
     * 
     * @param preserve
     *        Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any
     *        settings for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAddonRequest withPreserve(Boolean preserve) {
        setPreserve(preserve);
        return this;
    }

    /**
     * <p>
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any settings
     * for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     * </p>
     * 
     * @return Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any
     *         settings for the add-on. If an IAM account is associated with the add-on, it isn't removed.
     */

    public Boolean isPreserve() {
        return this.preserve;
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getPreserve() != null)
            sb.append("Preserve: ").append(getPreserve());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAddonRequest == false)
            return false;
        DeleteAddonRequest other = (DeleteAddonRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getPreserve() == null ^ this.getPreserve() == null)
            return false;
        if (other.getPreserve() != null && other.getPreserve().equals(this.getPreserve()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getPreserve() == null) ? 0 : getPreserve().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAddonRequest clone() {
        return (DeleteAddonRequest) super.clone();
    }

}
