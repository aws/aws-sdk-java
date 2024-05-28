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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A filter condition that specifies the object age range of included objects in days. Only integers are supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/MatchObjectAge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchObjectAge implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum object age
     * and less than or equal to 2,147,483,647.
     * </p>
     */
    private Integer daysGreaterThan;
    /**
     * <p>
     * Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and less than
     * or equal to 2,147,483,647.
     * </p>
     */
    private Integer daysLessThan;

    /**
     * <p>
     * Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum object age
     * and less than or equal to 2,147,483,647.
     * </p>
     * 
     * @param daysGreaterThan
     *        Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum object
     *        age and less than or equal to 2,147,483,647.
     */

    public void setDaysGreaterThan(Integer daysGreaterThan) {
        this.daysGreaterThan = daysGreaterThan;
    }

    /**
     * <p>
     * Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum object age
     * and less than or equal to 2,147,483,647.
     * </p>
     * 
     * @return Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum
     *         object age and less than or equal to 2,147,483,647.
     */

    public Integer getDaysGreaterThan() {
        return this.daysGreaterThan;
    }

    /**
     * <p>
     * Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum object age
     * and less than or equal to 2,147,483,647.
     * </p>
     * 
     * @param daysGreaterThan
     *        Specifies the maximum object age in days. Must be a positive whole number, greater than the minimum object
     *        age and less than or equal to 2,147,483,647.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchObjectAge withDaysGreaterThan(Integer daysGreaterThan) {
        setDaysGreaterThan(daysGreaterThan);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and less than
     * or equal to 2,147,483,647.
     * </p>
     * 
     * @param daysLessThan
     *        Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and
     *        less than or equal to 2,147,483,647.
     */

    public void setDaysLessThan(Integer daysLessThan) {
        this.daysLessThan = daysLessThan;
    }

    /**
     * <p>
     * Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and less than
     * or equal to 2,147,483,647.
     * </p>
     * 
     * @return Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and
     *         less than or equal to 2,147,483,647.
     */

    public Integer getDaysLessThan() {
        return this.daysLessThan;
    }

    /**
     * <p>
     * Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and less than
     * or equal to 2,147,483,647.
     * </p>
     * 
     * @param daysLessThan
     *        Specifies the minimum object age in days. The value must be a positive whole number, greater than 0 and
     *        less than or equal to 2,147,483,647.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchObjectAge withDaysLessThan(Integer daysLessThan) {
        setDaysLessThan(daysLessThan);
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
        if (getDaysGreaterThan() != null)
            sb.append("DaysGreaterThan: ").append(getDaysGreaterThan()).append(",");
        if (getDaysLessThan() != null)
            sb.append("DaysLessThan: ").append(getDaysLessThan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchObjectAge == false)
            return false;
        MatchObjectAge other = (MatchObjectAge) obj;
        if (other.getDaysGreaterThan() == null ^ this.getDaysGreaterThan() == null)
            return false;
        if (other.getDaysGreaterThan() != null && other.getDaysGreaterThan().equals(this.getDaysGreaterThan()) == false)
            return false;
        if (other.getDaysLessThan() == null ^ this.getDaysLessThan() == null)
            return false;
        if (other.getDaysLessThan() != null && other.getDaysLessThan().equals(this.getDaysLessThan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaysGreaterThan() == null) ? 0 : getDaysGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getDaysLessThan() == null) ? 0 : getDaysLessThan().hashCode());
        return hashCode;
    }

    @Override
    public MatchObjectAge clone() {
        try {
            return (MatchObjectAge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
