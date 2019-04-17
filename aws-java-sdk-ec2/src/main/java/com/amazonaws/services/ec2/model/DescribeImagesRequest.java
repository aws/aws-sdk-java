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
import com.amazonaws.services.ec2.model.transform.DescribeImagesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImagesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeImagesRequest> {

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code> (the
     * sender of the request), or <code>all</code> (public AMIs).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> executableUsers;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the Amazon EBS
     * volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     * example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     * <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     * <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> | <code>failed</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with the Intel
     * 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> imageIds;
    /**
     * <p>
     * Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     * request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> owners;

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code> (the
     * sender of the request), or <code>all</code> (public AMIs).
     * </p>
     * 
     * @return Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code>
     *         (the sender of the request), or <code>all</code> (public AMIs).
     */

    public java.util.List<String> getExecutableUsers() {
        if (executableUsers == null) {
            executableUsers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return executableUsers;
    }

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code> (the
     * sender of the request), or <code>all</code> (public AMIs).
     * </p>
     * 
     * @param executableUsers
     *        Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code>
     *        (the sender of the request), or <code>all</code> (public AMIs).
     */

    public void setExecutableUsers(java.util.Collection<String> executableUsers) {
        if (executableUsers == null) {
            this.executableUsers = null;
            return;
        }

        this.executableUsers = new com.amazonaws.internal.SdkInternalList<String>(executableUsers);
    }

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code> (the
     * sender of the request), or <code>all</code> (public AMIs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutableUsers(java.util.Collection)} or {@link #withExecutableUsers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param executableUsers
     *        Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code>
     *        (the sender of the request), or <code>all</code> (public AMIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withExecutableUsers(String... executableUsers) {
        if (this.executableUsers == null) {
            setExecutableUsers(new com.amazonaws.internal.SdkInternalList<String>(executableUsers.length));
        }
        for (String ele : executableUsers) {
            this.executableUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code> (the
     * sender of the request), or <code>all</code> (public AMIs).
     * </p>
     * 
     * @param executableUsers
     *        Scopes the images by users with explicit launch permissions. Specify an AWS account ID, <code>self</code>
     *        (the sender of the request), or <code>all</code> (public AMIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withExecutableUsers(java.util.Collection<String> executableUsers) {
        setExecutableUsers(executableUsers);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the Amazon EBS
     * volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     * example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     * <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     * <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> | <code>failed</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with the Intel
     * 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the
     *         Amazon EBS volume is deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping
     *         (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     *         <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is
     *         encrypted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the image (provided during image creation).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-id</code> - The ID of the image.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> |
     *         <code>ramdisk</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>is-public</code> - A Boolean that indicates whether the image is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manifest-location</code> - The location of the image manifest.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>name</code> - The name of the AMI (provided during image creation).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     *         <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *         user-configured AWS account alias, which is set from the IAM console.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the image owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code</code> - The product code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code.type</code> - The type of the product code (<code>devpay</code> |
     *         <code>marketplace</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ramdisk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>root-device-name</code> - The device name of the root device volume (for example,
     *         <code>/dev/sda1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     *         <code>instance-store</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> |
     *         <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-code</code> - The reason code for the state change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-message</code> - The message for the state change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with
     *         the Intel 82599 VF interface is enabled.
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
     *         <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
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
     * <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the Amazon EBS
     * volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     * example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     * <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     * <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> | <code>failed</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with the Intel
     * 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the
     *        Amazon EBS volume is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     *        example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     *        <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is
     *        encrypted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the image (provided during image creation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the image.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> |
     *        <code>ramdisk</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>is-public</code> - A Boolean that indicates whether the image is public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manifest-location</code> - The location of the image manifest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the AMI (provided during image creation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     *        <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *        user-configured AWS account alias, which is set from the IAM console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the image owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code.type</code> - The type of the product code (<code>devpay</code> |
     *        <code>marketplace</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>root-device-name</code> - The device name of the root device volume (for example,
     *        <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     *        <code>instance-store</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> |
     *        <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-code</code> - The reason code for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-message</code> - The message for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with
     *        the Intel 82599 VF interface is enabled.
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
     *        <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
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
     * <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the Amazon EBS
     * volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     * example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     * <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     * <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> | <code>failed</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with the Intel
     * 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
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
     *        <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the
     *        Amazon EBS volume is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     *        example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     *        <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is
     *        encrypted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the image (provided during image creation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the image.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> |
     *        <code>ramdisk</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>is-public</code> - A Boolean that indicates whether the image is public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manifest-location</code> - The location of the image manifest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the AMI (provided during image creation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     *        <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *        user-configured AWS account alias, which is set from the IAM console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the image owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code.type</code> - The type of the product code (<code>devpay</code> |
     *        <code>marketplace</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>root-device-name</code> - The device name of the root device volume (for example,
     *        <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     *        <code>instance-store</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> |
     *        <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-code</code> - The reason code for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-message</code> - The message for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with
     *        the Intel 82599 VF interface is enabled.
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
     *        <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withFilters(Filter... filters) {
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
     * <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the Amazon EBS
     * volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     * example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     * <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     * <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> | <code>failed</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with the Intel
     * 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>architecture</code> - The image architecture (<code>i386</code> | <code>x86_64</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.delete-on-termination</code> - A Boolean value that indicates whether the
     *        Amazon EBS volume is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.device-name</code> - The device name specified in the block device mapping (for
     *        example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-size</code> - The volume size of the EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-type</code> - The volume type of the EBS volume (<code>gp2</code> |
     *        <code>io1</code> | <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.encrypted</code> - A Boolean that indicates whether the EBS volume is
     *        encrypted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the image (provided during image creation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ena-support</code> - A Boolean that indicates whether enhanced networking with ENA is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor type (<code>ovm</code> | <code>xen</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the image.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-type</code> - The image type (<code>machine</code> | <code>kernel</code> |
     *        <code>ramdisk</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>is-public</code> - A Boolean that indicates whether the image is public.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manifest-location</code> - The location of the image manifest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code> - The name of the AMI (provided during image creation).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-alias</code> - String value from an Amazon-maintained list (<code>amazon</code> |
     *        <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused with the
     *        user-configured AWS account alias, which is set from the IAM console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the image owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform. To only list Windows-based AMIs, use <code>windows</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code.type</code> - The type of the product code (<code>devpay</code> |
     *        <code>marketplace</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>root-device-name</code> - The device name of the root device volume (for example,
     *        <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>root-device-type</code> - The type of the root device volume (<code>ebs</code> |
     *        <code>instance-store</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the image (<code>available</code> | <code>pending</code> |
     *        <code>failed</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-code</code> - The reason code for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-message</code> - The message for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sriov-net-support</code> - A value of <code>simple</code> indicates that enhanced networking with
     *        the Intel 82599 VF interface is enabled.
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
     *        <code>virtualization-type</code> - The virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     * 
     * @return One or more image IDs.</p>
     *         <p>
     *         Default: Describes all images available to you.
     */

    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
            imageIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return imageIds;
    }

    /**
     * <p>
     * One or more image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     * 
     * @param imageIds
     *        One or more image IDs.</p>
     *        <p>
     *        Default: Describes all images available to you.
     */

    public void setImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new com.amazonaws.internal.SdkInternalList<String>(imageIds);
    }

    /**
     * <p>
     * One or more image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        One or more image IDs.</p>
     *        <p>
     *        Default: Describes all images available to you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withImageIds(String... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new com.amazonaws.internal.SdkInternalList<String>(imageIds.length));
        }
        for (String ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     * 
     * @param imageIds
     *        One or more image IDs.</p>
     *        <p>
     *        Default: Describes all images available to you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withImageIds(java.util.Collection<String> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     * request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     * 
     * @return Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *         request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     *         <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     *         regardless of ownership.
     */

    public java.util.List<String> getOwners() {
        if (owners == null) {
            owners = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return owners;
    }

    /**
     * <p>
     * Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     * request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     * 
     * @param owners
     *        Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *        request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     *        <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     *        regardless of ownership.
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
     * Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     * request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOwners(java.util.Collection)} or {@link #withOwners(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param owners
     *        Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *        request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     *        <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     *        regardless of ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withOwners(String... owners) {
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
     * Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     * request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     * 
     * @param owners
     *        Filters the images by the owner. Specify an AWS account ID, <code>self</code> (owner is the sender of the
     *        request), or an AWS owner alias (valid values are <code>amazon</code> | <code>aws-marketplace</code> |
     *        <code>microsoft</code>). Omitting this option returns all images for which you have launch permissions,
     *        regardless of ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeImagesRequest> getDryRunRequest() {
        Request<DescribeImagesRequest> request = new DescribeImagesRequestMarshaller().marshall(this);
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
        if (getExecutableUsers() != null)
            sb.append("ExecutableUsers: ").append(getExecutableUsers()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getImageIds() != null)
            sb.append("ImageIds: ").append(getImageIds()).append(",");
        if (getOwners() != null)
            sb.append("Owners: ").append(getOwners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImagesRequest == false)
            return false;
        DescribeImagesRequest other = (DescribeImagesRequest) obj;
        if (other.getExecutableUsers() == null ^ this.getExecutableUsers() == null)
            return false;
        if (other.getExecutableUsers() != null && other.getExecutableUsers().equals(this.getExecutableUsers()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutableUsers() == null) ? 0 : getExecutableUsers().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImagesRequest clone() {
        return (DescribeImagesRequest) super.clone();
    }
}
