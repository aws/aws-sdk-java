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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the association you want to update.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The parameters you want to update for the association. If you create a parameter using Parameter Store, you can
     * reference the parameter using {{ssm:parameter-name}}
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The document version you want update for the association.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The cron expression used to schedule the association that you want to update.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;
    /**
     * <p>
     * The name of the association document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The targets of the association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The name of the association that you want to update.
     * </p>
     */
    private String associationName;
    /**
     * <p>
     * This parameter is provided for concurrency control purposes. You must specify the latest association version in
     * the service. If you want to ensure that this request succeeds, either specify <code>$LATEST</code>, or omit this
     * parameter.
     * </p>
     */
    private String associationVersion;

    /**
     * <p>
     * The ID of the association you want to update.
     * </p>
     * 
     * @param associationId
     *        The ID of the association you want to update.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association you want to update.
     * </p>
     * 
     * @return The ID of the association you want to update.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association you want to update.
     * </p>
     * 
     * @param associationId
     *        The ID of the association you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The parameters you want to update for the association. If you create a parameter using Parameter Store, you can
     * reference the parameter using {{ssm:parameter-name}}
     * </p>
     * 
     * @return The parameters you want to update for the association. If you create a parameter using Parameter Store,
     *         you can reference the parameter using {{ssm:parameter-name}}
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters you want to update for the association. If you create a parameter using Parameter Store, you can
     * reference the parameter using {{ssm:parameter-name}}
     * </p>
     * 
     * @param parameters
     *        The parameters you want to update for the association. If you create a parameter using Parameter Store,
     *        you can reference the parameter using {{ssm:parameter-name}}
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters you want to update for the association. If you create a parameter using Parameter Store, you can
     * reference the parameter using {{ssm:parameter-name}}
     * </p>
     * 
     * @param parameters
     *        The parameters you want to update for the association. If you create a parameter using Parameter Store,
     *        you can reference the parameter using {{ssm:parameter-name}}
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public UpdateAssociationRequest addParametersEntry(String key, java.util.List<String> value) {
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

    public UpdateAssociationRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The document version you want update for the association.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want update for the association.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version you want update for the association.
     * </p>
     * 
     * @return The document version you want update for the association.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version you want update for the association.
     * </p>
     * 
     * @param documentVersion
     *        The document version you want update for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The cron expression used to schedule the association that you want to update.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron expression used to schedule the association that you want to update.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The cron expression used to schedule the association that you want to update.
     * </p>
     * 
     * @return The cron expression used to schedule the association that you want to update.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The cron expression used to schedule the association that you want to update.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron expression used to schedule the association that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the results of this request.
     */

    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @return An Amazon S3 bucket where you want to store the results of this request.
     */

    public InstanceAssociationOutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the results of this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The name of the association document.
     * </p>
     * 
     * @param name
     *        The name of the association document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association document.
     * </p>
     * 
     * @return The name of the association document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the association document.
     * </p>
     * 
     * @param name
     *        The name of the association document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The targets of the association.
     * </p>
     * 
     * @return The targets of the association.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets of the association.
     * </p>
     * 
     * @param targets
     *        The targets of the association.
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
     * The targets of the association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withTargets(Target... targets) {
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
     * The targets of the association.
     * </p>
     * 
     * @param targets
     *        The targets of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The name of the association that you want to update.
     * </p>
     * 
     * @param associationName
     *        The name of the association that you want to update.
     */

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * The name of the association that you want to update.
     * </p>
     * 
     * @return The name of the association that you want to update.
     */

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * <p>
     * The name of the association that you want to update.
     * </p>
     * 
     * @param associationName
     *        The name of the association that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withAssociationName(String associationName) {
        setAssociationName(associationName);
        return this;
    }

    /**
     * <p>
     * This parameter is provided for concurrency control purposes. You must specify the latest association version in
     * the service. If you want to ensure that this request succeeds, either specify <code>$LATEST</code>, or omit this
     * parameter.
     * </p>
     * 
     * @param associationVersion
     *        This parameter is provided for concurrency control purposes. You must specify the latest association
     *        version in the service. If you want to ensure that this request succeeds, either specify
     *        <code>$LATEST</code>, or omit this parameter.
     */

    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * This parameter is provided for concurrency control purposes. You must specify the latest association version in
     * the service. If you want to ensure that this request succeeds, either specify <code>$LATEST</code>, or omit this
     * parameter.
     * </p>
     * 
     * @return This parameter is provided for concurrency control purposes. You must specify the latest association
     *         version in the service. If you want to ensure that this request succeeds, either specify
     *         <code>$LATEST</code>, or omit this parameter.
     */

    public String getAssociationVersion() {
        return this.associationVersion;
    }

    /**
     * <p>
     * This parameter is provided for concurrency control purposes. You must specify the latest association version in
     * the service. If you want to ensure that this request succeeds, either specify <code>$LATEST</code>, or omit this
     * parameter.
     * </p>
     * 
     * @param associationVersion
     *        This parameter is provided for concurrency control purposes. You must specify the latest association
     *        version in the service. If you want to ensure that this request succeeds, either specify
     *        <code>$LATEST</code>, or omit this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getAssociationName() != null)
            sb.append("AssociationName: ").append(getAssociationName()).append(",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: ").append(getAssociationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssociationRequest == false)
            return false;
        UpdateAssociationRequest other = (UpdateAssociationRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssociationRequest clone() {
        return (UpdateAssociationRequest) super.clone();
    }

}
