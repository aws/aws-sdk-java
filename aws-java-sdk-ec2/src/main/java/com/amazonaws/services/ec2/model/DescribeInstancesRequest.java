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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInstancesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeInstancesRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (<code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance, for
     * example, <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume is
     * deleted on instance termination.
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
     * <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     * <code>uefi</code> | <code>uefi-preferred</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     * Reservation preference (<code>open</code> | <code>none</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The ID of
     * the targeted Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     * - The ARN of the targeted Capacity Reservation group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or start (
     * <code>legacy-bios</code> | <code>uefi</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced networking with
     * ENA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon Web
     * Services Nitro Enclaves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     * hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The value
     * <code>xen</code> is used for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as an name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a Capacity
     * Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte is used
     * for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values
     * are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-address</code> - The IPv6 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the launch
     * group (for example, 0, 1, 2, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time zone
     * (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a wildcard (
     * <code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     * <code>disabled</code> | <code>default</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your instance
     * (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop limit
     * (integer, possible values <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request authorization state (<code>optional</code> |
     * <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the instance
     * metadata (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     * <code>applied</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     * <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.association-id</code> - The association ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4 address
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic IP
     * address (IPv4) with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network interface is
     * the primary private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated the
     * Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The association ID returned when the network
     * interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached to an
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is deleted
     * when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the network
     * interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface with
     * an IPv6 address is unreachable from the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is the
     * primary IPv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the network interface is being managed by
     * Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     * <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network interface performs source/destination
     * checking. A value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking
     * is disabled. The value must be <code>false</code> for the network interface to perform network address
     * translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     * <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     * <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     * <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Web</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     * <code>resource-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance (for example, shows
     * "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, Amazon
     * Web Services Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time you
     * launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be
     * associated with more than one instance if you launch multiple instances using the same launch request. For
     * example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same
     * launch request, you also get one reservation ID.
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
     * <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code> means that checking is disabled. The
     * value must be <code>false</code> for the instance to perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources that have
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     * <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     * <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     * <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     * <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     * <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     * <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for example,
     * <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     * <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (<code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance, for
     * example, <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume is
     * deleted on instance termination.
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
     * <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     * <code>uefi</code> | <code>uefi-preferred</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     * Reservation preference (<code>open</code> | <code>none</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The ID of
     * the targeted Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     * - The ARN of the targeted Capacity Reservation group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or start (
     * <code>legacy-bios</code> | <code>uefi</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced networking with
     * ENA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon Web
     * Services Nitro Enclaves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     * hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The value
     * <code>xen</code> is used for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as an name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a Capacity
     * Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte is used
     * for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values
     * are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-address</code> - The IPv6 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the launch
     * group (for example, 0, 1, 2, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time zone
     * (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a wildcard (
     * <code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     * <code>disabled</code> | <code>default</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your instance
     * (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop limit
     * (integer, possible values <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request authorization state (<code>optional</code> |
     * <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the instance
     * metadata (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     * <code>applied</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     * <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.association-id</code> - The association ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4 address
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic IP
     * address (IPv4) with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network interface is
     * the primary private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated the
     * Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The association ID returned when the network
     * interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached to an
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is deleted
     * when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the network
     * interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface with
     * an IPv6 address is unreachable from the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is the
     * primary IPv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the network interface is being managed by
     * Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     * <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network interface performs source/destination
     * checking. A value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking
     * is disabled. The value must be <code>false</code> for the network interface to perform network address
     * translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     * <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     * <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     * <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Web</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     * <code>resource-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance (for example, shows
     * "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, Amazon
     * Web Services Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time you
     * launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be
     * associated with more than one instance if you launch multiple instances using the same launch request. For
     * example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same
     * launch request, you also get one reservation ID.
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
     * <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code> means that checking is disabled. The
     * value must be <code>false</code> for the instance to perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources that have
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     * <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     * <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     * <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     * <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     * <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     * <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for example,
     * <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     * <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (
     *         <code>default</code> | <code>host</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     *         <code>arm64</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance,
     *         for example, <code>2022-09-15T17:15:20.000Z</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume
     *         is deleted on instance termination.
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
     *         <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     *         <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     *         <code>uefi</code> | <code>uefi-preferred</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was
     *         launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     *         Reservation preference (<code>open</code> | <code>none</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The
     *         ID of the targeted Capacity Reservation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     *         - The ARN of the targeted Capacity Reservation group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client-token</code> - The idempotency token you provided when you launched the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or
     *         start (<code>legacy-bios</code> | <code>uefi</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dns-name</code> - The public DNS name of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS
     *         I/O.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced
     *         networking with ENA.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for
     *         Amazon Web Services Nitro Enclaves.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled
     *         for hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The
     *         value <code>xen</code> is used for both Xen and Nitro hypervisors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as
     *         an ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an
     *         ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as
     *         an name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-id</code> - The ID of the image used to launch the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a
     *         Capacity Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte
     *         is used for internal purposes and should be ignored. The low byte is set based on the state represented.
     *         The valid values are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and
     *         80 (stopped).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *         | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance.group-id</code> - The ID of the security group for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance.group-name</code> - The name of the security group for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-address</code> - The public IPv4 address of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-address</code> - The IPv6 address of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key-name</code> - The name of the key pair used when the instance was launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the
     *         launch group (for example, 0, 1, 2, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC
     *         time zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a
     *         wildcard (<code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance
     *         (<code>disabled</code> | <code>default</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your
     *         instance (<code>enabled</code> | <code>disabled</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     *         <code>disabled</code> | <code>enabled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     *         <code>disabled</code> | <code>enabled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop
     *         limit (integer, possible values <code>1</code> to <code>64</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.http-tokens</code> - The metadata request authorization state (
     *         <code>optional</code> | <code>required</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the
     *         instance metadata (<code>enabled</code> | <code>disabled</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     *         <code>applied</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     *         <code>enabled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.association-id</code> - The association ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4
     *         address associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic
     *         IP address (IPv4) with a network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network
     *         interface is the primary private IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with
     *         the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated
     *         the Elastic IP address (IPv4) for your network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.association-id</code> - The association ID returned when the network
     *         interface was associated with an IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4)
     *         associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.public-dns-name</code> - The public DNS name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound
     *         to the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached
     *         to an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is
     *         deleted when an instance is terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.device-index</code> - The device index to which the network interface
     *         is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network
     *         interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the
     *         network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *         <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network
     *         interface with an IPv6 address is unreachable from the public internet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.description</code> - The description of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.group-id</code> - The ID of a security group associated with the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.group-name</code> - The name of a security group associated with the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is
     *         the primary IPv6 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.mac-address</code> - The MAC address of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.private-ip-address</code> - The private IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.public-dns-name</code> - The public DNS name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.requester-id</code> - The requester ID for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.requester-managed</code> - Indicates whether the network interface is being
     *         managed by Amazon Web Services.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     *         <code>in-use</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.source-dest-check</code> - Whether the network interface performs
     *         source/destination checking. A value of <code>true</code> means that checking is enabled, and
     *         <code>false</code> means that checking is disabled. The value must be <code>false</code> for the network
     *         interface to perform network address translation (NAT) in your VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>placement-group-name</code> - The name of the placement group for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>placement-partition-number</code> - The partition in which the instance is located.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     *         <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     *         <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     *         <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     *         <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     *         <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     *         <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     *         <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     *         <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     *         <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     *         <code>Windows with SQL Server Web</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates
     *         whether to respond to DNS queries for instance hostnames with DNS A records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates
     *         whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     *         <code>resource-name</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-ip-address</code> - The private IPv4 address of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>
     *         ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ramdisk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reason</code> - The reason for the current state of the instance (for example, shows
     *         "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code
     *         filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *         Amazon Web Services Management Console, Auto Scaling, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time
     *         you launch an instance. A reservation ID has a one-to-one relationship with an instance launch request,
     *         but can be associated with more than one instance if you launch multiple instances using the same launch
     *         request. For example, if you launch one instance, you get one reservation ID. If you launch ten instances
     *         using the same launch request, you also get one reservation ID.
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
     *         <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A
     *         value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking is
     *         disabled. The value must be <code>false</code> for the instance to perform network address translation
     *         (NAT) in your VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-code</code> - The reason code for the state change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-message</code> - A message that describes the state change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         that have a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     *         <code>host</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (
     *         <code>v2.0</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     *         <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     *         <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     *         <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     *         <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     *         <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     *         <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for
     *         example, <code>2022-09-15T17:15:20.000Z</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     *         <code>hvm</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (<code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance, for
     * example, <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume is
     * deleted on instance termination.
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
     * <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     * <code>uefi</code> | <code>uefi-preferred</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     * Reservation preference (<code>open</code> | <code>none</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The ID of
     * the targeted Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     * - The ARN of the targeted Capacity Reservation group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or start (
     * <code>legacy-bios</code> | <code>uefi</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced networking with
     * ENA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon Web
     * Services Nitro Enclaves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     * hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The value
     * <code>xen</code> is used for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as an name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a Capacity
     * Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte is used
     * for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values
     * are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-address</code> - The IPv6 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the launch
     * group (for example, 0, 1, 2, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time zone
     * (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a wildcard (
     * <code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     * <code>disabled</code> | <code>default</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your instance
     * (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop limit
     * (integer, possible values <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request authorization state (<code>optional</code> |
     * <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the instance
     * metadata (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     * <code>applied</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     * <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.association-id</code> - The association ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4 address
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic IP
     * address (IPv4) with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network interface is
     * the primary private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated the
     * Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The association ID returned when the network
     * interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached to an
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is deleted
     * when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the network
     * interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface with
     * an IPv6 address is unreachable from the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is the
     * primary IPv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the network interface is being managed by
     * Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     * <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network interface performs source/destination
     * checking. A value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking
     * is disabled. The value must be <code>false</code> for the network interface to perform network address
     * translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     * <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     * <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     * <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Web</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     * <code>resource-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance (for example, shows
     * "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, Amazon
     * Web Services Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time you
     * launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be
     * associated with more than one instance if you launch multiple instances using the same launch request. For
     * example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same
     * launch request, you also get one reservation ID.
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
     * <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code> means that checking is disabled. The
     * value must be <code>false</code> for the instance to perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources that have
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     * <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     * <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     * <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     * <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     * <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     * <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for example,
     * <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     * <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (
     *        <code>default</code> | <code>host</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     *        <code>arm64</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance,
     *        for example, <code>2022-09-15T17:15:20.000Z</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume
     *        is deleted on instance termination.
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
     *        <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     *        <code>uefi</code> | <code>uefi-preferred</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was
     *        launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     *        Reservation preference (<code>open</code> | <code>none</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The
     *        ID of the targeted Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     *        - The ARN of the targeted Capacity Reservation group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token you provided when you launched the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or
     *        start (<code>legacy-bios</code> | <code>uefi</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dns-name</code> - The public DNS name of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS
     *        I/O.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced
     *        networking with ENA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon
     *        Web Services Nitro Enclaves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     *        hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The
     *        value <code>xen</code> is used for both Xen and Nitro hypervisors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an
     *        ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an
     *        ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as
     *        an name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the image used to launch the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a
     *        Capacity Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte
     *        is used for internal purposes and should be ignored. The low byte is set based on the state represented.
     *        The valid values are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and
     *        80 (stopped).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *        | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance.group-id</code> - The ID of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance.group-name</code> - The name of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-address</code> - The public IPv4 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-address</code> - The IPv6 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key-name</code> - The name of the key pair used when the instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the
     *        launch group (for example, 0, 1, 2, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time
     *        zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a
     *        wildcard (<code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     *        <code>disabled</code> | <code>default</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your
     *        instance (<code>enabled</code> | <code>disabled</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     *        <code>disabled</code> | <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     *        <code>disabled</code> | <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop
     *        limit (integer, possible values <code>1</code> to <code>64</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-tokens</code> - The metadata request authorization state (
     *        <code>optional</code> | <code>required</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the
     *        instance metadata (<code>enabled</code> | <code>disabled</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     *        <code>applied</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     *        <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.association-id</code> - The association ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4
     *        address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic
     *        IP address (IPv4) with a network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network
     *        interface is the primary private IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated
     *        the Elastic IP address (IPv4) for your network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.association-id</code> - The association ID returned when the network
     *        interface was associated with an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4)
     *        associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound
     *        to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached
     *        to an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is
     *        deleted when an instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.device-index</code> - The device index to which the network interface
     *        is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network
     *        interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the
     *        network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface
     *        with an IPv6 address is unreachable from the public internet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - The description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-id</code> - The ID of a security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-name</code> - The name of a security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is
     *        the primary IPv6 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.mac-address</code> - The MAC address of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-ip-address</code> - The private IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.requester-id</code> - The requester ID for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.requester-managed</code> - Indicates whether the network interface is being
     *        managed by Amazon Web Services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     *        <code>in-use</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.source-dest-check</code> - Whether the network interface performs
     *        source/destination checking. A value of <code>true</code> means that checking is enabled, and
     *        <code>false</code> means that checking is disabled. The value must be <code>false</code> for the network
     *        interface to perform network address translation (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>placement-group-name</code> - The name of the placement group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>placement-partition-number</code> - The partition in which the instance is located.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     *        <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     *        <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     *        <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     *        <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Web</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether
     *        to respond to DNS queries for instance hostnames with DNS A records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates
     *        whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     *        <code>resource-name</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - The private IPv4 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reason</code> - The reason for the current state of the instance (for example, shows
     *        "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *        Amazon Web Services Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time
     *        you launch an instance. A reservation ID has a one-to-one relationship with an instance launch request,
     *        but can be associated with more than one instance if you launch multiple instances using the same launch
     *        request. For example, if you launch one instance, you get one reservation ID. If you launch ten instances
     *        using the same launch request, you also get one reservation ID.
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
     *        <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A
     *        value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking is
     *        disabled. The value must be <code>false</code> for the instance to perform network address translation
     *        (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-code</code> - The reason code for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-message</code> - A message that describes the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        that have a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     *        <code>host</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     *        <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     *        <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     *        <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     *        <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     *        <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     *        <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for
     *        example, <code>2022-09-15T17:15:20.000Z</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     *        <code>hvm</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (<code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance, for
     * example, <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume is
     * deleted on instance termination.
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
     * <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     * <code>uefi</code> | <code>uefi-preferred</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     * Reservation preference (<code>open</code> | <code>none</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The ID of
     * the targeted Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     * - The ARN of the targeted Capacity Reservation group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or start (
     * <code>legacy-bios</code> | <code>uefi</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced networking with
     * ENA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon Web
     * Services Nitro Enclaves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     * hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The value
     * <code>xen</code> is used for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as an name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a Capacity
     * Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte is used
     * for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values
     * are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-address</code> - The IPv6 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the launch
     * group (for example, 0, 1, 2, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time zone
     * (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a wildcard (
     * <code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     * <code>disabled</code> | <code>default</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your instance
     * (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop limit
     * (integer, possible values <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request authorization state (<code>optional</code> |
     * <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the instance
     * metadata (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     * <code>applied</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     * <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.association-id</code> - The association ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4 address
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic IP
     * address (IPv4) with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network interface is
     * the primary private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated the
     * Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The association ID returned when the network
     * interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached to an
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is deleted
     * when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the network
     * interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface with
     * an IPv6 address is unreachable from the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is the
     * primary IPv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the network interface is being managed by
     * Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     * <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network interface performs source/destination
     * checking. A value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking
     * is disabled. The value must be <code>false</code> for the network interface to perform network address
     * translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     * <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     * <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     * <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Web</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     * <code>resource-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance (for example, shows
     * "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, Amazon
     * Web Services Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time you
     * launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be
     * associated with more than one instance if you launch multiple instances using the same launch request. For
     * example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same
     * launch request, you also get one reservation ID.
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
     * <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code> means that checking is disabled. The
     * value must be <code>false</code> for the instance to perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources that have
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     * <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     * <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     * <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     * <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     * <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     * <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for example,
     * <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     * <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
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
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (
     *        <code>default</code> | <code>host</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     *        <code>arm64</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance,
     *        for example, <code>2022-09-15T17:15:20.000Z</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume
     *        is deleted on instance termination.
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
     *        <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     *        <code>uefi</code> | <code>uefi-preferred</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was
     *        launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     *        Reservation preference (<code>open</code> | <code>none</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The
     *        ID of the targeted Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     *        - The ARN of the targeted Capacity Reservation group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token you provided when you launched the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or
     *        start (<code>legacy-bios</code> | <code>uefi</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dns-name</code> - The public DNS name of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS
     *        I/O.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced
     *        networking with ENA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon
     *        Web Services Nitro Enclaves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     *        hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The
     *        value <code>xen</code> is used for both Xen and Nitro hypervisors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an
     *        ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an
     *        ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as
     *        an name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the image used to launch the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a
     *        Capacity Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte
     *        is used for internal purposes and should be ignored. The low byte is set based on the state represented.
     *        The valid values are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and
     *        80 (stopped).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *        | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance.group-id</code> - The ID of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance.group-name</code> - The name of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-address</code> - The public IPv4 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-address</code> - The IPv6 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key-name</code> - The name of the key pair used when the instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the
     *        launch group (for example, 0, 1, 2, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time
     *        zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a
     *        wildcard (<code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     *        <code>disabled</code> | <code>default</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your
     *        instance (<code>enabled</code> | <code>disabled</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     *        <code>disabled</code> | <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     *        <code>disabled</code> | <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop
     *        limit (integer, possible values <code>1</code> to <code>64</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-tokens</code> - The metadata request authorization state (
     *        <code>optional</code> | <code>required</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the
     *        instance metadata (<code>enabled</code> | <code>disabled</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     *        <code>applied</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     *        <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.association-id</code> - The association ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4
     *        address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic
     *        IP address (IPv4) with a network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network
     *        interface is the primary private IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated
     *        the Elastic IP address (IPv4) for your network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.association-id</code> - The association ID returned when the network
     *        interface was associated with an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4)
     *        associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound
     *        to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached
     *        to an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is
     *        deleted when an instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.device-index</code> - The device index to which the network interface
     *        is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network
     *        interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the
     *        network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface
     *        with an IPv6 address is unreachable from the public internet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - The description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-id</code> - The ID of a security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-name</code> - The name of a security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is
     *        the primary IPv6 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.mac-address</code> - The MAC address of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-ip-address</code> - The private IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.requester-id</code> - The requester ID for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.requester-managed</code> - Indicates whether the network interface is being
     *        managed by Amazon Web Services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     *        <code>in-use</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.source-dest-check</code> - Whether the network interface performs
     *        source/destination checking. A value of <code>true</code> means that checking is enabled, and
     *        <code>false</code> means that checking is disabled. The value must be <code>false</code> for the network
     *        interface to perform network address translation (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>placement-group-name</code> - The name of the placement group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>placement-partition-number</code> - The partition in which the instance is located.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     *        <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     *        <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     *        <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     *        <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Web</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether
     *        to respond to DNS queries for instance hostnames with DNS A records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates
     *        whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     *        <code>resource-name</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - The private IPv4 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reason</code> - The reason for the current state of the instance (for example, shows
     *        "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *        Amazon Web Services Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time
     *        you launch an instance. A reservation ID has a one-to-one relationship with an instance launch request,
     *        but can be associated with more than one instance if you launch multiple instances using the same launch
     *        request. For example, if you launch one instance, you get one reservation ID. If you launch ten instances
     *        using the same launch request, you also get one reservation ID.
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
     *        <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A
     *        value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking is
     *        disabled. The value must be <code>false</code> for the instance to perform network address translation
     *        (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-code</code> - The reason code for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-message</code> - A message that describes the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        that have a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     *        <code>host</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     *        <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     *        <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     *        <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     *        <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     *        <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     *        <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for
     *        example, <code>2022-09-15T17:15:20.000Z</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     *        <code>hvm</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (<code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance, for
     * example, <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume is
     * deleted on instance termination.
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
     * <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     * <code>uefi</code> | <code>uefi-preferred</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     * Reservation preference (<code>open</code> | <code>none</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The ID of
     * the targeted Capacity Reservation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     * - The ARN of the targeted Capacity Reservation group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token you provided when you launched the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or start (
     * <code>legacy-bios</code> | <code>uefi</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dns-name</code> - The public DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced networking with
     * ENA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon Web
     * Services Nitro Enclaves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     * hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The value
     * <code>xen</code> is used for both Xen and Nitro hypervisors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as an name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a Capacity
     * Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte is used
     * for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values
     * are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code> |
     * <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The public IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-address</code> - The IPv6 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair used when the instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the launch
     * group (for example, 0, 1, 2, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time zone
     * (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a wildcard (
     * <code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     * <code>disabled</code> | <code>default</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your instance
     * (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     * <code>disabled</code> | <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop limit
     * (integer, possible values <code>1</code> to <code>64</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.http-tokens</code> - The metadata request authorization state (<code>optional</code> |
     * <code>required</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the instance
     * metadata (<code>enabled</code> | <code>disabled</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     * <code>applied</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     * <code>enabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.association-id</code> - The association ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4 address
     * associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic IP
     * address (IPv4) with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network interface is
     * the primary private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated the
     * Elastic IP address (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.association-id</code> - The association ID returned when the network
     * interface was associated with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated
     * with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached to an
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is deleted
     * when an instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.device-index</code> - The device index to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the network
     * interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     * <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface with
     * an IPv6 address is unreachable from the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is the
     * primary IPv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The private IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.public-dns-name</code> - The public DNS name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-id</code> - The requester ID for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.requester-managed</code> - Indicates whether the network interface is being managed by
     * Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     * <code>in-use</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.source-dest-check</code> - Whether the network interface performs source/destination
     * checking. A value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking
     * is disabled. The value must be <code>false</code> for the network interface to perform network address
     * translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-group-name</code> - The name of the placement group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>placement-partition-number</code> - The partition in which the instance is located.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     * <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     * <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     * <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     * <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     * <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     * <code>Windows with SQL Server Web</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates whether to
     * respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     * <code>resource-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reason</code> - The reason for the current state of the instance (for example, shows
     * "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, Amazon
     * Web Services Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time you
     * launch an instance. A reservation ID has a one-to-one relationship with an instance launch request, but can be
     * associated with more than one instance if you launch multiple instances using the same launch request. For
     * example, if you launch one instance, you get one reservation ID. If you launch ten instances using the same
     * launch request, you also get one reservation ID.
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
     * <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code> means that checking is disabled. The
     * value must be <code>false</code> for the instance to perform network address translation (NAT) in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - A message that describes the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources that have
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     * <code>host</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     * <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     * <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     * <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     * <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     * <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     * <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for example,
     * <code>2022-09-15T17:15:20.000Z</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     * <code>hvm</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>affinity</code> - The affinity setting for an instance running on a Dedicated Host (
     *        <code>default</code> | <code>host</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>architecture</code> - The instance architecture (<code>i386</code> | <code>x86_64</code> |
     *        <code>arm64</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.attach-time</code> - The attach time for an EBS volume mapped to the instance,
     *        for example, <code>2022-09-15T17:15:20.000Z</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.delete-on-termination</code> - A Boolean that indicates whether the EBS volume
     *        is deleted on instance termination.
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
     *        <code>block-device-mapping.status</code> - The status for the EBS volume (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-device-mapping.volume-id</code> - The volume ID of the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>boot-mode</code> - The boot mode that was specified by the AMI (<code>legacy-bios</code> |
     *        <code>uefi</code> | <code>uefi-preferred</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-id</code> - The ID of the Capacity Reservation into which the instance was
     *        launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-preference</code> - The instance's Capacity
     *        Reservation preference (<code>open</code> | <code>none</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-id</code> - The
     *        ID of the targeted Capacity Reservation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>capacity-reservation-specification.capacity-reservation-target.capacity-reservation-resource-group-arn</code>
     *        - The ARN of the targeted Capacity Reservation group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token you provided when you launched the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>current-instance-boot-mode</code> - The boot mode that is used to launch the instance at launch or
     *        start (<code>legacy-bios</code> | <code>uefi</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dns-name</code> - The public DNS name of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-optimized</code> - A Boolean that indicates whether the instance is optimized for Amazon EBS
     *        I/O.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ena-support</code> - A Boolean that indicates whether the instance is enabled for enhanced
     *        networking with ENA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>enclave-options.enabled</code> - A Boolean that indicates whether the instance is enabled for Amazon
     *        Web Services Nitro Enclaves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hibernation-options.configured</code> - A Boolean that indicates whether the instance is enabled for
     *        hibernation. A value of <code>true</code> means that the instance is enabled for hibernation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-id</code> - The ID of the Dedicated Host on which the instance is running, if applicable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor type of the instance (<code>ovm</code> | <code>xen</code>). The
     *        value <code>xen</code> is used for both Xen and Nitro hypervisors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.arn</code> - The instance profile associated with the instance. Specified as an
     *        ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.id</code> - The instance profile associated with the instance. Specified as an
     *        ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>iam-instance-profile.name</code> - The instance profile associated with the instance. Specified as
     *        an name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>image-id</code> - The ID of the image used to launch the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-lifecycle</code> - Indicates whether this is a Spot Instance, a Scheduled Instance, or a
     *        Capacity Block (<code>spot</code> | <code>scheduled</code> | <code>capacity-block</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-code</code> - The state of the instance, as a 16-bit unsigned integer. The high byte
     *        is used for internal purposes and should be ignored. The low byte is set based on the state represented.
     *        The valid values are: 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and
     *        80 (stopped).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-state-name</code> - The state of the instance (<code>pending</code> | <code>running</code>
     *        | <code>shutting-down</code> | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The type of instance (for example, <code>t2.micro</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance.group-id</code> - The ID of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance.group-name</code> - The name of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-address</code> - The public IPv4 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-address</code> - The IPv6 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key-name</code> - The name of the key pair used when the instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-index</code> - When launching multiple instances, this is the index for the instance in the
     *        launch group (for example, 0, 1, 2, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-time</code> - The time when the instance was launched, in the ISO 8601 format in the UTC time
     *        zone (YYYY-MM-DDThh:mm:ss.sssZ), for example, <code>2021-09-29T11:04:43.305Z</code>. You can use a
     *        wildcard (<code>*</code>), for example, <code>2021-09-29T*</code>, which matches an entire day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maintenance-options.auto-recovery</code> - The current automatic recovery behavior of the instance (
     *        <code>disabled</code> | <code>default</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-endpoint</code> - The status of access to the HTTP metadata endpoint on your
     *        instance (<code>enabled</code> | <code>disabled</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-protocol-ipv4</code> - Indicates whether the IPv4 endpoint is enabled (
     *        <code>disabled</code> | <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-protocol-ipv6</code> - Indicates whether the IPv6 endpoint is enabled (
     *        <code>disabled</code> | <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-put-response-hop-limit</code> - The HTTP metadata request put response hop
     *        limit (integer, possible values <code>1</code> to <code>64</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.http-tokens</code> - The metadata request authorization state (
     *        <code>optional</code> | <code>required</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.instance-metadata-tags</code> - The status of access to instance tags from the
     *        instance metadata (<code>enabled</code> | <code>disabled</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>metadata-options.state</code> - The state of the metadata option changes (<code>pending</code> |
     *        <code>applied</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>monitoring-state</code> - Indicates whether detailed monitoring is enabled (<code>disabled</code> |
     *        <code>enabled</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.allocation-id</code> - The allocation ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.association-id</code> - The association ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.carrier-ip</code> - The carrier IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.customer-owned-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.ip-owner-id</code> - The owner ID of the private IPv4
     *        address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.association.public-ip</code> - The ID of the association of an Elastic
     *        IP address (IPv4) with a network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.primary</code> - Specifies whether the IPv4 address of the network
     *        interface is the primary private IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.private-dns-name</code> - The private DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.private-ip-address</code> - The private IPv4 address associated with the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.allocation-id</code> - The allocation ID returned when you allocated
     *        the Elastic IP address (IPv4) for your network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.association-id</code> - The association ID returned when the network
     *        interface was associated with an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.carrier-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.customer-owned-ip</code> - The customer-owned IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4)
     *        associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.association.public-ip</code> - The address of the Elastic IP address (IPv4) bound
     *        to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.attach-time</code> - The time that the network interface was attached
     *        to an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.attachment-id</code> - The ID of the interface attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.delete-on-termination</code> - Specifies whether the attachment is
     *        deleted when an instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.device-index</code> - The device index to which the network interface
     *        is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.instance-id</code> - The ID of the instance to which the network
     *        interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.instance-owner-id</code> - The owner ID of the instance to which the
     *        network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.network-card-index</code> - The index of the network card.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.availability-zone</code> - The Availability Zone for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.deny-all-igw-traffic</code> - A Boolean that indicates whether a network interface
     *        with an IPv6 address is unreachable from the public internet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - The description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-id</code> - The ID of a security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-name</code> - The name of a security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv4-prefixes.ipv4-prefix</code> - The IPv4 prefixes that are assigned to the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-address</code> - The IPv6 address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-addresses.ipv6-address</code> - The IPv6 address associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-addresses.is-primary-ipv6</code> - A Boolean that indicates whether this is
     *        the primary IPv6 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-native</code> - A Boolean that indicates whether this is an IPv6 only network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.ipv6-prefixes.ipv6-prefix</code> - The IPv6 prefix assigned to the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.mac-address</code> - The MAC address of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.outpost-arn</code> - The ARN of the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.owner-id</code> - The ID of the owner of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-dns-name</code> - The private DNS name of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-ip-address</code> - The private IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.public-dns-name</code> - The public DNS name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.requester-id</code> - The requester ID for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.requester-managed</code> - Indicates whether the network interface is being
     *        managed by Amazon Web Services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.status</code> - The status of the network interface (<code>available</code>) |
     *        <code>in-use</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.source-dest-check</code> - Whether the network interface performs
     *        source/destination checking. A value of <code>true</code> means that checking is enabled, and
     *        <code>false</code> means that checking is disabled. The value must be <code>false</code> for the network
     *        interface to perform network address translation (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.tag-key</code> - The key of a tag assigned to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.tag-value</code> - The value of a tag assigned to the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.vpc-id</code> - The ID of the VPC for the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>outpost-arn</code> - The Amazon Resource Name (ARN) of the Outpost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The Amazon Web Services account ID of the instance owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>placement-group-name</code> - The name of the placement group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>placement-partition-number</code> - The partition in which the instance is located.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform. To list only Windows instances, use <code>windows</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform-details</code> - The platform (<code>Linux/UNIX</code> | <code>Red Hat BYOL Linux</code> |
     *        <code> Red Hat Enterprise Linux</code> | <code>Red Hat Enterprise Linux with HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Standard and HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Enterprise and HA</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Standard</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Web</code> |
     *        <code>Red Hat Enterprise Linux with SQL Server Enterprise</code> | <code>SQL Server Enterprise</code> |
     *        <code>SQL Server Standard</code> | <code>SQL Server Web</code> | <code>SUSE Linux</code> |
     *        <code>Ubuntu Pro</code> | <code>Windows</code> | <code>Windows BYOL</code> |
     *        <code>Windows with SQL Server Enterprise</code> | <code>Windows with SQL Server Standard</code> |
     *        <code>Windows with SQL Server Web</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name</code> - The private IPv4 DNS name of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.enable-resource-name-dns-a-record</code> - A Boolean that indicates whether
     *        to respond to DNS queries for instance hostnames with DNS A records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.enable-resource-name-dns-aaaa-record</code> - A Boolean that indicates
     *        whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name-options.hostname-type</code> - The type of hostname (<code>ip-name</code> |
     *        <code>resource-name</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - The private IPv4 address of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code</code> - The product code associated with the AMI used to launch the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-code.type</code> - The type of product code (<code>devpay</code> | <code>marketplace</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reason</code> - The reason for the current state of the instance (for example, shows
     *        "User Initiated [date]" when you stop or terminate the instance). Similar to the state-reason-code filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *        Amazon Web Services Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>reservation-id</code> - The ID of the instance's reservation. A reservation ID is created any time
     *        you launch an instance. A reservation ID has a one-to-one relationship with an instance launch request,
     *        but can be associated with more than one instance if you launch multiple instances using the same launch
     *        request. For example, if you launch one instance, you get one reservation ID. If you launch ten instances
     *        using the same launch request, you also get one reservation ID.
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
     *        <code>source-dest-check</code> - Indicates whether the instance performs source/destination checking. A
     *        value of <code>true</code> means that checking is enabled, and <code>false</code> means that checking is
     *        disabled. The value must be <code>false</code> for the instance to perform network address translation
     *        (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The ID of the Spot Instance request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-code</code> - The reason code for the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state-reason-message</code> - A message that describes the state change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        that have a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tenancy</code> - The tenancy of an instance (<code>dedicated</code> | <code>default</code> |
     *        <code>host</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tpm-support</code> - Indicates if the instance is configured for NitroTPM support (<code>v2.0</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-operation</code> - The usage operation value for the instance (<code>RunInstances</code> |
     *        <code>RunInstances:00g0</code> | <code>RunInstances:0010</code> | <code>RunInstances:1010</code> |
     *        <code>RunInstances:1014</code> | <code>RunInstances:1110</code> | <code>RunInstances:0014</code> |
     *        <code>RunInstances:0210</code> | <code>RunInstances:0110</code> | <code>RunInstances:0100</code> |
     *        <code>RunInstances:0004</code> | <code>RunInstances:0200</code> | <code>RunInstances:000g</code> |
     *        <code>RunInstances:0g00</code> | <code>RunInstances:0002</code> | <code>RunInstances:0800</code> |
     *        <code>RunInstances:0102</code> | <code>RunInstances:0006</code> | <code>RunInstances:0202</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usage-operation-update-time</code> - The time that the usage operation was last updated, for
     *        example, <code>2022-09-15T17:15:20.000Z</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>virtualization-type</code> - The virtualization type of the instance (<code>paravirtual</code> |
     *        <code>hvm</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC that the instance is running in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * 
     * @return The instance IDs.</p>
     *         <p>
     *         Default: Describes all your instances.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.</p>
     *        <p>
     *        You cannot specify this parameter and the instance IDs parameter in the same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of items to return for this request. To get the next page of items, make another
     *         request with the token returned in the output. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *         >Pagination</a>.</p>
     *         <p>
     *         You cannot specify this parameter and the instance IDs parameter in the same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.</p>
     *        <p>
     *        You cannot specify this parameter and the instance IDs parameter in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @return The token returned from a previous paginated request. Pagination continues from the end of the items
     *         returned by the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeInstancesRequest> getDryRunRequest() {
        Request<DescribeInstancesRequest> request = new DescribeInstancesRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancesRequest == false)
            return false;
        DescribeInstancesRequest other = (DescribeInstancesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancesRequest clone() {
        return (DescribeInstancesRequest) super.clone();
    }
}
