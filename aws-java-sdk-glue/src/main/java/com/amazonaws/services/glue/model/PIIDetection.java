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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a transform that identifies, removes or masks PII data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PIIDetection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PIIDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Indicates the type of PIIDetection transform.
     * </p>
     */
    private String piiType;
    /**
     * <p>
     * Indicates the types of entities the PIIDetection transform will identify as PII data.
     * </p>
     * <p>
     * PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     * BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * </p>
     */
    private java.util.List<String> entityTypesToDetect;
    /**
     * <p>
     * Indicates the output column name that will contain any entity type detected in that row.
     * </p>
     */
    private String outputColumnName;
    /**
     * <p>
     * Indicates the fraction of the data to sample when scanning for PII entities.
     * </p>
     */
    private Double sampleFraction;
    /**
     * <p>
     * Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     * </p>
     */
    private Double thresholdFraction;
    /**
     * <p>
     * Indicates the value that will replace the detected entity.
     * </p>
     */
    private String maskValue;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * 
     * @return The node ID inputs to the transform.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * 
     * @param inputs
     *        The node ID inputs to the transform.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The node ID inputs to the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * 
     * @param inputs
     *        The node ID inputs to the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Indicates the type of PIIDetection transform.
     * </p>
     * 
     * @param piiType
     *        Indicates the type of PIIDetection transform.
     * @see PiiType
     */

    public void setPiiType(String piiType) {
        this.piiType = piiType;
    }

    /**
     * <p>
     * Indicates the type of PIIDetection transform.
     * </p>
     * 
     * @return Indicates the type of PIIDetection transform.
     * @see PiiType
     */

    public String getPiiType() {
        return this.piiType;
    }

    /**
     * <p>
     * Indicates the type of PIIDetection transform.
     * </p>
     * 
     * @param piiType
     *        Indicates the type of PIIDetection transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiType
     */

    public PIIDetection withPiiType(String piiType) {
        setPiiType(piiType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of PIIDetection transform.
     * </p>
     * 
     * @param piiType
     *        Indicates the type of PIIDetection transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiType
     */

    public PIIDetection withPiiType(PiiType piiType) {
        this.piiType = piiType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the types of entities the PIIDetection transform will identify as PII data.
     * </p>
     * <p>
     * PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     * BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * </p>
     * 
     * @return Indicates the types of entities the PIIDetection transform will identify as PII data. </p>
     *         <p>
     *         PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER,
     *         PHONE_NUMBER, BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE,
     *         USA_NATIONAL_DRUG_CODE, USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     *         USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD
     *         ,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     */

    public java.util.List<String> getEntityTypesToDetect() {
        return entityTypesToDetect;
    }

    /**
     * <p>
     * Indicates the types of entities the PIIDetection transform will identify as PII data.
     * </p>
     * <p>
     * PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     * BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * </p>
     * 
     * @param entityTypesToDetect
     *        Indicates the types of entities the PIIDetection transform will identify as PII data. </p>
     *        <p>
     *        PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     *        BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     *        USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     *        USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER
     *        ,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     */

    public void setEntityTypesToDetect(java.util.Collection<String> entityTypesToDetect) {
        if (entityTypesToDetect == null) {
            this.entityTypesToDetect = null;
            return;
        }

        this.entityTypesToDetect = new java.util.ArrayList<String>(entityTypesToDetect);
    }

    /**
     * <p>
     * Indicates the types of entities the PIIDetection transform will identify as PII data.
     * </p>
     * <p>
     * PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     * BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypesToDetect(java.util.Collection)} or {@link #withEntityTypesToDetect(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param entityTypesToDetect
     *        Indicates the types of entities the PIIDetection transform will identify as PII data. </p>
     *        <p>
     *        PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     *        BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     *        USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     *        USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER
     *        ,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withEntityTypesToDetect(String... entityTypesToDetect) {
        if (this.entityTypesToDetect == null) {
            setEntityTypesToDetect(new java.util.ArrayList<String>(entityTypesToDetect.length));
        }
        for (String ele : entityTypesToDetect) {
            this.entityTypesToDetect.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the types of entities the PIIDetection transform will identify as PII data.
     * </p>
     * <p>
     * PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     * BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     * USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     * USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * </p>
     * 
     * @param entityTypesToDetect
     *        Indicates the types of entities the PIIDetection transform will identify as PII data. </p>
     *        <p>
     *        PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER,
     *        BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE,
     *        USA_MEDICARE_BENEFICIARY_IDENTIFIER,
     *        USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER
     *        ,USA_DEA_NUMBER,USA_DRIVING_LICENSE
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withEntityTypesToDetect(java.util.Collection<String> entityTypesToDetect) {
        setEntityTypesToDetect(entityTypesToDetect);
        return this;
    }

    /**
     * <p>
     * Indicates the output column name that will contain any entity type detected in that row.
     * </p>
     * 
     * @param outputColumnName
     *        Indicates the output column name that will contain any entity type detected in that row.
     */

    public void setOutputColumnName(String outputColumnName) {
        this.outputColumnName = outputColumnName;
    }

    /**
     * <p>
     * Indicates the output column name that will contain any entity type detected in that row.
     * </p>
     * 
     * @return Indicates the output column name that will contain any entity type detected in that row.
     */

    public String getOutputColumnName() {
        return this.outputColumnName;
    }

    /**
     * <p>
     * Indicates the output column name that will contain any entity type detected in that row.
     * </p>
     * 
     * @param outputColumnName
     *        Indicates the output column name that will contain any entity type detected in that row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withOutputColumnName(String outputColumnName) {
        setOutputColumnName(outputColumnName);
        return this;
    }

    /**
     * <p>
     * Indicates the fraction of the data to sample when scanning for PII entities.
     * </p>
     * 
     * @param sampleFraction
     *        Indicates the fraction of the data to sample when scanning for PII entities.
     */

    public void setSampleFraction(Double sampleFraction) {
        this.sampleFraction = sampleFraction;
    }

    /**
     * <p>
     * Indicates the fraction of the data to sample when scanning for PII entities.
     * </p>
     * 
     * @return Indicates the fraction of the data to sample when scanning for PII entities.
     */

    public Double getSampleFraction() {
        return this.sampleFraction;
    }

    /**
     * <p>
     * Indicates the fraction of the data to sample when scanning for PII entities.
     * </p>
     * 
     * @param sampleFraction
     *        Indicates the fraction of the data to sample when scanning for PII entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withSampleFraction(Double sampleFraction) {
        setSampleFraction(sampleFraction);
        return this;
    }

    /**
     * <p>
     * Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     * </p>
     * 
     * @param thresholdFraction
     *        Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     */

    public void setThresholdFraction(Double thresholdFraction) {
        this.thresholdFraction = thresholdFraction;
    }

    /**
     * <p>
     * Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     * </p>
     * 
     * @return Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     */

    public Double getThresholdFraction() {
        return this.thresholdFraction;
    }

    /**
     * <p>
     * Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     * </p>
     * 
     * @param thresholdFraction
     *        Indicates the fraction of the data that must be met in order for a column to be identified as PII data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withThresholdFraction(Double thresholdFraction) {
        setThresholdFraction(thresholdFraction);
        return this;
    }

    /**
     * <p>
     * Indicates the value that will replace the detected entity.
     * </p>
     * 
     * @param maskValue
     *        Indicates the value that will replace the detected entity.
     */

    public void setMaskValue(String maskValue) {
        this.maskValue = maskValue;
    }

    /**
     * <p>
     * Indicates the value that will replace the detected entity.
     * </p>
     * 
     * @return Indicates the value that will replace the detected entity.
     */

    public String getMaskValue() {
        return this.maskValue;
    }

    /**
     * <p>
     * Indicates the value that will replace the detected entity.
     * </p>
     * 
     * @param maskValue
     *        Indicates the value that will replace the detected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PIIDetection withMaskValue(String maskValue) {
        setMaskValue(maskValue);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getPiiType() != null)
            sb.append("PiiType: ").append(getPiiType()).append(",");
        if (getEntityTypesToDetect() != null)
            sb.append("EntityTypesToDetect: ").append(getEntityTypesToDetect()).append(",");
        if (getOutputColumnName() != null)
            sb.append("OutputColumnName: ").append(getOutputColumnName()).append(",");
        if (getSampleFraction() != null)
            sb.append("SampleFraction: ").append(getSampleFraction()).append(",");
        if (getThresholdFraction() != null)
            sb.append("ThresholdFraction: ").append(getThresholdFraction()).append(",");
        if (getMaskValue() != null)
            sb.append("MaskValue: ").append(getMaskValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PIIDetection == false)
            return false;
        PIIDetection other = (PIIDetection) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getPiiType() == null ^ this.getPiiType() == null)
            return false;
        if (other.getPiiType() != null && other.getPiiType().equals(this.getPiiType()) == false)
            return false;
        if (other.getEntityTypesToDetect() == null ^ this.getEntityTypesToDetect() == null)
            return false;
        if (other.getEntityTypesToDetect() != null && other.getEntityTypesToDetect().equals(this.getEntityTypesToDetect()) == false)
            return false;
        if (other.getOutputColumnName() == null ^ this.getOutputColumnName() == null)
            return false;
        if (other.getOutputColumnName() != null && other.getOutputColumnName().equals(this.getOutputColumnName()) == false)
            return false;
        if (other.getSampleFraction() == null ^ this.getSampleFraction() == null)
            return false;
        if (other.getSampleFraction() != null && other.getSampleFraction().equals(this.getSampleFraction()) == false)
            return false;
        if (other.getThresholdFraction() == null ^ this.getThresholdFraction() == null)
            return false;
        if (other.getThresholdFraction() != null && other.getThresholdFraction().equals(this.getThresholdFraction()) == false)
            return false;
        if (other.getMaskValue() == null ^ this.getMaskValue() == null)
            return false;
        if (other.getMaskValue() != null && other.getMaskValue().equals(this.getMaskValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getPiiType() == null) ? 0 : getPiiType().hashCode());
        hashCode = prime * hashCode + ((getEntityTypesToDetect() == null) ? 0 : getEntityTypesToDetect().hashCode());
        hashCode = prime * hashCode + ((getOutputColumnName() == null) ? 0 : getOutputColumnName().hashCode());
        hashCode = prime * hashCode + ((getSampleFraction() == null) ? 0 : getSampleFraction().hashCode());
        hashCode = prime * hashCode + ((getThresholdFraction() == null) ? 0 : getThresholdFraction().hashCode());
        hashCode = prime * hashCode + ((getMaskValue() == null) ? 0 : getMaskValue().hashCode());
        return hashCode;
    }

    @Override
    public PIIDetection clone() {
        try {
            return (PIIDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PIIDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
