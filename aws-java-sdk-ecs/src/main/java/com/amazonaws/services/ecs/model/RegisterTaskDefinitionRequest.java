/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
 */
public class RegisterTaskDefinitionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed.
     * </p>
     */
    private String family;
    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitions;
    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition,
     *        which allows you to track multiple versions of the same task
     *        definition. The <code>family</code> is used as a name for your
     *        task definition. Up to 255 letters (uppercase and lowercase),
     *        numbers, hyphens, and underscores are allowed.
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed.
     * </p>
     * 
     * @return You must specify a <code>family</code> for a task definition,
     *         which allows you to track multiple versions of the same task
     *         definition. The <code>family</code> is used as a name for your
     *         task definition. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed.
     */
    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed.
     * </p>
     * 
     * @param family
     *        You must specify a <code>family</code> for a task definition,
     *        which allows you to track multiple versions of the same task
     *        definition. The <code>family</code> is used as a name for your
     *        task definition. Up to 255 letters (uppercase and lowercase),
     *        numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     * 
     * @return A list of container definitions in JSON format that describe the
     *         different containers that make up your task.
     */
    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
            containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>();
        }
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the
     *        different containers that make up your task.
     */
    public void setContainerDefinitions(
            java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(
                containerDefinitions);
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContainerDefinitions(java.util.Collection)} or
     * {@link #withContainerDefinitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the
     *        different containers that make up your task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withContainerDefinitions(
            ContainerDefinition... containerDefinitions) {
        if (this.containerDefinitions == null) {
            setContainerDefinitions(new com.amazonaws.internal.SdkInternalList<ContainerDefinition>(
                    containerDefinitions.length));
        }
        for (ContainerDefinition ele : containerDefinitions) {
            this.containerDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     * 
     * @param containerDefinitions
     *        A list of container definitions in JSON format that describe the
     *        different containers that make up your task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withContainerDefinitions(
            java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     * 
     * @return A list of volume definitions in JSON format that containers in
     *         your task may use.
     */
    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in
     *        your task may use.
     */
    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<Volume>(
                volumes);
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumes(java.util.Collection)} or
     * {@link #withVolumes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in
     *        your task may use.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<Volume>(
                    volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     * 
     * @param volumes
     *        A list of volume definitions in JSON format that containers in
     *        your task may use.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withVolumes(
            java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
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
        if (getFamily() != null)
            sb.append("Family: " + getFamily() + ",");
        if (getContainerDefinitions() != null)
            sb.append("ContainerDefinitions: " + getContainerDefinitions()
                    + ",");
        if (getVolumes() != null)
            sb.append("Volumes: " + getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskDefinitionRequest == false)
            return false;
        RegisterTaskDefinitionRequest other = (RegisterTaskDefinitionRequest) obj;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null
                && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getContainerDefinitions() == null
                ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null
                && other.getContainerDefinitions().equals(
                        this.getContainerDefinitions()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null
                && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime
                * hashCode
                + ((getContainerDefinitions() == null) ? 0
                        : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskDefinitionRequest clone() {
        return (RegisterTaskDefinitionRequest) super.clone();
    }
}