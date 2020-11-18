/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the Amazon S3 Storage Lens configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the Amazon S3 Storage Lens configuration ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A container for all the account-level configurations of your S3 Storage Lens configuration.
     * </p>
     */
    private AccountLevel accountLevel;
    /**
     * <p>
     * A container for what is included in this configuration. This container can only be valid if there is no
     * <code>Exclude</code> container submitted, and it's not empty.
     * </p>
     */
    private Include include;
    /**
     * <p>
     * A container for what is excluded in this configuration. This container can only be valid if there is no
     * <code>Include</code> container submitted, and it's not empty.
     * </p>
     */
    private Exclude exclude;
    /**
     * <p>
     * A container to specify the properties of your S3 Storage Lens metrics export including, the destination, schema
     * and format.
     * </p>
     */
    private StorageLensDataExport dataExport;
    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled.
     * </p>
     */
    private Boolean isEnabled;
    /**
     * <p>
     * A container for the AWS organization for this S3 Storage Lens configuration.
     * </p>
     */
    private StorageLensAwsOrg awsOrg;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and follows the
     * following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     * </p>
     */
    private String storageLensArn;

    /**
     * <p>
     * A container for the Amazon S3 Storage Lens configuration ID.
     * </p>
     * 
     * @param id
     *        A container for the Amazon S3 Storage Lens configuration ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A container for the Amazon S3 Storage Lens configuration ID.
     * </p>
     * 
     * @return A container for the Amazon S3 Storage Lens configuration ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A container for the Amazon S3 Storage Lens configuration ID.
     * </p>
     * 
     * @param id
     *        A container for the Amazon S3 Storage Lens configuration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A container for all the account-level configurations of your S3 Storage Lens configuration.
     * </p>
     * 
     * @param accountLevel
     *        A container for all the account-level configurations of your S3 Storage Lens configuration.
     */

    public void setAccountLevel(AccountLevel accountLevel) {
        this.accountLevel = accountLevel;
    }

    /**
     * <p>
     * A container for all the account-level configurations of your S3 Storage Lens configuration.
     * </p>
     * 
     * @return A container for all the account-level configurations of your S3 Storage Lens configuration.
     */

    public AccountLevel getAccountLevel() {
        return this.accountLevel;
    }

    /**
     * <p>
     * A container for all the account-level configurations of your S3 Storage Lens configuration.
     * </p>
     * 
     * @param accountLevel
     *        A container for all the account-level configurations of your S3 Storage Lens configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withAccountLevel(AccountLevel accountLevel) {
        setAccountLevel(accountLevel);
        return this;
    }

    /**
     * <p>
     * A container for what is included in this configuration. This container can only be valid if there is no
     * <code>Exclude</code> container submitted, and it's not empty.
     * </p>
     * 
     * @param include
     *        A container for what is included in this configuration. This container can only be valid if there is no
     *        <code>Exclude</code> container submitted, and it's not empty.
     */

    public void setInclude(Include include) {
        this.include = include;
    }

    /**
     * <p>
     * A container for what is included in this configuration. This container can only be valid if there is no
     * <code>Exclude</code> container submitted, and it's not empty.
     * </p>
     * 
     * @return A container for what is included in this configuration. This container can only be valid if there is no
     *         <code>Exclude</code> container submitted, and it's not empty.
     */

    public Include getInclude() {
        return this.include;
    }

    /**
     * <p>
     * A container for what is included in this configuration. This container can only be valid if there is no
     * <code>Exclude</code> container submitted, and it's not empty.
     * </p>
     * 
     * @param include
     *        A container for what is included in this configuration. This container can only be valid if there is no
     *        <code>Exclude</code> container submitted, and it's not empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withInclude(Include include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * A container for what is excluded in this configuration. This container can only be valid if there is no
     * <code>Include</code> container submitted, and it's not empty.
     * </p>
     * 
     * @param exclude
     *        A container for what is excluded in this configuration. This container can only be valid if there is no
     *        <code>Include</code> container submitted, and it's not empty.
     */

    public void setExclude(Exclude exclude) {
        this.exclude = exclude;
    }

    /**
     * <p>
     * A container for what is excluded in this configuration. This container can only be valid if there is no
     * <code>Include</code> container submitted, and it's not empty.
     * </p>
     * 
     * @return A container for what is excluded in this configuration. This container can only be valid if there is no
     *         <code>Include</code> container submitted, and it's not empty.
     */

    public Exclude getExclude() {
        return this.exclude;
    }

    /**
     * <p>
     * A container for what is excluded in this configuration. This container can only be valid if there is no
     * <code>Include</code> container submitted, and it's not empty.
     * </p>
     * 
     * @param exclude
     *        A container for what is excluded in this configuration. This container can only be valid if there is no
     *        <code>Include</code> container submitted, and it's not empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withExclude(Exclude exclude) {
        setExclude(exclude);
        return this;
    }

    /**
     * <p>
     * A container to specify the properties of your S3 Storage Lens metrics export including, the destination, schema
     * and format.
     * </p>
     * 
     * @param dataExport
     *        A container to specify the properties of your S3 Storage Lens metrics export including, the destination,
     *        schema and format.
     */

    public void setDataExport(StorageLensDataExport dataExport) {
        this.dataExport = dataExport;
    }

    /**
     * <p>
     * A container to specify the properties of your S3 Storage Lens metrics export including, the destination, schema
     * and format.
     * </p>
     * 
     * @return A container to specify the properties of your S3 Storage Lens metrics export including, the destination,
     *         schema and format.
     */

    public StorageLensDataExport getDataExport() {
        return this.dataExport;
    }

    /**
     * <p>
     * A container to specify the properties of your S3 Storage Lens metrics export including, the destination, schema
     * and format.
     * </p>
     * 
     * @param dataExport
     *        A container to specify the properties of your S3 Storage Lens metrics export including, the destination,
     *        schema and format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withDataExport(StorageLensDataExport dataExport) {
        setDataExport(dataExport);
        return this;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled.
     * </p>
     * 
     * @param isEnabled
     *        A container for whether the S3 Storage Lens configuration is enabled.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled.
     * </p>
     * 
     * @return A container for whether the S3 Storage Lens configuration is enabled.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled.
     * </p>
     * 
     * @param isEnabled
     *        A container for whether the S3 Storage Lens configuration is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled.
     * </p>
     * 
     * @return A container for whether the S3 Storage Lens configuration is enabled.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A container for the AWS organization for this S3 Storage Lens configuration.
     * </p>
     * 
     * @param awsOrg
     *        A container for the AWS organization for this S3 Storage Lens configuration.
     */

    public void setAwsOrg(StorageLensAwsOrg awsOrg) {
        this.awsOrg = awsOrg;
    }

    /**
     * <p>
     * A container for the AWS organization for this S3 Storage Lens configuration.
     * </p>
     * 
     * @return A container for the AWS organization for this S3 Storage Lens configuration.
     */

    public StorageLensAwsOrg getAwsOrg() {
        return this.awsOrg;
    }

    /**
     * <p>
     * A container for the AWS organization for this S3 Storage Lens configuration.
     * </p>
     * 
     * @param awsOrg
     *        A container for the AWS organization for this S3 Storage Lens configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withAwsOrg(StorageLensAwsOrg awsOrg) {
        setAwsOrg(awsOrg);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and follows the
     * following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     * </p>
     * 
     * @param storageLensArn
     *        The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and
     *        follows the following format:
     *        <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     */

    public void setStorageLensArn(String storageLensArn) {
        this.storageLensArn = storageLensArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and follows the
     * following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and
     *         follows the following format:
     *         <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     */

    public String getStorageLensArn() {
        return this.storageLensArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and follows the
     * following format:
     * <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     * </p>
     * 
     * @param storageLensArn
     *        The Amazon Resource Name (ARN) of the S3 Storage Lens configuration. This property is read-only and
     *        follows the following format:
     *        <code> arn:aws:s3:<i>us-east-1</i>:<i>example-account-id</i>:storage-lens/<i>your-dashboard-name</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensConfiguration withStorageLensArn(String storageLensArn) {
        setStorageLensArn(storageLensArn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAccountLevel() != null)
            sb.append("AccountLevel: ").append(getAccountLevel()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude()).append(",");
        if (getExclude() != null)
            sb.append("Exclude: ").append(getExclude()).append(",");
        if (getDataExport() != null)
            sb.append("DataExport: ").append(getDataExport()).append(",");
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled()).append(",");
        if (getAwsOrg() != null)
            sb.append("AwsOrg: ").append(getAwsOrg()).append(",");
        if (getStorageLensArn() != null)
            sb.append("StorageLensArn: ").append(getStorageLensArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensConfiguration == false)
            return false;
        StorageLensConfiguration other = (StorageLensConfiguration) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAccountLevel() == null ^ this.getAccountLevel() == null)
            return false;
        if (other.getAccountLevel() != null && other.getAccountLevel().equals(this.getAccountLevel()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        if (other.getExclude() == null ^ this.getExclude() == null)
            return false;
        if (other.getExclude() != null && other.getExclude().equals(this.getExclude()) == false)
            return false;
        if (other.getDataExport() == null ^ this.getDataExport() == null)
            return false;
        if (other.getDataExport() != null && other.getDataExport().equals(this.getDataExport()) == false)
            return false;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        if (other.getAwsOrg() == null ^ this.getAwsOrg() == null)
            return false;
        if (other.getAwsOrg() != null && other.getAwsOrg().equals(this.getAwsOrg()) == false)
            return false;
        if (other.getStorageLensArn() == null ^ this.getStorageLensArn() == null)
            return false;
        if (other.getStorageLensArn() != null && other.getStorageLensArn().equals(this.getStorageLensArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAccountLevel() == null) ? 0 : getAccountLevel().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        hashCode = prime * hashCode + ((getExclude() == null) ? 0 : getExclude().hashCode());
        hashCode = prime * hashCode + ((getDataExport() == null) ? 0 : getDataExport().hashCode());
        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAwsOrg() == null) ? 0 : getAwsOrg().hashCode());
        hashCode = prime * hashCode + ((getStorageLensArn() == null) ? 0 : getStorageLensArn().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensConfiguration clone() {
        try {
            return (StorageLensConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
