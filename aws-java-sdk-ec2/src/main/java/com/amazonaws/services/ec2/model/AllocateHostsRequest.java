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
     * > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
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
     * The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating the
     * Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this case, Amazon
     * EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both <b>AssetIds</b> and
     * <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to the number of asset IDs
     * specified.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host recovery</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     */
    private String hostRecovery;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host. If you
     * specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.
     * </p>
     * <p>
     * If you are allocating the Dedicated Host in a Region, omit this parameter.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host maintenance</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String hostMaintenance;
    /**
     * <p>
     * The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific hardware
     * assets on an Outpost can help to minimize latency between your workloads. This parameter is supported only if you
     * specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a Dedicated Host
     * on each specified hardware asset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal to the
     * number of asset IDs specified.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> assetIds;

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration,
     * or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.
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
     *        > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * 
     * @return Indicates whether the host accepts any untargeted instance launches that match its instance type
     *         configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *         > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.
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
     *        > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.
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
     *        > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.
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
     *        > Understanding auto-placement and affinity</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
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
     * The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating the
     * Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this case, Amazon
     * EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both <b>AssetIds</b> and
     * <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to the number of asset IDs
     * specified.
     * </p>
     * 
     * @param quantity
     *        The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating the
     *        Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this case,
     *        Amazon EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both
     *        <b>AssetIds</b> and <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to
     *        the number of asset IDs specified.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating the
     * Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this case, Amazon
     * EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both <b>AssetIds</b> and
     * <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to the number of asset IDs
     * specified.
     * </p>
     * 
     * @return The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating
     *         the Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this
     *         case, Amazon EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both
     *         <b>AssetIds</b> and <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to
     *         the number of asset IDs specified.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating the
     * Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this case, Amazon
     * EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both <b>AssetIds</b> and
     * <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to the number of asset IDs
     * specified.
     * </p>
     * 
     * @param quantity
     *        The number of Dedicated Hosts to allocate to your account with these parameters. If you are allocating the
     *        Dedicated Hosts on an Outpost, and you specify <b>AssetIds</b>, you can omit this parameter. In this case,
     *        Amazon EC2 allocates a Dedicated Host on each specified hardware asset. If you specify both
     *        <b>AssetIds</b> and <b>Quantity</b>, then the value that you specify for <b>Quantity</b> must be equal to
     *        the number of asset IDs specified.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host recovery</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        recovery</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host recovery</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *         default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *         recovery</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host recovery</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        recovery</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host recovery</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        recovery</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host recovery</a> in
     * the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * 
     * @param hostRecovery
     *        Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by
     *        default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"> Host
     *        recovery</a> in the <i>Amazon EC2 User Guide</i>.</p>
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
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host. If you
     * specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.
     * </p>
     * <p>
     * If you are allocating the Dedicated Host in a Region, omit this parameter.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host.
     *        If you specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.</p>
     *        <p>
     *        If you are allocating the Dedicated Host in a Region, omit this parameter.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host. If you
     * specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.
     * </p>
     * <p>
     * If you are allocating the Dedicated Host in a Region, omit this parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated
     *         Host. If you specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.</p>
     *         <p>
     *         If you are allocating the Dedicated Host in a Region, omit this parameter.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host. If you
     * specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.
     * </p>
     * <p>
     * If you are allocating the Dedicated Host in a Region, omit this parameter.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host.
     *        If you specify <b>OutpostArn</b>, you can optionally specify <b>AssetIds</b>.</p>
     *        <p>
     *        If you are allocating the Dedicated Host in a Region, omit this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host maintenance</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param hostMaintenance
     *        Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host
     *        maintenance</a> in the <i>Amazon EC2 User Guide</i>.
     * @see HostMaintenance
     */

    public void setHostMaintenance(String hostMaintenance) {
        this.hostMaintenance = hostMaintenance;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host maintenance</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host
     *         maintenance</a> in the <i>Amazon EC2 User Guide</i>.
     * @see HostMaintenance
     */

    public String getHostMaintenance() {
        return this.hostMaintenance;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host maintenance</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param hostMaintenance
     *        Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host
     *        maintenance</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostMaintenance
     */

    public AllocateHostsRequest withHostMaintenance(String hostMaintenance) {
        setHostMaintenance(hostMaintenance);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host maintenance</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param hostMaintenance
     *        Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host
     *        maintenance</a> in the <i>Amazon EC2 User Guide</i>.
     * @see HostMaintenance
     */

    public void setHostMaintenance(HostMaintenance hostMaintenance) {
        withHostMaintenance(hostMaintenance);
    }

    /**
     * <p>
     * Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host maintenance</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param hostMaintenance
     *        Indicates whether to enable or disable host maintenance for the Dedicated Host. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-maintenance.html">Host
     *        maintenance</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostMaintenance
     */

    public AllocateHostsRequest withHostMaintenance(HostMaintenance hostMaintenance) {
        this.hostMaintenance = hostMaintenance.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific hardware
     * assets on an Outpost can help to minimize latency between your workloads. This parameter is supported only if you
     * specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a Dedicated Host
     * on each specified hardware asset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal to the
     * number of asset IDs specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific
     *         hardware assets on an Outpost can help to minimize latency between your workloads. This parameter is
     *         supported only if you specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region,
     *         omit this parameter.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a
     *         Dedicated Host on each specified hardware asset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal
     *         to the number of asset IDs specified.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getAssetIds() {
        if (assetIds == null) {
            assetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return assetIds;
    }

    /**
     * <p>
     * The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific hardware
     * assets on an Outpost can help to minimize latency between your workloads. This parameter is supported only if you
     * specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a Dedicated Host
     * on each specified hardware asset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal to the
     * number of asset IDs specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetIds
     *        The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific
     *        hardware assets on an Outpost can help to minimize latency between your workloads. This parameter is
     *        supported only if you specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region,
     *        omit this parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a
     *        Dedicated Host on each specified hardware asset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal
     *        to the number of asset IDs specified.
     *        </p>
     *        </li>
     */

    public void setAssetIds(java.util.Collection<String> assetIds) {
        if (assetIds == null) {
            this.assetIds = null;
            return;
        }

        this.assetIds = new com.amazonaws.internal.SdkInternalList<String>(assetIds);
    }

    /**
     * <p>
     * The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific hardware
     * assets on an Outpost can help to minimize latency between your workloads. This parameter is supported only if you
     * specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a Dedicated Host
     * on each specified hardware asset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal to the
     * number of asset IDs specified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetIds(java.util.Collection)} or {@link #withAssetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param assetIds
     *        The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific
     *        hardware assets on an Outpost can help to minimize latency between your workloads. This parameter is
     *        supported only if you specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region,
     *        omit this parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a
     *        Dedicated Host on each specified hardware asset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal
     *        to the number of asset IDs specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withAssetIds(String... assetIds) {
        if (this.assetIds == null) {
            setAssetIds(new com.amazonaws.internal.SdkInternalList<String>(assetIds.length));
        }
        for (String ele : assetIds) {
            this.assetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific hardware
     * assets on an Outpost can help to minimize latency between your workloads. This parameter is supported only if you
     * specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a Dedicated Host
     * on each specified hardware asset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal to the
     * number of asset IDs specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assetIds
     *        The IDs of the Outpost hardware assets on which to allocate the Dedicated Hosts. Targeting specific
     *        hardware assets on an Outpost can help to minimize latency between your workloads. This parameter is
     *        supported only if you specify <b>OutpostArn</b>. If you are allocating the Dedicated Hosts in a Region,
     *        omit this parameter.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify this parameter, you can omit <b>Quantity</b>. In this case, Amazon EC2 allocates a
     *        Dedicated Host on each specified hardware asset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify both <b>AssetIds</b> and <b>Quantity</b>, then the value for <b>Quantity</b> must be equal
     *        to the number of asset IDs specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateHostsRequest withAssetIds(java.util.Collection<String> assetIds) {
        setAssetIds(assetIds);
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
            sb.append("HostRecovery: ").append(getHostRecovery()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
        if (getHostMaintenance() != null)
            sb.append("HostMaintenance: ").append(getHostMaintenance()).append(",");
        if (getAssetIds() != null)
            sb.append("AssetIds: ").append(getAssetIds());
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
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getHostMaintenance() == null ^ this.getHostMaintenance() == null)
            return false;
        if (other.getHostMaintenance() != null && other.getHostMaintenance().equals(this.getHostMaintenance()) == false)
            return false;
        if (other.getAssetIds() == null ^ this.getAssetIds() == null)
            return false;
        if (other.getAssetIds() != null && other.getAssetIds().equals(this.getAssetIds()) == false)
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
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getHostMaintenance() == null) ? 0 : getHostMaintenance().hashCode());
        hashCode = prime * hashCode + ((getAssetIds() == null) ? 0 : getAssetIds().hashCode());
        return hashCode;
    }

    @Override
    public AllocateHostsRequest clone() {
        return (AllocateHostsRequest) super.clone();
    }
}
