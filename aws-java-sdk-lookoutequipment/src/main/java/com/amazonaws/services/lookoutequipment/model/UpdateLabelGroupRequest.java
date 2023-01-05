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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateLabelGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLabelGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the label group to be updated.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * Updates the code indicating the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private java.util.List<String> faultCodes;

    /**
     * <p>
     * The name of the label group to be updated.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group to be updated.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * The name of the label group to be updated.
     * </p>
     * 
     * @return The name of the label group to be updated.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * The name of the label group to be updated.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelGroupRequest withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * Updates the code indicating the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return Updates the code indicating the type of anomaly associated with the label. </p>
     *         <p>
     *         Data in this field will be retained for service usage. Follow best practices for the security of your
     *         data.
     */

    public java.util.List<String> getFaultCodes() {
        return faultCodes;
    }

    /**
     * <p>
     * Updates the code indicating the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param faultCodes
     *        Updates the code indicating the type of anomaly associated with the label. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     */

    public void setFaultCodes(java.util.Collection<String> faultCodes) {
        if (faultCodes == null) {
            this.faultCodes = null;
            return;
        }

        this.faultCodes = new java.util.ArrayList<String>(faultCodes);
    }

    /**
     * <p>
     * Updates the code indicating the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaultCodes(java.util.Collection)} or {@link #withFaultCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faultCodes
     *        Updates the code indicating the type of anomaly associated with the label. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelGroupRequest withFaultCodes(String... faultCodes) {
        if (this.faultCodes == null) {
            setFaultCodes(new java.util.ArrayList<String>(faultCodes.length));
        }
        for (String ele : faultCodes) {
            this.faultCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Updates the code indicating the type of anomaly associated with the label.
     * </p>
     * <p>
     * Data in this field will be retained for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param faultCodes
     *        Updates the code indicating the type of anomaly associated with the label. </p>
     *        <p>
     *        Data in this field will be retained for service usage. Follow best practices for the security of your
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLabelGroupRequest withFaultCodes(java.util.Collection<String> faultCodes) {
        setFaultCodes(faultCodes);
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
        if (getLabelGroupName() != null)
            sb.append("LabelGroupName: ").append(getLabelGroupName()).append(",");
        if (getFaultCodes() != null)
            sb.append("FaultCodes: ").append(getFaultCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLabelGroupRequest == false)
            return false;
        UpdateLabelGroupRequest other = (UpdateLabelGroupRequest) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        if (other.getFaultCodes() == null ^ this.getFaultCodes() == null)
            return false;
        if (other.getFaultCodes() != null && other.getFaultCodes().equals(this.getFaultCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        hashCode = prime * hashCode + ((getFaultCodes() == null) ? 0 : getFaultCodes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLabelGroupRequest clone() {
        return (UpdateLabelGroupRequest) super.clone();
    }

}
