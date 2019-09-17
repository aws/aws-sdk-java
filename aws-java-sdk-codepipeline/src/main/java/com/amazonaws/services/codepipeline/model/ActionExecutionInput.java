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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Input information used for an action execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionExecutionInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionInput implements Serializable, Cloneable, StructuredPojo {

    private ActionTypeId actionTypeId;
    /**
     * <p>
     * Configuration data for an action execution.
     * </p>
     */
    private java.util.Map<String, String> configuration;
    /**
     * <p>
     * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The AWS Region for the action, such as us-east-1.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Details of input artifacts of the action that correspond to the action execution.
     * </p>
     */
    private java.util.List<ArtifactDetail> inputArtifacts;

    /**
     * @param actionTypeId
     */

    public void setActionTypeId(ActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    /**
     * @return
     */

    public ActionTypeId getActionTypeId() {
        return this.actionTypeId;
    }

    /**
     * @param actionTypeId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput withActionTypeId(ActionTypeId actionTypeId) {
        setActionTypeId(actionTypeId);
        return this;
    }

    /**
     * <p>
     * Configuration data for an action execution.
     * </p>
     * 
     * @return Configuration data for an action execution.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Configuration data for an action execution.
     * </p>
     * 
     * @param configuration
     *        Configuration data for an action execution.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration data for an action execution.
     * </p>
     * 
     * @param configuration
     *        Configuration data for an action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    public ActionExecutionInput addConfigurationEntry(String key, String value) {
        if (null == this.configuration) {
            this.configuration = new java.util.HashMap<String, String>();
        }
        if (this.configuration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configuration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configuration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for
     *        the pipeline.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     * 
     * @return The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn
     *         for the pipeline.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for
     *        the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The AWS Region for the action, such as us-east-1.
     * </p>
     * 
     * @param region
     *        The AWS Region for the action, such as us-east-1.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region for the action, such as us-east-1.
     * </p>
     * 
     * @return The AWS Region for the action, such as us-east-1.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region for the action, such as us-east-1.
     * </p>
     * 
     * @param region
     *        The AWS Region for the action, such as us-east-1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Details of input artifacts of the action that correspond to the action execution.
     * </p>
     * 
     * @return Details of input artifacts of the action that correspond to the action execution.
     */

    public java.util.List<ArtifactDetail> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * Details of input artifacts of the action that correspond to the action execution.
     * </p>
     * 
     * @param inputArtifacts
     *        Details of input artifacts of the action that correspond to the action execution.
     */

    public void setInputArtifacts(java.util.Collection<ArtifactDetail> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<ArtifactDetail>(inputArtifacts);
    }

    /**
     * <p>
     * Details of input artifacts of the action that correspond to the action execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifacts(java.util.Collection)} or {@link #withInputArtifacts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        Details of input artifacts of the action that correspond to the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput withInputArtifacts(ArtifactDetail... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<ArtifactDetail>(inputArtifacts.length));
        }
        for (ArtifactDetail ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of input artifacts of the action that correspond to the action execution.
     * </p>
     * 
     * @param inputArtifacts
     *        Details of input artifacts of the action that correspond to the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionInput withInputArtifacts(java.util.Collection<ArtifactDetail> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
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
        if (getActionTypeId() != null)
            sb.append("ActionTypeId: ").append(getActionTypeId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionExecutionInput == false)
            return false;
        ActionExecutionInput other = (ActionExecutionInput) obj;
        if (other.getActionTypeId() == null ^ this.getActionTypeId() == null)
            return false;
        if (other.getActionTypeId() != null && other.getActionTypeId().equals(this.getActionTypeId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTypeId() == null) ? 0 : getActionTypeId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public ActionExecutionInput clone() {
        try {
            return (ActionExecutionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionExecutionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
