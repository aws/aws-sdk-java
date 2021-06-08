/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An Amazon EKS add-on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Addon" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Addon implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the add-on.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The status of the add-on.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The version of the add-on.
     * </p>
     */
    private String addonVersion;
    /**
     * <p>
     * An object that represents the health of the add-on.
     * </p>
     */
    private AddonHealth health;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the add-on.
     * </p>
     */
    private String addonArn;
    /**
     * <p>
     * The date and time that the add-on was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time that the add-on was last modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by the
     * add-on.
     * </p>
     */
    private String serviceAccountRoleArn;
    /**
     * <p>
     * The metadata that you apply to the add-on to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Add-on tags do not propagate to any other resources
     * associated with the cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @return The name of the add-on.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @param status
     *        The status of the add-on.
     * @see AddonStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @return The status of the add-on.
     * @see AddonStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @param status
     *        The status of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddonStatus
     */

    public Addon withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @param status
     *        The status of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddonStatus
     */

    public Addon withStatus(AddonStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The version of the add-on.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on.
     */

    public void setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
    }

    /**
     * <p>
     * The version of the add-on.
     * </p>
     * 
     * @return The version of the add-on.
     */

    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * <p>
     * The version of the add-on.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withAddonVersion(String addonVersion) {
        setAddonVersion(addonVersion);
        return this;
    }

    /**
     * <p>
     * An object that represents the health of the add-on.
     * </p>
     * 
     * @param health
     *        An object that represents the health of the add-on.
     */

    public void setHealth(AddonHealth health) {
        this.health = health;
    }

    /**
     * <p>
     * An object that represents the health of the add-on.
     * </p>
     * 
     * @return An object that represents the health of the add-on.
     */

    public AddonHealth getHealth() {
        return this.health;
    }

    /**
     * <p>
     * An object that represents the health of the add-on.
     * </p>
     * 
     * @param health
     *        An object that represents the health of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withHealth(AddonHealth health) {
        setHealth(health);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the add-on.
     * </p>
     * 
     * @param addonArn
     *        The Amazon Resource Name (ARN) of the add-on.
     */

    public void setAddonArn(String addonArn) {
        this.addonArn = addonArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the add-on.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the add-on.
     */

    public String getAddonArn() {
        return this.addonArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the add-on.
     * </p>
     * 
     * @param addonArn
     *        The Amazon Resource Name (ARN) of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withAddonArn(String addonArn) {
        setAddonArn(addonArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the add-on was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the add-on was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the add-on was created.
     * </p>
     * 
     * @return The date and time that the add-on was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the add-on was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the add-on was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time that the add-on was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time that the add-on was last modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The date and time that the add-on was last modified.
     * </p>
     * 
     * @return The date and time that the add-on was last modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The date and time that the add-on was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        The date and time that the add-on was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by the
     * add-on.
     * </p>
     * 
     * @param serviceAccountRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by the
     *        add-on.
     */

    public void setServiceAccountRoleArn(String serviceAccountRoleArn) {
        this.serviceAccountRoleArn = serviceAccountRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by the
     * add-on.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by
     *         the add-on.
     */

    public String getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by the
     * add-on.
     * </p>
     * 
     * @param serviceAccountRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that is bound to the Kubernetes service account used by the
     *        add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withServiceAccountRoleArn(String serviceAccountRoleArn) {
        setServiceAccountRoleArn(serviceAccountRoleArn);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the add-on to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Add-on tags do not propagate to any other resources
     * associated with the cluster.
     * </p>
     * 
     * @return The metadata that you apply to the add-on to assist with categorization and organization. Each tag
     *         consists of a key and an optional value, both of which you define. Add-on tags do not propagate to any
     *         other resources associated with the cluster.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the add-on to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Add-on tags do not propagate to any other resources
     * associated with the cluster.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the add-on to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define. Add-on tags do not propagate to any
     *        other resources associated with the cluster.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata that you apply to the add-on to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define. Add-on tags do not propagate to any other resources
     * associated with the cluster.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the add-on to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define. Add-on tags do not propagate to any
     *        other resources associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Addon withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Addon#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Addon addTagsEntry(String key, String value) {
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

    public Addon clearTagsEntries() {
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
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAddonVersion() != null)
            sb.append("AddonVersion: ").append(getAddonVersion()).append(",");
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth()).append(",");
        if (getAddonArn() != null)
            sb.append("AddonArn: ").append(getAddonArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getServiceAccountRoleArn() != null)
            sb.append("ServiceAccountRoleArn: ").append(getServiceAccountRoleArn()).append(",");
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

        if (obj instanceof Addon == false)
            return false;
        Addon other = (Addon) obj;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAddonVersion() == null ^ this.getAddonVersion() == null)
            return false;
        if (other.getAddonVersion() != null && other.getAddonVersion().equals(this.getAddonVersion()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
            return false;
        if (other.getAddonArn() == null ^ this.getAddonArn() == null)
            return false;
        if (other.getAddonArn() != null && other.getAddonArn().equals(this.getAddonArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getServiceAccountRoleArn() == null ^ this.getServiceAccountRoleArn() == null)
            return false;
        if (other.getServiceAccountRoleArn() != null && other.getServiceAccountRoleArn().equals(this.getServiceAccountRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAddonVersion() == null) ? 0 : getAddonVersion().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        hashCode = prime * hashCode + ((getAddonArn() == null) ? 0 : getAddonArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountRoleArn() == null) ? 0 : getServiceAccountRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Addon clone() {
        try {
            return (Addon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
