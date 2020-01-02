/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateResourceDataSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceDataSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource data sync you want to update.
     * </p>
     */
    private String syncName;
    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the resource
     * data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is <code>SyncFromSource</code>
     * then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
     * </p>
     */
    private String syncType;
    /**
     * <p>
     * Specify information about the data sources to synchronize.
     * </p>
     */
    private ResourceDataSyncSource syncSource;

    /**
     * <p>
     * The name of the resource data sync you want to update.
     * </p>
     * 
     * @param syncName
     *        The name of the resource data sync you want to update.
     */

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * The name of the resource data sync you want to update.
     * </p>
     * 
     * @return The name of the resource data sync you want to update.
     */

    public String getSyncName() {
        return this.syncName;
    }

    /**
     * <p>
     * The name of the resource data sync you want to update.
     * </p>
     * 
     * @param syncName
     *        The name of the resource data sync you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceDataSyncRequest withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the resource
     * data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is <code>SyncFromSource</code>
     * then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
     * </p>
     * 
     * @param syncType
     *        The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the
     *        resource data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is
     *        <code>SyncFromSource</code> then the resource data sync synchronizes data from AWS Organizations or from
     *        multiple AWS Regions.
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the resource
     * data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is <code>SyncFromSource</code>
     * then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
     * </p>
     * 
     * @return The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the
     *         resource data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is
     *         <code>SyncFromSource</code> then the resource data sync synchronizes data from AWS Organizations or from
     *         multiple AWS Regions.
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the resource
     * data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is <code>SyncFromSource</code>
     * then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
     * </p>
     * 
     * @param syncType
     *        The type of resource data sync. If <code>SyncType</code> is <code>SyncToDestination</code>, then the
     *        resource data sync synchronizes data to an Amazon S3 bucket. If the <code>SyncType</code> is
     *        <code>SyncFromSource</code> then the resource data sync synchronizes data from AWS Organizations or from
     *        multiple AWS Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceDataSyncRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * Specify information about the data sources to synchronize.
     * </p>
     * 
     * @param syncSource
     *        Specify information about the data sources to synchronize.
     */

    public void setSyncSource(ResourceDataSyncSource syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * Specify information about the data sources to synchronize.
     * </p>
     * 
     * @return Specify information about the data sources to synchronize.
     */

    public ResourceDataSyncSource getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * Specify information about the data sources to synchronize.
     * </p>
     * 
     * @param syncSource
     *        Specify information about the data sources to synchronize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceDataSyncRequest withSyncSource(ResourceDataSyncSource syncSource) {
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

        if (obj instanceof UpdateResourceDataSyncRequest == false)
            return false;
        UpdateResourceDataSyncRequest other = (UpdateResourceDataSyncRequest) obj;
        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
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
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceDataSyncRequest clone() {
        return (UpdateResourceDataSyncRequest) super.clone();
    }

}
