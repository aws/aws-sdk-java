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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDynamicThingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dynamic thing group to update.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The dynamic thing group properties to update.
     * </p>
     */
    private ThingGroupProperties thingGroupProperties;
    /**
     * <p>
     * The expected version of the dynamic thing group to update.
     * </p>
     */
    private Long expectedVersion;
    /**
     * <p>
     * The dynamic thing group index to update.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: 'AWS_Things'.
     * </p>
     * </note>
     */
    private String indexName;
    /**
     * <p>
     * The dynamic thing group search query string to update.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The dynamic thing group query version to update.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     */
    private String queryVersion;

    /**
     * <p>
     * The name of the dynamic thing group to update.
     * </p>
     * 
     * @param thingGroupName
     *        The name of the dynamic thing group to update.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The name of the dynamic thing group to update.
     * </p>
     * 
     * @return The name of the dynamic thing group to update.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The name of the dynamic thing group to update.
     * </p>
     * 
     * @param thingGroupName
     *        The name of the dynamic thing group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDynamicThingGroupRequest withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group properties to update.
     * </p>
     * 
     * @param thingGroupProperties
     *        The dynamic thing group properties to update.
     */

    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    /**
     * <p>
     * The dynamic thing group properties to update.
     * </p>
     * 
     * @return The dynamic thing group properties to update.
     */

    public ThingGroupProperties getThingGroupProperties() {
        return this.thingGroupProperties;
    }

    /**
     * <p>
     * The dynamic thing group properties to update.
     * </p>
     * 
     * @param thingGroupProperties
     *        The dynamic thing group properties to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDynamicThingGroupRequest withThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        setThingGroupProperties(thingGroupProperties);
        return this;
    }

    /**
     * <p>
     * The expected version of the dynamic thing group to update.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the dynamic thing group to update.
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the dynamic thing group to update.
     * </p>
     * 
     * @return The expected version of the dynamic thing group to update.
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * The expected version of the dynamic thing group to update.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the dynamic thing group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDynamicThingGroupRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group index to update.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: 'AWS_Things'.
     * </p>
     * </note>
     * 
     * @param indexName
     *        The dynamic thing group index to update.</p> <note>
     *        <p>
     *        Currently one index is supported: 'AWS_Things'.
     *        </p>
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The dynamic thing group index to update.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: 'AWS_Things'.
     * </p>
     * </note>
     * 
     * @return The dynamic thing group index to update.</p> <note>
     *         <p>
     *         Currently one index is supported: 'AWS_Things'.
     *         </p>
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The dynamic thing group index to update.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: 'AWS_Things'.
     * </p>
     * </note>
     * 
     * @param indexName
     *        The dynamic thing group index to update.</p> <note>
     *        <p>
     *        Currently one index is supported: 'AWS_Things'.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDynamicThingGroupRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group search query string to update.
     * </p>
     * 
     * @param queryString
     *        The dynamic thing group search query string to update.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string to update.
     * </p>
     * 
     * @return The dynamic thing group search query string to update.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string to update.
     * </p>
     * 
     * @param queryString
     *        The dynamic thing group search query string to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDynamicThingGroupRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group query version to update.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     * 
     * @param queryVersion
     *        The dynamic thing group query version to update.</p> <note>
     *        <p>
     *        Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to
     *        this value.
     *        </p>
     */

    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version to update.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     * 
     * @return The dynamic thing group query version to update.</p> <note>
     *         <p>
     *         Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to
     *         this value.
     *         </p>
     */

    public String getQueryVersion() {
        return this.queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version to update.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     * 
     * @param queryVersion
     *        The dynamic thing group query version to update.</p> <note>
     *        <p>
     *        Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to
     *        this value.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDynamicThingGroupRequest withQueryVersion(String queryVersion) {
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
        if (getThingGroupProperties() != null)
            sb.append("ThingGroupProperties: ").append(getThingGroupProperties()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion()).append(",");
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

        if (obj instanceof UpdateDynamicThingGroupRequest == false)
            return false;
        UpdateDynamicThingGroupRequest other = (UpdateDynamicThingGroupRequest) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupProperties() == null ^ this.getThingGroupProperties() == null)
            return false;
        if (other.getThingGroupProperties() != null && other.getThingGroupProperties().equals(this.getThingGroupProperties()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
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
        hashCode = prime * hashCode + ((getThingGroupProperties() == null) ? 0 : getThingGroupProperties().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDynamicThingGroupRequest clone() {
        return (UpdateDynamicThingGroupRequest) super.clone();
    }

}
