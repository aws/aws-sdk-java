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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUserByPrincipalId" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUserByPrincipalIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the user.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * 
     * @return The principal ID of the user.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserByPrincipalIdRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that
     *         contains your Amazon QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserByPrincipalIdRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @return The namespace. Currently, you should set this to <code>default</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserByPrincipalIdRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserByPrincipalIdRequest == false)
            return false;
        DeleteUserByPrincipalIdRequest other = (DeleteUserByPrincipalIdRequest) obj;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUserByPrincipalIdRequest clone() {
        return (DeleteUserByPrincipalIdRequest) super.clone();
    }

}
