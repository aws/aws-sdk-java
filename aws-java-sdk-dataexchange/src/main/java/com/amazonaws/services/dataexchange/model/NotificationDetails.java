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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Extra details specific to this notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/NotificationDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Extra details specific to a data update type notification.
     * </p>
     */
    private DataUpdateRequestDetails dataUpdate;
    /**
     * <p>
     * Extra details specific to a deprecation type notification.
     * </p>
     */
    private DeprecationRequestDetails deprecation;
    /**
     * <p>
     * Extra details specific to a schema change type notification.
     * </p>
     */
    private SchemaChangeRequestDetails schemaChange;

    /**
     * <p>
     * Extra details specific to a data update type notification.
     * </p>
     * 
     * @param dataUpdate
     *        Extra details specific to a data update type notification.
     */

    public void setDataUpdate(DataUpdateRequestDetails dataUpdate) {
        this.dataUpdate = dataUpdate;
    }

    /**
     * <p>
     * Extra details specific to a data update type notification.
     * </p>
     * 
     * @return Extra details specific to a data update type notification.
     */

    public DataUpdateRequestDetails getDataUpdate() {
        return this.dataUpdate;
    }

    /**
     * <p>
     * Extra details specific to a data update type notification.
     * </p>
     * 
     * @param dataUpdate
     *        Extra details specific to a data update type notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationDetails withDataUpdate(DataUpdateRequestDetails dataUpdate) {
        setDataUpdate(dataUpdate);
        return this;
    }

    /**
     * <p>
     * Extra details specific to a deprecation type notification.
     * </p>
     * 
     * @param deprecation
     *        Extra details specific to a deprecation type notification.
     */

    public void setDeprecation(DeprecationRequestDetails deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * <p>
     * Extra details specific to a deprecation type notification.
     * </p>
     * 
     * @return Extra details specific to a deprecation type notification.
     */

    public DeprecationRequestDetails getDeprecation() {
        return this.deprecation;
    }

    /**
     * <p>
     * Extra details specific to a deprecation type notification.
     * </p>
     * 
     * @param deprecation
     *        Extra details specific to a deprecation type notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationDetails withDeprecation(DeprecationRequestDetails deprecation) {
        setDeprecation(deprecation);
        return this;
    }

    /**
     * <p>
     * Extra details specific to a schema change type notification.
     * </p>
     * 
     * @param schemaChange
     *        Extra details specific to a schema change type notification.
     */

    public void setSchemaChange(SchemaChangeRequestDetails schemaChange) {
        this.schemaChange = schemaChange;
    }

    /**
     * <p>
     * Extra details specific to a schema change type notification.
     * </p>
     * 
     * @return Extra details specific to a schema change type notification.
     */

    public SchemaChangeRequestDetails getSchemaChange() {
        return this.schemaChange;
    }

    /**
     * <p>
     * Extra details specific to a schema change type notification.
     * </p>
     * 
     * @param schemaChange
     *        Extra details specific to a schema change type notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationDetails withSchemaChange(SchemaChangeRequestDetails schemaChange) {
        setSchemaChange(schemaChange);
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
        if (getDataUpdate() != null)
            sb.append("DataUpdate: ").append(getDataUpdate()).append(",");
        if (getDeprecation() != null)
            sb.append("Deprecation: ").append(getDeprecation()).append(",");
        if (getSchemaChange() != null)
            sb.append("SchemaChange: ").append(getSchemaChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationDetails == false)
            return false;
        NotificationDetails other = (NotificationDetails) obj;
        if (other.getDataUpdate() == null ^ this.getDataUpdate() == null)
            return false;
        if (other.getDataUpdate() != null && other.getDataUpdate().equals(this.getDataUpdate()) == false)
            return false;
        if (other.getDeprecation() == null ^ this.getDeprecation() == null)
            return false;
        if (other.getDeprecation() != null && other.getDeprecation().equals(this.getDeprecation()) == false)
            return false;
        if (other.getSchemaChange() == null ^ this.getSchemaChange() == null)
            return false;
        if (other.getSchemaChange() != null && other.getSchemaChange().equals(this.getSchemaChange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataUpdate() == null) ? 0 : getDataUpdate().hashCode());
        hashCode = prime * hashCode + ((getDeprecation() == null) ? 0 : getDeprecation().hashCode());
        hashCode = prime * hashCode + ((getSchemaChange() == null) ? 0 : getSchemaChange().hashCode());
        return hashCode;
    }

    @Override
    public NotificationDetails clone() {
        try {
            return (NotificationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.NotificationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
