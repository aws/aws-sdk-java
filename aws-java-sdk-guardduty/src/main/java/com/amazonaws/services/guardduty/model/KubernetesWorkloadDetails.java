/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the Kubernetes workload involved in a Kubernetes finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesWorkloadDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesWorkloadDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Kubernetes workload name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Kubernetes workload type (e.g. Pod, Deployment, etc.).
     * </p>
     */
    private String type;
    /**
     * <p>
     * Kubernetes workload ID.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * Kubernetes namespace that the workload is part of.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * Whether the hostNetwork flag is enabled for the pods included in the workload.
     * </p>
     */
    private Boolean hostNetwork;
    /**
     * <p>
     * Containers running as part of the Kubernetes workload.
     * </p>
     */
    private java.util.List<Container> containers;
    /**
     * <p>
     * Volumes used by the Kubernetes workload.
     * </p>
     */
    private java.util.List<Volume> volumes;

    /**
     * <p>
     * Kubernetes workload name.
     * </p>
     * 
     * @param name
     *        Kubernetes workload name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Kubernetes workload name.
     * </p>
     * 
     * @return Kubernetes workload name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Kubernetes workload name.
     * </p>
     * 
     * @param name
     *        Kubernetes workload name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Kubernetes workload type (e.g. Pod, Deployment, etc.).
     * </p>
     * 
     * @param type
     *        Kubernetes workload type (e.g. Pod, Deployment, etc.).
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Kubernetes workload type (e.g. Pod, Deployment, etc.).
     * </p>
     * 
     * @return Kubernetes workload type (e.g. Pod, Deployment, etc.).
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Kubernetes workload type (e.g. Pod, Deployment, etc.).
     * </p>
     * 
     * @param type
     *        Kubernetes workload type (e.g. Pod, Deployment, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Kubernetes workload ID.
     * </p>
     * 
     * @param uid
     *        Kubernetes workload ID.
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * Kubernetes workload ID.
     * </p>
     * 
     * @return Kubernetes workload ID.
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * Kubernetes workload ID.
     * </p>
     * 
     * @param uid
     *        Kubernetes workload ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withUid(String uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * Kubernetes namespace that the workload is part of.
     * </p>
     * 
     * @param namespace
     *        Kubernetes namespace that the workload is part of.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * Kubernetes namespace that the workload is part of.
     * </p>
     * 
     * @return Kubernetes namespace that the workload is part of.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * Kubernetes namespace that the workload is part of.
     * </p>
     * 
     * @param namespace
     *        Kubernetes namespace that the workload is part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * Whether the hostNetwork flag is enabled for the pods included in the workload.
     * </p>
     * 
     * @param hostNetwork
     *        Whether the hostNetwork flag is enabled for the pods included in the workload.
     */

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    /**
     * <p>
     * Whether the hostNetwork flag is enabled for the pods included in the workload.
     * </p>
     * 
     * @return Whether the hostNetwork flag is enabled for the pods included in the workload.
     */

    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    /**
     * <p>
     * Whether the hostNetwork flag is enabled for the pods included in the workload.
     * </p>
     * 
     * @param hostNetwork
     *        Whether the hostNetwork flag is enabled for the pods included in the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withHostNetwork(Boolean hostNetwork) {
        setHostNetwork(hostNetwork);
        return this;
    }

    /**
     * <p>
     * Whether the hostNetwork flag is enabled for the pods included in the workload.
     * </p>
     * 
     * @return Whether the hostNetwork flag is enabled for the pods included in the workload.
     */

    public Boolean isHostNetwork() {
        return this.hostNetwork;
    }

    /**
     * <p>
     * Containers running as part of the Kubernetes workload.
     * </p>
     * 
     * @return Containers running as part of the Kubernetes workload.
     */

    public java.util.List<Container> getContainers() {
        return containers;
    }

    /**
     * <p>
     * Containers running as part of the Kubernetes workload.
     * </p>
     * 
     * @param containers
     *        Containers running as part of the Kubernetes workload.
     */

    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<Container>(containers);
    }

    /**
     * <p>
     * Containers running as part of the Kubernetes workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        Containers running as part of the Kubernetes workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withContainers(Container... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<Container>(containers.length));
        }
        for (Container ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Containers running as part of the Kubernetes workload.
     * </p>
     * 
     * @param containers
     *        Containers running as part of the Kubernetes workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withContainers(java.util.Collection<Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * Volumes used by the Kubernetes workload.
     * </p>
     * 
     * @return Volumes used by the Kubernetes workload.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * Volumes used by the Kubernetes workload.
     * </p>
     * 
     * @param volumes
     *        Volumes used by the Kubernetes workload.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * Volumes used by the Kubernetes workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        Volumes used by the Kubernetes workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Volumes used by the Kubernetes workload.
     * </p>
     * 
     * @param volumes
     *        Volumes used by the Kubernetes workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesWorkloadDetails withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getHostNetwork() != null)
            sb.append("HostNetwork: ").append(getHostNetwork()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesWorkloadDetails == false)
            return false;
        KubernetesWorkloadDetails other = (KubernetesWorkloadDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getHostNetwork() == null ^ this.getHostNetwork() == null)
            return false;
        if (other.getHostNetwork() != null && other.getHostNetwork().equals(this.getHostNetwork()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getHostNetwork() == null) ? 0 : getHostNetwork().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesWorkloadDetails clone() {
        try {
            return (KubernetesWorkloadDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesWorkloadDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
