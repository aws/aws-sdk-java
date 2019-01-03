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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A logical grouping of Performance Insights metrics for a related subject area. For example, the <code>db.sql</code>
 * dimension group consists of the following dimensions: <code>db.sql.id</code>, <code>db.sql.db_id</code>,
 * <code>db.sql.statement</code>, and <code>db.sql.tokenized_id</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DimensionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dimension group. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.host</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql_tokenized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event_type</code>
     * </p>
     * </li>
     * </ul>
     */
    private String group;
    /**
     * <p>
     * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that
     * all of the dimensions in the group were requested, or are present in the response.
     * </p>
     * <p>
     * Valid values for elements in the <code>Dimensions</code> array are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * db.user.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.user.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.tokenized_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.type
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event_type.name
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> dimensions;
    /**
     * <p>
     * The maximum number of items to fetch for this dimension group.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the dimension group. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.host</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql_tokenized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event_type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param group
     *        The name of the dimension group. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.user</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.host</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql_tokenized</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.wait_event</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.wait_event_type</code>
     *        </p>
     *        </li>
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the dimension group. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.host</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql_tokenized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event_type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the dimension group. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.user</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.host</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sql_tokenized</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.wait_event</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.wait_event_type</code>
     *         </p>
     *         </li>
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the dimension group. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.user</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.host</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql_tokenized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.wait_event_type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param group
     *        The name of the dimension group. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.user</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.host</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql_tokenized</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.wait_event</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.wait_event_type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroup withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that
     * all of the dimensions in the group were requested, or are present in the response.
     * </p>
     * <p>
     * Valid values for elements in the <code>Dimensions</code> array are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * db.user.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.user.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.tokenized_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.type
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event_type.name
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies
     *         that all of the dimensions in the group were requested, or are present in the response.</p>
     *         <p>
     *         Valid values for elements in the <code>Dimensions</code> array are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         db.user.id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.user.name
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.host.id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.host.name
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql.id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql.db_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql.statement
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql.tokenized_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql_tokenized.id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql_tokenized.db_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.sql_tokenized.statement
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.wait_event.name
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.wait_event.type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         db.wait_event_type.name
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that
     * all of the dimensions in the group were requested, or are present in the response.
     * </p>
     * <p>
     * Valid values for elements in the <code>Dimensions</code> array are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * db.user.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.user.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.tokenized_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.type
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event_type.name
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimensions
     *        A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies
     *        that all of the dimensions in the group were requested, or are present in the response.</p>
     *        <p>
     *        Valid values for elements in the <code>Dimensions</code> array are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        db.user.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.user.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.host.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.host.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.db_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.statement
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.tokenized_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.db_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.statement
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event.type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event_type.name
     *        </p>
     *        </li>
     */

    public void setDimensions(java.util.Collection<String> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<String>(dimensions);
    }

    /**
     * <p>
     * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that
     * all of the dimensions in the group were requested, or are present in the response.
     * </p>
     * <p>
     * Valid values for elements in the <code>Dimensions</code> array are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * db.user.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.user.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.tokenized_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.type
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event_type.name
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies
     *        that all of the dimensions in the group were requested, or are present in the response.</p>
     *        <p>
     *        Valid values for elements in the <code>Dimensions</code> array are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        db.user.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.user.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.host.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.host.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.db_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.statement
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.tokenized_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.db_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.statement
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event.type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event_type.name
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroup withDimensions(String... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<String>(dimensions.length));
        }
        for (String ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that
     * all of the dimensions in the group were requested, or are present in the response.
     * </p>
     * <p>
     * Valid values for elements in the <code>Dimensions</code> array are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * db.user.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.user.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.host.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql.tokenized_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.db_id
     * </p>
     * </li>
     * <li>
     * <p>
     * db.sql_tokenized.statement
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.name
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event.type
     * </p>
     * </li>
     * <li>
     * <p>
     * db.wait_event_type.name
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimensions
     *        A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies
     *        that all of the dimensions in the group were requested, or are present in the response.</p>
     *        <p>
     *        Valid values for elements in the <code>Dimensions</code> array are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        db.user.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.user.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.host.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.host.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.db_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.statement
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql.tokenized_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.db_id
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.sql_tokenized.statement
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event.name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event.type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        db.wait_event_type.name
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroup withDimensions(java.util.Collection<String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to fetch for this dimension group.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to fetch for this dimension group.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to fetch for this dimension group.
     * </p>
     * 
     * @return The maximum number of items to fetch for this dimension group.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to fetch for this dimension group.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to fetch for this dimension group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroup withLimit(Integer limit) {
        setLimit(limit);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionGroup == false)
            return false;
        DimensionGroup other = (DimensionGroup) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DimensionGroup clone() {
        try {
            return (DimensionGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DimensionGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
