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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The query that is used to define a resource group or a search for resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ResourceQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     * <code>CLOUDFORMATION_STACK_1_0</code>.
     * </p>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag filters for
     * resource types and tags, as supported by the AWS Tagging API <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     * >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys, and at
     * least one value of each specified tag key, are returned in your query. If you specify more than one value for a
     * tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each. (
     * <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The results of
     * this query might include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     * <code>{"Key":"Version","Value":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and {"Key":"Version","Value":"1"}
     * </p>
     * </li>
     * </ul>
     * <p>
     * The query would not return the following results, however. The following EC2 instance does not have all tag keys
     * specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at
     * least one of the specified tag key values in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     * <code>{"Key":"Version","Value":"4"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack ARN.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The query that defines a group or a search.
     * </p>
     */
    private String query;

    /**
     * <p>
     * The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     * <code>CLOUDFORMATION_STACK_1_0</code>.
     * </p>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag filters for
     * resource types and tags, as supported by the AWS Tagging API <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     * >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys, and at
     * least one value of each specified tag key, are returned in your query. If you specify more than one value for a
     * tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each. (
     * <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The results of
     * this query might include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     * <code>{"Key":"Version","Value":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and {"Key":"Version","Value":"1"}
     * </p>
     * </li>
     * </ul>
     * <p>
     * The query would not return the following results, however. The following EC2 instance does not have all tag keys
     * specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at
     * least one of the specified tag key values in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     * <code>{"Key":"Version","Value":"4"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack ARN.
     * </p>
     * 
     * @param type
     *        The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     *        <code>CLOUDFORMATION_STACK_1_0</code>.</p>
     *        <p>
     *        <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag
     *        filters for resource types and tags, as supported by the AWS Tagging API <a
     *        href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     *        >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys,
     *        and at least one value of each specified tag key, are returned in your query. If you specify more than one
     *        value for a tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of
     *        the specified values.
     *        </p>
     *        <p>
     *        For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *        <code>Version</code>, with two values each. (
     *        <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The
     *        results of this query might include the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     *        <code>{"Key":"Version","Value":"2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and
     *        {"Key":"Version","Value":"1"}
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The query would not return the following results, however. The following EC2 instance does not have all
     *        tag keys specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no
     *        values that match at least one of the specified tag key values in the filter.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     *        <code>{"Key":"Version","Value":"4"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack
     *        ARN.
     * @see QueryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     * <code>CLOUDFORMATION_STACK_1_0</code>.
     * </p>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag filters for
     * resource types and tags, as supported by the AWS Tagging API <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     * >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys, and at
     * least one value of each specified tag key, are returned in your query. If you specify more than one value for a
     * tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each. (
     * <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The results of
     * this query might include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     * <code>{"Key":"Version","Value":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and {"Key":"Version","Value":"1"}
     * </p>
     * </li>
     * </ul>
     * <p>
     * The query would not return the following results, however. The following EC2 instance does not have all tag keys
     * specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at
     * least one of the specified tag key values in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     * <code>{"Key":"Version","Value":"4"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack ARN.
     * </p>
     * 
     * @return The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     *         <code>CLOUDFORMATION_STACK_1_0</code>.</p>
     *         <p>
     *         <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag
     *         filters for resource types and tags, as supported by the AWS Tagging API <a
     *         href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     *         >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag
     *         keys, and at least one value of each specified tag key, are returned in your query. If you specify more
     *         than one value for a tag key, a resource matches the filter if it has a tag key value that matches
     *         <i>any</i> of the specified values.
     *         </p>
     *         <p>
     *         For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *         <code>Version</code>, with two values each. (
     *         <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The
     *         results of this query might include the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     *         <code>{"Key":"Version","Value":"2"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and
     *         {"Key":"Version","Value":"1"}
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The query would not return the following results, however. The following EC2 instance does not have all
     *         tag keys specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no
     *         values that match at least one of the specified tag key values in the filter.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     *         <code>{"Key":"Version","Value":"4"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation
     *         stack ARN.
     * @see QueryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     * <code>CLOUDFORMATION_STACK_1_0</code>.
     * </p>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag filters for
     * resource types and tags, as supported by the AWS Tagging API <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     * >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys, and at
     * least one value of each specified tag key, are returned in your query. If you specify more than one value for a
     * tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each. (
     * <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The results of
     * this query might include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     * <code>{"Key":"Version","Value":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and {"Key":"Version","Value":"1"}
     * </p>
     * </li>
     * </ul>
     * <p>
     * The query would not return the following results, however. The following EC2 instance does not have all tag keys
     * specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at
     * least one of the specified tag key values in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     * <code>{"Key":"Version","Value":"4"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack ARN.
     * </p>
     * 
     * @param type
     *        The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     *        <code>CLOUDFORMATION_STACK_1_0</code>.</p>
     *        <p>
     *        <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag
     *        filters for resource types and tags, as supported by the AWS Tagging API <a
     *        href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     *        >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys,
     *        and at least one value of each specified tag key, are returned in your query. If you specify more than one
     *        value for a tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of
     *        the specified values.
     *        </p>
     *        <p>
     *        For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *        <code>Version</code>, with two values each. (
     *        <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The
     *        results of this query might include the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     *        <code>{"Key":"Version","Value":"2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and
     *        {"Key":"Version","Value":"1"}
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The query would not return the following results, however. The following EC2 instance does not have all
     *        tag keys specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no
     *        values that match at least one of the specified tag key values in the filter.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     *        <code>{"Key":"Version","Value":"4"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack
     *        ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryType
     */

    public ResourceQuery withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     * <code>CLOUDFORMATION_STACK_1_0</code>.
     * </p>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag filters for
     * resource types and tags, as supported by the AWS Tagging API <a
     * href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     * >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys, and at
     * least one value of each specified tag key, are returned in your query. If you specify more than one value for a
     * tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each. (
     * <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The results of
     * this query might include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     * <code>{"Key":"Version","Value":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and {"Key":"Version","Value":"1"}
     * </p>
     * </li>
     * </ul>
     * <p>
     * The query would not return the following results, however. The following EC2 instance does not have all tag keys
     * specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at
     * least one of the specified tag key values in the filter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     * <code>{"Key":"Version","Value":"4"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack ARN.
     * </p>
     * 
     * @param type
     *        The type of the query. The valid values in this release are <code>TAG_FILTERS_1_0</code> and
     *        <code>CLOUDFORMATION_STACK_1_0</code>.</p>
     *        <p>
     *        <i> <code>TAG_FILTERS_1_0:</code> </i> A JSON syntax that lets you specify a collection of simple tag
     *        filters for resource types and tags, as supported by the AWS Tagging API <a
     *        href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html"
     *        >GetResources</a> operation. If you specify more than one tag key, only resources that match all tag keys,
     *        and at least one value of each specified tag key, are returned in your query. If you specify more than one
     *        value for a tag key, a resource matches the filter if it has a tag key value that matches <i>any</i> of
     *        the specified values.
     *        </p>
     *        <p>
     *        For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *        <code>Version</code>, with two values each. (
     *        <code>[{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]</code>) The
     *        results of this query might include the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An EC2 instance that has the following two tags: <code>{"Key":"Stage","Value":"Deploy"}</code>, and
     *        <code>{"Key":"Version","Value":"2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and
     *        {"Key":"Version","Value":"1"}
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The query would not return the following results, however. The following EC2 instance does not have all
     *        tag keys specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no
     *        values that match at least one of the specified tag key values in the filter.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An EC2 instance that has only the following tag: <code>{"Key":"Stage","Value":"Deploy"}</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An RDS database that has the following two tags: <code>{"Key":"Stage","Value":"Archived"}</code>, and
     *        <code>{"Key":"Version","Value":"4"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> A JSON syntax that lets you specify a CloudFormation stack
     *        ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryType
     */

    public ResourceQuery withType(QueryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The query that defines a group or a search.
     * </p>
     * 
     * @param query
     *        The query that defines a group or a search.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The query that defines a group or a search.
     * </p>
     * 
     * @return The query that defines a group or a search.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The query that defines a group or a search.
     * </p>
     * 
     * @param query
     *        The query that defines a group or a search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceQuery withQuery(String query) {
        setQuery(query);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceQuery == false)
            return false;
        ResourceQuery other = (ResourceQuery) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return hashCode;
    }

    @Override
    public ResourceQuery clone() {
        try {
            return (ResourceQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.ResourceQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
