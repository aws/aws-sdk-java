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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies summary attributes to return from a call to <a>DetectProtectiveEquipment</a>. You can specify which types
 * of PPE to summarize. You can also specify a minimum confidence value for detections. Summary information is returned
 * in the <code>Summary</code> (<a>ProtectiveEquipmentSummary</a>) field of the response from
 * <code>DetectProtectiveEquipment</code>. The summary includes which persons in an image were detected wearing the
 * requested types of person protective equipment (PPE), which persons were detected as not wearing PPE, and the persons
 * in which a determination could not be made. For more information, see <a>ProtectiveEquipmentSummary</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectiveEquipmentSummarizationAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum confidence level for which you want summary information. The confidence level applies to person
     * detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition doesn't return
     * summary information with a confidence than this specified value. There isn't a default value.
     * </p>
     * <p>
     * Specify a <code>MinConfidence</code> value that is between 50-100% as <code>DetectProtectiveEquipment</code>
     * returns predictions only where the detection confidence is between 50% - 100%. If you specify a value that is
     * less than 50%, the results are the same specifying a value of 50%.
     * </p>
     * <p>
     * </p>
     */
    private Float minConfidence;
    /**
     * <p>
     * An array of personal protective equipment types for which you want summary information. If a person is detected
     * wearing a required requipment type, the person's ID is added to the <code>PersonsWithRequiredEquipment</code>
     * array field returned in <a>ProtectiveEquipmentSummary</a> by <code>DetectProtectiveEquipment</code>.
     * </p>
     */
    private java.util.List<String> requiredEquipmentTypes;

    /**
     * <p>
     * The minimum confidence level for which you want summary information. The confidence level applies to person
     * detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition doesn't return
     * summary information with a confidence than this specified value. There isn't a default value.
     * </p>
     * <p>
     * Specify a <code>MinConfidence</code> value that is between 50-100% as <code>DetectProtectiveEquipment</code>
     * returns predictions only where the detection confidence is between 50% - 100%. If you specify a value that is
     * less than 50%, the results are the same specifying a value of 50%.
     * </p>
     * <p>
     * </p>
     * 
     * @param minConfidence
     *        The minimum confidence level for which you want summary information. The confidence level applies to
     *        person detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition
     *        doesn't return summary information with a confidence than this specified value. There isn't a default
     *        value.</p>
     *        <p>
     *        Specify a <code>MinConfidence</code> value that is between 50-100% as
     *        <code>DetectProtectiveEquipment</code> returns predictions only where the detection confidence is between
     *        50% - 100%. If you specify a value that is less than 50%, the results are the same specifying a value of
     *        50%.
     *        </p>
     *        <p>
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * The minimum confidence level for which you want summary information. The confidence level applies to person
     * detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition doesn't return
     * summary information with a confidence than this specified value. There isn't a default value.
     * </p>
     * <p>
     * Specify a <code>MinConfidence</code> value that is between 50-100% as <code>DetectProtectiveEquipment</code>
     * returns predictions only where the detection confidence is between 50% - 100%. If you specify a value that is
     * less than 50%, the results are the same specifying a value of 50%.
     * </p>
     * <p>
     * </p>
     * 
     * @return The minimum confidence level for which you want summary information. The confidence level applies to
     *         person detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition
     *         doesn't return summary information with a confidence than this specified value. There isn't a default
     *         value.</p>
     *         <p>
     *         Specify a <code>MinConfidence</code> value that is between 50-100% as
     *         <code>DetectProtectiveEquipment</code> returns predictions only where the detection confidence is between
     *         50% - 100%. If you specify a value that is less than 50%, the results are the same specifying a value of
     *         50%.
     *         </p>
     *         <p>
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * The minimum confidence level for which you want summary information. The confidence level applies to person
     * detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition doesn't return
     * summary information with a confidence than this specified value. There isn't a default value.
     * </p>
     * <p>
     * Specify a <code>MinConfidence</code> value that is between 50-100% as <code>DetectProtectiveEquipment</code>
     * returns predictions only where the detection confidence is between 50% - 100%. If you specify a value that is
     * less than 50%, the results are the same specifying a value of 50%.
     * </p>
     * <p>
     * </p>
     * 
     * @param minConfidence
     *        The minimum confidence level for which you want summary information. The confidence level applies to
     *        person detection, body part detection, equipment detection, and body part coverage. Amazon Rekognition
     *        doesn't return summary information with a confidence than this specified value. There isn't a default
     *        value.</p>
     *        <p>
     *        Specify a <code>MinConfidence</code> value that is between 50-100% as
     *        <code>DetectProtectiveEquipment</code> returns predictions only where the detection confidence is between
     *        50% - 100%. If you specify a value that is less than 50%, the results are the same specifying a value of
     *        50%.
     *        </p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummarizationAttributes withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
        return this;
    }

    /**
     * <p>
     * An array of personal protective equipment types for which you want summary information. If a person is detected
     * wearing a required requipment type, the person's ID is added to the <code>PersonsWithRequiredEquipment</code>
     * array field returned in <a>ProtectiveEquipmentSummary</a> by <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @return An array of personal protective equipment types for which you want summary information. If a person is
     *         detected wearing a required requipment type, the person's ID is added to the
     *         <code>PersonsWithRequiredEquipment</code> array field returned in <a>ProtectiveEquipmentSummary</a> by
     *         <code>DetectProtectiveEquipment</code>.
     * @see ProtectiveEquipmentType
     */

    public java.util.List<String> getRequiredEquipmentTypes() {
        return requiredEquipmentTypes;
    }

    /**
     * <p>
     * An array of personal protective equipment types for which you want summary information. If a person is detected
     * wearing a required requipment type, the person's ID is added to the <code>PersonsWithRequiredEquipment</code>
     * array field returned in <a>ProtectiveEquipmentSummary</a> by <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @param requiredEquipmentTypes
     *        An array of personal protective equipment types for which you want summary information. If a person is
     *        detected wearing a required requipment type, the person's ID is added to the
     *        <code>PersonsWithRequiredEquipment</code> array field returned in <a>ProtectiveEquipmentSummary</a> by
     *        <code>DetectProtectiveEquipment</code>.
     * @see ProtectiveEquipmentType
     */

    public void setRequiredEquipmentTypes(java.util.Collection<String> requiredEquipmentTypes) {
        if (requiredEquipmentTypes == null) {
            this.requiredEquipmentTypes = null;
            return;
        }

        this.requiredEquipmentTypes = new java.util.ArrayList<String>(requiredEquipmentTypes);
    }

    /**
     * <p>
     * An array of personal protective equipment types for which you want summary information. If a person is detected
     * wearing a required requipment type, the person's ID is added to the <code>PersonsWithRequiredEquipment</code>
     * array field returned in <a>ProtectiveEquipmentSummary</a> by <code>DetectProtectiveEquipment</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredEquipmentTypes(java.util.Collection)} or
     * {@link #withRequiredEquipmentTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiredEquipmentTypes
     *        An array of personal protective equipment types for which you want summary information. If a person is
     *        detected wearing a required requipment type, the person's ID is added to the
     *        <code>PersonsWithRequiredEquipment</code> array field returned in <a>ProtectiveEquipmentSummary</a> by
     *        <code>DetectProtectiveEquipment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectiveEquipmentType
     */

    public ProtectiveEquipmentSummarizationAttributes withRequiredEquipmentTypes(String... requiredEquipmentTypes) {
        if (this.requiredEquipmentTypes == null) {
            setRequiredEquipmentTypes(new java.util.ArrayList<String>(requiredEquipmentTypes.length));
        }
        for (String ele : requiredEquipmentTypes) {
            this.requiredEquipmentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of personal protective equipment types for which you want summary information. If a person is detected
     * wearing a required requipment type, the person's ID is added to the <code>PersonsWithRequiredEquipment</code>
     * array field returned in <a>ProtectiveEquipmentSummary</a> by <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @param requiredEquipmentTypes
     *        An array of personal protective equipment types for which you want summary information. If a person is
     *        detected wearing a required requipment type, the person's ID is added to the
     *        <code>PersonsWithRequiredEquipment</code> array field returned in <a>ProtectiveEquipmentSummary</a> by
     *        <code>DetectProtectiveEquipment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectiveEquipmentType
     */

    public ProtectiveEquipmentSummarizationAttributes withRequiredEquipmentTypes(java.util.Collection<String> requiredEquipmentTypes) {
        setRequiredEquipmentTypes(requiredEquipmentTypes);
        return this;
    }

    /**
     * <p>
     * An array of personal protective equipment types for which you want summary information. If a person is detected
     * wearing a required requipment type, the person's ID is added to the <code>PersonsWithRequiredEquipment</code>
     * array field returned in <a>ProtectiveEquipmentSummary</a> by <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @param requiredEquipmentTypes
     *        An array of personal protective equipment types for which you want summary information. If a person is
     *        detected wearing a required requipment type, the person's ID is added to the
     *        <code>PersonsWithRequiredEquipment</code> array field returned in <a>ProtectiveEquipmentSummary</a> by
     *        <code>DetectProtectiveEquipment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectiveEquipmentType
     */

    public ProtectiveEquipmentSummarizationAttributes withRequiredEquipmentTypes(ProtectiveEquipmentType... requiredEquipmentTypes) {
        java.util.ArrayList<String> requiredEquipmentTypesCopy = new java.util.ArrayList<String>(requiredEquipmentTypes.length);
        for (ProtectiveEquipmentType value : requiredEquipmentTypes) {
            requiredEquipmentTypesCopy.add(value.toString());
        }
        if (getRequiredEquipmentTypes() == null) {
            setRequiredEquipmentTypes(requiredEquipmentTypesCopy);
        } else {
            getRequiredEquipmentTypes().addAll(requiredEquipmentTypesCopy);
        }
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence()).append(",");
        if (getRequiredEquipmentTypes() != null)
            sb.append("RequiredEquipmentTypes: ").append(getRequiredEquipmentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentSummarizationAttributes == false)
            return false;
        ProtectiveEquipmentSummarizationAttributes other = (ProtectiveEquipmentSummarizationAttributes) obj;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        if (other.getRequiredEquipmentTypes() == null ^ this.getRequiredEquipmentTypes() == null)
            return false;
        if (other.getRequiredEquipmentTypes() != null && other.getRequiredEquipmentTypes().equals(this.getRequiredEquipmentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode + ((getRequiredEquipmentTypes() == null) ? 0 : getRequiredEquipmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public ProtectiveEquipmentSummarizationAttributes clone() {
        try {
            return (ProtectiveEquipmentSummarizationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProtectiveEquipmentSummarizationAttributesMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
