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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/UpdateDbInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDbInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The id of the DB instance.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     */
    private LogDeliveryConfiguration logDeliveryConfiguration;
    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     */
    private String dbParameterGroupIdentifier;

    /**
     * <p>
     * The id of the DB instance.
     * </p>
     * 
     * @param identifier
     *        The id of the DB instance.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The id of the DB instance.
     * </p>
     * 
     * @return The id of the DB instance.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The id of the DB instance.
     * </p>
     * 
     * @param identifier
     *        The id of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     */

    public void setLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        this.logDeliveryConfiguration = logDeliveryConfiguration;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     * 
     * @return Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     */

    public LogDeliveryConfiguration getLogDeliveryConfiguration() {
        return this.logDeliveryConfiguration;
    }

    /**
     * <p>
     * Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * </p>
     * 
     * @param logDeliveryConfiguration
     *        Configuration for sending InfluxDB engine logs to send to specified S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceRequest withLogDeliveryConfiguration(LogDeliveryConfiguration logDeliveryConfiguration) {
        setLogDeliveryConfiguration(logDeliveryConfiguration);
        return this;
    }

    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     * 
     * @param dbParameterGroupIdentifier
     *        The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the
     *        database is configured. For example, DB parameter groups can specify the limit for query concurrency.
     */

    public void setDbParameterGroupIdentifier(String dbParameterGroupIdentifier) {
        this.dbParameterGroupIdentifier = dbParameterGroupIdentifier;
    }

    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     * 
     * @return The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the
     *         database is configured. For example, DB parameter groups can specify the limit for query concurrency.
     */

    public String getDbParameterGroupIdentifier() {
        return this.dbParameterGroupIdentifier;
    }

    /**
     * <p>
     * The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the database is
     * configured. For example, DB parameter groups can specify the limit for query concurrency.
     * </p>
     * 
     * @param dbParameterGroupIdentifier
     *        The id of the DB parameter group to assign to your DB instance. DB parameter groups specify how the
     *        database is configured. For example, DB parameter groups can specify the limit for query concurrency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDbInstanceRequest withDbParameterGroupIdentifier(String dbParameterGroupIdentifier) {
        setDbParameterGroupIdentifier(dbParameterGroupIdentifier);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getLogDeliveryConfiguration() != null)
            sb.append("LogDeliveryConfiguration: ").append(getLogDeliveryConfiguration()).append(",");
        if (getDbParameterGroupIdentifier() != null)
            sb.append("DbParameterGroupIdentifier: ").append(getDbParameterGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDbInstanceRequest == false)
            return false;
        UpdateDbInstanceRequest other = (UpdateDbInstanceRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getLogDeliveryConfiguration() == null ^ this.getLogDeliveryConfiguration() == null)
            return false;
        if (other.getLogDeliveryConfiguration() != null && other.getLogDeliveryConfiguration().equals(this.getLogDeliveryConfiguration()) == false)
            return false;
        if (other.getDbParameterGroupIdentifier() == null ^ this.getDbParameterGroupIdentifier() == null)
            return false;
        if (other.getDbParameterGroupIdentifier() != null && other.getDbParameterGroupIdentifier().equals(this.getDbParameterGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLogDeliveryConfiguration() == null) ? 0 : getLogDeliveryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDbParameterGroupIdentifier() == null) ? 0 : getDbParameterGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDbInstanceRequest clone() {
        return (UpdateDbInstanceRequest) super.clone();
    }

}
