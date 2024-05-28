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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UpdateInvestigationState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInvestigationStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     */
    private String investigationId;
    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInvestigationStateRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     */

    public void setInvestigationId(String investigationId) {
        this.investigationId = investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @return The investigation ID of the investigation report.
     */

    public String getInvestigationId() {
        return this.investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInvestigationStateRequest withInvestigationId(String investigationId) {
        setInvestigationId(investigationId);
        return this;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates you have completed reviewing
     *        the investigation.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @return The current state of the investigation. An archived investigation indicates you have completed reviewing
     *         the investigation.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates you have completed reviewing
     *        the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public UpdateInvestigationStateRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the investigation. An archived investigation indicates you have completed reviewing the
     * investigation.
     * </p>
     * 
     * @param state
     *        The current state of the investigation. An archived investigation indicates you have completed reviewing
     *        the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public UpdateInvestigationStateRequest withState(State state) {
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getInvestigationId() != null)
            sb.append("InvestigationId: ").append(getInvestigationId()).append(",");
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

        if (obj instanceof UpdateInvestigationStateRequest == false)
            return false;
        UpdateInvestigationStateRequest other = (UpdateInvestigationStateRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getInvestigationId() == null ^ this.getInvestigationId() == null)
            return false;
        if (other.getInvestigationId() != null && other.getInvestigationId().equals(this.getInvestigationId()) == false)
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

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getInvestigationId() == null) ? 0 : getInvestigationId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInvestigationStateRequest clone() {
        return (UpdateInvestigationStateRequest) super.clone();
    }

}
