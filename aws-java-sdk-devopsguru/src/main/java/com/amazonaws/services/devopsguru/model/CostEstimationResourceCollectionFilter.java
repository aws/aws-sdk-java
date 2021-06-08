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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a filter used to specify which AWS resources are analyzed to create a monthly DevOps Guru cost
 * estimate. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps Guru
 * costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/CostEstimationResourceCollectionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostEstimationResourceCollectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     * estimate for DevOps Guru.
     * </p>
     */
    private CloudFormationCostEstimationResourceCollectionFilter cloudFormation;

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     * estimate for DevOps Guru.
     * </p>
     * 
     * @param cloudFormation
     *        An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     *        estimate for DevOps Guru.
     */

    public void setCloudFormation(CloudFormationCostEstimationResourceCollectionFilter cloudFormation) {
        this.cloudFormation = cloudFormation;
    }

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     * estimate for DevOps Guru.
     * </p>
     * 
     * @return An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     *         estimate for DevOps Guru.
     */

    public CloudFormationCostEstimationResourceCollectionFilter getCloudFormation() {
        return this.cloudFormation;
    }

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     * estimate for DevOps Guru.
     * </p>
     * 
     * @param cloudFormation
     *        An object that specifies the CloudFormation stack that defines the AWS resources used to create a monthly
     *        estimate for DevOps Guru.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimationResourceCollectionFilter withCloudFormation(CloudFormationCostEstimationResourceCollectionFilter cloudFormation) {
        setCloudFormation(cloudFormation);
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
        if (getCloudFormation() != null)
            sb.append("CloudFormation: ").append(getCloudFormation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostEstimationResourceCollectionFilter == false)
            return false;
        CostEstimationResourceCollectionFilter other = (CostEstimationResourceCollectionFilter) obj;
        if (other.getCloudFormation() == null ^ this.getCloudFormation() == null)
            return false;
        if (other.getCloudFormation() != null && other.getCloudFormation().equals(this.getCloudFormation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFormation() == null) ? 0 : getCloudFormation().hashCode());
        return hashCode;
    }

    @Override
    public CostEstimationResourceCollectionFilter clone() {
        try {
            return (CostEstimationResourceCollectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.CostEstimationResourceCollectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
