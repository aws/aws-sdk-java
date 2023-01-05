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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeLabel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLabelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the name of the group containing the label.
     * </p>
     */
    private String labelGroupName;
    /**
     * <p>
     * Returns the ID of the label.
     * </p>
     */
    private String labelId;

    /**
     * <p>
     * Returns the name of the group containing the label.
     * </p>
     * 
     * @param labelGroupName
     *        Returns the name of the group containing the label.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * Returns the name of the group containing the label.
     * </p>
     * 
     * @return Returns the name of the group containing the label.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * Returns the name of the group containing the label.
     * </p>
     * 
     * @param labelGroupName
     *        Returns the name of the group containing the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelRequest withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
        return this;
    }

    /**
     * <p>
     * Returns the ID of the label.
     * </p>
     * 
     * @param labelId
     *        Returns the ID of the label.
     */

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    /**
     * <p>
     * Returns the ID of the label.
     * </p>
     * 
     * @return Returns the ID of the label.
     */

    public String getLabelId() {
        return this.labelId;
    }

    /**
     * <p>
     * Returns the ID of the label.
     * </p>
     * 
     * @param labelId
     *        Returns the ID of the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelRequest withLabelId(String labelId) {
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

        if (obj instanceof DescribeLabelRequest == false)
            return false;
        DescribeLabelRequest other = (DescribeLabelRequest) obj;
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
    public DescribeLabelRequest clone() {
        return (DescribeLabelRequest) super.clone();
    }

}
