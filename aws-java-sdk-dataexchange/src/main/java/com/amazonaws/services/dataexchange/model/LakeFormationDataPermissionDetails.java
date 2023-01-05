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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the AWS Lake Formation data permission.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/LakeFormationDataPermissionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationDataPermissionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the LF-tag policy.
     * </p>
     */
    private LFTagPolicyDetails lFTagPolicy;

    /**
     * <p>
     * Details about the LF-tag policy.
     * </p>
     * 
     * @param lFTagPolicy
     *        Details about the LF-tag policy.
     */

    public void setLFTagPolicy(LFTagPolicyDetails lFTagPolicy) {
        this.lFTagPolicy = lFTagPolicy;
    }

    /**
     * <p>
     * Details about the LF-tag policy.
     * </p>
     * 
     * @return Details about the LF-tag policy.
     */

    public LFTagPolicyDetails getLFTagPolicy() {
        return this.lFTagPolicy;
    }

    /**
     * <p>
     * Details about the LF-tag policy.
     * </p>
     * 
     * @param lFTagPolicy
     *        Details about the LF-tag policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationDataPermissionDetails withLFTagPolicy(LFTagPolicyDetails lFTagPolicy) {
        setLFTagPolicy(lFTagPolicy);
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
        if (getLFTagPolicy() != null)
            sb.append("LFTagPolicy: ").append(getLFTagPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationDataPermissionDetails == false)
            return false;
        LakeFormationDataPermissionDetails other = (LakeFormationDataPermissionDetails) obj;
        if (other.getLFTagPolicy() == null ^ this.getLFTagPolicy() == null)
            return false;
        if (other.getLFTagPolicy() != null && other.getLFTagPolicy().equals(this.getLFTagPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLFTagPolicy() == null) ? 0 : getLFTagPolicy().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationDataPermissionDetails clone() {
        try {
            return (LakeFormationDataPermissionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.LakeFormationDataPermissionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
