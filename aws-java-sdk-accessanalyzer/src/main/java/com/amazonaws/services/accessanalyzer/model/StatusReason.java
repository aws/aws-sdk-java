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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides more details about the current status of the analyzer. For example, if the creation for the analyzer fails,
 * a <code>Failed</code> status is displayed. For an analyzer with organization as the type, this failure can be due to
 * an issue with creating the service-linked roles required in the member accounts of the AWS organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/StatusReason" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * 
     * @param code
     *        The reason code for the current status of the analyzer.
     * @see ReasonCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * 
     * @return The reason code for the current status of the analyzer.
     * @see ReasonCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * 
     * @param code
     *        The reason code for the current status of the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReasonCode
     */

    public StatusReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The reason code for the current status of the analyzer.
     * </p>
     * 
     * @param code
     *        The reason code for the current status of the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReasonCode
     */

    public StatusReason withCode(ReasonCode code) {
        this.code = code.toString();
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusReason == false)
            return false;
        StatusReason other = (StatusReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public StatusReason clone() {
        try {
            return (StatusReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.StatusReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
