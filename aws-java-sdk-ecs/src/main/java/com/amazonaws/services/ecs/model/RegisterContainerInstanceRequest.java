/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
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
     * The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
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
     * The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance (if it was previously registered).
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Cluster: " + getCluster() + ",");
        if (getInstanceIdentityDocument() != null)
            sb.append("InstanceIdentityDocument: " + getInstanceIdentityDocument() + ",");
        if (getInstanceIdentityDocumentSignature() != null)
            sb.append("InstanceIdentityDocumentSignature: " + getInstanceIdentityDocumentSignature() + ",");
        if (getTotalResources() != null)
            sb.append("TotalResources: " + getTotalResources() + ",");
        if (getVersionInfo() != null)
            sb.append("VersionInfo: " + getVersionInfo() + ",");
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
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
        return hashCode;
    }

    @Override
    public RegisterContainerInstanceRequest clone() {
        return (RegisterContainerInstanceRequest) super.clone();
    }
}
