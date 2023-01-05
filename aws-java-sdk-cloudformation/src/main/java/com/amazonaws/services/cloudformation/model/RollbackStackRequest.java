/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackStack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that's associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to rollback
     * the stack.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * A unique identifier for this <code>RollbackStack</code> request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name that's associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name that's associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name that's associated with the stack.
     * </p>
     * 
     * @return The name that's associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name that's associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name that's associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackStackRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to rollback
     * the stack.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to
     *        rollback the stack.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to rollback
     * the stack.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to
     *         rollback the stack.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to rollback
     * the stack.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to
     *        rollback the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackStackRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>RollbackStack</code> request.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>RollbackStack</code> request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>RollbackStack</code> request.
     * </p>
     * 
     * @return A unique identifier for this <code>RollbackStack</code> request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>RollbackStack</code> request.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>RollbackStack</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackStackRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackStackRequest == false)
            return false;
        RollbackStackRequest other = (RollbackStackRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public RollbackStackRequest clone() {
        return (RollbackStackRequest) super.clone();
    }

}
