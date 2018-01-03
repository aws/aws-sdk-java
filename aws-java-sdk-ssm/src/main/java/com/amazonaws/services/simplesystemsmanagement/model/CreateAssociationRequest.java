/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The targets (either instances or tags) for the association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request.
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;
    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     */
    private String associationName;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @return The name of the Systems Manager document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want to associate with the target(s). Can be a specific version or the default
     *        version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @return The document version you want to associate with the target(s). Can be a specific version or the default
     *         version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want to associate with the target(s). Can be a specific version or the default
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     * 
     * @return The parameters for the documents runtime configuration.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     * 
     * @param parameters
     *        The parameters for the documents runtime configuration.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the documents runtime configuration.
     * </p>
     * 
     * @param parameters
     *        The parameters for the documents runtime configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public CreateAssociationRequest addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association.
     * </p>
     * 
     * @return The targets (either instances or tags) for the association.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) for the association.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) for the association.
     * </p>
     * 
     * @param targets
     *        The targets (either instances or tags) for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression when the association will be applied to the target(s).
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     * 
     * @return A cron expression when the association will be applied to the target(s).
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression when the association will be applied to the target(s).
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression when the association will be applied to the target(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request.
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the output details of the request.
     */

    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request.
     * </p>
     * 
     * @return An Amazon S3 bucket where you want to store the output details of the request.
     */

    public InstanceAssociationOutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the output details of the request.
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the output details of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * 
     * @param associationName
     *        Specify a descriptive name for the association.
     */

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * 
     * @return Specify a descriptive name for the association.
     */

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * 
     * @param associationName
     *        Specify a descriptive name for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationRequest withAssociationName(String associationName) {
        setAssociationName(associationName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getAssociationName() != null)
            sb.append("AssociationName: ").append(getAssociationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationRequest == false)
            return false;
        CreateAssociationRequest other = (CreateAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssociationRequest clone() {
        return (CreateAssociationRequest) super.clone();
    }

}
