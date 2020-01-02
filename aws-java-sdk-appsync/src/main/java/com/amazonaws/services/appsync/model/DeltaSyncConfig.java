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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Delta Sync configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeltaSyncConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeltaSyncConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of minutes an Item is stored in the datasource.
     * </p>
     */
    private Long baseTableTTL;
    /**
     * <p>
     * The Delta Sync table name.
     * </p>
     */
    private String deltaSyncTableName;
    /**
     * <p>
     * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     * </p>
     */
    private Long deltaSyncTableTTL;

    /**
     * <p>
     * The number of minutes an Item is stored in the datasource.
     * </p>
     * 
     * @param baseTableTTL
     *        The number of minutes an Item is stored in the datasource.
     */

    public void setBaseTableTTL(Long baseTableTTL) {
        this.baseTableTTL = baseTableTTL;
    }

    /**
     * <p>
     * The number of minutes an Item is stored in the datasource.
     * </p>
     * 
     * @return The number of minutes an Item is stored in the datasource.
     */

    public Long getBaseTableTTL() {
        return this.baseTableTTL;
    }

    /**
     * <p>
     * The number of minutes an Item is stored in the datasource.
     * </p>
     * 
     * @param baseTableTTL
     *        The number of minutes an Item is stored in the datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaSyncConfig withBaseTableTTL(Long baseTableTTL) {
        setBaseTableTTL(baseTableTTL);
        return this;
    }

    /**
     * <p>
     * The Delta Sync table name.
     * </p>
     * 
     * @param deltaSyncTableName
     *        The Delta Sync table name.
     */

    public void setDeltaSyncTableName(String deltaSyncTableName) {
        this.deltaSyncTableName = deltaSyncTableName;
    }

    /**
     * <p>
     * The Delta Sync table name.
     * </p>
     * 
     * @return The Delta Sync table name.
     */

    public String getDeltaSyncTableName() {
        return this.deltaSyncTableName;
    }

    /**
     * <p>
     * The Delta Sync table name.
     * </p>
     * 
     * @param deltaSyncTableName
     *        The Delta Sync table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaSyncConfig withDeltaSyncTableName(String deltaSyncTableName) {
        setDeltaSyncTableName(deltaSyncTableName);
        return this;
    }

    /**
     * <p>
     * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     * </p>
     * 
     * @param deltaSyncTableTTL
     *        The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     */

    public void setDeltaSyncTableTTL(Long deltaSyncTableTTL) {
        this.deltaSyncTableTTL = deltaSyncTableTTL;
    }

    /**
     * <p>
     * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     * </p>
     * 
     * @return The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     */

    public Long getDeltaSyncTableTTL() {
        return this.deltaSyncTableTTL;
    }

    /**
     * <p>
     * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     * </p>
     * 
     * @param deltaSyncTableTTL
     *        The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaSyncConfig withDeltaSyncTableTTL(Long deltaSyncTableTTL) {
        setDeltaSyncTableTTL(deltaSyncTableTTL);
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
        if (getBaseTableTTL() != null)
            sb.append("BaseTableTTL: ").append(getBaseTableTTL()).append(",");
        if (getDeltaSyncTableName() != null)
            sb.append("DeltaSyncTableName: ").append(getDeltaSyncTableName()).append(",");
        if (getDeltaSyncTableTTL() != null)
            sb.append("DeltaSyncTableTTL: ").append(getDeltaSyncTableTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeltaSyncConfig == false)
            return false;
        DeltaSyncConfig other = (DeltaSyncConfig) obj;
        if (other.getBaseTableTTL() == null ^ this.getBaseTableTTL() == null)
            return false;
        if (other.getBaseTableTTL() != null && other.getBaseTableTTL().equals(this.getBaseTableTTL()) == false)
            return false;
        if (other.getDeltaSyncTableName() == null ^ this.getDeltaSyncTableName() == null)
            return false;
        if (other.getDeltaSyncTableName() != null && other.getDeltaSyncTableName().equals(this.getDeltaSyncTableName()) == false)
            return false;
        if (other.getDeltaSyncTableTTL() == null ^ this.getDeltaSyncTableTTL() == null)
            return false;
        if (other.getDeltaSyncTableTTL() != null && other.getDeltaSyncTableTTL().equals(this.getDeltaSyncTableTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseTableTTL() == null) ? 0 : getBaseTableTTL().hashCode());
        hashCode = prime * hashCode + ((getDeltaSyncTableName() == null) ? 0 : getDeltaSyncTableName().hashCode());
        hashCode = prime * hashCode + ((getDeltaSyncTableTTL() == null) ? 0 : getDeltaSyncTableTTL().hashCode());
        return hashCode;
    }

    @Override
    public DeltaSyncConfig clone() {
        try {
            return (DeltaSyncConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DeltaSyncConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
