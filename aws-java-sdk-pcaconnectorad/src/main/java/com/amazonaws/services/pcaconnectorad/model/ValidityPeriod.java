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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information describing the end of the validity period of the certificate. This parameter sets the “Not After” date
 * for the certificate. Certificate validity is the period of time during which a certificate is valid. Validity can be
 * expressed as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in
 * hours, days, months, or years. For more information, see Validity in RFC 5280. This value is unaffected when
 * ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future, the certificate will
 * expire 20 days from issuance time regardless of the ValidityNotBefore value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ValidityPeriod" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidityPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numeric value for the validity period.
     * </p>
     */
    private Long period;
    /**
     * <p>
     * The unit of time. You can select hours, days, weeks, months, and years.
     * </p>
     */
    private String periodType;

    /**
     * <p>
     * The numeric value for the validity period.
     * </p>
     * 
     * @param period
     *        The numeric value for the validity period.
     */

    public void setPeriod(Long period) {
        this.period = period;
    }

    /**
     * <p>
     * The numeric value for the validity period.
     * </p>
     * 
     * @return The numeric value for the validity period.
     */

    public Long getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The numeric value for the validity period.
     * </p>
     * 
     * @param period
     *        The numeric value for the validity period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidityPeriod withPeriod(Long period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The unit of time. You can select hours, days, weeks, months, and years.
     * </p>
     * 
     * @param periodType
     *        The unit of time. You can select hours, days, weeks, months, and years.
     * @see ValidityPeriodType
     */

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    /**
     * <p>
     * The unit of time. You can select hours, days, weeks, months, and years.
     * </p>
     * 
     * @return The unit of time. You can select hours, days, weeks, months, and years.
     * @see ValidityPeriodType
     */

    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * <p>
     * The unit of time. You can select hours, days, weeks, months, and years.
     * </p>
     * 
     * @param periodType
     *        The unit of time. You can select hours, days, weeks, months, and years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityPeriodType
     */

    public ValidityPeriod withPeriodType(String periodType) {
        setPeriodType(periodType);
        return this;
    }

    /**
     * <p>
     * The unit of time. You can select hours, days, weeks, months, and years.
     * </p>
     * 
     * @param periodType
     *        The unit of time. You can select hours, days, weeks, months, and years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidityPeriodType
     */

    public ValidityPeriod withPeriodType(ValidityPeriodType periodType) {
        this.periodType = periodType.toString();
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
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getPeriodType() != null)
            sb.append("PeriodType: ").append(getPeriodType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidityPeriod == false)
            return false;
        ValidityPeriod other = (ValidityPeriod) obj;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getPeriodType() == null ^ this.getPeriodType() == null)
            return false;
        if (other.getPeriodType() != null && other.getPeriodType().equals(this.getPeriodType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getPeriodType() == null) ? 0 : getPeriodType().hashCode());
        return hashCode;
    }

    @Override
    public ValidityPeriod clone() {
        try {
            return (ValidityPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.ValidityPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
