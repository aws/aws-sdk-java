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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeCrossAccountAccessRole"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCrossAccountAccessRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     * Inspector to access your AWS account.
     * </p>
     */
    private Boolean valid;
    /**
     * <p>
     * The date when the cross-account access role was registered.
     * </p>
     */
    private java.util.Date registeredAt;

    /**
     * <p>
     * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     * </p>
     * 
     * @return The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCrossAccountAccessRoleResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     * Inspector to access your AWS account.
     * </p>
     * 
     * @param valid
     *        A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     *        Inspector to access your AWS account.
     */

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     * Inspector to access your AWS account.
     * </p>
     * 
     * @return A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     *         Inspector to access your AWS account.
     */

    public Boolean getValid() {
        return this.valid;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     * Inspector to access your AWS account.
     * </p>
     * 
     * @param valid
     *        A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     *        Inspector to access your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCrossAccountAccessRoleResult withValid(Boolean valid) {
        setValid(valid);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     * Inspector to access your AWS account.
     * </p>
     * 
     * @return A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon
     *         Inspector to access your AWS account.
     */

    public Boolean isValid() {
        return this.valid;
    }

    /**
     * <p>
     * The date when the cross-account access role was registered.
     * </p>
     * 
     * @param registeredAt
     *        The date when the cross-account access role was registered.
     */

    public void setRegisteredAt(java.util.Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    /**
     * <p>
     * The date when the cross-account access role was registered.
     * </p>
     * 
     * @return The date when the cross-account access role was registered.
     */

    public java.util.Date getRegisteredAt() {
        return this.registeredAt;
    }

    /**
     * <p>
     * The date when the cross-account access role was registered.
     * </p>
     * 
     * @param registeredAt
     *        The date when the cross-account access role was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCrossAccountAccessRoleResult withRegisteredAt(java.util.Date registeredAt) {
        setRegisteredAt(registeredAt);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getValid() != null)
            sb.append("Valid: ").append(getValid()).append(",");
        if (getRegisteredAt() != null)
            sb.append("RegisteredAt: ").append(getRegisteredAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCrossAccountAccessRoleResult == false)
            return false;
        DescribeCrossAccountAccessRoleResult other = (DescribeCrossAccountAccessRoleResult) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getValid() == null ^ this.getValid() == null)
            return false;
        if (other.getValid() != null && other.getValid().equals(this.getValid()) == false)
            return false;
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null)
            return false;
        if (other.getRegisteredAt() != null && other.getRegisteredAt().equals(this.getRegisteredAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getValid() == null) ? 0 : getValid().hashCode());
        hashCode = prime * hashCode + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCrossAccountAccessRoleResult clone() {
        try {
            return (DescribeCrossAccountAccessRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
