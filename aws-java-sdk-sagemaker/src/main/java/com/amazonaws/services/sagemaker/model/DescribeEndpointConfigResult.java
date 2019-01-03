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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     */
    private String endpointConfigArn;
    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     */
    private java.util.List<ProductionVariant> productionVariants;
    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        Name of the Amazon SageMaker endpoint configuration.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * 
     * @return Name of the Amazon SageMaker endpoint configuration.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * Name of the Amazon SageMaker endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        Name of the Amazon SageMaker endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointConfigResult withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigArn
     *        The Amazon Resource Name (ARN) of the endpoint configuration.
     */

    public void setEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint configuration.
     */

    public String getEndpointConfigArn() {
        return this.endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigArn
     *        The Amazon Resource Name (ARN) of the endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointConfigResult withEndpointConfigArn(String endpointConfigArn) {
        setEndpointConfigArn(endpointConfigArn);
        return this;
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * 
     * @return An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *         endpoint.
     */

    public java.util.List<ProductionVariant> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * 
     * @param productionVariants
     *        An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *        endpoint.
     */

    public void setProductionVariants(java.util.Collection<ProductionVariant> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariant>(productionVariants);
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductionVariants(java.util.Collection)} or {@link #withProductionVariants(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productionVariants
     *        An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointConfigResult withProductionVariants(ProductionVariant... productionVariants) {
        if (this.productionVariants == null) {
            setProductionVariants(new java.util.ArrayList<ProductionVariant>(productionVariants.length));
        }
        for (ProductionVariant ele : productionVariants) {
            this.productionVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * 
     * @param productionVariants
     *        An array of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointConfigResult withProductionVariants(java.util.Collection<ProductionVariant> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     * 
     * @param kmsKeyId
     *        AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to
     *        the instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     * 
     * @return AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to
     *         the instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the
     * instance.
     * </p>
     * 
     * @param kmsKeyId
     *        AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to
     *        the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointConfigResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the endpoint configuration was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * 
     * @return A timestamp that shows when the endpoint configuration was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint configuration was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the endpoint configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointConfigResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getEndpointConfigArn() != null)
            sb.append("EndpointConfigArn: ").append(getEndpointConfigArn()).append(",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: ").append(getProductionVariants()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointConfigResult == false)
            return false;
        DescribeEndpointConfigResult other = (DescribeEndpointConfigResult) obj;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getEndpointConfigArn() == null ^ this.getEndpointConfigArn() == null)
            return false;
        if (other.getEndpointConfigArn() != null && other.getEndpointConfigArn().equals(this.getEndpointConfigArn()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null && other.getProductionVariants().equals(this.getProductionVariants()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigArn() == null) ? 0 : getEndpointConfigArn().hashCode());
        hashCode = prime * hashCode + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointConfigResult clone() {
        try {
            return (DescribeEndpointConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
