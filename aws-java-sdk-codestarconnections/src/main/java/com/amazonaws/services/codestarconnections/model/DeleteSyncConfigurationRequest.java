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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/DeleteSyncConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSyncConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of sync configuration to be deleted.
     * </p>
     */
    private String syncType;
    /**
     * <p>
     * The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The type of sync configuration to be deleted.
     * </p>
     * 
     * @param syncType
     *        The type of sync configuration to be deleted.
     * @see SyncConfigurationType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The type of sync configuration to be deleted.
     * </p>
     * 
     * @return The type of sync configuration to be deleted.
     * @see SyncConfigurationType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The type of sync configuration to be deleted.
     * </p>
     * 
     * @param syncType
     *        The type of sync configuration to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public DeleteSyncConfigurationRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The type of sync configuration to be deleted.
     * </p>
     * 
     * @param syncType
     *        The type of sync configuration to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public DeleteSyncConfigurationRequest withSyncType(SyncConfigurationType syncType) {
        this.syncType = syncType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     * </p>
     * 
     * @param resourceName
     *        The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     * </p>
     * 
     * @return The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     * </p>
     * 
     * @param resourceName
     *        The name of the Amazon Web Services resource associated with the sync configuration to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSyncConfigurationRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getSyncType() != null)
            sb.append("SyncType: ").append(getSyncType()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSyncConfigurationRequest == false)
            return false;
        DeleteSyncConfigurationRequest other = (DeleteSyncConfigurationRequest) obj;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSyncConfigurationRequest clone() {
        return (DeleteSyncConfigurationRequest) super.clone();
    }

}
