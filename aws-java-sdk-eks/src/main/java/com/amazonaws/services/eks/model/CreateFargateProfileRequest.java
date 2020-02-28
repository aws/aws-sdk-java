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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateFargateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFargateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Fargate profile.
     * </p>
     */
    private String fargateProfileName;
    /**
     * <p>
     * The name of the Amazon EKS cluster to apply the Fargate profile to.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. The pod execution role allows Fargate infrastructure to register with your cluster as a node, and it
     * provides read access to Amazon ECR image repositories. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private String podExecutionRoleArn;
    /**
     * <p>
     * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP
     * addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace.
     * Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate
     * profile.
     * </p>
     */
    private java.util.List<FargateProfileSelector> selectors;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the Fargate profile.
     * </p>
     * 
     * @param fargateProfileName
     *        The name of the Fargate profile.
     */

    public void setFargateProfileName(String fargateProfileName) {
        this.fargateProfileName = fargateProfileName;
    }

    /**
     * <p>
     * The name of the Fargate profile.
     * </p>
     * 
     * @return The name of the Fargate profile.
     */

    public String getFargateProfileName() {
        return this.fargateProfileName;
    }

    /**
     * <p>
     * The name of the Fargate profile.
     * </p>
     * 
     * @param fargateProfileName
     *        The name of the Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withFargateProfileName(String fargateProfileName) {
        setFargateProfileName(fargateProfileName);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to apply the Fargate profile to.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster to apply the Fargate profile to.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to apply the Fargate profile to.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster to apply the Fargate profile to.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to apply the Fargate profile to.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster to apply the Fargate profile to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. The pod execution role allows Fargate infrastructure to register with your cluster as a node, and it
     * provides read access to Amazon ECR image repositories. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param podExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the
     *        Fargate profile. The pod execution role allows Fargate infrastructure to register with your cluster as a
     *        node, and it provides read access to Amazon ECR image repositories. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in
     *        the <i>Amazon EKS User Guide</i>.
     */

    public void setPodExecutionRoleArn(String podExecutionRoleArn) {
        this.podExecutionRoleArn = podExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. The pod execution role allows Fargate infrastructure to register with your cluster as a node, and it
     * provides read access to Amazon ECR image repositories. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the
     *         Fargate profile. The pod execution role allows Fargate infrastructure to register with your cluster as a
     *         node, and it provides read access to Amazon ECR image repositories. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in
     *         the <i>Amazon EKS User Guide</i>.
     */

    public String getPodExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. The pod execution role allows Fargate infrastructure to register with your cluster as a node, and it
     * provides read access to Amazon ECR image repositories. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param podExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the
     *        Fargate profile. The pod execution role allows Fargate infrastructure to register with your cluster as a
     *        node, and it provides read access to Amazon ECR image repositories. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in
     *        the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withPodExecutionRoleArn(String podExecutionRoleArn) {
        setPodExecutionRoleArn(podExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP
     * addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
     * </p>
     * 
     * @return The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned
     *         public IP addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted
     *         for this parameter.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP
     * addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
     * </p>
     * 
     * @param subnets
     *        The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public
     *        IP addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this
     *        parameter.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP
     * addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public
     *        IP addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP
     * addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
     * </p>
     * 
     * @param subnets
     *        The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public
     *        IP addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace.
     * Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate
     * profile.
     * </p>
     * 
     * @return The selectors to match for pods to use this Fargate profile. Each selector must have an associated
     *         namespace. Optionally, you can also specify labels for a namespace. You may specify up to five selectors
     *         in a Fargate profile.
     */

    public java.util.List<FargateProfileSelector> getSelectors() {
        return selectors;
    }

    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace.
     * Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate
     * profile.
     * </p>
     * 
     * @param selectors
     *        The selectors to match for pods to use this Fargate profile. Each selector must have an associated
     *        namespace. Optionally, you can also specify labels for a namespace. You may specify up to five selectors
     *        in a Fargate profile.
     */

    public void setSelectors(java.util.Collection<FargateProfileSelector> selectors) {
        if (selectors == null) {
            this.selectors = null;
            return;
        }

        this.selectors = new java.util.ArrayList<FargateProfileSelector>(selectors);
    }

    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace.
     * Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate
     * profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectors(java.util.Collection)} or {@link #withSelectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param selectors
     *        The selectors to match for pods to use this Fargate profile. Each selector must have an associated
     *        namespace. Optionally, you can also specify labels for a namespace. You may specify up to five selectors
     *        in a Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withSelectors(FargateProfileSelector... selectors) {
        if (this.selectors == null) {
            setSelectors(new java.util.ArrayList<FargateProfileSelector>(selectors.length));
        }
        for (FargateProfileSelector ele : selectors) {
            this.selectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace.
     * Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate
     * profile.
     * </p>
     * 
     * @param selectors
     *        The selectors to match for pods to use this Fargate profile. Each selector must have an associated
     *        namespace. Optionally, you can also specify labels for a namespace. You may specify up to five selectors
     *        in a Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withSelectors(java.util.Collection<FargateProfileSelector> selectors) {
        setSelectors(selectors);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     * 
     * @return The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag
     *         consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate
     *         to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate
     *        to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate
     *        to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFargateProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFargateProfileRequest clearTagsEntries() {
        this.tags = null;
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
        if (getFargateProfileName() != null)
            sb.append("FargateProfileName: ").append(getFargateProfileName()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getPodExecutionRoleArn() != null)
            sb.append("PodExecutionRoleArn: ").append(getPodExecutionRoleArn()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSelectors() != null)
            sb.append("Selectors: ").append(getSelectors()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFargateProfileRequest == false)
            return false;
        CreateFargateProfileRequest other = (CreateFargateProfileRequest) obj;
        if (other.getFargateProfileName() == null ^ this.getFargateProfileName() == null)
            return false;
        if (other.getFargateProfileName() != null && other.getFargateProfileName().equals(this.getFargateProfileName()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getPodExecutionRoleArn() == null ^ this.getPodExecutionRoleArn() == null)
            return false;
        if (other.getPodExecutionRoleArn() != null && other.getPodExecutionRoleArn().equals(this.getPodExecutionRoleArn()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSelectors() == null ^ this.getSelectors() == null)
            return false;
        if (other.getSelectors() != null && other.getSelectors().equals(this.getSelectors()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFargateProfileName() == null) ? 0 : getFargateProfileName().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getPodExecutionRoleArn() == null) ? 0 : getPodExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSelectors() == null) ? 0 : getSelectors().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFargateProfileRequest clone() {
        return (CreateFargateProfileRequest) super.clone();
    }

}
