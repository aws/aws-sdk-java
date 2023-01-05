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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The supported source types from which logs and events are collected in Amazon Security Lake. For the list of
 * supported Amazon Web Services, see the <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/internal-sources.html">Amazon Security Lake User
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/SourceType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * </p>
     */
    private String awsSourceType;
    /**
     * <p>
     * Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User Guide.
     * </p>
     */
    private String customSourceType;

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param awsSourceType
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * @see AwsLogSourceType
     */

    public void setAwsSourceType(String awsSourceType) {
        this.awsSourceType = awsSourceType;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @return Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * @see AwsLogSourceType
     */

    public String getAwsSourceType() {
        return this.awsSourceType;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param awsSourceType
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceType
     */

    public SourceType withAwsSourceType(String awsSourceType) {
        setAwsSourceType(awsSourceType);
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param awsSourceType
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceType
     */

    public SourceType withAwsSourceType(AwsLogSourceType awsSourceType) {
        this.awsSourceType = awsSourceType.toString();
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User Guide.
     * </p>
     * 
     * @param customSourceType
     *        Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User
     *        Guide.
     */

    public void setCustomSourceType(String customSourceType) {
        this.customSourceType = customSourceType;
    }

    /**
     * <p>
     * Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User Guide.
     * </p>
     * 
     * @return Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User
     *         Guide.
     */

    public String getCustomSourceType() {
        return this.customSourceType;
    }

    /**
     * <p>
     * Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User Guide.
     * </p>
     * 
     * @param customSourceType
     *        Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User
     *        Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceType withCustomSourceType(String customSourceType) {
        setCustomSourceType(customSourceType);
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
        if (getAwsSourceType() != null)
            sb.append("AwsSourceType: ").append(getAwsSourceType()).append(",");
        if (getCustomSourceType() != null)
            sb.append("CustomSourceType: ").append(getCustomSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceType == false)
            return false;
        SourceType other = (SourceType) obj;
        if (other.getAwsSourceType() == null ^ this.getAwsSourceType() == null)
            return false;
        if (other.getAwsSourceType() != null && other.getAwsSourceType().equals(this.getAwsSourceType()) == false)
            return false;
        if (other.getCustomSourceType() == null ^ this.getCustomSourceType() == null)
            return false;
        if (other.getCustomSourceType() != null && other.getCustomSourceType().equals(this.getCustomSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsSourceType() == null) ? 0 : getAwsSourceType().hashCode());
        hashCode = prime * hashCode + ((getCustomSourceType() == null) ? 0 : getCustomSourceType().hashCode());
        return hashCode;
    }

    @Override
    public SourceType clone() {
        try {
            return (SourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.SourceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
