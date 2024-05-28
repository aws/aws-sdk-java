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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a schema conversion action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/SchemaConversionRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaConversionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schema conversion action status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The identifier for the schema conversion action.
     * </p>
     */
    private String requestIdentifier;
    /**
     * <p>
     * The migration project ARN.
     * </p>
     */
    private String migrationProjectArn;

    private ErrorDetails error;

    private ExportSqlDetails exportSqlDetails;

    /**
     * <p>
     * The schema conversion action status.
     * </p>
     * 
     * @param status
     *        The schema conversion action status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The schema conversion action status.
     * </p>
     * 
     * @return The schema conversion action status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The schema conversion action status.
     * </p>
     * 
     * @param status
     *        The schema conversion action status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConversionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The identifier for the schema conversion action.
     * </p>
     * 
     * @param requestIdentifier
     *        The identifier for the schema conversion action.
     */

    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * The identifier for the schema conversion action.
     * </p>
     * 
     * @return The identifier for the schema conversion action.
     */

    public String getRequestIdentifier() {
        return this.requestIdentifier;
    }

    /**
     * <p>
     * The identifier for the schema conversion action.
     * </p>
     * 
     * @param requestIdentifier
     *        The identifier for the schema conversion action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConversionRequest withRequestIdentifier(String requestIdentifier) {
        setRequestIdentifier(requestIdentifier);
        return this;
    }

    /**
     * <p>
     * The migration project ARN.
     * </p>
     * 
     * @param migrationProjectArn
     *        The migration project ARN.
     */

    public void setMigrationProjectArn(String migrationProjectArn) {
        this.migrationProjectArn = migrationProjectArn;
    }

    /**
     * <p>
     * The migration project ARN.
     * </p>
     * 
     * @return The migration project ARN.
     */

    public String getMigrationProjectArn() {
        return this.migrationProjectArn;
    }

    /**
     * <p>
     * The migration project ARN.
     * </p>
     * 
     * @param migrationProjectArn
     *        The migration project ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConversionRequest withMigrationProjectArn(String migrationProjectArn) {
        setMigrationProjectArn(migrationProjectArn);
        return this;
    }

    /**
     * @param error
     */

    public void setError(ErrorDetails error) {
        this.error = error;
    }

    /**
     * @return
     */

    public ErrorDetails getError() {
        return this.error;
    }

    /**
     * @param error
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConversionRequest withError(ErrorDetails error) {
        setError(error);
        return this;
    }

    /**
     * @param exportSqlDetails
     */

    public void setExportSqlDetails(ExportSqlDetails exportSqlDetails) {
        this.exportSqlDetails = exportSqlDetails;
    }

    /**
     * @return
     */

    public ExportSqlDetails getExportSqlDetails() {
        return this.exportSqlDetails;
    }

    /**
     * @param exportSqlDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaConversionRequest withExportSqlDetails(ExportSqlDetails exportSqlDetails) {
        setExportSqlDetails(exportSqlDetails);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: ").append(getRequestIdentifier()).append(",");
        if (getMigrationProjectArn() != null)
            sb.append("MigrationProjectArn: ").append(getMigrationProjectArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getExportSqlDetails() != null)
            sb.append("ExportSqlDetails: ").append(getExportSqlDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaConversionRequest == false)
            return false;
        SchemaConversionRequest other = (SchemaConversionRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        if (other.getMigrationProjectArn() == null ^ this.getMigrationProjectArn() == null)
            return false;
        if (other.getMigrationProjectArn() != null && other.getMigrationProjectArn().equals(this.getMigrationProjectArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getExportSqlDetails() == null ^ this.getExportSqlDetails() == null)
            return false;
        if (other.getExportSqlDetails() != null && other.getExportSqlDetails().equals(this.getExportSqlDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMigrationProjectArn() == null) ? 0 : getMigrationProjectArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getExportSqlDetails() == null) ? 0 : getExportSqlDetails().hashCode());
        return hashCode;
    }

    @Override
    public SchemaConversionRequest clone() {
        try {
            return (SchemaConversionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.SchemaConversionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
