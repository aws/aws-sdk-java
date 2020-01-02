/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DescribeCostCategoryDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCostCategoryDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private CostCategory costCategory;

    /**
     * @param costCategory
     */

    public void setCostCategory(CostCategory costCategory) {
        this.costCategory = costCategory;
    }

    /**
     * @return
     */

    public CostCategory getCostCategory() {
        return this.costCategory;
    }

    /**
     * @param costCategory
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCostCategoryDefinitionResult withCostCategory(CostCategory costCategory) {
        setCostCategory(costCategory);
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
        if (getCostCategory() != null)
            sb.append("CostCategory: ").append(getCostCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCostCategoryDefinitionResult == false)
            return false;
        DescribeCostCategoryDefinitionResult other = (DescribeCostCategoryDefinitionResult) obj;
        if (other.getCostCategory() == null ^ this.getCostCategory() == null)
            return false;
        if (other.getCostCategory() != null && other.getCostCategory().equals(this.getCostCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCostCategory() == null) ? 0 : getCostCategory().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCostCategoryDefinitionResult clone() {
        try {
            return (DescribeCostCategoryDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
