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
 * Describes an association of a Systems Manager document and an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Association" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Association implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the instance.
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
     * The version of the document used in the association.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The instances targeted by the request to create an association.
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
     * A cron expression that specifies a schedule when the association runs.
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

    public Association withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
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
     * The version of the document used in the association.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document used in the association.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document used in the association.
     * </p>
     * 
     * @return The version of the document used in the association.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document used in the association.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document used in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Association withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     * 
     * @return The instances targeted by the request to create an association.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     * 
     * @param targets
     *        The instances targeted by the request to create an association.
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
     * The instances targeted by the request to create an association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The instances targeted by the request to create an association.
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
     * The instances targeted by the request to create an association.
     * </p>
     * 
     * @param targets
     *        The instances targeted by the request to create an association.
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
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression that specifies a schedule when the association runs.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * 
     * @return A cron expression that specifies a schedule when the association runs.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression that specifies a schedule when the association runs.
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
