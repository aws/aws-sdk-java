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
public class CreateDynamicThingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The dynamic thing group name.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The dynamic thing group ARN.
     * </p>
     */
    private String thingGroupArn;
    /**
     * <p>
     * The dynamic thing group ID.
     * </p>
     */
    private String thingGroupId;
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
     * The dynamic thing group name.
     * </p>
     * 
     * @param thingGroupName
     *        The dynamic thing group name.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The dynamic thing group name.
     * </p>
     * 
     * @return The dynamic thing group name.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The dynamic thing group name.
     * </p>
     * 
     * @param thingGroupName
     *        The dynamic thing group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupResult withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group ARN.
     * </p>
     * 
     * @param thingGroupArn
     *        The dynamic thing group ARN.
     */

    public void setThingGroupArn(String thingGroupArn) {
        this.thingGroupArn = thingGroupArn;
    }

    /**
     * <p>
     * The dynamic thing group ARN.
     * </p>
     * 
     * @return The dynamic thing group ARN.
     */

    public String getThingGroupArn() {
        return this.thingGroupArn;
    }

    /**
     * <p>
     * The dynamic thing group ARN.
     * </p>
     * 
     * @param thingGroupArn
     *        The dynamic thing group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupResult withThingGroupArn(String thingGroupArn) {
        setThingGroupArn(thingGroupArn);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group ID.
     * </p>
     * 
     * @param thingGroupId
     *        The dynamic thing group ID.
     */

    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The dynamic thing group ID.
     * </p>
     * 
     * @return The dynamic thing group ID.
     */

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    /**
     * <p>
     * The dynamic thing group ID.
     * </p>
     * 
     * @param thingGroupId
     *        The dynamic thing group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupResult withThingGroupId(String thingGroupId) {
        setThingGroupId(thingGroupId);
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

    public CreateDynamicThingGroupResult withIndexName(String indexName) {
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

    public CreateDynamicThingGroupResult withQueryString(String queryString) {
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

    public CreateDynamicThingGroupResult withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
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
        if (getThingGroupArn() != null)
            sb.append("ThingGroupArn: ").append(getThingGroupArn()).append(",");
        if (getThingGroupId() != null)
            sb.append("ThingGroupId: ").append(getThingGroupId()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getQueryVersion() != null)
            sb.append("QueryVersion: ").append(getQueryVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDynamicThingGroupResult == false)
            return false;
        CreateDynamicThingGroupResult other = (CreateDynamicThingGroupResult) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupArn() == null ^ this.getThingGroupArn() == null)
            return false;
        if (other.getThingGroupArn() != null && other.getThingGroupArn().equals(this.getThingGroupArn()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null && other.getThingGroupId().equals(this.getThingGroupId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupArn() == null) ? 0 : getThingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDynamicThingGroupResult clone() {
        try {
            return (CreateDynamicThingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
