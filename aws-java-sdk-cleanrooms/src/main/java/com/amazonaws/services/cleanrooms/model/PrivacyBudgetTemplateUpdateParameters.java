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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The epsilon and noise parameters that you want to update in the privacy budget template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PrivacyBudgetTemplateUpdateParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivacyBudgetTemplateUpdateParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that specifies the new values for the epsilon and noise parameters.
     * </p>
     */
    private DifferentialPrivacyTemplateUpdateParameters differentialPrivacy;

    /**
     * <p>
     * An object that specifies the new values for the epsilon and noise parameters.
     * </p>
     * 
     * @param differentialPrivacy
     *        An object that specifies the new values for the epsilon and noise parameters.
     */

    public void setDifferentialPrivacy(DifferentialPrivacyTemplateUpdateParameters differentialPrivacy) {
        this.differentialPrivacy = differentialPrivacy;
    }

    /**
     * <p>
     * An object that specifies the new values for the epsilon and noise parameters.
     * </p>
     * 
     * @return An object that specifies the new values for the epsilon and noise parameters.
     */

    public DifferentialPrivacyTemplateUpdateParameters getDifferentialPrivacy() {
        return this.differentialPrivacy;
    }

    /**
     * <p>
     * An object that specifies the new values for the epsilon and noise parameters.
     * </p>
     * 
     * @param differentialPrivacy
     *        An object that specifies the new values for the epsilon and noise parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplateUpdateParameters withDifferentialPrivacy(DifferentialPrivacyTemplateUpdateParameters differentialPrivacy) {
        setDifferentialPrivacy(differentialPrivacy);
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
        if (getDifferentialPrivacy() != null)
            sb.append("DifferentialPrivacy: ").append(getDifferentialPrivacy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivacyBudgetTemplateUpdateParameters == false)
            return false;
        PrivacyBudgetTemplateUpdateParameters other = (PrivacyBudgetTemplateUpdateParameters) obj;
        if (other.getDifferentialPrivacy() == null ^ this.getDifferentialPrivacy() == null)
            return false;
        if (other.getDifferentialPrivacy() != null && other.getDifferentialPrivacy().equals(this.getDifferentialPrivacy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDifferentialPrivacy() == null) ? 0 : getDifferentialPrivacy().hashCode());
        return hashCode;
    }

    @Override
    public PrivacyBudgetTemplateUpdateParameters clone() {
        try {
            return (PrivacyBudgetTemplateUpdateParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.PrivacyBudgetTemplateUpdateParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
