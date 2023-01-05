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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an association of a Amazon Web Services Systems Manager document (SSM document) and a managed node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Association" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Association implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The managed node ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID created by the system when you create an association. An association is a binding between a document and a
     * set of targets with a schedule.
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
     * The version of the document used in the association. If you change a document version for a State Manager
     * association, Systems Manager immediately runs the association unless you previously specifed the
     * <code>apply-only-at-cron-interval</code> parameter.
     * </p>
     * <important>
     * <p>
     * State Manager doesn't support running associations that use a new version of a document if that document is
     * shared from another account. State Manager always runs the <code>default</code> version of a document if shared
     * from another account, even though the Systems Manager console shows that a new version was processed. If you want
     * to run an association using a new version of a document shared form another account, you must set the document
     * version to <code>default</code>.
     * </p>
     * </important>
     */
    private String documentVersion;
    /**
     * <p>
     * The managed nodes targeted by the request to create an association. You can target all managed nodes in an Amazon
     * Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     */
    private java.util.Date lastExecutionDate;
    /**
     * <p>
     * Information about the association.
     * </p>
     */
    private AssociationOverview overview;
    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated Universal
     * Time (UTC).
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The association name.
     * </p>
     */
    private String associationName;
    /**
     * <p>
     * Number of days to wait after the scheduled day to run an association.
     * </p>
     */
    private Integer scheduleOffset;
    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified
     * together.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>> targetMaps;

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @return The name of the SSM document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The managed node ID.
     * </p>
     * 
     * @param instanceId
     *        The managed node ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The managed node ID.
     * </p>
     * 
     * @return The managed node ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The managed node ID.
     * </p>
     * 
     * @param instanceId
     *        The managed node ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID created by the system when you create an association. An association is a binding between a document and a
     * set of targets with a schedule.
     * </p>
     * 
     * @param associationId
     *        The ID created by the system when you create an association. An association is a binding between a
     *        document and a set of targets with a schedule.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID created by the system when you create an association. An association is a binding between a document and a
     * set of targets with a schedule.
     * </p>
     * 
     * @return The ID created by the system when you create an association. An association is a binding between a
     *         document and a set of targets with a schedule.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID created by the system when you create an association. An association is a binding between a document and a
     * set of targets with a schedule.
     * </p>
     * 
     * @param associationId
     *        The ID created by the system when you create an association. An association is a binding between a
     *        document and a set of targets with a schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withAssociationId(String associationId) {
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

    public Association withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
        return this;
    }

    /**
     * <p>
     * The version of the document used in the association. If you change a document version for a State Manager
     * association, Systems Manager immediately runs the association unless you previously specifed the
     * <code>apply-only-at-cron-interval</code> parameter.
     * </p>
     * <important>
     * <p>
     * State Manager doesn't support running associations that use a new version of a document if that document is
     * shared from another account. State Manager always runs the <code>default</code> version of a document if shared
     * from another account, even though the Systems Manager console shows that a new version was processed. If you want
     * to run an association using a new version of a document shared form another account, you must set the document
     * version to <code>default</code>.
     * </p>
     * </important>
     * 
     * @param documentVersion
     *        The version of the document used in the association. If you change a document version for a State Manager
     *        association, Systems Manager immediately runs the association unless you previously specifed the
     *        <code>apply-only-at-cron-interval</code> parameter.</p> <important>
     *        <p>
     *        State Manager doesn't support running associations that use a new version of a document if that document
     *        is shared from another account. State Manager always runs the <code>default</code> version of a document
     *        if shared from another account, even though the Systems Manager console shows that a new version was
     *        processed. If you want to run an association using a new version of a document shared form another
     *        account, you must set the document version to <code>default</code>.
     *        </p>
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document used in the association. If you change a document version for a State Manager
     * association, Systems Manager immediately runs the association unless you previously specifed the
     * <code>apply-only-at-cron-interval</code> parameter.
     * </p>
     * <important>
     * <p>
     * State Manager doesn't support running associations that use a new version of a document if that document is
     * shared from another account. State Manager always runs the <code>default</code> version of a document if shared
     * from another account, even though the Systems Manager console shows that a new version was processed. If you want
     * to run an association using a new version of a document shared form another account, you must set the document
     * version to <code>default</code>.
     * </p>
     * </important>
     * 
     * @return The version of the document used in the association. If you change a document version for a State Manager
     *         association, Systems Manager immediately runs the association unless you previously specifed the
     *         <code>apply-only-at-cron-interval</code> parameter.</p> <important>
     *         <p>
     *         State Manager doesn't support running associations that use a new version of a document if that document
     *         is shared from another account. State Manager always runs the <code>default</code> version of a document
     *         if shared from another account, even though the Systems Manager console shows that a new version was
     *         processed. If you want to run an association using a new version of a document shared form another
     *         account, you must set the document version to <code>default</code>.
     *         </p>
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document used in the association. If you change a document version for a State Manager
     * association, Systems Manager immediately runs the association unless you previously specifed the
     * <code>apply-only-at-cron-interval</code> parameter.
     * </p>
     * <important>
     * <p>
     * State Manager doesn't support running associations that use a new version of a document if that document is
     * shared from another account. State Manager always runs the <code>default</code> version of a document if shared
     * from another account, even though the Systems Manager console shows that a new version was processed. If you want
     * to run an association using a new version of a document shared form another account, you must set the document
     * version to <code>default</code>.
     * </p>
     * </important>
     * 
     * @param documentVersion
     *        The version of the document used in the association. If you change a document version for a State Manager
     *        association, Systems Manager immediately runs the association unless you previously specifed the
     *        <code>apply-only-at-cron-interval</code> parameter.</p> <important>
     *        <p>
     *        State Manager doesn't support running associations that use a new version of a document if that document
     *        is shared from another account. State Manager always runs the <code>default</code> version of a document
     *        if shared from another account, even though the Systems Manager console shows that a new version was
     *        processed. If you want to run an association using a new version of a document shared form another
     *        account, you must set the document version to <code>default</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The managed nodes targeted by the request to create an association. You can target all managed nodes in an Amazon
     * Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * </p>
     * 
     * @return The managed nodes targeted by the request to create an association. You can target all managed nodes in
     *         an Amazon Web Services account by specifying the <code>InstanceIds</code> key with a value of
     *         <code>*</code>.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The managed nodes targeted by the request to create an association. You can target all managed nodes in an Amazon
     * Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * </p>
     * 
     * @param targets
     *        The managed nodes targeted by the request to create an association. You can target all managed nodes in an
     *        Amazon Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
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
     * The managed nodes targeted by the request to create an association. You can target all managed nodes in an Amazon
     * Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The managed nodes targeted by the request to create an association. You can target all managed nodes in an
     *        Amazon Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withTargets(Target... targets) {
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
     * The managed nodes targeted by the request to create an association. You can target all managed nodes in an Amazon
     * Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * </p>
     * 
     * @param targets
     *        The managed nodes targeted by the request to create an association. You can target all managed nodes in an
     *        Amazon Web Services account by specifying the <code>InstanceIds</code> key with a value of <code>*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     * 
     * @param lastExecutionDate
     *        The date on which the association was last run.
     */

    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     * 
     * @return The date on which the association was last run.
     */

    public java.util.Date getLastExecutionDate() {
        return this.lastExecutionDate;
    }

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     * 
     * @param lastExecutionDate
     *        The date on which the association was last run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withLastExecutionDate(java.util.Date lastExecutionDate) {
        setLastExecutionDate(lastExecutionDate);
        return this;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param overview
     *        Information about the association.
     */

    public void setOverview(AssociationOverview overview) {
        this.overview = overview;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @return Information about the association.
     */

    public AssociationOverview getOverview() {
        return this.overview;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * 
     * @param overview
     *        Information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withOverview(AssociationOverview overview) {
        setOverview(overview);
        return this;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated Universal
     * Time (UTC).
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated
     *        Universal Time (UTC).
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated Universal
     * Time (UTC).
     * </p>
     * 
     * @return A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated
     *         Universal Time (UTC).
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated Universal
     * Time (UTC).
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression that specifies a schedule when the association runs. The schedule runs in Coordinated
     *        Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The association name.
     * </p>
     * 
     * @param associationName
     *        The association name.
     */

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * The association name.
     * </p>
     * 
     * @return The association name.
     */

    public String getAssociationName() {
        return this.associationName;
    }

    /**
     * <p>
     * The association name.
     * </p>
     * 
     * @param associationName
     *        The association name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withAssociationName(String associationName) {
        setAssociationName(associationName);
        return this;
    }

    /**
     * <p>
     * Number of days to wait after the scheduled day to run an association.
     * </p>
     * 
     * @param scheduleOffset
     *        Number of days to wait after the scheduled day to run an association.
     */

    public void setScheduleOffset(Integer scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
    }

    /**
     * <p>
     * Number of days to wait after the scheduled day to run an association.
     * </p>
     * 
     * @return Number of days to wait after the scheduled day to run an association.
     */

    public Integer getScheduleOffset() {
        return this.scheduleOffset;
    }

    /**
     * <p>
     * Number of days to wait after the scheduled day to run an association.
     * </p>
     * 
     * @param scheduleOffset
     *        Number of days to wait after the scheduled day to run an association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withScheduleOffset(Integer scheduleOffset) {
        setScheduleOffset(scheduleOffset);
        return this;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified
     * together.
     * </p>
     * 
     * @return A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be
     *         specified together.
     */

    public java.util.List<java.util.Map<String, java.util.List<String>>> getTargetMaps() {
        if (targetMaps == null) {
            targetMaps = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>();
        }
        return targetMaps;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified
     * together.
     * </p>
     * 
     * @param targetMaps
     *        A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be
     *        specified together.
     */

    public void setTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        if (targetMaps == null) {
            this.targetMaps = null;
            return;
        }

        this.targetMaps = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>(targetMaps);
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified
     * together.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetMaps(java.util.Collection)} or {@link #withTargetMaps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetMaps
     *        A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be
     *        specified together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withTargetMaps(java.util.Map<String, java.util.List<String>>... targetMaps) {
        if (this.targetMaps == null) {
            setTargetMaps(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, java.util.List<String>>>(targetMaps.length));
        }
        for (java.util.Map<String, java.util.List<String>> ele : targetMaps) {
            this.targetMaps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be specified
     * together.
     * </p>
     * 
     * @param targetMaps
     *        A key-value mapping of document parameters to target resources. Both Targets and TargetMaps can't be
     *        specified together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withTargetMaps(java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: ").append(getAssociationVersion()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: ").append(getLastExecutionDate()).append(",");
        if (getOverview() != null)
            sb.append("Overview: ").append(getOverview()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getAssociationName() != null)
            sb.append("AssociationName: ").append(getAssociationName()).append(",");
        if (getScheduleOffset() != null)
            sb.append("ScheduleOffset: ").append(getScheduleOffset()).append(",");
        if (getTargetMaps() != null)
            sb.append("TargetMaps: ").append(getTargetMaps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Association == false)
            return false;
        Association other = (Association) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        if (other.getOverview() == null ^ this.getOverview() == null)
            return false;
        if (other.getOverview() != null && other.getOverview().equals(this.getOverview()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        if (other.getScheduleOffset() == null ^ this.getScheduleOffset() == null)
            return false;
        if (other.getScheduleOffset() != null && other.getScheduleOffset().equals(this.getScheduleOffset()) == false)
            return false;
        if (other.getTargetMaps() == null ^ this.getTargetMaps() == null)
            return false;
        if (other.getTargetMaps() != null && other.getTargetMaps().equals(this.getTargetMaps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getOverview() == null) ? 0 : getOverview().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        hashCode = prime * hashCode + ((getScheduleOffset() == null) ? 0 : getScheduleOffset().hashCode());
        hashCode = prime * hashCode + ((getTargetMaps() == null) ? 0 : getTargetMaps().hashCode());
        return hashCode;
    }

    @Override
    public Association clone() {
        try {
            return (Association) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
