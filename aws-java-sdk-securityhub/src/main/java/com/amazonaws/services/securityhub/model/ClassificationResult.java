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
 * Details about the sensitive data that was detected on the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ClassificationResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of content that the finding applies to.
     * </p>
     */
    private String mimeType;
    /**
     * <p>
     * The total size in bytes of the affected data.
     * </p>
     */
    private Long sizeClassified;
    /**
     * <p>
     * Indicates whether there are additional occurrences of sensitive data that are not included in the finding. This
     * occurs when the number of occurrences exceeds the maximum that can be included.
     * </p>
     */
    private Boolean additionalOccurrences;
    /**
     * <p>
     * The current status of the sensitive data detection.
     * </p>
     */
    private ClassificationStatus status;
    /**
     * <p>
     * Provides details about sensitive data that was identified based on built-in configuration.
     * </p>
     */
    private java.util.List<SensitiveDataResult> sensitiveData;
    /**
     * <p>
     * Provides details about sensitive data that was identified based on customer-defined configuration.
     * </p>
     */
    private CustomDataIdentifiersResult customDataIdentifiers;

    /**
     * <p>
     * The type of content that the finding applies to.
     * </p>
     * 
     * @param mimeType
     *        The type of content that the finding applies to.
     */

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * <p>
     * The type of content that the finding applies to.
     * </p>
     * 
     * @return The type of content that the finding applies to.
     */

    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * <p>
     * The type of content that the finding applies to.
     * </p>
     * 
     * @param mimeType
     *        The type of content that the finding applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withMimeType(String mimeType) {
        setMimeType(mimeType);
        return this;
    }

    /**
     * <p>
     * The total size in bytes of the affected data.
     * </p>
     * 
     * @param sizeClassified
     *        The total size in bytes of the affected data.
     */

    public void setSizeClassified(Long sizeClassified) {
        this.sizeClassified = sizeClassified;
    }

    /**
     * <p>
     * The total size in bytes of the affected data.
     * </p>
     * 
     * @return The total size in bytes of the affected data.
     */

    public Long getSizeClassified() {
        return this.sizeClassified;
    }

    /**
     * <p>
     * The total size in bytes of the affected data.
     * </p>
     * 
     * @param sizeClassified
     *        The total size in bytes of the affected data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withSizeClassified(Long sizeClassified) {
        setSizeClassified(sizeClassified);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional occurrences of sensitive data that are not included in the finding. This
     * occurs when the number of occurrences exceeds the maximum that can be included.
     * </p>
     * 
     * @param additionalOccurrences
     *        Indicates whether there are additional occurrences of sensitive data that are not included in the finding.
     *        This occurs when the number of occurrences exceeds the maximum that can be included.
     */

    public void setAdditionalOccurrences(Boolean additionalOccurrences) {
        this.additionalOccurrences = additionalOccurrences;
    }

    /**
     * <p>
     * Indicates whether there are additional occurrences of sensitive data that are not included in the finding. This
     * occurs when the number of occurrences exceeds the maximum that can be included.
     * </p>
     * 
     * @return Indicates whether there are additional occurrences of sensitive data that are not included in the
     *         finding. This occurs when the number of occurrences exceeds the maximum that can be included.
     */

    public Boolean getAdditionalOccurrences() {
        return this.additionalOccurrences;
    }

    /**
     * <p>
     * Indicates whether there are additional occurrences of sensitive data that are not included in the finding. This
     * occurs when the number of occurrences exceeds the maximum that can be included.
     * </p>
     * 
     * @param additionalOccurrences
     *        Indicates whether there are additional occurrences of sensitive data that are not included in the finding.
     *        This occurs when the number of occurrences exceeds the maximum that can be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withAdditionalOccurrences(Boolean additionalOccurrences) {
        setAdditionalOccurrences(additionalOccurrences);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional occurrences of sensitive data that are not included in the finding. This
     * occurs when the number of occurrences exceeds the maximum that can be included.
     * </p>
     * 
     * @return Indicates whether there are additional occurrences of sensitive data that are not included in the
     *         finding. This occurs when the number of occurrences exceeds the maximum that can be included.
     */

    public Boolean isAdditionalOccurrences() {
        return this.additionalOccurrences;
    }

    /**
     * <p>
     * The current status of the sensitive data detection.
     * </p>
     * 
     * @param status
     *        The current status of the sensitive data detection.
     */

    public void setStatus(ClassificationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the sensitive data detection.
     * </p>
     * 
     * @return The current status of the sensitive data detection.
     */

    public ClassificationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the sensitive data detection.
     * </p>
     * 
     * @param status
     *        The current status of the sensitive data detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withStatus(ClassificationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on built-in configuration.
     * </p>
     * 
     * @return Provides details about sensitive data that was identified based on built-in configuration.
     */

    public java.util.List<SensitiveDataResult> getSensitiveData() {
        return sensitiveData;
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on built-in configuration.
     * </p>
     * 
     * @param sensitiveData
     *        Provides details about sensitive data that was identified based on built-in configuration.
     */

    public void setSensitiveData(java.util.Collection<SensitiveDataResult> sensitiveData) {
        if (sensitiveData == null) {
            this.sensitiveData = null;
            return;
        }

        this.sensitiveData = new java.util.ArrayList<SensitiveDataResult>(sensitiveData);
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on built-in configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSensitiveData(java.util.Collection)} or {@link #withSensitiveData(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sensitiveData
     *        Provides details about sensitive data that was identified based on built-in configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withSensitiveData(SensitiveDataResult... sensitiveData) {
        if (this.sensitiveData == null) {
            setSensitiveData(new java.util.ArrayList<SensitiveDataResult>(sensitiveData.length));
        }
        for (SensitiveDataResult ele : sensitiveData) {
            this.sensitiveData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on built-in configuration.
     * </p>
     * 
     * @param sensitiveData
     *        Provides details about sensitive data that was identified based on built-in configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withSensitiveData(java.util.Collection<SensitiveDataResult> sensitiveData) {
        setSensitiveData(sensitiveData);
        return this;
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on customer-defined configuration.
     * </p>
     * 
     * @param customDataIdentifiers
     *        Provides details about sensitive data that was identified based on customer-defined configuration.
     */

    public void setCustomDataIdentifiers(CustomDataIdentifiersResult customDataIdentifiers) {
        this.customDataIdentifiers = customDataIdentifiers;
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on customer-defined configuration.
     * </p>
     * 
     * @return Provides details about sensitive data that was identified based on customer-defined configuration.
     */

    public CustomDataIdentifiersResult getCustomDataIdentifiers() {
        return this.customDataIdentifiers;
    }

    /**
     * <p>
     * Provides details about sensitive data that was identified based on customer-defined configuration.
     * </p>
     * 
     * @param customDataIdentifiers
     *        Provides details about sensitive data that was identified based on customer-defined configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withCustomDataIdentifiers(CustomDataIdentifiersResult customDataIdentifiers) {
        setCustomDataIdentifiers(customDataIdentifiers);
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
        if (getMimeType() != null)
            sb.append("MimeType: ").append(getMimeType()).append(",");
        if (getSizeClassified() != null)
            sb.append("SizeClassified: ").append(getSizeClassified()).append(",");
        if (getAdditionalOccurrences() != null)
            sb.append("AdditionalOccurrences: ").append(getAdditionalOccurrences()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSensitiveData() != null)
            sb.append("SensitiveData: ").append(getSensitiveData()).append(",");
        if (getCustomDataIdentifiers() != null)
            sb.append("CustomDataIdentifiers: ").append(getCustomDataIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationResult == false)
            return false;
        ClassificationResult other = (ClassificationResult) obj;
        if (other.getMimeType() == null ^ this.getMimeType() == null)
            return false;
        if (other.getMimeType() != null && other.getMimeType().equals(this.getMimeType()) == false)
            return false;
        if (other.getSizeClassified() == null ^ this.getSizeClassified() == null)
            return false;
        if (other.getSizeClassified() != null && other.getSizeClassified().equals(this.getSizeClassified()) == false)
            return false;
        if (other.getAdditionalOccurrences() == null ^ this.getAdditionalOccurrences() == null)
            return false;
        if (other.getAdditionalOccurrences() != null && other.getAdditionalOccurrences().equals(this.getAdditionalOccurrences()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSensitiveData() == null ^ this.getSensitiveData() == null)
            return false;
        if (other.getSensitiveData() != null && other.getSensitiveData().equals(this.getSensitiveData()) == false)
            return false;
        if (other.getCustomDataIdentifiers() == null ^ this.getCustomDataIdentifiers() == null)
            return false;
        if (other.getCustomDataIdentifiers() != null && other.getCustomDataIdentifiers().equals(this.getCustomDataIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMimeType() == null) ? 0 : getMimeType().hashCode());
        hashCode = prime * hashCode + ((getSizeClassified() == null) ? 0 : getSizeClassified().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOccurrences() == null) ? 0 : getAdditionalOccurrences().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSensitiveData() == null) ? 0 : getSensitiveData().hashCode());
        hashCode = prime * hashCode + ((getCustomDataIdentifiers() == null) ? 0 : getCustomDataIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationResult clone() {
        try {
            return (ClassificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ClassificationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
