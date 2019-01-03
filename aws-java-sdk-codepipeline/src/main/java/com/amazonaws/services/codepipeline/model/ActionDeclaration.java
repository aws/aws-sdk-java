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
 * Represents information about an action declaration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionDeclaration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action declaration's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration information for the action type.
     * </p>
     */
    private ActionTypeId actionTypeId;
    /**
     * <p>
     * The order in which actions are run.
     * </p>
     */
    private Integer runOrder;
    /**
     * <p>
     * The action declaration's configuration.
     * </p>
     */
    private java.util.Map<String, String> configuration;
    /**
     * <p>
     * The name or ID of the result of the action declaration, such as a test or build artifact.
     * </p>
     */
    private java.util.List<OutputArtifact> outputArtifacts;
    /**
     * <p>
     * The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * </p>
     */
    private java.util.List<InputArtifact> inputArtifacts;
    /**
     * <p>
     * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for
     * the pipeline.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The action declaration's AWS Region, such as us-east-1.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The action declaration's name.
     * </p>
     * 
     * @param name
     *        The action declaration's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The action declaration's name.
     * </p>
     * 
     * @return The action declaration's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The action declaration's name.
     * </p>
     * 
     * @param name
     *        The action declaration's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration information for the action type.
     * </p>
     * 
     * @param actionTypeId
     *        The configuration information for the action type.
     */

    public void setActionTypeId(ActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    /**
     * <p>
     * The configuration information for the action type.
     * </p>
     * 
     * @return The configuration information for the action type.
     */

    public ActionTypeId getActionTypeId() {
        return this.actionTypeId;
    }

    /**
     * <p>
     * The configuration information for the action type.
     * </p>
     * 
     * @param actionTypeId
     *        The configuration information for the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withActionTypeId(ActionTypeId actionTypeId) {
        setActionTypeId(actionTypeId);
        return this;
    }

    /**
     * <p>
     * The order in which actions are run.
     * </p>
     * 
     * @param runOrder
     *        The order in which actions are run.
     */

    public void setRunOrder(Integer runOrder) {
        this.runOrder = runOrder;
    }

    /**
     * <p>
     * The order in which actions are run.
     * </p>
     * 
     * @return The order in which actions are run.
     */

    public Integer getRunOrder() {
        return this.runOrder;
    }

    /**
     * <p>
     * The order in which actions are run.
     * </p>
     * 
     * @param runOrder
     *        The order in which actions are run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withRunOrder(Integer runOrder) {
        setRunOrder(runOrder);
        return this;
    }

    /**
     * <p>
     * The action declaration's configuration.
     * </p>
     * 
     * @return The action declaration's configuration.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The action declaration's configuration.
     * </p>
     * 
     * @param configuration
     *        The action declaration's configuration.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The action declaration's configuration.
     * </p>
     * 
     * @param configuration
     *        The action declaration's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    public ActionDeclaration addConfigurationEntry(String key, String value) {
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

    public ActionDeclaration clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * <p>
     * The name or ID of the result of the action declaration, such as a test or build artifact.
     * </p>
     * 
     * @return The name or ID of the result of the action declaration, such as a test or build artifact.
     */

    public java.util.List<OutputArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The name or ID of the result of the action declaration, such as a test or build artifact.
     * </p>
     * 
     * @param outputArtifacts
     *        The name or ID of the result of the action declaration, such as a test or build artifact.
     */

    public void setOutputArtifacts(java.util.Collection<OutputArtifact> outputArtifacts) {
        if (outputArtifacts == null) {
            this.outputArtifacts = null;
            return;
        }

        this.outputArtifacts = new java.util.ArrayList<OutputArtifact>(outputArtifacts);
    }

    /**
     * <p>
     * The name or ID of the result of the action declaration, such as a test or build artifact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputArtifacts(java.util.Collection)} or {@link #withOutputArtifacts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputArtifacts
     *        The name or ID of the result of the action declaration, such as a test or build artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withOutputArtifacts(OutputArtifact... outputArtifacts) {
        if (this.outputArtifacts == null) {
            setOutputArtifacts(new java.util.ArrayList<OutputArtifact>(outputArtifacts.length));
        }
        for (OutputArtifact ele : outputArtifacts) {
            this.outputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name or ID of the result of the action declaration, such as a test or build artifact.
     * </p>
     * 
     * @param outputArtifacts
     *        The name or ID of the result of the action declaration, such as a test or build artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withOutputArtifacts(java.util.Collection<OutputArtifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * <p>
     * The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * </p>
     * 
     * @return The name or ID of the artifact consumed by the action, such as a test or build artifact.
     */

    public java.util.List<InputArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * </p>
     * 
     * @param inputArtifacts
     *        The name or ID of the artifact consumed by the action, such as a test or build artifact.
     */

    public void setInputArtifacts(java.util.Collection<InputArtifact> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<InputArtifact>(inputArtifacts);
    }

    /**
     * <p>
     * The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifacts(java.util.Collection)} or {@link #withInputArtifacts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withInputArtifacts(InputArtifact... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<InputArtifact>(inputArtifacts.length));
        }
        for (InputArtifact ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * </p>
     * 
     * @param inputArtifacts
     *        The name or ID of the artifact consumed by the action, such as a test or build artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withInputArtifacts(java.util.Collection<InputArtifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for
     * the pipeline.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn
     *        for the pipeline.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for
     * the pipeline.
     * </p>
     * 
     * @return The ARN of the IAM service role that will perform the declared action. This is assumed through the
     *         roleArn for the pipeline.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for
     * the pipeline.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn
     *        for the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The action declaration's AWS Region, such as us-east-1.
     * </p>
     * 
     * @param region
     *        The action declaration's AWS Region, such as us-east-1.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The action declaration's AWS Region, such as us-east-1.
     * </p>
     * 
     * @return The action declaration's AWS Region, such as us-east-1.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The action declaration's AWS Region, such as us-east-1.
     * </p>
     * 
     * @param region
     *        The action declaration's AWS Region, such as us-east-1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDeclaration withRegion(String region) {
        setRegion(region);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getActionTypeId() != null)
            sb.append("ActionTypeId: ").append(getActionTypeId()).append(",");
        if (getRunOrder() != null)
            sb.append("RunOrder: ").append(getRunOrder()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionDeclaration == false)
            return false;
        ActionDeclaration other = (ActionDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getActionTypeId() == null ^ this.getActionTypeId() == null)
            return false;
        if (other.getActionTypeId() != null && other.getActionTypeId().equals(this.getActionTypeId()) == false)
            return false;
        if (other.getRunOrder() == null ^ this.getRunOrder() == null)
            return false;
        if (other.getRunOrder() != null && other.getRunOrder().equals(this.getRunOrder()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getActionTypeId() == null) ? 0 : getActionTypeId().hashCode());
        hashCode = prime * hashCode + ((getRunOrder() == null) ? 0 : getRunOrder().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public ActionDeclaration clone() {
        try {
            return (ActionDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
