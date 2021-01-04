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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PerObjectStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerObjectStatus implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String syncStatus;

    /**
     * <p/>
     * 
     * @param syncStatus
     * @see PerObjectSyncStatus
     */

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    /**
     * <p/>
     * 
     * @return
     * @see PerObjectSyncStatus
     */

    public String getSyncStatus() {
        return this.syncStatus;
    }

    /**
     * <p/>
     * 
     * @param syncStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerObjectSyncStatus
     */

    public PerObjectStatus withSyncStatus(String syncStatus) {
        setSyncStatus(syncStatus);
        return this;
    }

    /**
     * <p/>
     * 
     * @param syncStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerObjectSyncStatus
     */

    public PerObjectStatus withSyncStatus(PerObjectSyncStatus syncStatus) {
        this.syncStatus = syncStatus.toString();
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
        if (getSyncStatus() != null)
            sb.append("SyncStatus: ").append(getSyncStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerObjectStatus == false)
            return false;
        PerObjectStatus other = (PerObjectStatus) obj;
        if (other.getSyncStatus() == null ^ this.getSyncStatus() == null)
            return false;
        if (other.getSyncStatus() != null && other.getSyncStatus().equals(this.getSyncStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncStatus() == null) ? 0 : getSyncStatus().hashCode());
        return hashCode;
    }

    @Override
    public PerObjectStatus clone() {
        try {
            return (PerObjectStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.PerObjectStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
