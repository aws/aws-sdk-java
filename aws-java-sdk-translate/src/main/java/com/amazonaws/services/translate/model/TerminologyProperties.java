/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of the custom terminology.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TerminologyProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminologyProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The language code for the source text of the translation request for which the custom terminology is being used.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language codes for the target languages available with the custom terminology file. All possible target
     * languages are returned in array.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;
    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     */
    private EncryptionKey encryptionKey;
    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     */
    private Integer sizeBytes;
    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     */
    private Integer termCount;
    /**
     * <p>
     * The time at which the custom terminology was created, based on the timestamp.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which the custom terminology was last update, based on the timestamp.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * 
     * @return The name of the custom terminology.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * 
     * @param name
     *        The name of the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * 
     * @param description
     *        The description of the custom terminology properties.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * 
     * @return The description of the custom terminology properties.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * 
     * @param description
     *        The description of the custom terminology properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom terminology.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom terminology.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The language code for the source text of the translation request for which the custom terminology is being used.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the source text of the translation request for which the custom terminology is being
     *        used.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the source text of the translation request for which the custom terminology is being used.
     * </p>
     * 
     * @return The language code for the source text of the translation request for which the custom terminology is
     *         being used.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the source text of the translation request for which the custom terminology is being used.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The language code for the source text of the translation request for which the custom terminology is being
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom terminology file. All possible target
     * languages are returned in array.
     * </p>
     * 
     * @return The language codes for the target languages available with the custom terminology file. All possible
     *         target languages are returned in array.
     */

    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom terminology file. All possible target
     * languages are returned in array.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language codes for the target languages available with the custom terminology file. All possible
     *        target languages are returned in array.
     */

    public void setTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        if (targetLanguageCodes == null) {
            this.targetLanguageCodes = null;
            return;
        }

        this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes);
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom terminology file. All possible target
     * languages are returned in array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLanguageCodes(java.util.Collection)} or {@link #withTargetLanguageCodes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language codes for the target languages available with the custom terminology file. All possible
     *        target languages are returned in array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withTargetLanguageCodes(String... targetLanguageCodes) {
        if (this.targetLanguageCodes == null) {
            setTargetLanguageCodes(new java.util.ArrayList<String>(targetLanguageCodes.length));
        }
        for (String ele : targetLanguageCodes) {
            this.targetLanguageCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom terminology file. All possible target
     * languages are returned in array.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language codes for the target languages available with the custom terminology file. All possible
     *        target languages are returned in array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key for the custom terminology.
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     * 
     * @return The encryption key for the custom terminology.
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key for the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the file used when importing a custom terminology.
     */

    public void setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     * 
     * @return The size of the file used when importing a custom terminology.
     */

    public Integer getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the file used when importing a custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withSizeBytes(Integer sizeBytes) {
        setSizeBytes(sizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     * 
     * @param termCount
     *        The number of terms included in the custom terminology.
     */

    public void setTermCount(Integer termCount) {
        this.termCount = termCount;
    }

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     * 
     * @return The number of terms included in the custom terminology.
     */

    public Integer getTermCount() {
        return this.termCount;
    }

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     * 
     * @param termCount
     *        The number of terms included in the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withTermCount(Integer termCount) {
        setTermCount(termCount);
        return this;
    }

    /**
     * <p>
     * The time at which the custom terminology was created, based on the timestamp.
     * </p>
     * 
     * @param createdAt
     *        The time at which the custom terminology was created, based on the timestamp.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was created, based on the timestamp.
     * </p>
     * 
     * @return The time at which the custom terminology was created, based on the timestamp.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was created, based on the timestamp.
     * </p>
     * 
     * @param createdAt
     *        The time at which the custom terminology was created, based on the timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the timestamp.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time at which the custom terminology was last update, based on the timestamp.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the timestamp.
     * </p>
     * 
     * @return The time at which the custom terminology was last update, based on the timestamp.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the timestamp.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time at which the custom terminology was last update, based on the timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyProperties withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: ").append(getTargetLanguageCodes()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getSizeBytes() != null)
            sb.append("SizeBytes: ").append(getSizeBytes()).append(",");
        if (getTermCount() != null)
            sb.append("TermCount: ").append(getTermCount()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyProperties == false)
            return false;
        TerminologyProperties other = (TerminologyProperties) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCodes() == null ^ this.getTargetLanguageCodes() == null)
            return false;
        if (other.getTargetLanguageCodes() != null && other.getTargetLanguageCodes().equals(this.getTargetLanguageCodes()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getSizeBytes() == null ^ this.getSizeBytes() == null)
            return false;
        if (other.getSizeBytes() != null && other.getSizeBytes().equals(this.getSizeBytes()) == false)
            return false;
        if (other.getTermCount() == null ^ this.getTermCount() == null)
            return false;
        if (other.getTermCount() != null && other.getTermCount().equals(this.getTermCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getSizeBytes() == null) ? 0 : getSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getTermCount() == null) ? 0 : getTermCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public TerminologyProperties clone() {
        try {
            return (TerminologyProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TerminologyPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
