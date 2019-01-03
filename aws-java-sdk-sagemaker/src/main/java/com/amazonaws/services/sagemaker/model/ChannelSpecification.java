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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a named input source, called a channel, to be used by an algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ChannelSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the channel.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     */
    private Boolean isRequired;
    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     */
    private java.util.List<String> supportedContentTypes;
    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     */
    private java.util.List<String> supportedCompressionTypes;
    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store
     * (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the
     * EBS volume.
     * </p>
     */
    private java.util.List<String> supportedInputModes;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSpecification withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * 
     * @param description
     *        A brief description of the channel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * 
     * @return A brief description of the channel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the channel.
     * </p>
     * 
     * @param description
     *        A brief description of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSpecification withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether the channel is required by the algorithm.
     */

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     * 
     * @return Indicates whether the channel is required by the algorithm.
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether the channel is required by the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSpecification withIsRequired(Boolean isRequired) {
        setIsRequired(isRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether the channel is required by the algorithm.
     * </p>
     * 
     * @return Indicates whether the channel is required by the algorithm.
     */

    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     * 
     * @return The supported MIME types for the data.
     */

    public java.util.List<String> getSupportedContentTypes() {
        return supportedContentTypes;
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     * 
     * @param supportedContentTypes
     *        The supported MIME types for the data.
     */

    public void setSupportedContentTypes(java.util.Collection<String> supportedContentTypes) {
        if (supportedContentTypes == null) {
            this.supportedContentTypes = null;
            return;
        }

        this.supportedContentTypes = new java.util.ArrayList<String>(supportedContentTypes);
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedContentTypes(java.util.Collection)} or
     * {@link #withSupportedContentTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedContentTypes
     *        The supported MIME types for the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSpecification withSupportedContentTypes(String... supportedContentTypes) {
        if (this.supportedContentTypes == null) {
            setSupportedContentTypes(new java.util.ArrayList<String>(supportedContentTypes.length));
        }
        for (String ele : supportedContentTypes) {
            this.supportedContentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the data.
     * </p>
     * 
     * @param supportedContentTypes
     *        The supported MIME types for the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelSpecification withSupportedContentTypes(java.util.Collection<String> supportedContentTypes) {
        setSupportedContentTypes(supportedContentTypes);
        return this;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * 
     * @return The allowed compression types, if data compression is used.
     * @see CompressionType
     */

    public java.util.List<String> getSupportedCompressionTypes() {
        return supportedCompressionTypes;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * 
     * @param supportedCompressionTypes
     *        The allowed compression types, if data compression is used.
     * @see CompressionType
     */

    public void setSupportedCompressionTypes(java.util.Collection<String> supportedCompressionTypes) {
        if (supportedCompressionTypes == null) {
            this.supportedCompressionTypes = null;
            return;
        }

        this.supportedCompressionTypes = new java.util.ArrayList<String>(supportedCompressionTypes);
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedCompressionTypes(java.util.Collection)} or
     * {@link #withSupportedCompressionTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedCompressionTypes
     *        The allowed compression types, if data compression is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public ChannelSpecification withSupportedCompressionTypes(String... supportedCompressionTypes) {
        if (this.supportedCompressionTypes == null) {
            setSupportedCompressionTypes(new java.util.ArrayList<String>(supportedCompressionTypes.length));
        }
        for (String ele : supportedCompressionTypes) {
            this.supportedCompressionTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * 
     * @param supportedCompressionTypes
     *        The allowed compression types, if data compression is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public ChannelSpecification withSupportedCompressionTypes(java.util.Collection<String> supportedCompressionTypes) {
        setSupportedCompressionTypes(supportedCompressionTypes);
        return this;
    }

    /**
     * <p>
     * The allowed compression types, if data compression is used.
     * </p>
     * 
     * @param supportedCompressionTypes
     *        The allowed compression types, if data compression is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionType
     */

    public ChannelSpecification withSupportedCompressionTypes(CompressionType... supportedCompressionTypes) {
        java.util.ArrayList<String> supportedCompressionTypesCopy = new java.util.ArrayList<String>(supportedCompressionTypes.length);
        for (CompressionType value : supportedCompressionTypes) {
            supportedCompressionTypesCopy.add(value.toString());
        }
        if (getSupportedCompressionTypes() == null) {
            setSupportedCompressionTypes(supportedCompressionTypesCopy);
        } else {
            getSupportedCompressionTypes().addAll(supportedCompressionTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store
     * (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the
     * EBS volume.
     * </p>
     * 
     * @return The allowed input mode, either FILE or PIPE.</p>
     *         <p>
     *         In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block
     *         Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input
     *         mode.
     *         </p>
     *         <p>
     *         In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without
     *         using the EBS volume.
     * @see TrainingInputMode
     */

    public java.util.List<String> getSupportedInputModes() {
        return supportedInputModes;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store
     * (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the
     * EBS volume.
     * </p>
     * 
     * @param supportedInputModes
     *        The allowed input mode, either FILE or PIPE.</p>
     *        <p>
     *        In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block
     *        Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input
     *        mode.
     *        </p>
     *        <p>
     *        In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using
     *        the EBS volume.
     * @see TrainingInputMode
     */

    public void setSupportedInputModes(java.util.Collection<String> supportedInputModes) {
        if (supportedInputModes == null) {
            this.supportedInputModes = null;
            return;
        }

        this.supportedInputModes = new java.util.ArrayList<String>(supportedInputModes);
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store
     * (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the
     * EBS volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedInputModes(java.util.Collection)} or {@link #withSupportedInputModes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedInputModes
     *        The allowed input mode, either FILE or PIPE.</p>
     *        <p>
     *        In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block
     *        Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input
     *        mode.
     *        </p>
     *        <p>
     *        In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using
     *        the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public ChannelSpecification withSupportedInputModes(String... supportedInputModes) {
        if (this.supportedInputModes == null) {
            setSupportedInputModes(new java.util.ArrayList<String>(supportedInputModes.length));
        }
        for (String ele : supportedInputModes) {
            this.supportedInputModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store
     * (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the
     * EBS volume.
     * </p>
     * 
     * @param supportedInputModes
     *        The allowed input mode, either FILE or PIPE.</p>
     *        <p>
     *        In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block
     *        Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input
     *        mode.
     *        </p>
     *        <p>
     *        In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using
     *        the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public ChannelSpecification withSupportedInputModes(java.util.Collection<String> supportedInputModes) {
        setSupportedInputModes(supportedInputModes);
        return this;
    }

    /**
     * <p>
     * The allowed input mode, either FILE or PIPE.
     * </p>
     * <p>
     * In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store
     * (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode.
     * </p>
     * <p>
     * In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the
     * EBS volume.
     * </p>
     * 
     * @param supportedInputModes
     *        The allowed input mode, either FILE or PIPE.</p>
     *        <p>
     *        In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block
     *        Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input
     *        mode.
     *        </p>
     *        <p>
     *        In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using
     *        the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInputMode
     */

    public ChannelSpecification withSupportedInputModes(TrainingInputMode... supportedInputModes) {
        java.util.ArrayList<String> supportedInputModesCopy = new java.util.ArrayList<String>(supportedInputModes.length);
        for (TrainingInputMode value : supportedInputModes) {
            supportedInputModesCopy.add(value.toString());
        }
        if (getSupportedInputModes() == null) {
            setSupportedInputModes(supportedInputModesCopy);
        } else {
            getSupportedInputModes().addAll(supportedInputModesCopy);
        }
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsRequired() != null)
            sb.append("IsRequired: ").append(getIsRequired()).append(",");
        if (getSupportedContentTypes() != null)
            sb.append("SupportedContentTypes: ").append(getSupportedContentTypes()).append(",");
        if (getSupportedCompressionTypes() != null)
            sb.append("SupportedCompressionTypes: ").append(getSupportedCompressionTypes()).append(",");
        if (getSupportedInputModes() != null)
            sb.append("SupportedInputModes: ").append(getSupportedInputModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelSpecification == false)
            return false;
        ChannelSpecification other = (ChannelSpecification) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getSupportedContentTypes() == null ^ this.getSupportedContentTypes() == null)
            return false;
        if (other.getSupportedContentTypes() != null && other.getSupportedContentTypes().equals(this.getSupportedContentTypes()) == false)
            return false;
        if (other.getSupportedCompressionTypes() == null ^ this.getSupportedCompressionTypes() == null)
            return false;
        if (other.getSupportedCompressionTypes() != null && other.getSupportedCompressionTypes().equals(this.getSupportedCompressionTypes()) == false)
            return false;
        if (other.getSupportedInputModes() == null ^ this.getSupportedInputModes() == null)
            return false;
        if (other.getSupportedInputModes() != null && other.getSupportedInputModes().equals(this.getSupportedInputModes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime * hashCode + ((getSupportedContentTypes() == null) ? 0 : getSupportedContentTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportedCompressionTypes() == null) ? 0 : getSupportedCompressionTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportedInputModes() == null) ? 0 : getSupportedInputModes().hashCode());
        return hashCode;
    }

    @Override
    public ChannelSpecification clone() {
        try {
            return (ChannelSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ChannelSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
