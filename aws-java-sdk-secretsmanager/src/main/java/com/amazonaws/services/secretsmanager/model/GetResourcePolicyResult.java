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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret that the resource-based policy was retrieved for.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret that the resource-based policy was retrieved for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A JSON-formatted string that describes the permissions that are associated with the attached secret. These
     * permissions are combined with any permissions that are associated with the user or role that attempts to access
     * this secret. The combined permissions specify who can access the secret and what actions they can perform. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access
     * Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     */
    private String resourcePolicy;

    /**
     * <p>
     * The ARN of the secret that the resource-based policy was retrieved for.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret that the resource-based policy was retrieved for.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret that the resource-based policy was retrieved for.
     * </p>
     * 
     * @return The ARN of the secret that the resource-based policy was retrieved for.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret that the resource-based policy was retrieved for.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret that the resource-based policy was retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret that the resource-based policy was retrieved for.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret that the resource-based policy was retrieved for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret that the resource-based policy was retrieved for.
     * </p>
     * 
     * @return The friendly name of the secret that the resource-based policy was retrieved for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret that the resource-based policy was retrieved for.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret that the resource-based policy was retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted string that describes the permissions that are associated with the attached secret. These
     * permissions are combined with any permissions that are associated with the user or role that attempts to access
     * this secret. The combined permissions specify who can access the secret and what actions they can perform. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access
     * Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string that describes the permissions that are associated with the attached secret. These
     *        permissions are combined with any permissions that are associated with the user or role that attempts to
     *        access this secret. The combined permissions specify who can access the secret and what actions they can
     *        perform. For more information, see <a
     *        href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and
     *        Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string that describes the permissions that are associated with the attached secret. These
     * permissions are combined with any permissions that are associated with the user or role that attempts to access
     * this secret. The combined permissions specify who can access the secret and what actions they can perform. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access
     * Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * 
     * @return A JSON-formatted string that describes the permissions that are associated with the attached secret.
     *         These permissions are combined with any permissions that are associated with the user or role that
     *         attempts to access this secret. The combined permissions specify who can access the secret and what
     *         actions they can perform. For more information, see <a
     *         href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and
     *         Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string that describes the permissions that are associated with the attached secret. These
     * permissions are combined with any permissions that are associated with the user or role that attempts to access
     * this secret. The combined permissions specify who can access the secret and what actions they can perform. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access
     * Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string that describes the permissions that are associated with the attached secret. These
     *        permissions are combined with any permissions that are associated with the user or role that attempts to
     *        access this secret. The combined permissions specify who can access the secret and what actions they can
     *        perform. For more information, see <a
     *        href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and
     *        Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePolicyResult withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePolicyResult == false)
            return false;
        GetResourcePolicyResult other = (GetResourcePolicyResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePolicyResult clone() {
        try {
            return (GetResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
