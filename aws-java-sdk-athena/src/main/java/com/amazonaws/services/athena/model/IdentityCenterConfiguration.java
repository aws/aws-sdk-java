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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether the workgroup is IAM Identity Center supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/IdentityCenterConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityCenterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the workgroup is IAM Identity Center supported.
     * </p>
     */
    private Boolean enableIdentityCenter;
    /**
     * <p>
     * The IAM Identity Center instance ARN that the workgroup associates to.
     * </p>
     */
    private String identityCenterInstanceArn;

    /**
     * <p>
     * Specifies whether the workgroup is IAM Identity Center supported.
     * </p>
     * 
     * @param enableIdentityCenter
     *        Specifies whether the workgroup is IAM Identity Center supported.
     */

    public void setEnableIdentityCenter(Boolean enableIdentityCenter) {
        this.enableIdentityCenter = enableIdentityCenter;
    }

    /**
     * <p>
     * Specifies whether the workgroup is IAM Identity Center supported.
     * </p>
     * 
     * @return Specifies whether the workgroup is IAM Identity Center supported.
     */

    public Boolean getEnableIdentityCenter() {
        return this.enableIdentityCenter;
    }

    /**
     * <p>
     * Specifies whether the workgroup is IAM Identity Center supported.
     * </p>
     * 
     * @param enableIdentityCenter
     *        Specifies whether the workgroup is IAM Identity Center supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityCenterConfiguration withEnableIdentityCenter(Boolean enableIdentityCenter) {
        setEnableIdentityCenter(enableIdentityCenter);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workgroup is IAM Identity Center supported.
     * </p>
     * 
     * @return Specifies whether the workgroup is IAM Identity Center supported.
     */

    public Boolean isEnableIdentityCenter() {
        return this.enableIdentityCenter;
    }

    /**
     * <p>
     * The IAM Identity Center instance ARN that the workgroup associates to.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The IAM Identity Center instance ARN that the workgroup associates to.
     */

    public void setIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        this.identityCenterInstanceArn = identityCenterInstanceArn;
    }

    /**
     * <p>
     * The IAM Identity Center instance ARN that the workgroup associates to.
     * </p>
     * 
     * @return The IAM Identity Center instance ARN that the workgroup associates to.
     */

    public String getIdentityCenterInstanceArn() {
        return this.identityCenterInstanceArn;
    }

    /**
     * <p>
     * The IAM Identity Center instance ARN that the workgroup associates to.
     * </p>
     * 
     * @param identityCenterInstanceArn
     *        The IAM Identity Center instance ARN that the workgroup associates to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityCenterConfiguration withIdentityCenterInstanceArn(String identityCenterInstanceArn) {
        setIdentityCenterInstanceArn(identityCenterInstanceArn);
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
        if (getEnableIdentityCenter() != null)
            sb.append("EnableIdentityCenter: ").append(getEnableIdentityCenter()).append(",");
        if (getIdentityCenterInstanceArn() != null)
            sb.append("IdentityCenterInstanceArn: ").append(getIdentityCenterInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityCenterConfiguration == false)
            return false;
        IdentityCenterConfiguration other = (IdentityCenterConfiguration) obj;
        if (other.getEnableIdentityCenter() == null ^ this.getEnableIdentityCenter() == null)
            return false;
        if (other.getEnableIdentityCenter() != null && other.getEnableIdentityCenter().equals(this.getEnableIdentityCenter()) == false)
            return false;
        if (other.getIdentityCenterInstanceArn() == null ^ this.getIdentityCenterInstanceArn() == null)
            return false;
        if (other.getIdentityCenterInstanceArn() != null && other.getIdentityCenterInstanceArn().equals(this.getIdentityCenterInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableIdentityCenter() == null) ? 0 : getEnableIdentityCenter().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterInstanceArn() == null) ? 0 : getIdentityCenterInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public IdentityCenterConfiguration clone() {
        try {
            return (IdentityCenterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.IdentityCenterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
