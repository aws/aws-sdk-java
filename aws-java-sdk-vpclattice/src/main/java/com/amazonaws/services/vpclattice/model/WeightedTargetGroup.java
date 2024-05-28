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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the weight of a target group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/WeightedTargetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeightedTargetGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupIdentifier;
    /**
     * <p>
     * Only required if you specify multiple target groups for a forward action. The weight determines how requests are
     * distributed to the target group. For example, if you specify two target groups, each with a weight of 10, each
     * target group receives half the requests. If you specify two target groups, one with a weight of 10 and the other
     * with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target
     * group. If there's only one target group specified, then the default value is 100.
     * </p>
     */
    private Integer weight;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupIdentifier
     *        The ID or Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupIdentifier(String targetGroupIdentifier) {
        this.targetGroupIdentifier = targetGroupIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupIdentifier() {
        return this.targetGroupIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupIdentifier
     *        The ID or Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeightedTargetGroup withTargetGroupIdentifier(String targetGroupIdentifier) {
        setTargetGroupIdentifier(targetGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * Only required if you specify multiple target groups for a forward action. The weight determines how requests are
     * distributed to the target group. For example, if you specify two target groups, each with a weight of 10, each
     * target group receives half the requests. If you specify two target groups, one with a weight of 10 and the other
     * with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target
     * group. If there's only one target group specified, then the default value is 100.
     * </p>
     * 
     * @param weight
     *        Only required if you specify multiple target groups for a forward action. The weight determines how
     *        requests are distributed to the target group. For example, if you specify two target groups, each with a
     *        weight of 10, each target group receives half the requests. If you specify two target groups, one with a
     *        weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as
     *        many requests as the other target group. If there's only one target group specified, then the default
     *        value is 100.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * Only required if you specify multiple target groups for a forward action. The weight determines how requests are
     * distributed to the target group. For example, if you specify two target groups, each with a weight of 10, each
     * target group receives half the requests. If you specify two target groups, one with a weight of 10 and the other
     * with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target
     * group. If there's only one target group specified, then the default value is 100.
     * </p>
     * 
     * @return Only required if you specify multiple target groups for a forward action. The weight determines how
     *         requests are distributed to the target group. For example, if you specify two target groups, each with a
     *         weight of 10, each target group receives half the requests. If you specify two target groups, one with a
     *         weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as
     *         many requests as the other target group. If there's only one target group specified, then the default
     *         value is 100.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * Only required if you specify multiple target groups for a forward action. The weight determines how requests are
     * distributed to the target group. For example, if you specify two target groups, each with a weight of 10, each
     * target group receives half the requests. If you specify two target groups, one with a weight of 10 and the other
     * with a weight of 20, the target group with a weight of 20 receives twice as many requests as the other target
     * group. If there's only one target group specified, then the default value is 100.
     * </p>
     * 
     * @param weight
     *        Only required if you specify multiple target groups for a forward action. The weight determines how
     *        requests are distributed to the target group. For example, if you specify two target groups, each with a
     *        weight of 10, each target group receives half the requests. If you specify two target groups, one with a
     *        weight of 10 and the other with a weight of 20, the target group with a weight of 20 receives twice as
     *        many requests as the other target group. If there's only one target group specified, then the default
     *        value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeightedTargetGroup withWeight(Integer weight) {
        setWeight(weight);
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
        if (getTargetGroupIdentifier() != null)
            sb.append("TargetGroupIdentifier: ").append(getTargetGroupIdentifier()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeightedTargetGroup == false)
            return false;
        WeightedTargetGroup other = (WeightedTargetGroup) obj;
        if (other.getTargetGroupIdentifier() == null ^ this.getTargetGroupIdentifier() == null)
            return false;
        if (other.getTargetGroupIdentifier() != null && other.getTargetGroupIdentifier().equals(this.getTargetGroupIdentifier()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupIdentifier() == null) ? 0 : getTargetGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public WeightedTargetGroup clone() {
        try {
            return (WeightedTargetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.WeightedTargetGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
