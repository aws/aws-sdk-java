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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date the instance was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The identifier of the identity store that is connected to the instance of IAM Identity Center.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * Specifies the instance name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the Amazon Web Services account for which the instance was created.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The status of the instance.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The date the instance was created.
     * </p>
     * 
     * @param createdDate
     *        The date the instance was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the instance was created.
     * </p>
     * 
     * @return The date the instance was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the instance was created.
     * </p>
     * 
     * @param createdDate
     *        The date the instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the identity store that is connected to the instance of IAM Identity Center.
     * </p>
     * 
     * @param identityStoreId
     *        The identifier of the identity store that is connected to the instance of IAM Identity Center.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The identifier of the identity store that is connected to the instance of IAM Identity Center.
     * </p>
     * 
     * @return The identifier of the identity store that is connected to the instance of IAM Identity Center.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The identifier of the identity store that is connected to the instance of IAM Identity Center.
     * </p>
     * 
     * @param identityStoreId
     *        The identifier of the identity store that is connected to the instance of IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceResult withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the instance of IAM Identity Center under which the operation will run. For more information
     *        about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     *        Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The ARN of the instance of IAM Identity Center under which the operation will run. For more information
     *         about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     *         and Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the instance of IAM Identity Center under which the operation will run. For more information about
     * ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     * Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the instance of IAM Identity Center under which the operation will run. For more information
     *        about ARNs, see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     *        Amazon Web Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceResult withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the instance name.
     * </p>
     * 
     * @param name
     *        Specifies the instance name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the instance name.
     * </p>
     * 
     * @return Specifies the instance name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the instance name.
     * </p>
     * 
     * @param name
     *        Specifies the instance name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account for which the instance was created.
     * </p>
     * 
     * @param ownerAccountId
     *        The identifier of the Amazon Web Services account for which the instance was created.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account for which the instance was created.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services account for which the instance was created.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account for which the instance was created.
     * </p>
     * 
     * @param ownerAccountId
     *        The identifier of the Amazon Web Services account for which the instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param status
     *        The status of the instance.
     * @see InstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @return The status of the instance.
     * @see InstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param status
     *        The status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public DescribeInstanceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param status
     *        The status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public DescribeInstanceResult withStatus(InstanceStatus status) {
        this.status = status.toString();
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceResult == false)
            return false;
        DescribeInstanceResult other = (DescribeInstanceResult) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceResult clone() {
        try {
            return (DescribeInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
