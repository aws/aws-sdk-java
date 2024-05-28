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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the reason for an activity that isn't scaled (<i>not scaled activity</i>), in machine-readable format. For
 * help interpreting the not scaled reason details, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scaling-activities.html"
 * >Scaling activities for Application Auto Scaling</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/NotScaledReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotScaledReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code that represents the reason for not scaling.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoScalingAnticipatedFlapping
     * </p>
     * </li>
     * <li>
     * <p>
     * TargetServicePutResourceAsUnscalable
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMaxCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMinCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtDesiredCapacity
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * The maximum capacity.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The minimum capacity.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The current capacity.
     * </p>
     */
    private Integer currentCapacity;

    /**
     * <p>
     * A code that represents the reason for not scaling.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoScalingAnticipatedFlapping
     * </p>
     * </li>
     * <li>
     * <p>
     * TargetServicePutResourceAsUnscalable
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMaxCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMinCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtDesiredCapacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        A code that represents the reason for not scaling.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AutoScalingAnticipatedFlapping
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TargetServicePutResourceAsUnscalable
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AlreadyAtMaxCapacity
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AlreadyAtMinCapacity
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AlreadyAtDesiredCapacity
     *        </p>
     *        </li>
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A code that represents the reason for not scaling.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoScalingAnticipatedFlapping
     * </p>
     * </li>
     * <li>
     * <p>
     * TargetServicePutResourceAsUnscalable
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMaxCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMinCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtDesiredCapacity
     * </p>
     * </li>
     * </ul>
     * 
     * @return A code that represents the reason for not scaling.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AutoScalingAnticipatedFlapping
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TargetServicePutResourceAsUnscalable
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AlreadyAtMaxCapacity
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AlreadyAtMinCapacity
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AlreadyAtDesiredCapacity
     *         </p>
     *         </li>
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A code that represents the reason for not scaling.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AutoScalingAnticipatedFlapping
     * </p>
     * </li>
     * <li>
     * <p>
     * TargetServicePutResourceAsUnscalable
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMaxCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtMinCapacity
     * </p>
     * </li>
     * <li>
     * <p>
     * AlreadyAtDesiredCapacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        A code that represents the reason for not scaling.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AutoScalingAnticipatedFlapping
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TargetServicePutResourceAsUnscalable
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AlreadyAtMaxCapacity
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AlreadyAtMinCapacity
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AlreadyAtDesiredCapacity
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotScaledReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The maximum capacity.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity.
     * </p>
     * 
     * @return The maximum capacity.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotScaledReason withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * 
     * @return The minimum capacity.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum capacity.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotScaledReason withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The current capacity.
     * </p>
     * 
     * @param currentCapacity
     *        The current capacity.
     */

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    /**
     * <p>
     * The current capacity.
     * </p>
     * 
     * @return The current capacity.
     */

    public Integer getCurrentCapacity() {
        return this.currentCapacity;
    }

    /**
     * <p>
     * The current capacity.
     * </p>
     * 
     * @param currentCapacity
     *        The current capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotScaledReason withCurrentCapacity(Integer currentCapacity) {
        setCurrentCapacity(currentCapacity);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getCurrentCapacity() != null)
            sb.append("CurrentCapacity: ").append(getCurrentCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotScaledReason == false)
            return false;
        NotScaledReason other = (NotScaledReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getCurrentCapacity() == null ^ this.getCurrentCapacity() == null)
            return false;
        if (other.getCurrentCapacity() != null && other.getCurrentCapacity().equals(this.getCurrentCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getCurrentCapacity() == null) ? 0 : getCurrentCapacity().hashCode());
        return hashCode;
    }

    @Override
    public NotScaledReason clone() {
        try {
            return (NotScaledReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.NotScaledReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
