/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A range of integer values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/Range" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Range implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     */
    private Integer from;
    /**
     * <p>
     * The maximum value in the range.
     * </p>
     */
    private Integer to;
    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000,
     * the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid
     * value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     * </p>
     */
    private Integer step;

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     * 
     * @param from
     *        The minimum value in the range.
     */

    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     * 
     * @return The minimum value in the range.
     */

    public Integer getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The minimum value in the range.
     * </p>
     * 
     * @param from
     *        The minimum value in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withFrom(Integer from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     * 
     * @param to
     *        The maximum value in the range.
     */

    public void setTo(Integer to) {
        this.to = to;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     * 
     * @return The maximum value in the range.
     */

    public Integer getTo() {
        return this.to;
    }

    /**
     * <p>
     * The maximum value in the range.
     * </p>
     * 
     * @param to
     *        The maximum value in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withTo(Integer to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000,
     * the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid
     * value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     * </p>
     * 
     * @param step
     *        The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of
     *        1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it
     *        isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     */

    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000,
     * the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid
     * value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     * </p>
     * 
     * @return The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of
     *         1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it
     *         isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     */

    public Integer getStep() {
        return this.step;
    }

    /**
     * <p>
     * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000,
     * the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid
     * value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     * </p>
     * 
     * @param step
     *        The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of
     *        1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it
     *        isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Range withStep(Integer step) {
        setStep(step);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo()).append(",");
        if (getStep() != null)
            sb.append("Step: ").append(getStep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Range == false)
            return false;
        Range other = (Range) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getStep() == null ^ this.getStep() == null)
            return false;
        if (other.getStep() != null && other.getStep().equals(this.getStep()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getStep() == null) ? 0 : getStep().hashCode());
        return hashCode;
    }

    @Override
    public Range clone() {
        try {
            return (Range) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
