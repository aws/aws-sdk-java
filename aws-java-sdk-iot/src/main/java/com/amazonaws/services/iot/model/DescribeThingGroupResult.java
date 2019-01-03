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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing group.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The thing group ID.
     * </p>
     */
    private String thingGroupId;
    /**
     * <p>
     * The thing group ARN.
     * </p>
     */
    private String thingGroupArn;
    /**
     * <p>
     * The version of the thing group.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The thing group properties.
     * </p>
     */
    private ThingGroupProperties thingGroupProperties;
    /**
     * <p>
     * Thing group metadata.
     * </p>
     */
    private ThingGroupMetadata thingGroupMetadata;
    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     */
    private String queryVersion;
    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * 
     * @param thingGroupName
     *        The name of the thing group.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * 
     * @return The name of the thing group.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The name of the thing group.
     * </p>
     * 
     * @param thingGroupName
     *        The name of the thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * 
     * @param thingGroupId
     *        The thing group ID.
     */

    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * 
     * @return The thing group ID.
     */

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * 
     * @param thingGroupId
     *        The thing group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withThingGroupId(String thingGroupId) {
        setThingGroupId(thingGroupId);
        return this;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     * 
     * @param thingGroupArn
     *        The thing group ARN.
     */

    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     * 
     * @return The thing group ARN.
     */

    public String getThingGroupArn() {
        return this.thingGroupArn;
    }

    /**
     * <p>
     * The thing group ARN.
     * </p>
     * 
     * @param thingGroupArn
     *        The thing group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withThingGroupArn(String thingGroupArn) {
        setThingGroupArn(thingGroupArn);
        return this;
    }

    /**
     * <p>
     * The version of the thing group.
     * </p>
     * 
     * @param version
     *        The version of the thing group.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the thing group.
     * </p>
     * 
     * @return The version of the thing group.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the thing group.
     * </p>
     * 
     * @param version
     *        The version of the thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * 
     * @param thingGroupProperties
     *        The thing group properties.
     */

    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * 
     * @return The thing group properties.
     */

    public ThingGroupProperties getThingGroupProperties() {
        return this.thingGroupProperties;
    }

    /**
     * <p>
     * The thing group properties.
     * </p>
     * 
     * @param thingGroupProperties
     *        The thing group properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        setThingGroupProperties(thingGroupProperties);
        return this;
    }

    /**
     * <p>
     * Thing group metadata.
     * </p>
     * 
     * @param thingGroupMetadata
     *        Thing group metadata.
     */

    public void setThingGroupMetadata(ThingGroupMetadata thingGroupMetadata) {
        this.thingGroupMetadata = thingGroupMetadata;
    }

    /**
     * <p>
     * Thing group metadata.
     * </p>
     * 
     * @return Thing group metadata.
     */

    public ThingGroupMetadata getThingGroupMetadata() {
        return this.thingGroupMetadata;
    }

    /**
     * <p>
     * Thing group metadata.
     * </p>
     * 
     * @param thingGroupMetadata
     *        Thing group metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withThingGroupMetadata(ThingGroupMetadata thingGroupMetadata) {
        setThingGroupMetadata(thingGroupMetadata);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * 
     * @param indexName
     *        The dynamic thing group index name.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * 
     * @return The dynamic thing group index name.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * 
     * @param indexName
     *        The dynamic thing group index name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * 
     * @param queryString
     *        The dynamic thing group search query string.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * 
     * @return The dynamic thing group search query string.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * 
     * @param queryString
     *        The dynamic thing group search query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * 
     * @param queryVersion
     *        The dynamic thing group query version.
     */

    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * 
     * @return The dynamic thing group query version.
     */

    public String getQueryVersion() {
        return this.queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * 
     * @param queryVersion
     *        The dynamic thing group query version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingGroupResult withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * 
     * @param status
     *        The dynamic thing group status.
     * @see DynamicGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * 
     * @return The dynamic thing group status.
     * @see DynamicGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * 
     * @param status
     *        The dynamic thing group status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamicGroupStatus
     */

    public DescribeThingGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group status.
     * </p>
     * 
     * @param status
     *        The dynamic thing group status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamicGroupStatus
     */

    public DescribeThingGroupResult withStatus(DynamicGroupStatus status) {
        this.status = status.toString();
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
        if (getThingGroupName() != null)
            sb.append("ThingGroupName: ").append(getThingGroupName()).append(",");
        if (getThingGroupId() != null)
            sb.append("ThingGroupId: ").append(getThingGroupId()).append(",");
        if (getThingGroupArn() != null)
            sb.append("ThingGroupArn: ").append(getThingGroupArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getThingGroupProperties() != null)
            sb.append("ThingGroupProperties: ").append(getThingGroupProperties()).append(",");
        if (getThingGroupMetadata() != null)
            sb.append("ThingGroupMetadata: ").append(getThingGroupMetadata()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getQueryVersion() != null)
            sb.append("QueryVersion: ").append(getQueryVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingGroupResult == false)
            return false;
        DescribeThingGroupResult other = (DescribeThingGroupResult) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getThingGroupProperties() == null ^ this.getThingGroupProperties() == null)
            return false;
        if (other.getThingGroupProperties() != null && other.getThingGroupProperties().equals(this.getThingGroupProperties()) == false)
            return false;
        if (other.getThingGroupMetadata() == null ^ this.getThingGroupMetadata() == null)
            return false;
        if (other.getThingGroupMetadata() != null && other.getThingGroupMetadata().equals(this.getThingGroupMetadata()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        hashCode = prime * hashCode + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getThingGroupProperties() == null) ? 0 : getThingGroupProperties().hashCode());
        hashCode = prime * hashCode + ((getThingGroupMetadata() == null) ? 0 : getThingGroupMetadata().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThingGroupResult clone() {
        try {
            return (DescribeThingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
