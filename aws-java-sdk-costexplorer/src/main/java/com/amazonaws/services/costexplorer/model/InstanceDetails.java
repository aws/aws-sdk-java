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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the instances that AWS recommends that you purchase.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/InstanceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     */
    private EC2InstanceDetails eC2InstanceDetails;
    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     */
    private RDSInstanceDetails rDSInstanceDetails;
    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     */
    private RedshiftInstanceDetails redshiftInstanceDetails;
    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     */
    private ElastiCacheInstanceDetails elastiCacheInstanceDetails;
    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     */
    private ESInstanceDetails eSInstanceDetails;

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param eC2InstanceDetails
     *        The Amazon EC2 instances that AWS recommends that you purchase.
     */

    public void setEC2InstanceDetails(EC2InstanceDetails eC2InstanceDetails) {
        this.eC2InstanceDetails = eC2InstanceDetails;
    }

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return The Amazon EC2 instances that AWS recommends that you purchase.
     */

    public EC2InstanceDetails getEC2InstanceDetails() {
        return this.eC2InstanceDetails;
    }

    /**
     * <p>
     * The Amazon EC2 instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param eC2InstanceDetails
     *        The Amazon EC2 instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withEC2InstanceDetails(EC2InstanceDetails eC2InstanceDetails) {
        setEC2InstanceDetails(eC2InstanceDetails);
        return this;
    }

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param rDSInstanceDetails
     *        The Amazon RDS instances that AWS recommends that you purchase.
     */

    public void setRDSInstanceDetails(RDSInstanceDetails rDSInstanceDetails) {
        this.rDSInstanceDetails = rDSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return The Amazon RDS instances that AWS recommends that you purchase.
     */

    public RDSInstanceDetails getRDSInstanceDetails() {
        return this.rDSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon RDS instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param rDSInstanceDetails
     *        The Amazon RDS instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withRDSInstanceDetails(RDSInstanceDetails rDSInstanceDetails) {
        setRDSInstanceDetails(rDSInstanceDetails);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param redshiftInstanceDetails
     *        The Amazon Redshift instances that AWS recommends that you purchase.
     */

    public void setRedshiftInstanceDetails(RedshiftInstanceDetails redshiftInstanceDetails) {
        this.redshiftInstanceDetails = redshiftInstanceDetails;
    }

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return The Amazon Redshift instances that AWS recommends that you purchase.
     */

    public RedshiftInstanceDetails getRedshiftInstanceDetails() {
        return this.redshiftInstanceDetails;
    }

    /**
     * <p>
     * The Amazon Redshift instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param redshiftInstanceDetails
     *        The Amazon Redshift instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withRedshiftInstanceDetails(RedshiftInstanceDetails redshiftInstanceDetails) {
        setRedshiftInstanceDetails(redshiftInstanceDetails);
        return this;
    }

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param elastiCacheInstanceDetails
     *        The ElastiCache instances that AWS recommends that you purchase.
     */

    public void setElastiCacheInstanceDetails(ElastiCacheInstanceDetails elastiCacheInstanceDetails) {
        this.elastiCacheInstanceDetails = elastiCacheInstanceDetails;
    }

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return The ElastiCache instances that AWS recommends that you purchase.
     */

    public ElastiCacheInstanceDetails getElastiCacheInstanceDetails() {
        return this.elastiCacheInstanceDetails;
    }

    /**
     * <p>
     * The ElastiCache instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param elastiCacheInstanceDetails
     *        The ElastiCache instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withElastiCacheInstanceDetails(ElastiCacheInstanceDetails elastiCacheInstanceDetails) {
        setElastiCacheInstanceDetails(elastiCacheInstanceDetails);
        return this;
    }

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param eSInstanceDetails
     *        The Amazon ES instances that AWS recommends that you purchase.
     */

    public void setESInstanceDetails(ESInstanceDetails eSInstanceDetails) {
        this.eSInstanceDetails = eSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return The Amazon ES instances that AWS recommends that you purchase.
     */

    public ESInstanceDetails getESInstanceDetails() {
        return this.eSInstanceDetails;
    }

    /**
     * <p>
     * The Amazon ES instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param eSInstanceDetails
     *        The Amazon ES instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceDetails withESInstanceDetails(ESInstanceDetails eSInstanceDetails) {
        setESInstanceDetails(eSInstanceDetails);
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
        if (getEC2InstanceDetails() != null)
            sb.append("EC2InstanceDetails: ").append(getEC2InstanceDetails()).append(",");
        if (getRDSInstanceDetails() != null)
            sb.append("RDSInstanceDetails: ").append(getRDSInstanceDetails()).append(",");
        if (getRedshiftInstanceDetails() != null)
            sb.append("RedshiftInstanceDetails: ").append(getRedshiftInstanceDetails()).append(",");
        if (getElastiCacheInstanceDetails() != null)
            sb.append("ElastiCacheInstanceDetails: ").append(getElastiCacheInstanceDetails()).append(",");
        if (getESInstanceDetails() != null)
            sb.append("ESInstanceDetails: ").append(getESInstanceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceDetails == false)
            return false;
        InstanceDetails other = (InstanceDetails) obj;
        if (other.getEC2InstanceDetails() == null ^ this.getEC2InstanceDetails() == null)
            return false;
        if (other.getEC2InstanceDetails() != null && other.getEC2InstanceDetails().equals(this.getEC2InstanceDetails()) == false)
            return false;
        if (other.getRDSInstanceDetails() == null ^ this.getRDSInstanceDetails() == null)
            return false;
        if (other.getRDSInstanceDetails() != null && other.getRDSInstanceDetails().equals(this.getRDSInstanceDetails()) == false)
            return false;
        if (other.getRedshiftInstanceDetails() == null ^ this.getRedshiftInstanceDetails() == null)
            return false;
        if (other.getRedshiftInstanceDetails() != null && other.getRedshiftInstanceDetails().equals(this.getRedshiftInstanceDetails()) == false)
            return false;
        if (other.getElastiCacheInstanceDetails() == null ^ this.getElastiCacheInstanceDetails() == null)
            return false;
        if (other.getElastiCacheInstanceDetails() != null && other.getElastiCacheInstanceDetails().equals(this.getElastiCacheInstanceDetails()) == false)
            return false;
        if (other.getESInstanceDetails() == null ^ this.getESInstanceDetails() == null)
            return false;
        if (other.getESInstanceDetails() != null && other.getESInstanceDetails().equals(this.getESInstanceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2InstanceDetails() == null) ? 0 : getEC2InstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getRDSInstanceDetails() == null) ? 0 : getRDSInstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getRedshiftInstanceDetails() == null) ? 0 : getRedshiftInstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getElastiCacheInstanceDetails() == null) ? 0 : getElastiCacheInstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getESInstanceDetails() == null) ? 0 : getESInstanceDetails().hashCode());
        return hashCode;
    }

    @Override
    public InstanceDetails clone() {
        try {
            return (InstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.InstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
