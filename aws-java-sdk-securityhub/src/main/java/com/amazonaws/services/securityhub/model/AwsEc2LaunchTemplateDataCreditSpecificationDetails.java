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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the credit option for CPU usage of a T2, T3, or T3a Amazon EC2 instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataCreditSpecificationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataCreditSpecificationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The credit option for CPU usage of a T instance.
     * </p>
     */
    private String cpuCredits;

    /**
     * <p>
     * The credit option for CPU usage of a T instance.
     * </p>
     * 
     * @param cpuCredits
     *        The credit option for CPU usage of a T instance.
     */

    public void setCpuCredits(String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    /**
     * <p>
     * The credit option for CPU usage of a T instance.
     * </p>
     * 
     * @return The credit option for CPU usage of a T instance.
     */

    public String getCpuCredits() {
        return this.cpuCredits;
    }

    /**
     * <p>
     * The credit option for CPU usage of a T instance.
     * </p>
     * 
     * @param cpuCredits
     *        The credit option for CPU usage of a T instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataCreditSpecificationDetails withCpuCredits(String cpuCredits) {
        setCpuCredits(cpuCredits);
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
        if (getCpuCredits() != null)
            sb.append("CpuCredits: ").append(getCpuCredits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataCreditSpecificationDetails == false)
            return false;
        AwsEc2LaunchTemplateDataCreditSpecificationDetails other = (AwsEc2LaunchTemplateDataCreditSpecificationDetails) obj;
        if (other.getCpuCredits() == null ^ this.getCpuCredits() == null)
            return false;
        if (other.getCpuCredits() != null && other.getCpuCredits().equals(this.getCpuCredits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuCredits() == null) ? 0 : getCpuCredits().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataCreditSpecificationDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataCreditSpecificationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataCreditSpecificationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
