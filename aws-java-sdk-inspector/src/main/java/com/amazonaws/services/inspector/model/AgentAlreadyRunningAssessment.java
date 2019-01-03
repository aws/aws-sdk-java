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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used in the exception error that is thrown if you start an assessment run for an assessment target that includes an
 * EC2 instance that is already participating in another started assessment run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AgentAlreadyRunningAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAlreadyRunningAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID of the agent that is running on an EC2 instance that is already participating in another started assessment
     * run.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The ARN of the assessment run that has already been started.
     * </p>
     */
    private String assessmentRunArn;

    /**
     * <p>
     * ID of the agent that is running on an EC2 instance that is already participating in another started assessment
     * run.
     * </p>
     * 
     * @param agentId
     *        ID of the agent that is running on an EC2 instance that is already participating in another started
     *        assessment run.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * ID of the agent that is running on an EC2 instance that is already participating in another started assessment
     * run.
     * </p>
     * 
     * @return ID of the agent that is running on an EC2 instance that is already participating in another started
     *         assessment run.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * ID of the agent that is running on an EC2 instance that is already participating in another started assessment
     * run.
     * </p>
     * 
     * @param agentId
     *        ID of the agent that is running on an EC2 instance that is already participating in another started
     *        assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlreadyRunningAssessment withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment run that has already been started.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run that has already been started.
     */

    public void setAssessmentRunArn(String assessmentRunArn) {
        this.assessmentRunArn = assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that has already been started.
     * </p>
     * 
     * @return The ARN of the assessment run that has already been started.
     */

    public String getAssessmentRunArn() {
        return this.assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that has already been started.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run that has already been started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlreadyRunningAssessment withAssessmentRunArn(String assessmentRunArn) {
        setAssessmentRunArn(assessmentRunArn);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAssessmentRunArn() != null)
            sb.append("AssessmentRunArn: ").append(getAssessmentRunArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentAlreadyRunningAssessment == false)
            return false;
        AgentAlreadyRunningAssessment other = (AgentAlreadyRunningAssessment) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAssessmentRunArn() == null ^ this.getAssessmentRunArn() == null)
            return false;
        if (other.getAssessmentRunArn() != null && other.getAssessmentRunArn().equals(this.getAssessmentRunArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentRunArn() == null) ? 0 : getAssessmentRunArn().hashCode());
        return hashCode;
    }

    @Override
    public AgentAlreadyRunningAssessment clone() {
        try {
            return (AgentAlreadyRunningAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AgentAlreadyRunningAssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
