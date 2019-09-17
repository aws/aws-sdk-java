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
 * A count of OpsItems.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsItemSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     */
    private String title;
    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem.
     * </p>
     */
    private java.util.Map<String, OpsItemDataValue> operationalData;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the OpsItem was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * 
     * @return The date and time the OpsItem was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the OpsItem was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the OpsItem was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * 
     * @return The date and time the OpsItem was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the OpsItem was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the OpsItem was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     * 
     * @param priority
     *        The importance of this OpsItem in relation to other OpsItems in the system.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     * 
     * @return The importance of this OpsItem in relation to other OpsItems in the system.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The importance of this OpsItem in relation to other OpsItems in the system.
     * </p>
     * 
     * @param priority
     *        The importance of this OpsItem in relation to other OpsItems in the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * 
     * @param source
     *        The impacted AWS resource.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * 
     * @return The impacted AWS resource.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The impacted AWS resource.
     * </p>
     * 
     * @param source
     *        The impacted AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * 
     * @param status
     *        The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * @see OpsItemStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * 
     * @return The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * @see OpsItemStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * 
     * @param status
     *        The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemStatus
     */

    public OpsItemSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * </p>
     * 
     * @param status
     *        The OpsItem status. Status can be <code>Open</code>, <code>In Progress</code>, or <code>Resolved</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemStatus
     */

    public OpsItemSummary withStatus(OpsItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @return The ID of the OpsItem.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     * 
     * @param title
     *        A short heading that describes the nature of the OpsItem and the impacted resource.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     * 
     * @return A short heading that describes the nature of the OpsItem and the impacted resource.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A short heading that describes the nature of the OpsItem and the impacted resource.
     * </p>
     * 
     * @param title
     *        A short heading that describes the nature of the OpsItem and the impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem.
     * </p>
     * 
     * @return Operational data is custom data that provides useful reference details about the OpsItem.
     */

    public java.util.Map<String, OpsItemDataValue> getOperationalData() {
        return operationalData;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem.
     * </p>
     * 
     * @param operationalData
     *        Operational data is custom data that provides useful reference details about the OpsItem.
     */

    public void setOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        this.operationalData = operationalData;
    }

    /**
     * <p>
     * Operational data is custom data that provides useful reference details about the OpsItem.
     * </p>
     * 
     * @param operationalData
     *        Operational data is custom data that provides useful reference details about the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary withOperationalData(java.util.Map<String, OpsItemDataValue> operationalData) {
        setOperationalData(operationalData);
        return this;
    }

    public OpsItemSummary addOperationalDataEntry(String key, OpsItemDataValue value) {
        if (null == this.operationalData) {
            this.operationalData = new java.util.HashMap<String, OpsItemDataValue>();
        }
        if (this.operationalData.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.operationalData.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OperationalData.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemSummary clearOperationalDataEntries() {
        this.operationalData = null;
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getOperationalData() != null)
            sb.append("OperationalData: ").append(getOperationalData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemSummary == false)
            return false;
        OpsItemSummary other = (OpsItemSummary) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getOperationalData() == null ^ this.getOperationalData() == null)
            return false;
        if (other.getOperationalData() != null && other.getOperationalData().equals(this.getOperationalData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getOperationalData() == null) ? 0 : getOperationalData().hashCode());
        return hashCode;
    }

    @Override
    public OpsItemSummary clone() {
        try {
            return (OpsItemSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsItemSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
