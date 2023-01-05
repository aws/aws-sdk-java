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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data Catalog. When
 * Amazon AppFlow catalogs your data, it stores metadata in Data Catalog tables. This metadata represents the data
 * that's transferred by the flow that you configure with these settings.
 * </p>
 * <note>
 * <p>
 * You can configure a flow with these settings only when the flow destination is Amazon S3.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/GlueDataCatalogConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlueDataCatalogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to create Data
     * Catalog tables, databases, and partitions.
     * </p>
     * <p>
     * For an example IAM policy that has the required permissions, see <a
     * href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     * >Identity-based policy examples for Amazon AppFlow</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your Amazon
     * Web Services account. These tables contain metadata for the data that's transferred by the flow that you
     * configure with this parameter.
     * </p>
     * <note>
     * <p>
     * When you configure a new flow with this parameter, you must specify an existing database.
     * </p>
     * </note>
     */
    private String databaseName;
    /**
     * <p>
     * A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure with this
     * setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     * </p>
     */
    private String tablePrefix;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to create Data
     * Catalog tables, databases, and partitions.
     * </p>
     * <p>
     * For an example IAM policy that has the required permissions, see <a
     * href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     * >Identity-based policy examples for Amazon AppFlow</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to
     *        create Data Catalog tables, databases, and partitions.</p>
     *        <p>
     *        For an example IAM policy that has the required permissions, see <a
     *        href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     *        >Identity-based policy examples for Amazon AppFlow</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to create Data
     * Catalog tables, databases, and partitions.
     * </p>
     * <p>
     * For an example IAM policy that has the required permissions, see <a
     * href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     * >Identity-based policy examples for Amazon AppFlow</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to
     *         create Data Catalog tables, databases, and partitions.</p>
     *         <p>
     *         For an example IAM policy that has the required permissions, see <a
     *         href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     *         >Identity-based policy examples for Amazon AppFlow</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to create Data
     * Catalog tables, databases, and partitions.
     * </p>
     * <p>
     * For an example IAM policy that has the required permissions, see <a
     * href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     * >Identity-based policy examples for Amazon AppFlow</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants Amazon AppFlow the permissions it needs to
     *        create Data Catalog tables, databases, and partitions.</p>
     *        <p>
     *        For an example IAM policy that has the required permissions, see <a
     *        href="https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_id-based-policy-examples.html"
     *        >Identity-based policy examples for Amazon AppFlow</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataCatalogConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your Amazon
     * Web Services account. These tables contain metadata for the data that's transferred by the flow that you
     * configure with this parameter.
     * </p>
     * <note>
     * <p>
     * When you configure a new flow with this parameter, you must specify an existing database.
     * </p>
     * </note>
     * 
     * @param databaseName
     *        The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your
     *        Amazon Web Services account. These tables contain metadata for the data that's transferred by the flow
     *        that you configure with this parameter.</p> <note>
     *        <p>
     *        When you configure a new flow with this parameter, you must specify an existing database.
     *        </p>
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your Amazon
     * Web Services account. These tables contain metadata for the data that's transferred by the flow that you
     * configure with this parameter.
     * </p>
     * <note>
     * <p>
     * When you configure a new flow with this parameter, you must specify an existing database.
     * </p>
     * </note>
     * 
     * @return The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your
     *         Amazon Web Services account. These tables contain metadata for the data that's transferred by the flow
     *         that you configure with this parameter.</p> <note>
     *         <p>
     *         When you configure a new flow with this parameter, you must specify an existing database.
     *         </p>
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your Amazon
     * Web Services account. These tables contain metadata for the data that's transferred by the flow that you
     * configure with this parameter.
     * </p>
     * <note>
     * <p>
     * When you configure a new flow with this parameter, you must specify an existing database.
     * </p>
     * </note>
     * 
     * @param databaseName
     *        The name of the Data Catalog database that stores the metadata tables that Amazon AppFlow creates in your
     *        Amazon Web Services account. These tables contain metadata for the data that's transferred by the flow
     *        that you configure with this parameter.</p> <note>
     *        <p>
     *        When you configure a new flow with this parameter, you must specify an existing database.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataCatalogConfig withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure with this
     * setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     * </p>
     * 
     * @param tablePrefix
     *        A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure
     *        with this setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     */

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * <p>
     * A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure with this
     * setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     * </p>
     * 
     * @return A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure
     *         with this setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     */

    public String getTablePrefix() {
        return this.tablePrefix;
    }

    /**
     * <p>
     * A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure with this
     * setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     * </p>
     * 
     * @param tablePrefix
     *        A naming prefix for each Data Catalog table that Amazon AppFlow creates for the flow that you configure
     *        with this setting. Amazon AppFlow adds the prefix to the beginning of the each table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataCatalogConfig withTablePrefix(String tablePrefix) {
        setTablePrefix(tablePrefix);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTablePrefix() != null)
            sb.append("TablePrefix: ").append(getTablePrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlueDataCatalogConfig == false)
            return false;
        GlueDataCatalogConfig other = (GlueDataCatalogConfig) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTablePrefix() == null ^ this.getTablePrefix() == null)
            return false;
        if (other.getTablePrefix() != null && other.getTablePrefix().equals(this.getTablePrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTablePrefix() == null) ? 0 : getTablePrefix().hashCode());
        return hashCode;
    }

    @Override
    public GlueDataCatalogConfig clone() {
        try {
            return (GlueDataCatalogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.GlueDataCatalogConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
