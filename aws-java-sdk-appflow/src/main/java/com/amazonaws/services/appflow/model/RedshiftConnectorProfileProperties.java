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
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     */
    private String roleArn;

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
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftConnectorProfileProperties withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
            sb.append("RoleArn: ").append(getRoleArn());
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
