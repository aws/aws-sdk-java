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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details from an import AWS Lake Formation tag policy job response.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ImportAssetsFromLakeFormationTagPolicyResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAssetsFromLakeFormationTagPolicyResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A structure for the database object.
     * </p>
     */
    private DatabaseLFTagPolicyAndPermissions database;
    /**
     * <p>
     * A structure for the table object.
     * </p>
     */
    private TableLFTagPolicyAndPermissions table;
    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the AWS Glue Data Catalog.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     * 
     * @return The identifier for the AWS Glue Data Catalog.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the AWS Glue Data Catalog.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the AWS Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromLakeFormationTagPolicyResponseDetails withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A structure for the database object.
     * </p>
     * 
     * @param database
     *        A structure for the database object.
     */

    public void setDatabase(DatabaseLFTagPolicyAndPermissions database) {
        this.database = database;
    }

    /**
     * <p>
     * A structure for the database object.
     * </p>
     * 
     * @return A structure for the database object.
     */

    public DatabaseLFTagPolicyAndPermissions getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * A structure for the database object.
     * </p>
     * 
     * @param database
     *        A structure for the database object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromLakeFormationTagPolicyResponseDetails withDatabase(DatabaseLFTagPolicyAndPermissions database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * A structure for the table object.
     * </p>
     * 
     * @param table
     *        A structure for the table object.
     */

    public void setTable(TableLFTagPolicyAndPermissions table) {
        this.table = table;
    }

    /**
     * <p>
     * A structure for the table object.
     * </p>
     * 
     * @return A structure for the table object.
     */

    public TableLFTagPolicyAndPermissions getTable() {
        return this.table;
    }

    /**
     * <p>
     * A structure for the table object.
     * </p>
     * 
     * @param table
     *        A structure for the table object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromLakeFormationTagPolicyResponseDetails withTable(TableLFTagPolicyAndPermissions table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     * 
     * @param roleArn
     *        The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to
     *        AWS Lake Formation data permissions.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     * 
     * @return The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to
     *         AWS Lake Formation data permissions.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake
     * Formation data permissions.
     * </p>
     * 
     * @param roleArn
     *        The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to
     *        AWS Lake Formation data permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromLakeFormationTagPolicyResponseDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this import job.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * 
     * @return The unique identifier for the data set associated with this import job.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for the data set associated with this import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromLakeFormationTagPolicyResponseDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import job.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     * 
     * @return The unique identifier for the revision associated with this import job.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import job.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for the revision associated with this import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetsFromLakeFormationTagPolicyResponseDetails withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAssetsFromLakeFormationTagPolicyResponseDetails == false)
            return false;
        ImportAssetsFromLakeFormationTagPolicyResponseDetails other = (ImportAssetsFromLakeFormationTagPolicyResponseDetails) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public ImportAssetsFromLakeFormationTagPolicyResponseDetails clone() {
        try {
            return (ImportAssetsFromLakeFormationTagPolicyResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ImportAssetsFromLakeFormationTagPolicyResponseDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
