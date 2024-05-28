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
 * This object defines the access restrictions to Amazon S3 resources that are included in custom worker task templates
 * using the Liquid filter, <code>grant_read_access</code>.
 * </p>
 * <p>
 * To learn more about how custom templates are created, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-custom-templates.html">Create custom worker task
 * templates</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/S3Presign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Presign implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this parameter to specify the allowed request source. Possible sources are either <code>SourceIp</code> or
     * <code>VpcSourceIp</code>.
     * </p>
     */
    private IamPolicyConstraints iamPolicyConstraints;

    /**
     * <p>
     * Use this parameter to specify the allowed request source. Possible sources are either <code>SourceIp</code> or
     * <code>VpcSourceIp</code>.
     * </p>
     * 
     * @param iamPolicyConstraints
     *        Use this parameter to specify the allowed request source. Possible sources are either
     *        <code>SourceIp</code> or <code>VpcSourceIp</code>.
     */

    public void setIamPolicyConstraints(IamPolicyConstraints iamPolicyConstraints) {
        this.iamPolicyConstraints = iamPolicyConstraints;
    }

    /**
     * <p>
     * Use this parameter to specify the allowed request source. Possible sources are either <code>SourceIp</code> or
     * <code>VpcSourceIp</code>.
     * </p>
     * 
     * @return Use this parameter to specify the allowed request source. Possible sources are either
     *         <code>SourceIp</code> or <code>VpcSourceIp</code>.
     */

    public IamPolicyConstraints getIamPolicyConstraints() {
        return this.iamPolicyConstraints;
    }

    /**
     * <p>
     * Use this parameter to specify the allowed request source. Possible sources are either <code>SourceIp</code> or
     * <code>VpcSourceIp</code>.
     * </p>
     * 
     * @param iamPolicyConstraints
     *        Use this parameter to specify the allowed request source. Possible sources are either
     *        <code>SourceIp</code> or <code>VpcSourceIp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Presign withIamPolicyConstraints(IamPolicyConstraints iamPolicyConstraints) {
        setIamPolicyConstraints(iamPolicyConstraints);
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
        if (getIamPolicyConstraints() != null)
            sb.append("IamPolicyConstraints: ").append(getIamPolicyConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Presign == false)
            return false;
        S3Presign other = (S3Presign) obj;
        if (other.getIamPolicyConstraints() == null ^ this.getIamPolicyConstraints() == null)
            return false;
        if (other.getIamPolicyConstraints() != null && other.getIamPolicyConstraints().equals(this.getIamPolicyConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamPolicyConstraints() == null) ? 0 : getIamPolicyConstraints().hashCode());
        return hashCode;
    }

    @Override
    public S3Presign clone() {
        try {
            return (S3Presign) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.S3PresignMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
