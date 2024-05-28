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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetSyncConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSyncConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details about the sync configuration for which you want to retrieve information.
     * </p>
     */
    private SyncConfiguration syncConfiguration;

    /**
     * <p>
     * The details about the sync configuration for which you want to retrieve information.
     * </p>
     * 
     * @param syncConfiguration
     *        The details about the sync configuration for which you want to retrieve information.
     */

    public void setSyncConfiguration(SyncConfiguration syncConfiguration) {
        this.syncConfiguration = syncConfiguration;
    }

    /**
     * <p>
     * The details about the sync configuration for which you want to retrieve information.
     * </p>
     * 
     * @return The details about the sync configuration for which you want to retrieve information.
     */

    public SyncConfiguration getSyncConfiguration() {
        return this.syncConfiguration;
    }

    /**
     * <p>
     * The details about the sync configuration for which you want to retrieve information.
     * </p>
     * 
     * @param syncConfiguration
     *        The details about the sync configuration for which you want to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncConfigurationResult withSyncConfiguration(SyncConfiguration syncConfiguration) {
        setSyncConfiguration(syncConfiguration);
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
        if (getSyncConfiguration() != null)
            sb.append("SyncConfiguration: ").append(getSyncConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSyncConfigurationResult == false)
            return false;
        GetSyncConfigurationResult other = (GetSyncConfigurationResult) obj;
        if (other.getSyncConfiguration() == null ^ this.getSyncConfiguration() == null)
            return false;
        if (other.getSyncConfiguration() != null && other.getSyncConfiguration().equals(this.getSyncConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncConfiguration() == null) ? 0 : getSyncConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetSyncConfigurationResult clone() {
        try {
            return (GetSyncConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
