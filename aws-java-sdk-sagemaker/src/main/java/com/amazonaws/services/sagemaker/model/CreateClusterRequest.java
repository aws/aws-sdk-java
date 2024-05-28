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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the new SageMaker HyperPod cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The instance groups to be created in the SageMaker HyperPod cluster.
     * </p>
     */
    private java.util.List<ClusterInstanceGroupSpecification> instanceGroups;

    private VpcConfig vpcConfig;
    /**
     * <p>
     * Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add tags to
     * your cluster in the same way you add them in other Amazon Web Services services that support tagging. To learn
     * more about tagging Amazon Web Services resources in general, see <a
     * href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services Resources
     * User Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the new SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterName
     *        The name for the new SageMaker HyperPod cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name for the new SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The name for the new SageMaker HyperPod cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name for the new SageMaker HyperPod cluster.
     * </p>
     * 
     * @param clusterName
     *        The name for the new SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The instance groups to be created in the SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The instance groups to be created in the SageMaker HyperPod cluster.
     */

    public java.util.List<ClusterInstanceGroupSpecification> getInstanceGroups() {
        return instanceGroups;
    }

    /**
     * <p>
     * The instance groups to be created in the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceGroups
     *        The instance groups to be created in the SageMaker HyperPod cluster.
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
     * The instance groups to be created in the SageMaker HyperPod cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGroups(java.util.Collection)} or {@link #withInstanceGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        The instance groups to be created in the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withInstanceGroups(ClusterInstanceGroupSpecification... instanceGroups) {
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
     * The instance groups to be created in the SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceGroups
     *        The instance groups to be created in the SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withInstanceGroups(java.util.Collection<ClusterInstanceGroupSpecification> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * @param vpcConfig
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * @return
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * @param vpcConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add tags to
     * your cluster in the same way you add them in other Amazon Web Services services that support tagging. To learn
     * more about tagging Amazon Web Services resources in general, see <a
     * href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services Resources
     * User Guide</a>.
     * </p>
     * 
     * @return Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add
     *         tags to your cluster in the same way you add them in other Amazon Web Services services that support
     *         tagging. To learn more about tagging Amazon Web Services resources in general, see <a
     *         href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services
     *         Resources User Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add tags to
     * your cluster in the same way you add them in other Amazon Web Services services that support tagging. To learn
     * more about tagging Amazon Web Services resources in general, see <a
     * href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services Resources
     * User Guide</a>.
     * </p>
     * 
     * @param tags
     *        Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add
     *        tags to your cluster in the same way you add them in other Amazon Web Services services that support
     *        tagging. To learn more about tagging Amazon Web Services resources in general, see <a
     *        href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services
     *        Resources User Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add tags to
     * your cluster in the same way you add them in other Amazon Web Services services that support tagging. To learn
     * more about tagging Amazon Web Services resources in general, see <a
     * href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services Resources
     * User Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add
     *        tags to your cluster in the same way you add them in other Amazon Web Services services that support
     *        tagging. To learn more about tagging Amazon Web Services resources in general, see <a
     *        href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services
     *        Resources User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add tags to
     * your cluster in the same way you add them in other Amazon Web Services services that support tagging. To learn
     * more about tagging Amazon Web Services resources in general, see <a
     * href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services Resources
     * User Guide</a>.
     * </p>
     * 
     * @param tags
     *        Custom tags for managing the SageMaker HyperPod cluster as an Amazon Web Services resource. You can add
     *        tags to your cluster in the same way you add them in other Amazon Web Services services that support
     *        tagging. To learn more about tagging Amazon Web Services resources in general, see <a
     *        href="https://docs.aws.amazon.com/tag-editor/latest/userguide/tagging.html">Tagging Amazon Web Services
     *        Resources User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("InstanceGroups: ").append(getInstanceGroups()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
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

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
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

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
