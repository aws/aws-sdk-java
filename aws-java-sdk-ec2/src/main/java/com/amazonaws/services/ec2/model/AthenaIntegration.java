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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes integration options for Amazon Athena.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AthenaIntegration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AthenaIntegration implements Serializable, Cloneable {

    /**
     * <p>
     * The location in Amazon S3 to store the generated CloudFormation template.
     * </p>
     */
    private String integrationResultS3DestinationArn;
    /**
     * <p>
     * The schedule for adding new partitions to the table.
     * </p>
     */
    private String partitionLoadFrequency;
    /**
     * <p>
     * The start date for the partition.
     * </p>
     */
    private java.util.Date partitionStartDate;
    /**
     * <p>
     * The end date for the partition.
     * </p>
     */
    private java.util.Date partitionEndDate;

    /**
     * <p>
     * The location in Amazon S3 to store the generated CloudFormation template.
     * </p>
     * 
     * @param integrationResultS3DestinationArn
     *        The location in Amazon S3 to store the generated CloudFormation template.
     */

    public void setIntegrationResultS3DestinationArn(String integrationResultS3DestinationArn) {
        this.integrationResultS3DestinationArn = integrationResultS3DestinationArn;
    }

    /**
     * <p>
     * The location in Amazon S3 to store the generated CloudFormation template.
     * </p>
     * 
     * @return The location in Amazon S3 to store the generated CloudFormation template.
     */

    public String getIntegrationResultS3DestinationArn() {
        return this.integrationResultS3DestinationArn;
    }

    /**
     * <p>
     * The location in Amazon S3 to store the generated CloudFormation template.
     * </p>
     * 
     * @param integrationResultS3DestinationArn
     *        The location in Amazon S3 to store the generated CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaIntegration withIntegrationResultS3DestinationArn(String integrationResultS3DestinationArn) {
        setIntegrationResultS3DestinationArn(integrationResultS3DestinationArn);
        return this;
    }

    /**
     * <p>
     * The schedule for adding new partitions to the table.
     * </p>
     * 
     * @param partitionLoadFrequency
     *        The schedule for adding new partitions to the table.
     * @see PartitionLoadFrequency
     */

    public void setPartitionLoadFrequency(String partitionLoadFrequency) {
        this.partitionLoadFrequency = partitionLoadFrequency;
    }

    /**
     * <p>
     * The schedule for adding new partitions to the table.
     * </p>
     * 
     * @return The schedule for adding new partitions to the table.
     * @see PartitionLoadFrequency
     */

    public String getPartitionLoadFrequency() {
        return this.partitionLoadFrequency;
    }

    /**
     * <p>
     * The schedule for adding new partitions to the table.
     * </p>
     * 
     * @param partitionLoadFrequency
     *        The schedule for adding new partitions to the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionLoadFrequency
     */

    public AthenaIntegration withPartitionLoadFrequency(String partitionLoadFrequency) {
        setPartitionLoadFrequency(partitionLoadFrequency);
        return this;
    }

    /**
     * <p>
     * The schedule for adding new partitions to the table.
     * </p>
     * 
     * @param partitionLoadFrequency
     *        The schedule for adding new partitions to the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartitionLoadFrequency
     */

    public AthenaIntegration withPartitionLoadFrequency(PartitionLoadFrequency partitionLoadFrequency) {
        this.partitionLoadFrequency = partitionLoadFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The start date for the partition.
     * </p>
     * 
     * @param partitionStartDate
     *        The start date for the partition.
     */

    public void setPartitionStartDate(java.util.Date partitionStartDate) {
        this.partitionStartDate = partitionStartDate;
    }

    /**
     * <p>
     * The start date for the partition.
     * </p>
     * 
     * @return The start date for the partition.
     */

    public java.util.Date getPartitionStartDate() {
        return this.partitionStartDate;
    }

    /**
     * <p>
     * The start date for the partition.
     * </p>
     * 
     * @param partitionStartDate
     *        The start date for the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaIntegration withPartitionStartDate(java.util.Date partitionStartDate) {
        setPartitionStartDate(partitionStartDate);
        return this;
    }

    /**
     * <p>
     * The end date for the partition.
     * </p>
     * 
     * @param partitionEndDate
     *        The end date for the partition.
     */

    public void setPartitionEndDate(java.util.Date partitionEndDate) {
        this.partitionEndDate = partitionEndDate;
    }

    /**
     * <p>
     * The end date for the partition.
     * </p>
     * 
     * @return The end date for the partition.
     */

    public java.util.Date getPartitionEndDate() {
        return this.partitionEndDate;
    }

    /**
     * <p>
     * The end date for the partition.
     * </p>
     * 
     * @param partitionEndDate
     *        The end date for the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AthenaIntegration withPartitionEndDate(java.util.Date partitionEndDate) {
        setPartitionEndDate(partitionEndDate);
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
        if (getIntegrationResultS3DestinationArn() != null)
            sb.append("IntegrationResultS3DestinationArn: ").append(getIntegrationResultS3DestinationArn()).append(",");
        if (getPartitionLoadFrequency() != null)
            sb.append("PartitionLoadFrequency: ").append(getPartitionLoadFrequency()).append(",");
        if (getPartitionStartDate() != null)
            sb.append("PartitionStartDate: ").append(getPartitionStartDate()).append(",");
        if (getPartitionEndDate() != null)
            sb.append("PartitionEndDate: ").append(getPartitionEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AthenaIntegration == false)
            return false;
        AthenaIntegration other = (AthenaIntegration) obj;
        if (other.getIntegrationResultS3DestinationArn() == null ^ this.getIntegrationResultS3DestinationArn() == null)
            return false;
        if (other.getIntegrationResultS3DestinationArn() != null
                && other.getIntegrationResultS3DestinationArn().equals(this.getIntegrationResultS3DestinationArn()) == false)
            return false;
        if (other.getPartitionLoadFrequency() == null ^ this.getPartitionLoadFrequency() == null)
            return false;
        if (other.getPartitionLoadFrequency() != null && other.getPartitionLoadFrequency().equals(this.getPartitionLoadFrequency()) == false)
            return false;
        if (other.getPartitionStartDate() == null ^ this.getPartitionStartDate() == null)
            return false;
        if (other.getPartitionStartDate() != null && other.getPartitionStartDate().equals(this.getPartitionStartDate()) == false)
            return false;
        if (other.getPartitionEndDate() == null ^ this.getPartitionEndDate() == null)
            return false;
        if (other.getPartitionEndDate() != null && other.getPartitionEndDate().equals(this.getPartitionEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegrationResultS3DestinationArn() == null) ? 0 : getIntegrationResultS3DestinationArn().hashCode());
        hashCode = prime * hashCode + ((getPartitionLoadFrequency() == null) ? 0 : getPartitionLoadFrequency().hashCode());
        hashCode = prime * hashCode + ((getPartitionStartDate() == null) ? 0 : getPartitionStartDate().hashCode());
        hashCode = prime * hashCode + ((getPartitionEndDate() == null) ? 0 : getPartitionEndDate().hashCode());
        return hashCode;
    }

    @Override
    public AthenaIntegration clone() {
        try {
            return (AthenaIntegration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
