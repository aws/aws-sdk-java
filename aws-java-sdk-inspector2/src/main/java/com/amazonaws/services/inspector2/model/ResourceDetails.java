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
 * Contains details about the resource involved in the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about the Amazon EC2 instance involved in the finding.
     * </p>
     */
    private AwsEc2InstanceDetails awsEc2Instance;
    /**
     * <p>
     * An object that contains details about the Amazon ECR container image involved in the finding.
     * </p>
     */
    private AwsEcrContainerImageDetails awsEcrContainerImage;
    /**
     * <p>
     * A summary of the information about an AWS Lambda function affected by a finding.
     * </p>
     */
    private AwsLambdaFunctionDetails awsLambdaFunction;

    /**
     * <p>
     * An object that contains details about the Amazon EC2 instance involved in the finding.
     * </p>
     * 
     * @param awsEc2Instance
     *        An object that contains details about the Amazon EC2 instance involved in the finding.
     */

    public void setAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        this.awsEc2Instance = awsEc2Instance;
    }

    /**
     * <p>
     * An object that contains details about the Amazon EC2 instance involved in the finding.
     * </p>
     * 
     * @return An object that contains details about the Amazon EC2 instance involved in the finding.
     */

    public AwsEc2InstanceDetails getAwsEc2Instance() {
        return this.awsEc2Instance;
    }

    /**
     * <p>
     * An object that contains details about the Amazon EC2 instance involved in the finding.
     * </p>
     * 
     * @param awsEc2Instance
     *        An object that contains details about the Amazon EC2 instance involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        setAwsEc2Instance(awsEc2Instance);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the Amazon ECR container image involved in the finding.
     * </p>
     * 
     * @param awsEcrContainerImage
     *        An object that contains details about the Amazon ECR container image involved in the finding.
     */

    public void setAwsEcrContainerImage(AwsEcrContainerImageDetails awsEcrContainerImage) {
        this.awsEcrContainerImage = awsEcrContainerImage;
    }

    /**
     * <p>
     * An object that contains details about the Amazon ECR container image involved in the finding.
     * </p>
     * 
     * @return An object that contains details about the Amazon ECR container image involved in the finding.
     */

    public AwsEcrContainerImageDetails getAwsEcrContainerImage() {
        return this.awsEcrContainerImage;
    }

    /**
     * <p>
     * An object that contains details about the Amazon ECR container image involved in the finding.
     * </p>
     * 
     * @param awsEcrContainerImage
     *        An object that contains details about the Amazon ECR container image involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEcrContainerImage(AwsEcrContainerImageDetails awsEcrContainerImage) {
        setAwsEcrContainerImage(awsEcrContainerImage);
        return this;
    }

    /**
     * <p>
     * A summary of the information about an AWS Lambda function affected by a finding.
     * </p>
     * 
     * @param awsLambdaFunction
     *        A summary of the information about an AWS Lambda function affected by a finding.
     */

    public void setAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        this.awsLambdaFunction = awsLambdaFunction;
    }

    /**
     * <p>
     * A summary of the information about an AWS Lambda function affected by a finding.
     * </p>
     * 
     * @return A summary of the information about an AWS Lambda function affected by a finding.
     */

    public AwsLambdaFunctionDetails getAwsLambdaFunction() {
        return this.awsLambdaFunction;
    }

    /**
     * <p>
     * A summary of the information about an AWS Lambda function affected by a finding.
     * </p>
     * 
     * @param awsLambdaFunction
     *        A summary of the information about an AWS Lambda function affected by a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        setAwsLambdaFunction(awsLambdaFunction);
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
        if (getAwsEc2Instance() != null)
            sb.append("AwsEc2Instance: ").append(getAwsEc2Instance()).append(",");
        if (getAwsEcrContainerImage() != null)
            sb.append("AwsEcrContainerImage: ").append(getAwsEcrContainerImage()).append(",");
        if (getAwsLambdaFunction() != null)
            sb.append("AwsLambdaFunction: ").append(getAwsLambdaFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getAwsEc2Instance() == null ^ this.getAwsEc2Instance() == null)
            return false;
        if (other.getAwsEc2Instance() != null && other.getAwsEc2Instance().equals(this.getAwsEc2Instance()) == false)
            return false;
        if (other.getAwsEcrContainerImage() == null ^ this.getAwsEcrContainerImage() == null)
            return false;
        if (other.getAwsEcrContainerImage() != null && other.getAwsEcrContainerImage().equals(this.getAwsEcrContainerImage()) == false)
            return false;
        if (other.getAwsLambdaFunction() == null ^ this.getAwsLambdaFunction() == null)
            return false;
        if (other.getAwsLambdaFunction() != null && other.getAwsLambdaFunction().equals(this.getAwsLambdaFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsEc2Instance() == null) ? 0 : getAwsEc2Instance().hashCode());
        hashCode = prime * hashCode + ((getAwsEcrContainerImage() == null) ? 0 : getAwsEcrContainerImage().hashCode());
        hashCode = prime * hashCode + ((getAwsLambdaFunction() == null) ? 0 : getAwsLambdaFunction().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
