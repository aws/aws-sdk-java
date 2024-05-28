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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeletePolicyStatement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePolicyStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource for which the policy need to be deleted.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The resource-based policy.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * A unique identifier for the deleted policy.
     * </p>
     */
    private String token;

    /**
     * <p>
     * The ARN of the resource for which the policy need to be deleted.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource for which the policy need to be deleted.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource for which the policy need to be deleted.
     * </p>
     * 
     * @return The ARN of the resource for which the policy need to be deleted.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource for which the policy need to be deleted.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource for which the policy need to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyStatementResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The resource-based policy.
     * </p>
     * 
     * @param policy
     *        The resource-based policy.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resource-based policy.
     * </p>
     * 
     * @return The resource-based policy.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resource-based policy.
     * </p>
     * 
     * @param policy
     *        The resource-based policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyStatementResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the deleted policy.
     * </p>
     * 
     * @param token
     *        A unique identifier for the deleted policy.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * A unique identifier for the deleted policy.
     * </p>
     * 
     * @return A unique identifier for the deleted policy.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * A unique identifier for the deleted policy.
     * </p>
     * 
     * @param token
     *        A unique identifier for the deleted policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyStatementResult withToken(String token) {
        setToken(token);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyStatementResult == false)
            return false;
        DeletePolicyStatementResult other = (DeletePolicyStatementResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyStatementResult clone() {
        try {
            return (DeletePolicyStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
