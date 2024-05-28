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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an enabled security standard in which a security control is enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AssociatedStandard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedStandard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     */
    private String standardsId;

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * 
     * @param standardsId
     *        The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *        portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *        >DescribeStandards</a> API response.
     */

    public void setStandardsId(String standardsId) {
        this.standardsId = standardsId;
    }

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * 
     * @return The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *         portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *         >DescribeStandards</a> API response.
     */

    public String getStandardsId() {
        return this.standardsId;
    }

    /**
     * <p>
     * The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of
     * the Amazon Resource Name (ARN) returned for a standard in the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html">DescribeStandards</a>
     * API response.
     * </p>
     * 
     * @param standardsId
     *        The unique identifier of a standard in which a control is enabled. This field consists of the resource
     *        portion of the Amazon Resource Name (ARN) returned for a standard in the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html"
     *        >DescribeStandards</a> API response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedStandard withStandardsId(String standardsId) {
        setStandardsId(standardsId);
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
        if (getStandardsId() != null)
            sb.append("StandardsId: ").append(getStandardsId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedStandard == false)
            return false;
        AssociatedStandard other = (AssociatedStandard) obj;
        if (other.getStandardsId() == null ^ this.getStandardsId() == null)
            return false;
        if (other.getStandardsId() != null && other.getStandardsId().equals(this.getStandardsId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsId() == null) ? 0 : getStandardsId().hashCode());
        return hashCode;
    }

    @Override
    public AssociatedStandard clone() {
        try {
            return (AssociatedStandard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AssociatedStandardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
