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
 * Provides details about an Elastic Graphics specification for an Amazon EC2 launch template.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * 
     * @param type
     *        The type of Elastic Graphics accelerator.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * 
     * @return The type of Elastic Graphics accelerator.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator.
     * </p>
     * 
     * @param type
     *        The type of Elastic Graphics accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails withType(String type) {
        setType(type);
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails == false)
            return false;
        AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails other = (AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
