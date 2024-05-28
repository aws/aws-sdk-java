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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBShardGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBShardGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     * </p>
     */
    private String dBShardGroupResourceId;
    /**
     * <p>
     * The name of the DB shard group.
     * </p>
     */
    private String dBShardGroupIdentifier;
    /**
     * <p>
     * The name of the primary DB cluster for the DB shard group.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     */
    private Double maxACU;
    /**
     * <p>
     * Specifies whether to create standby instances for the DB shard group. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the only one
     * supported for the preview.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each physical
     * shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     * </p>
     * </li>
     * </ul>
     */
    private Integer computeRedundancy;
    /**
     * <p>
     * The status of the DB shard group.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether the DB shard group is publicly accessible.
     * </p>
     * <p>
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB shard group's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled by the security group
     * it uses. That public access isn't permitted if the security group assigned to the DB shard group doesn't permit
     * it.
     * </p>
     * <p>
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that resolves
     * to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBShardGroup</a>.
     * </p>
     * <p>
     * This setting is only for Aurora Limitless Database.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The connection endpoint for the DB shard group.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     * </p>
     * 
     * @param dBShardGroupResourceId
     *        The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     */

    public void setDBShardGroupResourceId(String dBShardGroupResourceId) {
        this.dBShardGroupResourceId = dBShardGroupResourceId;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     * </p>
     * 
     * @return The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     */

    public String getDBShardGroupResourceId() {
        return this.dBShardGroupResourceId;
    }

    /**
     * <p>
     * The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     * </p>
     * 
     * @param dBShardGroupResourceId
     *        The Amazon Web Services Region-unique, immutable identifier for the DB shard group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withDBShardGroupResourceId(String dBShardGroupResourceId) {
        setDBShardGroupResourceId(dBShardGroupResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the DB shard group.
     * </p>
     * 
     * @param dBShardGroupIdentifier
     *        The name of the DB shard group.
     */

    public void setDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        this.dBShardGroupIdentifier = dBShardGroupIdentifier;
    }

    /**
     * <p>
     * The name of the DB shard group.
     * </p>
     * 
     * @return The name of the DB shard group.
     */

    public String getDBShardGroupIdentifier() {
        return this.dBShardGroupIdentifier;
    }

    /**
     * <p>
     * The name of the DB shard group.
     * </p>
     * 
     * @param dBShardGroupIdentifier
     *        The name of the DB shard group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        setDBShardGroupIdentifier(dBShardGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the primary DB cluster for the DB shard group.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the primary DB cluster for the DB shard group.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the primary DB cluster for the DB shard group.
     * </p>
     * 
     * @return The name of the primary DB cluster for the DB shard group.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the primary DB cluster for the DB shard group.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the primary DB cluster for the DB shard group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     * 
     * @param maxACU
     *        The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     */

    public void setMaxACU(Double maxACU) {
        this.maxACU = maxACU;
    }

    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     * 
     * @return The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     */

    public Double getMaxACU() {
        return this.maxACU;
    }

    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     * 
     * @param maxACU
     *        The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withMaxACU(Double maxACU) {
        setMaxACU(maxACU);
        return this;
    }

    /**
     * <p>
     * Specifies whether to create standby instances for the DB shard group. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the only one
     * supported for the preview.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each physical
     * shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeRedundancy
     *        Specifies whether to create standby instances for the DB shard group. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the only
     *        one supported for the preview.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each
     *        physical shard.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     *        </p>
     *        </li>
     */

    public void setComputeRedundancy(Integer computeRedundancy) {
        this.computeRedundancy = computeRedundancy;
    }

    /**
     * <p>
     * Specifies whether to create standby instances for the DB shard group. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the only one
     * supported for the preview.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each physical
     * shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to create standby instances for the DB shard group. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the
     *         only one supported for the preview.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each
     *         physical shard.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     *         </p>
     *         </li>
     */

    public Integer getComputeRedundancy() {
        return this.computeRedundancy;
    }

    /**
     * <p>
     * Specifies whether to create standby instances for the DB shard group. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the only one
     * supported for the preview.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each physical
     * shard.
     * </p>
     * </li>
     * <li>
     * <p>
     * 2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeRedundancy
     *        Specifies whether to create standby instances for the DB shard group. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - Creates a single, primary DB instance for each physical shard. This is the default value, and the only
     *        one supported for the preview.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1 - Creates a primary DB instance and a standby instance in a different Availability Zone (AZ) for each
     *        physical shard.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        2 - Creates a primary DB instance and two standby instances in different AZs for each physical shard.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withComputeRedundancy(Integer computeRedundancy) {
        setComputeRedundancy(computeRedundancy);
        return this;
    }

    /**
     * <p>
     * The status of the DB shard group.
     * </p>
     * 
     * @param status
     *        The status of the DB shard group.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB shard group.
     * </p>
     * 
     * @return The status of the DB shard group.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB shard group.
     * </p>
     * 
     * @param status
     *        The status of the DB shard group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB shard group is publicly accessible.
     * </p>
     * <p>
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB shard group's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled by the security group
     * it uses. That public access isn't permitted if the security group assigned to the DB shard group doesn't permit
     * it.
     * </p>
     * <p>
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that resolves
     * to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBShardGroup</a>.
     * </p>
     * <p>
     * This setting is only for Aurora Limitless Database.
     * </p>
     * 
     * @param publiclyAccessible
     *        Indicates whether the DB shard group is publicly accessible.</p>
     *        <p>
     *        When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the
     *        private IP address from within the DB shard group's virtual private cloud (VPC). It resolves to the public
     *        IP address from outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled
     *        by the security group it uses. That public access isn't permitted if the security group assigned to the DB
     *        shard group doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        For more information, see <a>CreateDBShardGroup</a>.
     *        </p>
     *        <p>
     *        This setting is only for Aurora Limitless Database.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Indicates whether the DB shard group is publicly accessible.
     * </p>
     * <p>
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB shard group's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled by the security group
     * it uses. That public access isn't permitted if the security group assigned to the DB shard group doesn't permit
     * it.
     * </p>
     * <p>
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that resolves
     * to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBShardGroup</a>.
     * </p>
     * <p>
     * This setting is only for Aurora Limitless Database.
     * </p>
     * 
     * @return Indicates whether the DB shard group is publicly accessible.</p>
     *         <p>
     *         When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the
     *         private IP address from within the DB shard group's virtual private cloud (VPC). It resolves to the
     *         public IP address from outside of the DB shard group's VPC. Access to the DB shard group is ultimately
     *         controlled by the security group it uses. That public access isn't permitted if the security group
     *         assigned to the DB shard group doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBShardGroup</a>.
     *         </p>
     *         <p>
     *         This setting is only for Aurora Limitless Database.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Indicates whether the DB shard group is publicly accessible.
     * </p>
     * <p>
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB shard group's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled by the security group
     * it uses. That public access isn't permitted if the security group assigned to the DB shard group doesn't permit
     * it.
     * </p>
     * <p>
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that resolves
     * to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBShardGroup</a>.
     * </p>
     * <p>
     * This setting is only for Aurora Limitless Database.
     * </p>
     * 
     * @param publiclyAccessible
     *        Indicates whether the DB shard group is publicly accessible.</p>
     *        <p>
     *        When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the
     *        private IP address from within the DB shard group's virtual private cloud (VPC). It resolves to the public
     *        IP address from outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled
     *        by the security group it uses. That public access isn't permitted if the security group assigned to the DB
     *        shard group doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        For more information, see <a>CreateDBShardGroup</a>.
     *        </p>
     *        <p>
     *        This setting is only for Aurora Limitless Database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB shard group is publicly accessible.
     * </p>
     * <p>
     * When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB shard group's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB shard group's VPC. Access to the DB shard group is ultimately controlled by the security group
     * it uses. That public access isn't permitted if the security group assigned to the DB shard group doesn't permit
     * it.
     * </p>
     * <p>
     * When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that resolves
     * to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBShardGroup</a>.
     * </p>
     * <p>
     * This setting is only for Aurora Limitless Database.
     * </p>
     * 
     * @return Indicates whether the DB shard group is publicly accessible.</p>
     *         <p>
     *         When the DB shard group is publicly accessible, its Domain Name System (DNS) endpoint resolves to the
     *         private IP address from within the DB shard group's virtual private cloud (VPC). It resolves to the
     *         public IP address from outside of the DB shard group's VPC. Access to the DB shard group is ultimately
     *         controlled by the security group it uses. That public access isn't permitted if the security group
     *         assigned to the DB shard group doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB shard group isn't publicly accessible, it is an internal DB shard group with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBShardGroup</a>.
     *         </p>
     *         <p>
     *         This setting is only for Aurora Limitless Database.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The connection endpoint for the DB shard group.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint for the DB shard group.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The connection endpoint for the DB shard group.
     * </p>
     * 
     * @return The connection endpoint for the DB shard group.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The connection endpoint for the DB shard group.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint for the DB shard group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBShardGroupResult withEndpoint(String endpoint) {
        setEndpoint(endpoint);
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
        if (getDBShardGroupResourceId() != null)
            sb.append("DBShardGroupResourceId: ").append(getDBShardGroupResourceId()).append(",");
        if (getDBShardGroupIdentifier() != null)
            sb.append("DBShardGroupIdentifier: ").append(getDBShardGroupIdentifier()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getMaxACU() != null)
            sb.append("MaxACU: ").append(getMaxACU()).append(",");
        if (getComputeRedundancy() != null)
            sb.append("ComputeRedundancy: ").append(getComputeRedundancy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBShardGroupResult == false)
            return false;
        CreateDBShardGroupResult other = (CreateDBShardGroupResult) obj;
        if (other.getDBShardGroupResourceId() == null ^ this.getDBShardGroupResourceId() == null)
            return false;
        if (other.getDBShardGroupResourceId() != null && other.getDBShardGroupResourceId().equals(this.getDBShardGroupResourceId()) == false)
            return false;
        if (other.getDBShardGroupIdentifier() == null ^ this.getDBShardGroupIdentifier() == null)
            return false;
        if (other.getDBShardGroupIdentifier() != null && other.getDBShardGroupIdentifier().equals(this.getDBShardGroupIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getMaxACU() == null ^ this.getMaxACU() == null)
            return false;
        if (other.getMaxACU() != null && other.getMaxACU().equals(this.getMaxACU()) == false)
            return false;
        if (other.getComputeRedundancy() == null ^ this.getComputeRedundancy() == null)
            return false;
        if (other.getComputeRedundancy() != null && other.getComputeRedundancy().equals(this.getComputeRedundancy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBShardGroupResourceId() == null) ? 0 : getDBShardGroupResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBShardGroupIdentifier() == null) ? 0 : getDBShardGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxACU() == null) ? 0 : getMaxACU().hashCode());
        hashCode = prime * hashCode + ((getComputeRedundancy() == null) ? 0 : getComputeRedundancy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBShardGroupResult clone() {
        try {
            return (CreateDBShardGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
