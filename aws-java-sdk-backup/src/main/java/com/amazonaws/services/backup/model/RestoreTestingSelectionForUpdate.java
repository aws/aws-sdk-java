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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreTestingSelectionForUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Backup uses to create the target resource; for example:
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * You can include a list of specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     */
    private java.util.List<String> protectedResourceArns;
    /**
     * <p>
     * A list of conditions that you define for resources in your restore testing plan using tags.
     * </p>
     * <p>
     * For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>. Condition
     * operators are case sensitive.
     * </p>
     */
    private ProtectedResourceConditions protectedResourceConditions;
    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     */
    private java.util.Map<String, String> restoreMetadataOverrides;
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

    public RestoreTestingSelectionForUpdate withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * You can include a list of specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @return You can include a list of specific ARNs, such as
     *         <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     *         <code>ProtectedResourceArns: ["*"]</code>, but not both.
     */

    public java.util.List<String> getProtectedResourceArns() {
        return protectedResourceArns;
    }

    /**
     * <p>
     * You can include a list of specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @param protectedResourceArns
     *        You can include a list of specific ARNs, such as
     *        <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     *        <code>ProtectedResourceArns: ["*"]</code>, but not both.
     */

    public void setProtectedResourceArns(java.util.Collection<String> protectedResourceArns) {
        if (protectedResourceArns == null) {
            this.protectedResourceArns = null;
            return;
        }

        this.protectedResourceArns = new java.util.ArrayList<String>(protectedResourceArns);
    }

    /**
     * <p>
     * You can include a list of specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectedResourceArns(java.util.Collection)} or
     * {@link #withProtectedResourceArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param protectedResourceArns
     *        You can include a list of specific ARNs, such as
     *        <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     *        <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForUpdate withProtectedResourceArns(String... protectedResourceArns) {
        if (this.protectedResourceArns == null) {
            setProtectedResourceArns(new java.util.ArrayList<String>(protectedResourceArns.length));
        }
        for (String ele : protectedResourceArns) {
            this.protectedResourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can include a list of specific ARNs, such as
     * <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     * <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * </p>
     * 
     * @param protectedResourceArns
     *        You can include a list of specific ARNs, such as
     *        <code>ProtectedResourceArns: ["arn:aws:...", "arn:aws:..."]</code> or you can include a wildcard:
     *        <code>ProtectedResourceArns: ["*"]</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForUpdate withProtectedResourceArns(java.util.Collection<String> protectedResourceArns) {
        setProtectedResourceArns(protectedResourceArns);
        return this;
    }

    /**
     * <p>
     * A list of conditions that you define for resources in your restore testing plan using tags.
     * </p>
     * <p>
     * For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>. Condition
     * operators are case sensitive.
     * </p>
     * 
     * @param protectedResourceConditions
     *        A list of conditions that you define for resources in your restore testing plan using tags.</p>
     *        <p>
     *        For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>.
     *        Condition operators are case sensitive.
     */

    public void setProtectedResourceConditions(ProtectedResourceConditions protectedResourceConditions) {
        this.protectedResourceConditions = protectedResourceConditions;
    }

    /**
     * <p>
     * A list of conditions that you define for resources in your restore testing plan using tags.
     * </p>
     * <p>
     * For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>. Condition
     * operators are case sensitive.
     * </p>
     * 
     * @return A list of conditions that you define for resources in your restore testing plan using tags.</p>
     *         <p>
     *         For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>.
     *         Condition operators are case sensitive.
     */

    public ProtectedResourceConditions getProtectedResourceConditions() {
        return this.protectedResourceConditions;
    }

    /**
     * <p>
     * A list of conditions that you define for resources in your restore testing plan using tags.
     * </p>
     * <p>
     * For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>. Condition
     * operators are case sensitive.
     * </p>
     * 
     * @param protectedResourceConditions
     *        A list of conditions that you define for resources in your restore testing plan using tags.</p>
     *        <p>
     *        For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>.
     *        Condition operators are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForUpdate withProtectedResourceConditions(ProtectedResourceConditions protectedResourceConditions) {
        setProtectedResourceConditions(protectedResourceConditions);
        return this;
    }

    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     * 
     * @return You can override certain restore metadata keys by including the parameter
     *         <code>RestoreMetadataOverrides</code> in the body of <code>RestoreTestingSelection</code>. Key values are
     *         not case sensitive.</p>
     *         <p>
     *         See the complete list of <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html"
     *         >restore testing inferred metadata</a>.
     */

    public java.util.Map<String, String> getRestoreMetadataOverrides() {
        return restoreMetadataOverrides;
    }

    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     * 
     * @param restoreMetadataOverrides
     *        You can override certain restore metadata keys by including the parameter
     *        <code>RestoreMetadataOverrides</code> in the body of <code>RestoreTestingSelection</code>. Key values are
     *        not case sensitive.</p>
     *        <p>
     *        See the complete list of <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html"
     *        >restore testing inferred metadata</a>.
     */

    public void setRestoreMetadataOverrides(java.util.Map<String, String> restoreMetadataOverrides) {
        this.restoreMetadataOverrides = restoreMetadataOverrides;
    }

    /**
     * <p>
     * You can override certain restore metadata keys by including the parameter <code>RestoreMetadataOverrides</code>
     * in the body of <code>RestoreTestingSelection</code>. Key values are not case sensitive.
     * </p>
     * <p>
     * See the complete list of <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html">restore
     * testing inferred metadata</a>.
     * </p>
     * 
     * @param restoreMetadataOverrides
     *        You can override certain restore metadata keys by including the parameter
     *        <code>RestoreMetadataOverrides</code> in the body of <code>RestoreTestingSelection</code>. Key values are
     *        not case sensitive.</p>
     *        <p>
     *        See the complete list of <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/restore-testing-inferred-metadata.html"
     *        >restore testing inferred metadata</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForUpdate withRestoreMetadataOverrides(java.util.Map<String, String> restoreMetadataOverrides) {
        setRestoreMetadataOverrides(restoreMetadataOverrides);
        return this;
    }

    /**
     * Add a single RestoreMetadataOverrides entry
     *
     * @see RestoreTestingSelectionForUpdate#withRestoreMetadataOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForUpdate addRestoreMetadataOverridesEntry(String key, String value) {
        if (null == this.restoreMetadataOverrides) {
            this.restoreMetadataOverrides = new java.util.HashMap<String, String>();
        }
        if (this.restoreMetadataOverrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.restoreMetadataOverrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RestoreMetadataOverrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTestingSelectionForUpdate clearRestoreMetadataOverridesEntries() {
        this.restoreMetadataOverrides = null;
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

    public RestoreTestingSelectionForUpdate withValidationWindowHours(Integer validationWindowHours) {
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
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getProtectedResourceArns() != null)
            sb.append("ProtectedResourceArns: ").append(getProtectedResourceArns()).append(",");
        if (getProtectedResourceConditions() != null)
            sb.append("ProtectedResourceConditions: ").append(getProtectedResourceConditions()).append(",");
        if (getRestoreMetadataOverrides() != null)
            sb.append("RestoreMetadataOverrides: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof RestoreTestingSelectionForUpdate == false)
            return false;
        RestoreTestingSelectionForUpdate other = (RestoreTestingSelectionForUpdate) obj;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getProtectedResourceArns() == null ^ this.getProtectedResourceArns() == null)
            return false;
        if (other.getProtectedResourceArns() != null && other.getProtectedResourceArns().equals(this.getProtectedResourceArns()) == false)
            return false;
        if (other.getProtectedResourceConditions() == null ^ this.getProtectedResourceConditions() == null)
            return false;
        if (other.getProtectedResourceConditions() != null && other.getProtectedResourceConditions().equals(this.getProtectedResourceConditions()) == false)
            return false;
        if (other.getRestoreMetadataOverrides() == null ^ this.getRestoreMetadataOverrides() == null)
            return false;
        if (other.getRestoreMetadataOverrides() != null && other.getRestoreMetadataOverrides().equals(this.getRestoreMetadataOverrides()) == false)
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

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceArns() == null) ? 0 : getProtectedResourceArns().hashCode());
        hashCode = prime * hashCode + ((getProtectedResourceConditions() == null) ? 0 : getProtectedResourceConditions().hashCode());
        hashCode = prime * hashCode + ((getRestoreMetadataOverrides() == null) ? 0 : getRestoreMetadataOverrides().hashCode());
        hashCode = prime * hashCode + ((getValidationWindowHours() == null) ? 0 : getValidationWindowHours().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTestingSelectionForUpdate clone() {
        try {
            return (RestoreTestingSelectionForUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreTestingSelectionForUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
