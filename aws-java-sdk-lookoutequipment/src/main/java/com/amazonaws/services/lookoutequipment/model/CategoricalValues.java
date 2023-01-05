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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Entity that comprises information on categorical values in data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CategoricalValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoricalValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether there is a potential data issue related to categorical values.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates the number of categories in the data.
     * </p>
     */
    private Integer numberOfCategory;

    /**
     * <p>
     * Indicates whether there is a potential data issue related to categorical values.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to categorical values.
     * @see StatisticalIssueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to categorical values.
     * </p>
     * 
     * @return Indicates whether there is a potential data issue related to categorical values.
     * @see StatisticalIssueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to categorical values.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to categorical values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticalIssueStatus
     */

    public CategoricalValues withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to categorical values.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to categorical values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticalIssueStatus
     */

    public CategoricalValues withStatus(StatisticalIssueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the number of categories in the data.
     * </p>
     * 
     * @param numberOfCategory
     *        Indicates the number of categories in the data.
     */

    public void setNumberOfCategory(Integer numberOfCategory) {
        this.numberOfCategory = numberOfCategory;
    }

    /**
     * <p>
     * Indicates the number of categories in the data.
     * </p>
     * 
     * @return Indicates the number of categories in the data.
     */

    public Integer getNumberOfCategory() {
        return this.numberOfCategory;
    }

    /**
     * <p>
     * Indicates the number of categories in the data.
     * </p>
     * 
     * @param numberOfCategory
     *        Indicates the number of categories in the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoricalValues withNumberOfCategory(Integer numberOfCategory) {
        setNumberOfCategory(numberOfCategory);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNumberOfCategory() != null)
            sb.append("NumberOfCategory: ").append(getNumberOfCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoricalValues == false)
            return false;
        CategoricalValues other = (CategoricalValues) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNumberOfCategory() == null ^ this.getNumberOfCategory() == null)
            return false;
        if (other.getNumberOfCategory() != null && other.getNumberOfCategory().equals(this.getNumberOfCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNumberOfCategory() == null) ? 0 : getNumberOfCategory().hashCode());
        return hashCode;
    }

    @Override
    public CategoricalValues clone() {
        try {
            return (CategoricalValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.CategoricalValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
