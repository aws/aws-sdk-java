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
 * An access entry allows an IAM principal (user or role) to access your cluster. Access entries can replace the need to
 * maintain the <code>aws-auth</code> <code>ConfigMap</code> for authentication. For more information about access
 * entries, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html">Access entries</a> in the
 * <i>Amazon EKS User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AccessEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN, the access
     * entry isn't automatically deleted. We recommend that you delete the access entry with an ARN for an IAM principal
     * that you delete. If you don't delete the access entry and ever recreate the IAM principal, even if it has the
     * same ARN, the access entry won't work. This is because even though the ARN is the same for the recreated IAM
     * principal, the <code>roleID</code> or <code>userID</code> (you can see this with the Security Token Service
     * <code>GetCallerIdentity</code> API) is different for the recreated IAM principal than it was for the original IAM
     * principal. Even though you don't see the IAM principal's <code>roleID</code> or <code>userID</code> for an access
     * entry, Amazon EKS stores it with the access entry.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     * <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access to
     * cluster objects.
     * </p>
     */
    private java.util.List<String> kubernetesGroups;
    /**
     * <p>
     * The ARN of the access entry.
     * </p>
     */
    private String accessEntryArn;
    /**
     * <p>
     * The Unix epoch timestamp at object creation.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The <code>name</code> of a user that can authenticate to your cluster.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The type of the access entry.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @return The name of your cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of your cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN, the access
     * entry isn't automatically deleted. We recommend that you delete the access entry with an ARN for an IAM principal
     * that you delete. If you don't delete the access entry and ever recreate the IAM principal, even if it has the
     * same ARN, the access entry won't work. This is because even though the ARN is the same for the recreated IAM
     * principal, the <code>roleID</code> or <code>userID</code> (you can see this with the Security Token Service
     * <code>GetCallerIdentity</code> API) is different for the recreated IAM principal than it was for the original IAM
     * principal. Even though you don't see the IAM principal's <code>roleID</code> or <code>userID</code> for an access
     * entry, Amazon EKS stores it with the access entry.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN, the
     *        access entry isn't automatically deleted. We recommend that you delete the access entry with an ARN for an
     *        IAM principal that you delete. If you don't delete the access entry and ever recreate the IAM principal,
     *        even if it has the same ARN, the access entry won't work. This is because even though the ARN is the same
     *        for the recreated IAM principal, the <code>roleID</code> or <code>userID</code> (you can see this with the
     *        Security Token Service <code>GetCallerIdentity</code> API) is different for the recreated IAM principal
     *        than it was for the original IAM principal. Even though you don't see the IAM principal's
     *        <code>roleID</code> or <code>userID</code> for an access entry, Amazon EKS stores it with the access
     *        entry.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN, the access
     * entry isn't automatically deleted. We recommend that you delete the access entry with an ARN for an IAM principal
     * that you delete. If you don't delete the access entry and ever recreate the IAM principal, even if it has the
     * same ARN, the access entry won't work. This is because even though the ARN is the same for the recreated IAM
     * principal, the <code>roleID</code> or <code>userID</code> (you can see this with the Security Token Service
     * <code>GetCallerIdentity</code> API) is different for the recreated IAM principal than it was for the original IAM
     * principal. Even though you don't see the IAM principal's <code>roleID</code> or <code>userID</code> for an access
     * entry, Amazon EKS stores it with the access entry.
     * </p>
     * 
     * @return The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN,
     *         the access entry isn't automatically deleted. We recommend that you delete the access entry with an ARN
     *         for an IAM principal that you delete. If you don't delete the access entry and ever recreate the IAM
     *         principal, even if it has the same ARN, the access entry won't work. This is because even though the ARN
     *         is the same for the recreated IAM principal, the <code>roleID</code> or <code>userID</code> (you can see
     *         this with the Security Token Service <code>GetCallerIdentity</code> API) is different for the recreated
     *         IAM principal than it was for the original IAM principal. Even though you don't see the IAM principal's
     *         <code>roleID</code> or <code>userID</code> for an access entry, Amazon EKS stores it with the access
     *         entry.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN, the access
     * entry isn't automatically deleted. We recommend that you delete the access entry with an ARN for an IAM principal
     * that you delete. If you don't delete the access entry and ever recreate the IAM principal, even if it has the
     * same ARN, the access entry won't work. This is because even though the ARN is the same for the recreated IAM
     * principal, the <code>roleID</code> or <code>userID</code> (you can see this with the Security Token Service
     * <code>GetCallerIdentity</code> API) is different for the recreated IAM principal than it was for the original IAM
     * principal. Even though you don't see the IAM principal's <code>roleID</code> or <code>userID</code> for an access
     * entry, Amazon EKS stores it with the access entry.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM principal for the access entry. If you ever delete the IAM principal with this ARN, the
     *        access entry isn't automatically deleted. We recommend that you delete the access entry with an ARN for an
     *        IAM principal that you delete. If you don't delete the access entry and ever recreate the IAM principal,
     *        even if it has the same ARN, the access entry won't work. This is because even though the ARN is the same
     *        for the recreated IAM principal, the <code>roleID</code> or <code>userID</code> (you can see this with the
     *        Security Token Service <code>GetCallerIdentity</code> API) is different for the recreated IAM principal
     *        than it was for the original IAM principal. Even though you don't see the IAM principal's
     *        <code>roleID</code> or <code>userID</code> for an access entry, Amazon EKS stores it with the access
     *        entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     * <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access to
     * cluster objects.
     * </p>
     * 
     * @return A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     *         <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access
     *         to cluster objects.
     */

    public java.util.List<String> getKubernetesGroups() {
        return kubernetesGroups;
    }

    /**
     * <p>
     * A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     * <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access to
     * cluster objects.
     * </p>
     * 
     * @param kubernetesGroups
     *        A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     *        <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access
     *        to cluster objects.
     */

    public void setKubernetesGroups(java.util.Collection<String> kubernetesGroups) {
        if (kubernetesGroups == null) {
            this.kubernetesGroups = null;
            return;
        }

        this.kubernetesGroups = new java.util.ArrayList<String>(kubernetesGroups);
    }

    /**
     * <p>
     * A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     * <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access to
     * cluster objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKubernetesGroups(java.util.Collection)} or {@link #withKubernetesGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param kubernetesGroups
     *        A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     *        <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access
     *        to cluster objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withKubernetesGroups(String... kubernetesGroups) {
        if (this.kubernetesGroups == null) {
            setKubernetesGroups(new java.util.ArrayList<String>(kubernetesGroups.length));
        }
        for (String ele : kubernetesGroups) {
            this.kubernetesGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     * <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access to
     * cluster objects.
     * </p>
     * 
     * @param kubernetesGroups
     *        A <code>name</code> that you've specified in a Kubernetes <code>RoleBinding</code> or
     *        <code>ClusterRoleBinding</code> object so that Kubernetes authorizes the <code>principalARN</code> access
     *        to cluster objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withKubernetesGroups(java.util.Collection<String> kubernetesGroups) {
        setKubernetesGroups(kubernetesGroups);
        return this;
    }

    /**
     * <p>
     * The ARN of the access entry.
     * </p>
     * 
     * @param accessEntryArn
     *        The ARN of the access entry.
     */

    public void setAccessEntryArn(String accessEntryArn) {
        this.accessEntryArn = accessEntryArn;
    }

    /**
     * <p>
     * The ARN of the access entry.
     * </p>
     * 
     * @return The ARN of the access entry.
     */

    public String getAccessEntryArn() {
        return this.accessEntryArn;
    }

    /**
     * <p>
     * The ARN of the access entry.
     * </p>
     * 
     * @param accessEntryArn
     *        The ARN of the access entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withAccessEntryArn(String accessEntryArn) {
        setAccessEntryArn(accessEntryArn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp at object creation.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp at object creation.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp at object creation.
     * </p>
     * 
     * @return The Unix epoch timestamp at object creation.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp at object creation.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp at object creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     * 
     * @param modifiedAt
     *        The Unix epoch timestamp for the last modification to the object.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     * 
     * @return The Unix epoch timestamp for the last modification to the object.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     * 
     * @param modifiedAt
     *        The Unix epoch timestamp for the last modification to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * 
     * @return Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *         value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * 
     * @param tags
     *        Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *        value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata that assists with categorization and organization. Each tag consists of a key and an optional value. You
     * define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * </p>
     * 
     * @param tags
     *        Metadata that assists with categorization and organization. Each tag consists of a key and an optional
     *        value. You define both. Tags don't propagate to any other cluster or Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AccessEntry#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry addTagsEntry(String key, String value) {
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

    public AccessEntry clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The <code>name</code> of a user that can authenticate to your cluster.
     * </p>
     * 
     * @param username
     *        The <code>name</code> of a user that can authenticate to your cluster.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The <code>name</code> of a user that can authenticate to your cluster.
     * </p>
     * 
     * @return The <code>name</code> of a user that can authenticate to your cluster.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The <code>name</code> of a user that can authenticate to your cluster.
     * </p>
     * 
     * @param username
     *        The <code>name</code> of a user that can authenticate to your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The type of the access entry.
     * </p>
     * 
     * @param type
     *        The type of the access entry.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the access entry.
     * </p>
     * 
     * @return The type of the access entry.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the access entry.
     * </p>
     * 
     * @param type
     *        The type of the access entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessEntry withType(String type) {
        setType(type);
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getKubernetesGroups() != null)
            sb.append("KubernetesGroups: ").append(getKubernetesGroups()).append(",");
        if (getAccessEntryArn() != null)
            sb.append("AccessEntryArn: ").append(getAccessEntryArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessEntry == false)
            return false;
        AccessEntry other = (AccessEntry) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getKubernetesGroups() == null ^ this.getKubernetesGroups() == null)
            return false;
        if (other.getKubernetesGroups() != null && other.getKubernetesGroups().equals(this.getKubernetesGroups()) == false)
            return false;
        if (other.getAccessEntryArn() == null ^ this.getAccessEntryArn() == null)
            return false;
        if (other.getAccessEntryArn() != null && other.getAccessEntryArn().equals(this.getAccessEntryArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getKubernetesGroups() == null) ? 0 : getKubernetesGroups().hashCode());
        hashCode = prime * hashCode + ((getAccessEntryArn() == null) ? 0 : getAccessEntryArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AccessEntry clone() {
        try {
            return (AccessEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AccessEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
