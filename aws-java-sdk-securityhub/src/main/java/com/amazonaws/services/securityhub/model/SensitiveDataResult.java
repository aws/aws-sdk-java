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
 * Contains a detected instance of sensitive data that are based on built-in identifiers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SensitiveDataResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensitiveDataResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category of sensitive data that was detected. For example, the category can indicate that the sensitive data
     * involved credentials, financial information, or personal information.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The list of detected instances of sensitive data.
     * </p>
     */
    private java.util.List<SensitiveDataDetections> detections;
    /**
     * <p>
     * The total number of occurrences of sensitive data.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The category of sensitive data that was detected. For example, the category can indicate that the sensitive data
     * involved credentials, financial information, or personal information.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that was detected. For example, the category can indicate that the
     *        sensitive data involved credentials, financial information, or personal information.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example, the category can indicate that the sensitive data
     * involved credentials, financial information, or personal information.
     * </p>
     * 
     * @return The category of sensitive data that was detected. For example, the category can indicate that the
     *         sensitive data involved credentials, financial information, or personal information.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example, the category can indicate that the sensitive data
     * involved credentials, financial information, or personal information.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that was detected. For example, the category can indicate that the
     *        sensitive data involved credentials, financial information, or personal information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataResult withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The list of detected instances of sensitive data.
     * </p>
     * 
     * @return The list of detected instances of sensitive data.
     */

    public java.util.List<SensitiveDataDetections> getDetections() {
        return detections;
    }

    /**
     * <p>
     * The list of detected instances of sensitive data.
     * </p>
     * 
     * @param detections
     *        The list of detected instances of sensitive data.
     */

    public void setDetections(java.util.Collection<SensitiveDataDetections> detections) {
        if (detections == null) {
            this.detections = null;
            return;
        }

        this.detections = new java.util.ArrayList<SensitiveDataDetections>(detections);
    }

    /**
     * <p>
     * The list of detected instances of sensitive data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetections(java.util.Collection)} or {@link #withDetections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detections
     *        The list of detected instances of sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataResult withDetections(SensitiveDataDetections... detections) {
        if (this.detections == null) {
            setDetections(new java.util.ArrayList<SensitiveDataDetections>(detections.length));
        }
        for (SensitiveDataDetections ele : detections) {
            this.detections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of detected instances of sensitive data.
     * </p>
     * 
     * @param detections
     *        The list of detected instances of sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataResult withDetections(java.util.Collection<SensitiveDataDetections> detections) {
        setDetections(detections);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data.
     * </p>
     * 
     * @param totalCount
     *        The total number of occurrences of sensitive data.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data.
     * </p>
     * 
     * @return The total number of occurrences of sensitive data.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data.
     * </p>
     * 
     * @param totalCount
     *        The total number of occurrences of sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataResult withTotalCount(Long totalCount) {
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

        if (obj instanceof SensitiveDataResult == false)
            return false;
        SensitiveDataResult other = (SensitiveDataResult) obj;
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
    public SensitiveDataResult clone() {
        try {
            return (SensitiveDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SensitiveDataResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
