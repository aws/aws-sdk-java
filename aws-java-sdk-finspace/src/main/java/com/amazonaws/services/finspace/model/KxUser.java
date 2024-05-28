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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that stores metadata for a kdb user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * A unique identifier for the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The IAM role ARN that is associated with the user.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * The timestamp at which the kdb user was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The timestamp at which the kdb user was updated.
     * </p>
     */
    private java.util.Date updateTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *        ARNs in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        the <i>IAM User Guide</i>.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *         ARNs in policies, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *         the <i>IAM User Guide</i>.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
     * Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use
     *        ARNs in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxUser withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the user.
     * </p>
     * 
     * @param userName
     *        A unique identifier for the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique identifier for the user.
     * </p>
     * 
     * @return A unique identifier for the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique identifier for the user.
     * </p>
     * 
     * @param userName
     *        A unique identifier for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxUser withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN that is associated with the user.
     * </p>
     * 
     * @param iamRole
     *        The IAM role ARN that is associated with the user.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role ARN that is associated with the user.
     * </p>
     * 
     * @return The IAM role ARN that is associated with the user.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role ARN that is associated with the user.
     * </p>
     * 
     * @param iamRole
     *        The IAM role ARN that is associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxUser withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the kdb user was created.
     * </p>
     * 
     * @param createTimestamp
     *        The timestamp at which the kdb user was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb user was created.
     * </p>
     * 
     * @return The timestamp at which the kdb user was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb user was created.
     * </p>
     * 
     * @param createTimestamp
     *        The timestamp at which the kdb user was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxUser withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the kdb user was updated.
     * </p>
     * 
     * @param updateTimestamp
     *        The timestamp at which the kdb user was updated.
     */

    public void setUpdateTimestamp(java.util.Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb user was updated.
     * </p>
     * 
     * @return The timestamp at which the kdb user was updated.
     */

    public java.util.Date getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb user was updated.
     * </p>
     * 
     * @param updateTimestamp
     *        The timestamp at which the kdb user was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxUser withUpdateTimestamp(java.util.Date updateTimestamp) {
        setUpdateTimestamp(updateTimestamp);
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getUpdateTimestamp() != null)
            sb.append("UpdateTimestamp: ").append(getUpdateTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxUser == false)
            return false;
        KxUser other = (KxUser) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getUpdateTimestamp() == null ^ this.getUpdateTimestamp() == null)
            return false;
        if (other.getUpdateTimestamp() != null && other.getUpdateTimestamp().equals(this.getUpdateTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public KxUser clone() {
        try {
            return (KxUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
