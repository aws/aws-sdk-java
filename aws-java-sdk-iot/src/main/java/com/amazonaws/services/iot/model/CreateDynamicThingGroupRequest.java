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
public class CreateDynamicThingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     */
    private ThingGroupProperties thingGroupProperties;
    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     */
    private String indexName;
    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a> for
     * information about query string syntax.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The dynamic thing group query version.
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
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * 
     * @param thingGroupName
     *        The dynamic thing group name to create.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * 
     * @return The dynamic thing group name to create.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * 
     * @param thingGroupName
     *        The dynamic thing group name to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     * 
     * @param thingGroupProperties
     *        The dynamic thing group properties.
     */

    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     * 
     * @return The dynamic thing group properties.
     */

    public ThingGroupProperties getThingGroupProperties() {
        return this.thingGroupProperties;
    }

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     * 
     * @param thingGroupProperties
     *        The dynamic thing group properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        setThingGroupProperties(thingGroupProperties);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * 
     * @param indexName
     *        The dynamic thing group index name.</p> <note>
     *        <p>
     *        Currently one index is supported: "AWS_Things".
     *        </p>
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * 
     * @return The dynamic thing group index name.</p> <note>
     *         <p>
     *         Currently one index is supported: "AWS_Things".
     *         </p>
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * 
     * @param indexName
     *        The dynamic thing group index name.</p> <note>
     *        <p>
     *        Currently one index is supported: "AWS_Things".
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a> for
     * information about query string syntax.
     * </p>
     * 
     * @param queryString
     *        The dynamic thing group search query string.</p>
     *        <p>
     *        See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a> for
     *        information about query string syntax.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a> for
     * information about query string syntax.
     * </p>
     * 
     * @return The dynamic thing group search query string.</p>
     *         <p>
     *         See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a>
     *         for information about query string syntax.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a> for
     * information about query string syntax.
     * </p>
     * 
     * @param queryString
     *        The dynamic thing group search query string.</p>
     *        <p>
     *        See <a href="https://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html">Query Syntax</a> for
     *        information about query string syntax.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     * 
     * @param queryVersion
     *        The dynamic thing group query version.</p> <note>
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
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     * 
     * @return The dynamic thing group query version.</p> <note>
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
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this
     * value.
     * </p>
     * </note>
     * 
     * @param queryVersion
     *        The dynamic thing group query version.</p> <note>
     *        <p>
     *        Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to
     *        this value.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     * 
     * @return Metadata which can be used to manage the dynamic thing group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the dynamic thing group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the dynamic thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the dynamic thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDynamicThingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getQueryVersion() != null)
            sb.append("QueryVersion: ").append(getQueryVersion()).append(",");
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

        if (obj instanceof CreateDynamicThingGroupRequest == false)
            return false;
        CreateDynamicThingGroupRequest other = (CreateDynamicThingGroupRequest) obj;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupProperties() == null ^ this.getThingGroupProperties() == null)
            return false;
        if (other.getThingGroupProperties() != null && other.getThingGroupProperties().equals(this.getThingGroupProperties()) == false)
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

        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupProperties() == null) ? 0 : getThingGroupProperties().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDynamicThingGroupRequest clone() {
        return (CreateDynamicThingGroupRequest) super.clone();
    }

}
