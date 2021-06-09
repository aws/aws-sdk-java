/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentAccountConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentAccountConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When included, if two identicial requests are made with the same client token, AWS Proton returns the environment
     * account connection that the first request created.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the AWS Proton environment that's created in the associated management account.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ID of the management account that accepts or rejects the environment account connection. You create an manage
     * the AWS Proton environment in this account. If the management account accepts the environment account connection,
     * AWS Proton can use the associated IAM role to provision environment infrastructure resources in the associated
     * environment account.
     * </p>
     */
    private String managementAccountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS Proton uses
     * this role to provision infrastructure resources in the associated environment account.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * When included, if two identicial requests are made with the same client token, AWS Proton returns the environment
     * account connection that the first request created.
     * </p>
     * 
     * @param clientToken
     *        When included, if two identicial requests are made with the same client token, AWS Proton returns the
     *        environment account connection that the first request created.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * When included, if two identicial requests are made with the same client token, AWS Proton returns the environment
     * account connection that the first request created.
     * </p>
     * 
     * @return When included, if two identicial requests are made with the same client token, AWS Proton returns the
     *         environment account connection that the first request created.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * When included, if two identicial requests are made with the same client token, AWS Proton returns the environment
     * account connection that the first request created.
     * </p>
     * 
     * @param clientToken
     *        When included, if two identicial requests are made with the same client token, AWS Proton returns the
     *        environment account connection that the first request created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentAccountConnectionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Proton environment that's created in the associated management account.
     * </p>
     * 
     * @param environmentName
     *        The name of the AWS Proton environment that's created in the associated management account.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the AWS Proton environment that's created in the associated management account.
     * </p>
     * 
     * @return The name of the AWS Proton environment that's created in the associated management account.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the AWS Proton environment that's created in the associated management account.
     * </p>
     * 
     * @param environmentName
     *        The name of the AWS Proton environment that's created in the associated management account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentAccountConnectionRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ID of the management account that accepts or rejects the environment account connection. You create an manage
     * the AWS Proton environment in this account. If the management account accepts the environment account connection,
     * AWS Proton can use the associated IAM role to provision environment infrastructure resources in the associated
     * environment account.
     * </p>
     * 
     * @param managementAccountId
     *        The ID of the management account that accepts or rejects the environment account connection. You create an
     *        manage the AWS Proton environment in this account. If the management account accepts the environment
     *        account connection, AWS Proton can use the associated IAM role to provision environment infrastructure
     *        resources in the associated environment account.
     */

    public void setManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
    }

    /**
     * <p>
     * The ID of the management account that accepts or rejects the environment account connection. You create an manage
     * the AWS Proton environment in this account. If the management account accepts the environment account connection,
     * AWS Proton can use the associated IAM role to provision environment infrastructure resources in the associated
     * environment account.
     * </p>
     * 
     * @return The ID of the management account that accepts or rejects the environment account connection. You create
     *         an manage the AWS Proton environment in this account. If the management account accepts the environment
     *         account connection, AWS Proton can use the associated IAM role to provision environment infrastructure
     *         resources in the associated environment account.
     */

    public String getManagementAccountId() {
        return this.managementAccountId;
    }

    /**
     * <p>
     * The ID of the management account that accepts or rejects the environment account connection. You create an manage
     * the AWS Proton environment in this account. If the management account accepts the environment account connection,
     * AWS Proton can use the associated IAM role to provision environment infrastructure resources in the associated
     * environment account.
     * </p>
     * 
     * @param managementAccountId
     *        The ID of the management account that accepts or rejects the environment account connection. You create an
     *        manage the AWS Proton environment in this account. If the management account accepts the environment
     *        account connection, AWS Proton can use the associated IAM role to provision environment infrastructure
     *        resources in the associated environment account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentAccountConnectionRequest withManagementAccountId(String managementAccountId) {
        setManagementAccountId(managementAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS Proton uses
     * this role to provision infrastructure resources in the associated environment account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS
     *        Proton uses this role to provision infrastructure resources in the associated environment account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS Proton uses
     * this role to provision infrastructure resources in the associated environment account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS
     *         Proton uses this role to provision infrastructure resources in the associated environment account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS Proton uses
     * this role to provision infrastructure resources in the associated environment account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. AWS
     *        Proton uses this role to provision infrastructure resources in the associated environment account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentAccountConnectionRequest withRoleArn(String roleArn) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getManagementAccountId() != null)
            sb.append("ManagementAccountId: ").append(getManagementAccountId()).append(",");
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

        if (obj instanceof CreateEnvironmentAccountConnectionRequest == false)
            return false;
        CreateEnvironmentAccountConnectionRequest other = (CreateEnvironmentAccountConnectionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getManagementAccountId() == null ^ this.getManagementAccountId() == null)
            return false;
        if (other.getManagementAccountId() != null && other.getManagementAccountId().equals(this.getManagementAccountId()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getManagementAccountId() == null) ? 0 : getManagementAccountId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentAccountConnectionRequest clone() {
        return (CreateEnvironmentAccountConnectionRequest) super.clone();
    }

}
