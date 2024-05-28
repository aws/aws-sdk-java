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
package com.amazonaws.services.eksauth.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-auth-2023-11-26/AssumeRoleForPodIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleForPodIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster for the request.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The token of the Kubernetes service account for the pod.
     * </p>
     */
    private String token;

    /**
     * <p>
     * The name of the cluster for the request.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster for the request.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster for the request.
     * </p>
     * 
     * @return The name of the cluster for the request.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster for the request.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleForPodIdentityRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The token of the Kubernetes service account for the pod.
     * </p>
     * 
     * @param token
     *        The token of the Kubernetes service account for the pod.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The token of the Kubernetes service account for the pod.
     * </p>
     * 
     * @return The token of the Kubernetes service account for the pod.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The token of the Kubernetes service account for the pod.
     * </p>
     * 
     * @param token
     *        The token of the Kubernetes service account for the pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleForPodIdentityRequest withToken(String token) {
        setToken(token);
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
        if (getToken() != null)
            sb.append("Token: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleForPodIdentityRequest == false)
            return false;
        AssumeRoleForPodIdentityRequest other = (AssumeRoleForPodIdentityRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleForPodIdentityRequest clone() {
        return (AssumeRoleForPodIdentityRequest) super.clone();
    }

}
