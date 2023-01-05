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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the reference predictor used when retraining or upgrading a predictor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ReferencePredictorSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferencePredictorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the reference predictor.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ARN of the reference predictor.
     * </p>
     * 
     * @param arn
     *        The ARN of the reference predictor.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the reference predictor.
     * </p>
     * 
     * @return The ARN of the reference predictor.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the reference predictor.
     * </p>
     * 
     * @param arn
     *        The ARN of the reference predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferencePredictorSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * </p>
     * 
     * @return Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public ReferencePredictorSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        Whether the reference predictor is <code>Active</code> or <code>Deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public ReferencePredictorSummary withState(State state) {
        this.state = state.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferencePredictorSummary == false)
            return false;
        ReferencePredictorSummary other = (ReferencePredictorSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ReferencePredictorSummary clone() {
        try {
            return (ReferencePredictorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.ReferencePredictorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
