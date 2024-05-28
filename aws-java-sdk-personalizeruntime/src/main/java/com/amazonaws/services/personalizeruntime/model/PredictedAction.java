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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that identifies an action.
 * </p>
 * <p>
 * The API returns a list of <code>PredictedAction</code>s.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/PredictedAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictedAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the recommended action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The score of the recommended action. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * The ID of the recommended action.
     * </p>
     * 
     * @param actionId
     *        The ID of the recommended action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The ID of the recommended action.
     * </p>
     * 
     * @return The ID of the recommended action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The ID of the recommended action.
     * </p>
     * 
     * @param actionId
     *        The ID of the recommended action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedAction withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The score of the recommended action. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * 
     * @param score
     *        The score of the recommended action. For information about action scores, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *        action recommendation scoring works</a>.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * The score of the recommended action. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * 
     * @return The score of the recommended action. For information about action scores, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *         action recommendation scoring works</a>.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * The score of the recommended action. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * 
     * @param score
     *        The score of the recommended action. For information about action scores, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *        action recommendation scoring works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedAction withScore(Double score) {
        setScore(score);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictedAction == false)
            return false;
        PredictedAction other = (PredictedAction) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public PredictedAction clone() {
        try {
            return (PredictedAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeruntime.model.transform.PredictedActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
