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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the association version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationVersionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationVersionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID created by the system when the association was created.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The association version.
     * </p>
     */
    private String associationVersion;
    /**
     * <p>
     * The date the association version was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The name specified when the association was created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of a Systems Manager document used when the association version was created.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * Parameters specified when the association version was created.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The targets specified for the association when the association version was created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The cron or rate schedule specified for the association when the association version was created.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The location in Amazon S3 specified for the association when the association version was created.
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;
    /**
     * <p>
     * The name specified for the association version when the association version was created.
     * </p>
     */
    private String associationName;
    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The severity level that is assigned to the association.
     * </p>
     */
    private String complianceSeverity;

    /**
     * <p>
     * The ID created by the system when the association was created.
     * </p>
     * 
     * @param associationId
     *        The ID created by the system when the association was created.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID created by the system when the association was created.
     * </p>
     * 
     * @return The ID created by the system when the association was created.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID created by the system when the association was created.
     * </p>
     * 
     * @param associationId
     *        The ID created by the system when the association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * 
     * @param associationVersion
     *        The association version.
     */

    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * 
     * @return The association version.
     */

    public String getAssociationVersion() {
        return this.associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * 
     * @param associationVersion
     *        The association version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
        return this;
    }

    /**
     * <p>
     * The date the association version was created.
     * </p>
     * 
     * @param createdDate
     *        The date the association version was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the association version was created.
     * </p>
     * 
     * @return The date the association version was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the association version was created.
     * </p>
     * 
     * @param createdDate
     *        The date the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The name specified when the association was created.
     * </p>
     * 
     * @param name
     *        The name specified when the association was created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name specified when the association was created.
     * </p>
     * 
     * @return The name specified when the association was created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name specified when the association was created.
     * </p>
     * 
     * @param name
     *        The name specified when the association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of a Systems Manager document used when the association version was created.
     * </p>
     * 
     * @param documentVersion
     *        The version of a Systems Manager document used when the association version was created.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of a Systems Manager document used when the association version was created.
     * </p>
     * 
     * @return The version of a Systems Manager document used when the association version was created.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of a Systems Manager document used when the association version was created.
     * </p>
     * 
     * @param documentVersion
     *        The version of a Systems Manager document used when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * Parameters specified when the association version was created.
     * </p>
     * 
     * @return Parameters specified when the association version was created.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Parameters specified when the association version was created.
     * </p>
     * 
     * @param parameters
     *        Parameters specified when the association version was created.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Parameters specified when the association version was created.
     * </p>
     * 
     * @param parameters
     *        Parameters specified when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public AssociationVersionInfo addParametersEntry(String key, java.util.List<String> value) {
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

    public AssociationVersionInfo clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The targets specified for the association when the association version was created.
     * </p>
     * 
     * @return The targets specified for the association when the association version was created.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The targets specified for the association when the association version was created.
     * </p>
     * 
     * @param targets
     *        The targets specified for the association when the association version was created.
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
     * The targets specified for the association when the association version was created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The targets specified for the association when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withTargets(Target... targets) {
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
     * The targets specified for the association when the association version was created.
     * </p>
     * 
     * @param targets
     *        The targets specified for the association when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The cron or rate schedule specified for the association when the association version was created.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron or rate schedule specified for the association when the association version was created.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The cron or rate schedule specified for the association when the association version was created.
     * </p>
     * 
     * @return The cron or rate schedule specified for the association when the association version was created.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The cron or rate schedule specified for the association when the association version was created.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron or rate schedule specified for the association when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 specified for the association when the association version was created.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 specified for the association when the association version was created.
     */

    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 specified for the association when the association version was created.
     * </p>
     * 
     * @return The location in Amazon S3 specified for the association when the association version was created.
     */

    public InstanceAssociationOutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 specified for the association when the association version was created.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 specified for the association when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The name specified for the association version when the association version was created.
     * </p>
     * 
     * @param associationName
     *        The name specified for the association version when the association version was created.
     */

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * The name specified for the association version when the association version was created.
     * </p>
     * 
     * @return The name specified for the association version when the association version was created.
     */

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * <p>
     * The name specified for the association version when the association version was created.
     * </p>
     * 
     * @param associationName
     *        The name specified for the association version when the association version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withAssociationName(String associationName) {
        setAssociationName(associationName);
        return this;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     * 
     * @param maxErrors
     *        The number of errors that are allowed before the system stops sending requests to run the association on
     *        additional targets. You can specify either an absolute number of errors, for example 10, or a percentage
     *        of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when
     *        the fourth error is received. If you specify 0, then the system stops sending requests after the first
     *        error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system
     *        stops sending the request when the sixth error is received.</p>
     *        <p>
     *        Executions that are already running an association when MaxErrors is reached are allowed to complete, but
     *        some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *        failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     * 
     * @return The number of errors that are allowed before the system stops sending requests to run the association on
     *         additional targets. You can specify either an absolute number of errors, for example 10, or a percentage
     *         of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when
     *         the fourth error is received. If you specify 0, then the system stops sending requests after the first
     *         error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system
     *         stops sending the request when the sixth error is received.</p>
     *         <p>
     *         Executions that are already running an association when MaxErrors is reached are allowed to complete, but
     *         some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *         failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending requests to run the association on
     * additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the
     * target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth
     * error is received. If you specify 0, then the system stops sending requests after the first error is returned. If
     * you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when
     * the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of
     * these executions may fail as well. If you need to ensure that there won't be more than max-errors failed
     * executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * </p>
     * 
     * @param maxErrors
     *        The number of errors that are allowed before the system stops sending requests to run the association on
     *        additional targets. You can specify either an absolute number of errors, for example 10, or a percentage
     *        of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when
     *        the fourth error is received. If you specify 0, then the system stops sending requests after the first
     *        error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system
     *        stops sending the request when the sixth error is received.</p>
     *        <p>
     *        Executions that are already running an association when MaxErrors is reached are allowed to complete, but
     *        some of these executions may fail as well. If you need to ensure that there won't be more than max-errors
     *        failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets allowed to run the association at the same time. You can specify a number,
     *        for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means
     *        all targets run the association at the same time.</p>
     *        <p>
     *        If a new instance starts and attempts to run an association while Systems Manager is running
     *        MaxConcurrency associations, the association is allowed to run. During the next association interval, the
     *        new instance will process its association within the limit specified for MaxConcurrency.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     * 
     * @return The maximum number of targets allowed to run the association at the same time. You can specify a number,
     *         for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which
     *         means all targets run the association at the same time.</p>
     *         <p>
     *         If a new instance starts and attempts to run an association while Systems Manager is running
     *         MaxConcurrency associations, the association is allowed to run. During the next association interval, the
     *         new instance will process its association within the limit specified for MaxConcurrency.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for
     * example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency
     * associations, the association is allowed to run. During the next association interval, the new instance will
     * process its association within the limit specified for MaxConcurrency.
     * </p>
     * 
     * @param maxConcurrency
     *        The maximum number of targets allowed to run the association at the same time. You can specify a number,
     *        for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means
     *        all targets run the association at the same time.</p>
     *        <p>
     *        If a new instance starts and attempts to run an association while Systems Manager is running
     *        MaxConcurrency associations, the association is allowed to run. During the next association interval, the
     *        new instance will process its association within the limit specified for MaxConcurrency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationVersionInfo withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The severity level that is assigned to the association.
     * </p>
     * 
     * @param complianceSeverity
     *        The severity level that is assigned to the association.
     * @see AssociationComplianceSeverity
     */

    public void setComplianceSeverity(String complianceSeverity) {
        this.complianceSeverity = complianceSeverity;
    }

    /**
     * <p>
     * The severity level that is assigned to the association.
     * </p>
     * 
     * @return The severity level that is assigned to the association.
     * @see AssociationComplianceSeverity
     */

    public String getComplianceSeverity() {
        return this.complianceSeverity;
    }

    /**
     * <p>
     * The severity level that is assigned to the association.
     * </p>
     * 
     * @param complianceSeverity
     *        The severity level that is assigned to the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationComplianceSeverity
     */

    public AssociationVersionInfo withComplianceSeverity(String complianceSeverity) {
        setComplianceSeverity(complianceSeverity);
        return this;
    }

    /**
     * <p>
     * The severity level that is assigned to the association.
     * </p>
     * 
     * @param complianceSeverity
     *        The severity level that is assigned to the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationComplianceSeverity
     */

    public AssociationVersionInfo withComplianceSeverity(AssociationComplianceSeverity complianceSeverity) {
        this.complianceSeverity = complianceSeverity.toString();
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: ").append(getAssociationVersion()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getAssociationName() != null)
            sb.append("AssociationName: ").append(getAssociationName()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getComplianceSeverity() != null)
            sb.append("ComplianceSeverity: ").append(getComplianceSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationVersionInfo == false)
            return false;
        AssociationVersionInfo other = (AssociationVersionInfo) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
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
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getComplianceSeverity() == null ^ this.getComplianceSeverity() == null)
            return false;
        if (other.getComplianceSeverity() != null && other.getComplianceSeverity().equals(this.getComplianceSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getComplianceSeverity() == null) ? 0 : getComplianceSeverity().hashCode());
        return hashCode;
    }

    @Override
    public AssociationVersionInfo clone() {
        try {
            return (AssociationVersionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationVersionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
