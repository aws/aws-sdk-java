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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/GetComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter,
     * the count of returned noncompliant resources includes only resources with the specified target IDs.
     * </p>
     */
    private java.util.List<String> targetIdFilters;
    /**
     * <p>
     * Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     * noncompliant resources includes only resources in the specified Regions.
     * </p>
     */
    private java.util.List<String> regionFilters;
    /**
     * <p>
     * Specifies that you want the response to include information for only resources of the specified types. The format
     * of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource type of
     * <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
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
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using a comma separated array. The array can include up to 100 items.
     * Note that the length constraint requirement applies to each resource type filter.
     * </p>
     */
    private java.util.List<String> resourceTypeFilters;
    /**
     * <p>
     * Specifies that you want the response to include information for only resources that have tags with the specified
     * tag keys. If you use this parameter, the count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     */
    private java.util.List<String> tagKeyFilters;
    /**
     * <p>
     * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are
     * sorted by those attributes.
     * </p>
     */
    private java.util.List<String> groupBy;
    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies a <code>PaginationToken</code> response value from a previous request to indicate that you want the
     * next page of results. Leave this parameter empty in your initial request.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter,
     * the count of returned noncompliant resources includes only resources with the specified target IDs.
     * </p>
     * 
     * @return Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this
     *         parameter, the count of returned noncompliant resources includes only resources with the specified target
     *         IDs.
     */

    public java.util.List<String> getTargetIdFilters() {
        return targetIdFilters;
    }

    /**
     * <p>
     * Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter,
     * the count of returned noncompliant resources includes only resources with the specified target IDs.
     * </p>
     * 
     * @param targetIdFilters
     *        Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this
     *        parameter, the count of returned noncompliant resources includes only resources with the specified target
     *        IDs.
     */

    public void setTargetIdFilters(java.util.Collection<String> targetIdFilters) {
        if (targetIdFilters == null) {
            this.targetIdFilters = null;
            return;
        }

        this.targetIdFilters = new java.util.ArrayList<String>(targetIdFilters);
    }

    /**
     * <p>
     * Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter,
     * the count of returned noncompliant resources includes only resources with the specified target IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIdFilters(java.util.Collection)} or {@link #withTargetIdFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetIdFilters
     *        Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this
     *        parameter, the count of returned noncompliant resources includes only resources with the specified target
     *        IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withTargetIdFilters(String... targetIdFilters) {
        if (this.targetIdFilters == null) {
            setTargetIdFilters(new java.util.ArrayList<String>(targetIdFilters.length));
        }
        for (String ele : targetIdFilters) {
            this.targetIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter,
     * the count of returned noncompliant resources includes only resources with the specified target IDs.
     * </p>
     * 
     * @param targetIdFilters
     *        Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this
     *        parameter, the count of returned noncompliant resources includes only resources with the specified target
     *        IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withTargetIdFilters(java.util.Collection<String> targetIdFilters) {
        setTargetIdFilters(targetIdFilters);
        return this;
    }

    /**
     * <p>
     * Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     * noncompliant resources includes only resources in the specified Regions.
     * </p>
     * 
     * @return Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     *         noncompliant resources includes only resources in the specified Regions.
     */

    public java.util.List<String> getRegionFilters() {
        return regionFilters;
    }

    /**
     * <p>
     * Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     * noncompliant resources includes only resources in the specified Regions.
     * </p>
     * 
     * @param regionFilters
     *        Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     *        noncompliant resources includes only resources in the specified Regions.
     */

    public void setRegionFilters(java.util.Collection<String> regionFilters) {
        if (regionFilters == null) {
            this.regionFilters = null;
            return;
        }

        this.regionFilters = new java.util.ArrayList<String>(regionFilters);
    }

    /**
     * <p>
     * Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     * noncompliant resources includes only resources in the specified Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionFilters(java.util.Collection)} or {@link #withRegionFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param regionFilters
     *        Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     *        noncompliant resources includes only resources in the specified Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withRegionFilters(String... regionFilters) {
        if (this.regionFilters == null) {
            setRegionFilters(new java.util.ArrayList<String>(regionFilters.length));
        }
        for (String ele : regionFilters) {
            this.regionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     * noncompliant resources includes only resources in the specified Regions.
     * </p>
     * 
     * @param regionFilters
     *        Specifies a list of AWS Regions to limit the output by. If you use this parameter, the count of returned
     *        noncompliant resources includes only resources in the specified Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withRegionFilters(java.util.Collection<String> regionFilters) {
        setRegionFilters(regionFilters);
        return this;
    }

    /**
     * <p>
     * Specifies that you want the response to include information for only resources of the specified types. The format
     * of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource type of
     * <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
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
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using a comma separated array. The array can include up to 100 items.
     * Note that the length constraint requirement applies to each resource type filter.
     * </p>
     * 
     * @return Specifies that you want the response to include information for only resources of the specified types.
     *         The format of each resource type is <code>service[:resourceType]</code>. For example, specifying a
     *         resource type of <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances).
     *         Specifying a resource type of <code>ec2:instance</code> returns only EC2 instances. </p>
     *         <p>
     *         The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *         Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a list of service name strings, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For resource type strings, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *         ARNs</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify multiple resource types by using a comma separated array. The array can include up to 100
     *         items. Note that the length constraint requirement applies to each resource type filter.
     */

    public java.util.List<String> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * <p>
     * Specifies that you want the response to include information for only resources of the specified types. The format
     * of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource type of
     * <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
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
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using a comma separated array. The array can include up to 100 items.
     * Note that the length constraint requirement applies to each resource type filter.
     * </p>
     * 
     * @param resourceTypeFilters
     *        Specifies that you want the response to include information for only resources of the specified types. The
     *        format of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource
     *        type of <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a
     *        resource type of <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a list of service name strings, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resource type strings, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *        ARNs</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify multiple resource types by using a comma separated array. The array can include up to 100
     *        items. Note that the length constraint requirement applies to each resource type filter.
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
     * Specifies that you want the response to include information for only resources of the specified types. The format
     * of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource type of
     * <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
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
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using a comma separated array. The array can include up to 100 items.
     * Note that the length constraint requirement applies to each resource type filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypeFilters(java.util.Collection)} or {@link #withResourceTypeFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceTypeFilters
     *        Specifies that you want the response to include information for only resources of the specified types. The
     *        format of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource
     *        type of <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a
     *        resource type of <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a list of service name strings, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resource type strings, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *        ARNs</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify multiple resource types by using a comma separated array. The array can include up to 100
     *        items. Note that the length constraint requirement applies to each resource type filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withResourceTypeFilters(String... resourceTypeFilters) {
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
     * Specifies that you want the response to include information for only resources of the specified types. The format
     * of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource type of
     * <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of
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
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using a comma separated array. The array can include up to 100 items.
     * Note that the length constraint requirement applies to each resource type filter.
     * </p>
     * 
     * @param resourceTypeFilters
     *        Specifies that you want the response to include information for only resources of the specified types. The
     *        format of each resource type is <code>service[:resourceType]</code>. For example, specifying a resource
     *        type of <code>ec2</code> returns all Amazon EC2 resources (which includes EC2 instances). Specifying a
     *        resource type of <code>ec2:instance</code> returns only EC2 instances. </p>
     *        <p>
     *        The string for each service name and resource type is the same as that embedded in a resource's Amazon
     *        Resource Name (ARN). Consult the <i>AWS General Reference</i> for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For a list of service name strings, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For resource type strings, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax">Example
     *        ARNs</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify multiple resource types by using a comma separated array. The array can include up to 100
     *        items. Note that the length constraint requirement applies to each resource type filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        setResourceTypeFilters(resourceTypeFilters);
        return this;
    }

    /**
     * <p>
     * Specifies that you want the response to include information for only resources that have tags with the specified
     * tag keys. If you use this parameter, the count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     * 
     * @return Specifies that you want the response to include information for only resources that have tags with the
     *         specified tag keys. If you use this parameter, the count of returned noncompliant resources includes only
     *         resources that have the specified tag keys.
     */

    public java.util.List<String> getTagKeyFilters() {
        return tagKeyFilters;
    }

    /**
     * <p>
     * Specifies that you want the response to include information for only resources that have tags with the specified
     * tag keys. If you use this parameter, the count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     * 
     * @param tagKeyFilters
     *        Specifies that you want the response to include information for only resources that have tags with the
     *        specified tag keys. If you use this parameter, the count of returned noncompliant resources includes only
     *        resources that have the specified tag keys.
     */

    public void setTagKeyFilters(java.util.Collection<String> tagKeyFilters) {
        if (tagKeyFilters == null) {
            this.tagKeyFilters = null;
            return;
        }

        this.tagKeyFilters = new java.util.ArrayList<String>(tagKeyFilters);
    }

    /**
     * <p>
     * Specifies that you want the response to include information for only resources that have tags with the specified
     * tag keys. If you use this parameter, the count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeyFilters(java.util.Collection)} or {@link #withTagKeyFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tagKeyFilters
     *        Specifies that you want the response to include information for only resources that have tags with the
     *        specified tag keys. If you use this parameter, the count of returned noncompliant resources includes only
     *        resources that have the specified tag keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withTagKeyFilters(String... tagKeyFilters) {
        if (this.tagKeyFilters == null) {
            setTagKeyFilters(new java.util.ArrayList<String>(tagKeyFilters.length));
        }
        for (String ele : tagKeyFilters) {
            this.tagKeyFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies that you want the response to include information for only resources that have tags with the specified
     * tag keys. If you use this parameter, the count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     * 
     * @param tagKeyFilters
     *        Specifies that you want the response to include information for only resources that have tags with the
     *        specified tag keys. If you use this parameter, the count of returned noncompliant resources includes only
     *        resources that have the specified tag keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withTagKeyFilters(java.util.Collection<String> tagKeyFilters) {
        setTagKeyFilters(tagKeyFilters);
        return this;
    }

    /**
     * <p>
     * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are
     * sorted by those attributes.
     * </p>
     * 
     * @return Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts
     *         are sorted by those attributes.
     * @see GroupByAttribute
     */

    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are
     * sorted by those attributes.
     * </p>
     * 
     * @param groupBy
     *        Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts
     *        are sorted by those attributes.
     * @see GroupByAttribute
     */

    public void setGroupBy(java.util.Collection<String> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<String>(groupBy);
    }

    /**
     * <p>
     * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are
     * sorted by those attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts
     *        are sorted by those attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupByAttribute
     */

    public GetComplianceSummaryRequest withGroupBy(String... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<String>(groupBy.length));
        }
        for (String ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are
     * sorted by those attributes.
     * </p>
     * 
     * @param groupBy
     *        Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts
     *        are sorted by those attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupByAttribute
     */

    public GetComplianceSummaryRequest withGroupBy(java.util.Collection<String> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are
     * sorted by those attributes.
     * </p>
     * 
     * @param groupBy
     *        Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts
     *        are sorted by those attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupByAttribute
     */

    public GetComplianceSummaryRequest withGroupBy(GroupByAttribute... groupBy) {
        java.util.ArrayList<String> groupByCopy = new java.util.ArrayList<String>(groupBy.length);
        for (GroupByAttribute value : groupBy) {
            groupByCopy.add(value.toString());
        }
        if (getGroupBy() == null) {
            setGroupBy(groupByCopy);
        } else {
            getGroupBy().addAll(groupByCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of results to be returned in each page. A query can return fewer than this
     *        maximum, even if there are more results still to return. You should always check the
     *        <code>PaginationToken</code> response value to see if there are more results. You can specify a minimum of
     *        1 and a maximum value of 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum,
     * even if there are more results still to return. You should always check the <code>PaginationToken</code> response
     * value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of results to be returned in each page. A query can return fewer than this
     *        maximum, even if there are more results still to return. You should always check the
     *        <code>PaginationToken</code> response value to see if there are more results. You can specify a minimum of
     *        1 and a maximum value of 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
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

    public GetComplianceSummaryRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getTargetIdFilters() != null)
            sb.append("TargetIdFilters: ").append(getTargetIdFilters()).append(",");
        if (getRegionFilters() != null)
            sb.append("RegionFilters: ").append(getRegionFilters()).append(",");
        if (getResourceTypeFilters() != null)
            sb.append("ResourceTypeFilters: ").append(getResourceTypeFilters()).append(",");
        if (getTagKeyFilters() != null)
            sb.append("TagKeyFilters: ").append(getTagKeyFilters()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceSummaryRequest == false)
            return false;
        GetComplianceSummaryRequest other = (GetComplianceSummaryRequest) obj;
        if (other.getTargetIdFilters() == null ^ this.getTargetIdFilters() == null)
            return false;
        if (other.getTargetIdFilters() != null && other.getTargetIdFilters().equals(this.getTargetIdFilters()) == false)
            return false;
        if (other.getRegionFilters() == null ^ this.getRegionFilters() == null)
            return false;
        if (other.getRegionFilters() != null && other.getRegionFilters().equals(this.getRegionFilters()) == false)
            return false;
        if (other.getResourceTypeFilters() == null ^ this.getResourceTypeFilters() == null)
            return false;
        if (other.getResourceTypeFilters() != null && other.getResourceTypeFilters().equals(this.getResourceTypeFilters()) == false)
            return false;
        if (other.getTagKeyFilters() == null ^ this.getTagKeyFilters() == null)
            return false;
        if (other.getTagKeyFilters() != null && other.getTagKeyFilters().equals(this.getTagKeyFilters()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetIdFilters() == null) ? 0 : getTargetIdFilters().hashCode());
        hashCode = prime * hashCode + ((getRegionFilters() == null) ? 0 : getRegionFilters().hashCode());
        hashCode = prime * hashCode + ((getResourceTypeFilters() == null) ? 0 : getResourceTypeFilters().hashCode());
        hashCode = prime * hashCode + ((getTagKeyFilters() == null) ? 0 : getTagKeyFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceSummaryRequest clone() {
        return (GetComplianceSummaryRequest) super.clone();
    }

}
