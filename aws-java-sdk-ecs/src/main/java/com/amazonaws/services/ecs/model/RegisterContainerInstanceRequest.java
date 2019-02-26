/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RegisterContainerInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterContainerInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This document can be found by running the
     * following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     */
    private String instanceIdentityDocument;
    /**
     * <p>
     * The instance identity document signature for the EC2 instance to register. This signature can be found by running
     * the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     */
    private String instanceIdentityDocumentSignature;
    /**
     * <p>
     * The resources available on the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Resource> totalResources;
    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     */
    private VersionInfo versionInfo;
    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> attributes;
    /**
     * <p>
     * The devices that are available on the container instance. The only supported device type is a GPU.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformDevice> platformDevices;
    /**
     * <p>
     * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container
     *        instance. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container
     *         instance. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container
     *        instance. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This document can be found by running the
     * following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     * 
     * @param instanceIdentityDocument
     *        The instance identity document for the EC2 instance to register. This document can be found by running the
     *        following command from the instance:
     *        <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     */

    public void setInstanceIdentityDocument(String instanceIdentityDocument) {
        this.instanceIdentityDocument = instanceIdentityDocument;
    }

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This document can be found by running the
     * following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     * 
     * @return The instance identity document for the EC2 instance to register. This document can be found by running
     *         the following command from the instance:
     *         <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     */

    public String getInstanceIdentityDocument() {
        return this.instanceIdentityDocument;
    }

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This document can be found by running the
     * following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     * 
     * @param instanceIdentityDocument
     *        The instance identity document for the EC2 instance to register. This document can be found by running the
     *        following command from the instance:
     *        <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withInstanceIdentityDocument(String instanceIdentityDocument) {
        setInstanceIdentityDocument(instanceIdentityDocument);
        return this;
    }

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to register. This signature can be found by running
     * the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     * 
     * @param instanceIdentityDocumentSignature
     *        The instance identity document signature for the EC2 instance to register. This signature can be found by
     *        running the following command from the instance:
     *        <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     */

    public void setInstanceIdentityDocumentSignature(String instanceIdentityDocumentSignature) {
        this.instanceIdentityDocumentSignature = instanceIdentityDocumentSignature;
    }

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to register. This signature can be found by running
     * the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     * 
     * @return The instance identity document signature for the EC2 instance to register. This signature can be found by
     *         running the following command from the instance:
     *         <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     */

    public String getInstanceIdentityDocumentSignature() {
        return this.instanceIdentityDocumentSignature;
    }

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to register. This signature can be found by running
     * the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     * 
     * @param instanceIdentityDocumentSignature
     *        The instance identity document signature for the EC2 instance to register. This signature can be found by
     *        running the following command from the instance:
     *        <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withInstanceIdentityDocumentSignature(String instanceIdentityDocumentSignature) {
        setInstanceIdentityDocumentSignature(instanceIdentityDocumentSignature);
        return this;
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     * 
     * @return The resources available on the instance.
     */

    public java.util.List<Resource> getTotalResources() {
        if (totalResources == null) {
            totalResources = new com.amazonaws.internal.SdkInternalList<Resource>();
        }
        return totalResources;
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     * 
     * @param totalResources
     *        The resources available on the instance.
     */

    public void setTotalResources(java.util.Collection<Resource> totalResources) {
        if (totalResources == null) {
            this.totalResources = null;
            return;
        }

        this.totalResources = new com.amazonaws.internal.SdkInternalList<Resource>(totalResources);
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTotalResources(java.util.Collection)} or {@link #withTotalResources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param totalResources
     *        The resources available on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withTotalResources(Resource... totalResources) {
        if (this.totalResources == null) {
            setTotalResources(new com.amazonaws.internal.SdkInternalList<Resource>(totalResources.length));
        }
        for (Resource ele : totalResources) {
            this.totalResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     * 
     * @param totalResources
     *        The resources available on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withTotalResources(java.util.Collection<Resource> totalResources) {
        setTotalResources(totalResources);
        return this;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     * 
     * @param versionInfo
     *        The version information for the Amazon ECS container agent and Docker daemon running on the container
     *        instance.
     */

    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     * 
     * @return The version information for the Amazon ECS container agent and Docker daemon running on the container
     *         instance.
     */

    public VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     * 
     * @param versionInfo
     *        The version information for the Amazon ECS container agent and Docker daemon running on the container
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withVersionInfo(VersionInfo versionInfo) {
        setVersionInfo(versionInfo);
        return this;
    }

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     * 
     * @param containerInstanceArn
     *        The ARN of the container instance (if it was previously registered).
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     * 
     * @return The ARN of the container instance (if it was previously registered).
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     * 
     * @param containerInstanceArn
     *        The ARN of the container instance (if it was previously registered).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     * 
     * @return The container instance attributes that this container instance supports.
     */

    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return attributes;
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     * 
     * @param attributes
     *        The container instance attributes that this container instance supports.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<Attribute>(attributes);
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The container instance attributes that this container instance supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     * 
     * @param attributes
     *        The container instance attributes that this container instance supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only supported device type is a GPU.
     * </p>
     * 
     * @return The devices that are available on the container instance. The only supported device type is a GPU.
     */

    public java.util.List<PlatformDevice> getPlatformDevices() {
        if (platformDevices == null) {
            platformDevices = new com.amazonaws.internal.SdkInternalList<PlatformDevice>();
        }
        return platformDevices;
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only supported device type is a GPU.
     * </p>
     * 
     * @param platformDevices
     *        The devices that are available on the container instance. The only supported device type is a GPU.
     */

    public void setPlatformDevices(java.util.Collection<PlatformDevice> platformDevices) {
        if (platformDevices == null) {
            this.platformDevices = null;
            return;
        }

        this.platformDevices = new com.amazonaws.internal.SdkInternalList<PlatformDevice>(platformDevices);
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only supported device type is a GPU.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformDevices(java.util.Collection)} or {@link #withPlatformDevices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param platformDevices
     *        The devices that are available on the container instance. The only supported device type is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withPlatformDevices(PlatformDevice... platformDevices) {
        if (this.platformDevices == null) {
            setPlatformDevices(new com.amazonaws.internal.SdkInternalList<PlatformDevice>(platformDevices.length));
        }
        for (PlatformDevice ele : platformDevices) {
            this.platformDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only supported device type is a GPU.
     * </p>
     * 
     * @param platformDevices
     *        The devices that are available on the container instance. The only supported device type is a GPU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withPlatformDevices(java.util.Collection<PlatformDevice> platformDevices) {
        setPlatformDevices(platformDevices);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata that you apply to the container instance to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *         length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the container instance to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the container instance to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the container instance to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerInstanceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getInstanceIdentityDocument() != null)
            sb.append("InstanceIdentityDocument: ").append(getInstanceIdentityDocument()).append(",");
        if (getInstanceIdentityDocumentSignature() != null)
            sb.append("InstanceIdentityDocumentSignature: ").append(getInstanceIdentityDocumentSignature()).append(",");
        if (getTotalResources() != null)
            sb.append("TotalResources: ").append(getTotalResources()).append(",");
        if (getVersionInfo() != null)
            sb.append("VersionInfo: ").append(getVersionInfo()).append(",");
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: ").append(getContainerInstanceArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getPlatformDevices() != null)
            sb.append("PlatformDevices: ").append(getPlatformDevices()).append(",");
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

        if (obj instanceof RegisterContainerInstanceRequest == false)
            return false;
        RegisterContainerInstanceRequest other = (RegisterContainerInstanceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getInstanceIdentityDocument() == null ^ this.getInstanceIdentityDocument() == null)
            return false;
        if (other.getInstanceIdentityDocument() != null && other.getInstanceIdentityDocument().equals(this.getInstanceIdentityDocument()) == false)
            return false;
        if (other.getInstanceIdentityDocumentSignature() == null ^ this.getInstanceIdentityDocumentSignature() == null)
            return false;
        if (other.getInstanceIdentityDocumentSignature() != null
                && other.getInstanceIdentityDocumentSignature().equals(this.getInstanceIdentityDocumentSignature()) == false)
            return false;
        if (other.getTotalResources() == null ^ this.getTotalResources() == null)
            return false;
        if (other.getTotalResources() != null && other.getTotalResources().equals(this.getTotalResources()) == false)
            return false;
        if (other.getVersionInfo() == null ^ this.getVersionInfo() == null)
            return false;
        if (other.getVersionInfo() != null && other.getVersionInfo().equals(this.getVersionInfo()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getPlatformDevices() == null ^ this.getPlatformDevices() == null)
            return false;
        if (other.getPlatformDevices() != null && other.getPlatformDevices().equals(this.getPlatformDevices()) == false)
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

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getInstanceIdentityDocument() == null) ? 0 : getInstanceIdentityDocument().hashCode());
        hashCode = prime * hashCode + ((getInstanceIdentityDocumentSignature() == null) ? 0 : getInstanceIdentityDocumentSignature().hashCode());
        hashCode = prime * hashCode + ((getTotalResources() == null) ? 0 : getTotalResources().hashCode());
        hashCode = prime * hashCode + ((getVersionInfo() == null) ? 0 : getVersionInfo().hashCode());
        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getPlatformDevices() == null) ? 0 : getPlatformDevices().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RegisterContainerInstanceRequest clone() {
        return (RegisterContainerInstanceRequest) super.clone();
    }

}
