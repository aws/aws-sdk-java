/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for debugging rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DebugRuleConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DebugRuleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other rule configuration names.
     * </p>
     */
    private String ruleConfigurationName;
    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     */
    private String ruleEvaluatorImage;
    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing instance.
     * </p>
     */
    private Integer volumeSizeInGB;
    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     */
    private java.util.Map<String, String> ruleParameters;

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other rule configuration names.
     * </p>
     * 
     * @param ruleConfigurationName
     *        The name of the rule configuration. It must be unique relative to other rule configuration names.
     */

    public void setRuleConfigurationName(String ruleConfigurationName) {
        this.ruleConfigurationName = ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other rule configuration names.
     * </p>
     * 
     * @return The name of the rule configuration. It must be unique relative to other rule configuration names.
     */

    public String getRuleConfigurationName() {
        return this.ruleConfigurationName;
    }

    /**
     * <p>
     * The name of the rule configuration. It must be unique relative to other rule configuration names.
     * </p>
     * 
     * @param ruleConfigurationName
     *        The name of the rule configuration. It must be unique relative to other rule configuration names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration withRuleConfigurationName(String ruleConfigurationName) {
        setRuleConfigurationName(ruleConfigurationName);
        return this;
    }

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * 
     * @param localPath
     *        Path to local storage location for output of rules. Defaults to
     *        <code>/opt/ml/processing/output/rule/</code>.
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * 
     * @return Path to local storage location for output of rules. Defaults to
     *         <code>/opt/ml/processing/output/rule/</code>.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * Path to local storage location for output of rules. Defaults to <code>/opt/ml/processing/output/rule/</code>.
     * </p>
     * 
     * @param localPath
     *        Path to local storage location for output of rules. Defaults to
     *        <code>/opt/ml/processing/output/rule/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for rules.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * 
     * @return Path to Amazon S3 storage location for rules.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for rules.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * 
     * @param ruleEvaluatorImage
     *        The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     */

    public void setRuleEvaluatorImage(String ruleEvaluatorImage) {
        this.ruleEvaluatorImage = ruleEvaluatorImage;
    }

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * 
     * @return The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     */

    public String getRuleEvaluatorImage() {
        return this.ruleEvaluatorImage;
    }

    /**
     * <p>
     * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * </p>
     * 
     * @param ruleEvaluatorImage
     *        The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration withRuleEvaluatorImage(String ruleEvaluatorImage) {
        setRuleEvaluatorImage(ruleEvaluatorImage);
        return this;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * 
     * @param instanceType
     *        The instance type to deploy for a training job.
     * @see ProcessingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * 
     * @return The instance type to deploy for a training job.
     * @see ProcessingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * 
     * @param instanceType
     *        The instance type to deploy for a training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingInstanceType
     */

    public DebugRuleConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type to deploy for a training job.
     * </p>
     * 
     * @param instanceType
     *        The instance type to deploy for a training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingInstanceType
     */

    public DebugRuleConfiguration withInstanceType(ProcessingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing instance.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume attached to the processing instance.
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing instance.
     * </p>
     * 
     * @return The size, in GB, of the ML storage volume attached to the processing instance.
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size, in GB, of the ML storage volume attached to the processing instance.
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size, in GB, of the ML storage volume attached to the processing instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
        return this;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     * 
     * @return Runtime configuration for rule container.
     */

    public java.util.Map<String, String> getRuleParameters() {
        return ruleParameters;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     * 
     * @param ruleParameters
     *        Runtime configuration for rule container.
     */

    public void setRuleParameters(java.util.Map<String, String> ruleParameters) {
        this.ruleParameters = ruleParameters;
    }

    /**
     * <p>
     * Runtime configuration for rule container.
     * </p>
     * 
     * @param ruleParameters
     *        Runtime configuration for rule container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration withRuleParameters(java.util.Map<String, String> ruleParameters) {
        setRuleParameters(ruleParameters);
        return this;
    }

    /**
     * Add a single RuleParameters entry
     *
     * @see DebugRuleConfiguration#withRuleParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration addRuleParametersEntry(String key, String value) {
        if (null == this.ruleParameters) {
            this.ruleParameters = new java.util.HashMap<String, String>();
        }
        if (this.ruleParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.ruleParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RuleParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DebugRuleConfiguration clearRuleParametersEntries() {
        this.ruleParameters = null;
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
        if (getRuleConfigurationName() != null)
            sb.append("RuleConfigurationName: ").append(getRuleConfigurationName()).append(",");
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getRuleEvaluatorImage() != null)
            sb.append("RuleEvaluatorImage: ").append(getRuleEvaluatorImage()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB()).append(",");
        if (getRuleParameters() != null)
            sb.append("RuleParameters: ").append(getRuleParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugRuleConfiguration == false)
            return false;
        DebugRuleConfiguration other = (DebugRuleConfiguration) obj;
        if (other.getRuleConfigurationName() == null ^ this.getRuleConfigurationName() == null)
            return false;
        if (other.getRuleConfigurationName() != null && other.getRuleConfigurationName().equals(this.getRuleConfigurationName()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getRuleEvaluatorImage() == null ^ this.getRuleEvaluatorImage() == null)
            return false;
        if (other.getRuleEvaluatorImage() != null && other.getRuleEvaluatorImage().equals(this.getRuleEvaluatorImage()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        if (other.getRuleParameters() == null ^ this.getRuleParameters() == null)
            return false;
        if (other.getRuleParameters() != null && other.getRuleParameters().equals(this.getRuleParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleConfigurationName() == null) ? 0 : getRuleConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getRuleEvaluatorImage() == null) ? 0 : getRuleEvaluatorImage().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        hashCode = prime * hashCode + ((getRuleParameters() == null) ? 0 : getRuleParameters().hashCode());
        return hashCode;
    }

    @Override
    public DebugRuleConfiguration clone() {
        try {
            return (DebugRuleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DebugRuleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
