/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeTags(DescribeTagsRequest) DescribeTags operation}.
 * <p>
 * Returns a list of tags. You can return tags from a specific resource
 * by specifying an ARN, or you can return all tags for a given type of
 * resource, such as clusters, snapshots, and so on.
 * </p>
 * <p>
 * The following are limitations for <code>DescribeTags</code> :
 * 
 * <ul>
 * <li>You cannot specify an ARN and a resource-type value together in
 * the same request.</li>
 * <li>You cannot use the <code>MaxRecords</code> and
 * <code>Marker</code> parameters together with the ARN parameter.</li>
 * <li>The <code>MaxRecords</code> parameter can be a range from 10 to
 * 50 results to return in a request.</li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * If you specify both tag keys and tag values in the same request,
 * Amazon Redshift returns all resources that match any combination of
 * the specified keys and values. For example, if you have
 * <code>owner</code> and <code>environment</code> for tag keys, and
 * <code>admin</code> and <code>test</code> for tag values, all resources
 * that have any combination of those values are returned.
 * </p>
 * <p>
 * If both tag keys and values are omitted from the request, resources
 * are returned regardless of whether they have tag keys or values
 * associated with them.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeTags(DescribeTagsRequest)
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) for which you want to describe the tag
     * or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    private String resourceName;

    /**
     * The type of resource with which you want to view tags. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     */
    private String resourceType;

    /**
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned
     * <code>marker</code> value.
     */
    private Integer maxRecords;

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response
     * records have been retrieved for the request.
     */
    private String marker;

    /**
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example,
     * suppose that you have resources tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag keys
     * associated with them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * A tag value or values for which you want to return all matching
     * resources that are associated with the specified value or values. For
     * example, suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValues;

    /**
     * The Amazon Resource Name (ARN) for which you want to describe the tag
     * or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @return The Amazon Resource Name (ARN) for which you want to describe the tag
     *         or tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) for which you want to describe the tag
     * or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @param resourceName The Amazon Resource Name (ARN) for which you want to describe the tag
     *         or tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) for which you want to describe the tag
     * or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon Resource Name (ARN) for which you want to describe the tag
     *         or tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * The type of resource with which you want to view tags. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     *
     * @return The type of resource with which you want to view tags. Valid resource
     *         types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     *         group</li> <li>Snapshot</li> <li>Cluster security group</li>
     *         <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     *         <li>Parameter group</li> </ul> <p> For more information about Amazon
     *         Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     *         an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     *         Redshift Cluster Management Guide.
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of resource with which you want to view tags. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     *
     * @param resourceType The type of resource with which you want to view tags. Valid resource
     *         types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     *         group</li> <li>Snapshot</li> <li>Cluster security group</li>
     *         <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     *         <li>Parameter group</li> </ul> <p> For more information about Amazon
     *         Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     *         an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     *         Redshift Cluster Management Guide.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of resource with which you want to view tags. Valid resource
     * types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     * group</li> <li>Snapshot</li> <li>Cluster security group</li>
     * <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     * <li>Parameter group</li> </ul> <p> For more information about Amazon
     * Redshift resource types and constructing ARNs, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     * an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     * Redshift Cluster Management Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceType The type of resource with which you want to view tags. Valid resource
     *         types are: <ul> <li>Cluster</li> <li>CIDR/IP</li> <li>EC2 security
     *         group</li> <li>Snapshot</li> <li>Cluster security group</li>
     *         <li>Subnet group</li> <li>HSM connection</li> <li>HSM certificate</li>
     *         <li>Parameter group</li> </ul> <p> For more information about Amazon
     *         Redshift resource types and constructing ARNs, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/constructing-redshift-arn.html">Constructing
     *         an Amazon Redshift Amazon Resource Name (ARN)</a> in the Amazon
     *         Redshift Cluster Management Guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned
     * <code>marker</code> value.
     *
     * @return The maximum number or response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned
     *         <code>marker</code> value.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned
     * <code>marker</code> value.
     *
     * @param maxRecords The maximum number or response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned
     *         <code>marker</code> value.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned
     * <code>marker</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number or response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned
     *         <code>marker</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @return A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>marker</code> parameter and retrying the
     *         command. If the <code>marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>marker</code> parameter and retrying the
     *         command. If the <code>marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response
     * records have been retrieved for the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>marker</code> parameter and retrying the
     *         command. If the <code>marker</code> field is empty, all response
     *         records have been retrieved for the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example,
     * suppose that you have resources tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag keys
     * associated with them.
     *
     * @return A tag key or keys for which you want to return all matching resources
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have resources tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with all resources that have either or both of these tag keys
     *         associated with them.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example,
     * suppose that you have resources tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag keys
     * associated with them.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching resources
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have resources tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with all resources that have either or both of these tag keys
     *         associated with them.
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
        tagKeysCopy.addAll(tagKeys);
        this.tagKeys = tagKeysCopy;
    }
    
    /**
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example,
     * suppose that you have resources tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag keys
     * associated with them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or {@link
     * #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching resources
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have resources tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with all resources that have either or both of these tag keys
     *         associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        for (String value : tagKeys) {
            getTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example,
     * suppose that you have resources tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag keys
     * associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching resources
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have resources tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with all resources that have either or both of these tag keys
     *         associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
            tagKeysCopy.addAll(tagKeys);
            this.tagKeys = tagKeysCopy;
        }

        return this;
    }

    /**
     * A tag value or values for which you want to return all matching
     * resources that are associated with the specified value or values. For
     * example, suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     *
     * @return A tag value or values for which you want to return all matching
     *         resources that are associated with the specified value or values. For
     *         example, suppose that you have resources tagged with values called
     *         <code>admin</code> and <code>test</code>. If you specify both of these
     *         tag values in the request, Amazon Redshift returns a response with all
     *         resources that have either or both of these tag values associated with
     *         them.
     */
    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
              tagValues = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagValues.setAutoConstruct(true);
        }
        return tagValues;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * resources that are associated with the specified value or values. For
     * example, suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         resources that are associated with the specified value or values. For
     *         example, suppose that you have resources tagged with values called
     *         <code>admin</code> and <code>test</code>. If you specify both of these
     *         tag values in the request, Amazon Redshift returns a response with all
     *         resources that have either or both of these tag values associated with
     *         them.
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagValues.size());
        tagValuesCopy.addAll(tagValues);
        this.tagValues = tagValuesCopy;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * resources that are associated with the specified value or values. For
     * example, suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagValues(java.util.Collection)} or {@link
     * #withTagValues(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         resources that are associated with the specified value or values. For
     *         example, suppose that you have resources tagged with values called
     *         <code>admin</code> and <code>test</code>. If you specify both of these
     *         tag values in the request, Amazon Redshift returns a response with all
     *         resources that have either or both of these tag values associated with
     *         them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withTagValues(String... tagValues) {
        if (getTagValues() == null) setTagValues(new java.util.ArrayList<String>(tagValues.length));
        for (String value : tagValues) {
            getTagValues().add(value);
        }
        return this;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * resources that are associated with the specified value or values. For
     * example, suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         resources that are associated with the specified value or values. For
     *         example, suppose that you have resources tagged with values called
     *         <code>admin</code> and <code>test</code>. If you specify both of these
     *         tag values in the request, Amazon Redshift returns a response with all
     *         resources that have either or both of these tag values associated with
     *         them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagValues.size());
            tagValuesCopy.addAll(tagValues);
            this.tagValues = tagValuesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null) sb.append("TagValues: " + getTagValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode()); 
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTagsRequest == false) return false;
        DescribeTagsRequest other = (DescribeTagsRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        if (other.getTagValues() == null ^ this.getTagValues() == null) return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeTagsRequest clone() {
        
            return (DescribeTagsRequest) super.clone();
    }

}
    