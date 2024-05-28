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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Import task summary applications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ImportTaskSummaryApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTaskSummaryApplications implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Import task summary applications created count.
     * </p>
     */
    private Long createdCount;
    /**
     * <p>
     * Import task summary applications modified count.
     * </p>
     */
    private Long modifiedCount;

    /**
     * <p>
     * Import task summary applications created count.
     * </p>
     * 
     * @param createdCount
     *        Import task summary applications created count.
     */

    public void setCreatedCount(Long createdCount) {
        this.createdCount = createdCount;
    }

    /**
     * <p>
     * Import task summary applications created count.
     * </p>
     * 
     * @return Import task summary applications created count.
     */

    public Long getCreatedCount() {
        return this.createdCount;
    }

    /**
     * <p>
     * Import task summary applications created count.
     * </p>
     * 
     * @param createdCount
     *        Import task summary applications created count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskSummaryApplications withCreatedCount(Long createdCount) {
        setCreatedCount(createdCount);
        return this;
    }

    /**
     * <p>
     * Import task summary applications modified count.
     * </p>
     * 
     * @param modifiedCount
     *        Import task summary applications modified count.
     */

    public void setModifiedCount(Long modifiedCount) {
        this.modifiedCount = modifiedCount;
    }

    /**
     * <p>
     * Import task summary applications modified count.
     * </p>
     * 
     * @return Import task summary applications modified count.
     */

    public Long getModifiedCount() {
        return this.modifiedCount;
    }

    /**
     * <p>
     * Import task summary applications modified count.
     * </p>
     * 
     * @param modifiedCount
     *        Import task summary applications modified count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskSummaryApplications withModifiedCount(Long modifiedCount) {
        setModifiedCount(modifiedCount);
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
        if (getCreatedCount() != null)
            sb.append("CreatedCount: ").append(getCreatedCount()).append(",");
        if (getModifiedCount() != null)
            sb.append("ModifiedCount: ").append(getModifiedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTaskSummaryApplications == false)
            return false;
        ImportTaskSummaryApplications other = (ImportTaskSummaryApplications) obj;
        if (other.getCreatedCount() == null ^ this.getCreatedCount() == null)
            return false;
        if (other.getCreatedCount() != null && other.getCreatedCount().equals(this.getCreatedCount()) == false)
            return false;
        if (other.getModifiedCount() == null ^ this.getModifiedCount() == null)
            return false;
        if (other.getModifiedCount() != null && other.getModifiedCount().equals(this.getModifiedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedCount() == null) ? 0 : getCreatedCount().hashCode());
        hashCode = prime * hashCode + ((getModifiedCount() == null) ? 0 : getModifiedCount().hashCode());
        return hashCode;
    }

    @Override
    public ImportTaskSummaryApplications clone() {
        try {
            return (ImportTaskSummaryApplications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ImportTaskSummaryApplicationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
