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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The budget action to add.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BudgetActionToAdd" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetActionToAdd implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description for the budget action to add.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The percentage threshold for the budget action to add.
     * </p>
     */
    private Float thresholdPercentage;
    /**
     * <p>
     * The type of budget action to add.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A description for the budget action to add.
     * </p>
     * 
     * @param description
     *        A description for the budget action to add.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the budget action to add.
     * </p>
     * 
     * @return A description for the budget action to add.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the budget action to add.
     * </p>
     * 
     * @param description
     *        A description for the budget action to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetActionToAdd withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The percentage threshold for the budget action to add.
     * </p>
     * 
     * @param thresholdPercentage
     *        The percentage threshold for the budget action to add.
     */

    public void setThresholdPercentage(Float thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * <p>
     * The percentage threshold for the budget action to add.
     * </p>
     * 
     * @return The percentage threshold for the budget action to add.
     */

    public Float getThresholdPercentage() {
        return this.thresholdPercentage;
    }

    /**
     * <p>
     * The percentage threshold for the budget action to add.
     * </p>
     * 
     * @param thresholdPercentage
     *        The percentage threshold for the budget action to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetActionToAdd withThresholdPercentage(Float thresholdPercentage) {
        setThresholdPercentage(thresholdPercentage);
        return this;
    }

    /**
     * <p>
     * The type of budget action to add.
     * </p>
     * 
     * @param type
     *        The type of budget action to add.
     * @see BudgetActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of budget action to add.
     * </p>
     * 
     * @return The type of budget action to add.
     * @see BudgetActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of budget action to add.
     * </p>
     * 
     * @param type
     *        The type of budget action to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetActionType
     */

    public BudgetActionToAdd withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of budget action to add.
     * </p>
     * 
     * @param type
     *        The type of budget action to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BudgetActionType
     */

    public BudgetActionToAdd withType(BudgetActionType type) {
        this.type = type.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getThresholdPercentage() != null)
            sb.append("ThresholdPercentage: ").append(getThresholdPercentage()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BudgetActionToAdd == false)
            return false;
        BudgetActionToAdd other = (BudgetActionToAdd) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getThresholdPercentage() == null ^ this.getThresholdPercentage() == null)
            return false;
        if (other.getThresholdPercentage() != null && other.getThresholdPercentage().equals(this.getThresholdPercentage()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getThresholdPercentage() == null) ? 0 : getThresholdPercentage().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public BudgetActionToAdd clone() {
        try {
            return (BudgetActionToAdd) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.BudgetActionToAddMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
