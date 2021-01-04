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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the category, types, and occurrences of sensitive data that produced a sensitive data
 * finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SensitiveDataItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensitiveDataItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as private
     * keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or,
     * PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or
     * personally identifiable information, such as driver's license identification numbers.
     * </p>
     */
    private String category;
    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of
     * occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of those
     * occurrences.
     * </p>
     */
    private java.util.List<DefaultDetection> detections;
    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as private
     * keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or,
     * PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or
     * personally identifiable information, such as driver's license identification numbers.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as
     *        private keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers;
     *        or, PERSONAL_INFORMATION, for personal health information, such as health insurance identification
     *        numbers, or personally identifiable information, such as driver's license identification numbers.
     * @see SensitiveDataItemCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as private
     * keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or,
     * PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or
     * personally identifiable information, such as driver's license identification numbers.
     * </p>
     * 
     * @return The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as
     *         private keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers;
     *         or, PERSONAL_INFORMATION, for personal health information, such as health insurance identification
     *         numbers, or personally identifiable information, such as driver's license identification numbers.
     * @see SensitiveDataItemCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as private
     * keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or,
     * PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or
     * personally identifiable information, such as driver's license identification numbers.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as
     *        private keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers;
     *        or, PERSONAL_INFORMATION, for personal health information, such as health insurance identification
     *        numbers, or personally identifiable information, such as driver's license identification numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SensitiveDataItemCategory
     */

    public SensitiveDataItem withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as private
     * keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or,
     * PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or
     * personally identifiable information, such as driver's license identification numbers.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as
     *        private keys or AWS secret keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers;
     *        or, PERSONAL_INFORMATION, for personal health information, such as health insurance identification
     *        numbers, or personally identifiable information, such as driver's license identification numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SensitiveDataItemCategory
     */

    public SensitiveDataItem withCategory(SensitiveDataItemCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of
     * occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of those
     * occurrences.
     * </p>
     * 
     * @return An array of objects, one for each type of sensitive data that was detected. Each object reports the
     *         number of occurrences of a specific type of sensitive data that was detected, and the location of up to
     *         15 of those occurrences.
     */

    public java.util.List<DefaultDetection> getDetections() {
        return detections;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of
     * occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of those
     * occurrences.
     * </p>
     * 
     * @param detections
     *        An array of objects, one for each type of sensitive data that was detected. Each object reports the number
     *        of occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of
     *        those occurrences.
     */

    public void setDetections(java.util.Collection<DefaultDetection> detections) {
        if (detections == null) {
            this.detections = null;
            return;
        }

        this.detections = new java.util.ArrayList<DefaultDetection>(detections);
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of
     * occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of those
     * occurrences.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetections(java.util.Collection)} or {@link #withDetections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detections
     *        An array of objects, one for each type of sensitive data that was detected. Each object reports the number
     *        of occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of
     *        those occurrences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataItem withDetections(DefaultDetection... detections) {
        if (this.detections == null) {
            setDetections(new java.util.ArrayList<DefaultDetection>(detections.length));
        }
        for (DefaultDetection ele : detections) {
            this.detections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of
     * occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of those
     * occurrences.
     * </p>
     * 
     * @param detections
     *        An array of objects, one for each type of sensitive data that was detected. Each object reports the number
     *        of occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of
     *        those occurrences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataItem withDetections(java.util.Collection<DefaultDetection> detections) {
        setDetections(detections);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     * 
     * @param totalCount
     *        The total number of occurrences of the sensitive data that was detected.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     * 
     * @return The total number of occurrences of the sensitive data that was detected.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     * 
     * @param totalCount
     *        The total number of occurrences of the sensitive data that was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataItem withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getDetections() != null)
            sb.append("Detections: ").append(getDetections()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SensitiveDataItem == false)
            return false;
        SensitiveDataItem other = (SensitiveDataItem) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDetections() == null ^ this.getDetections() == null)
            return false;
        if (other.getDetections() != null && other.getDetections().equals(this.getDetections()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getDetections() == null) ? 0 : getDetections().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SensitiveDataItem clone() {
        try {
            return (SensitiveDataItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SensitiveDataItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
