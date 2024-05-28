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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This contains metadata about a restore testing selection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingSelectionForList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     */
    private String protectedResourceType;
    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name must consist of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * Unique name of a restore testing selection.
     * </p>
     */
    private String restoreTestingSelectionName;
    /**
     * <p>
     * This value represents the time, in hours, data is retained after a restore test so that optional validation can
     * be completed.
     * </p>
     * <p>
     * Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     * </p>
     */
    private Integer validationWindowHours;

    /**
     * <p>
     * This is the date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        This is the date and time that a restore testing selection was created, in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the
     *        value 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * This is the date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     * </p>
     * 
     * @return This is the date and time that a restore testing selection was created, in Unix format and Coordinated
     *         Universal Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example,
     *         the value 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * This is the date and time that a restore testing selection was created, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationTime
     *        This is the date and time that a restore testing selection was created, in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>CreationTime</code> is accurate to milliseconds. For example, the
     *        value 1516925490.087 represents Friday, January 26,2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForList withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *        example: <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *         example: <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for
     *        example: <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForList withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * 
     * @param protectedResourceType
     *        The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon
     *        EBS volume or an Amazon RDS database.
     */

    public void setProtectedResourceType(String protectedResourceType) {
        this.protectedResourceType = protectedResourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * 
     * @return The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon
     *         EBS volume or an Amazon RDS database.
     */

    public String getProtectedResourceType() {
        return this.protectedResourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon EBS
     * volume or an Amazon RDS database.
     * </p>
     * 
     * @param protectedResourceType
     *        The type of Amazon Web Services resource included in a restore testing selection; for example, an Amazon
     *        EBS volume or an Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForList withProtectedResourceType(String protectedResourceType) {
        setProtectedResourceType(protectedResourceType);
        return this;
    }

    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name must consist of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Unique string that is the name of the restore testing plan.</p>
     *        <p>
     *        The name cannot be changed after creation. The name must consist of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name must consist of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @return Unique string that is the name of the restore testing plan.</p>
     *         <p>
     *         The name cannot be changed after creation. The name must consist of only alphanumeric characters and
     *         underscores. Maximum length is 50.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * Unique string that is the name of the restore testing plan.
     * </p>
     * <p>
     * The name cannot be changed after creation. The name must consist of only alphanumeric characters and underscores.
     * Maximum length is 50.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Unique string that is the name of the restore testing plan.</p>
     *        <p>
     *        The name cannot be changed after creation. The name must consist of only alphanumeric characters and
     *        underscores. Maximum length is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForList withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * Unique name of a restore testing selection.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        Unique name of a restore testing selection.
     */

    public void setRestoreTestingSelectionName(String restoreTestingSelectionName) {
        this.restoreTestingSelectionName = restoreTestingSelectionName;
    }

    /**
     * <p>
     * Unique name of a restore testing selection.
     * </p>
     * 
     * @return Unique name of a restore testing selection.
     */

    public String getRestoreTestingSelectionName() {
        return this.restoreTestingSelectionName;
    }

    /**
     * <p>
     * Unique name of a restore testing selection.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        Unique name of a restore testing selection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForList withRestoreTestingSelectionName(String restoreTestingSelectionName) {
        setRestoreTestingSelectionName(restoreTestingSelectionName);
        return this;
    }

    /**
     * <p>
     * This value represents the time, in hours, data is retained after a restore test so that optional validation can
     * be completed.
     * </p>
     * <p>
     * Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     * </p>
     * 
     * @param validationWindowHours
     *        This value represents the time, in hours, data is retained after a restore test so that optional
     *        validation can be completed.</p>
     *        <p>
     *        Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     */

    public void setValidationWindowHours(Integer validationWindowHours) {
        this.validationWindowHours = validationWindowHours;
    }

    /**
     * <p>
     * This value represents the time, in hours, data is retained after a restore test so that optional validation can
     * be completed.
     * </p>
     * <p>
     * Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     * </p>
     * 
     * @return This value represents the time, in hours, data is retained after a restore test so that optional
     *         validation can be completed.</p>
     *         <p>
     *         Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     */

    public Integer getValidationWindowHours() {
        return this.validationWindowHours;
    }

    /**
     * <p>
     * This value represents the time, in hours, data is retained after a restore test so that optional validation can
     * be completed.
     * </p>
     * <p>
     * Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     * </p>
     * 
     * @param validationWindowHours
     *        This value represents the time, in hours, data is retained after a restore test so that optional
     *        validation can be completed.</p>
     *        <p>
     *        Accepted value is an integer between 0 and 168 (the hourly equivalent of seven days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForList withValidationWindowHours(Integer validationWindowHours) {
        setValidationWindowHours(validationWindowHours);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getProtectedResourceType() != null)
            sb.append("ProtectedResourceType: ").append(getProtectedResourceType()).append(",");
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName()).append(",");
        if (getRestoreTestingSelectionName() != null)
            sb.append("RestoreTestingSelectionName: ").append(getRestoreTestingSelectionName()).append(",");
        if (getValidationWindowHours() != null)
            sb.append("ValidationWindowHours: ").append(getValidationWindowHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTestingSelectionForList == false)
            return false;
        RestoreTestingSelectionForList other = (RestoreTestingSelectionForList) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getProtectedResourceType() == null ^ this.getProtectedResourceType() == null)
            return false;
        if (other.getProtectedResourceType() != null && other.getProtectedResourceType().equals(this.getProtectedResourceType()) == false)
            return false;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        if (other.getRestoreTestingSelectionName() == null ^ this.getRestoreTestingSelectionName() == null)
            return false;
        if (other.getRestoreTestingSelectionName() != null && other.getRestoreTestingSelectionName().equals(this.getRestoreTestingSelectionName()) == false)
            return false;
        if (other.getValidationWindowHours() == null ^ this.getValidationWindowHours() == null)
            return false;
        if (other.getValidationWindowHours() != null && other.getValidationWindowHours().equals(this.getValidationWindowHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceType() == null) ? 0 : getProtectedResourceType().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelectionName() == null) ? 0 : getRestoreTestingSelectionName().hashCode());
        hashCode = prime * hashCode + ((getValidationWindowHours() == null) ? 0 : getValidationWindowHours().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingSelectionForList clone() {
        try {
            return (RestoreTestingSelectionForList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingSelectionForListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
