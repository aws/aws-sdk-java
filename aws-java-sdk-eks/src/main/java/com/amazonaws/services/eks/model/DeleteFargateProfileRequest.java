/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFargateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the Fargate profile to delete.
     * </p>
     */
    private String fargateProfileName;

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster associated with the Fargate profile to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFargateProfileRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the Fargate profile to delete.
     * </p>
     * 
     * @param fargateProfileName
     *        The name of the Fargate profile to delete.
     */

    public void setFargateProfileName(String fargateProfileName) {
        this.fargateProfileName = fargateProfileName;
    }

    /**
     * <p>
     * The name of the Fargate profile to delete.
     * </p>
     * 
     * @return The name of the Fargate profile to delete.
     */

    public String getFargateProfileName() {
        return this.fargateProfileName;
    }

    /**
     * <p>
     * The name of the Fargate profile to delete.
     * </p>
     * 
     * @param fargateProfileName
     *        The name of the Fargate profile to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFargateProfileRequest withFargateProfileName(String fargateProfileName) {
        setFargateProfileName(fargateProfileName);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getFargateProfileName() != null)
            sb.append("FargateProfileName: ").append(getFargateProfileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFargateProfileRequest == false)
            return false;
        DeleteFargateProfileRequest other = (DeleteFargateProfileRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getFargateProfileName() == null ^ this.getFargateProfileName() == null)
            return false;
        if (other.getFargateProfileName() != null && other.getFargateProfileName().equals(this.getFargateProfileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getFargateProfileName() == null) ? 0 : getFargateProfileName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFargateProfileRequest clone() {
        return (DeleteFargateProfileRequest) super.clone();
    }

}
