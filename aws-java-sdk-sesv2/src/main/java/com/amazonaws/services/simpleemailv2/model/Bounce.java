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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a <code>Bounce</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/Bounce" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bounce implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>, <code>TRANSIENT</code>, or
     * <code>PERMANENT</code>
     * </p>
     */
    private String bounceType;
    /**
     * <p>
     * The subtype of the bounce, as determined by SES.
     * </p>
     */
    private String bounceSubType;
    /**
     * <p>
     * The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a delivery
     * status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was provided in the
     * DSN.
     * </p>
     */
    private String diagnosticCode;

    /**
     * <p>
     * The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>, <code>TRANSIENT</code>, or
     * <code>PERMANENT</code>
     * </p>
     * 
     * @param bounceType
     *        The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>,
     *        <code>TRANSIENT</code>, or <code>PERMANENT</code>
     * @see BounceType
     */

    public void setBounceType(String bounceType) {
        this.bounceType = bounceType;
    }

    /**
     * <p>
     * The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>, <code>TRANSIENT</code>, or
     * <code>PERMANENT</code>
     * </p>
     * 
     * @return The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>,
     *         <code>TRANSIENT</code>, or <code>PERMANENT</code>
     * @see BounceType
     */

    public String getBounceType() {
        return this.bounceType;
    }

    /**
     * <p>
     * The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>, <code>TRANSIENT</code>, or
     * <code>PERMANENT</code>
     * </p>
     * 
     * @param bounceType
     *        The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>,
     *        <code>TRANSIENT</code>, or <code>PERMANENT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BounceType
     */

    public Bounce withBounceType(String bounceType) {
        setBounceType(bounceType);
        return this;
    }

    /**
     * <p>
     * The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>, <code>TRANSIENT</code>, or
     * <code>PERMANENT</code>
     * </p>
     * 
     * @param bounceType
     *        The type of the bounce, as determined by SES. Can be one of <code>UNDETERMINED</code>,
     *        <code>TRANSIENT</code>, or <code>PERMANENT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BounceType
     */

    public Bounce withBounceType(BounceType bounceType) {
        this.bounceType = bounceType.toString();
        return this;
    }

    /**
     * <p>
     * The subtype of the bounce, as determined by SES.
     * </p>
     * 
     * @param bounceSubType
     *        The subtype of the bounce, as determined by SES.
     */

    public void setBounceSubType(String bounceSubType) {
        this.bounceSubType = bounceSubType;
    }

    /**
     * <p>
     * The subtype of the bounce, as determined by SES.
     * </p>
     * 
     * @return The subtype of the bounce, as determined by SES.
     */

    public String getBounceSubType() {
        return this.bounceSubType;
    }

    /**
     * <p>
     * The subtype of the bounce, as determined by SES.
     * </p>
     * 
     * @param bounceSubType
     *        The subtype of the bounce, as determined by SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bounce withBounceSubType(String bounceSubType) {
        setBounceSubType(bounceSubType);
        return this;
    }

    /**
     * <p>
     * The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a delivery
     * status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was provided in the
     * DSN.
     * </p>
     * 
     * @param diagnosticCode
     *        The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a
     *        delivery status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was
     *        provided in the DSN.
     */

    public void setDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
    }

    /**
     * <p>
     * The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a delivery
     * status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was provided in the
     * DSN.
     * </p>
     * 
     * @return The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a
     *         delivery status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was
     *         provided in the DSN.
     */

    public String getDiagnosticCode() {
        return this.diagnosticCode;
    }

    /**
     * <p>
     * The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a delivery
     * status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was provided in the
     * DSN.
     * </p>
     * 
     * @param diagnosticCode
     *        The status code issued by the reporting Message Transfer Authority (MTA). This field only appears if a
     *        delivery status notification (DSN) was attached to the bounce and the <code>Diagnostic-Code</code> was
     *        provided in the DSN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bounce withDiagnosticCode(String diagnosticCode) {
        setDiagnosticCode(diagnosticCode);
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
        if (getBounceType() != null)
            sb.append("BounceType: ").append(getBounceType()).append(",");
        if (getBounceSubType() != null)
            sb.append("BounceSubType: ").append(getBounceSubType()).append(",");
        if (getDiagnosticCode() != null)
            sb.append("DiagnosticCode: ").append(getDiagnosticCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bounce == false)
            return false;
        Bounce other = (Bounce) obj;
        if (other.getBounceType() == null ^ this.getBounceType() == null)
            return false;
        if (other.getBounceType() != null && other.getBounceType().equals(this.getBounceType()) == false)
            return false;
        if (other.getBounceSubType() == null ^ this.getBounceSubType() == null)
            return false;
        if (other.getBounceSubType() != null && other.getBounceSubType().equals(this.getBounceSubType()) == false)
            return false;
        if (other.getDiagnosticCode() == null ^ this.getDiagnosticCode() == null)
            return false;
        if (other.getDiagnosticCode() != null && other.getDiagnosticCode().equals(this.getDiagnosticCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBounceType() == null) ? 0 : getBounceType().hashCode());
        hashCode = prime * hashCode + ((getBounceSubType() == null) ? 0 : getBounceSubType().hashCode());
        hashCode = prime * hashCode + ((getDiagnosticCode() == null) ? 0 : getDiagnosticCode().hashCode());
        return hashCode;
    }

    @Override
    public Bounce clone() {
        try {
            return (Bounce) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.BounceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
