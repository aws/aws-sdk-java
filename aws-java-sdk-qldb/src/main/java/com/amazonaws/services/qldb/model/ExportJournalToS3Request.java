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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ExportJournalToS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJournalToS3Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>,
     * Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     */
    private java.util.Date inclusiveStartTime;
    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     * </p>
     */
    private java.util.Date exclusiveEndTime;
    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your export request.
     * </p>
     */
    private S3ExportConfiguration s3ExportConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJournalToS3Request withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>,
     * Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time for the range of journal contents that you want to export.</p>
     *        <p>
     *        The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *        Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     *        </p>
     *        <p>
     *        The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     *        </p>
     *        <p>
     *        If you provide an <code>InclusiveStartTime</code> that is before the ledger's
     *        <code>CreationDateTime</code>, Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     */

    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>,
     * Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     * 
     * @return The inclusive start date and time for the range of journal contents that you want to export.</p>
     *         <p>
     *         The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in
     *         Universal Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     *         </p>
     *         <p>
     *         The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     *         </p>
     *         <p>
     *         If you provide an <code>InclusiveStartTime</code> that is before the ledger's
     *         <code>CreationDateTime</code>, Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     */

    public java.util.Date getInclusiveStartTime() {
        return this.inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the ledger's <code>CreationDateTime</code>,
     * Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time for the range of journal contents that you want to export.</p>
     *        <p>
     *        The <code>InclusiveStartTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *        Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     *        </p>
     *        <p>
     *        The <code>InclusiveStartTime</code> must be before <code>ExclusiveEndTime</code>.
     *        </p>
     *        <p>
     *        If you provide an <code>InclusiveStartTime</code> that is before the ledger's
     *        <code>CreationDateTime</code>, Amazon QLDB defaults it to the ledger's <code>CreationDateTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJournalToS3Request withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        setInclusiveStartTime(inclusiveStartTime);
        return this;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive end date and time for the range of journal contents that you want to export.</p>
     *        <p>
     *        The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *        Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     *        </p>
     *        <p>
     *        The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     */

    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     * </p>
     * 
     * @return The exclusive end date and time for the range of journal contents that you want to export.</p>
     *         <p>
     *         The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *         Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     *         </p>
     *         <p>
     *         The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     */

    public java.util.Date getExclusiveEndTime() {
        return this.exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that you want to export.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     * Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive end date and time for the range of journal contents that you want to export.</p>
     *        <p>
     *        The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date and time format and in Universal
     *        Coordinated Time (UTC). For example: <code>2019-06-13T21:36:34Z</code>
     *        </p>
     *        <p>
     *        The <code>ExclusiveEndTime</code> must be less than or equal to the current UTC date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJournalToS3Request withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        setExclusiveEndTime(exclusiveEndTime);
        return this;
    }

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your export request.
     * </p>
     * 
     * @param s3ExportConfiguration
     *        The configuration settings of the Amazon S3 bucket destination for your export request.
     */

    public void setS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your export request.
     * </p>
     * 
     * @return The configuration settings of the Amazon S3 bucket destination for your export request.
     */

    public S3ExportConfiguration getS3ExportConfiguration() {
        return this.s3ExportConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon S3 bucket destination for your export request.
     * </p>
     * 
     * @param s3ExportConfiguration
     *        The configuration settings of the Amazon S3 bucket destination for your export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJournalToS3Request withS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        setS3ExportConfiguration(s3ExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side
     *        encryption of your exported data.
     *        </p>
     *        </li>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to
     *         do the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side
     *         encryption of your exported data.
     *         </p>
     *         </li>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side
     *        encryption of your exported data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJournalToS3Request withRoleArn(String roleArn) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: ").append(getInclusiveStartTime()).append(",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: ").append(getExclusiveEndTime()).append(",");
        if (getS3ExportConfiguration() != null)
            sb.append("S3ExportConfiguration: ").append(getS3ExportConfiguration()).append(",");
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

        if (obj instanceof ExportJournalToS3Request == false)
            return false;
        ExportJournalToS3Request other = (ExportJournalToS3Request) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getS3ExportConfiguration() == null ^ this.getS3ExportConfiguration() == null)
            return false;
        if (other.getS3ExportConfiguration() != null && other.getS3ExportConfiguration().equals(this.getS3ExportConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime * hashCode + ((getS3ExportConfiguration() == null) ? 0 : getS3ExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ExportJournalToS3Request clone() {
        return (ExportJournalToS3Request) super.clone();
    }

}
