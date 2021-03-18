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
 * The severity assigned to the finding by the finding provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FindingProviderSeverity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingProviderSeverity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The severity label assigned to the finding by the finding provider.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The finding provider's original value for the severity.
     * </p>
     */
    private String original;

    /**
     * <p>
     * The severity label assigned to the finding by the finding provider.
     * </p>
     * 
     * @param label
     *        The severity label assigned to the finding by the finding provider.
     * @see SeverityLabel
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The severity label assigned to the finding by the finding provider.
     * </p>
     * 
     * @return The severity label assigned to the finding by the finding provider.
     * @see SeverityLabel
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The severity label assigned to the finding by the finding provider.
     * </p>
     * 
     * @param label
     *        The severity label assigned to the finding by the finding provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityLabel
     */

    public FindingProviderSeverity withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The severity label assigned to the finding by the finding provider.
     * </p>
     * 
     * @param label
     *        The severity label assigned to the finding by the finding provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityLabel
     */

    public FindingProviderSeverity withLabel(SeverityLabel label) {
        this.label = label.toString();
        return this;
    }

    /**
     * <p>
     * The finding provider's original value for the severity.
     * </p>
     * 
     * @param original
     *        The finding provider's original value for the severity.
     */

    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * <p>
     * The finding provider's original value for the severity.
     * </p>
     * 
     * @return The finding provider's original value for the severity.
     */

    public String getOriginal() {
        return this.original;
    }

    /**
     * <p>
     * The finding provider's original value for the severity.
     * </p>
     * 
     * @param original
     *        The finding provider's original value for the severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingProviderSeverity withOriginal(String original) {
        setOriginal(original);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getOriginal() != null)
            sb.append("Original: ").append(getOriginal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingProviderSeverity == false)
            return false;
        FindingProviderSeverity other = (FindingProviderSeverity) obj;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getOriginal() == null ^ this.getOriginal() == null)
            return false;
        if (other.getOriginal() != null && other.getOriginal().equals(this.getOriginal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getOriginal() == null) ? 0 : getOriginal().hashCode());
        return hashCode;
    }

    @Override
    public FindingProviderSeverity clone() {
        try {
            return (FindingProviderSeverity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FindingProviderSeverityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
