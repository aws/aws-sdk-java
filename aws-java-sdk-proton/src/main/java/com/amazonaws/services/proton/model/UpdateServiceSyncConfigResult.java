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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceSyncConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSyncConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detailed data of the Proton Ops file.
     * </p>
     */
    private ServiceSyncConfig serviceSyncConfig;

    /**
     * <p>
     * The detailed data of the Proton Ops file.
     * </p>
     * 
     * @param serviceSyncConfig
     *        The detailed data of the Proton Ops file.
     */

    public void setServiceSyncConfig(ServiceSyncConfig serviceSyncConfig) {
        this.serviceSyncConfig = serviceSyncConfig;
    }

    /**
     * <p>
     * The detailed data of the Proton Ops file.
     * </p>
     * 
     * @return The detailed data of the Proton Ops file.
     */

    public ServiceSyncConfig getServiceSyncConfig() {
        return this.serviceSyncConfig;
    }

    /**
     * <p>
     * The detailed data of the Proton Ops file.
     * </p>
     * 
     * @param serviceSyncConfig
     *        The detailed data of the Proton Ops file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncConfigResult withServiceSyncConfig(ServiceSyncConfig serviceSyncConfig) {
        setServiceSyncConfig(serviceSyncConfig);
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
        if (getServiceSyncConfig() != null)
            sb.append("ServiceSyncConfig: ").append(getServiceSyncConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceSyncConfigResult == false)
            return false;
        UpdateServiceSyncConfigResult other = (UpdateServiceSyncConfigResult) obj;
        if (other.getServiceSyncConfig() == null ^ this.getServiceSyncConfig() == null)
            return false;
        if (other.getServiceSyncConfig() != null && other.getServiceSyncConfig().equals(this.getServiceSyncConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSyncConfig() == null) ? 0 : getServiceSyncConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceSyncConfigResult clone() {
        try {
            return (UpdateServiceSyncConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
