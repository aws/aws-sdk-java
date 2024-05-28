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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides replication details for objects stored in the Amazon Security Lake data lake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeReplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     * <code>region</code> parameter of the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     * <code>CreateDataLake</code> </a> or <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     * <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in this
     * parameter.
     * </p>
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that are
     * configured for object replication can be owned by the same Amazon Web Services account or by different accounts.
     * You can replicate objects to a single destination bucket or to multiple destination buckets. The destination
     * buckets can be in different Regions or within the same Region as the source bucket.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     * <code>region</code> parameter of the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     * <code>CreateDataLake</code> </a> or <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     * <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in this
     * parameter.
     * </p>
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that are
     * configured for object replication can be owned by the same Amazon Web Services account or by different accounts.
     * You can replicate objects to a single destination bucket or to multiple destination buckets. The destination
     * buckets can be in different Regions or within the same Region as the source bucket.
     * </p>
     * 
     * @return Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     *         <code>region</code> parameter of the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     *         <code>CreateDataLake</code> </a> or <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     *         <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in
     *         this parameter.</p>
     *         <p>
     *         Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that
     *         are configured for object replication can be owned by the same Amazon Web Services account or by
     *         different accounts. You can replicate objects to a single destination bucket or to multiple destination
     *         buckets. The destination buckets can be in different Regions or within the same Region as the source
     *         bucket.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     * <code>region</code> parameter of the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     * <code>CreateDataLake</code> </a> or <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     * <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in this
     * parameter.
     * </p>
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that are
     * configured for object replication can be owned by the same Amazon Web Services account or by different accounts.
     * You can replicate objects to a single destination bucket or to multiple destination buckets. The destination
     * buckets can be in different Regions or within the same Region as the source bucket.
     * </p>
     * 
     * @param regions
     *        Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     *        <code>region</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     *        <code>CreateDataLake</code> </a> or <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     *        <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in
     *        this parameter.</p>
     *        <p>
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that
     *        are configured for object replication can be owned by the same Amazon Web Services account or by different
     *        accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     *        destination buckets can be in different Regions or within the same Region as the source bucket.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     * <code>region</code> parameter of the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     * <code>CreateDataLake</code> </a> or <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     * <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in this
     * parameter.
     * </p>
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that are
     * configured for object replication can be owned by the same Amazon Web Services account or by different accounts.
     * You can replicate objects to a single destination bucket or to multiple destination buckets. The destination
     * buckets can be in different Regions or within the same Region as the source bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     *        <code>region</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     *        <code>CreateDataLake</code> </a> or <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     *        <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in
     *        this parameter.</p>
     *        <p>
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that
     *        are configured for object replication can be owned by the same Amazon Web Services account or by different
     *        accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     *        destination buckets can be in different Regions or within the same Region as the source bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeReplicationConfiguration withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     * <code>region</code> parameter of the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     * <code>CreateDataLake</code> </a> or <a
     * href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     * <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in this
     * parameter.
     * </p>
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that are
     * configured for object replication can be owned by the same Amazon Web Services account or by different accounts.
     * You can replicate objects to a single destination bucket or to multiple destination buckets. The destination
     * buckets can be in different Regions or within the same Region as the source bucket.
     * </p>
     * 
     * @param regions
     *        Specifies one or more centralized rollup Regions. The Amazon Web Services Region specified in the
     *        <code>region</code> parameter of the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_CreateDataLake.html">
     *        <code>CreateDataLake</code> </a> or <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/APIReference/API_UpdateDataLake.html">
     *        <code>UpdateDataLake</code> </a> operations contributes data to the rollup Region or Regions specified in
     *        this parameter.</p>
     *        <p>
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3 buckets that
     *        are configured for object replication can be owned by the same Amazon Web Services account or by different
     *        accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     *        destination buckets can be in different Regions or within the same Region as the source bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeReplicationConfiguration withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     * 
     * @param roleArn
     *        Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management
     *        (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     * 
     * @return Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management
     *         (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     * 
     * @param roleArn
     *        Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management
     *        (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeReplicationConfiguration withRoleArn(String roleArn) {
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
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
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

        if (obj instanceof DataLakeReplicationConfiguration == false)
            return false;
        DataLakeReplicationConfiguration other = (DataLakeReplicationConfiguration) obj;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
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

        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeReplicationConfiguration clone() {
        try {
            return (DataLakeReplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeReplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
