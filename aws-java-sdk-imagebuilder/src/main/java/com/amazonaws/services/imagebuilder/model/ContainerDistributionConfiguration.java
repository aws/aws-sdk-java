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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container distribution settings for encryption, licensing, and sharing in a specific Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ContainerDistributionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDistributionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the container distribution configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Tags that are attached to the container distribution configuration.
     * </p>
     */
    private java.util.List<String> containerTags;
    /**
     * <p>
     * The destination repository for the container distribution configuration.
     * </p>
     */
    private TargetContainerRepository targetRepository;

    /**
     * <p>
     * The description of the container distribution configuration.
     * </p>
     * 
     * @param description
     *        The description of the container distribution configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the container distribution configuration.
     * </p>
     * 
     * @return The description of the container distribution configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the container distribution configuration.
     * </p>
     * 
     * @param description
     *        The description of the container distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDistributionConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Tags that are attached to the container distribution configuration.
     * </p>
     * 
     * @return Tags that are attached to the container distribution configuration.
     */

    public java.util.List<String> getContainerTags() {
        return containerTags;
    }

    /**
     * <p>
     * Tags that are attached to the container distribution configuration.
     * </p>
     * 
     * @param containerTags
     *        Tags that are attached to the container distribution configuration.
     */

    public void setContainerTags(java.util.Collection<String> containerTags) {
        if (containerTags == null) {
            this.containerTags = null;
            return;
        }

        this.containerTags = new java.util.ArrayList<String>(containerTags);
    }

    /**
     * <p>
     * Tags that are attached to the container distribution configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerTags(java.util.Collection)} or {@link #withContainerTags(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param containerTags
     *        Tags that are attached to the container distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDistributionConfiguration withContainerTags(String... containerTags) {
        if (this.containerTags == null) {
            setContainerTags(new java.util.ArrayList<String>(containerTags.length));
        }
        for (String ele : containerTags) {
            this.containerTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags that are attached to the container distribution configuration.
     * </p>
     * 
     * @param containerTags
     *        Tags that are attached to the container distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDistributionConfiguration withContainerTags(java.util.Collection<String> containerTags) {
        setContainerTags(containerTags);
        return this;
    }

    /**
     * <p>
     * The destination repository for the container distribution configuration.
     * </p>
     * 
     * @param targetRepository
     *        The destination repository for the container distribution configuration.
     */

    public void setTargetRepository(TargetContainerRepository targetRepository) {
        this.targetRepository = targetRepository;
    }

    /**
     * <p>
     * The destination repository for the container distribution configuration.
     * </p>
     * 
     * @return The destination repository for the container distribution configuration.
     */

    public TargetContainerRepository getTargetRepository() {
        return this.targetRepository;
    }

    /**
     * <p>
     * The destination repository for the container distribution configuration.
     * </p>
     * 
     * @param targetRepository
     *        The destination repository for the container distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDistributionConfiguration withTargetRepository(TargetContainerRepository targetRepository) {
        setTargetRepository(targetRepository);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContainerTags() != null)
            sb.append("ContainerTags: ").append(getContainerTags()).append(",");
        if (getTargetRepository() != null)
            sb.append("TargetRepository: ").append(getTargetRepository());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDistributionConfiguration == false)
            return false;
        ContainerDistributionConfiguration other = (ContainerDistributionConfiguration) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContainerTags() == null ^ this.getContainerTags() == null)
            return false;
        if (other.getContainerTags() != null && other.getContainerTags().equals(this.getContainerTags()) == false)
            return false;
        if (other.getTargetRepository() == null ^ this.getTargetRepository() == null)
            return false;
        if (other.getTargetRepository() != null && other.getTargetRepository().equals(this.getTargetRepository()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContainerTags() == null) ? 0 : getContainerTags().hashCode());
        hashCode = prime * hashCode + ((getTargetRepository() == null) ? 0 : getTargetRepository().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDistributionConfiguration clone() {
        try {
            return (ContainerDistributionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ContainerDistributionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
