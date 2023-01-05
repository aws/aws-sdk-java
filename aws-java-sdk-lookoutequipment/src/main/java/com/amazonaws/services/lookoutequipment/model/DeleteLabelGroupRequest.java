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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteLabelGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLabelGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the label group that you want to delete. Data in this field will be retained for service usage.
     * Follow best practices for the security of your data.
     * </p>
     */
    private String labelGroupName;

    /**
     * <p>
     * The name of the label group that you want to delete. Data in this field will be retained for service usage.
     * Follow best practices for the security of your data.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group that you want to delete. Data in this field will be retained for service
     *        usage. Follow best practices for the security of your data.
     */

    public void setLabelGroupName(String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * <p>
     * The name of the label group that you want to delete. Data in this field will be retained for service usage.
     * Follow best practices for the security of your data.
     * </p>
     * 
     * @return The name of the label group that you want to delete. Data in this field will be retained for service
     *         usage. Follow best practices for the security of your data.
     */

    public String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * <p>
     * The name of the label group that you want to delete. Data in this field will be retained for service usage.
     * Follow best practices for the security of your data.
     * </p>
     * 
     * @param labelGroupName
     *        The name of the label group that you want to delete. Data in this field will be retained for service
     *        usage. Follow best practices for the security of your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLabelGroupRequest withLabelGroupName(String labelGroupName) {
        setLabelGroupName(labelGroupName);
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
            sb.append("LabelGroupName: ").append(getLabelGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLabelGroupRequest == false)
            return false;
        DeleteLabelGroupRequest other = (DeleteLabelGroupRequest) obj;
        if (other.getLabelGroupName() == null ^ this.getLabelGroupName() == null)
            return false;
        if (other.getLabelGroupName() != null && other.getLabelGroupName().equals(this.getLabelGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelGroupName() == null) ? 0 : getLabelGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLabelGroupRequest clone() {
        return (DeleteLabelGroupRequest) super.clone();
    }

}
