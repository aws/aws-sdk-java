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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Additional information assigned to the generated finding by GuardDuty.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Service" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Service implements Serializable, Cloneable, StructuredPojo {

    /** Information about the activity described in a finding. */
    private Action action;
    /** Indicates whether this finding is archived. */
    private Boolean archived;
    /** Total count of the occurrences of this finding type. */
    private Integer count;
    /** Detector ID for the GuardDuty service. */
    private String detectorId;
    /** First seen timestamp of the activity that prompted GuardDuty to generate this finding. */
    private String eventFirstSeen;
    /** Last seen timestamp of the activity that prompted GuardDuty to generate this finding. */
    private String eventLastSeen;
    /** Resource role information for this finding. */
    private String resourceRole;
    /** The name of the AWS service (GuardDuty) that generated a finding. */
    private String serviceName;
    /** Feedback left about the finding. */
    private String userFeedback;

    /**
     * Information about the activity described in a finding.
     * 
     * @param action
     *        Information about the activity described in a finding.
     */

    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * Information about the activity described in a finding.
     * 
     * @return Information about the activity described in a finding.
     */

    public Action getAction() {
        return this.action;
    }

    /**
     * Information about the activity described in a finding.
     * 
     * @param action
     *        Information about the activity described in a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withAction(Action action) {
        setAction(action);
        return this;
    }

    /**
     * Indicates whether this finding is archived.
     * 
     * @param archived
     *        Indicates whether this finding is archived.
     */

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * Indicates whether this finding is archived.
     * 
     * @return Indicates whether this finding is archived.
     */

    public Boolean getArchived() {
        return this.archived;
    }

    /**
     * Indicates whether this finding is archived.
     * 
     * @param archived
     *        Indicates whether this finding is archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withArchived(Boolean archived) {
        setArchived(archived);
        return this;
    }

    /**
     * Indicates whether this finding is archived.
     * 
     * @return Indicates whether this finding is archived.
     */

    public Boolean isArchived() {
        return this.archived;
    }

    /**
     * Total count of the occurrences of this finding type.
     * 
     * @param count
     *        Total count of the occurrences of this finding type.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Total count of the occurrences of this finding type.
     * 
     * @return Total count of the occurrences of this finding type.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * Total count of the occurrences of this finding type.
     * 
     * @param count
     *        Total count of the occurrences of this finding type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * Detector ID for the GuardDuty service.
     * 
     * @param detectorId
     *        Detector ID for the GuardDuty service.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * Detector ID for the GuardDuty service.
     * 
     * @return Detector ID for the GuardDuty service.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * Detector ID for the GuardDuty service.
     * 
     * @param detectorId
     *        Detector ID for the GuardDuty service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * 
     * @param eventFirstSeen
     *        First seen timestamp of the activity that prompted GuardDuty to generate this finding.
     */

    public void setEventFirstSeen(String eventFirstSeen) {
        this.eventFirstSeen = eventFirstSeen;
    }

    /**
     * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * 
     * @return First seen timestamp of the activity that prompted GuardDuty to generate this finding.
     */

    public String getEventFirstSeen() {
        return this.eventFirstSeen;
    }

    /**
     * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * 
     * @param eventFirstSeen
     *        First seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEventFirstSeen(String eventFirstSeen) {
        setEventFirstSeen(eventFirstSeen);
        return this;
    }

    /**
     * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * 
     * @param eventLastSeen
     *        Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
     */

    public void setEventLastSeen(String eventLastSeen) {
        this.eventLastSeen = eventLastSeen;
    }

    /**
     * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * 
     * @return Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
     */

    public String getEventLastSeen() {
        return this.eventLastSeen;
    }

    /**
     * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * 
     * @param eventLastSeen
     *        Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEventLastSeen(String eventLastSeen) {
        setEventLastSeen(eventLastSeen);
        return this;
    }

    /**
     * Resource role information for this finding.
     * 
     * @param resourceRole
     *        Resource role information for this finding.
     */

    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }

    /**
     * Resource role information for this finding.
     * 
     * @return Resource role information for this finding.
     */

    public String getResourceRole() {
        return this.resourceRole;
    }

    /**
     * Resource role information for this finding.
     * 
     * @param resourceRole
     *        Resource role information for this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withResourceRole(String resourceRole) {
        setResourceRole(resourceRole);
        return this;
    }

    /**
     * The name of the AWS service (GuardDuty) that generated a finding.
     * 
     * @param serviceName
     *        The name of the AWS service (GuardDuty) that generated a finding.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * The name of the AWS service (GuardDuty) that generated a finding.
     * 
     * @return The name of the AWS service (GuardDuty) that generated a finding.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * The name of the AWS service (GuardDuty) that generated a finding.
     * 
     * @param serviceName
     *        The name of the AWS service (GuardDuty) that generated a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * Feedback left about the finding.
     * 
     * @param userFeedback
     *        Feedback left about the finding.
     */

    public void setUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
    }

    /**
     * Feedback left about the finding.
     * 
     * @return Feedback left about the finding.
     */

    public String getUserFeedback() {
        return this.userFeedback;
    }

    /**
     * Feedback left about the finding.
     * 
     * @param userFeedback
     *        Feedback left about the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withUserFeedback(String userFeedback) {
        setUserFeedback(userFeedback);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArchived() != null)
            sb.append("Archived: ").append(getArchived()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getEventFirstSeen() != null)
            sb.append("EventFirstSeen: ").append(getEventFirstSeen()).append(",");
        if (getEventLastSeen() != null)
            sb.append("EventLastSeen: ").append(getEventLastSeen()).append(",");
        if (getResourceRole() != null)
            sb.append("ResourceRole: ").append(getResourceRole()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getUserFeedback() != null)
            sb.append("UserFeedback: ").append(getUserFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArchived() == null ^ this.getArchived() == null)
            return false;
        if (other.getArchived() != null && other.getArchived().equals(this.getArchived()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getEventFirstSeen() == null ^ this.getEventFirstSeen() == null)
            return false;
        if (other.getEventFirstSeen() != null && other.getEventFirstSeen().equals(this.getEventFirstSeen()) == false)
            return false;
        if (other.getEventLastSeen() == null ^ this.getEventLastSeen() == null)
            return false;
        if (other.getEventLastSeen() != null && other.getEventLastSeen().equals(this.getEventLastSeen()) == false)
            return false;
        if (other.getResourceRole() == null ^ this.getResourceRole() == null)
            return false;
        if (other.getResourceRole() != null && other.getResourceRole().equals(this.getResourceRole()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getUserFeedback() == null ^ this.getUserFeedback() == null)
            return false;
        if (other.getUserFeedback() != null && other.getUserFeedback().equals(this.getUserFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArchived() == null) ? 0 : getArchived().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getEventFirstSeen() == null) ? 0 : getEventFirstSeen().hashCode());
        hashCode = prime * hashCode + ((getEventLastSeen() == null) ? 0 : getEventLastSeen().hashCode());
        hashCode = prime * hashCode + ((getResourceRole() == null) ? 0 : getResourceRole().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getUserFeedback() == null) ? 0 : getUserFeedback().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
