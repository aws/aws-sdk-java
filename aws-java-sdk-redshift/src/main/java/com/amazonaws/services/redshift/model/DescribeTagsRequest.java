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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift Cluster
     * Management Guide.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources that are associated with the specified key
     * or keys. For example, suppose that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with all resources that have either or both of these tag keys associated with them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;
    /**
     * <p>
     * A tag value or values for which you want to return all matching resources that are associated with the specified
     * value or values. For example, suppose that you have resources tagged with values called <code>admin</code> and
     * <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag values associated with them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagValues;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     *        <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example,
     *        <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift Cluster
     * Management Guide.
     * </p>
     * 
     * @param resourceType
     *        The type of resource with which you want to view tags. Valid resource types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cluster
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CIDR/IP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EC2 security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cluster security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subnet group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM connection
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM certificate
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Parameter group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Snapshot copy grant
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     *        "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *        >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift
     *        Cluster Management Guide.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift Cluster
     * Management Guide.
     * </p>
     * 
     * @return The type of resource with which you want to view tags. Valid resource types are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cluster
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CIDR/IP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EC2 security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Snapshot
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cluster security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Subnet group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM connection
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM certificate
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parameter group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Snapshot copy grant
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *         >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift
     *         Cluster Management Guide.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift Cluster
     * Management Guide.
     * </p>
     * 
     * @param resourceType
     *        The type of resource with which you want to view tags. Valid resource types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cluster
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CIDR/IP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EC2 security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cluster security group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subnet group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM connection
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HSM certificate
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Parameter group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Snapshot copy grant
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Amazon Redshift resource types and constructing ARNs, go to <a href=
     *        "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *        >Specifying Policy Elements: Actions, Effects, Resources, and Principals</a> in the Amazon Redshift
     *        Cluster Management Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number or response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned
     *        <code>marker</code> value.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * 
     * @return The maximum number or response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         <code>marker</code> value.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number or response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned
     *        <code>marker</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>marker</code> parameter and retrying the command. If the <code>marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>marker</code> parameter and retrying the command. If the <code>marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>marker</code> parameter and retrying the command. If the <code>marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources that are associated with the specified key
     * or keys. For example, suppose that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with all resources that have either or both of these tag keys associated with them.
     * </p>
     * 
     * @return A tag key or keys for which you want to return all matching resources that are associated with the
     *         specified key or keys. For example, suppose that you have resources tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *         Amazon Redshift returns a response with all resources that have either or both of these tag keys
     *         associated with them.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources that are associated with the specified key
     * or keys. For example, suppose that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with all resources that have either or both of these tag keys associated with them.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching resources that are associated with the
     *        specified key or keys. For example, suppose that you have resources tagged with keys called
     *        <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *        Amazon Redshift returns a response with all resources that have either or both of these tag keys
     *        associated with them.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources that are associated with the specified key
     * or keys. For example, suppose that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with all resources that have either or both of these tag keys associated with them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching resources that are associated with the
     *        specified key or keys. For example, suppose that you have resources tagged with keys called
     *        <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *        Amazon Redshift returns a response with all resources that have either or both of these tag keys
     *        associated with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources that are associated with the specified key
     * or keys. For example, suppose that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with all resources that have either or both of these tag keys associated with them.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching resources that are associated with the
     *        specified key or keys. For example, suppose that you have resources tagged with keys called
     *        <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *        Amazon Redshift returns a response with all resources that have either or both of these tag keys
     *        associated with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources that are associated with the specified
     * value or values. For example, suppose that you have resources tagged with values called <code>admin</code> and
     * <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag values associated with them.
     * </p>
     * 
     * @return A tag value or values for which you want to return all matching resources that are associated with the
     *         specified value or values. For example, suppose that you have resources tagged with values called
     *         <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon
     *         Redshift returns a response with all resources that have either or both of these tag values associated
     *         with them.
     */

    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
            tagValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagValues;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources that are associated with the specified
     * value or values. For example, suppose that you have resources tagged with values called <code>admin</code> and
     * <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag values associated with them.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching resources that are associated with the
     *        specified value or values. For example, suppose that you have resources tagged with values called
     *        <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon
     *        Redshift returns a response with all resources that have either or both of these tag values associated
     *        with them.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new com.amazonaws.internal.SdkInternalList<String>(tagValues);
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources that are associated with the specified
     * value or values. For example, suppose that you have resources tagged with values called <code>admin</code> and
     * <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag values associated with them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching resources that are associated with the
     *        specified value or values. For example, suppose that you have resources tagged with values called
     *        <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon
     *        Redshift returns a response with all resources that have either or both of these tag values associated
     *        with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new com.amazonaws.internal.SdkInternalList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources that are associated with the specified
     * value or values. For example, suppose that you have resources tagged with values called <code>admin</code> and
     * <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift returns a response
     * with all resources that have either or both of these tag values associated with them.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching resources that are associated with the
     *        specified value or values. For example, suppose that you have resources tagged with values called
     *        <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon
     *        Redshift returns a response with all resources that have either or both of these tag values associated
     *        with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys()).append(",");
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
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
    public DescribeTagsRequest clone() {
        return (DescribeTagsRequest) super.clone();
    }

}
