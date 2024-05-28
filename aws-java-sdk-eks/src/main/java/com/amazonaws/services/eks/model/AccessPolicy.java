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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An access policy includes permissions that allow Amazon EKS to authorize an IAM principal to work with Kubernetes
 * objects on your cluster. The policies are managed by Amazon EKS, but they're not IAM policies. You can't view the
 * permissions in the policies using the API. The permissions for many of the policies are similar to the Kubernetes
 * <code>cluster-admin</code>, <code>admin</code>, <code>edit</code>, and <code>view</code> cluster roles. For more
 * information about these cluster roles, see <a
 * href="https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles">User-facing roles</a> in the
 * Kubernetes documentation. To view the contents of the policies, see <a
 * href="https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html#access-policy-permissions">Access policy
 * permissions</a> in the <i>Amazon EKS User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AccessPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the access policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the access policy.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the access policy.
     * </p>
     * 
     * @param name
     *        The name of the access policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the access policy.
     * </p>
     * 
     * @return The name of the access policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the access policy.
     * </p>
     * 
     * @param name
     *        The name of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the access policy.
     * </p>
     * 
     * @param arn
     *        The ARN of the access policy.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the access policy.
     * </p>
     * 
     * @return The ARN of the access policy.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the access policy.
     * </p>
     * 
     * @param arn
     *        The ARN of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicy withArn(String arn) {
        setArn(arn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPolicy == false)
            return false;
        AccessPolicy other = (AccessPolicy) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public AccessPolicy clone() {
        try {
            return (AccessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AccessPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
