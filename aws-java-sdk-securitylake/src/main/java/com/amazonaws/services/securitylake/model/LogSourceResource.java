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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The supported source types from which logs and events are collected in Amazon Security Lake. For a list of supported
 * Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/LogSourceResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogSourceResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     */
    private AwsLogSourceResource awsLogSource;
    /**
     * <p>
     * Amazon Security Lake supports custom source types. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     */
    private CustomLogSourceResource customLogSource;

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param awsLogSource
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     */

    public void setAwsLogSource(AwsLogSourceResource awsLogSource) {
        this.awsLogSource = awsLogSource;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @return Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *         more information, see the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *         Lake User Guide</a>.
     */

    public AwsLogSourceResource getAwsLogSource() {
        return this.awsLogSource;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param awsLogSource
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security
     *        Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSourceResource withAwsLogSource(AwsLogSourceResource awsLogSource) {
        setAwsLogSource(awsLogSource);
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports custom source types. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param customLogSource
     *        Amazon Security Lake supports custom source types. For more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security Lake
     *        User Guide</a>.
     */

    public void setCustomLogSource(CustomLogSourceResource customLogSource) {
        this.customLogSource = customLogSource;
    }

    /**
     * <p>
     * Amazon Security Lake supports custom source types. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @return Amazon Security Lake supports custom source types. For more information, see the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security
     *         Lake User Guide</a>.
     */

    public CustomLogSourceResource getCustomLogSource() {
        return this.customLogSource;
    }

    /**
     * <p>
     * Amazon Security Lake supports custom source types. For more information, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security Lake User
     * Guide</a>.
     * </p>
     * 
     * @param customLogSource
     *        Amazon Security Lake supports custom source types. For more information, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/custom-sources.html">Amazon Security Lake
     *        User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSourceResource withCustomLogSource(CustomLogSourceResource customLogSource) {
        setCustomLogSource(customLogSource);
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
        if (getAwsLogSource() != null)
            sb.append("AwsLogSource: ").append(getAwsLogSource()).append(",");
        if (getCustomLogSource() != null)
            sb.append("CustomLogSource: ").append(getCustomLogSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogSourceResource == false)
            return false;
        LogSourceResource other = (LogSourceResource) obj;
        if (other.getAwsLogSource() == null ^ this.getAwsLogSource() == null)
            return false;
        if (other.getAwsLogSource() != null && other.getAwsLogSource().equals(this.getAwsLogSource()) == false)
            return false;
        if (other.getCustomLogSource() == null ^ this.getCustomLogSource() == null)
            return false;
        if (other.getCustomLogSource() != null && other.getCustomLogSource().equals(this.getCustomLogSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsLogSource() == null) ? 0 : getAwsLogSource().hashCode());
        hashCode = prime * hashCode + ((getCustomLogSource() == null) ? 0 : getCustomLogSource().hashCode());
        return hashCode;
    }

    @Override
    public LogSourceResource clone() {
        try {
            return (LogSourceResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.LogSourceResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
