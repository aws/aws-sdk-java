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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the kind of currency detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/ExpenseCurrency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpenseCurrency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        Currency code for detected currency. the current supported codes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        USD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EUR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GBP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CAD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JPY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CHF
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AUD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CNY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BZR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SEK
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HKD
     *        </p>
     *        </li>
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     * 
     * @return Currency code for detected currency. the current supported codes are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         USD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EUR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GBP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CAD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JPY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CHF
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AUD
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CNY
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         BZR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SEK
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HKD
     *         </p>
     *         </li>
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Currency code for detected currency. the current supported codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * USD
     * </p>
     * </li>
     * <li>
     * <p>
     * EUR
     * </p>
     * </li>
     * <li>
     * <p>
     * GBP
     * </p>
     * </li>
     * <li>
     * <p>
     * CAD
     * </p>
     * </li>
     * <li>
     * <p>
     * INR
     * </p>
     * </li>
     * <li>
     * <p>
     * JPY
     * </p>
     * </li>
     * <li>
     * <p>
     * CHF
     * </p>
     * </li>
     * <li>
     * <p>
     * AUD
     * </p>
     * </li>
     * <li>
     * <p>
     * CNY
     * </p>
     * </li>
     * <li>
     * <p>
     * BZR
     * </p>
     * </li>
     * <li>
     * <p>
     * SEK
     * </p>
     * </li>
     * <li>
     * <p>
     * HKD
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        Currency code for detected currency. the current supported codes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        USD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EUR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GBP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CAD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JPY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CHF
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AUD
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CNY
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        BZR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SEK
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HKD
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseCurrency withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * 
     * @param confidence
     *        Percentage confideence in the detected currency.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * 
     * @return Percentage confideence in the detected currency.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Percentage confideence in the detected currency.
     * </p>
     * 
     * @param confidence
     *        Percentage confideence in the detected currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseCurrency withConfidence(Float confidence) {
        setConfidence(confidence);
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
            sb.append("Code: ").append(getCode()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseCurrency == false)
            return false;
        ExpenseCurrency other = (ExpenseCurrency) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public ExpenseCurrency clone() {
        try {
            return (ExpenseCurrency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.ExpenseCurrencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
