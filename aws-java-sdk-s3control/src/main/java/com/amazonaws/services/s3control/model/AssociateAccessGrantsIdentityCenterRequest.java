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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AssociateAccessGrantsIdentityCenter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAccessGrantsIdentityCenterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are associating
     * with your S3 Access Grants instance. An IAM Identity Center instance is your corporate identity directory that
     * you added to the IAM Identity Center. You can use the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html">ListInstances</a> API
     * operation to retrieve a list of your Identity Center instances and their ARNs.
     * </p>
     */
    private String identityCenterArn;

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that is making this request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessGrantsIdentityCenterRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are associating
     * with your S3 Access Grants instance. An IAM Identity Center instance is your corporate identity directory that
     * you added to the IAM Identity Center. You can use the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html">ListInstances</a> API
     * operation to retrieve a list of your Identity Center instances and their ARNs.
     * </p>
     * 
     * @param identityCenterArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are
     *        associating with your S3 Access Grants instance. An IAM Identity Center instance is your corporate
     *        identity directory that you added to the IAM Identity Center. You can use the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html"
     *        >ListInstances</a> API operation to retrieve a list of your Identity Center instances and their ARNs.
     */

    public void setIdentityCenterArn(String identityCenterArn) {
        this.identityCenterArn = identityCenterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are associating
     * with your S3 Access Grants instance. An IAM Identity Center instance is your corporate identity directory that
     * you added to the IAM Identity Center. You can use the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html">ListInstances</a> API
     * operation to retrieve a list of your Identity Center instances and their ARNs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are
     *         associating with your S3 Access Grants instance. An IAM Identity Center instance is your corporate
     *         identity directory that you added to the IAM Identity Center. You can use the <a
     *         href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html"
     *         >ListInstances</a> API operation to retrieve a list of your Identity Center instances and their ARNs.
     */

    public String getIdentityCenterArn() {
        return this.identityCenterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are associating
     * with your S3 Access Grants instance. An IAM Identity Center instance is your corporate identity directory that
     * you added to the IAM Identity Center. You can use the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html">ListInstances</a> API
     * operation to retrieve a list of your Identity Center instances and their ARNs.
     * </p>
     * 
     * @param identityCenterArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance that you are
     *        associating with your S3 Access Grants instance. An IAM Identity Center instance is your corporate
     *        identity directory that you added to the IAM Identity Center. You can use the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ListInstances.html"
     *        >ListInstances</a> API operation to retrieve a list of your Identity Center instances and their ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAccessGrantsIdentityCenterRequest withIdentityCenterArn(String identityCenterArn) {
        setIdentityCenterArn(identityCenterArn);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getIdentityCenterArn() != null)
            sb.append("IdentityCenterArn: ").append(getIdentityCenterArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAccessGrantsIdentityCenterRequest == false)
            return false;
        AssociateAccessGrantsIdentityCenterRequest other = (AssociateAccessGrantsIdentityCenterRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getIdentityCenterArn() == null ^ this.getIdentityCenterArn() == null)
            return false;
        if (other.getIdentityCenterArn() != null && other.getIdentityCenterArn().equals(this.getIdentityCenterArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterArn() == null) ? 0 : getIdentityCenterArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAccessGrantsIdentityCenterRequest clone() {
        return (AssociateAccessGrantsIdentityCenterRequest) super.clone();
    }

}
