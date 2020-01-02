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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a change set returned in a list of change sets when the <code>ListChangeSets</code> action is called.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ChangeSetSummaryListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSetSummaryListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for a change set.
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     */
    private String changeSetArn;
    /**
     * <p>
     * The non-unique name for the change set.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The current status of the change set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of
     * 20 entities. It must contain at least one entity.
     * </p>
     */
    private java.util.List<String> entityIdList;

    /**
     * <p>
     * The unique identifier for a change set.
     * </p>
     * 
     * @param changeSetId
     *        The unique identifier for a change set.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The unique identifier for a change set.
     * </p>
     * 
     * @return The unique identifier for a change set.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * The unique identifier for a change set.
     * </p>
     * 
     * @param changeSetId
     *        The unique identifier for a change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param changeSetArn
     *        The ARN associated with the unique identifier for the change set referenced in this request.
     */

    public void setChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @return The ARN associated with the unique identifier for the change set referenced in this request.
     */

    public String getChangeSetArn() {
        return this.changeSetArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param changeSetArn
     *        The ARN associated with the unique identifier for the change set referenced in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withChangeSetArn(String changeSetArn) {
        setChangeSetArn(changeSetArn);
        return this;
    }

    /**
     * <p>
     * The non-unique name for the change set.
     * </p>
     * 
     * @param changeSetName
     *        The non-unique name for the change set.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The non-unique name for the change set.
     * </p>
     * 
     * @return The non-unique name for the change set.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The non-unique name for the change set.
     * </p>
     * 
     * @param changeSetName
     *        The non-unique name for the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     * </p>
     * 
     * @param startTime
     *        The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     * </p>
     * 
     * @return The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     * </p>
     * 
     * @param startTime
     *        The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     * </p>
     * 
     * @param endTime
     *        The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     * </p>
     * 
     * @return The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     * </p>
     * 
     * @param endTime
     *        The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The current status of the change set.
     * </p>
     * 
     * @param status
     *        The current status of the change set.
     * @see ChangeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the change set.
     * </p>
     * 
     * @return The current status of the change set.
     * @see ChangeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the change set.
     * </p>
     * 
     * @param status
     *        The current status of the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public ChangeSetSummaryListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the change set.
     * </p>
     * 
     * @param status
     *        The current status of the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public ChangeSetSummaryListItem withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of
     * 20 entities. It must contain at least one entity.
     * </p>
     * 
     * @return This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a
     *         maximum of 20 entities. It must contain at least one entity.
     */

    public java.util.List<String> getEntityIdList() {
        return entityIdList;
    }

    /**
     * <p>
     * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of
     * 20 entities. It must contain at least one entity.
     * </p>
     * 
     * @param entityIdList
     *        This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a
     *        maximum of 20 entities. It must contain at least one entity.
     */

    public void setEntityIdList(java.util.Collection<String> entityIdList) {
        if (entityIdList == null) {
            this.entityIdList = null;
            return;
        }

        this.entityIdList = new java.util.ArrayList<String>(entityIdList);
    }

    /**
     * <p>
     * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of
     * 20 entities. It must contain at least one entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityIdList(java.util.Collection)} or {@link #withEntityIdList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityIdList
     *        This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a
     *        maximum of 20 entities. It must contain at least one entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withEntityIdList(String... entityIdList) {
        if (this.entityIdList == null) {
            setEntityIdList(new java.util.ArrayList<String>(entityIdList.length));
        }
        for (String ele : entityIdList) {
            this.entityIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of
     * 20 entities. It must contain at least one entity.
     * </p>
     * 
     * @param entityIdList
     *        This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a
     *        maximum of 20 entities. It must contain at least one entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummaryListItem withEntityIdList(java.util.Collection<String> entityIdList) {
        setEntityIdList(entityIdList);
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
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getChangeSetArn() != null)
            sb.append("ChangeSetArn: ").append(getChangeSetArn()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEntityIdList() != null)
            sb.append("EntityIdList: ").append(getEntityIdList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetSummaryListItem == false)
            return false;
        ChangeSetSummaryListItem other = (ChangeSetSummaryListItem) obj;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetArn() == null ^ this.getChangeSetArn() == null)
            return false;
        if (other.getChangeSetArn() != null && other.getChangeSetArn().equals(this.getChangeSetArn()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEntityIdList() == null ^ this.getEntityIdList() == null)
            return false;
        if (other.getEntityIdList() != null && other.getEntityIdList().equals(this.getEntityIdList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetArn() == null) ? 0 : getChangeSetArn().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEntityIdList() == null) ? 0 : getEntityIdList().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSetSummaryListItem clone() {
        try {
            return (ChangeSetSummaryListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ChangeSetSummaryListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
