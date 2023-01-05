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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the external metrics preferences for EC2 rightsizing recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExternalMetricsPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalMetricsPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the source options for external metrics preferences.
     * </p>
     */
    private String source;

    /**
     * <p>
     * Contains the source options for external metrics preferences.
     * </p>
     * 
     * @param source
     *        Contains the source options for external metrics preferences.
     * @see ExternalMetricsSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Contains the source options for external metrics preferences.
     * </p>
     * 
     * @return Contains the source options for external metrics preferences.
     * @see ExternalMetricsSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * Contains the source options for external metrics preferences.
     * </p>
     * 
     * @param source
     *        Contains the source options for external metrics preferences.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalMetricsSource
     */

    public ExternalMetricsPreference withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Contains the source options for external metrics preferences.
     * </p>
     * 
     * @param source
     *        Contains the source options for external metrics preferences.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalMetricsSource
     */

    public ExternalMetricsPreference withSource(ExternalMetricsSource source) {
        this.source = source.toString();
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalMetricsPreference == false)
            return false;
        ExternalMetricsPreference other = (ExternalMetricsPreference) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ExternalMetricsPreference clone() {
        try {
            return (ExternalMetricsPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ExternalMetricsPreferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
