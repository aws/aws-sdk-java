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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the metadata for an Amazon ECR resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResourceScanMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceScanMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains metadata details for an Amazon EC2 instance.
     * </p>
     */
    private Ec2Metadata ec2;
    /**
     * <p>
     * An object that contains details about the container metadata for an Amazon ECR image.
     * </p>
     */
    private EcrContainerImageMetadata ecrImage;
    /**
     * <p>
     * An object that contains details about the repository an Amazon ECR image resides in.
     * </p>
     */
    private EcrRepositoryMetadata ecrRepository;
    /**
     * <p>
     * An object that contains metadata details for an AWS Lambda function.
     * </p>
     */
    private LambdaFunctionMetadata lambdaFunction;

    /**
     * <p>
     * An object that contains metadata details for an Amazon EC2 instance.
     * </p>
     * 
     * @param ec2
     *        An object that contains metadata details for an Amazon EC2 instance.
     */

    public void setEc2(Ec2Metadata ec2) {
        this.ec2 = ec2;
    }

    /**
     * <p>
     * An object that contains metadata details for an Amazon EC2 instance.
     * </p>
     * 
     * @return An object that contains metadata details for an Amazon EC2 instance.
     */

    public Ec2Metadata getEc2() {
        return this.ec2;
    }

    /**
     * <p>
     * An object that contains metadata details for an Amazon EC2 instance.
     * </p>
     * 
     * @param ec2
     *        An object that contains metadata details for an Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanMetadata withEc2(Ec2Metadata ec2) {
        setEc2(ec2);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the container metadata for an Amazon ECR image.
     * </p>
     * 
     * @param ecrImage
     *        An object that contains details about the container metadata for an Amazon ECR image.
     */

    public void setEcrImage(EcrContainerImageMetadata ecrImage) {
        this.ecrImage = ecrImage;
    }

    /**
     * <p>
     * An object that contains details about the container metadata for an Amazon ECR image.
     * </p>
     * 
     * @return An object that contains details about the container metadata for an Amazon ECR image.
     */

    public EcrContainerImageMetadata getEcrImage() {
        return this.ecrImage;
    }

    /**
     * <p>
     * An object that contains details about the container metadata for an Amazon ECR image.
     * </p>
     * 
     * @param ecrImage
     *        An object that contains details about the container metadata for an Amazon ECR image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanMetadata withEcrImage(EcrContainerImageMetadata ecrImage) {
        setEcrImage(ecrImage);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the repository an Amazon ECR image resides in.
     * </p>
     * 
     * @param ecrRepository
     *        An object that contains details about the repository an Amazon ECR image resides in.
     */

    public void setEcrRepository(EcrRepositoryMetadata ecrRepository) {
        this.ecrRepository = ecrRepository;
    }

    /**
     * <p>
     * An object that contains details about the repository an Amazon ECR image resides in.
     * </p>
     * 
     * @return An object that contains details about the repository an Amazon ECR image resides in.
     */

    public EcrRepositoryMetadata getEcrRepository() {
        return this.ecrRepository;
    }

    /**
     * <p>
     * An object that contains details about the repository an Amazon ECR image resides in.
     * </p>
     * 
     * @param ecrRepository
     *        An object that contains details about the repository an Amazon ECR image resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanMetadata withEcrRepository(EcrRepositoryMetadata ecrRepository) {
        setEcrRepository(ecrRepository);
        return this;
    }

    /**
     * <p>
     * An object that contains metadata details for an AWS Lambda function.
     * </p>
     * 
     * @param lambdaFunction
     *        An object that contains metadata details for an AWS Lambda function.
     */

    public void setLambdaFunction(LambdaFunctionMetadata lambdaFunction) {
        this.lambdaFunction = lambdaFunction;
    }

    /**
     * <p>
     * An object that contains metadata details for an AWS Lambda function.
     * </p>
     * 
     * @return An object that contains metadata details for an AWS Lambda function.
     */

    public LambdaFunctionMetadata getLambdaFunction() {
        return this.lambdaFunction;
    }

    /**
     * <p>
     * An object that contains metadata details for an AWS Lambda function.
     * </p>
     * 
     * @param lambdaFunction
     *        An object that contains metadata details for an AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceScanMetadata withLambdaFunction(LambdaFunctionMetadata lambdaFunction) {
        setLambdaFunction(lambdaFunction);
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
        if (getEc2() != null)
            sb.append("Ec2: ").append(getEc2()).append(",");
        if (getEcrImage() != null)
            sb.append("EcrImage: ").append(getEcrImage()).append(",");
        if (getEcrRepository() != null)
            sb.append("EcrRepository: ").append(getEcrRepository()).append(",");
        if (getLambdaFunction() != null)
            sb.append("LambdaFunction: ").append(getLambdaFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceScanMetadata == false)
            return false;
        ResourceScanMetadata other = (ResourceScanMetadata) obj;
        if (other.getEc2() == null ^ this.getEc2() == null)
            return false;
        if (other.getEc2() != null && other.getEc2().equals(this.getEc2()) == false)
            return false;
        if (other.getEcrImage() == null ^ this.getEcrImage() == null)
            return false;
        if (other.getEcrImage() != null && other.getEcrImage().equals(this.getEcrImage()) == false)
            return false;
        if (other.getEcrRepository() == null ^ this.getEcrRepository() == null)
            return false;
        if (other.getEcrRepository() != null && other.getEcrRepository().equals(this.getEcrRepository()) == false)
            return false;
        if (other.getLambdaFunction() == null ^ this.getLambdaFunction() == null)
            return false;
        if (other.getLambdaFunction() != null && other.getLambdaFunction().equals(this.getLambdaFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2() == null) ? 0 : getEc2().hashCode());
        hashCode = prime * hashCode + ((getEcrImage() == null) ? 0 : getEcrImage().hashCode());
        hashCode = prime * hashCode + ((getEcrRepository() == null) ? 0 : getEcrRepository().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunction() == null) ? 0 : getLambdaFunction().hashCode());
        return hashCode;
    }

    @Override
    public ResourceScanMetadata clone() {
        try {
            return (ResourceScanMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ResourceScanMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
