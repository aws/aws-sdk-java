/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     */
    private String actionArn;
    /**
     * <p>
     * The source of the action.
     * </p>
     */
    private ActionSource source;
    /**
     * <p>
     * The type of the action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The description of the action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A list of the action's properties.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * When the action was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * When the action was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;

    private MetadataProperties metadataProperties;

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @param actionArn
     *        The Amazon Resource Name (ARN) of the action.
     */

    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the action.
     */

    public String getActionArn() {
        return this.actionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @param actionArn
     *        The Amazon Resource Name (ARN) of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withActionArn(String actionArn) {
        setActionArn(actionArn);
        return this;
    }

    /**
     * <p>
     * The source of the action.
     * </p>
     * 
     * @param source
     *        The source of the action.
     */

    public void setSource(ActionSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the action.
     * </p>
     * 
     * @return The source of the action.
     */

    public ActionSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the action.
     * </p>
     * 
     * @param source
     *        The source of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withSource(ActionSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of the action.
     * </p>
     * 
     * @param actionType
     *        The type of the action.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of the action.
     * </p>
     * 
     * @return The type of the action.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of the action.
     * </p>
     * 
     * @param actionType
     *        The type of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The description of the action.
     * </p>
     * 
     * @param description
     *        The description of the action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the action.
     * </p>
     * 
     * @return The description of the action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the action.
     * </p>
     * 
     * @param description
     *        The description of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public DescribeActionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public DescribeActionResult withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of the action's properties.
     * </p>
     * 
     * @return A list of the action's properties.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of the action's properties.
     * </p>
     * 
     * @param properties
     *        A list of the action's properties.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of the action's properties.
     * </p>
     * 
     * @param properties
     *        A list of the action's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see DescribeActionResult#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * When the action was created.
     * </p>
     * 
     * @param creationTime
     *        When the action was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the action was created.
     * </p>
     * 
     * @return When the action was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the action was created.
     * </p>
     * 
     * @param creationTime
     *        When the action was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the action was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the action was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the action was last modified.
     * </p>
     * 
     * @return When the action was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the action was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the action was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionArn() != null)
            sb.append("ActionArn: ").append(getActionArn()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActionResult == false)
            return false;
        DescribeActionResult other = (DescribeActionResult) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActionResult clone() {
        try {
            return (DescribeActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
