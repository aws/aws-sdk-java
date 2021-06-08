/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the additional objective for the solution, such as maximizing streaming minutes or increasing revenue. For
 * more information see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/optimizing-solution-for-objective.html">Optimizing a
 * solution</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/OptimizationObjective" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptimizationObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numerical metadata column in an Items dataset related to the optimization objective. For example,
     * VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     * </p>
     */
    private String itemAttribute;
    /**
     * <p>
     * Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * </p>
     */
    private String objectiveSensitivity;

    /**
     * <p>
     * The numerical metadata column in an Items dataset related to the optimization objective. For example,
     * VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     * </p>
     * 
     * @param itemAttribute
     *        The numerical metadata column in an Items dataset related to the optimization objective. For example,
     *        VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     */

    public void setItemAttribute(String itemAttribute) {
        this.itemAttribute = itemAttribute;
    }

    /**
     * <p>
     * The numerical metadata column in an Items dataset related to the optimization objective. For example,
     * VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     * </p>
     * 
     * @return The numerical metadata column in an Items dataset related to the optimization objective. For example,
     *         VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     */

    public String getItemAttribute() {
        return this.itemAttribute;
    }

    /**
     * <p>
     * The numerical metadata column in an Items dataset related to the optimization objective. For example,
     * VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     * </p>
     * 
     * @param itemAttribute
     *        The numerical metadata column in an Items dataset related to the optimization objective. For example,
     *        VIDEO_LENGTH (to maximize streaming minutes), or PRICE (to maximize revenue).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptimizationObjective withItemAttribute(String itemAttribute) {
        setItemAttribute(itemAttribute);
        return this;
    }

    /**
     * <p>
     * Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * </p>
     * 
     * @param objectiveSensitivity
     *        Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * @see ObjectiveSensitivity
     */

    public void setObjectiveSensitivity(String objectiveSensitivity) {
        this.objectiveSensitivity = objectiveSensitivity;
    }

    /**
     * <p>
     * Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * </p>
     * 
     * @return Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * @see ObjectiveSensitivity
     */

    public String getObjectiveSensitivity() {
        return this.objectiveSensitivity;
    }

    /**
     * <p>
     * Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * </p>
     * 
     * @param objectiveSensitivity
     *        Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectiveSensitivity
     */

    public OptimizationObjective withObjectiveSensitivity(String objectiveSensitivity) {
        setObjectiveSensitivity(objectiveSensitivity);
        return this;
    }

    /**
     * <p>
     * Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * </p>
     * 
     * @param objectiveSensitivity
     *        Specifies how Amazon Personalize balances the importance of your optimization objective versus relevance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectiveSensitivity
     */

    public OptimizationObjective withObjectiveSensitivity(ObjectiveSensitivity objectiveSensitivity) {
        this.objectiveSensitivity = objectiveSensitivity.toString();
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
        if (getItemAttribute() != null)
            sb.append("ItemAttribute: ").append(getItemAttribute()).append(",");
        if (getObjectiveSensitivity() != null)
            sb.append("ObjectiveSensitivity: ").append(getObjectiveSensitivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptimizationObjective == false)
            return false;
        OptimizationObjective other = (OptimizationObjective) obj;
        if (other.getItemAttribute() == null ^ this.getItemAttribute() == null)
            return false;
        if (other.getItemAttribute() != null && other.getItemAttribute().equals(this.getItemAttribute()) == false)
            return false;
        if (other.getObjectiveSensitivity() == null ^ this.getObjectiveSensitivity() == null)
            return false;
        if (other.getObjectiveSensitivity() != null && other.getObjectiveSensitivity().equals(this.getObjectiveSensitivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemAttribute() == null) ? 0 : getItemAttribute().hashCode());
        hashCode = prime * hashCode + ((getObjectiveSensitivity() == null) ? 0 : getObjectiveSensitivity().hashCode());
        return hashCode;
    }

    @Override
    public OptimizationObjective clone() {
        try {
            return (OptimizationObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.OptimizationObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
