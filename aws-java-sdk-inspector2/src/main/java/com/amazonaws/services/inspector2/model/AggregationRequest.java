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
 * Contains details about an aggregation request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AggregationRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     * </p>
     */
    private AccountAggregation accountAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     * </p>
     */
    private AmiAggregation amiAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR container images.
     * </p>
     */
    private AwsEcrContainerAggregation awsEcrContainerAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon EC2 instances.
     * </p>
     */
    private Ec2InstanceAggregation ec2InstanceAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on finding types.
     * </p>
     */
    private FindingTypeAggregation findingTypeAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on container image layers.
     * </p>
     */
    private ImageLayerAggregation imageLayerAggregation;
    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda function.
     * </p>
     */
    private LambdaFunctionAggregation lambdaFunctionAggregation;
    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda layer.
     * </p>
     */
    private LambdaLayerAggregation lambdaLayerAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on operating system package type.
     * </p>
     */
    private PackageAggregation packageAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR repositories.
     * </p>
     */
    private RepositoryAggregation repositoryAggregation;
    /**
     * <p>
     * An object that contains details about an aggregation request based on finding title.
     * </p>
     */
    private TitleAggregation titleAggregation;

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     * </p>
     * 
     * @param accountAggregation
     *        An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     */

    public void setAccountAggregation(AccountAggregation accountAggregation) {
        this.accountAggregation = accountAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     */

    public AccountAggregation getAccountAggregation() {
        return this.accountAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     * </p>
     * 
     * @param accountAggregation
     *        An object that contains details about an aggregation request based on Amazon Web Services account IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withAccountAggregation(AccountAggregation accountAggregation) {
        setAccountAggregation(accountAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     * </p>
     * 
     * @param amiAggregation
     *        An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     */

    public void setAmiAggregation(AmiAggregation amiAggregation) {
        this.amiAggregation = amiAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     */

    public AmiAggregation getAmiAggregation() {
        return this.amiAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     * </p>
     * 
     * @param amiAggregation
     *        An object that contains details about an aggregation request based on Amazon Machine Images (AMIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withAmiAggregation(AmiAggregation amiAggregation) {
        setAmiAggregation(amiAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR container images.
     * </p>
     * 
     * @param awsEcrContainerAggregation
     *        An object that contains details about an aggregation request based on Amazon ECR container images.
     */

    public void setAwsEcrContainerAggregation(AwsEcrContainerAggregation awsEcrContainerAggregation) {
        this.awsEcrContainerAggregation = awsEcrContainerAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR container images.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on Amazon ECR container images.
     */

    public AwsEcrContainerAggregation getAwsEcrContainerAggregation() {
        return this.awsEcrContainerAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR container images.
     * </p>
     * 
     * @param awsEcrContainerAggregation
     *        An object that contains details about an aggregation request based on Amazon ECR container images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withAwsEcrContainerAggregation(AwsEcrContainerAggregation awsEcrContainerAggregation) {
        setAwsEcrContainerAggregation(awsEcrContainerAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon EC2 instances.
     * </p>
     * 
     * @param ec2InstanceAggregation
     *        An object that contains details about an aggregation request based on Amazon EC2 instances.
     */

    public void setEc2InstanceAggregation(Ec2InstanceAggregation ec2InstanceAggregation) {
        this.ec2InstanceAggregation = ec2InstanceAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon EC2 instances.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on Amazon EC2 instances.
     */

    public Ec2InstanceAggregation getEc2InstanceAggregation() {
        return this.ec2InstanceAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon EC2 instances.
     * </p>
     * 
     * @param ec2InstanceAggregation
     *        An object that contains details about an aggregation request based on Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withEc2InstanceAggregation(Ec2InstanceAggregation ec2InstanceAggregation) {
        setEc2InstanceAggregation(ec2InstanceAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on finding types.
     * </p>
     * 
     * @param findingTypeAggregation
     *        An object that contains details about an aggregation request based on finding types.
     */

    public void setFindingTypeAggregation(FindingTypeAggregation findingTypeAggregation) {
        this.findingTypeAggregation = findingTypeAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on finding types.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on finding types.
     */

    public FindingTypeAggregation getFindingTypeAggregation() {
        return this.findingTypeAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on finding types.
     * </p>
     * 
     * @param findingTypeAggregation
     *        An object that contains details about an aggregation request based on finding types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withFindingTypeAggregation(FindingTypeAggregation findingTypeAggregation) {
        setFindingTypeAggregation(findingTypeAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on container image layers.
     * </p>
     * 
     * @param imageLayerAggregation
     *        An object that contains details about an aggregation request based on container image layers.
     */

    public void setImageLayerAggregation(ImageLayerAggregation imageLayerAggregation) {
        this.imageLayerAggregation = imageLayerAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on container image layers.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on container image layers.
     */

    public ImageLayerAggregation getImageLayerAggregation() {
        return this.imageLayerAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on container image layers.
     * </p>
     * 
     * @param imageLayerAggregation
     *        An object that contains details about an aggregation request based on container image layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withImageLayerAggregation(ImageLayerAggregation imageLayerAggregation) {
        setImageLayerAggregation(imageLayerAggregation);
        return this;
    }

    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda function.
     * </p>
     * 
     * @param lambdaFunctionAggregation
     *        Returns an object with findings aggregated by AWS Lambda function.
     */

    public void setLambdaFunctionAggregation(LambdaFunctionAggregation lambdaFunctionAggregation) {
        this.lambdaFunctionAggregation = lambdaFunctionAggregation;
    }

    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda function.
     * </p>
     * 
     * @return Returns an object with findings aggregated by AWS Lambda function.
     */

    public LambdaFunctionAggregation getLambdaFunctionAggregation() {
        return this.lambdaFunctionAggregation;
    }

    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda function.
     * </p>
     * 
     * @param lambdaFunctionAggregation
     *        Returns an object with findings aggregated by AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withLambdaFunctionAggregation(LambdaFunctionAggregation lambdaFunctionAggregation) {
        setLambdaFunctionAggregation(lambdaFunctionAggregation);
        return this;
    }

    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda layer.
     * </p>
     * 
     * @param lambdaLayerAggregation
     *        Returns an object with findings aggregated by AWS Lambda layer.
     */

    public void setLambdaLayerAggregation(LambdaLayerAggregation lambdaLayerAggregation) {
        this.lambdaLayerAggregation = lambdaLayerAggregation;
    }

    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda layer.
     * </p>
     * 
     * @return Returns an object with findings aggregated by AWS Lambda layer.
     */

    public LambdaLayerAggregation getLambdaLayerAggregation() {
        return this.lambdaLayerAggregation;
    }

    /**
     * <p>
     * Returns an object with findings aggregated by AWS Lambda layer.
     * </p>
     * 
     * @param lambdaLayerAggregation
     *        Returns an object with findings aggregated by AWS Lambda layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withLambdaLayerAggregation(LambdaLayerAggregation lambdaLayerAggregation) {
        setLambdaLayerAggregation(lambdaLayerAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on operating system package type.
     * </p>
     * 
     * @param packageAggregation
     *        An object that contains details about an aggregation request based on operating system package type.
     */

    public void setPackageAggregation(PackageAggregation packageAggregation) {
        this.packageAggregation = packageAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on operating system package type.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on operating system package type.
     */

    public PackageAggregation getPackageAggregation() {
        return this.packageAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on operating system package type.
     * </p>
     * 
     * @param packageAggregation
     *        An object that contains details about an aggregation request based on operating system package type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withPackageAggregation(PackageAggregation packageAggregation) {
        setPackageAggregation(packageAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR repositories.
     * </p>
     * 
     * @param repositoryAggregation
     *        An object that contains details about an aggregation request based on Amazon ECR repositories.
     */

    public void setRepositoryAggregation(RepositoryAggregation repositoryAggregation) {
        this.repositoryAggregation = repositoryAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR repositories.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on Amazon ECR repositories.
     */

    public RepositoryAggregation getRepositoryAggregation() {
        return this.repositoryAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on Amazon ECR repositories.
     * </p>
     * 
     * @param repositoryAggregation
     *        An object that contains details about an aggregation request based on Amazon ECR repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withRepositoryAggregation(RepositoryAggregation repositoryAggregation) {
        setRepositoryAggregation(repositoryAggregation);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on finding title.
     * </p>
     * 
     * @param titleAggregation
     *        An object that contains details about an aggregation request based on finding title.
     */

    public void setTitleAggregation(TitleAggregation titleAggregation) {
        this.titleAggregation = titleAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on finding title.
     * </p>
     * 
     * @return An object that contains details about an aggregation request based on finding title.
     */

    public TitleAggregation getTitleAggregation() {
        return this.titleAggregation;
    }

    /**
     * <p>
     * An object that contains details about an aggregation request based on finding title.
     * </p>
     * 
     * @param titleAggregation
     *        An object that contains details about an aggregation request based on finding title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationRequest withTitleAggregation(TitleAggregation titleAggregation) {
        setTitleAggregation(titleAggregation);
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
        if (getAccountAggregation() != null)
            sb.append("AccountAggregation: ").append(getAccountAggregation()).append(",");
        if (getAmiAggregation() != null)
            sb.append("AmiAggregation: ").append(getAmiAggregation()).append(",");
        if (getAwsEcrContainerAggregation() != null)
            sb.append("AwsEcrContainerAggregation: ").append(getAwsEcrContainerAggregation()).append(",");
        if (getEc2InstanceAggregation() != null)
            sb.append("Ec2InstanceAggregation: ").append(getEc2InstanceAggregation()).append(",");
        if (getFindingTypeAggregation() != null)
            sb.append("FindingTypeAggregation: ").append(getFindingTypeAggregation()).append(",");
        if (getImageLayerAggregation() != null)
            sb.append("ImageLayerAggregation: ").append(getImageLayerAggregation()).append(",");
        if (getLambdaFunctionAggregation() != null)
            sb.append("LambdaFunctionAggregation: ").append(getLambdaFunctionAggregation()).append(",");
        if (getLambdaLayerAggregation() != null)
            sb.append("LambdaLayerAggregation: ").append(getLambdaLayerAggregation()).append(",");
        if (getPackageAggregation() != null)
            sb.append("PackageAggregation: ").append(getPackageAggregation()).append(",");
        if (getRepositoryAggregation() != null)
            sb.append("RepositoryAggregation: ").append(getRepositoryAggregation()).append(",");
        if (getTitleAggregation() != null)
            sb.append("TitleAggregation: ").append(getTitleAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregationRequest == false)
            return false;
        AggregationRequest other = (AggregationRequest) obj;
        if (other.getAccountAggregation() == null ^ this.getAccountAggregation() == null)
            return false;
        if (other.getAccountAggregation() != null && other.getAccountAggregation().equals(this.getAccountAggregation()) == false)
            return false;
        if (other.getAmiAggregation() == null ^ this.getAmiAggregation() == null)
            return false;
        if (other.getAmiAggregation() != null && other.getAmiAggregation().equals(this.getAmiAggregation()) == false)
            return false;
        if (other.getAwsEcrContainerAggregation() == null ^ this.getAwsEcrContainerAggregation() == null)
            return false;
        if (other.getAwsEcrContainerAggregation() != null && other.getAwsEcrContainerAggregation().equals(this.getAwsEcrContainerAggregation()) == false)
            return false;
        if (other.getEc2InstanceAggregation() == null ^ this.getEc2InstanceAggregation() == null)
            return false;
        if (other.getEc2InstanceAggregation() != null && other.getEc2InstanceAggregation().equals(this.getEc2InstanceAggregation()) == false)
            return false;
        if (other.getFindingTypeAggregation() == null ^ this.getFindingTypeAggregation() == null)
            return false;
        if (other.getFindingTypeAggregation() != null && other.getFindingTypeAggregation().equals(this.getFindingTypeAggregation()) == false)
            return false;
        if (other.getImageLayerAggregation() == null ^ this.getImageLayerAggregation() == null)
            return false;
        if (other.getImageLayerAggregation() != null && other.getImageLayerAggregation().equals(this.getImageLayerAggregation()) == false)
            return false;
        if (other.getLambdaFunctionAggregation() == null ^ this.getLambdaFunctionAggregation() == null)
            return false;
        if (other.getLambdaFunctionAggregation() != null && other.getLambdaFunctionAggregation().equals(this.getLambdaFunctionAggregation()) == false)
            return false;
        if (other.getLambdaLayerAggregation() == null ^ this.getLambdaLayerAggregation() == null)
            return false;
        if (other.getLambdaLayerAggregation() != null && other.getLambdaLayerAggregation().equals(this.getLambdaLayerAggregation()) == false)
            return false;
        if (other.getPackageAggregation() == null ^ this.getPackageAggregation() == null)
            return false;
        if (other.getPackageAggregation() != null && other.getPackageAggregation().equals(this.getPackageAggregation()) == false)
            return false;
        if (other.getRepositoryAggregation() == null ^ this.getRepositoryAggregation() == null)
            return false;
        if (other.getRepositoryAggregation() != null && other.getRepositoryAggregation().equals(this.getRepositoryAggregation()) == false)
            return false;
        if (other.getTitleAggregation() == null ^ this.getTitleAggregation() == null)
            return false;
        if (other.getTitleAggregation() != null && other.getTitleAggregation().equals(this.getTitleAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountAggregation() == null) ? 0 : getAccountAggregation().hashCode());
        hashCode = prime * hashCode + ((getAmiAggregation() == null) ? 0 : getAmiAggregation().hashCode());
        hashCode = prime * hashCode + ((getAwsEcrContainerAggregation() == null) ? 0 : getAwsEcrContainerAggregation().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceAggregation() == null) ? 0 : getEc2InstanceAggregation().hashCode());
        hashCode = prime * hashCode + ((getFindingTypeAggregation() == null) ? 0 : getFindingTypeAggregation().hashCode());
        hashCode = prime * hashCode + ((getImageLayerAggregation() == null) ? 0 : getImageLayerAggregation().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionAggregation() == null) ? 0 : getLambdaFunctionAggregation().hashCode());
        hashCode = prime * hashCode + ((getLambdaLayerAggregation() == null) ? 0 : getLambdaLayerAggregation().hashCode());
        hashCode = prime * hashCode + ((getPackageAggregation() == null) ? 0 : getPackageAggregation().hashCode());
        hashCode = prime * hashCode + ((getRepositoryAggregation() == null) ? 0 : getRepositoryAggregation().hashCode());
        hashCode = prime * hashCode + ((getTitleAggregation() == null) ? 0 : getTitleAggregation().hashCode());
        return hashCode;
    }

    @Override
    public AggregationRequest clone() {
        try {
            return (AggregationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AggregationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
