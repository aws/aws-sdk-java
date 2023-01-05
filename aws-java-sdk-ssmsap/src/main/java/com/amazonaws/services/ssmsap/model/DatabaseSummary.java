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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DatabaseSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseSummary implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String applicationId;
    /** <p/> */
    private String componentId;
    /** <p/> */
    private String databaseId;
    /** <p/> */
    private String databaseType;
    /** <p/> */
    private String arn;
    /** <p/> */
    private java.util.Map<String, String> tags;

    /**
     * <p/>
     * 
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p/>
     * 
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param componentId
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p/>
     * 
     * @param componentId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param databaseId
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p/>
     * 
     * @param databaseId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param databaseType
     * @see DatabaseType
     */

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see DatabaseType
     */

    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * <p/>
     * 
     * @param databaseType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseType
     */

    public DatabaseSummary withDatabaseType(String databaseType) {
        setDatabaseType(databaseType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param databaseType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseType
     */

    public DatabaseSummary withDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p/>
     * 
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p/>
     * 
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p/>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DatabaseSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseSummary clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
        if (getDatabaseType() != null)
            sb.append("DatabaseType: ").append(getDatabaseType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseSummary == false)
            return false;
        DatabaseSummary other = (DatabaseSummary) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getDatabaseType() == null ^ this.getDatabaseType() == null)
            return false;
        if (other.getDatabaseType() != null && other.getDatabaseType().equals(this.getDatabaseType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseType() == null) ? 0 : getDatabaseType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseSummary clone() {
        try {
            return (DatabaseSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.DatabaseSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
