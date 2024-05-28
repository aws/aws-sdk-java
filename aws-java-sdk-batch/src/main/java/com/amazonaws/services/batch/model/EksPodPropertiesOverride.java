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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains overrides for the Kubernetes pod properties of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksPodPropertiesOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksPodPropertiesOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overrides for the container that's used on the Amazon EKS pod.
     * </p>
     */
    private java.util.List<EksContainerOverride> containers;
    /**
     * <p>
     * The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     * containers, always runs to completion, and must complete successfully before the next container starts. These
     * containers are registered with the Amazon EKS Connector agent and persists the registration information in the
     * Kubernetes backend data store. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * <note>
     * <p>
     * This object is limited to 10 elements
     * </p>
     * </note>
     */
    private java.util.List<EksContainerOverride> initContainers;
    /**
     * <p>
     * Metadata about the overrides for the container that's used on the Amazon EKS pod.
     * </p>
     */
    private EksMetadata metadata;

    /**
     * <p>
     * The overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @return The overrides for the container that's used on the Amazon EKS pod.
     */

    public java.util.List<EksContainerOverride> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @param containers
     *        The overrides for the container that's used on the Amazon EKS pod.
     */

    public void setContainers(java.util.Collection<EksContainerOverride> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<EksContainerOverride>(containers);
    }

    /**
     * <p>
     * The overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The overrides for the container that's used on the Amazon EKS pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesOverride withContainers(EksContainerOverride... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<EksContainerOverride>(containers.length));
        }
        for (EksContainerOverride ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @param containers
     *        The overrides for the container that's used on the Amazon EKS pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesOverride withContainers(java.util.Collection<EksContainerOverride> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     * containers, always runs to completion, and must complete successfully before the next container starts. These
     * containers are registered with the Amazon EKS Connector agent and persists the registration information in the
     * Kubernetes backend data store. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * <note>
     * <p>
     * This object is limited to 10 elements
     * </p>
     * </note>
     * 
     * @return The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     *         containers, always runs to completion, and must complete successfully before the next container starts.
     *         These containers are registered with the Amazon EKS Connector agent and persists the registration
     *         information in the Kubernetes backend data store. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     *         <i>Kubernetes documentation</i>.</p> <note>
     *         <p>
     *         This object is limited to 10 elements
     *         </p>
     */

    public java.util.List<EksContainerOverride> getInitContainers() {
        return initContainers;
    }

    /**
     * <p>
     * The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     * containers, always runs to completion, and must complete successfully before the next container starts. These
     * containers are registered with the Amazon EKS Connector agent and persists the registration information in the
     * Kubernetes backend data store. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * <note>
     * <p>
     * This object is limited to 10 elements
     * </p>
     * </note>
     * 
     * @param initContainers
     *        The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     *        containers, always runs to completion, and must complete successfully before the next container starts.
     *        These containers are registered with the Amazon EKS Connector agent and persists the registration
     *        information in the Kubernetes backend data store. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     *        <i>Kubernetes documentation</i>.</p> <note>
     *        <p>
     *        This object is limited to 10 elements
     *        </p>
     */

    public void setInitContainers(java.util.Collection<EksContainerOverride> initContainers) {
        if (initContainers == null) {
            this.initContainers = null;
            return;
        }

        this.initContainers = new java.util.ArrayList<EksContainerOverride>(initContainers);
    }

    /**
     * <p>
     * The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     * containers, always runs to completion, and must complete successfully before the next container starts. These
     * containers are registered with the Amazon EKS Connector agent and persists the registration information in the
     * Kubernetes backend data store. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * <note>
     * <p>
     * This object is limited to 10 elements
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInitContainers(java.util.Collection)} or {@link #withInitContainers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param initContainers
     *        The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     *        containers, always runs to completion, and must complete successfully before the next container starts.
     *        These containers are registered with the Amazon EKS Connector agent and persists the registration
     *        information in the Kubernetes backend data store. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     *        <i>Kubernetes documentation</i>.</p> <note>
     *        <p>
     *        This object is limited to 10 elements
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesOverride withInitContainers(EksContainerOverride... initContainers) {
        if (this.initContainers == null) {
            setInitContainers(new java.util.ArrayList<EksContainerOverride>(initContainers.length));
        }
        for (EksContainerOverride ele : initContainers) {
            this.initContainers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     * containers, always runs to completion, and must complete successfully before the next container starts. These
     * containers are registered with the Amazon EKS Connector agent and persists the registration information in the
     * Kubernetes backend data store. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     * <i>Kubernetes documentation</i>.
     * </p>
     * <note>
     * <p>
     * This object is limited to 10 elements
     * </p>
     * </note>
     * 
     * @param initContainers
     *        The overrides for the conatainers defined in the Amazon EKS pod. These containers run before application
     *        containers, always runs to completion, and must complete successfully before the next container starts.
     *        These containers are registered with the Amazon EKS Connector agent and persists the registration
     *        information in the Kubernetes backend data store. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/workloads/pods/init-containers/">Init Containers</a> in the
     *        <i>Kubernetes documentation</i>.</p> <note>
     *        <p>
     *        This object is limited to 10 elements
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesOverride withInitContainers(java.util.Collection<EksContainerOverride> initContainers) {
        setInitContainers(initContainers);
        return this;
    }

    /**
     * <p>
     * Metadata about the overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @param metadata
     *        Metadata about the overrides for the container that's used on the Amazon EKS pod.
     */

    public void setMetadata(EksMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata about the overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @return Metadata about the overrides for the container that's used on the Amazon EKS pod.
     */

    public EksMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata about the overrides for the container that's used on the Amazon EKS pod.
     * </p>
     * 
     * @param metadata
     *        Metadata about the overrides for the container that's used on the Amazon EKS pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksPodPropertiesOverride withMetadata(EksMetadata metadata) {
        setMetadata(metadata);
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
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getInitContainers() != null)
            sb.append("InitContainers: ").append(getInitContainers()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksPodPropertiesOverride == false)
            return false;
        EksPodPropertiesOverride other = (EksPodPropertiesOverride) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getInitContainers() == null ^ this.getInitContainers() == null)
            return false;
        if (other.getInitContainers() != null && other.getInitContainers().equals(this.getInitContainers()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getInitContainers() == null) ? 0 : getInitContainers().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public EksPodPropertiesOverride clone() {
        try {
            return (EksPodPropertiesOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksPodPropertiesOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
