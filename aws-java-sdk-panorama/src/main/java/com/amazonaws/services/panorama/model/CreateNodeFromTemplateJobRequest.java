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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateNodeFromTemplateJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNodeFromTemplateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Tags for the job.
     * </p>
     */
    private java.util.List<JobResourceTags> jobTags;
    /**
     * <p>
     * A description for the node.
     * </p>
     */
    private String nodeDescription;
    /**
     * <p>
     * A name for the node.
     * </p>
     */
    private String nodeName;
    /**
     * <p>
     * An output package name for the node.
     * </p>
     */
    private String outputPackageName;
    /**
     * <p>
     * An output package version for the node.
     * </p>
     */
    private String outputPackageVersion;
    /**
     * <p>
     * Template parameters for the node.
     * </p>
     */
    private java.util.Map<String, String> templateParameters;
    /**
     * <p>
     * The type of node.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * Tags for the job.
     * </p>
     * 
     * @return Tags for the job.
     */

    public java.util.List<JobResourceTags> getJobTags() {
        return jobTags;
    }

    /**
     * <p>
     * Tags for the job.
     * </p>
     * 
     * @param jobTags
     *        Tags for the job.
     */

    public void setJobTags(java.util.Collection<JobResourceTags> jobTags) {
        if (jobTags == null) {
            this.jobTags = null;
            return;
        }

        this.jobTags = new java.util.ArrayList<JobResourceTags>(jobTags);
    }

    /**
     * <p>
     * Tags for the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTags(java.util.Collection)} or {@link #withJobTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobTags
     *        Tags for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withJobTags(JobResourceTags... jobTags) {
        if (this.jobTags == null) {
            setJobTags(new java.util.ArrayList<JobResourceTags>(jobTags.length));
        }
        for (JobResourceTags ele : jobTags) {
            this.jobTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for the job.
     * </p>
     * 
     * @param jobTags
     *        Tags for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withJobTags(java.util.Collection<JobResourceTags> jobTags) {
        setJobTags(jobTags);
        return this;
    }

    /**
     * <p>
     * A description for the node.
     * </p>
     * 
     * @param nodeDescription
     *        A description for the node.
     */

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    /**
     * <p>
     * A description for the node.
     * </p>
     * 
     * @return A description for the node.
     */

    public String getNodeDescription() {
        return this.nodeDescription;
    }

    /**
     * <p>
     * A description for the node.
     * </p>
     * 
     * @param nodeDescription
     *        A description for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withNodeDescription(String nodeDescription) {
        setNodeDescription(nodeDescription);
        return this;
    }

    /**
     * <p>
     * A name for the node.
     * </p>
     * 
     * @param nodeName
     *        A name for the node.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * A name for the node.
     * </p>
     * 
     * @return A name for the node.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * A name for the node.
     * </p>
     * 
     * @param nodeName
     *        A name for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * <p>
     * An output package name for the node.
     * </p>
     * 
     * @param outputPackageName
     *        An output package name for the node.
     */

    public void setOutputPackageName(String outputPackageName) {
        this.outputPackageName = outputPackageName;
    }

    /**
     * <p>
     * An output package name for the node.
     * </p>
     * 
     * @return An output package name for the node.
     */

    public String getOutputPackageName() {
        return this.outputPackageName;
    }

    /**
     * <p>
     * An output package name for the node.
     * </p>
     * 
     * @param outputPackageName
     *        An output package name for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withOutputPackageName(String outputPackageName) {
        setOutputPackageName(outputPackageName);
        return this;
    }

    /**
     * <p>
     * An output package version for the node.
     * </p>
     * 
     * @param outputPackageVersion
     *        An output package version for the node.
     */

    public void setOutputPackageVersion(String outputPackageVersion) {
        this.outputPackageVersion = outputPackageVersion;
    }

    /**
     * <p>
     * An output package version for the node.
     * </p>
     * 
     * @return An output package version for the node.
     */

    public String getOutputPackageVersion() {
        return this.outputPackageVersion;
    }

    /**
     * <p>
     * An output package version for the node.
     * </p>
     * 
     * @param outputPackageVersion
     *        An output package version for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withOutputPackageVersion(String outputPackageVersion) {
        setOutputPackageVersion(outputPackageVersion);
        return this;
    }

    /**
     * <p>
     * Template parameters for the node.
     * </p>
     * 
     * @return Template parameters for the node.
     */

    public java.util.Map<String, String> getTemplateParameters() {
        return templateParameters;
    }

    /**
     * <p>
     * Template parameters for the node.
     * </p>
     * 
     * @param templateParameters
     *        Template parameters for the node.
     */

    public void setTemplateParameters(java.util.Map<String, String> templateParameters) {
        this.templateParameters = templateParameters;
    }

    /**
     * <p>
     * Template parameters for the node.
     * </p>
     * 
     * @param templateParameters
     *        Template parameters for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest withTemplateParameters(java.util.Map<String, String> templateParameters) {
        setTemplateParameters(templateParameters);
        return this;
    }

    /**
     * Add a single TemplateParameters entry
     *
     * @see CreateNodeFromTemplateJobRequest#withTemplateParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest addTemplateParametersEntry(String key, String value) {
        if (null == this.templateParameters) {
            this.templateParameters = new java.util.HashMap<String, String>();
        }
        if (this.templateParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.templateParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TemplateParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNodeFromTemplateJobRequest clearTemplateParametersEntries() {
        this.templateParameters = null;
        return this;
    }

    /**
     * <p>
     * The type of node.
     * </p>
     * 
     * @param templateType
     *        The type of node.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of node.
     * </p>
     * 
     * @return The type of node.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of node.
     * </p>
     * 
     * @param templateType
     *        The type of node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public CreateNodeFromTemplateJobRequest withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of node.
     * </p>
     * 
     * @param templateType
     *        The type of node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public CreateNodeFromTemplateJobRequest withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags()).append(",");
        if (getNodeDescription() != null)
            sb.append("NodeDescription: ").append(getNodeDescription()).append(",");
        if (getNodeName() != null)
            sb.append("NodeName: ").append(getNodeName()).append(",");
        if (getOutputPackageName() != null)
            sb.append("OutputPackageName: ").append(getOutputPackageName()).append(",");
        if (getOutputPackageVersion() != null)
            sb.append("OutputPackageVersion: ").append(getOutputPackageVersion()).append(",");
        if (getTemplateParameters() != null)
            sb.append("TemplateParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNodeFromTemplateJobRequest == false)
            return false;
        CreateNodeFromTemplateJobRequest other = (CreateNodeFromTemplateJobRequest) obj;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
            return false;
        if (other.getNodeDescription() == null ^ this.getNodeDescription() == null)
            return false;
        if (other.getNodeDescription() != null && other.getNodeDescription().equals(this.getNodeDescription()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        if (other.getOutputPackageName() == null ^ this.getOutputPackageName() == null)
            return false;
        if (other.getOutputPackageName() != null && other.getOutputPackageName().equals(this.getOutputPackageName()) == false)
            return false;
        if (other.getOutputPackageVersion() == null ^ this.getOutputPackageVersion() == null)
            return false;
        if (other.getOutputPackageVersion() != null && other.getOutputPackageVersion().equals(this.getOutputPackageVersion()) == false)
            return false;
        if (other.getTemplateParameters() == null ^ this.getTemplateParameters() == null)
            return false;
        if (other.getTemplateParameters() != null && other.getTemplateParameters().equals(this.getTemplateParameters()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        hashCode = prime * hashCode + ((getNodeDescription() == null) ? 0 : getNodeDescription().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        hashCode = prime * hashCode + ((getOutputPackageName() == null) ? 0 : getOutputPackageName().hashCode());
        hashCode = prime * hashCode + ((getOutputPackageVersion() == null) ? 0 : getOutputPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateParameters() == null) ? 0 : getTemplateParameters().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public CreateNodeFromTemplateJobRequest clone() {
        return (CreateNodeFromTemplateJobRequest) super.clone();
    }

}
