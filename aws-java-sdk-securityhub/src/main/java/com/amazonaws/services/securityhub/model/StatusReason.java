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
 * Provides additional context for the value of <code>Compliance.Status</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StatusReason" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code that represents a reason for the control status. For the list of status reason codes and their meanings,
     * see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     */
    private String reasonCode;
    /**
     * <p>
     * The corresponding description for the status reason code.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A code that represents a reason for the control status. For the list of status reason codes and their meanings,
     * see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param reasonCode
     *        A code that represents a reason for the control status. For the list of status reason codes and their
     *        meanings, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *        >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     */

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * A code that represents a reason for the control status. For the list of status reason codes and their meanings,
     * see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @return A code that represents a reason for the control status. For the list of status reason codes and their
     *         meanings, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *         >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     */

    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * <p>
     * A code that represents a reason for the control status. For the list of status reason codes and their meanings,
     * see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * </p>
     * 
     * @param reasonCode
     *        A code that represents a reason for the control status. For the list of status reason codes and their
     *        meanings, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *        >Standards-related information in the ASFF</a> in the <i>AWS Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusReason withReasonCode(String reasonCode) {
        setReasonCode(reasonCode);
        return this;
    }

    /**
     * <p>
     * The corresponding description for the status reason code.
     * </p>
     * 
     * @param description
     *        The corresponding description for the status reason code.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The corresponding description for the status reason code.
     * </p>
     * 
     * @return The corresponding description for the status reason code.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The corresponding description for the status reason code.
     * </p>
     * 
     * @param description
     *        The corresponding description for the status reason code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusReason withDescription(String description) {
        setDescription(description);
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
        if (getReasonCode() != null)
            sb.append("ReasonCode: ").append(getReasonCode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
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
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
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
        com.amazonaws.services.securityhub.model.transform.StatusReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
