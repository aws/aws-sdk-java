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
 * Summary information for required items of personal protective equipment (PPE) detected on persons by a call to
 * <a>DetectProtectiveEquipment</a>. You specify the required type of PPE in the <code>SummarizationAttributes</code>
 * (<a>ProtectiveEquipmentSummarizationAttributes</a>) input parameter. The summary includes which persons were detected
 * wearing the required personal protective equipment (<code>PersonsWithRequiredEquipment</code>), which persons were
 * detected as not wearing the required PPE (<code>PersonsWithoutRequiredEquipment</code>), and the persons in which a
 * determination could not be made (<code>PersonsIndeterminate</code>).
 * </p>
 * <p>
 * To get a total for each category, use the size of the field array. For example, to find out how many people were
 * detected as wearing the specified PPE, use the size of the <code>PersonsWithRequiredEquipment</code> array. If you
 * want to find out more about a person, such as the location (<a>BoundingBox</a>) of the person on the image, use the
 * person ID in each array element. Each person ID matches the ID field of a <a>ProtectiveEquipmentPerson</a> object
 * returned in the <code>Persons</code> array by <code>DetectProtectiveEquipment</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectiveEquipmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective equipment.
     * </p>
     */
    private java.util.List<Integer> personsWithRequiredEquipment;
    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE specified in the
     * <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * </p>
     */
    private java.util.List<Integer> personsWithoutRequiredEquipment;
    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     * equipment.
     * </p>
     */
    private java.util.List<Integer> personsIndeterminate;

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective equipment.
     * </p>
     * 
     * @return An array of IDs for persons who are wearing detected personal protective equipment.
     */

    public java.util.List<Integer> getPersonsWithRequiredEquipment() {
        return personsWithRequiredEquipment;
    }

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective equipment.
     * </p>
     * 
     * @param personsWithRequiredEquipment
     *        An array of IDs for persons who are wearing detected personal protective equipment.
     */

    public void setPersonsWithRequiredEquipment(java.util.Collection<Integer> personsWithRequiredEquipment) {
        if (personsWithRequiredEquipment == null) {
            this.personsWithRequiredEquipment = null;
            return;
        }

        this.personsWithRequiredEquipment = new java.util.ArrayList<Integer>(personsWithRequiredEquipment);
    }

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective equipment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersonsWithRequiredEquipment(java.util.Collection)} or
     * {@link #withPersonsWithRequiredEquipment(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param personsWithRequiredEquipment
     *        An array of IDs for persons who are wearing detected personal protective equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummary withPersonsWithRequiredEquipment(Integer... personsWithRequiredEquipment) {
        if (this.personsWithRequiredEquipment == null) {
            setPersonsWithRequiredEquipment(new java.util.ArrayList<Integer>(personsWithRequiredEquipment.length));
        }
        for (Integer ele : personsWithRequiredEquipment) {
            this.personsWithRequiredEquipment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons who are wearing detected personal protective equipment.
     * </p>
     * 
     * @param personsWithRequiredEquipment
     *        An array of IDs for persons who are wearing detected personal protective equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummary withPersonsWithRequiredEquipment(java.util.Collection<Integer> personsWithRequiredEquipment) {
        setPersonsWithRequiredEquipment(personsWithRequiredEquipment);
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE specified in the
     * <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * </p>
     * 
     * @return An array of IDs for persons who are not wearing all of the types of PPE specified in the
     *         <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     */

    public java.util.List<Integer> getPersonsWithoutRequiredEquipment() {
        return personsWithoutRequiredEquipment;
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE specified in the
     * <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * </p>
     * 
     * @param personsWithoutRequiredEquipment
     *        An array of IDs for persons who are not wearing all of the types of PPE specified in the
     *        <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     */

    public void setPersonsWithoutRequiredEquipment(java.util.Collection<Integer> personsWithoutRequiredEquipment) {
        if (personsWithoutRequiredEquipment == null) {
            this.personsWithoutRequiredEquipment = null;
            return;
        }

        this.personsWithoutRequiredEquipment = new java.util.ArrayList<Integer>(personsWithoutRequiredEquipment);
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE specified in the
     * <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersonsWithoutRequiredEquipment(java.util.Collection)} or
     * {@link #withPersonsWithoutRequiredEquipment(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param personsWithoutRequiredEquipment
     *        An array of IDs for persons who are not wearing all of the types of PPE specified in the
     *        <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummary withPersonsWithoutRequiredEquipment(Integer... personsWithoutRequiredEquipment) {
        if (this.personsWithoutRequiredEquipment == null) {
            setPersonsWithoutRequiredEquipment(new java.util.ArrayList<Integer>(personsWithoutRequiredEquipment.length));
        }
        for (Integer ele : personsWithoutRequiredEquipment) {
            this.personsWithoutRequiredEquipment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons who are not wearing all of the types of PPE specified in the
     * <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * </p>
     * 
     * @param personsWithoutRequiredEquipment
     *        An array of IDs for persons who are not wearing all of the types of PPE specified in the
     *        <code>RequiredEquipmentTypes</code> field of the detected personal protective equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummary withPersonsWithoutRequiredEquipment(java.util.Collection<Integer> personsWithoutRequiredEquipment) {
        setPersonsWithoutRequiredEquipment(personsWithoutRequiredEquipment);
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     * equipment.
     * </p>
     * 
     * @return An array of IDs for persons where it was not possible to determine if they are wearing personal
     *         protective equipment.
     */

    public java.util.List<Integer> getPersonsIndeterminate() {
        return personsIndeterminate;
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     * equipment.
     * </p>
     * 
     * @param personsIndeterminate
     *        An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     *        equipment.
     */

    public void setPersonsIndeterminate(java.util.Collection<Integer> personsIndeterminate) {
        if (personsIndeterminate == null) {
            this.personsIndeterminate = null;
            return;
        }

        this.personsIndeterminate = new java.util.ArrayList<Integer>(personsIndeterminate);
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     * equipment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersonsIndeterminate(java.util.Collection)} or {@link #withPersonsIndeterminate(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param personsIndeterminate
     *        An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     *        equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummary withPersonsIndeterminate(Integer... personsIndeterminate) {
        if (this.personsIndeterminate == null) {
            setPersonsIndeterminate(new java.util.ArrayList<Integer>(personsIndeterminate.length));
        }
        for (Integer ele : personsIndeterminate) {
            this.personsIndeterminate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     * equipment.
     * </p>
     * 
     * @param personsIndeterminate
     *        An array of IDs for persons where it was not possible to determine if they are wearing personal protective
     *        equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentSummary withPersonsIndeterminate(java.util.Collection<Integer> personsIndeterminate) {
        setPersonsIndeterminate(personsIndeterminate);
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
        if (getPersonsWithRequiredEquipment() != null)
            sb.append("PersonsWithRequiredEquipment: ").append(getPersonsWithRequiredEquipment()).append(",");
        if (getPersonsWithoutRequiredEquipment() != null)
            sb.append("PersonsWithoutRequiredEquipment: ").append(getPersonsWithoutRequiredEquipment()).append(",");
        if (getPersonsIndeterminate() != null)
            sb.append("PersonsIndeterminate: ").append(getPersonsIndeterminate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentSummary == false)
            return false;
        ProtectiveEquipmentSummary other = (ProtectiveEquipmentSummary) obj;
        if (other.getPersonsWithRequiredEquipment() == null ^ this.getPersonsWithRequiredEquipment() == null)
            return false;
        if (other.getPersonsWithRequiredEquipment() != null && other.getPersonsWithRequiredEquipment().equals(this.getPersonsWithRequiredEquipment()) == false)
            return false;
        if (other.getPersonsWithoutRequiredEquipment() == null ^ this.getPersonsWithoutRequiredEquipment() == null)
            return false;
        if (other.getPersonsWithoutRequiredEquipment() != null
                && other.getPersonsWithoutRequiredEquipment().equals(this.getPersonsWithoutRequiredEquipment()) == false)
            return false;
        if (other.getPersonsIndeterminate() == null ^ this.getPersonsIndeterminate() == null)
            return false;
        if (other.getPersonsIndeterminate() != null && other.getPersonsIndeterminate().equals(this.getPersonsIndeterminate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPersonsWithRequiredEquipment() == null) ? 0 : getPersonsWithRequiredEquipment().hashCode());
        hashCode = prime * hashCode + ((getPersonsWithoutRequiredEquipment() == null) ? 0 : getPersonsWithoutRequiredEquipment().hashCode());
        hashCode = prime * hashCode + ((getPersonsIndeterminate() == null) ? 0 : getPersonsIndeterminate().hashCode());
        return hashCode;
    }

    @Override
    public ProtectiveEquipmentSummary clone() {
        try {
            return (ProtectiveEquipmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProtectiveEquipmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
