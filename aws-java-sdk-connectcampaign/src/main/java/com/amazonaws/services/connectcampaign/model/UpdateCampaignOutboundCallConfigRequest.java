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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * UpdateCampaignOutboundCallConfigRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignOutboundCallConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCampaignOutboundCallConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private AnswerMachineDetectionConfig answerMachineDetectionConfig;

    private String connectContactFlowId;

    private String connectSourcePhoneNumber;

    private String id;

    /**
     * @param answerMachineDetectionConfig
     */

    public void setAnswerMachineDetectionConfig(AnswerMachineDetectionConfig answerMachineDetectionConfig) {
        this.answerMachineDetectionConfig = answerMachineDetectionConfig;
    }

    /**
     * @return
     */

    public AnswerMachineDetectionConfig getAnswerMachineDetectionConfig() {
        return this.answerMachineDetectionConfig;
    }

    /**
     * @param answerMachineDetectionConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignOutboundCallConfigRequest withAnswerMachineDetectionConfig(AnswerMachineDetectionConfig answerMachineDetectionConfig) {
        setAnswerMachineDetectionConfig(answerMachineDetectionConfig);
        return this;
    }

    /**
     * @param connectContactFlowId
     */

    public void setConnectContactFlowId(String connectContactFlowId) {
        this.connectContactFlowId = connectContactFlowId;
    }

    /**
     * @return
     */

    public String getConnectContactFlowId() {
        return this.connectContactFlowId;
    }

    /**
     * @param connectContactFlowId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignOutboundCallConfigRequest withConnectContactFlowId(String connectContactFlowId) {
        setConnectContactFlowId(connectContactFlowId);
        return this;
    }

    /**
     * @param connectSourcePhoneNumber
     */

    public void setConnectSourcePhoneNumber(String connectSourcePhoneNumber) {
        this.connectSourcePhoneNumber = connectSourcePhoneNumber;
    }

    /**
     * @return
     */

    public String getConnectSourcePhoneNumber() {
        return this.connectSourcePhoneNumber;
    }

    /**
     * @param connectSourcePhoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignOutboundCallConfigRequest withConnectSourcePhoneNumber(String connectSourcePhoneNumber) {
        setConnectSourcePhoneNumber(connectSourcePhoneNumber);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignOutboundCallConfigRequest withId(String id) {
        setId(id);
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
        if (getAnswerMachineDetectionConfig() != null)
            sb.append("AnswerMachineDetectionConfig: ").append(getAnswerMachineDetectionConfig()).append(",");
        if (getConnectContactFlowId() != null)
            sb.append("ConnectContactFlowId: ").append(getConnectContactFlowId()).append(",");
        if (getConnectSourcePhoneNumber() != null)
            sb.append("ConnectSourcePhoneNumber: ").append(getConnectSourcePhoneNumber()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignOutboundCallConfigRequest == false)
            return false;
        UpdateCampaignOutboundCallConfigRequest other = (UpdateCampaignOutboundCallConfigRequest) obj;
        if (other.getAnswerMachineDetectionConfig() == null ^ this.getAnswerMachineDetectionConfig() == null)
            return false;
        if (other.getAnswerMachineDetectionConfig() != null && other.getAnswerMachineDetectionConfig().equals(this.getAnswerMachineDetectionConfig()) == false)
            return false;
        if (other.getConnectContactFlowId() == null ^ this.getConnectContactFlowId() == null)
            return false;
        if (other.getConnectContactFlowId() != null && other.getConnectContactFlowId().equals(this.getConnectContactFlowId()) == false)
            return false;
        if (other.getConnectSourcePhoneNumber() == null ^ this.getConnectSourcePhoneNumber() == null)
            return false;
        if (other.getConnectSourcePhoneNumber() != null && other.getConnectSourcePhoneNumber().equals(this.getConnectSourcePhoneNumber()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnswerMachineDetectionConfig() == null) ? 0 : getAnswerMachineDetectionConfig().hashCode());
        hashCode = prime * hashCode + ((getConnectContactFlowId() == null) ? 0 : getConnectContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getConnectSourcePhoneNumber() == null) ? 0 : getConnectSourcePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignOutboundCallConfigRequest clone() {
        return (UpdateCampaignOutboundCallConfigRequest) super.clone();
    }

}
