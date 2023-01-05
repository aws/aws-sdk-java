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
 * The connector-specific profile properties when using Amazon Redshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/RedshiftConnectorProfileProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JDBC URL of the Amazon Redshift cluster.
     * </p>
     */
    private String databaseUrl;
    /**
     * <p>
     * A name for the associated Amazon S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For more
     * information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     * >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift database
     * through the Data API. For more information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     * >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     * </p>
     */
    private String dataApiRoleArn;
    /**
     * <p>
     * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data warehouse.
     * </p>
     */
    private Boolean isRedshiftServerless;
    /**
     * <p>
     * The unique ID that's assigned to an Amazon Redshift cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of an Amazon Redshift workgroup.
     * </p>
     */
    private String workgroupName;
    /**
     * <p>
     * The name of an Amazon Redshift database.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The JDBC URL of the Amazon Redshift cluster.
     * </p>
     * 
     * @param databaseUrl
     *        The JDBC URL of the Amazon Redshift cluster.
     */

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    /**
     * <p>
     * The JDBC URL of the Amazon Redshift cluster.
     * </p>
     * 
     * @return The JDBC URL of the Amazon Redshift cluster.
     */

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    /**
     * <p>
     * The JDBC URL of the Amazon Redshift cluster.
     * </p>
     * 
     * @param databaseUrl
     *        The JDBC URL of the Amazon Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withDatabaseUrl(String databaseUrl) {
        setDatabaseUrl(databaseUrl);
        return this;
    }

    /**
     * <p>
     * A name for the associated Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        A name for the associated Amazon S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * A name for the associated Amazon S3 bucket.
     * </p>
     * 
     * @return A name for the associated Amazon S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * A name for the associated Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        A name for the associated Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     * 
     * @param bucketPrefix
     *        The object key for the destination bucket in which Amazon AppFlow places the files.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     * 
     * @return The object key for the destination bucket in which Amazon AppFlow places the files.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     * 
     * @param bucketPrefix
     *        The object key for the destination bucket in which Amazon AppFlow places the files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For more
     * information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     * >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For
     *        more information, and for the polices that you attach to this role, see <a href=
     *        "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     *        >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For more
     * information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     * >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For
     *         more information, and for the polices that you attach to this role, see <a href=
     *         "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     *         >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For more
     * information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     * >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For
     *        more information, and for the polices that you attach to this role, see <a href=
     *        "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#redshift-access-s3"
     *        >Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift database
     * through the Data API. For more information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     * >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     * </p>
     * 
     * @param dataApiRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift
     *        database through the Data API. For more information, and for the polices that you attach to this role, see
     *        <a href=
     *        "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     *        >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     */

    public void setDataApiRoleArn(String dataApiRoleArn) {
        this.dataApiRoleArn = dataApiRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift database
     * through the Data API. For more information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     * >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift
     *         database through the Data API. For more information, and for the polices that you attach to this role,
     *         see <a href=
     *         "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     *         >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     */

    public String getDataApiRoleArn() {
        return this.dataApiRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift database
     * through the Data API. For more information, and for the polices that you attach to this role, see <a href=
     * "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     * >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     * </p>
     * 
     * @param dataApiRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift
     *        database through the Data API. For more information, and for the polices that you attach to this role, see
     *        <a href=
     *        "https://docs.aws.amazon.com/appflow/latest/userguide/security_iam_service-role-policies.html#access-redshift"
     *        >Allow Amazon AppFlow to access Amazon Redshift databases with the Data API</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withDataApiRoleArn(String dataApiRoleArn) {
        setDataApiRoleArn(dataApiRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data warehouse.
     * </p>
     * 
     * @param isRedshiftServerless
     *        Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data
     *        warehouse.
     */

    public void setIsRedshiftServerless(Boolean isRedshiftServerless) {
        this.isRedshiftServerless = isRedshiftServerless;
    }

    /**
     * <p>
     * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data warehouse.
     * </p>
     * 
     * @return Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data
     *         warehouse.
     */

    public Boolean getIsRedshiftServerless() {
        return this.isRedshiftServerless;
    }

    /**
     * <p>
     * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data warehouse.
     * </p>
     * 
     * @param isRedshiftServerless
     *        Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data
     *        warehouse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withIsRedshiftServerless(Boolean isRedshiftServerless) {
        setIsRedshiftServerless(isRedshiftServerless);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data warehouse.
     * </p>
     * 
     * @return Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data
     *         warehouse.
     */

    public Boolean isRedshiftServerless() {
        return this.isRedshiftServerless;
    }

    /**
     * <p>
     * The unique ID that's assigned to an Amazon Redshift cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique ID that's assigned to an Amazon Redshift cluster.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique ID that's assigned to an Amazon Redshift cluster.
     * </p>
     * 
     * @return The unique ID that's assigned to an Amazon Redshift cluster.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique ID that's assigned to an Amazon Redshift cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique ID that's assigned to an Amazon Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon Redshift workgroup.
     * </p>
     * 
     * @param workgroupName
     *        The name of an Amazon Redshift workgroup.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of an Amazon Redshift workgroup.
     * </p>
     * 
     * @return The name of an Amazon Redshift workgroup.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of an Amazon Redshift workgroup.
     * </p>
     * 
     * @param workgroupName
     *        The name of an Amazon Redshift workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon Redshift database.
     * </p>
     * 
     * @param databaseName
     *        The name of an Amazon Redshift database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of an Amazon Redshift database.
     * </p>
     * 
     * @return The name of an Amazon Redshift database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of an Amazon Redshift database.
     * </p>
     * 
     * @param databaseName
     *        The name of an Amazon Redshift database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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
        if (getDatabaseUrl() != null)
            sb.append("DatabaseUrl: ").append(getDatabaseUrl()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataApiRoleArn() != null)
            sb.append("DataApiRoleArn: ").append(getDataApiRoleArn()).append(",");
        if (getIsRedshiftServerless() != null)
            sb.append("IsRedshiftServerless: ").append(getIsRedshiftServerless()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftConnectorProfileProperties == false)
            return false;
        RedshiftConnectorProfileProperties other = (RedshiftConnectorProfileProperties) obj;
        if (other.getDatabaseUrl() == null ^ this.getDatabaseUrl() == null)
            return false;
        if (other.getDatabaseUrl() != null && other.getDatabaseUrl().equals(this.getDatabaseUrl()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDataApiRoleArn() == null ^ this.getDataApiRoleArn() == null)
            return false;
        if (other.getDataApiRoleArn() != null && other.getDataApiRoleArn().equals(this.getDataApiRoleArn()) == false)
            return false;
        if (other.getIsRedshiftServerless() == null ^ this.getIsRedshiftServerless() == null)
            return false;
        if (other.getIsRedshiftServerless() != null && other.getIsRedshiftServerless().equals(this.getIsRedshiftServerless()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseUrl() == null) ? 0 : getDatabaseUrl().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataApiRoleArn() == null) ? 0 : getDataApiRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIsRedshiftServerless() == null) ? 0 : getIsRedshiftServerless().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftConnectorProfileProperties clone() {
        try {
            return (RedshiftConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.RedshiftConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
