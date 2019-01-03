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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeFpgaImagesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFpgaImagesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeFpgaImagesRequest> {

    /**
     * <p>
     * One or more AFI IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fpgaImageIds;
    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the request), or
     * an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> owners;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> | <code>available</code> |
     * <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more AFI IDs.
     * </p>
     * 
     * @return One or more AFI IDs.
     */

    public java.util.List<String> getFpgaImageIds() {
        if (fpgaImageIds == null) {
            fpgaImageIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fpgaImageIds;
    }

    /**
     * <p>
     * One or more AFI IDs.
     * </p>
     * 
     * @param fpgaImageIds
     *        One or more AFI IDs.
     */

    public void setFpgaImageIds(java.util.Collection<String> fpgaImageIds) {
        if (fpgaImageIds == null) {
            this.fpgaImageIds = null;
            return;
        }

        this.fpgaImageIds = new com.amazonaws.internal.SdkInternalList<String>(fpgaImageIds);
    }

    /**
     * <p>
     * One or more AFI IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFpgaImageIds(java.util.Collection)} or {@link #withFpgaImageIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fpgaImageIds
     *        One or more AFI IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withFpgaImageIds(String... fpgaImageIds) {
        if (this.fpgaImageIds == null) {
            setFpgaImageIds(new com.amazonaws.internal.SdkInternalList<String>(fpgaImageIds.length));
        }
        for (String ele : fpgaImageIds) {
            this.fpgaImageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more AFI IDs.
     * </p>
     * 
     * @param fpgaImageIds
     *        One or more AFI IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withFpgaImageIds(java.util.Collection<String> fpgaImageIds) {
        setFpgaImageIds(fpgaImageIds);
        return this;
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the request), or
     * an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     * 
     * @return Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *         request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     */

    public java.util.List<String> getOwners() {
        if (owners == null) {
            owners = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return owners;
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the request), or
     * an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     * 
     * @param owners
     *        Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *        request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     */

    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }

        this.owners = new com.amazonaws.internal.SdkInternalList<String>(owners);
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the request), or
     * an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOwners(java.util.Collection)} or {@link #withOwners(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param owners
     *        Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *        request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withOwners(String... owners) {
        if (this.owners == null) {
            setOwners(new com.amazonaws.internal.SdkInternalList<String>(owners.length));
        }
        for (String ele : owners) {
            this.owners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the request), or
     * an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     * 
     * @param owners
     *        Filters the AFI by owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *        request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> | <code>available</code> |
     * <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The creation time of the AFI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>name</code> - The name of the AFI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the AFI owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code</code> - The product code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> |
     *         <code>available</code> | <code>unavailable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>update-time</code> - The time of the most recent update.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> | <code>available</code> |
     * <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The creation time of the AFI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the AFI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the AFI owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> |
     *        <code>available</code> | <code>unavailable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-time</code> - The time of the most recent update.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> | <code>available</code> |
     * <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The creation time of the AFI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the AFI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the AFI owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> |
     *        <code>available</code> | <code>unavailable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-time</code> - The time of the most recent update.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> | <code>available</code> |
     * <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The creation time of the AFI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fpga-image-global-id</code> - The global FPGA image identifier (AGFI ID).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the AFI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the AFI owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shell-version</code> - The version of the AWS Shell that was used to create the bitstream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the AFI (<code>pending</code> | <code>failed</code> |
     *        <code>available</code> | <code>unavailable</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>update-time</code> - The time of the most recent update.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeFpgaImagesRequest> getDryRunRequest() {
        Request<DescribeFpgaImagesRequest> request = new DescribeFpgaImagesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFpgaImageIds() != null)
            sb.append("FpgaImageIds: ").append(getFpgaImageIds()).append(",");
        if (getOwners() != null)
            sb.append("Owners: ").append(getOwners()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFpgaImagesRequest == false)
            return false;
        DescribeFpgaImagesRequest other = (DescribeFpgaImagesRequest) obj;
        if (other.getFpgaImageIds() == null ^ this.getFpgaImageIds() == null)
            return false;
        if (other.getFpgaImageIds() != null && other.getFpgaImageIds().equals(this.getFpgaImageIds()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageIds() == null) ? 0 : getFpgaImageIds().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFpgaImagesRequest clone() {
        return (DescribeFpgaImagesRequest) super.clone();
    }
}
