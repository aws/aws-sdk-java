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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateResourceDataSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceDataSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the configuration.
     * </p>
     */
    private String syncName;
    /**
     * <p>
     * Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is
     * SyncToDestination.
     * </p>
     */
    private ResourceDataSyncS3Destination s3Destination;
    /**
     * <p>
     * Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for
     * Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>
     * . Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple
     * AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>
     * , you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.
     * </p>
     */
    private String syncType;
    /**
     * <p>
     * Specify information about the data sources to synchronize. This parameter is required if the
     * <code>SyncType</code> value is SyncFromSource.
     * </p>
     */
    private ResourceDataSyncSource syncSource;

    /**
     * <p>
     * A name for the configuration.
     * </p>
     * 
     * @param syncName
     *        A name for the configuration.
     */

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * A name for the configuration.
     * </p>
     * 
     * @return A name for the configuration.
     */

    public String getSyncName() {
        return this.syncName;
    }

    /**
     * <p>
     * A name for the configuration.
     * </p>
     * 
     * @param syncName
     *        A name for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDataSyncRequest withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

    /**
     * <p>
     * Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is
     * SyncToDestination.
     * </p>
     * 
     * @param s3Destination
     *        Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code>
     *        value is SyncToDestination.
     */

    public void setS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is
     * SyncToDestination.
     * </p>
     * 
     * @return Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code>
     *         value is SyncToDestination.
     */

    public ResourceDataSyncS3Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code> value is
     * SyncToDestination.
     * </p>
     * 
     * @param s3Destination
     *        Amazon S3 configuration details for the sync. This parameter is required if the <code>SyncType</code>
     *        value is SyncToDestination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDataSyncRequest withS3Destination(ResourceDataSyncS3Destination s3Destination) {
        setS3Destination(s3Destination);
        return this;
    }

    /**
     * <p>
     * Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for
     * Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>
     * . Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple
     * AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>
     * , you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.
     * </p>
     * 
     * @param syncType
     *        Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3
     *        bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for
     *        <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account
     *        and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer.
     *        If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The
     *        default value is <code>SyncToDestination</code>.
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for
     * Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>
     * . Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple
     * AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>
     * , you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.
     * </p>
     * 
     * @return Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3
     *         bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for
     *         <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account
     *         and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer.
     *         If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The
     *         default value is <code>SyncToDestination</code>.
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3 bucket for
     * Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for <code>S3Destination</code>
     * . Specify <code>SyncFromSource</code> to synchronize data from a single account and multiple Regions, or multiple
     * AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify <code>SyncFromSource</code>
     * , you must provide a value for <code>SyncSource</code>. The default value is <code>SyncToDestination</code>.
     * </p>
     * 
     * @param syncType
     *        Specify <code>SyncToDestination</code> to create a resource data sync that synchronizes data to an S3
     *        bucket for Inventory. If you specify <code>SyncToDestination</code>, you must provide a value for
     *        <code>S3Destination</code>. Specify <code>SyncFromSource</code> to synchronize data from a single account
     *        and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer.
     *        If you specify <code>SyncFromSource</code>, you must provide a value for <code>SyncSource</code>. The
     *        default value is <code>SyncToDestination</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDataSyncRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * Specify information about the data sources to synchronize. This parameter is required if the
     * <code>SyncType</code> value is SyncFromSource.
     * </p>
     * 
     * @param syncSource
     *        Specify information about the data sources to synchronize. This parameter is required if the
     *        <code>SyncType</code> value is SyncFromSource.
     */

    public void setSyncSource(ResourceDataSyncSource syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * Specify information about the data sources to synchronize. This parameter is required if the
     * <code>SyncType</code> value is SyncFromSource.
     * </p>
     * 
     * @return Specify information about the data sources to synchronize. This parameter is required if the
     *         <code>SyncType</code> value is SyncFromSource.
     */

    public ResourceDataSyncSource getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * Specify information about the data sources to synchronize. This parameter is required if the
     * <code>SyncType</code> value is SyncFromSource.
     * </p>
     * 
     * @param syncSource
     *        Specify information about the data sources to synchronize. This parameter is required if the
     *        <code>SyncType</code> value is SyncFromSource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDataSyncRequest withSyncSource(ResourceDataSyncSource syncSource) {
        setSyncSource(syncSource);
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
        if (getSyncName() != null)
            sb.append("SyncName: ").append(getSyncName()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination()).append(",");
        if (getSyncType() != null)
            sb.append("SyncType: ").append(getSyncType()).append(",");
        if (getSyncSource() != null)
            sb.append("SyncSource: ").append(getSyncSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceDataSyncRequest == false)
            return false;
        CreateResourceDataSyncRequest other = (CreateResourceDataSyncRequest) obj;
        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null)
            return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceDataSyncRequest clone() {
        return (CreateResourceDataSyncRequest) super.clone();
    }

}
