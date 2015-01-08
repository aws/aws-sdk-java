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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeImagesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeImages(DescribeImagesRequest) DescribeImages operation}.
 * <p>
 * Describes one or more of the images (AMIs, AKIs, and ARIs) available
 * to you. Images available to you include public images, private images
 * that you own, and private images owned by other AWS accounts but for
 * which you have explicit launch permissions.
 * </p>
 * <p>
 * <b>NOTE:</b> Deregistered images are included in the returned results
 * for an unspecified interval after deregistration.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeImages(DescribeImagesRequest)
 */
public class DescribeImagesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeImagesRequest> {

    /**
     * One or more image IDs. <p>Default: Describes all images available to
     * you.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> imageIds;

    /**
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     * (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     * the request), or <code>all</code> (all owners).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> owners;

    /**
     * Scopes the images by users with explicit launch permissions. Specify
     * an AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> executableUsers;

    /**
     * One or more filters. <ul> <li> <p><code>architecture</code> - The
     * image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     * <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     * Boolean value that indicates whether the Amazon EBS volume is deleted
     * on instance termination. </li> <li>
     * <p><code>block-device-mapping.device-name</code> - The device name for
     * the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     * <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     * snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>block-device-mapping.volume-size</code> - The volume size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>block-device-mapping.volume-type</code> - The volume type of
     * the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     * <code>io1</code>). </li> <li> <p><code>description</code> - The
     * description of the image (provided during image creation). </li> <li>
     * <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     * image. </li> <li> <p><code>image-type</code> - The image type
     * (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </li> <li> <p><code>is-public</code> - A Boolean that indicates
     * whether the image is public. </li> <li> <p><code>kernel-id</code> -
     * The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     * location of the image manifest. </li> <li> <p><code>name</code> - The
     * name of the AMI (provided during image creation). </li> <li>
     * <p><code>owner-alias</code> - The AWS account alias (for example,
     * <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the image owner. </li> <li> <p><code>platform</code> -
     * The platform. To only list Windows-based AMIs, use
     * <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     * product code. </li> <li> <p><code>product-code.type</code> - The type
     * of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>root-device-name</code> - The name of the root device volume
     * (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>root-device-type</code> - The type of the root device volume
     * (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     * <p><code>state</code> - The state of the image (<code>available</code>
     * | <code>pending</code> | <code>failed</code>). </li> <li>
     * <p><code>state-reason-code</code> - The reason code for the state
     * change. </li> <li> <p><code>state-reason-message</code> - The message
     * for the state change. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the tag-value filter. For example, if
     * you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>virtualization-type</code> - The
     * virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more image IDs. <p>Default: Describes all images available to
     * you.
     *
     * @return One or more image IDs. <p>Default: Describes all images available to
     *         you.
     */
    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
              imageIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              imageIds.setAutoConstruct(true);
        }
        return imageIds;
    }
    
    /**
     * One or more image IDs. <p>Default: Describes all images available to
     * you.
     *
     * @param imageIds One or more image IDs. <p>Default: Describes all images available to
     *         you.
     */
    public void setImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> imageIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(imageIds.size());
        imageIdsCopy.addAll(imageIds);
        this.imageIds = imageIdsCopy;
    }
    
    /**
     * One or more image IDs. <p>Default: Describes all images available to
     * you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageIds One or more image IDs. <p>Default: Describes all images available to
     *         you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withImageIds(String... imageIds) {
        if (getImageIds() == null) setImageIds(new java.util.ArrayList<String>(imageIds.length));
        for (String value : imageIds) {
            getImageIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more image IDs. <p>Default: Describes all images available to
     * you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageIds One or more image IDs. <p>Default: Describes all images available to
     *         you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> imageIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(imageIds.size());
            imageIdsCopy.addAll(imageIds);
            this.imageIds = imageIdsCopy;
        }

        return this;
    }

    /**
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     * (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     * the request), or <code>all</code> (all owners).
     *
     * @return Filters the images by the owner. Specify an AWS account ID,
     *         <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     *         (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     *         the request), or <code>all</code> (all owners).
     */
    public java.util.List<String> getOwners() {
        if (owners == null) {
              owners = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              owners.setAutoConstruct(true);
        }
        return owners;
    }
    
    /**
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     * (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     * the request), or <code>all</code> (all owners).
     *
     * @param owners Filters the images by the owner. Specify an AWS account ID,
     *         <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     *         (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     *         the request), or <code>all</code> (all owners).
     */
    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ownersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(owners.size());
        ownersCopy.addAll(owners);
        this.owners = ownersCopy;
    }
    
    /**
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     * (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     * the request), or <code>all</code> (all owners).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owners Filters the images by the owner. Specify an AWS account ID,
     *         <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     *         (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     *         the request), or <code>all</code> (all owners).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withOwners(String... owners) {
        if (getOwners() == null) setOwners(new java.util.ArrayList<String>(owners.length));
        for (String value : owners) {
            getOwners().add(value);
        }
        return this;
    }
    
    /**
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     * (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     * the request), or <code>all</code> (all owners).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owners Filters the images by the owner. Specify an AWS account ID,
     *         <code>amazon</code> (owner is Amazon), <code>aws-marketplace</code>
     *         (owner is AWS Marketplace), <code>self</code> (owner is the sender of
     *         the request), or <code>all</code> (all owners).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ownersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(owners.size());
            ownersCopy.addAll(owners);
            this.owners = ownersCopy;
        }

        return this;
    }

    /**
     * Scopes the images by users with explicit launch permissions. Specify
     * an AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     *
     * @return Scopes the images by users with explicit launch permissions. Specify
     *         an AWS account ID, <code>self</code> (the sender of the request), or
     *         <code>all</code> (public AMIs).
     */
    public java.util.List<String> getExecutableUsers() {
        if (executableUsers == null) {
              executableUsers = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              executableUsers.setAutoConstruct(true);
        }
        return executableUsers;
    }
    
    /**
     * Scopes the images by users with explicit launch permissions. Specify
     * an AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     *
     * @param executableUsers Scopes the images by users with explicit launch permissions. Specify
     *         an AWS account ID, <code>self</code> (the sender of the request), or
     *         <code>all</code> (public AMIs).
     */
    public void setExecutableUsers(java.util.Collection<String> executableUsers) {
        if (executableUsers == null) {
            this.executableUsers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> executableUsersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(executableUsers.size());
        executableUsersCopy.addAll(executableUsers);
        this.executableUsers = executableUsersCopy;
    }
    
    /**
     * Scopes the images by users with explicit launch permissions. Specify
     * an AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executableUsers Scopes the images by users with explicit launch permissions. Specify
     *         an AWS account ID, <code>self</code> (the sender of the request), or
     *         <code>all</code> (public AMIs).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withExecutableUsers(String... executableUsers) {
        if (getExecutableUsers() == null) setExecutableUsers(new java.util.ArrayList<String>(executableUsers.length));
        for (String value : executableUsers) {
            getExecutableUsers().add(value);
        }
        return this;
    }
    
    /**
     * Scopes the images by users with explicit launch permissions. Specify
     * an AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executableUsers Scopes the images by users with explicit launch permissions. Specify
     *         an AWS account ID, <code>self</code> (the sender of the request), or
     *         <code>all</code> (public AMIs).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withExecutableUsers(java.util.Collection<String> executableUsers) {
        if (executableUsers == null) {
            this.executableUsers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> executableUsersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(executableUsers.size());
            executableUsersCopy.addAll(executableUsers);
            this.executableUsers = executableUsersCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>architecture</code> - The
     * image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     * <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     * Boolean value that indicates whether the Amazon EBS volume is deleted
     * on instance termination. </li> <li>
     * <p><code>block-device-mapping.device-name</code> - The device name for
     * the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     * <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     * snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>block-device-mapping.volume-size</code> - The volume size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>block-device-mapping.volume-type</code> - The volume type of
     * the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     * <code>io1</code>). </li> <li> <p><code>description</code> - The
     * description of the image (provided during image creation). </li> <li>
     * <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     * image. </li> <li> <p><code>image-type</code> - The image type
     * (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </li> <li> <p><code>is-public</code> - A Boolean that indicates
     * whether the image is public. </li> <li> <p><code>kernel-id</code> -
     * The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     * location of the image manifest. </li> <li> <p><code>name</code> - The
     * name of the AMI (provided during image creation). </li> <li>
     * <p><code>owner-alias</code> - The AWS account alias (for example,
     * <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the image owner. </li> <li> <p><code>platform</code> -
     * The platform. To only list Windows-based AMIs, use
     * <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     * product code. </li> <li> <p><code>product-code.type</code> - The type
     * of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>root-device-name</code> - The name of the root device volume
     * (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>root-device-type</code> - The type of the root device volume
     * (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     * <p><code>state</code> - The state of the image (<code>available</code>
     * | <code>pending</code> | <code>failed</code>). </li> <li>
     * <p><code>state-reason-code</code> - The reason code for the state
     * change. </li> <li> <p><code>state-reason-message</code> - The message
     * for the state change. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the tag-value filter. For example, if
     * you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>virtualization-type</code> - The
     * virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>architecture</code> - The
     *         image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     *         <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     *         Boolean value that indicates whether the Amazon EBS volume is deleted
     *         on instance termination. </li> <li>
     *         <p><code>block-device-mapping.device-name</code> - The device name for
     *         the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     *         <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     *         snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>block-device-mapping.volume-size</code> - The volume size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>block-device-mapping.volume-type</code> - The volume type of
     *         the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     *         <code>io1</code>). </li> <li> <p><code>description</code> - The
     *         description of the image (provided during image creation). </li> <li>
     *         <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     *         <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     *         image. </li> <li> <p><code>image-type</code> - The image type
     *         (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     *         </li> <li> <p><code>is-public</code> - A Boolean that indicates
     *         whether the image is public. </li> <li> <p><code>kernel-id</code> -
     *         The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     *         location of the image manifest. </li> <li> <p><code>name</code> - The
     *         name of the AMI (provided during image creation). </li> <li>
     *         <p><code>owner-alias</code> - The AWS account alias (for example,
     *         <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the image owner. </li> <li> <p><code>platform</code> -
     *         The platform. To only list Windows-based AMIs, use
     *         <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     *         product code. </li> <li> <p><code>product-code.type</code> - The type
     *         of the product code (<code>devpay</code> | <code>marketplace</code>).
     *         </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>root-device-name</code> - The name of the root device volume
     *         (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>root-device-type</code> - The type of the root device volume
     *         (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     *         <p><code>state</code> - The state of the image (<code>available</code>
     *         | <code>pending</code> | <code>failed</code>). </li> <li>
     *         <p><code>state-reason-code</code> - The reason code for the state
     *         change. </li> <li> <p><code>state-reason-message</code> - The message
     *         for the state change. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the tag-value filter. For example, if
     *         you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>virtualization-type</code> - The
     *         virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     *         </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>architecture</code> - The
     * image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     * <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     * Boolean value that indicates whether the Amazon EBS volume is deleted
     * on instance termination. </li> <li>
     * <p><code>block-device-mapping.device-name</code> - The device name for
     * the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     * <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     * snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>block-device-mapping.volume-size</code> - The volume size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>block-device-mapping.volume-type</code> - The volume type of
     * the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     * <code>io1</code>). </li> <li> <p><code>description</code> - The
     * description of the image (provided during image creation). </li> <li>
     * <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     * image. </li> <li> <p><code>image-type</code> - The image type
     * (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </li> <li> <p><code>is-public</code> - A Boolean that indicates
     * whether the image is public. </li> <li> <p><code>kernel-id</code> -
     * The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     * location of the image manifest. </li> <li> <p><code>name</code> - The
     * name of the AMI (provided during image creation). </li> <li>
     * <p><code>owner-alias</code> - The AWS account alias (for example,
     * <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the image owner. </li> <li> <p><code>platform</code> -
     * The platform. To only list Windows-based AMIs, use
     * <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     * product code. </li> <li> <p><code>product-code.type</code> - The type
     * of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>root-device-name</code> - The name of the root device volume
     * (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>root-device-type</code> - The type of the root device volume
     * (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     * <p><code>state</code> - The state of the image (<code>available</code>
     * | <code>pending</code> | <code>failed</code>). </li> <li>
     * <p><code>state-reason-code</code> - The reason code for the state
     * change. </li> <li> <p><code>state-reason-message</code> - The message
     * for the state change. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the tag-value filter. For example, if
     * you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>virtualization-type</code> - The
     * virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>architecture</code> - The
     *         image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     *         <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     *         Boolean value that indicates whether the Amazon EBS volume is deleted
     *         on instance termination. </li> <li>
     *         <p><code>block-device-mapping.device-name</code> - The device name for
     *         the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     *         <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     *         snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>block-device-mapping.volume-size</code> - The volume size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>block-device-mapping.volume-type</code> - The volume type of
     *         the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     *         <code>io1</code>). </li> <li> <p><code>description</code> - The
     *         description of the image (provided during image creation). </li> <li>
     *         <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     *         <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     *         image. </li> <li> <p><code>image-type</code> - The image type
     *         (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     *         </li> <li> <p><code>is-public</code> - A Boolean that indicates
     *         whether the image is public. </li> <li> <p><code>kernel-id</code> -
     *         The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     *         location of the image manifest. </li> <li> <p><code>name</code> - The
     *         name of the AMI (provided during image creation). </li> <li>
     *         <p><code>owner-alias</code> - The AWS account alias (for example,
     *         <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the image owner. </li> <li> <p><code>platform</code> -
     *         The platform. To only list Windows-based AMIs, use
     *         <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     *         product code. </li> <li> <p><code>product-code.type</code> - The type
     *         of the product code (<code>devpay</code> | <code>marketplace</code>).
     *         </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>root-device-name</code> - The name of the root device volume
     *         (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>root-device-type</code> - The type of the root device volume
     *         (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     *         <p><code>state</code> - The state of the image (<code>available</code>
     *         | <code>pending</code> | <code>failed</code>). </li> <li>
     *         <p><code>state-reason-code</code> - The reason code for the state
     *         change. </li> <li> <p><code>state-reason-message</code> - The message
     *         for the state change. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the tag-value filter. For example, if
     *         you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>virtualization-type</code> - The
     *         virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     *         </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>architecture</code> - The
     * image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     * <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     * Boolean value that indicates whether the Amazon EBS volume is deleted
     * on instance termination. </li> <li>
     * <p><code>block-device-mapping.device-name</code> - The device name for
     * the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     * <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     * snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>block-device-mapping.volume-size</code> - The volume size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>block-device-mapping.volume-type</code> - The volume type of
     * the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     * <code>io1</code>). </li> <li> <p><code>description</code> - The
     * description of the image (provided during image creation). </li> <li>
     * <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     * image. </li> <li> <p><code>image-type</code> - The image type
     * (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </li> <li> <p><code>is-public</code> - A Boolean that indicates
     * whether the image is public. </li> <li> <p><code>kernel-id</code> -
     * The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     * location of the image manifest. </li> <li> <p><code>name</code> - The
     * name of the AMI (provided during image creation). </li> <li>
     * <p><code>owner-alias</code> - The AWS account alias (for example,
     * <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the image owner. </li> <li> <p><code>platform</code> -
     * The platform. To only list Windows-based AMIs, use
     * <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     * product code. </li> <li> <p><code>product-code.type</code> - The type
     * of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>root-device-name</code> - The name of the root device volume
     * (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>root-device-type</code> - The type of the root device volume
     * (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     * <p><code>state</code> - The state of the image (<code>available</code>
     * | <code>pending</code> | <code>failed</code>). </li> <li>
     * <p><code>state-reason-code</code> - The reason code for the state
     * change. </li> <li> <p><code>state-reason-message</code> - The message
     * for the state change. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the tag-value filter. For example, if
     * you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>virtualization-type</code> - The
     * virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>architecture</code> - The
     *         image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     *         <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     *         Boolean value that indicates whether the Amazon EBS volume is deleted
     *         on instance termination. </li> <li>
     *         <p><code>block-device-mapping.device-name</code> - The device name for
     *         the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     *         <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     *         snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>block-device-mapping.volume-size</code> - The volume size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>block-device-mapping.volume-type</code> - The volume type of
     *         the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     *         <code>io1</code>). </li> <li> <p><code>description</code> - The
     *         description of the image (provided during image creation). </li> <li>
     *         <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     *         <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     *         image. </li> <li> <p><code>image-type</code> - The image type
     *         (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     *         </li> <li> <p><code>is-public</code> - A Boolean that indicates
     *         whether the image is public. </li> <li> <p><code>kernel-id</code> -
     *         The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     *         location of the image manifest. </li> <li> <p><code>name</code> - The
     *         name of the AMI (provided during image creation). </li> <li>
     *         <p><code>owner-alias</code> - The AWS account alias (for example,
     *         <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the image owner. </li> <li> <p><code>platform</code> -
     *         The platform. To only list Windows-based AMIs, use
     *         <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     *         product code. </li> <li> <p><code>product-code.type</code> - The type
     *         of the product code (<code>devpay</code> | <code>marketplace</code>).
     *         </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>root-device-name</code> - The name of the root device volume
     *         (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>root-device-type</code> - The type of the root device volume
     *         (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     *         <p><code>state</code> - The state of the image (<code>available</code>
     *         | <code>pending</code> | <code>failed</code>). </li> <li>
     *         <p><code>state-reason-code</code> - The reason code for the state
     *         change. </li> <li> <p><code>state-reason-message</code> - The message
     *         for the state change. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the tag-value filter. For example, if
     *         you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>virtualization-type</code> - The
     *         virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>architecture</code> - The
     * image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     * <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     * Boolean value that indicates whether the Amazon EBS volume is deleted
     * on instance termination. </li> <li>
     * <p><code>block-device-mapping.device-name</code> - The device name for
     * the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     * <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     * snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>block-device-mapping.volume-size</code> - The volume size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>block-device-mapping.volume-type</code> - The volume type of
     * the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     * <code>io1</code>). </li> <li> <p><code>description</code> - The
     * description of the image (provided during image creation). </li> <li>
     * <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     * image. </li> <li> <p><code>image-type</code> - The image type
     * (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     * </li> <li> <p><code>is-public</code> - A Boolean that indicates
     * whether the image is public. </li> <li> <p><code>kernel-id</code> -
     * The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     * location of the image manifest. </li> <li> <p><code>name</code> - The
     * name of the AMI (provided during image creation). </li> <li>
     * <p><code>owner-alias</code> - The AWS account alias (for example,
     * <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     * account ID of the image owner. </li> <li> <p><code>platform</code> -
     * The platform. To only list Windows-based AMIs, use
     * <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     * product code. </li> <li> <p><code>product-code.type</code> - The type
     * of the product code (<code>devpay</code> | <code>marketplace</code>).
     * </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>root-device-name</code> - The name of the root device volume
     * (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>root-device-type</code> - The type of the root device volume
     * (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     * <p><code>state</code> - The state of the image (<code>available</code>
     * | <code>pending</code> | <code>failed</code>). </li> <li>
     * <p><code>state-reason-code</code> - The reason code for the state
     * change. </li> <li> <p><code>state-reason-message</code> - The message
     * for the state change. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the tag-value filter. For example, if
     * you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> <li> <p><code>virtualization-type</code> - The
     * virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>architecture</code> - The
     *         image architecture (<code>i386</code> | <code>x86_64</code>). </li>
     *         <li> <p><code>block-device-mapping.delete-on-termination</code> - A
     *         Boolean value that indicates whether the Amazon EBS volume is deleted
     *         on instance termination. </li> <li>
     *         <p><code>block-device-mapping.device-name</code> - The device name for
     *         the Amazon EBS volume (for example, <code>/dev/sdh</code>). </li> <li>
     *         <p><code>block-device-mapping.snapshot-id</code> - The ID of the
     *         snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>block-device-mapping.volume-size</code> - The volume size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>block-device-mapping.volume-type</code> - The volume type of
     *         the Amazon EBS volume (<code>gp2</code> | <code>standard</code> |
     *         <code>io1</code>). </li> <li> <p><code>description</code> - The
     *         description of the image (provided during image creation). </li> <li>
     *         <p><code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     *         <code>xen</code>). </li> <li> <p><code>image-id</code> - The ID of the
     *         image. </li> <li> <p><code>image-type</code> - The image type
     *         (<code>machine</code> | <code>kernel</code> | <code>ramdisk</code>).
     *         </li> <li> <p><code>is-public</code> - A Boolean that indicates
     *         whether the image is public. </li> <li> <p><code>kernel-id</code> -
     *         The kernel ID. </li> <li> <p><code>manifest-location</code> - The
     *         location of the image manifest. </li> <li> <p><code>name</code> - The
     *         name of the AMI (provided during image creation). </li> <li>
     *         <p><code>owner-alias</code> - The AWS account alias (for example,
     *         <code>amazon</code>). </li> <li> <p><code>owner-id</code> - The AWS
     *         account ID of the image owner. </li> <li> <p><code>platform</code> -
     *         The platform. To only list Windows-based AMIs, use
     *         <code>windows</code>. </li> <li> <p><code>product-code</code> - The
     *         product code. </li> <li> <p><code>product-code.type</code> - The type
     *         of the product code (<code>devpay</code> | <code>marketplace</code>).
     *         </li> <li> <p><code>ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>root-device-name</code> - The name of the root device volume
     *         (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>root-device-type</code> - The type of the root device volume
     *         (<code>ebs</code> | <code>instance-store</code>). </li> <li>
     *         <p><code>state</code> - The state of the image (<code>available</code>
     *         | <code>pending</code> | <code>failed</code>). </li> <li>
     *         <p><code>state-reason-code</code> - The reason code for the state
     *         change. </li> <li> <p><code>state-reason-message</code> - The message
     *         for the state change. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the tag-value filter. For example, if
     *         you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> <li> <p><code>virtualization-type</code> - The
     *         virtualization type (<code>paravirtual</code> | <code>hvm</code>).
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImagesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeImagesRequest> getDryRunRequest() {
        Request<DescribeImagesRequest> request = new DescribeImagesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageIds() != null) sb.append("ImageIds: " + getImageIds() + ",");
        if (getOwners() != null) sb.append("Owners: " + getOwners() + ",");
        if (getExecutableUsers() != null) sb.append("ExecutableUsers: " + getExecutableUsers() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode()); 
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode()); 
        hashCode = prime * hashCode + ((getExecutableUsers() == null) ? 0 : getExecutableUsers().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImagesRequest == false) return false;
        DescribeImagesRequest other = (DescribeImagesRequest)obj;
        
        if (other.getImageIds() == null ^ this.getImageIds() == null) return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false) return false; 
        if (other.getOwners() == null ^ this.getOwners() == null) return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false) return false; 
        if (other.getExecutableUsers() == null ^ this.getExecutableUsers() == null) return false;
        if (other.getExecutableUsers() != null && other.getExecutableUsers().equals(this.getExecutableUsers()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    