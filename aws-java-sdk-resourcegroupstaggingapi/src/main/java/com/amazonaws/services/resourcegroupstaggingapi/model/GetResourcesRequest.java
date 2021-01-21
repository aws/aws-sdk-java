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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have the
     * specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key with values
     * optional. A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are currently
     * tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response returns only those resources that satisfy
     * all filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the response returns resources that match
     * any of the specified values for that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources that are tagged with that key and any
     * or no value.
     * </p>
     * <p>
     * For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     * <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     * <code>key2=value3</code> or <code>key2=value4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>, and
     * with any or no value
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     * <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<TagFilter> tagFilters;
    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     */
    private Integer resourcesPerPage;
    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     * paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page displays the next 10 resources, each with
     * its 10 tags. The third page displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     * </p>
     */
    private Integer tagsPerPage;
    /**
     * <p>
     * Specifies the resource types that you want included in the response. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of <code>ec2:instance</code>
     * returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * <p>
     * You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the
     * length constraint requirement applies to each resource type filter.
     * </p>
     */
    private java.util.List<String> resourceTypeFilters;
    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     * <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     * </p>
     */
    private Boolean includeComplianceDetails;
    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag policy. Set this to <code>true</code> if
     * you are interested in retrieving information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     */
    private Boolean excludeCompliantResources;
    /**
     * <p>
     * Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     * parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     * <code>PaginationToken</code>) in the same request. If you specify both, you get an <code>Invalid Parameter</code>
     * exception.
     * </p>
     * <p>
     * If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't included
     * in the response.
     * </p>
     * <p>
     * An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> resourceARNList;

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     * 
     * @param paginationToken
     *        Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want
     *        the next page of results. Leave this parameter empty in your initial request.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     * 
     * @return Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want
     *         the next page of results. Leave this parameter empty in your initial request.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     * 
     * @param paginationToken
     *        Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want
     *        the next page of results. Leave this parameter empty in your initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have the
     * specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key with values
     * optional. A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are currently
     * tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response returns only those resources that satisfy
     * all filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the response returns resources that match
     * any of the specified values for that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources that are tagged with that key and any
     * or no value.
     * </p>
     * <p>
     * For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     * <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     * <code>key2=value3</code> or <code>key2=value4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>, and
     * with any or no value
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     * <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have
     *         the specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key
     *         with values optional. A request can include up to 50 keys, and each key can include up to 20 values. </p>
     *         <p>
     *         Note the following when deciding how to use TagFilters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are
     *         currently tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag
     *         set, like this: <code>"Tags": []</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify more than one filter in a single request, the response returns only those resources that
     *         satisfy all filters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a filter that contains more than one value for a key, the response returns resources that
     *         match any of the specified values for that key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't specify any values for a key, the response returns resources that are tagged with that key
     *         and any or no value.
     *         </p>
     *         <p>
     *         For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     *         <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     *         <code>key2=value3</code> or <code>key2=value4</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>
     *         , and with any or no value
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     *         <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have the
     * specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key with values
     * optional. A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are currently
     * tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response returns only those resources that satisfy
     * all filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the response returns resources that match
     * any of the specified values for that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources that are tagged with that key and any
     * or no value.
     * </p>
     * <p>
     * For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     * <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     * <code>key2=value3</code> or <code>key2=value4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>, and
     * with any or no value
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     * <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param tagFilters
     *        Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have
     *        the specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key
     *        with values optional. A request can include up to 50 keys, and each key can include up to 20 values. </p>
     *        <p>
     *        Note the following when deciding how to use TagFilters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are
     *        currently tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag
     *        set, like this: <code>"Tags": []</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify more than one filter in a single request, the response returns only those resources that
     *        satisfy all filters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter that contains more than one value for a key, the response returns resources that
     *        match any of the specified values for that key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify any values for a key, the response returns resources that are tagged with that key
     *        and any or no value.
     *        </p>
     *        <p>
     *        For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     *        <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     *        <code>key2=value3</code> or <code>key2=value4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>,
     *        and with any or no value
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     *        <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have the
     * specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key with values
     * optional. A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are currently
     * tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response returns only those resources that satisfy
     * all filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the response returns resources that match
     * any of the specified values for that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources that are tagged with that key and any
     * or no value.
     * </p>
     * <p>
     * For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     * <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     * <code>key2=value3</code> or <code>key2=value4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>, and
     * with any or no value
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     * <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have
     *        the specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key
     *        with values optional. A request can include up to 50 keys, and each key can include up to 20 values. </p>
     *        <p>
     *        Note the following when deciding how to use TagFilters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are
     *        currently tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag
     *        set, like this: <code>"Tags": []</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify more than one filter in a single request, the response returns only those resources that
     *        satisfy all filters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter that contains more than one value for a key, the response returns resources that
     *        match any of the specified values for that key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify any values for a key, the response returns resources that are tagged with that key
     *        and any or no value.
     *        </p>
     *        <p>
     *        For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     *        <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     *        <code>key2=value3</code> or <code>key2=value4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>,
     *        and with any or no value
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     *        <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withTagFilters(TagFilter... tagFilters) {
        if (this.tagFilters == null) {
            setTagFilters(new java.util.ArrayList<TagFilter>(tagFilters.length));
        }
        for (TagFilter ele : tagFilters) {
            this.tagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have the
     * specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key with values
     * optional. A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * Note the following when deciding how to use TagFilters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are currently
     * tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag set, like this:
     * <code>"Tags": []</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify more than one filter in a single request, the response returns only those resources that satisfy
     * all filters.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter that contains more than one value for a key, the response returns resources that match
     * any of the specified values for that key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify any values for a key, the response returns resources that are tagged with that key and any
     * or no value.
     * </p>
     * <p>
     * For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     * <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     * <code>key2=value3</code> or <code>key2=value4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>, and
     * with any or no value
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     * <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param tagFilters
     *        Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have
     *        the specified tag and, if included, the specified value. Each <code>TagFilter</code> must contain a key
     *        with values optional. A request can include up to 50 keys, and each key can include up to 20 values. </p>
     *        <p>
     *        Note the following when deciding how to use TagFilters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you <i>don't</i> specify a <code>TagFilter</code>, the response includes all resources that are
     *        currently tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag
     *        set, like this: <code>"Tags": []</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify more than one filter in a single request, the response returns only those resources that
     *        satisfy all filters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter that contains more than one value for a key, the response returns resources that
     *        match any of the specified values for that key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify any values for a key, the response returns resources that are tagged with that key
     *        and any or no value.
     *        </p>
     *        <p>
     *        For example, for the following filters: <code>filter1= {keyA,{value1}}</code>,
     *        <code>filter2={keyB,{value2,value3,value4}}</code>, <code>filter3= {keyC}</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GetResources({filter1})</code> returns resources tagged with <code>key1=value1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter2})</code> returns resources tagged with <code>key2=value2</code> or
     *        <code>key2=value3</code> or <code>key2=value4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter3})</code> returns resources tagged with any tag with the key <code>key3</code>,
     *        and with any or no value
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GetResources({filter1,filter2,filter3})</code> returns resources tagged with
     *        <code>(key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     * 
     * @param resourcesPerPage
     *        Specifies the maximum number of results to be returned in each page. A query can return fewer than this
     *        maximum, even if there are more results still to return. You should always check the
     *        <code>PaginationToken</code> response value to see if there are more results. You can specify a minimum of
     *        1 and a maximum value of 100.
     */

    public void setResourcesPerPage(Integer resourcesPerPage) {
        this.resourcesPerPage = resourcesPerPage;
    }

    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     * 
     * @return Specifies the maximum number of results to be returned in each page. A query can return fewer than this
     *         maximum, even if there are more results still to return. You should always check the
     *         <code>PaginationToken</code> response value to see if there are more results. You can specify a minimum
     *         of 1 and a maximum value of 100.
     */

    public Integer getResourcesPerPage() {
        return this.resourcesPerPage;
    }

    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     * 
     * @param resourcesPerPage
     *        Specifies the maximum number of results to be returned in each page. A query can return fewer than this
     *        maximum, even if there are more results still to return. You should always check the
     *        <code>PaginationToken</code> response value to see if there are more results. You can specify a minimum of
     *        1 and a maximum value of 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourcesPerPage(Integer resourcesPerPage) {
        setResourcesPerPage(resourcesPerPage);
        return this;
    }

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     * paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page displays the next 10 resources, each with
     * its 10 tags. The third page displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     * </p>
     * 
     * @param tagsPerPage
     *        AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.</p>
     *        <p>
     *        A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     *        paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     *        </p>
     *        <p>
     *        <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     *        <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of
     *        the affected resource and its tags. Use that token in another request to get the remaining data. For
     *        example, if you specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources
     *        with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of
     *        three pages. The first page displays the first 10 resources, each with its 10 tags. The second page
     *        displays the next 10 resources, each with its 10 tags. The third page displays the remaining 2 resources,
     *        each with its 10 tags.
     *        </p>
     *        <p>
     *        You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     */

    public void setTagsPerPage(Integer tagsPerPage) {
        this.tagsPerPage = tagsPerPage;
    }

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     * paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page displays the next 10 resources, each with
     * its 10 tags. The third page displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     * </p>
     * 
     * @return AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.</p>
     *         <p>
     *         A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     *         paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     *         </p>
     *         <p>
     *         <code>GetResources</code> does not split a resource and its associated tags across pages. If the
     *         specified <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned
     *         in place of the affected resource and its tags. Use that token in another request to get the remaining
     *         data. For example, if you specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22
     *         resources with 10 tags each (meaning that each resource has 10 key and value pairs), the output will
     *         consist of three pages. The first page displays the first 10 resources, each with its 10 tags. The second
     *         page displays the next 10 resources, each with its 10 tags. The third page displays the remaining 2
     *         resources, each with its 10 tags.
     *         </p>
     *         <p>
     *         You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     */

    public Integer getTagsPerPage() {
        return this.tagsPerPage;
    }

    /**
     * <p>
     * AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.
     * </p>
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     * paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of three pages. The first page
     * displays the first 10 resources, each with its 10 tags. The second page displays the next 10 resources, each with
     * its 10 tags. The third page displays the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     * </p>
     * 
     * @param tagsPerPage
     *        AWS recommends using <code>ResourcesPerPage</code> instead of this parameter.</p>
     *        <p>
     *        A limit that restricts the number of tags (key and value pairs) returned by <code>GetResources</code> in
     *        paginated output. A resource with no tags is counted as having one tag (one key and value pair).
     *        </p>
     *        <p>
     *        <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     *        <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of
     *        the affected resource and its tags. Use that token in another request to get the remaining data. For
     *        example, if you specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources
     *        with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of
     *        three pages. The first page displays the first 10 resources, each with its 10 tags. The second page
     *        displays the next 10 resources, each with its 10 tags. The third page displays the remaining 2 resources,
     *        each with its 10 tags.
     *        </p>
     *        <p>
     *        You can set <code>TagsPerPage</code> to a minimum of 100 items up to a maximum of 500 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withTagsPerPage(Integer tagsPerPage) {
        setTagsPerPage(tagsPerPage);
        return this;
    }

    /**
     * <p>
     * Specifies the resource types that you want included in the response. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of <code>ec2:instance</code>
     * returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * <p>
     * You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the
     * length constraint requirement applies to each resource type filter.
     * </p>
     * 
     * @return Specifies the resource types that you want included in the response. The format of each resource type is
     *         <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *         all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
     *         <code>ec2:instance</code> returns only EC2 instances. </p>
     *         <p>
     *         The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *         Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     *         </p>
     *         <p>
     *         You can specify multiple resource types by using an array. The array can include up to 100 items. Note
     *         that the length constraint requirement applies to each resource type filter.
     */

    public java.util.List<String> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * <p>
     * Specifies the resource types that you want included in the response. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of <code>ec2:instance</code>
     * returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * <p>
     * You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the
     * length constraint requirement applies to each resource type filter.
     * </p>
     * 
     * @param resourceTypeFilters
     *        Specifies the resource types that you want included in the response. The format of each resource type is
     *        <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *        all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
     *        <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        <p>
     *        You can specify multiple resource types by using an array. The array can include up to 100 items. Note
     *        that the length constraint requirement applies to each resource type filter.
     */

    public void setResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        if (resourceTypeFilters == null) {
            this.resourceTypeFilters = null;
            return;
        }

        this.resourceTypeFilters = new java.util.ArrayList<String>(resourceTypeFilters);
    }

    /**
     * <p>
     * Specifies the resource types that you want included in the response. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of <code>ec2:instance</code>
     * returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * <p>
     * You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the
     * length constraint requirement applies to each resource type filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypeFilters(java.util.Collection)} or {@link #withResourceTypeFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceTypeFilters
     *        Specifies the resource types that you want included in the response. The format of each resource type is
     *        <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *        all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
     *        <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        <p>
     *        You can specify multiple resource types by using an array. The array can include up to 100 items. Note
     *        that the length constraint requirement applies to each resource type filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourceTypeFilters(String... resourceTypeFilters) {
        if (this.resourceTypeFilters == null) {
            setResourceTypeFilters(new java.util.ArrayList<String>(resourceTypeFilters.length));
        }
        for (String ele : resourceTypeFilters) {
            this.resourceTypeFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the resource types that you want included in the response. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of <code>ec2:instance</code>
     * returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * <p>
     * You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the
     * length constraint requirement applies to each resource type filter.
     * </p>
     * 
     * @param resourceTypeFilters
     *        Specifies the resource types that you want included in the response. The format of each resource type is
     *        <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *        all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
     *        <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        <p>
     *        You can specify multiple resource types by using an array. The array can include up to 100 items. Note
     *        that the length constraint requirement applies to each resource type filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        setResourceTypeFilters(resourceTypeFilters);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     * <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     * </p>
     * 
     * @param includeComplianceDetails
     *        Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     *        <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     */

    public void setIncludeComplianceDetails(Boolean includeComplianceDetails) {
        this.includeComplianceDetails = includeComplianceDetails;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     * <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     * </p>
     * 
     * @return Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     *         <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     */

    public Boolean getIncludeComplianceDetails() {
        return this.includeComplianceDetails;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     * <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     * </p>
     * 
     * @param includeComplianceDetails
     *        Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     *        <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withIncludeComplianceDetails(Boolean includeComplianceDetails) {
        setIncludeComplianceDetails(includeComplianceDetails);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     * <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     * </p>
     * 
     * @return Specifies whether to include details regarding the compliance with the effective tag policy. Set this to
     *         <code>true</code> to determine whether resources are compliant with the tag policy and to get details.
     */

    public Boolean isIncludeComplianceDetails() {
        return this.includeComplianceDetails;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag policy. Set this to <code>true</code> if
     * you are interested in retrieving information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     * 
     * @param excludeCompliantResources
     *        Specifies whether to exclude resources that are compliant with the tag policy. Set this to
     *        <code>true</code> if you are interested in retrieving information on noncompliant resources only.</p>
     *        <p>
     *        You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     *        <code>true</code>.
     */

    public void setExcludeCompliantResources(Boolean excludeCompliantResources) {
        this.excludeCompliantResources = excludeCompliantResources;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag policy. Set this to <code>true</code> if
     * you are interested in retrieving information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     * 
     * @return Specifies whether to exclude resources that are compliant with the tag policy. Set this to
     *         <code>true</code> if you are interested in retrieving information on noncompliant resources only.</p>
     *         <p>
     *         You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     *         <code>true</code>.
     */

    public Boolean getExcludeCompliantResources() {
        return this.excludeCompliantResources;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag policy. Set this to <code>true</code> if
     * you are interested in retrieving information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     * 
     * @param excludeCompliantResources
     *        Specifies whether to exclude resources that are compliant with the tag policy. Set this to
     *        <code>true</code> if you are interested in retrieving information on noncompliant resources only.</p>
     *        <p>
     *        You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withExcludeCompliantResources(Boolean excludeCompliantResources) {
        setExcludeCompliantResources(excludeCompliantResources);
        return this;
    }

    /**
     * <p>
     * Specifies whether to exclude resources that are compliant with the tag policy. Set this to <code>true</code> if
     * you are interested in retrieving information on noncompliant resources only.
     * </p>
     * <p>
     * You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     * <code>true</code>.
     * </p>
     * 
     * @return Specifies whether to exclude resources that are compliant with the tag policy. Set this to
     *         <code>true</code> if you are interested in retrieving information on noncompliant resources only.</p>
     *         <p>
     *         You can use this parameter only if the <code>IncludeComplianceDetails</code> parameter is also set to
     *         <code>true</code>.
     */

    public Boolean isExcludeCompliantResources() {
        return this.excludeCompliantResources;
    }

    /**
     * <p>
     * Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     * parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     * <code>PaginationToken</code>) in the same request. If you specify both, you get an <code>Invalid Parameter</code>
     * exception.
     * </p>
     * <p>
     * If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't included
     * in the response.
     * </p>
     * <p>
     * An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both
     *         this parameter and any of the pagination parameters (<code>ResourcesPerPage</code>,
     *         <code>TagsPerPage</code>, <code>PaginationToken</code>) in the same request. If you specify both, you get
     *         an <code>Invalid Parameter</code> exception.</p>
     *         <p>
     *         If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't
     *         included in the response.
     *         </p>
     *         <p>
     *         An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public java.util.List<String> getResourceARNList() {
        return resourceARNList;
    }

    /**
     * <p>
     * Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     * parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     * <code>PaginationToken</code>) in the same request. If you specify both, you get an <code>Invalid Parameter</code>
     * exception.
     * </p>
     * <p>
     * If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't included
     * in the response.
     * </p>
     * <p>
     * An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceARNList
     *        Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     *        parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     *        <code>PaginationToken</code>) in the same request. If you specify both, you get an
     *        <code>Invalid Parameter</code> exception.</p>
     *        <p>
     *        If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't
     *        included in the response.
     *        </p>
     *        <p>
     *        An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setResourceARNList(java.util.Collection<String> resourceARNList) {
        if (resourceARNList == null) {
            this.resourceARNList = null;
            return;
        }

        this.resourceARNList = new java.util.ArrayList<String>(resourceARNList);
    }

    /**
     * <p>
     * Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     * parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     * <code>PaginationToken</code>) in the same request. If you specify both, you get an <code>Invalid Parameter</code>
     * exception.
     * </p>
     * <p>
     * If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't included
     * in the response.
     * </p>
     * <p>
     * An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceARNList(java.util.Collection)} or {@link #withResourceARNList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceARNList
     *        Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     *        parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     *        <code>PaginationToken</code>) in the same request. If you specify both, you get an
     *        <code>Invalid Parameter</code> exception.</p>
     *        <p>
     *        If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't
     *        included in the response.
     *        </p>
     *        <p>
     *        An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourceARNList(String... resourceARNList) {
        if (this.resourceARNList == null) {
            setResourceARNList(new java.util.ArrayList<String>(resourceARNList.length));
        }
        for (String ele : resourceARNList) {
            this.resourceARNList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     * parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     * <code>PaginationToken</code>) in the same request. If you specify both, you get an <code>Invalid Parameter</code>
     * exception.
     * </p>
     * <p>
     * If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't included
     * in the response.
     * </p>
     * <p>
     * An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param resourceARNList
     *        Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this
     *        parameter and any of the pagination parameters (<code>ResourcesPerPage</code>, <code>TagsPerPage</code>,
     *        <code>PaginationToken</code>) in the same request. If you specify both, you get an
     *        <code>Invalid Parameter</code> exception.</p>
     *        <p>
     *        If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't
     *        included in the response.
     *        </p>
     *        <p>
     *        An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourceARNList(java.util.Collection<String> resourceARNList) {
        setResourceARNList(resourceARNList);
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken()).append(",");
        if (getTagFilters() != null)
            sb.append("TagFilters: ").append(getTagFilters()).append(",");
        if (getResourcesPerPage() != null)
            sb.append("ResourcesPerPage: ").append(getResourcesPerPage()).append(",");
        if (getTagsPerPage() != null)
            sb.append("TagsPerPage: ").append(getTagsPerPage()).append(",");
        if (getResourceTypeFilters() != null)
            sb.append("ResourceTypeFilters: ").append(getResourceTypeFilters()).append(",");
        if (getIncludeComplianceDetails() != null)
            sb.append("IncludeComplianceDetails: ").append(getIncludeComplianceDetails()).append(",");
        if (getExcludeCompliantResources() != null)
            sb.append("ExcludeCompliantResources: ").append(getExcludeCompliantResources()).append(",");
        if (getResourceARNList() != null)
            sb.append("ResourceARNList: ").append(getResourceARNList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcesRequest == false)
            return false;
        GetResourcesRequest other = (GetResourcesRequest) obj;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getResourcesPerPage() == null ^ this.getResourcesPerPage() == null)
            return false;
        if (other.getResourcesPerPage() != null && other.getResourcesPerPage().equals(this.getResourcesPerPage()) == false)
            return false;
        if (other.getTagsPerPage() == null ^ this.getTagsPerPage() == null)
            return false;
        if (other.getTagsPerPage() != null && other.getTagsPerPage().equals(this.getTagsPerPage()) == false)
            return false;
        if (other.getResourceTypeFilters() == null ^ this.getResourceTypeFilters() == null)
            return false;
        if (other.getResourceTypeFilters() != null && other.getResourceTypeFilters().equals(this.getResourceTypeFilters()) == false)
            return false;
        if (other.getIncludeComplianceDetails() == null ^ this.getIncludeComplianceDetails() == null)
            return false;
        if (other.getIncludeComplianceDetails() != null && other.getIncludeComplianceDetails().equals(this.getIncludeComplianceDetails()) == false)
            return false;
        if (other.getExcludeCompliantResources() == null ^ this.getExcludeCompliantResources() == null)
            return false;
        if (other.getExcludeCompliantResources() != null && other.getExcludeCompliantResources().equals(this.getExcludeCompliantResources()) == false)
            return false;
        if (other.getResourceARNList() == null ^ this.getResourceARNList() == null)
            return false;
        if (other.getResourceARNList() != null && other.getResourceARNList().equals(this.getResourceARNList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode + ((getResourcesPerPage() == null) ? 0 : getResourcesPerPage().hashCode());
        hashCode = prime * hashCode + ((getTagsPerPage() == null) ? 0 : getTagsPerPage().hashCode());
        hashCode = prime * hashCode + ((getResourceTypeFilters() == null) ? 0 : getResourceTypeFilters().hashCode());
        hashCode = prime * hashCode + ((getIncludeComplianceDetails() == null) ? 0 : getIncludeComplianceDetails().hashCode());
        hashCode = prime * hashCode + ((getExcludeCompliantResources() == null) ? 0 : getExcludeCompliantResources().hashCode());
        hashCode = prime * hashCode + ((getResourceARNList() == null) ? 0 : getResourceARNList().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcesRequest clone() {
        return (GetResourcesRequest) super.clone();
    }

}
