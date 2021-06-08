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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile properties required when using Snowflake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SnowflakeConnectorProfileProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Snowflake warehouse.
     * </p>
     */
    private String warehouse;
    /**
     * <p>
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account.
     * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * The name of the Amazon S3 bucket associated with Snowflake.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * The Snowflake Private Link service name to be used for private data transfers.
     * </p>
     */
    private String privateLinkServiceName;
    /**
     * <p>
     * The name of the account.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The AWS Region of the Snowflake account.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The name of the Snowflake warehouse.
     * </p>
     * 
     * @param warehouse
     *        The name of the Snowflake warehouse.
     */

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * <p>
     * The name of the Snowflake warehouse.
     * </p>
     * 
     * @return The name of the Snowflake warehouse.
     */

    public String getWarehouse() {
        return this.warehouse;
    }

    /**
     * <p>
     * The name of the Snowflake warehouse.
     * </p>
     * 
     * @param warehouse
     *        The name of the Snowflake warehouse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withWarehouse(String warehouse) {
        setWarehouse(warehouse);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account.
     * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * </p>
     * 
     * @param stage
     *        The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake
     *        account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account.
     * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * </p>
     * 
     * @return The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake
     *         account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account.
     * This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * </p>
     * 
     * @param stage
     *        The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake
     *        account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket associated with Snowflake.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket associated with Snowflake.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket associated with Snowflake.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket associated with Snowflake.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket associated with Snowflake.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket associated with Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * </p>
     * 
     * @param bucketPrefix
     *        The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * </p>
     * 
     * @return The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * </p>
     * 
     * @param bucketPrefix
     *        The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * The Snowflake Private Link service name to be used for private data transfers.
     * </p>
     * 
     * @param privateLinkServiceName
     *        The Snowflake Private Link service name to be used for private data transfers.
     */

    public void setPrivateLinkServiceName(String privateLinkServiceName) {
        this.privateLinkServiceName = privateLinkServiceName;
    }

    /**
     * <p>
     * The Snowflake Private Link service name to be used for private data transfers.
     * </p>
     * 
     * @return The Snowflake Private Link service name to be used for private data transfers.
     */

    public String getPrivateLinkServiceName() {
        return this.privateLinkServiceName;
    }

    /**
     * <p>
     * The Snowflake Private Link service name to be used for private data transfers.
     * </p>
     * 
     * @param privateLinkServiceName
     *        The Snowflake Private Link service name to be used for private data transfers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withPrivateLinkServiceName(String privateLinkServiceName) {
        setPrivateLinkServiceName(privateLinkServiceName);
        return this;
    }

    /**
     * <p>
     * The name of the account.
     * </p>
     * 
     * @param accountName
     *        The name of the account.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The name of the account.
     * </p>
     * 
     * @return The name of the account.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The name of the account.
     * </p>
     * 
     * @param accountName
     *        The name of the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The AWS Region of the Snowflake account.
     * </p>
     * 
     * @param region
     *        The AWS Region of the Snowflake account.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region of the Snowflake account.
     * </p>
     * 
     * @return The AWS Region of the Snowflake account.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region of the Snowflake account.
     * </p>
     * 
     * @param region
     *        The AWS Region of the Snowflake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeConnectorProfileProperties withRegion(String region) {
        setRegion(region);
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
        if (getWarehouse() != null)
            sb.append("Warehouse: ").append(getWarehouse()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getPrivateLinkServiceName() != null)
            sb.append("PrivateLinkServiceName: ").append(getPrivateLinkServiceName()).append(",");
        if (getAccountName() != null)
            sb.append("AccountName: ").append(getAccountName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeConnectorProfileProperties == false)
            return false;
        SnowflakeConnectorProfileProperties other = (SnowflakeConnectorProfileProperties) obj;
        if (other.getWarehouse() == null ^ this.getWarehouse() == null)
            return false;
        if (other.getWarehouse() != null && other.getWarehouse().equals(this.getWarehouse()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getPrivateLinkServiceName() == null ^ this.getPrivateLinkServiceName() == null)
            return false;
        if (other.getPrivateLinkServiceName() != null && other.getPrivateLinkServiceName().equals(this.getPrivateLinkServiceName()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWarehouse() == null) ? 0 : getWarehouse().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getPrivateLinkServiceName() == null) ? 0 : getPrivateLinkServiceName().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeConnectorProfileProperties clone() {
        try {
            return (SnowflakeConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SnowflakeConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
