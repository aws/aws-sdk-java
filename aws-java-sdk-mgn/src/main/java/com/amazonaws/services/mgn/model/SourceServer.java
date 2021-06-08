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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/SourceServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source server ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Source server data replication info.
     * </p>
     */
    private DataReplicationInfo dataReplicationInfo;
    /**
     * <p>
     * Source server archived status.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * Source server launched instance.
     * </p>
     */
    private LaunchedInstance launchedInstance;
    /**
     * <p>
     * Source server lifecycle state.
     * </p>
     */
    private LifeCycle lifeCycle;
    /**
     * <p>
     * Source server properties.
     * </p>
     */
    private SourceProperties sourceProperties;
    /**
     * <p>
     * Source server ID.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Source server Tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Source server ARN.
     * </p>
     * 
     * @param arn
     *        Source server ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Source server ARN.
     * </p>
     * 
     * @return Source server ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Source server ARN.
     * </p>
     * 
     * @param arn
     *        Source server ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Source server data replication info.
     * </p>
     * 
     * @param dataReplicationInfo
     *        Source server data replication info.
     */

    public void setDataReplicationInfo(DataReplicationInfo dataReplicationInfo) {
        this.dataReplicationInfo = dataReplicationInfo;
    }

    /**
     * <p>
     * Source server data replication info.
     * </p>
     * 
     * @return Source server data replication info.
     */

    public DataReplicationInfo getDataReplicationInfo() {
        return this.dataReplicationInfo;
    }

    /**
     * <p>
     * Source server data replication info.
     * </p>
     * 
     * @param dataReplicationInfo
     *        Source server data replication info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withDataReplicationInfo(DataReplicationInfo dataReplicationInfo) {
        setDataReplicationInfo(dataReplicationInfo);
        return this;
    }

    /**
     * <p>
     * Source server archived status.
     * </p>
     * 
     * @param isArchived
     *        Source server archived status.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Source server archived status.
     * </p>
     * 
     * @return Source server archived status.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Source server archived status.
     * </p>
     * 
     * @param isArchived
     *        Source server archived status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Source server archived status.
     * </p>
     * 
     * @return Source server archived status.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Source server launched instance.
     * </p>
     * 
     * @param launchedInstance
     *        Source server launched instance.
     */

    public void setLaunchedInstance(LaunchedInstance launchedInstance) {
        this.launchedInstance = launchedInstance;
    }

    /**
     * <p>
     * Source server launched instance.
     * </p>
     * 
     * @return Source server launched instance.
     */

    public LaunchedInstance getLaunchedInstance() {
        return this.launchedInstance;
    }

    /**
     * <p>
     * Source server launched instance.
     * </p>
     * 
     * @param launchedInstance
     *        Source server launched instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withLaunchedInstance(LaunchedInstance launchedInstance) {
        setLaunchedInstance(launchedInstance);
        return this;
    }

    /**
     * <p>
     * Source server lifecycle state.
     * </p>
     * 
     * @param lifeCycle
     *        Source server lifecycle state.
     */

    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    /**
     * <p>
     * Source server lifecycle state.
     * </p>
     * 
     * @return Source server lifecycle state.
     */

    public LifeCycle getLifeCycle() {
        return this.lifeCycle;
    }

    /**
     * <p>
     * Source server lifecycle state.
     * </p>
     * 
     * @param lifeCycle
     *        Source server lifecycle state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withLifeCycle(LifeCycle lifeCycle) {
        setLifeCycle(lifeCycle);
        return this;
    }

    /**
     * <p>
     * Source server properties.
     * </p>
     * 
     * @param sourceProperties
     *        Source server properties.
     */

    public void setSourceProperties(SourceProperties sourceProperties) {
        this.sourceProperties = sourceProperties;
    }

    /**
     * <p>
     * Source server properties.
     * </p>
     * 
     * @return Source server properties.
     */

    public SourceProperties getSourceProperties() {
        return this.sourceProperties;
    }

    /**
     * <p>
     * Source server properties.
     * </p>
     * 
     * @param sourceProperties
     *        Source server properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withSourceProperties(SourceProperties sourceProperties) {
        setSourceProperties(sourceProperties);
        return this;
    }

    /**
     * <p>
     * Source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Source server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Source server ID.
     * </p>
     * 
     * @return Source server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Source server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Source server Tags.
     * </p>
     * 
     * @return Source server Tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Source server Tags.
     * </p>
     * 
     * @param tags
     *        Source server Tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Source server Tags.
     * </p>
     * 
     * @param tags
     *        Source server Tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SourceServer#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer addTagsEntry(String key, String value) {
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

    public SourceServer clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataReplicationInfo() != null)
            sb.append("DataReplicationInfo: ").append(getDataReplicationInfo()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLaunchedInstance() != null)
            sb.append("LaunchedInstance: ").append(getLaunchedInstance()).append(",");
        if (getLifeCycle() != null)
            sb.append("LifeCycle: ").append(getLifeCycle()).append(",");
        if (getSourceProperties() != null)
            sb.append("SourceProperties: ").append(getSourceProperties()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceServer == false)
            return false;
        SourceServer other = (SourceServer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataReplicationInfo() == null ^ this.getDataReplicationInfo() == null)
            return false;
        if (other.getDataReplicationInfo() != null && other.getDataReplicationInfo().equals(this.getDataReplicationInfo()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLaunchedInstance() == null ^ this.getLaunchedInstance() == null)
            return false;
        if (other.getLaunchedInstance() != null && other.getLaunchedInstance().equals(this.getLaunchedInstance()) == false)
            return false;
        if (other.getLifeCycle() == null ^ this.getLifeCycle() == null)
            return false;
        if (other.getLifeCycle() != null && other.getLifeCycle().equals(this.getLifeCycle()) == false)
            return false;
        if (other.getSourceProperties() == null ^ this.getSourceProperties() == null)
            return false;
        if (other.getSourceProperties() != null && other.getSourceProperties().equals(this.getSourceProperties()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataReplicationInfo() == null) ? 0 : getDataReplicationInfo().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLaunchedInstance() == null) ? 0 : getLaunchedInstance().hashCode());
        hashCode = prime * hashCode + ((getLifeCycle() == null) ? 0 : getLifeCycle().hashCode());
        hashCode = prime * hashCode + ((getSourceProperties() == null) ? 0 : getSourceProperties().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SourceServer clone() {
        try {
            return (SourceServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.SourceServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
