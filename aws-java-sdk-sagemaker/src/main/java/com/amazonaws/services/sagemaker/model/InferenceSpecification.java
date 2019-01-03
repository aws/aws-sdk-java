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
 * Defines how to perform inference generation after a training job is run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     * </p>
     */
    private java.util.List<ModelPackageContainerDefinition> containers;
    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
     * </p>
     */
    private java.util.List<String> supportedTransformInstanceTypes;
    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     */
    private java.util.List<String> supportedRealtimeInferenceInstanceTypes;
    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     */
    private java.util.List<String> supportedContentTypes;
    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     */
    private java.util.List<String> supportedResponseMIMETypes;

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     * </p>
     * 
     * @return The Amazon ECR registry path of the Docker image that contains the inference code.
     */

    public java.util.List<ModelPackageContainerDefinition> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     * </p>
     * 
     * @param containers
     *        The Amazon ECR registry path of the Docker image that contains the inference code.
     */

    public void setContainers(java.util.Collection<ModelPackageContainerDefinition> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<ModelPackageContainerDefinition>(containers);
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The Amazon ECR registry path of the Docker image that contains the inference code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSpecification withContainers(ModelPackageContainerDefinition... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<ModelPackageContainerDefinition>(containers.length));
        }
        for (ModelPackageContainerDefinition ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the inference code.
     * </p>
     * 
     * @param containers
     *        The Amazon ECR registry path of the Docker image that contains the inference code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSpecification withContainers(java.util.Collection<ModelPackageContainerDefinition> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
     * </p>
     * 
     * @return A list of the instance types on which a transformation job can be run or on which an endpoint can be
     *         deployed.
     * @see TransformInstanceType
     */

    public java.util.List<String> getSupportedTransformInstanceTypes() {
        return supportedTransformInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
     * </p>
     * 
     * @param supportedTransformInstanceTypes
     *        A list of the instance types on which a transformation job can be run or on which an endpoint can be
     *        deployed.
     * @see TransformInstanceType
     */

    public void setSupportedTransformInstanceTypes(java.util.Collection<String> supportedTransformInstanceTypes) {
        if (supportedTransformInstanceTypes == null) {
            this.supportedTransformInstanceTypes = null;
            return;
        }

        this.supportedTransformInstanceTypes = new java.util.ArrayList<String>(supportedTransformInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTransformInstanceTypes(java.util.Collection)} or
     * {@link #withSupportedTransformInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedTransformInstanceTypes
     *        A list of the instance types on which a transformation job can be run or on which an endpoint can be
     *        deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformInstanceType
     */

    public InferenceSpecification withSupportedTransformInstanceTypes(String... supportedTransformInstanceTypes) {
        if (this.supportedTransformInstanceTypes == null) {
            setSupportedTransformInstanceTypes(new java.util.ArrayList<String>(supportedTransformInstanceTypes.length));
        }
        for (String ele : supportedTransformInstanceTypes) {
            this.supportedTransformInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
     * </p>
     * 
     * @param supportedTransformInstanceTypes
     *        A list of the instance types on which a transformation job can be run or on which an endpoint can be
     *        deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformInstanceType
     */

    public InferenceSpecification withSupportedTransformInstanceTypes(java.util.Collection<String> supportedTransformInstanceTypes) {
        setSupportedTransformInstanceTypes(supportedTransformInstanceTypes);
        return this;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
     * </p>
     * 
     * @param supportedTransformInstanceTypes
     *        A list of the instance types on which a transformation job can be run or on which an endpoint can be
     *        deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformInstanceType
     */

    public InferenceSpecification withSupportedTransformInstanceTypes(TransformInstanceType... supportedTransformInstanceTypes) {
        java.util.ArrayList<String> supportedTransformInstanceTypesCopy = new java.util.ArrayList<String>(supportedTransformInstanceTypes.length);
        for (TransformInstanceType value : supportedTransformInstanceTypes) {
            supportedTransformInstanceTypesCopy.add(value.toString());
        }
        if (getSupportedTransformInstanceTypes() == null) {
            setSupportedTransformInstanceTypes(supportedTransformInstanceTypesCopy);
        } else {
            getSupportedTransformInstanceTypes().addAll(supportedTransformInstanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @return A list of the instance types that are used to generate inferences in real-time.
     * @see ProductionVariantInstanceType
     */

    public java.util.List<String> getSupportedRealtimeInferenceInstanceTypes() {
        return supportedRealtimeInferenceInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @param supportedRealtimeInferenceInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     * @see ProductionVariantInstanceType
     */

    public void setSupportedRealtimeInferenceInstanceTypes(java.util.Collection<String> supportedRealtimeInferenceInstanceTypes) {
        if (supportedRealtimeInferenceInstanceTypes == null) {
            this.supportedRealtimeInferenceInstanceTypes = null;
            return;
        }

        this.supportedRealtimeInferenceInstanceTypes = new java.util.ArrayList<String>(supportedRealtimeInferenceInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedRealtimeInferenceInstanceTypes(java.util.Collection)} or
     * {@link #withSupportedRealtimeInferenceInstanceTypes(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param supportedRealtimeInferenceInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public InferenceSpecification withSupportedRealtimeInferenceInstanceTypes(String... supportedRealtimeInferenceInstanceTypes) {
        if (this.supportedRealtimeInferenceInstanceTypes == null) {
            setSupportedRealtimeInferenceInstanceTypes(new java.util.ArrayList<String>(supportedRealtimeInferenceInstanceTypes.length));
        }
        for (String ele : supportedRealtimeInferenceInstanceTypes) {
            this.supportedRealtimeInferenceInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @param supportedRealtimeInferenceInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public InferenceSpecification withSupportedRealtimeInferenceInstanceTypes(java.util.Collection<String> supportedRealtimeInferenceInstanceTypes) {
        setSupportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes);
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in real-time.
     * </p>
     * 
     * @param supportedRealtimeInferenceInstanceTypes
     *        A list of the instance types that are used to generate inferences in real-time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductionVariantInstanceType
     */

    public InferenceSpecification withSupportedRealtimeInferenceInstanceTypes(ProductionVariantInstanceType... supportedRealtimeInferenceInstanceTypes) {
        java.util.ArrayList<String> supportedRealtimeInferenceInstanceTypesCopy = new java.util.ArrayList<String>(
                supportedRealtimeInferenceInstanceTypes.length);
        for (ProductionVariantInstanceType value : supportedRealtimeInferenceInstanceTypes) {
            supportedRealtimeInferenceInstanceTypesCopy.add(value.toString());
        }
        if (getSupportedRealtimeInferenceInstanceTypes() == null) {
            setSupportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypesCopy);
        } else {
            getSupportedRealtimeInferenceInstanceTypes().addAll(supportedRealtimeInferenceInstanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     * 
     * @return The supported MIME types for the input data.
     */

    public java.util.List<String> getSupportedContentTypes() {
        return supportedContentTypes;
    }

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     * 
     * @param supportedContentTypes
     *        The supported MIME types for the input data.
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
     * The supported MIME types for the input data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedContentTypes(java.util.Collection)} or
     * {@link #withSupportedContentTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedContentTypes
     *        The supported MIME types for the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSpecification withSupportedContentTypes(String... supportedContentTypes) {
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
     * The supported MIME types for the input data.
     * </p>
     * 
     * @param supportedContentTypes
     *        The supported MIME types for the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSpecification withSupportedContentTypes(java.util.Collection<String> supportedContentTypes) {
        setSupportedContentTypes(supportedContentTypes);
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     * 
     * @return The supported MIME types for the output data.
     */

    public java.util.List<String> getSupportedResponseMIMETypes() {
        return supportedResponseMIMETypes;
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     * 
     * @param supportedResponseMIMETypes
     *        The supported MIME types for the output data.
     */

    public void setSupportedResponseMIMETypes(java.util.Collection<String> supportedResponseMIMETypes) {
        if (supportedResponseMIMETypes == null) {
            this.supportedResponseMIMETypes = null;
            return;
        }

        this.supportedResponseMIMETypes = new java.util.ArrayList<String>(supportedResponseMIMETypes);
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedResponseMIMETypes(java.util.Collection)} or
     * {@link #withSupportedResponseMIMETypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedResponseMIMETypes
     *        The supported MIME types for the output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSpecification withSupportedResponseMIMETypes(String... supportedResponseMIMETypes) {
        if (this.supportedResponseMIMETypes == null) {
            setSupportedResponseMIMETypes(new java.util.ArrayList<String>(supportedResponseMIMETypes.length));
        }
        for (String ele : supportedResponseMIMETypes) {
            this.supportedResponseMIMETypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     * 
     * @param supportedResponseMIMETypes
     *        The supported MIME types for the output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceSpecification withSupportedResponseMIMETypes(java.util.Collection<String> supportedResponseMIMETypes) {
        setSupportedResponseMIMETypes(supportedResponseMIMETypes);
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
        if (getSupportedTransformInstanceTypes() != null)
            sb.append("SupportedTransformInstanceTypes: ").append(getSupportedTransformInstanceTypes()).append(",");
        if (getSupportedRealtimeInferenceInstanceTypes() != null)
            sb.append("SupportedRealtimeInferenceInstanceTypes: ").append(getSupportedRealtimeInferenceInstanceTypes()).append(",");
        if (getSupportedContentTypes() != null)
            sb.append("SupportedContentTypes: ").append(getSupportedContentTypes()).append(",");
        if (getSupportedResponseMIMETypes() != null)
            sb.append("SupportedResponseMIMETypes: ").append(getSupportedResponseMIMETypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceSpecification == false)
            return false;
        InferenceSpecification other = (InferenceSpecification) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getSupportedTransformInstanceTypes() == null ^ this.getSupportedTransformInstanceTypes() == null)
            return false;
        if (other.getSupportedTransformInstanceTypes() != null
                && other.getSupportedTransformInstanceTypes().equals(this.getSupportedTransformInstanceTypes()) == false)
            return false;
        if (other.getSupportedRealtimeInferenceInstanceTypes() == null ^ this.getSupportedRealtimeInferenceInstanceTypes() == null)
            return false;
        if (other.getSupportedRealtimeInferenceInstanceTypes() != null
                && other.getSupportedRealtimeInferenceInstanceTypes().equals(this.getSupportedRealtimeInferenceInstanceTypes()) == false)
            return false;
        if (other.getSupportedContentTypes() == null ^ this.getSupportedContentTypes() == null)
            return false;
        if (other.getSupportedContentTypes() != null && other.getSupportedContentTypes().equals(this.getSupportedContentTypes()) == false)
            return false;
        if (other.getSupportedResponseMIMETypes() == null ^ this.getSupportedResponseMIMETypes() == null)
            return false;
        if (other.getSupportedResponseMIMETypes() != null && other.getSupportedResponseMIMETypes().equals(this.getSupportedResponseMIMETypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getSupportedTransformInstanceTypes() == null) ? 0 : getSupportedTransformInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportedRealtimeInferenceInstanceTypes() == null) ? 0 : getSupportedRealtimeInferenceInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportedContentTypes() == null) ? 0 : getSupportedContentTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportedResponseMIMETypes() == null) ? 0 : getSupportedResponseMIMETypes().hashCode());
        return hashCode;
    }

    @Override
    public InferenceSpecification clone() {
        try {
            return (InferenceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
