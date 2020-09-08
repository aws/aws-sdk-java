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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountCustomization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountCustomizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace associated with the customization you're creating.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region.
     * </p>
     */
    private AccountCustomization accountCustomization;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the customization that you created for this AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to customize QuickSight for.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     * 
     * @return The ID for the AWS account that you want to customize QuickSight for.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to customize QuickSight for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace associated with the customization you're creating.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the customization you're creating.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace associated with the customization you're creating.
     * </p>
     * 
     * @return The namespace associated with the customization you're creating.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace associated with the customization you're creating.
     * </p>
     * 
     * @param namespace
     *        The namespace associated with the customization you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationResult withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region.
     * </p>
     * 
     * @param accountCustomization
     *        The QuickSight customizations you're adding in the current AWS Region.
     */

    public void setAccountCustomization(AccountCustomization accountCustomization) {
        this.accountCustomization = accountCustomization;
    }

    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region.
     * </p>
     * 
     * @return The QuickSight customizations you're adding in the current AWS Region.
     */

    public AccountCustomization getAccountCustomization() {
        return this.accountCustomization;
    }

    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region.
     * </p>
     * 
     * @param accountCustomization
     *        The QuickSight customizations you're adding in the current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationResult withAccountCustomization(AccountCustomization accountCustomization) {
        setAccountCustomization(accountCustomization);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationResult withStatus(Integer status) {
        setStatus(status);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getAccountCustomization() != null)
            sb.append("AccountCustomization: ").append(getAccountCustomization()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
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

        if (obj instanceof CreateAccountCustomizationResult == false)
            return false;
        CreateAccountCustomizationResult other = (CreateAccountCustomizationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getAccountCustomization() == null ^ this.getAccountCustomization() == null)
            return false;
        if (other.getAccountCustomization() != null && other.getAccountCustomization().equals(this.getAccountCustomization()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getAccountCustomization() == null) ? 0 : getAccountCustomization().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccountCustomizationResult clone() {
        try {
            return (CreateAccountCustomizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
