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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteLabel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLabelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the label group that contains the label that you want to delete. Data in this field will be retained
     * for service usage. Follow best practices for the security of your data.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * The ID of the label that you want to delete.
     * </p>
     */
    private String labelId;

    /**
     * <p>
     * The name of the label group that contains the label that you want to delete. Data in this field will be retained
     * for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group that contains the label that you want to delete. Data in this field will be
     *        retained for service usage. Follow best practices for the security of your data.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * The name of the label group that contains the label that you want to delete. Data in this field will be retained
     * for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @return The name of the label group that contains the label that you want to delete. Data in this field will be
     *         retained for service usage. Follow best practices for the security of your data.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * The name of the label group that contains the label that you want to delete. Data in this field will be retained
     * for service usage. Follow best practices for the security of your data.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group that contains the label that you want to delete. Data in this field will be
     *        retained for service usage. Follow best practices for the security of your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLabelRequest withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * The ID of the label that you want to delete.
     * </p>
     * 
     * @param labelId
     *        The ID of the label that you want to delete.
     */

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    /**
     * <p>
     * The ID of the label that you want to delete.
     * </p>
     * 
     * @return The ID of the label that you want to delete.
     */

    public String getLabelId() {
        return this.labelId;
    }

    /**
     * <p>
     * The ID of the label that you want to delete.
     * </p>
     * 
     * @param labelId
     *        The ID of the label that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLabelRequest withLabelId(String labelId) {
        setLabelId(labelId);
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
        if (getLabelId() != null)
            sb.append("LabelId: ").append(getLabelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLabelRequest == false)
            return false;
        DeleteLabelRequest other = (DeleteLabelRequest) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        if (other.getLabelId() == null ^ this.getLabelId() == null)
            return false;
        if (other.getLabelId() != null && other.getLabelId().equals(this.getLabelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        hashCode = prime * hashCode + ((getLabelId() == null) ? 0 : getLabelId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLabelRequest clone() {
        return (DeleteLabelRequest) super.clone();
    }

}
