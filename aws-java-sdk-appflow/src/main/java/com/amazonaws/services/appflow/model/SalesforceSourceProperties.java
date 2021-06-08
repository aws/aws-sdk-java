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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when Salesforce is being used as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SalesforceSourceProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceSourceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object specified in the Salesforce flow source.
     * </p>
     */
    private String object;
    /**
     * <p>
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a
     * flow.
     * </p>
     */
    private Boolean enableDynamicFieldUpdate;
    /**
     * <p>
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     * </p>
     */
    private Boolean includeDeletedRecords;

    /**
     * <p>
     * The object specified in the Salesforce flow source.
     * </p>
     * 
     * @param object
     *        The object specified in the Salesforce flow source.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The object specified in the Salesforce flow source.
     * </p>
     * 
     * @return The object specified in the Salesforce flow source.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The object specified in the Salesforce flow source.
     * </p>
     * 
     * @param object
     *        The object specified in the Salesforce flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceProperties withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * <p>
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a
     * flow.
     * </p>
     * 
     * @param enableDynamicFieldUpdate
     *        The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while
     *        running a flow.
     */

    public void setEnableDynamicFieldUpdate(Boolean enableDynamicFieldUpdate) {
        this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
    }

    /**
     * <p>
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a
     * flow.
     * </p>
     * 
     * @return The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while
     *         running a flow.
     */

    public Boolean getEnableDynamicFieldUpdate() {
        return this.enableDynamicFieldUpdate;
    }

    /**
     * <p>
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a
     * flow.
     * </p>
     * 
     * @param enableDynamicFieldUpdate
     *        The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while
     *        running a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceProperties withEnableDynamicFieldUpdate(Boolean enableDynamicFieldUpdate) {
        setEnableDynamicFieldUpdate(enableDynamicFieldUpdate);
        return this;
    }

    /**
     * <p>
     * The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while running a
     * flow.
     * </p>
     * 
     * @return The flag that enables dynamic fetching of new (recently added) fields in the Salesforce objects while
     *         running a flow.
     */

    public Boolean isEnableDynamicFieldUpdate() {
        return this.enableDynamicFieldUpdate;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     * </p>
     * 
     * @param includeDeletedRecords
     *        Indicates whether Amazon AppFlow includes deleted files in the flow run.
     */

    public void setIncludeDeletedRecords(Boolean includeDeletedRecords) {
        this.includeDeletedRecords = includeDeletedRecords;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     * </p>
     * 
     * @return Indicates whether Amazon AppFlow includes deleted files in the flow run.
     */

    public Boolean getIncludeDeletedRecords() {
        return this.includeDeletedRecords;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     * </p>
     * 
     * @param includeDeletedRecords
     *        Indicates whether Amazon AppFlow includes deleted files in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceSourceProperties withIncludeDeletedRecords(Boolean includeDeletedRecords) {
        setIncludeDeletedRecords(includeDeletedRecords);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon AppFlow includes deleted files in the flow run.
     * </p>
     * 
     * @return Indicates whether Amazon AppFlow includes deleted files in the flow run.
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
        com.amazonaws.services.appflow.model.transform.SalesforceSourcePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
