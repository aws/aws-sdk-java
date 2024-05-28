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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a summary of a DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/DbInstanceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DbInstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service-generated unique identifier of the DB instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the DB instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The Timestream for InfluxDB instance type to run InfluxDB on.
     * </p>
     */
    private String dbInstanceType;
    /**
     * <p>
     * The storage type for your DB instance.
     * </p>
     */
    private String dbStorageType;
    /**
     * <p>
     * The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Single-Instance or with a MultiAZ Standby for High availability.
     * </p>
     */
    private String deploymentType;

    /**
     * <p>
     * The service-generated unique identifier of the DB instance.
     * </p>
     * 
     * @param id
     *        The service-generated unique identifier of the DB instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The service-generated unique identifier of the DB instance.
     * </p>
     * 
     * @return The service-generated unique identifier of the DB instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The service-generated unique identifier of the DB instance.
     * </p>
     * 
     * @param id
     *        The service-generated unique identifier of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DbInstanceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     * 
     * @param name
     *        This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon
     *        Timestream for InfluxDB API and AWS CLI commands.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     * 
     * @return This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon
     *         Timestream for InfluxDB API and AWS CLI commands.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon Timestream for
     * InfluxDB API and AWS CLI commands.
     * </p>
     * 
     * @param name
     *        This customer-supplied name uniquely identifies the DB instance when interacting with the Amazon
     *        Timestream for InfluxDB API and AWS CLI commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DbInstanceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the DB instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DB instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DbInstanceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the DB instance.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @return The status of the DB instance.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DbInstanceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the DB instance.
     * </p>
     * 
     * @param status
     *        The status of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DbInstanceSummary withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     * 
     * @param endpoint
     *        The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     * 
     * @return The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * </p>
     * 
     * @param endpoint
     *        The endpoint used to connect to InfluxDB. The default InfluxDB port is 8086.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DbInstanceSummary withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type to run InfluxDB on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB instance type to run InfluxDB on.
     * @see DbInstanceType
     */

    public void setDbInstanceType(String dbInstanceType) {
        this.dbInstanceType = dbInstanceType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type to run InfluxDB on.
     * </p>
     * 
     * @return The Timestream for InfluxDB instance type to run InfluxDB on.
     * @see DbInstanceType
     */

    public String getDbInstanceType() {
        return this.dbInstanceType;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type to run InfluxDB on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB instance type to run InfluxDB on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbInstanceType
     */

    public DbInstanceSummary withDbInstanceType(String dbInstanceType) {
        setDbInstanceType(dbInstanceType);
        return this;
    }

    /**
     * <p>
     * The Timestream for InfluxDB instance type to run InfluxDB on.
     * </p>
     * 
     * @param dbInstanceType
     *        The Timestream for InfluxDB instance type to run InfluxDB on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbInstanceType
     */

    public DbInstanceSummary withDbInstanceType(DbInstanceType dbInstanceType) {
        this.dbInstanceType = dbInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The storage type for your DB instance.
     * </p>
     * 
     * @param dbStorageType
     *        The storage type for your DB instance.
     * @see DbStorageType
     */

    public void setDbStorageType(String dbStorageType) {
        this.dbStorageType = dbStorageType;
    }

    /**
     * <p>
     * The storage type for your DB instance.
     * </p>
     * 
     * @return The storage type for your DB instance.
     * @see DbStorageType
     */

    public String getDbStorageType() {
        return this.dbStorageType;
    }

    /**
     * <p>
     * The storage type for your DB instance.
     * </p>
     * 
     * @param dbStorageType
     *        The storage type for your DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbStorageType
     */

    public DbInstanceSummary withDbStorageType(String dbStorageType) {
        setDbStorageType(dbStorageType);
        return this;
    }

    /**
     * <p>
     * The storage type for your DB instance.
     * </p>
     * 
     * @param dbStorageType
     *        The storage type for your DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DbStorageType
     */

    public DbInstanceSummary withDbStorageType(DbStorageType dbStorageType) {
        this.dbStorageType = dbStorageType.toString();
        return this;
    }

    /**
     * <p>
     * The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     * </p>
     * 
     * @return The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage to allocate for your DbStorageType in GiB (gibibytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DbInstanceSummary withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Single-Instance or with a MultiAZ Standby for High availability.
     * </p>
     * 
     * @param deploymentType
     *        Single-Instance or with a MultiAZ Standby for High availability.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Single-Instance or with a MultiAZ Standby for High availability.
     * </p>
     * 
     * @return Single-Instance or with a MultiAZ Standby for High availability.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Single-Instance or with a MultiAZ Standby for High availability.
     * </p>
     * 
     * @param deploymentType
     *        Single-Instance or with a MultiAZ Standby for High availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public DbInstanceSummary withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Single-Instance or with a MultiAZ Standby for High availability.
     * </p>
     * 
     * @param deploymentType
     *        Single-Instance or with a MultiAZ Standby for High availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public DbInstanceSummary withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getDbInstanceType() != null)
            sb.append("DbInstanceType: ").append(getDbInstanceType()).append(",");
        if (getDbStorageType() != null)
            sb.append("DbStorageType: ").append(getDbStorageType()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DbInstanceSummary == false)
            return false;
        DbInstanceSummary other = (DbInstanceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getDbInstanceType() == null ^ this.getDbInstanceType() == null)
            return false;
        if (other.getDbInstanceType() != null && other.getDbInstanceType().equals(this.getDbInstanceType()) == false)
            return false;
        if (other.getDbStorageType() == null ^ this.getDbStorageType() == null)
            return false;
        if (other.getDbStorageType() != null && other.getDbStorageType().equals(this.getDbStorageType()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceType() == null) ? 0 : getDbInstanceType().hashCode());
        hashCode = prime * hashCode + ((getDbStorageType() == null) ? 0 : getDbStorageType().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        return hashCode;
    }

    @Override
    public DbInstanceSummary clone() {
        try {
            return (DbInstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreaminfluxdb.model.transform.DbInstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
