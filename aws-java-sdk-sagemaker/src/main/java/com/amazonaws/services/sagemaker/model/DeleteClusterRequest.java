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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     * </p>
     */
    private String clusterName;

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     * </p>
     * 
     * @param clusterName
     *        The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     * </p>
     * 
     * @return The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     * </p>
     * 
     * @param clusterName
     *        The string name or the Amazon Resource Name (ARN) of the SageMaker HyperPod cluster to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
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
            sb.append("ClusterName: ").append(getClusterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterRequest == false)
            return false;
        DeleteClusterRequest other = (DeleteClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterRequest clone() {
        return (DeleteClusterRequest) super.clone();
    }

}
