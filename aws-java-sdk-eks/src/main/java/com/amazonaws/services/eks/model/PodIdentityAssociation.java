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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon EKS Pod Identity associations provide the ability to manage credentials for your applications, similar to the
 * way that Amazon EC2 instance profiles provide credentials to Amazon EC2 instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/PodIdentityAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PodIdentityAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     */
    private String serviceAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod Identity agent
     * manages credentials to assume this role for applications in the containers in the pods that use this service
     * account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String associationArn;
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource – 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length – 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length – 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp that the association was created at.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The most recent timestamp that the association was modified at
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the association is in.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     * 
     * @return The name of the cluster that the association is in.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster that the association is in.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that the association is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     * 
     * @param namespace
     *        The name of the Kubernetes namespace inside the cluster to create the association in. The service account
     *        and the pods that use the service account must be in this namespace.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     * 
     * @return The name of the Kubernetes namespace inside the cluster to create the association in. The service account
     *         and the pods that use the service account must be in this namespace.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The name of the Kubernetes namespace inside the cluster to create the association in. The service account and the
     * pods that use the service account must be in this namespace.
     * </p>
     * 
     * @param namespace
     *        The name of the Kubernetes namespace inside the cluster to create the association in. The service account
     *        and the pods that use the service account must be in this namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     * 
     * @param serviceAccount
     *        The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     */

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     * 
     * @return The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     */

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * <p>
     * The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * </p>
     * 
     * @param serviceAccount
     *        The name of the Kubernetes service account inside the cluster to associate the IAM credentials with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withServiceAccount(String serviceAccount) {
        setServiceAccount(serviceAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod Identity agent
     * manages credentials to assume this role for applications in the containers in the pods that use this service
     * account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod Identity
     *        agent manages credentials to assume this role for applications in the containers in the pods that use this
     *        service account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod Identity agent
     * manages credentials to assume this role for applications in the containers in the pods that use this service
     * account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod
     *         Identity agent manages credentials to assume this role for applications in the containers in the pods
     *         that use this service account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod Identity agent
     * manages credentials to assume this role for applications in the containers in the pods that use this service
     * account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to associate with the service account. The EKS Pod Identity
     *        agent manages credentials to assume this role for applications in the containers in the pods that use this
     *        service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the association.
     */

    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the association.
     */

    public String getAssociationArn() {
        return this.associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource – 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length – 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length – 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *         value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource – 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length – 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length – 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a
     *         prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete
     *         tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource
     *         limit.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource – 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length – 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length – 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *        value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource – 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length – 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length – 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag
     *        keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource – 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length – 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length – 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *        value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource – 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length – 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length – 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag
     *        keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PodIdentityAssociation#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation addTagsEntry(String key, String value) {
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

    public PodIdentityAssociation clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp that the association was created at.
     * </p>
     * 
     * @param createdAt
     *        The timestamp that the association was created at.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp that the association was created at.
     * </p>
     * 
     * @return The timestamp that the association was created at.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp that the association was created at.
     * </p>
     * 
     * @param createdAt
     *        The timestamp that the association was created at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The most recent timestamp that the association was modified at
     * </p>
     * 
     * @param modifiedAt
     *        The most recent timestamp that the association was modified at
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The most recent timestamp that the association was modified at
     * </p>
     * 
     * @return The most recent timestamp that the association was modified at
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The most recent timestamp that the association was modified at
     * </p>
     * 
     * @param modifiedAt
     *        The most recent timestamp that the association was modified at
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getServiceAccount() != null)
            sb.append("ServiceAccount: ").append(getServiceAccount()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PodIdentityAssociation == false)
            return false;
        PodIdentityAssociation other = (PodIdentityAssociation) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getServiceAccount() == null ^ this.getServiceAccount() == null)
            return false;
        if (other.getServiceAccount() != null && other.getServiceAccount().equals(this.getServiceAccount()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getServiceAccount() == null) ? 0 : getServiceAccount().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public PodIdentityAssociation clone() {
        try {
            return (PodIdentityAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.PodIdentityAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
