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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains bias metrics for a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Bias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bias report for a model
     * </p>
     */
    private MetricsSource report;

    /**
     * <p>
     * The bias report for a model
     * </p>
     * 
     * @param report
     *        The bias report for a model
     */

    public void setReport(MetricsSource report) {
        this.report = report;
    }

    /**
     * <p>
     * The bias report for a model
     * </p>
     * 
     * @return The bias report for a model
     */

    public MetricsSource getReport() {
        return this.report;
    }

    /**
     * <p>
     * The bias report for a model
     * </p>
     * 
     * @param report
     *        The bias report for a model
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bias withReport(MetricsSource report) {
        setReport(report);
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
        if (getReport() != null)
            sb.append("Report: ").append(getReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bias == false)
            return false;
        Bias other = (Bias) obj;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        return hashCode;
    }

    @Override
    public Bias clone() {
        try {
            return (Bias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.BiasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
