/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The query you can use to define a resource group or a search for resources. A <code>ResourceQuery</code> specifies
 * both a query <code>Type</code> and a <code>Query</code> string as JSON string objects. See the examples section for
 * example JSON strings. For more information about creating a resource group with a resource query, see <a
 * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html">Build queries and groups in
 * Resource Groups</a> in the <i>Resource Groups User Guide</i>
 * </p>
 * <p>
 * When you combine all of the elements together into a single string, any double quotes that are embedded inside
 * another double quote pair must be escaped by preceding the embedded double quote with a backslash character (\). For
 * example, a complete <code>ResourceQuery</code> parameter must be formatted like the following CLI parameter example:
 * </p>
 * <p>
 * <code>--resource-query '{"Type":"TAG_FILTERS_1_0","Query":"{\"ResourceTypeFilters\":[\"AWS::AllSupported\"],\"TagFilters\":[{\"Key\":\"Stage\",\"Values\":[\"Test\"]}]}"}'</code>
 * </p>
 * <p>
 * In the preceding example, all of the double quote characters in the value part of the <code>Query</code> element must
 * be escaped because the value itself is surrounded by double quotes. For more information, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-quoting-strings.html">Quoting strings</a>
 * in the <i>Command Line Interface User Guide</i>.
 * </p>
 * <p>
 * For the complete list of resource types that you can use in the array value for <code>ResourceTypeFilters</code>, see
 * <a href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use with
 * Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>. For example:
 * </p>
 * <p>
 * <code>"ResourceTypeFilters":["AWS::S3::Bucket", "AWS::EC2::Instance"]</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ResourceQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the query to perform. This can have one of two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members of an
     * CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an ARN for a
     * CloudFormation stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have tags that
     * match the query.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The query that defines a group or a search. The contents depends on the value of the <code>Type</code> element.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either <code>Type</code>.
     * This element contains one of the following two items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any resource type
     * that also match the query.
     * </p>
     * </li>
     * <li>
     * <p>
     * A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified types.
     * For the complete list of resource types that you can use in the array value for <code>ResourceTypeFilters</code>,
     * see <a href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     * with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     * <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     * <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON string
     * uses a syntax similar to the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     * operation, but uses only the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     * and
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     * fields. If you specify more than one tag key, only resources that match all tag keys, and at least one value of
     * each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource
     * matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each:
     * </p>
     * <p>
     * <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     * </p>
     * <p>
     * The results of this resource query could include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     * <code>{"Version":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and <code>{"Version":"1"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The resource query results would <i>not</i> include the following items in the results, however.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     * </p>
     * <p>
     * The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     * <code>{"Version":"4"}</code>
     * </p>
     * <p>
     * The database has all of the tag keys, but none of those keys has an associated value that matches at least one of
     * the specified values in the filter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StackIdentifier</code> – applicable only if <code>Type</code> = <code>CLOUDFORMATION_STACK_1_0</code>. The
     * value of this parameter is the Amazon Resource Name (ARN) of the CloudFormation stack whose resources you want
     * included in the group.
     * </p>
     * </li>
     * </ul>
     */
    private String query;

    /**
     * <p>
     * The type of the query to perform. This can have one of two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members of an
     * CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an ARN for a
     * CloudFormation stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have tags that
     * match the query.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the query to perform. This can have one of two values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members
     *        of an CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an
     *        ARN for a CloudFormation stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have
     *        tags that match the query.
     *        </p>
     *        </li>
     * @see QueryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the query to perform. This can have one of two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members of an
     * CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an ARN for a
     * CloudFormation stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have tags that
     * match the query.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the query to perform. This can have one of two values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members
     *         of an CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with
     *         an ARN for a CloudFormation stack.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have
     *         tags that match the query.
     *         </p>
     *         </li>
     * @see QueryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the query to perform. This can have one of two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members of an
     * CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an ARN for a
     * CloudFormation stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have tags that
     * match the query.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the query to perform. This can have one of two values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members
     *        of an CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an
     *        ARN for a CloudFormation stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have
     *        tags that match the query.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryType
     */

    public ResourceQuery withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the query to perform. This can have one of two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members of an
     * CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an ARN for a
     * CloudFormation stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have tags that
     * match the query.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the query to perform. This can have one of two values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>CLOUDFORMATION_STACK_1_0:</code> </i> Specifies that you want the group to contain the members
     *        of an CloudFormation stack. The <code>Query</code> contains a <code>StackIdentifier</code> element with an
     *        ARN for a CloudFormation stack.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>TAG_FILTERS_1_0:</code> </i> Specifies that you want the group to include resource that have
     *        tags that match the query.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryType
     */

    public ResourceQuery withType(QueryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The query that defines a group or a search. The contents depends on the value of the <code>Type</code> element.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either <code>Type</code>.
     * This element contains one of the following two items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any resource type
     * that also match the query.
     * </p>
     * </li>
     * <li>
     * <p>
     * A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified types.
     * For the complete list of resource types that you can use in the array value for <code>ResourceTypeFilters</code>,
     * see <a href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     * with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     * <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     * <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON string
     * uses a syntax similar to the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     * operation, but uses only the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     * and
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     * fields. If you specify more than one tag key, only resources that match all tag keys, and at least one value of
     * each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource
     * matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each:
     * </p>
     * <p>
     * <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     * </p>
     * <p>
     * The results of this resource query could include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     * <code>{"Version":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and <code>{"Version":"1"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The resource query results would <i>not</i> include the following items in the results, however.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     * </p>
     * <p>
     * The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     * <code>{"Version":"4"}</code>
     * </p>
     * <p>
     * The database has all of the tag keys, but none of those keys has an associated value that matches at least one of
     * the specified values in the filter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StackIdentifier</code> – applicable only if <code>Type</code> = <code>CLOUDFORMATION_STACK_1_0</code>. The
     * value of this parameter is the Amazon Resource Name (ARN) of the CloudFormation stack whose resources you want
     * included in the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param query
     *        The query that defines a group or a search. The contents depends on the value of the <code>Type</code>
     *        element.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either
     *        <code>Type</code>. This element contains one of the following two items:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any resource
     *        type that also match the query.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified
     *        types. For the complete list of resource types that you can use in the array value for
     *        <code>ResourceTypeFilters</code>, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     *        with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     *        <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     *        <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON
     *        string uses a syntax similar to the
     *        <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     *        operation, but uses only the
     *        <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     *        and
     *        <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     *        fields. If you specify more than one tag key, only resources that match all tag keys, and at least one
     *        value of each specified tag key, are returned in your query. If you specify more than one value for a tag
     *        key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified
     *        values.
     *        </p>
     *        <p>
     *        For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *        <code>Version</code>, with two values each:
     *        </p>
     *        <p>
     *        <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     *        </p>
     *        <p>
     *        The results of this resource query could include the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     *        <code>{"Version":"2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and
     *        <code>{"Version":"1"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The resource query results would <i>not</i> include the following items in the results, however.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     *        </p>
     *        <p>
     *        The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     *        results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     *        <code>{"Version":"4"}</code>
     *        </p>
     *        <p>
     *        The database has all of the tag keys, but none of those keys has an associated value that matches at least
     *        one of the specified values in the filter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StackIdentifier</code> – applicable only if <code>Type</code> =
     *        <code>CLOUDFORMATION_STACK_1_0</code>. The value of this parameter is the Amazon Resource Name (ARN) of
     *        the CloudFormation stack whose resources you want included in the group.
     *        </p>
     *        </li>
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The query that defines a group or a search. The contents depends on the value of the <code>Type</code> element.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either <code>Type</code>.
     * This element contains one of the following two items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any resource type
     * that also match the query.
     * </p>
     * </li>
     * <li>
     * <p>
     * A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified types.
     * For the complete list of resource types that you can use in the array value for <code>ResourceTypeFilters</code>,
     * see <a href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     * with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     * <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     * <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON string
     * uses a syntax similar to the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     * operation, but uses only the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     * and
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     * fields. If you specify more than one tag key, only resources that match all tag keys, and at least one value of
     * each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource
     * matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each:
     * </p>
     * <p>
     * <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     * </p>
     * <p>
     * The results of this resource query could include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     * <code>{"Version":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and <code>{"Version":"1"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The resource query results would <i>not</i> include the following items in the results, however.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     * </p>
     * <p>
     * The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     * <code>{"Version":"4"}</code>
     * </p>
     * <p>
     * The database has all of the tag keys, but none of those keys has an associated value that matches at least one of
     * the specified values in the filter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StackIdentifier</code> – applicable only if <code>Type</code> = <code>CLOUDFORMATION_STACK_1_0</code>. The
     * value of this parameter is the Amazon Resource Name (ARN) of the CloudFormation stack whose resources you want
     * included in the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The query that defines a group or a search. The contents depends on the value of the <code>Type</code>
     *         element.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either
     *         <code>Type</code>. This element contains one of the following two items:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any
     *         resource type that also match the query.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A list (a JSON array) of resource type identifiers that limit the query to only resources of the
     *         specified types. For the complete list of resource types that you can use in the array value for
     *         <code>ResourceTypeFilters</code>, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     *         with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     *         <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     *         <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON
     *         string uses a syntax similar to the
     *         <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     *         operation, but uses only the
     *         <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     *         and
     *         <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     *         fields. If you specify more than one tag key, only resources that match all tag keys, and at least one
     *         value of each specified tag key, are returned in your query. If you specify more than one value for a tag
     *         key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified
     *         values.
     *         </p>
     *         <p>
     *         For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *         <code>Version</code>, with two values each:
     *         </p>
     *         <p>
     *         <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     *         </p>
     *         <p>
     *         The results of this resource query could include the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     *         <code>{"Version":"2"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and
     *         <code>{"Version":"1"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The resource query results would <i>not</i> include the following items in the results, however.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     *         </p>
     *         <p>
     *         The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     *         results.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     *         <code>{"Version":"4"}</code>
     *         </p>
     *         <p>
     *         The database has all of the tag keys, but none of those keys has an associated value that matches at
     *         least one of the specified values in the filter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StackIdentifier</code> – applicable only if <code>Type</code> =
     *         <code>CLOUDFORMATION_STACK_1_0</code>. The value of this parameter is the Amazon Resource Name (ARN) of
     *         the CloudFormation stack whose resources you want included in the group.
     *         </p>
     *         </li>
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The query that defines a group or a search. The contents depends on the value of the <code>Type</code> element.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either <code>Type</code>.
     * This element contains one of the following two items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any resource type
     * that also match the query.
     * </p>
     * </li>
     * <li>
     * <p>
     * A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified types.
     * For the complete list of resource types that you can use in the array value for <code>ResourceTypeFilters</code>,
     * see <a href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     * with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     * <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     * <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON string
     * uses a syntax similar to the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     * operation, but uses only the
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     * and
     * <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     * fields. If you specify more than one tag key, only resources that match all tag keys, and at least one value of
     * each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource
     * matches the filter if it has a tag key value that matches <i>any</i> of the specified values.
     * </p>
     * <p>
     * For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     * <code>Version</code>, with two values each:
     * </p>
     * <p>
     * <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     * </p>
     * <p>
     * The results of this resource query could include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     * <code>{"Version":"2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and <code>{"Version":"1"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The resource query results would <i>not</i> include the following items in the results, however.
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     * </p>
     * <p>
     * The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     * <code>{"Version":"4"}</code>
     * </p>
     * <p>
     * The database has all of the tag keys, but none of those keys has an associated value that matches at least one of
     * the specified values in the filter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StackIdentifier</code> – applicable only if <code>Type</code> = <code>CLOUDFORMATION_STACK_1_0</code>. The
     * value of this parameter is the Amazon Resource Name (ARN) of the CloudFormation stack whose resources you want
     * included in the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param query
     *        The query that defines a group or a search. The contents depends on the value of the <code>Type</code>
     *        element.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceTypeFilters</code> – Applies to all <code>ResourceQuery</code> objects of either
     *        <code>Type</code>. This element contains one of the following two items:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value <code>AWS::AllSupported</code>. This causes the ResourceQuery to match resources of any resource
     *        type that also match the query.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified
     *        types. For the complete list of resource types that you can use in the array value for
     *        <code>ResourceTypeFilters</code>, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/supported-resources.html">Resources you can use
     *        with Resource Groups and Tag Editor</a> in the <i>Resource Groups User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>"ResourceTypeFilters": ["AWS::AllSupported"]</code> or
     *        <code>"ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TagFilters</code> – applicable only if <code>Type</code> = <code>TAG_FILTERS_1_0</code>. The
     *        <code>Query</code> contains a JSON string that represents a collection of simple tag filters. The JSON
     *        string uses a syntax similar to the
     *        <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html">GetResources</a> </code>
     *        operation, but uses only the
     *        <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-ResourceTypeFilters"> ResourceTypeFilters</a> </code>
     *        and
     *        <code> <a href="https://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html#resourcegrouptagging-GetResources-request-TagFiltersTagFilters">TagFilters</a> </code>
     *        fields. If you specify more than one tag key, only resources that match all tag keys, and at least one
     *        value of each specified tag key, are returned in your query. If you specify more than one value for a tag
     *        key, a resource matches the filter if it has a tag key value that matches <i>any</i> of the specified
     *        values.
     *        </p>
     *        <p>
     *        For example, consider the following sample query for resources that have two tags, <code>Stage</code> and
     *        <code>Version</code>, with two values each:
     *        </p>
     *        <p>
     *        <code>[{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]</code>
     *        </p>
     *        <p>
     *        The results of this resource query could include the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon EC2 instance that has the following two tags: <code>{"Stage":"Deploy"}</code>, and
     *        <code>{"Version":"2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An S3 bucket that has the following two tags: <code>{"Stage":"Test"}</code>, and
     *        <code>{"Version":"1"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The resource query results would <i>not</i> include the following items in the results, however.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon EC2 instance that has only the following tag: <code>{"Stage":"Deploy"}</code>.
     *        </p>
     *        <p>
     *        The instance does not have <b>all</b> of the tag keys specified in the filter, so it is excluded from the
     *        results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An RDS database that has the following two tags: <code>{"Stage":"Archived"}</code> and
     *        <code>{"Version":"4"}</code>
     *        </p>
     *        <p>
     *        The database has all of the tag keys, but none of those keys has an associated value that matches at least
     *        one of the specified values in the filter.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>"TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StackIdentifier</code> – applicable only if <code>Type</code> =
     *        <code>CLOUDFORMATION_STACK_1_0</code>. The value of this parameter is the Amazon Resource Name (ARN) of
     *        the CloudFormation stack whose resources you want included in the group.
     *        </p>
     *        </li>
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
