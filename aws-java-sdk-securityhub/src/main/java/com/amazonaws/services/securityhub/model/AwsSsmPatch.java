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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the compliance for a patch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSsmPatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSsmPatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compliance status details for the patch.
     * </p>
     */
    private AwsSsmComplianceSummary complianceSummary;

    /**
     * <p>
     * The compliance status details for the patch.
     * </p>
     * 
     * @param complianceSummary
     *        The compliance status details for the patch.
     */

    public void setComplianceSummary(AwsSsmComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
    }

    /**
     * <p>
     * The compliance status details for the patch.
     * </p>
     * 
     * @return The compliance status details for the patch.
     */

    public AwsSsmComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    /**
     * <p>
     * The compliance status details for the patch.
     * </p>
     * 
     * @param complianceSummary
     *        The compliance status details for the patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmPatch withComplianceSummary(AwsSsmComplianceSummary complianceSummary) {
        setComplianceSummary(complianceSummary);
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
        if (getComplianceSummary() != null)
            sb.append("ComplianceSummary: ").append(getComplianceSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSsmPatch == false)
            return false;
        AwsSsmPatch other = (AwsSsmPatch) obj;
        if (other.getComplianceSummary() == null ^ this.getComplianceSummary() == null)
            return false;
        if (other.getComplianceSummary() != null && other.getComplianceSummary().equals(this.getComplianceSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceSummary() == null) ? 0 : getComplianceSummary().hashCode());
        return hashCode;
    }

    @Override
    public AwsSsmPatch clone() {
        try {
            return (AwsSsmPatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSsmPatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
