/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the data source packages ingested by your behavior graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DatasourcePackageIngestDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasourcePackageIngestDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details on which data source packages are ingested for a member account.
     * </p>
     */
    private String datasourcePackageIngestState;
    /**
     * <p>
     * The date a data source package was enabled for this account
     * </p>
     */
    private java.util.Map<String, TimestampForCollection> lastIngestStateChange;

    /**
     * <p>
     * Details on which data source packages are ingested for a member account.
     * </p>
     * 
     * @param datasourcePackageIngestState
     *        Details on which data source packages are ingested for a member account.
     * @see DatasourcePackageIngestState
     */

    public void setDatasourcePackageIngestState(String datasourcePackageIngestState) {
        this.datasourcePackageIngestState = datasourcePackageIngestState;
    }

    /**
     * <p>
     * Details on which data source packages are ingested for a member account.
     * </p>
     * 
     * @return Details on which data source packages are ingested for a member account.
     * @see DatasourcePackageIngestState
     */

    public String getDatasourcePackageIngestState() {
        return this.datasourcePackageIngestState;
    }

    /**
     * <p>
     * Details on which data source packages are ingested for a member account.
     * </p>
     * 
     * @param datasourcePackageIngestState
     *        Details on which data source packages are ingested for a member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasourcePackageIngestState
     */

    public DatasourcePackageIngestDetail withDatasourcePackageIngestState(String datasourcePackageIngestState) {
        setDatasourcePackageIngestState(datasourcePackageIngestState);
        return this;
    }

    /**
     * <p>
     * Details on which data source packages are ingested for a member account.
     * </p>
     * 
     * @param datasourcePackageIngestState
     *        Details on which data source packages are ingested for a member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasourcePackageIngestState
     */

    public DatasourcePackageIngestDetail withDatasourcePackageIngestState(DatasourcePackageIngestState datasourcePackageIngestState) {
        this.datasourcePackageIngestState = datasourcePackageIngestState.toString();
        return this;
    }

    /**
     * <p>
     * The date a data source package was enabled for this account
     * </p>
     * 
     * @return The date a data source package was enabled for this account
     */

    public java.util.Map<String, TimestampForCollection> getLastIngestStateChange() {
        return lastIngestStateChange;
    }

    /**
     * <p>
     * The date a data source package was enabled for this account
     * </p>
     * 
     * @param lastIngestStateChange
     *        The date a data source package was enabled for this account
     */

    public void setLastIngestStateChange(java.util.Map<String, TimestampForCollection> lastIngestStateChange) {
        this.lastIngestStateChange = lastIngestStateChange;
    }

    /**
     * <p>
     * The date a data source package was enabled for this account
     * </p>
     * 
     * @param lastIngestStateChange
     *        The date a data source package was enabled for this account
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasourcePackageIngestDetail withLastIngestStateChange(java.util.Map<String, TimestampForCollection> lastIngestStateChange) {
        setLastIngestStateChange(lastIngestStateChange);
        return this;
    }

    /**
     * Add a single LastIngestStateChange entry
     *
     * @see DatasourcePackageIngestDetail#withLastIngestStateChange
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DatasourcePackageIngestDetail addLastIngestStateChangeEntry(String key, TimestampForCollection value) {
        if (null == this.lastIngestStateChange) {
            this.lastIngestStateChange = new java.util.HashMap<String, TimestampForCollection>();
        }
        if (this.lastIngestStateChange.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.lastIngestStateChange.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LastIngestStateChange.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasourcePackageIngestDetail clearLastIngestStateChangeEntries() {
        this.lastIngestStateChange = null;
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
        if (getDatasourcePackageIngestState() != null)
            sb.append("DatasourcePackageIngestState: ").append(getDatasourcePackageIngestState()).append(",");
        if (getLastIngestStateChange() != null)
            sb.append("LastIngestStateChange: ").append(getLastIngestStateChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasourcePackageIngestDetail == false)
            return false;
        DatasourcePackageIngestDetail other = (DatasourcePackageIngestDetail) obj;
        if (other.getDatasourcePackageIngestState() == null ^ this.getDatasourcePackageIngestState() == null)
            return false;
        if (other.getDatasourcePackageIngestState() != null && other.getDatasourcePackageIngestState().equals(this.getDatasourcePackageIngestState()) == false)
            return false;
        if (other.getLastIngestStateChange() == null ^ this.getLastIngestStateChange() == null)
            return false;
        if (other.getLastIngestStateChange() != null && other.getLastIngestStateChange().equals(this.getLastIngestStateChange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasourcePackageIngestState() == null) ? 0 : getDatasourcePackageIngestState().hashCode());
        hashCode = prime * hashCode + ((getLastIngestStateChange() == null) ? 0 : getLastIngestStateChange().hashCode());
        return hashCode;
    }

    @Override
    public DatasourcePackageIngestDetail clone() {
        try {
            return (DatasourcePackageIngestDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.DatasourcePackageIngestDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
