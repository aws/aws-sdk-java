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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains a system instance definition and summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SystemInstanceDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemInstanceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains summary information about a system instance.
     * </p>
     */
    private SystemInstanceSummary summary;

    private DefinitionDocument definition;
    /**
     * <p>
     * The Amazon Simple Storage Service bucket where information about a system instance is stored.
     * </p>
     */
    private String s3BucketName;

    private MetricsConfiguration metricsConfiguration;
    /**
     * <p>
     * The version of the user's namespace against which the system instance was validated.
     * </p>
     */
    private Long validatedNamespaceVersion;
    /**
     * <p>
     * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a
     * system instance.
     * </p>
     */
    private java.util.List<DependencyRevision> validatedDependencyRevisions;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a
     * cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS
     * services that the flow uses.
     * </p>
     */
    private String flowActionsRoleArn;

    /**
     * <p>
     * An object that contains summary information about a system instance.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a system instance.
     */

    public void setSummary(SystemInstanceSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * An object that contains summary information about a system instance.
     * </p>
     * 
     * @return An object that contains summary information about a system instance.
     */

    public SystemInstanceSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * An object that contains summary information about a system instance.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withSummary(SystemInstanceSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * @param definition
     */

    public void setDefinition(DefinitionDocument definition) {
        this.definition = definition;
    }

    /**
     * @return
     */

    public DefinitionDocument getDefinition() {
        return this.definition;
    }

    /**
     * @param definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withDefinition(DefinitionDocument definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service bucket where information about a system instance is stored.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon Simple Storage Service bucket where information about a system instance is stored.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service bucket where information about a system instance is stored.
     * </p>
     * 
     * @return The Amazon Simple Storage Service bucket where information about a system instance is stored.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service bucket where information about a system instance is stored.
     * </p>
     * 
     * @param s3BucketName
     *        The Amazon Simple Storage Service bucket where information about a system instance is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * @param metricsConfiguration
     */

    public void setMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
    }

    /**
     * @return
     */

    public MetricsConfiguration getMetricsConfiguration() {
        return this.metricsConfiguration;
    }

    /**
     * @param metricsConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        setMetricsConfiguration(metricsConfiguration);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace against which the system instance was validated.
     * </p>
     * 
     * @param validatedNamespaceVersion
     *        The version of the user's namespace against which the system instance was validated.
     */

    public void setValidatedNamespaceVersion(Long validatedNamespaceVersion) {
        this.validatedNamespaceVersion = validatedNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace against which the system instance was validated.
     * </p>
     * 
     * @return The version of the user's namespace against which the system instance was validated.
     */

    public Long getValidatedNamespaceVersion() {
        return this.validatedNamespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace against which the system instance was validated.
     * </p>
     * 
     * @param validatedNamespaceVersion
     *        The version of the user's namespace against which the system instance was validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withValidatedNamespaceVersion(Long validatedNamespaceVersion) {
        setValidatedNamespaceVersion(validatedNamespaceVersion);
        return this;
    }

    /**
     * <p>
     * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a
     * system instance.
     * </p>
     * 
     * @return A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used
     *         in a system instance.
     */

    public java.util.List<DependencyRevision> getValidatedDependencyRevisions() {
        return validatedDependencyRevisions;
    }

    /**
     * <p>
     * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a
     * system instance.
     * </p>
     * 
     * @param validatedDependencyRevisions
     *        A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used
     *        in a system instance.
     */

    public void setValidatedDependencyRevisions(java.util.Collection<DependencyRevision> validatedDependencyRevisions) {
        if (validatedDependencyRevisions == null) {
            this.validatedDependencyRevisions = null;
            return;
        }

        this.validatedDependencyRevisions = new java.util.ArrayList<DependencyRevision>(validatedDependencyRevisions);
    }

    /**
     * <p>
     * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a
     * system instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidatedDependencyRevisions(java.util.Collection)} or
     * {@link #withValidatedDependencyRevisions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param validatedDependencyRevisions
     *        A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used
     *        in a system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withValidatedDependencyRevisions(DependencyRevision... validatedDependencyRevisions) {
        if (this.validatedDependencyRevisions == null) {
            setValidatedDependencyRevisions(new java.util.ArrayList<DependencyRevision>(validatedDependencyRevisions.length));
        }
        for (DependencyRevision ele : validatedDependencyRevisions) {
            this.validatedDependencyRevisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a
     * system instance.
     * </p>
     * 
     * @param validatedDependencyRevisions
     *        A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used
     *        in a system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withValidatedDependencyRevisions(java.util.Collection<DependencyRevision> validatedDependencyRevisions) {
        setValidatedDependencyRevisions(validatedDependencyRevisions);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a
     * cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS
     * services that the flow uses.
     * </p>
     * 
     * @param flowActionsRoleArn
     *        The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution
     *        in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to
     *        any other AWS services that the flow uses.
     */

    public void setFlowActionsRoleArn(String flowActionsRoleArn) {
        this.flowActionsRoleArn = flowActionsRoleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a
     * cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS
     * services that the flow uses.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution
     *         in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to
     *         any other AWS services that the flow uses.
     */

    public String getFlowActionsRoleArn() {
        return this.flowActionsRoleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a
     * cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS
     * services that the flow uses.
     * </p>
     * 
     * @param flowActionsRoleArn
     *        The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution
     *        in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to
     *        any other AWS services that the flow uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceDescription withFlowActionsRoleArn(String flowActionsRoleArn) {
        setFlowActionsRoleArn(flowActionsRoleArn);
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getMetricsConfiguration() != null)
            sb.append("MetricsConfiguration: ").append(getMetricsConfiguration()).append(",");
        if (getValidatedNamespaceVersion() != null)
            sb.append("ValidatedNamespaceVersion: ").append(getValidatedNamespaceVersion()).append(",");
        if (getValidatedDependencyRevisions() != null)
            sb.append("ValidatedDependencyRevisions: ").append(getValidatedDependencyRevisions()).append(",");
        if (getFlowActionsRoleArn() != null)
            sb.append("FlowActionsRoleArn: ").append(getFlowActionsRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemInstanceDescription == false)
            return false;
        SystemInstanceDescription other = (SystemInstanceDescription) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getMetricsConfiguration() == null ^ this.getMetricsConfiguration() == null)
            return false;
        if (other.getMetricsConfiguration() != null && other.getMetricsConfiguration().equals(this.getMetricsConfiguration()) == false)
            return false;
        if (other.getValidatedNamespaceVersion() == null ^ this.getValidatedNamespaceVersion() == null)
            return false;
        if (other.getValidatedNamespaceVersion() != null && other.getValidatedNamespaceVersion().equals(this.getValidatedNamespaceVersion()) == false)
            return false;
        if (other.getValidatedDependencyRevisions() == null ^ this.getValidatedDependencyRevisions() == null)
            return false;
        if (other.getValidatedDependencyRevisions() != null && other.getValidatedDependencyRevisions().equals(this.getValidatedDependencyRevisions()) == false)
            return false;
        if (other.getFlowActionsRoleArn() == null ^ this.getFlowActionsRoleArn() == null)
            return false;
        if (other.getFlowActionsRoleArn() != null && other.getFlowActionsRoleArn().equals(this.getFlowActionsRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getMetricsConfiguration() == null) ? 0 : getMetricsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getValidatedNamespaceVersion() == null) ? 0 : getValidatedNamespaceVersion().hashCode());
        hashCode = prime * hashCode + ((getValidatedDependencyRevisions() == null) ? 0 : getValidatedDependencyRevisions().hashCode());
        hashCode = prime * hashCode + ((getFlowActionsRoleArn() == null) ? 0 : getFlowActionsRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public SystemInstanceDescription clone() {
        try {
            return (SystemInstanceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.SystemInstanceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
