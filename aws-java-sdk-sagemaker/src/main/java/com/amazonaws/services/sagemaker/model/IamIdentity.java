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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The IAM Identity details associated with the user. These details are associated with model package groups, model
 * packages and project entities only.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/IamIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM identity.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the principal that assumes the IAM identity.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The person or application which assumes the IAM identity.
     * </p>
     */
    private String sourceIdentity;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM identity.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the IAM identity.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM identity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM identity.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM identity.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the IAM identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamIdentity withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the principal that assumes the IAM identity.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal that assumes the IAM identity.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The ID of the principal that assumes the IAM identity.
     * </p>
     * 
     * @return The ID of the principal that assumes the IAM identity.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The ID of the principal that assumes the IAM identity.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal that assumes the IAM identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamIdentity withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The person or application which assumes the IAM identity.
     * </p>
     * 
     * @param sourceIdentity
     *        The person or application which assumes the IAM identity.
     */

    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    /**
     * <p>
     * The person or application which assumes the IAM identity.
     * </p>
     * 
     * @return The person or application which assumes the IAM identity.
     */

    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    /**
     * <p>
     * The person or application which assumes the IAM identity.
     * </p>
     * 
     * @param sourceIdentity
     *        The person or application which assumes the IAM identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamIdentity withSourceIdentity(String sourceIdentity) {
        setSourceIdentity(sourceIdentity);
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getSourceIdentity() != null)
            sb.append("SourceIdentity: ").append(getSourceIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IamIdentity == false)
            return false;
        IamIdentity other = (IamIdentity) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getSourceIdentity() == null ^ this.getSourceIdentity() == null)
            return false;
        if (other.getSourceIdentity() != null && other.getSourceIdentity().equals(this.getSourceIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentity() == null) ? 0 : getSourceIdentity().hashCode());
        return hashCode;
    }

    @Override
    public IamIdentity clone() {
        try {
            return (IamIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.IamIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
