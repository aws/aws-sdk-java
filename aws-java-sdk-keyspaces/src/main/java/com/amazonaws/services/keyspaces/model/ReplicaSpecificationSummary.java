/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Region-specific settings of a multi-Region table in the specified Amazon Web Services Region.
 * </p>
 * <p>
 * If the multi-Region table is using provisioned capacity and has optional auto scaling policies configured, note that
 * the Region specific summary returns both read and write capacity settings. But only Region specific read capacity
 * settings can be configured for a multi-Region table. In a multi-Region table, your write capacity units will be
 * synced across all Amazon Web Services Regions to ensure that there is enough capacity to replicate write events
 * across Regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ReplicaSpecificationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaSpecificationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The status of the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     */
    private String status;

    private CapacitySpecificationSummary capacitySpecification;

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Web Services Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSpecificationSummary withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The status of the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param status
     *        The status of the multi-Region table in the specified Amazon Web Services Region.
     * @see TableStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @return The status of the multi-Region table in the specified Amazon Web Services Region.
     * @see TableStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param status
     *        The status of the multi-Region table in the specified Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public ReplicaSpecificationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param status
     *        The status of the multi-Region table in the specified Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public ReplicaSpecificationSummary withStatus(TableStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param capacitySpecification
     */

    public void setCapacitySpecification(CapacitySpecificationSummary capacitySpecification) {
        this.capacitySpecification = capacitySpecification;
    }

    /**
     * @return
     */

    public CapacitySpecificationSummary getCapacitySpecification() {
        return this.capacitySpecification;
    }

    /**
     * @param capacitySpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSpecificationSummary withCapacitySpecification(CapacitySpecificationSummary capacitySpecification) {
        setCapacitySpecification(capacitySpecification);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCapacitySpecification() != null)
            sb.append("CapacitySpecification: ").append(getCapacitySpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaSpecificationSummary == false)
            return false;
        ReplicaSpecificationSummary other = (ReplicaSpecificationSummary) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCapacitySpecification() == null ^ this.getCapacitySpecification() == null)
            return false;
        if (other.getCapacitySpecification() != null && other.getCapacitySpecification().equals(this.getCapacitySpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCapacitySpecification() == null) ? 0 : getCapacitySpecification().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaSpecificationSummary clone() {
        try {
            return (ReplicaSpecificationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.ReplicaSpecificationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
