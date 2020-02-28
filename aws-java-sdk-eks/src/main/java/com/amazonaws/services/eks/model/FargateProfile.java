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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Fargate profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/FargateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FargateProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Fargate profile.
     * </p>
     */
    private String fargateProfileName;
    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Fargate profile.
     * </p>
     */
    private String fargateProfileArn;
    /**
     * <p>
     * The name of the Amazon EKS cluster that the Fargate profile belongs to.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the Fargate profile was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private String podExecutionRoleArn;
    /**
     * <p>
     * The IDs of subnets to launch pods into.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile.
     * </p>
     */
    private java.util.List<FargateProfileSelector> selectors;
    /**
     * <p>
     * The current status of the Fargate profile.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of
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

    public FargateProfile withFargateProfileName(String fargateProfileName) {
        setFargateProfileName(fargateProfileName);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Fargate profile.
     * </p>
     * 
     * @param fargateProfileArn
     *        The full Amazon Resource Name (ARN) of the Fargate profile.
     */

    public void setFargateProfileArn(String fargateProfileArn) {
        this.fargateProfileArn = fargateProfileArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Fargate profile.
     * </p>
     * 
     * @return The full Amazon Resource Name (ARN) of the Fargate profile.
     */

    public String getFargateProfileArn() {
        return this.fargateProfileArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the Fargate profile.
     * </p>
     * 
     * @param fargateProfileArn
     *        The full Amazon Resource Name (ARN) of the Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withFargateProfileArn(String fargateProfileArn) {
        setFargateProfileArn(fargateProfileArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that the Fargate profile belongs to.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that the Fargate profile belongs to.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that the Fargate profile belongs to.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster that the Fargate profile belongs to.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster that the Fargate profile belongs to.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon EKS cluster that the Fargate profile belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the Fargate profile was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the Fargate profile was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the Fargate profile was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the Fargate profile was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the Fargate profile was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the Fargate profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param podExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the
     *        Fargate profile. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in
     *        the <i>Amazon EKS User Guide</i>.
     */

    public void setPodExecutionRoleArn(String podExecutionRoleArn) {
        this.podExecutionRoleArn = podExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the
     *         Fargate profile. For more information, see <a
     *         href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in
     *         the <i>Amazon EKS User Guide</i>.
     */

    public String getPodExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate
     * profile. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param podExecutionRoleArn
     *        The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the
     *        Fargate profile. For more information, see <a
     *        href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution Role</a> in
     *        the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withPodExecutionRoleArn(String podExecutionRoleArn) {
        setPodExecutionRoleArn(podExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * The IDs of subnets to launch pods into.
     * </p>
     * 
     * @return The IDs of subnets to launch pods into.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of subnets to launch pods into.
     * </p>
     * 
     * @param subnets
     *        The IDs of subnets to launch pods into.
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
     * The IDs of subnets to launch pods into.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of subnets to launch pods into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withSubnets(String... subnets) {
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
     * The IDs of subnets to launch pods into.
     * </p>
     * 
     * @param subnets
     *        The IDs of subnets to launch pods into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile.
     * </p>
     * 
     * @return The selectors to match for pods to use this Fargate profile.
     */

    public java.util.List<FargateProfileSelector> getSelectors() {
        return selectors;
    }

    /**
     * <p>
     * The selectors to match for pods to use this Fargate profile.
     * </p>
     * 
     * @param selectors
     *        The selectors to match for pods to use this Fargate profile.
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
     * The selectors to match for pods to use this Fargate profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectors(java.util.Collection)} or {@link #withSelectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param selectors
     *        The selectors to match for pods to use this Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withSelectors(FargateProfileSelector... selectors) {
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
     * The selectors to match for pods to use this Fargate profile.
     * </p>
     * 
     * @param selectors
     *        The selectors to match for pods to use this Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withSelectors(java.util.Collection<FargateProfileSelector> selectors) {
        setSelectors(selectors);
        return this;
    }

    /**
     * <p>
     * The current status of the Fargate profile.
     * </p>
     * 
     * @param status
     *        The current status of the Fargate profile.
     * @see FargateProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Fargate profile.
     * </p>
     * 
     * @return The current status of the Fargate profile.
     * @see FargateProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Fargate profile.
     * </p>
     * 
     * @param status
     *        The current status of the Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FargateProfileStatus
     */

    public FargateProfile withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Fargate profile.
     * </p>
     * 
     * @param status
     *        The current status of the Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FargateProfileStatus
     */

    public FargateProfile withStatus(FargateProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     * 
     * @return The metadata applied to the Fargate profile to assist with categorization and organization. Each tag
     *         consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate
     *         to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     * 
     * @param tags
     *        The metadata applied to the Fargate profile to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate
     *        to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of
     * a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other
     * resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * </p>
     * 
     * @param tags
     *        The metadata applied to the Fargate profile to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate
     *        to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see FargateProfile#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfile addTagsEntry(String key, String value) {
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

    public FargateProfile clearTagsEntries() {
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
        if (getFargateProfileArn() != null)
            sb.append("FargateProfileArn: ").append(getFargateProfileArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPodExecutionRoleArn() != null)
            sb.append("PodExecutionRoleArn: ").append(getPodExecutionRoleArn()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSelectors() != null)
            sb.append("Selectors: ").append(getSelectors()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof FargateProfile == false)
            return false;
        FargateProfile other = (FargateProfile) obj;
        if (other.getFargateProfileName() == null ^ this.getFargateProfileName() == null)
            return false;
        if (other.getFargateProfileName() != null && other.getFargateProfileName().equals(this.getFargateProfileName()) == false)
            return false;
        if (other.getFargateProfileArn() == null ^ this.getFargateProfileArn() == null)
            return false;
        if (other.getFargateProfileArn() != null && other.getFargateProfileArn().equals(this.getFargateProfileArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getFargateProfileArn() == null) ? 0 : getFargateProfileArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPodExecutionRoleArn() == null) ? 0 : getPodExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSelectors() == null) ? 0 : getSelectors().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public FargateProfile clone() {
        try {
            return (FargateProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.FargateProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
