/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure containing migration status information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CatalogImportStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogImportStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if the migration has completed, or False otherwise.
     * </p>
     */
    private Boolean importCompleted;
    /**
     * <p>
     * The time that the migration was started.
     * </p>
     */
    private java.util.Date importTime;
    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     */
    private String importedBy;

    /**
     * <p>
     * True if the migration has completed, or False otherwise.
     * </p>
     * 
     * @param importCompleted
     *        True if the migration has completed, or False otherwise.
     */

    public void setImportCompleted(Boolean importCompleted) {
        this.importCompleted = importCompleted;
    }

    /**
     * <p>
     * True if the migration has completed, or False otherwise.
     * </p>
     * 
     * @return True if the migration has completed, or False otherwise.
     */

    public Boolean getImportCompleted() {
        return this.importCompleted;
    }

    /**
     * <p>
     * True if the migration has completed, or False otherwise.
     * </p>
     * 
     * @param importCompleted
     *        True if the migration has completed, or False otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogImportStatus withImportCompleted(Boolean importCompleted) {
        setImportCompleted(importCompleted);
        return this;
    }

    /**
     * <p>
     * True if the migration has completed, or False otherwise.
     * </p>
     * 
     * @return True if the migration has completed, or False otherwise.
     */

    public Boolean isImportCompleted() {
        return this.importCompleted;
    }

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     * 
     * @param importTime
     *        The time that the migration was started.
     */

    public void setImportTime(java.util.Date importTime) {
        this.importTime = importTime;
    }

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     * 
     * @return The time that the migration was started.
     */

    public java.util.Date getImportTime() {
        return this.importTime;
    }

    /**
     * <p>
     * The time that the migration was started.
     * </p>
     * 
     * @param importTime
     *        The time that the migration was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogImportStatus withImportTime(java.util.Date importTime) {
        setImportTime(importTime);
        return this;
    }

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * 
     * @param importedBy
     *        The name of the person who initiated the migration.
     */

    public void setImportedBy(String importedBy) {
        this.importedBy = importedBy;
    }

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * 
     * @return The name of the person who initiated the migration.
     */

    public String getImportedBy() {
        return this.importedBy;
    }

    /**
     * <p>
     * The name of the person who initiated the migration.
     * </p>
     * 
     * @param importedBy
     *        The name of the person who initiated the migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogImportStatus withImportedBy(String importedBy) {
        setImportedBy(importedBy);
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
        if (getImportCompleted() != null)
            sb.append("ImportCompleted: ").append(getImportCompleted()).append(",");
        if (getImportTime() != null)
            sb.append("ImportTime: ").append(getImportTime()).append(",");
        if (getImportedBy() != null)
            sb.append("ImportedBy: ").append(getImportedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogImportStatus == false)
            return false;
        CatalogImportStatus other = (CatalogImportStatus) obj;
        if (other.getImportCompleted() == null ^ this.getImportCompleted() == null)
            return false;
        if (other.getImportCompleted() != null && other.getImportCompleted().equals(this.getImportCompleted()) == false)
            return false;
        if (other.getImportTime() == null ^ this.getImportTime() == null)
            return false;
        if (other.getImportTime() != null && other.getImportTime().equals(this.getImportTime()) == false)
            return false;
        if (other.getImportedBy() == null ^ this.getImportedBy() == null)
            return false;
        if (other.getImportedBy() != null && other.getImportedBy().equals(this.getImportedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportCompleted() == null) ? 0 : getImportCompleted().hashCode());
        hashCode = prime * hashCode + ((getImportTime() == null) ? 0 : getImportTime().hashCode());
        hashCode = prime * hashCode + ((getImportedBy() == null) ? 0 : getImportedBy().hashCode());
        return hashCode;
    }

    @Override
    public CatalogImportStatus clone() {
        try {
            return (CatalogImportStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CatalogImportStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
