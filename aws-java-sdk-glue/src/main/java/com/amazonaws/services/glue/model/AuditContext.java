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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information for audit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AuditContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The context for the audit..
     * </p>
     */
    private String additionalAuditContext;
    /**
     * <p>
     * The requested columns for audit.
     * </p>
     */
    private java.util.List<String> requestedColumns;
    /**
     * <p>
     * All columns request for audit.
     * </p>
     */
    private Boolean allColumnsRequested;

    /**
     * <p>
     * The context for the audit..
     * </p>
     * 
     * @param additionalAuditContext
     *        The context for the audit..
     */

    public void setAdditionalAuditContext(String additionalAuditContext) {
        this.additionalAuditContext = additionalAuditContext;
    }

    /**
     * <p>
     * The context for the audit..
     * </p>
     * 
     * @return The context for the audit..
     */

    public String getAdditionalAuditContext() {
        return this.additionalAuditContext;
    }

    /**
     * <p>
     * The context for the audit..
     * </p>
     * 
     * @param additionalAuditContext
     *        The context for the audit..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditContext withAdditionalAuditContext(String additionalAuditContext) {
        setAdditionalAuditContext(additionalAuditContext);
        return this;
    }

    /**
     * <p>
     * The requested columns for audit.
     * </p>
     * 
     * @return The requested columns for audit.
     */

    public java.util.List<String> getRequestedColumns() {
        return requestedColumns;
    }

    /**
     * <p>
     * The requested columns for audit.
     * </p>
     * 
     * @param requestedColumns
     *        The requested columns for audit.
     */

    public void setRequestedColumns(java.util.Collection<String> requestedColumns) {
        if (requestedColumns == null) {
            this.requestedColumns = null;
            return;
        }

        this.requestedColumns = new java.util.ArrayList<String>(requestedColumns);
    }

    /**
     * <p>
     * The requested columns for audit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedColumns(java.util.Collection)} or {@link #withRequestedColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param requestedColumns
     *        The requested columns for audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditContext withRequestedColumns(String... requestedColumns) {
        if (this.requestedColumns == null) {
            setRequestedColumns(new java.util.ArrayList<String>(requestedColumns.length));
        }
        for (String ele : requestedColumns) {
            this.requestedColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested columns for audit.
     * </p>
     * 
     * @param requestedColumns
     *        The requested columns for audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditContext withRequestedColumns(java.util.Collection<String> requestedColumns) {
        setRequestedColumns(requestedColumns);
        return this;
    }

    /**
     * <p>
     * All columns request for audit.
     * </p>
     * 
     * @param allColumnsRequested
     *        All columns request for audit.
     */

    public void setAllColumnsRequested(Boolean allColumnsRequested) {
        this.allColumnsRequested = allColumnsRequested;
    }

    /**
     * <p>
     * All columns request for audit.
     * </p>
     * 
     * @return All columns request for audit.
     */

    public Boolean getAllColumnsRequested() {
        return this.allColumnsRequested;
    }

    /**
     * <p>
     * All columns request for audit.
     * </p>
     * 
     * @param allColumnsRequested
     *        All columns request for audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditContext withAllColumnsRequested(Boolean allColumnsRequested) {
        setAllColumnsRequested(allColumnsRequested);
        return this;
    }

    /**
     * <p>
     * All columns request for audit.
     * </p>
     * 
     * @return All columns request for audit.
     */

    public Boolean isAllColumnsRequested() {
        return this.allColumnsRequested;
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
        if (getAdditionalAuditContext() != null)
            sb.append("AdditionalAuditContext: ").append(getAdditionalAuditContext()).append(",");
        if (getRequestedColumns() != null)
            sb.append("RequestedColumns: ").append(getRequestedColumns()).append(",");
        if (getAllColumnsRequested() != null)
            sb.append("AllColumnsRequested: ").append(getAllColumnsRequested());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditContext == false)
            return false;
        AuditContext other = (AuditContext) obj;
        if (other.getAdditionalAuditContext() == null ^ this.getAdditionalAuditContext() == null)
            return false;
        if (other.getAdditionalAuditContext() != null && other.getAdditionalAuditContext().equals(this.getAdditionalAuditContext()) == false)
            return false;
        if (other.getRequestedColumns() == null ^ this.getRequestedColumns() == null)
            return false;
        if (other.getRequestedColumns() != null && other.getRequestedColumns().equals(this.getRequestedColumns()) == false)
            return false;
        if (other.getAllColumnsRequested() == null ^ this.getAllColumnsRequested() == null)
            return false;
        if (other.getAllColumnsRequested() != null && other.getAllColumnsRequested().equals(this.getAllColumnsRequested()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalAuditContext() == null) ? 0 : getAdditionalAuditContext().hashCode());
        hashCode = prime * hashCode + ((getRequestedColumns() == null) ? 0 : getRequestedColumns().hashCode());
        hashCode = prime * hashCode + ((getAllColumnsRequested() == null) ? 0 : getAllColumnsRequested().hashCode());
        return hashCode;
    }

    @Override
    public AuditContext clone() {
        try {
            return (AuditContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AuditContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
