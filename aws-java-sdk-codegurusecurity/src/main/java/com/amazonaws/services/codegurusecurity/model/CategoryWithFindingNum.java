/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a finding category with open findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CategoryWithFindingNum"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryWithFindingNum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the finding category. A finding category is determined by the detector that detected the finding.
     * </p>
     */
    private String categoryName;
    /**
     * <p>
     * The number of open findings in the category.
     * </p>
     */
    private Integer findingNumber;

    /**
     * <p>
     * The name of the finding category. A finding category is determined by the detector that detected the finding.
     * </p>
     * 
     * @param categoryName
     *        The name of the finding category. A finding category is determined by the detector that detected the
     *        finding.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the finding category. A finding category is determined by the detector that detected the finding.
     * </p>
     * 
     * @return The name of the finding category. A finding category is determined by the detector that detected the
     *         finding.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name of the finding category. A finding category is determined by the detector that detected the finding.
     * </p>
     * 
     * @param categoryName
     *        The name of the finding category. A finding category is determined by the detector that detected the
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryWithFindingNum withCategoryName(String categoryName) {
        setCategoryName(categoryName);
        return this;
    }

    /**
     * <p>
     * The number of open findings in the category.
     * </p>
     * 
     * @param findingNumber
     *        The number of open findings in the category.
     */

    public void setFindingNumber(Integer findingNumber) {
        this.findingNumber = findingNumber;
    }

    /**
     * <p>
     * The number of open findings in the category.
     * </p>
     * 
     * @return The number of open findings in the category.
     */

    public Integer getFindingNumber() {
        return this.findingNumber;
    }

    /**
     * <p>
     * The number of open findings in the category.
     * </p>
     * 
     * @param findingNumber
     *        The number of open findings in the category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryWithFindingNum withFindingNumber(Integer findingNumber) {
        setFindingNumber(findingNumber);
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
        if (getCategoryName() != null)
            sb.append("CategoryName: ").append(getCategoryName()).append(",");
        if (getFindingNumber() != null)
            sb.append("FindingNumber: ").append(getFindingNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryWithFindingNum == false)
            return false;
        CategoryWithFindingNum other = (CategoryWithFindingNum) obj;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getFindingNumber() == null ^ this.getFindingNumber() == null)
            return false;
        if (other.getFindingNumber() != null && other.getFindingNumber().equals(this.getFindingNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        hashCode = prime * hashCode + ((getFindingNumber() == null) ? 0 : getFindingNumber().hashCode());
        return hashCode;
    }

    @Override
    public CategoryWithFindingNum clone() {
        try {
            return (CategoryWithFindingNum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.CategoryWithFindingNumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
