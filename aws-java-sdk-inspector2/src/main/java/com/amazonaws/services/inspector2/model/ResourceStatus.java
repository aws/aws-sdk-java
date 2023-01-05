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
 * Details the status of Amazon Inspector for each resource type Amazon Inspector scans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResourceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     */
    private String ec2;
    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     */
    private String ecr;
    /**
     * <p>
     * The status of Amazon Inspector scanning for AWS Lambda function resources.
     * </p>
     */
    private String lambda;

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @param ec2
     *        The status of Amazon Inspector scanning for Amazon EC2 resources.
     * @see Status
     */

    public void setEc2(String ec2) {
        this.ec2 = ec2;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @return The status of Amazon Inspector scanning for Amazon EC2 resources.
     * @see Status
     */

    public String getEc2() {
        return this.ec2;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @param ec2
     *        The status of Amazon Inspector scanning for Amazon EC2 resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ResourceStatus withEc2(String ec2) {
        setEc2(ec2);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon EC2 resources.
     * </p>
     * 
     * @param ec2
     *        The status of Amazon Inspector scanning for Amazon EC2 resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ResourceStatus withEc2(Status ec2) {
        this.ec2 = ec2.toString();
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @param ecr
     *        The status of Amazon Inspector scanning for Amazon ECR resources.
     * @see Status
     */

    public void setEcr(String ecr) {
        this.ecr = ecr;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @return The status of Amazon Inspector scanning for Amazon ECR resources.
     * @see Status
     */

    public String getEcr() {
        return this.ecr;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @param ecr
     *        The status of Amazon Inspector scanning for Amazon ECR resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ResourceStatus withEcr(String ecr) {
        setEcr(ecr);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for Amazon ECR resources.
     * </p>
     * 
     * @param ecr
     *        The status of Amazon Inspector scanning for Amazon ECR resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ResourceStatus withEcr(Status ecr) {
        this.ecr = ecr.toString();
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for AWS Lambda function resources.
     * </p>
     * 
     * @param lambda
     *        The status of Amazon Inspector scanning for AWS Lambda function resources.
     * @see Status
     */

    public void setLambda(String lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for AWS Lambda function resources.
     * </p>
     * 
     * @return The status of Amazon Inspector scanning for AWS Lambda function resources.
     * @see Status
     */

    public String getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for AWS Lambda function resources.
     * </p>
     * 
     * @param lambda
     *        The status of Amazon Inspector scanning for AWS Lambda function resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ResourceStatus withLambda(String lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector scanning for AWS Lambda function resources.
     * </p>
     * 
     * @param lambda
     *        The status of Amazon Inspector scanning for AWS Lambda function resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ResourceStatus withLambda(Status lambda) {
        this.lambda = lambda.toString();
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
        if (getEcr() != null)
            sb.append("Ecr: ").append(getEcr()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceStatus == false)
            return false;
        ResourceStatus other = (ResourceStatus) obj;
        if (other.getEc2() == null ^ this.getEc2() == null)
            return false;
        if (other.getEc2() != null && other.getEc2().equals(this.getEc2()) == false)
            return false;
        if (other.getEcr() == null ^ this.getEcr() == null)
            return false;
        if (other.getEcr() != null && other.getEcr().equals(this.getEcr()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2() == null) ? 0 : getEc2().hashCode());
        hashCode = prime * hashCode + ((getEcr() == null) ? 0 : getEcr().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public ResourceStatus clone() {
        try {
            return (ResourceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ResourceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
