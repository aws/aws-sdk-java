/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the name of the SageMaker HyperPod cluster you want to update.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Specify the instance groups to update.
     * </p>
     */
    private java.util.List<ClusterInstanceGroupSpecification> instanceGroups;

    /**
     * <p>
     * Specify the name of the SageMaker HyperPod cluster you want to update.
     * </p>
     * 
     * @param clusterName
     *        Specify the name of the SageMaker HyperPod cluster you want to update.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * Specify the name of the SageMaker HyperPod cluster you want to update.
     * </p>
     * 
     * @return Specify the name of the SageMaker HyperPod cluster you want to update.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * Specify the name of the SageMaker HyperPod cluster you want to update.
     * </p>
     * 
     * @param clusterName
     *        Specify the name of the SageMaker HyperPod cluster you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Specify the instance groups to update.
     * </p>
     * 
     * @return Specify the instance groups to update.
     */

    public java.util.List<ClusterInstanceGroupSpecification> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * Specify the instance groups to update.
     * </p>
     * 
     * @param instanceGroups
     *        Specify the instance groups to update.
     */

    public void setInstanceGroups(java.util.Collection<ClusterInstanceGroupSpecification> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new java.util.ArrayList<ClusterInstanceGroupSpecification>(instanceGroups);
    }

    /**
     * <p>
     * Specify the instance groups to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroups(java.util.Collection)} or {@link #withInstanceGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        Specify the instance groups to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withInstanceGroups(ClusterInstanceGroupSpecification... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new java.util.ArrayList<ClusterInstanceGroupSpecification>(instanceGroups.length));
        }
        for (ClusterInstanceGroupSpecification ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the instance groups to update.
     * </p>
     * 
     * @param instanceGroups
     *        Specify the instance groups to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withInstanceGroups(java.util.Collection<ClusterInstanceGroupSpecification> instanceGroups) {
        setInstanceGroups(instanceGroups);
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
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: ").append(getInstanceGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterRequest == false)
            return false;
        UpdateClusterRequest other = (UpdateClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterRequest clone() {
        return (UpdateClusterRequest) super.clone();
    }

}
