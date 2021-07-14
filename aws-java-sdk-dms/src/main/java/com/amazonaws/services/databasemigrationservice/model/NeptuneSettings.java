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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines an Amazon Neptune endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/NeptuneSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NeptuneSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The role
     * must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration Service
     * User Guide. </i>
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     * bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing it in
     * these .csv files.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     * <code>S3BucketName</code>
     * </p>
     */
    private String s3BucketFolder;
    /**
     * <p>
     * The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune target
     * database before raising an error. The default is 250.
     * </p>
     */
    private Integer errorRetryDuration;
    /**
     * <p>
     * The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data to the
     * Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears the bucket,
     * ready to store the next batch of migrated graph data.
     * </p>
     */
    private Integer maxFileSize;
    /**
     * <p>
     * The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database before
     * raising an error. The default is 5.
     * </p>
     */
    private Integer maxRetryCount;
    /**
     * <p>
     * If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to
     * <code>true</code>. Then attach the appropriate IAM policy document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     */
    private Boolean iamAuthEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The role
     * must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration Service
     * User Guide. </i>
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The
     *        role must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     *        >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration
     *        Service User Guide. </i>
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The role
     * must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration Service
     * User Guide. </i>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The
     *         role must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     *         >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration
     *         Service User Guide. </i>
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The role
     * must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     * >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration Service
     * User Guide. </i>
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The
     *        role must allow the <code>iam:PassRole</code> action. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Neptune.html#CHAP_Target.Neptune.ServiceRole"
     *        >Creating an IAM Service Role for Accessing Amazon Neptune as a Target</a> in the <i>Database Migration
     *        Service User Guide. </i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     * bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing it in
     * these .csv files.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     *        bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing
     *        it in these .csv files.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     * bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing it in
     * these .csv files.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     *         bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing
     *         it in these .csv files.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     * bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing it in
     * these .csv files.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before
     *        bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing
     *        it in these .csv files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     * <code>S3BucketName</code>
     * </p>
     * 
     * @param s3BucketFolder
     *        A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     *        <code>S3BucketName</code>
     */

    public void setS3BucketFolder(String s3BucketFolder) {
        this.s3BucketFolder = s3BucketFolder;
    }

    /**
     * <p>
     * A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     * <code>S3BucketName</code>
     * </p>
     * 
     * @return A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     *         <code>S3BucketName</code>
     */

    public String getS3BucketFolder() {
        return this.s3BucketFolder;
    }

    /**
     * <p>
     * A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     * <code>S3BucketName</code>
     * </p>
     * 
     * @param s3BucketFolder
     *        A folder path where you want DMS to store migrated graph data in the S3 bucket specified by
     *        <code>S3BucketName</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withS3BucketFolder(String s3BucketFolder) {
        setS3BucketFolder(s3BucketFolder);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune target
     * database before raising an error. The default is 250.
     * </p>
     * 
     * @param errorRetryDuration
     *        The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune
     *        target database before raising an error. The default is 250.
     */

    public void setErrorRetryDuration(Integer errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
    }

    /**
     * <p>
     * The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune target
     * database before raising an error. The default is 250.
     * </p>
     * 
     * @return The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune
     *         target database before raising an error. The default is 250.
     */

    public Integer getErrorRetryDuration() {
        return this.errorRetryDuration;
    }

    /**
     * <p>
     * The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune target
     * database before raising an error. The default is 250.
     * </p>
     * 
     * @param errorRetryDuration
     *        The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune
     *        target database before raising an error. The default is 250.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withErrorRetryDuration(Integer errorRetryDuration) {
        setErrorRetryDuration(errorRetryDuration);
        return this;
    }

    /**
     * <p>
     * The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data to the
     * Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears the bucket,
     * ready to store the next batch of migrated graph data.
     * </p>
     * 
     * @param maxFileSize
     *        The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data
     *        to the Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears
     *        the bucket, ready to store the next batch of migrated graph data.
     */

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * <p>
     * The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data to the
     * Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears the bucket,
     * ready to store the next batch of migrated graph data.
     * </p>
     * 
     * @return The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data
     *         to the Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears
     *         the bucket, ready to store the next batch of migrated graph data.
     */

    public Integer getMaxFileSize() {
        return this.maxFileSize;
    }

    /**
     * <p>
     * The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data to the
     * Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears the bucket,
     * ready to store the next batch of migrated graph data.
     * </p>
     * 
     * @param maxFileSize
     *        The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data
     *        to the Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears
     *        the bucket, ready to store the next batch of migrated graph data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withMaxFileSize(Integer maxFileSize) {
        setMaxFileSize(maxFileSize);
        return this;
    }

    /**
     * <p>
     * The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database before
     * raising an error. The default is 5.
     * </p>
     * 
     * @param maxRetryCount
     *        The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database
     *        before raising an error. The default is 5.
     */

    public void setMaxRetryCount(Integer maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    /**
     * <p>
     * The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database before
     * raising an error. The default is 5.
     * </p>
     * 
     * @return The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database
     *         before raising an error. The default is 5.
     */

    public Integer getMaxRetryCount() {
        return this.maxRetryCount;
    }

    /**
     * <p>
     * The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database before
     * raising an error. The default is 5.
     * </p>
     * 
     * @param maxRetryCount
     *        The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database
     *        before raising an error. The default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withMaxRetryCount(Integer maxRetryCount) {
        setMaxRetryCount(maxRetryCount);
        return this;
    }

    /**
     * <p>
     * If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to
     * <code>true</code>. Then attach the appropriate IAM policy document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param iamAuthEnabled
     *        If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this
     *        parameter to <code>true</code>. Then attach the appropriate IAM policy document to your service role
     *        specified by <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     */

    public void setIamAuthEnabled(Boolean iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
    }

    /**
     * <p>
     * If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to
     * <code>true</code>. Then attach the appropriate IAM policy document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this
     *         parameter to <code>true</code>. Then attach the appropriate IAM policy document to your service role
     *         specified by <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     */

    public Boolean getIamAuthEnabled() {
        return this.iamAuthEnabled;
    }

    /**
     * <p>
     * If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to
     * <code>true</code>. Then attach the appropriate IAM policy document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     * 
     * @param iamAuthEnabled
     *        If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this
     *        parameter to <code>true</code>. Then attach the appropriate IAM policy document to your service role
     *        specified by <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeptuneSettings withIamAuthEnabled(Boolean iamAuthEnabled) {
        setIamAuthEnabled(iamAuthEnabled);
        return this;
    }

    /**
     * <p>
     * If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to
     * <code>true</code>. Then attach the appropriate IAM policy document to your service role specified by
     * <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     * </p>
     * 
     * @return If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this
     *         parameter to <code>true</code>. Then attach the appropriate IAM policy document to your service role
     *         specified by <code>ServiceAccessRoleArn</code>. The default is <code>false</code>.
     */

    public Boolean isIamAuthEnabled() {
        return this.iamAuthEnabled;
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3BucketFolder() != null)
            sb.append("S3BucketFolder: ").append(getS3BucketFolder()).append(",");
        if (getErrorRetryDuration() != null)
            sb.append("ErrorRetryDuration: ").append(getErrorRetryDuration()).append(",");
        if (getMaxFileSize() != null)
            sb.append("MaxFileSize: ").append(getMaxFileSize()).append(",");
        if (getMaxRetryCount() != null)
            sb.append("MaxRetryCount: ").append(getMaxRetryCount()).append(",");
        if (getIamAuthEnabled() != null)
            sb.append("IamAuthEnabled: ").append(getIamAuthEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NeptuneSettings == false)
            return false;
        NeptuneSettings other = (NeptuneSettings) obj;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3BucketFolder() == null ^ this.getS3BucketFolder() == null)
            return false;
        if (other.getS3BucketFolder() != null && other.getS3BucketFolder().equals(this.getS3BucketFolder()) == false)
            return false;
        if (other.getErrorRetryDuration() == null ^ this.getErrorRetryDuration() == null)
            return false;
        if (other.getErrorRetryDuration() != null && other.getErrorRetryDuration().equals(this.getErrorRetryDuration()) == false)
            return false;
        if (other.getMaxFileSize() == null ^ this.getMaxFileSize() == null)
            return false;
        if (other.getMaxFileSize() != null && other.getMaxFileSize().equals(this.getMaxFileSize()) == false)
            return false;
        if (other.getMaxRetryCount() == null ^ this.getMaxRetryCount() == null)
            return false;
        if (other.getMaxRetryCount() != null && other.getMaxRetryCount().equals(this.getMaxRetryCount()) == false)
            return false;
        if (other.getIamAuthEnabled() == null ^ this.getIamAuthEnabled() == null)
            return false;
        if (other.getIamAuthEnabled() != null && other.getIamAuthEnabled().equals(this.getIamAuthEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketFolder() == null) ? 0 : getS3BucketFolder().hashCode());
        hashCode = prime * hashCode + ((getErrorRetryDuration() == null) ? 0 : getErrorRetryDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxFileSize() == null) ? 0 : getMaxFileSize().hashCode());
        hashCode = prime * hashCode + ((getMaxRetryCount() == null) ? 0 : getMaxRetryCount().hashCode());
        hashCode = prime * hashCode + ((getIamAuthEnabled() == null) ? 0 : getIamAuthEnabled().hashCode());
        return hashCode;
    }

    @Override
    public NeptuneSettings clone() {
        try {
            return (NeptuneSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.NeptuneSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
