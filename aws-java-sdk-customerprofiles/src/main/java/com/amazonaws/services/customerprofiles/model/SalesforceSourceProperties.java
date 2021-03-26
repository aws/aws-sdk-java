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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SalesforceSourceProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceSourceProperties implements Serializable, Cloneable, StructuredPojo {

    private String object;

    private Boolean enableDynamicFieldUpdate;

    private Boolean includeDeletedRecords;

    /**
     * @param object
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * @return
     */

    public String getObject() {
        return this.object;
    }

    /**
     * @param object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceProperties withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * @param enableDynamicFieldUpdate
     */

    public void setEnableDynamicFieldUpdate(Boolean enableDynamicFieldUpdate) {
        this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
    }

    /**
     * @return
     */

    public Boolean getEnableDynamicFieldUpdate() {
        return this.enableDynamicFieldUpdate;
    }

    /**
     * @param enableDynamicFieldUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceProperties withEnableDynamicFieldUpdate(Boolean enableDynamicFieldUpdate) {
        setEnableDynamicFieldUpdate(enableDynamicFieldUpdate);
        return this;
    }

    /**
     * @return
     */

    public Boolean isEnableDynamicFieldUpdate() {
        return this.enableDynamicFieldUpdate;
    }

    /**
     * @param includeDeletedRecords
     */

    public void setIncludeDeletedRecords(Boolean includeDeletedRecords) {
        this.includeDeletedRecords = includeDeletedRecords;
    }

    /**
     * @return
     */

    public Boolean getIncludeDeletedRecords() {
        return this.includeDeletedRecords;
    }

    /**
     * @param includeDeletedRecords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceProperties withIncludeDeletedRecords(Boolean includeDeletedRecords) {
        setIncludeDeletedRecords(includeDeletedRecords);
        return this;
    }

    /**
     * @return
     */

    public Boolean isIncludeDeletedRecords() {
        return this.includeDeletedRecords;
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
        if (getObject() != null)
            sb.append("Object: ").append(getObject()).append(",");
        if (getEnableDynamicFieldUpdate() != null)
            sb.append("EnableDynamicFieldUpdate: ").append(getEnableDynamicFieldUpdate()).append(",");
        if (getIncludeDeletedRecords() != null)
            sb.append("IncludeDeletedRecords: ").append(getIncludeDeletedRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceSourceProperties == false)
            return false;
        SalesforceSourceProperties other = (SalesforceSourceProperties) obj;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        if (other.getEnableDynamicFieldUpdate() == null ^ this.getEnableDynamicFieldUpdate() == null)
            return false;
        if (other.getEnableDynamicFieldUpdate() != null && other.getEnableDynamicFieldUpdate().equals(this.getEnableDynamicFieldUpdate()) == false)
            return false;
        if (other.getIncludeDeletedRecords() == null ^ this.getIncludeDeletedRecords() == null)
            return false;
        if (other.getIncludeDeletedRecords() != null && other.getIncludeDeletedRecords().equals(this.getIncludeDeletedRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        hashCode = prime * hashCode + ((getEnableDynamicFieldUpdate() == null) ? 0 : getEnableDynamicFieldUpdate().hashCode());
        hashCode = prime * hashCode + ((getIncludeDeletedRecords() == null) ? 0 : getIncludeDeletedRecords().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceSourceProperties clone() {
        try {
            return (SalesforceSourceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.SalesforceSourcePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
