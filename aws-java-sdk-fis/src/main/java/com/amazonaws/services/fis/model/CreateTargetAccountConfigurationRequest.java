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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateTargetAccountConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTargetAccountConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The experiment template ID.
     * </p>
     */
    private String experimentTemplateId;
    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The description of the target account.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetAccountConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The experiment template ID.
     * </p>
     * 
     * @param experimentTemplateId
     *        The experiment template ID.
     */

    public void setExperimentTemplateId(String experimentTemplateId) {
        this.experimentTemplateId = experimentTemplateId;
    }

    /**
     * <p>
     * The experiment template ID.
     * </p>
     * 
     * @return The experiment template ID.
     */

    public String getExperimentTemplateId() {
        return this.experimentTemplateId;
    }

    /**
     * <p>
     * The experiment template ID.
     * </p>
     * 
     * @param experimentTemplateId
     *        The experiment template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetAccountConfigurationRequest withExperimentTemplateId(String experimentTemplateId) {
        setExperimentTemplateId(experimentTemplateId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the target account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the target account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the target account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetAccountConfigurationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role for the target account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role for the target account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role for the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetAccountConfigurationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The description of the target account.
     * </p>
     * 
     * @param description
     *        The description of the target account.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the target account.
     * </p>
     * 
     * @return The description of the target account.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the target account.
     * </p>
     * 
     * @param description
     *        The description of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetAccountConfigurationRequest withDescription(String description) {
        setDescription(description);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExperimentTemplateId() != null)
            sb.append("ExperimentTemplateId: ").append(getExperimentTemplateId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTargetAccountConfigurationRequest == false)
            return false;
        CreateTargetAccountConfigurationRequest other = (CreateTargetAccountConfigurationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExperimentTemplateId() == null ^ this.getExperimentTemplateId() == null)
            return false;
        if (other.getExperimentTemplateId() != null && other.getExperimentTemplateId().equals(this.getExperimentTemplateId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExperimentTemplateId() == null) ? 0 : getExperimentTemplateId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateTargetAccountConfigurationRequest clone() {
        return (CreateTargetAccountConfigurationRequest) super.clone();
    }

}
