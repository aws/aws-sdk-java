/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#registerContainerInstance(RegisterContainerInstanceRequest) RegisterContainerInstance operation}.
 * <p>
 * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
 * Service agent, and it is not intended for use outside of the agent.
 * </p>
 * <p>
 * Registers an Amazon EC2 instance into the specified cluster. This
 * instance will become available to place containers on.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#registerContainerInstance(RegisterContainerInstanceRequest)
 */
public class RegisterContainerInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to register your container instance with. If you do not
     * specify a cluster, the default cluster is assumed..
     */
    private String cluster;

    /**
     * The instance identity document for the Amazon EC2 instance to
     * register. This document can be found by running the following command
     * from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     */
    private String instanceIdentityDocument;

    /**
     * The instance identity document signature for the Amazon EC2 instance
     * to register. This signature can be found by running the following
     * command from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     */
    private String instanceIdentityDocumentSignature;

    /**
     * The resources available on the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Resource> totalResources;

    /**
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     */
    private VersionInfo versionInfo;

    /**
     * The Amazon Resource Name (ARN) of the container instance (if it was
     * previously registered).
     */
    private String containerInstanceArn;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to register your container instance with. If you do not
     * specify a cluster, the default cluster is assumed..
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to register your container instance with. If you do not
     *         specify a cluster, the default cluster is assumed..
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to register your container instance with. If you do not
     * specify a cluster, the default cluster is assumed..
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to register your container instance with. If you do not
     *         specify a cluster, the default cluster is assumed..
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to register your container instance with. If you do not
     * specify a cluster, the default cluster is assumed..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to register your container instance with. If you do not
     *         specify a cluster, the default cluster is assumed..
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The instance identity document for the Amazon EC2 instance to
     * register. This document can be found by running the following command
     * from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     *
     * @return The instance identity document for the Amazon EC2 instance to
     *         register. This document can be found by running the following command
     *         from the instance: <code>curl
     *         http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     */
    public String getInstanceIdentityDocument() {
        return instanceIdentityDocument;
    }
    
    /**
     * The instance identity document for the Amazon EC2 instance to
     * register. This document can be found by running the following command
     * from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     *
     * @param instanceIdentityDocument The instance identity document for the Amazon EC2 instance to
     *         register. This document can be found by running the following command
     *         from the instance: <code>curl
     *         http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     */
    public void setInstanceIdentityDocument(String instanceIdentityDocument) {
        this.instanceIdentityDocument = instanceIdentityDocument;
    }
    
    /**
     * The instance identity document for the Amazon EC2 instance to
     * register. This document can be found by running the following command
     * from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIdentityDocument The instance identity document for the Amazon EC2 instance to
     *         register. This document can be found by running the following command
     *         from the instance: <code>curl
     *         http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withInstanceIdentityDocument(String instanceIdentityDocument) {
        this.instanceIdentityDocument = instanceIdentityDocument;
        return this;
    }

    /**
     * The instance identity document signature for the Amazon EC2 instance
     * to register. This signature can be found by running the following
     * command from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     *
     * @return The instance identity document signature for the Amazon EC2 instance
     *         to register. This signature can be found by running the following
     *         command from the instance: <code>curl
     *         http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     */
    public String getInstanceIdentityDocumentSignature() {
        return instanceIdentityDocumentSignature;
    }
    
    /**
     * The instance identity document signature for the Amazon EC2 instance
     * to register. This signature can be found by running the following
     * command from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     *
     * @param instanceIdentityDocumentSignature The instance identity document signature for the Amazon EC2 instance
     *         to register. This signature can be found by running the following
     *         command from the instance: <code>curl
     *         http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     */
    public void setInstanceIdentityDocumentSignature(String instanceIdentityDocumentSignature) {
        this.instanceIdentityDocumentSignature = instanceIdentityDocumentSignature;
    }
    
    /**
     * The instance identity document signature for the Amazon EC2 instance
     * to register. This signature can be found by running the following
     * command from the instance: <code>curl
     * http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIdentityDocumentSignature The instance identity document signature for the Amazon EC2 instance
     *         to register. This signature can be found by running the following
     *         command from the instance: <code>curl
     *         http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withInstanceIdentityDocumentSignature(String instanceIdentityDocumentSignature) {
        this.instanceIdentityDocumentSignature = instanceIdentityDocumentSignature;
        return this;
    }

    /**
     * The resources available on the instance.
     *
     * @return The resources available on the instance.
     */
    public java.util.List<Resource> getTotalResources() {
        if (totalResources == null) {
              totalResources = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>();
              totalResources.setAutoConstruct(true);
        }
        return totalResources;
    }
    
    /**
     * The resources available on the instance.
     *
     * @param totalResources The resources available on the instance.
     */
    public void setTotalResources(java.util.Collection<Resource> totalResources) {
        if (totalResources == null) {
            this.totalResources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Resource> totalResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(totalResources.size());
        totalResourcesCopy.addAll(totalResources);
        this.totalResources = totalResourcesCopy;
    }
    
    /**
     * The resources available on the instance.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTotalResources(java.util.Collection)} or {@link
     * #withTotalResources(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalResources The resources available on the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withTotalResources(Resource... totalResources) {
        if (getTotalResources() == null) setTotalResources(new java.util.ArrayList<Resource>(totalResources.length));
        for (Resource value : totalResources) {
            getTotalResources().add(value);
        }
        return this;
    }
    
    /**
     * The resources available on the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalResources The resources available on the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withTotalResources(java.util.Collection<Resource> totalResources) {
        if (totalResources == null) {
            this.totalResources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Resource> totalResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Resource>(totalResources.size());
            totalResourcesCopy.addAll(totalResources);
            this.totalResources = totalResourcesCopy;
        }

        return this;
    }

    /**
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     *
     * @return The version information for the Amazon ECS container agent and Docker
     *         daemon running on the container instance.
     */
    public VersionInfo getVersionInfo() {
        return versionInfo;
    }
    
    /**
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     *
     * @param versionInfo The version information for the Amazon ECS container agent and Docker
     *         daemon running on the container instance.
     */
    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }
    
    /**
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionInfo The version information for the Amazon ECS container agent and Docker
     *         daemon running on the container instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the container instance (if it was
     * previously registered).
     *
     * @return The Amazon Resource Name (ARN) of the container instance (if it was
     *         previously registered).
     */
    public String getContainerInstanceArn() {
        return containerInstanceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container instance (if it was
     * previously registered).
     *
     * @param containerInstanceArn The Amazon Resource Name (ARN) of the container instance (if it was
     *         previously registered).
     */
    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container instance (if it was
     * previously registered).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstanceArn The Amazon Resource Name (ARN) of the container instance (if it was
     *         previously registered).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceRequest withContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getInstanceIdentityDocument() != null) sb.append("InstanceIdentityDocument: " + getInstanceIdentityDocument() + ",");
        if (getInstanceIdentityDocumentSignature() != null) sb.append("InstanceIdentityDocumentSignature: " + getInstanceIdentityDocumentSignature() + ",");
        if (getTotalResources() != null) sb.append("TotalResources: " + getTotalResources() + ",");
        if (getVersionInfo() != null) sb.append("VersionInfo: " + getVersionInfo() + ",");
        if (getContainerInstanceArn() != null) sb.append("ContainerInstanceArn: " + getContainerInstanceArn() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterContainerInstanceRequest == false) return false;
        RegisterContainerInstanceRequest other = (RegisterContainerInstanceRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getInstanceIdentityDocument() == null ^ this.getInstanceIdentityDocument() == null) return false;
        if (other.getInstanceIdentityDocument() != null && other.getInstanceIdentityDocument().equals(this.getInstanceIdentityDocument()) == false) return false; 
        if (other.getInstanceIdentityDocumentSignature() == null ^ this.getInstanceIdentityDocumentSignature() == null) return false;
        if (other.getInstanceIdentityDocumentSignature() != null && other.getInstanceIdentityDocumentSignature().equals(this.getInstanceIdentityDocumentSignature()) == false) return false; 
        if (other.getTotalResources() == null ^ this.getTotalResources() == null) return false;
        if (other.getTotalResources() != null && other.getTotalResources().equals(this.getTotalResources()) == false) return false; 
        if (other.getVersionInfo() == null ^ this.getVersionInfo() == null) return false;
        if (other.getVersionInfo() != null && other.getVersionInfo().equals(this.getVersionInfo()) == false) return false; 
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null) return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false) return false; 
        return true;
    }
    
    @Override
    public RegisterContainerInstanceRequest clone() {
        
            return (RegisterContainerInstanceRequest) super.clone();
    }

}
    