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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to specify a set of resources to a backup plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/BackupSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupSelection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     */
    private String selectionName;
    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     * <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     * <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     */
    private java.util.List<Condition> listOfTags;

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * 
     * @param selectionName
     *        The display name of a resource selection document.
     */

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * 
     * @return The display name of a resource selection document.
     */

    public String getSelectionName() {
        return this.selectionName;
    }

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * 
     * @param selectionName
     *        The display name of a resource selection document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withSelectionName(String selectionName) {
        setSelectionName(selectionName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for
     *        example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for
     *         example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for
     *        example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     * <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * </p>
     * 
     * @return An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     *         <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     * <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * </p>
     * 
     * @param resources
     *        An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     *        <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     * <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     *        <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     * <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * </p>
     * 
     * @param resources
     *        An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "
     *        <code>arn:aws:ec2:us-east-1:123456789012:volume/*</code>" of resources to assign to a backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     * <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     * 
     * @return An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     *         <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     */

    public java.util.List<Condition> getListOfTags() {
        return listOfTags;
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     * <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     * 
     * @param listOfTags
     *        An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     *        <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     */

    public void setListOfTags(java.util.Collection<Condition> listOfTags) {
        if (listOfTags == null) {
            this.listOfTags = null;
            return;
        }

        this.listOfTags = new java.util.ArrayList<Condition>(listOfTags);
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     * <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListOfTags(java.util.Collection)} or {@link #withListOfTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listOfTags
     *        An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     *        <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withListOfTags(Condition... listOfTags) {
        if (this.listOfTags == null) {
            setListOfTags(new java.util.ArrayList<Condition>(listOfTags.length));
        }
        for (Condition ele : listOfTags) {
            this.listOfTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     * <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     * 
     * @param listOfTags
     *        An array of conditions used to specify a set of resources to assign to a backup plan; for example,
     *        <code>"StringEquals": {"ec2:ResourceTag/Department": "accounting"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSelection withListOfTags(java.util.Collection<Condition> listOfTags) {
        setListOfTags(listOfTags);
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
        if (getSelectionName() != null)
            sb.append("SelectionName: ").append(getSelectionName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getListOfTags() != null)
            sb.append("ListOfTags: ").append(getListOfTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupSelection == false)
            return false;
        BackupSelection other = (BackupSelection) obj;
        if (other.getSelectionName() == null ^ this.getSelectionName() == null)
            return false;
        if (other.getSelectionName() != null && other.getSelectionName().equals(this.getSelectionName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getListOfTags() == null ^ this.getListOfTags() == null)
            return false;
        if (other.getListOfTags() != null && other.getListOfTags().equals(this.getListOfTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectionName() == null) ? 0 : getSelectionName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getListOfTags() == null) ? 0 : getListOfTags().hashCode());
        return hashCode;
    }

    @Override
    public BackupSelection clone() {
        try {
            return (BackupSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.BackupSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
