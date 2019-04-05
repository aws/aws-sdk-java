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
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a <code>PaginationToken</code>, use that string for this value to request an additional
     * page of data.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * If you specify multiple filters connected by an AND operator in a single request, the response returns only those
     * resources that are associated with every specified filter.
     * </p>
     * <p>
     * If you specify multiple filters connected by an OR operator in a single request, the response returns all
     * resources that are associated with at least one or possibly more of the specified filters.
     * </p>
     */
    private java.util.List<TagFilter> tagFilters;
    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     * ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     * </p>
     */
    private Integer resourcesPerPage;
    /**
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A
     * resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of 3 pages, with the first page
     * displaying the first 10 resources, each with its 10 tags, the second page displaying the next 10 resources each
     * with its 10 tags, and the third page displaying the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p/>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     * </p>
     */
    private Integer tagsPerPage;
    /**
     * <p>
     * The constraints on the resources that you want returned. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> resourceTypeFilters;

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a <code>PaginationToken</code>, use that string for this value to request an additional
     * page of data.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that additional data is available. Leave this value empty for your initial
     *        request. If the response includes a <code>PaginationToken</code>, use that string for this value to
     *        request an additional page of data.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a <code>PaginationToken</code>, use that string for this value to request an additional
     * page of data.
     * </p>
     * 
     * @return A string that indicates that additional data is available. Leave this value empty for your initial
     *         request. If the response includes a <code>PaginationToken</code>, use that string for this value to
     *         request an additional page of data.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this value empty for your initial request. If
     * the response includes a <code>PaginationToken</code>, use that string for this value to request an additional
     * page of data.
     * </p>
     * 
     * @param paginationToken
     *        A string that indicates that additional data is available. Leave this value empty for your initial
     *        request. If the response includes a <code>PaginationToken</code>, use that string for this value to
     *        request an additional page of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * If you specify multiple filters connected by an AND operator in a single request, the response returns only those
     * resources that are associated with every specified filter.
     * </p>
     * <p>
     * If you specify multiple filters connected by an OR operator in a single request, the response returns all
     * resources that are associated with at least one or possibly more of the specified filters.
     * </p>
     * 
     * @return A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20
     *         values.</p>
     *         <p>
     *         If you specify multiple filters connected by an AND operator in a single request, the response returns
     *         only those resources that are associated with every specified filter.
     *         </p>
     *         <p>
     *         If you specify multiple filters connected by an OR operator in a single request, the response returns all
     *         resources that are associated with at least one or possibly more of the specified filters.
     */

    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * If you specify multiple filters connected by an AND operator in a single request, the response returns only those
     * resources that are associated with every specified filter.
     * </p>
     * <p>
     * If you specify multiple filters connected by an OR operator in a single request, the response returns all
     * resources that are associated with at least one or possibly more of the specified filters.
     * </p>
     * 
     * @param tagFilters
     *        A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20
     *        values.</p>
     *        <p>
     *        If you specify multiple filters connected by an AND operator in a single request, the response returns
     *        only those resources that are associated with every specified filter.
     *        </p>
     *        <p>
     *        If you specify multiple filters connected by an OR operator in a single request, the response returns all
     *        resources that are associated with at least one or possibly more of the specified filters.
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
     * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * If you specify multiple filters connected by an AND operator in a single request, the response returns only those
     * resources that are associated with every specified filter.
     * </p>
     * <p>
     * If you specify multiple filters connected by an OR operator in a single request, the response returns all
     * resources that are associated with at least one or possibly more of the specified filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20
     *        values.</p>
     *        <p>
     *        If you specify multiple filters connected by an AND operator in a single request, the response returns
     *        only those resources that are associated with every specified filter.
     *        </p>
     *        <p>
     *        If you specify multiple filters connected by an OR operator in a single request, the response returns all
     *        resources that are associated with at least one or possibly more of the specified filters.
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
     * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values.
     * </p>
     * <p>
     * If you specify multiple filters connected by an AND operator in a single request, the response returns only those
     * resources that are associated with every specified filter.
     * </p>
     * <p>
     * If you specify multiple filters connected by an OR operator in a single request, the response returns all
     * resources that are associated with at least one or possibly more of the specified filters.
     * </p>
     * 
     * @param tagFilters
     *        A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20
     *        values.</p>
     *        <p>
     *        If you specify multiple filters connected by an AND operator in a single request, the response returns
     *        only those resources that are associated with every specified filter.
     *        </p>
     *        <p>
     *        If you specify multiple filters connected by an OR operator in a single request, the response returns all
     *        resources that are associated with at least one or possibly more of the specified filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     * ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     * </p>
     * 
     * @param resourcesPerPage
     *        A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     *        ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     */

    public void setResourcesPerPage(Integer resourcesPerPage) {
        this.resourcesPerPage = resourcesPerPage;
    }

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     * ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     * </p>
     * 
     * @return A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     *         ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     */

    public Integer getResourcesPerPage() {
        return this.resourcesPerPage;
    }

    /**
     * <p>
     * A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     * ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     * </p>
     * 
     * @param resourcesPerPage
     *        A limit that restricts the number of resources returned by GetResources in paginated output. You can set
     *        ResourcesPerPage to a minimum of 1 item and the maximum of 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourcesPerPage(Integer resourcesPerPage) {
        setResourcesPerPage(resourcesPerPage);
        return this;
    }

    /**
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A
     * resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of 3 pages, with the first page
     * displaying the first 10 resources, each with its 10 tags, the second page displaying the next 10 resources each
     * with its 10 tags, and the third page displaying the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p/>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     * </p>
     * 
     * @param tagsPerPage
     *        A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated
     *        output. A resource with no tags is counted as having one tag (one key and value pair).</p>
     *        <p>
     *        <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     *        <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of
     *        the affected resource and its tags. Use that token in another request to get the remaining data. For
     *        example, if you specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources
     *        with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of 3
     *        pages, with the first page displaying the first 10 resources, each with its 10 tags, the second page
     *        displaying the next 10 resources each with its 10 tags, and the third page displaying the remaining 2
     *        resources, each with its 10 tags.
     *        </p>
     *        <p/>
     *        <p>
     *        You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     */

    public void setTagsPerPage(Integer tagsPerPage) {
        this.tagsPerPage = tagsPerPage;
    }

    /**
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A
     * resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of 3 pages, with the first page
     * displaying the first 10 resources, each with its 10 tags, the second page displaying the next 10 resources each
     * with its 10 tags, and the third page displaying the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p/>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     * </p>
     * 
     * @return A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated
     *         output. A resource with no tags is counted as having one tag (one key and value pair).</p>
     *         <p>
     *         <code>GetResources</code> does not split a resource and its associated tags across pages. If the
     *         specified <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned
     *         in place of the affected resource and its tags. Use that token in another request to get the remaining
     *         data. For example, if you specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22
     *         resources with 10 tags each (meaning that each resource has 10 key and value pairs), the output will
     *         consist of 3 pages, with the first page displaying the first 10 resources, each with its 10 tags, the
     *         second page displaying the next 10 resources each with its 10 tags, and the third page displaying the
     *         remaining 2 resources, each with its 10 tags.
     *         </p>
     *         <p/>
     *         <p>
     *         You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     */

    public Integer getTagsPerPage() {
        return this.tagsPerPage;
    }

    /**
     * <p>
     * A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A
     * resource with no tags is counted as having one tag (one key and value pair).
     * </p>
     * <p>
     * <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     * <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of the
     * affected resource and its tags. Use that token in another request to get the remaining data. For example, if you
     * specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources with 10 tags each
     * (meaning that each resource has 10 key and value pairs), the output will consist of 3 pages, with the first page
     * displaying the first 10 resources, each with its 10 tags, the second page displaying the next 10 resources each
     * with its 10 tags, and the third page displaying the remaining 2 resources, each with its 10 tags.
     * </p>
     * <p/>
     * <p>
     * You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     * </p>
     * 
     * @param tagsPerPage
     *        A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated
     *        output. A resource with no tags is counted as having one tag (one key and value pair).</p>
     *        <p>
     *        <code>GetResources</code> does not split a resource and its associated tags across pages. If the specified
     *        <code>TagsPerPage</code> would cause such a break, a <code>PaginationToken</code> is returned in place of
     *        the affected resource and its tags. Use that token in another request to get the remaining data. For
     *        example, if you specify a <code>TagsPerPage</code> of <code>100</code> and the account has 22 resources
     *        with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of 3
     *        pages, with the first page displaying the first 10 resources, each with its 10 tags, the second page
     *        displaying the next 10 resources each with its 10 tags, and the third page displaying the remaining 2
     *        resources, each with its 10 tags.
     *        </p>
     *        <p/>
     *        <p>
     *        You can set <code>TagsPerPage</code> to a minimum of 100 items and the maximum of 500 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withTagsPerPage(Integer tagsPerPage) {
        setTagsPerPage(tagsPerPage);
        return this;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The constraints on the resources that you want returned. The format of each resource type is
     *         <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *         all tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     *         <code>ec2:instance</code> returns only EC2 instances. </p>
     *         <p>
     *         The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *         Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a list of service name strings, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For resource type strings, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *         ARNs</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceTypeFilters
     *        The constraints on the resources that you want returned. The format of each resource type is
     *        <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *        all tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     *        <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a list of service name strings, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resource type strings, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *        ARNs</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        </li>
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
     * The constraints on the resources that you want returned. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypeFilters(java.util.Collection)} or {@link #withResourceTypeFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceTypeFilters
     *        The constraints on the resources that you want returned. The format of each resource type is
     *        <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *        all tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     *        <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a list of service name strings, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resource type strings, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *        ARNs</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        </li>
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
     * The constraints on the resources that you want returned. The format of each resource type is
     * <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns all
     * tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource
     * Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceTypeFilters
     *        The constraints on the resources that you want returned. The format of each resource type is
     *        <code>service[:resourceType]</code>. For example, specifying a resource type of <code>ec2</code> returns
     *        all tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of
     *        <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a list of service name strings, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resource type strings, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *        ARNs</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        setResourceTypeFilters(resourceTypeFilters);
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
            sb.append("ResourceTypeFilters: ").append(getResourceTypeFilters());
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
        return hashCode;
    }

    @Override
    public GetResourcesRequest clone() {
        return (GetResourcesRequest) super.clone();
    }

}
