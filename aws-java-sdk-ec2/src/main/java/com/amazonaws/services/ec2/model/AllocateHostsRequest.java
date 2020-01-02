/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AllocateHostsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AllocateHostsRequest> {

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     */
    private String autoPlacement;
    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     * Dedicated Hosts support instances of the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this
     * parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the
     * Dedicated Hosts support multiple instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     */
    private String hostRecovery;

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * 
     * @param autoPlacement
     *        Indicates whether the host accepts any untargeted instance launches that match its instance type
     *        configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *        > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux
     *        Instances</i>.</p>
     *        <p>
     *        Default: <code>on</code>
     * @see AutoPlacement
     */

    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * 
     * @return Indicates whether the host accepts any untargeted instance launches that match its instance type
     *         configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *         > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux
     *         Instances</i>.</p>
     *         <p>
     *         Default: <code>on</code>
     * @see AutoPlacement
     */

    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * 
     * @param autoPlacement
     *        Indicates whether the host accepts any untargeted instance launches that match its instance type
     *        configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *        > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux
     *        Instances</i>.</p>
     *        <p>
     *        Default: <code>on</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public AllocateHostsRequest withAutoPlacement(String autoPlacement) {
        setAutoPlacement(autoPlacement);
        return this;
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * 
     * @param autoPlacement
     *        Indicates whether the host accepts any untargeted instance launches that match its instance type
     *        configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *        > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux
     *        Instances</i>.</p>
     *        <p>
     *        Default: <code>on</code>
     * @see AutoPlacement
     */

    public void setAutoPlacement(AutoPlacement autoPlacement) {
        withAutoPlacement(autoPlacement);
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * 
     * @param autoPlacement
     *        Indicates whether the host accepts any untargeted instance launches that match its instance type
     *        configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *        > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon EC2 User Guide for Linux
     *        Instances</i>.</p>
     *        <p>
     *        Default: <code>on</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoPlacement
     */

    public AllocateHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to allocate the Dedicated Host.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     * 
     * @return The Availability Zone in which to allocate the Dedicated Host.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to allocate the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     * Dedicated Hosts support instances of the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this
     * parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     *        Dedicated Hosts support instances of the specified instance type only.</p>
     *        <p>
     *        If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit
     *        this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     *        <b>InstanceFamily</b> in the same request.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     * Dedicated Hosts support instances of the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this
     * parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * 
     * @return Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     *         Dedicated Hosts support instances of the specified instance type only.</p>
     *         <p>
     *         If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit
     *         this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     *         <b>InstanceFamily</b> in the same request.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     * Dedicated Hosts support instances of the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this
     * parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the
     *        Dedicated Hosts support instances of the specified instance type only.</p>
     *        <p>
     *        If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit
     *        this parameter and specify <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     *        <b>InstanceFamily</b> in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the
     * Dedicated Hosts support multiple instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * 
     * @param instanceFamily
     *        Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family,
     *        the Dedicated Hosts support multiple instance types within that instance family.</p>
     *        <p>
     *        If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     *        <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     *        request.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the
     * Dedicated Hosts support multiple instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * 
     * @return Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family,
     *         the Dedicated Hosts support multiple instance types within that instance family.</p>
     *         <p>
     *         If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     *         <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     *         request.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the
     * Dedicated Hosts support multiple instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     * <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * 
     * @param instanceFamily
     *        Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family,
     *        the Dedicated Hosts support multiple instance types within that instance family.</p>
     *        <p>
     *        If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify
     *        <b>InstanceType</b> instead. You cannot specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     * 
     * @param quantity
     *        The number of Dedicated Hosts to allocate to your account with these parameters.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     * 
     * @return The number of Dedicated Hosts to allocate to your account with these parameters.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters.
     * </p>
     * 
     * @param quantity
     *        The number of Dedicated Hosts to allocate to your account with these parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * 
     * @return The tags to apply to the Dedicated Host during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Dedicated Host during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Dedicated Host during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Dedicated Host during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>off</code>
     * @see HostRecovery
     */

    public void setHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *         default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *         Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Default: <code>off</code>
     * @see HostRecovery
     */

    public String getHostRecovery() {
        return this.hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>off</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRecovery
     */

    public AllocateHostsRequest withHostRecovery(String hostRecovery) {
        setHostRecovery(hostRecovery);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>off</code>
     * @see HostRecovery
     */

    public void setHostRecovery(HostRecovery hostRecovery) {
        withHostRecovery(hostRecovery);
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host Recovery</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        Recovery</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>off</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostRecovery
     */

    public AllocateHostsRequest withHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AllocateHostsRequest> getDryRunRequest() {
        Request<AllocateHostsRequest> request = new AllocateHostsRequestMarshaller().marshall(this);
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
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: ").append(getAutoPlacement()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getHostRecovery() != null)
            sb.append("HostRecovery: ").append(getHostRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateHostsRequest == false)
            return false;
        AllocateHostsRequest other = (AllocateHostsRequest) obj;
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getHostRecovery() == null ^ this.getHostRecovery() == null)
            return false;
        if (other.getHostRecovery() != null && other.getHostRecovery().equals(this.getHostRecovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getHostRecovery() == null) ? 0 : getHostRecovery().hashCode());
        return hashCode;
    }

    @Override
    public AllocateHostsRequest clone() {
        return (AllocateHostsRequest) super.clone();
    }
}
