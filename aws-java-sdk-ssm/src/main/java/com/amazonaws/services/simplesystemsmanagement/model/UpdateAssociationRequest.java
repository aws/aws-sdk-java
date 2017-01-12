/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The cron expression used to schedule the association that you want to update. Supported expressions are every
     * half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *)
     * to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run
     * every Sunday at 10 a.m.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;

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
     * The cron expression used to schedule the association that you want to update. Supported expressions are every
     * half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *)
     * to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run
     * every Sunday at 10 a.m.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron expression used to schedule the association that you want to update. Supported expressions are
     *        every half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 *
     *        1/1 * ? *) to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ?
     *        * SUN *) to run every Sunday at 10 a.m.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The cron expression used to schedule the association that you want to update. Supported expressions are every
     * half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *)
     * to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run
     * every Sunday at 10 a.m.
     * </p>
     * 
     * @return The cron expression used to schedule the association that you want to update. Supported expressions are
     *         every half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30
     *         * 1/1 * ? *) to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0
     *         10 ? * SUN *) to run every Sunday at 10 a.m.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The cron expression used to schedule the association that you want to update. Supported expressions are every
     * half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 * 1/1 * ? *)
     * to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ? * SUN *) to run
     * every Sunday at 10 a.m.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron expression used to schedule the association that you want to update. Supported expressions are
     *        every half, 1, 2, 4, 8 or 12 hour(s); every specified day and time of the week. For example: cron(0 0/30 *
     *        1/1 * ? *) to run every thirty minutes; cron(0 0 0/4 1/1 * ? *) to run every four hours; and cron(0 0 10 ?
     *        * SUN *) to run every Sunday at 10 a.m.
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
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the results of this request.</p>
     *        <p>
     *        <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     */

    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     * 
     * @return An Amazon S3 bucket where you want to store the results of this request.</p>
     *         <p>
     *         <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     */

    public InstanceAssociationOutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * <p>
     * <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * </p>
     * 
     * @param outputLocation
     *        An Amazon S3 bucket where you want to store the results of this request.</p>
     *        <p>
     *        <code>"{ \"S3Location\": { \"OutputS3Region\": \"&lt;region&gt;\", \"OutputS3BucketName\": \"bucket name\", \"OutputS3KeyPrefix\": \"folder name\" } }"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationRequest withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        setOutputLocation(outputLocation);
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
            sb.append("OutputLocation: ").append(getOutputLocation());
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
        return hashCode;
    }

    @Override
    public UpdateAssociationRequest clone() {
        return (UpdateAssociationRequest) super.clone();
    }

}
