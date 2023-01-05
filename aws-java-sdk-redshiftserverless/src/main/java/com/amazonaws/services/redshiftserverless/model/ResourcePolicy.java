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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource policy object. Currently, you can use policies to share snapshots across Amazon Web Services accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource policy.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The resource policy.
     * </p>
     * 
     * @param policy
     *        The resource policy.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resource policy.
     * </p>
     * 
     * @return The resource policy.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resource policy.
     * </p>
     * 
     * @param policy
     *        The resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the policy.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePolicy == false)
            return false;
        ResourcePolicy other = (ResourcePolicy) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePolicy clone() {
        try {
            return (ResourcePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.ResourcePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
