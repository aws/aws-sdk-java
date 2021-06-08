/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for an IAM role. You can propose a configuration for a new IAM role or an
 * existing IAM role that you own by specifying the trust policy. If the configuration is for a new IAM role, you must
 * specify the trust policy. If the configuration is for an existing IAM role that you own and you do not propose the
 * trust policy, the access preview uses the existing trust policy for the role. The proposed trust policy cannot be an
 * empty string. For more information about role trust policy limits, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html">IAM and STS quotas</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/IamRoleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamRoleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The proposed trust policy for the IAM role.
     * </p>
     */
    private String trustPolicy;

    /**
     * <p>
     * The proposed trust policy for the IAM role.
     * </p>
     * 
     * @param trustPolicy
     *        The proposed trust policy for the IAM role.
     */

    public void setTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
    }

    /**
     * <p>
     * The proposed trust policy for the IAM role.
     * </p>
     * 
     * @return The proposed trust policy for the IAM role.
     */

    public String getTrustPolicy() {
        return this.trustPolicy;
    }

    /**
     * <p>
     * The proposed trust policy for the IAM role.
     * </p>
     * 
     * @param trustPolicy
     *        The proposed trust policy for the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamRoleConfiguration withTrustPolicy(String trustPolicy) {
        setTrustPolicy(trustPolicy);
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
        if (getTrustPolicy() != null)
            sb.append("TrustPolicy: ").append(getTrustPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IamRoleConfiguration == false)
            return false;
        IamRoleConfiguration other = (IamRoleConfiguration) obj;
        if (other.getTrustPolicy() == null ^ this.getTrustPolicy() == null)
            return false;
        if (other.getTrustPolicy() != null && other.getTrustPolicy().equals(this.getTrustPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustPolicy() == null) ? 0 : getTrustPolicy().hashCode());
        return hashCode;
    }

    @Override
    public IamRoleConfiguration clone() {
        try {
            return (IamRoleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.IamRoleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
