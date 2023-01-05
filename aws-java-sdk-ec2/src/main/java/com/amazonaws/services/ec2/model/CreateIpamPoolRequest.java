/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateIpamPoolRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamPoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateIpamPoolRequest> {

    /**
     * <p>
     * The ID of the scope in which you would like to create the IPAM pool.
     * </p>
     */
    private String ipamScopeId;
    /**
     * <p>
     * In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address allocations from the
     * pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale with the VPC’s
     * Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not choose a locale,
     * resources in Regions others than the IPAM's home region cannot use CIDRs from this pool.
     * </p>
     * <p>
     * Possible values: Any Amazon Web Services Region, such as us-east-1.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the CIDR you
     * provision for the pool within the source pool must be available in the source pool's CIDR range.
     * </p>
     */
    private String sourceIpamPoolId;
    /**
     * <p>
     * A description for the IPAM pool.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     * import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already
     * be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     */
    private Boolean autoImport;
    /**
     * <p>
     * Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     */
    private Boolean publiclyAdvertisable;
    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum netmask
     * length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     */
    private Integer allocationMinNetmaskLength;
    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum netmask
     * length must be greater than the minimum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     */
    private Integer allocationMaxNetmaskLength;
    /**
     * <p>
     * The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is
     * 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * </p>
     */
    private Integer allocationDefaultNetmaskLength;
    /**
     * <p>
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags
     * will not be allowed to allocate space from the pool. If the resources have their tags changed after they have
     * allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as
     * noncompliant.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag> allocationResourceTags;
    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use
     * space for Elastic IP addresses and VPCs.
     * </p>
     */
    private String awsService;

    /**
     * <p>
     * The ID of the scope in which you would like to create the IPAM pool.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope in which you would like to create the IPAM pool.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope in which you would like to create the IPAM pool.
     * </p>
     * 
     * @return The ID of the scope in which you would like to create the IPAM pool.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope in which you would like to create the IPAM pool.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope in which you would like to create the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * <p>
     * In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address allocations from the
     * pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale with the VPC’s
     * Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not choose a locale,
     * resources in Regions others than the IPAM's home region cannot use CIDRs from this pool.
     * </p>
     * <p>
     * Possible values: Any Amazon Web Services Region, such as us-east-1.
     * </p>
     * 
     * @param locale
     *        In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     *        allocations. Only resources in the same Region as the locale of the pool can get IP address allocations
     *        from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale
     *        with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not
     *        choose a locale, resources in Regions others than the IPAM's home region cannot use CIDRs from this
     *        pool.</p>
     *        <p>
     *        Possible values: Any Amazon Web Services Region, such as us-east-1.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address allocations from the
     * pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale with the VPC’s
     * Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not choose a locale,
     * resources in Regions others than the IPAM's home region cannot use CIDRs from this pool.
     * </p>
     * <p>
     * Possible values: Any Amazon Web Services Region, such as us-east-1.
     * </p>
     * 
     * @return In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     *         allocations. Only resources in the same Region as the locale of the pool can get IP address allocations
     *         from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a
     *         locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you
     *         do not choose a locale, resources in Regions others than the IPAM's home region cannot use CIDRs from
     *         this pool.</p>
     *         <p>
     *         Possible values: Any Amazon Web Services Region, such as us-east-1.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     * allocations. Only resources in the same Region as the locale of the pool can get IP address allocations from the
     * pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale with the VPC’s
     * Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not choose a locale,
     * resources in Regions others than the IPAM's home region cannot use CIDRs from this pool.
     * </p>
     * <p>
     * Possible values: Any Amazon Web Services Region, such as us-east-1.
     * </p>
     * 
     * @param locale
     *        In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for
     *        allocations. Only resources in the same Region as the locale of the pool can get IP address allocations
     *        from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale
     *        with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not
     *        choose a locale, resources in Regions others than the IPAM's home region cannot use CIDRs from this
     *        pool.</p>
     *        <p>
     *        Possible values: Any Amazon Web Services Region, such as us-east-1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the CIDR you
     * provision for the pool within the source pool must be available in the source pool's CIDR range.
     * </p>
     * 
     * @param sourceIpamPoolId
     *        The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the
     *        CIDR you provision for the pool within the source pool must be available in the source pool's CIDR range.
     */

    public void setSourceIpamPoolId(String sourceIpamPoolId) {
        this.sourceIpamPoolId = sourceIpamPoolId;
    }

    /**
     * <p>
     * The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the CIDR you
     * provision for the pool within the source pool must be available in the source pool's CIDR range.
     * </p>
     * 
     * @return The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the
     *         CIDR you provision for the pool within the source pool must be available in the source pool's CIDR range.
     */

    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

    /**
     * <p>
     * The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the CIDR you
     * provision for the pool within the source pool must be available in the source pool's CIDR range.
     * </p>
     * 
     * @param sourceIpamPoolId
     *        The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the
     *        CIDR you provision for the pool within the source pool must be available in the source pool's CIDR range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withSourceIpamPoolId(String sourceIpamPoolId) {
        setSourceIpamPoolId(sourceIpamPoolId);
        return this;
    }

    /**
     * <p>
     * A description for the IPAM pool.
     * </p>
     * 
     * @param description
     *        A description for the IPAM pool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the IPAM pool.
     * </p>
     * 
     * @return A description for the IPAM pool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the IPAM pool.
     * </p>
     * 
     * @param description
     *        A description for the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * </p>
     * 
     * @param addressFamily
     *        The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * </p>
     * 
     * @return The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * </p>
     * 
     * @param addressFamily
     *        The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public CreateIpamPoolRequest withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * </p>
     * 
     * @param addressFamily
     *        The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public CreateIpamPoolRequest withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
    }

    /**
     * <p>
     * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     * import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already
     * be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @param autoImport
     *        If selected, IPAM will continuously look for resources within the CIDR range of this pool and
     *        automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these
     *        resources must not already be allocated to other resources in order for the import to succeed. IPAM will
     *        import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be
     *        imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will
     *        import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     *        import one of them only. </p>
     *        <p>
     *        A locale must be set on the pool for this feature to work.
     */

    public void setAutoImport(Boolean autoImport) {
        this.autoImport = autoImport;
    }

    /**
     * <p>
     * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     * import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already
     * be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @return If selected, IPAM will continuously look for resources within the CIDR range of this pool and
     *         automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these
     *         resources must not already be allocated to other resources in order for the import to succeed. IPAM will
     *         import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be
     *         imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM
     *         will import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will
     *         randomly import one of them only. </p>
     *         <p>
     *         A locale must be set on the pool for this feature to work.
     */

    public Boolean getAutoImport() {
        return this.autoImport;
    }

    /**
     * <p>
     * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     * import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already
     * be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @param autoImport
     *        If selected, IPAM will continuously look for resources within the CIDR range of this pool and
     *        automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these
     *        resources must not already be allocated to other resources in order for the import to succeed. IPAM will
     *        import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be
     *        imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will
     *        import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly
     *        import one of them only. </p>
     *        <p>
     *        A locale must be set on the pool for this feature to work.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withAutoImport(Boolean autoImport) {
        setAutoImport(autoImport);
        return this;
    }

    /**
     * <p>
     * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     * import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already
     * be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @return If selected, IPAM will continuously look for resources within the CIDR range of this pool and
     *         automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these
     *         resources must not already be allocated to other resources in order for the import to succeed. IPAM will
     *         import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be
     *         imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM
     *         will import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will
     *         randomly import one of them only. </p>
     *         <p>
     *         A locale must be set on the pool for this feature to work.
     */

    public Boolean isAutoImport() {
        return this.autoImport;
    }

    /**
     * <p>
     * Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @param publiclyAdvertisable
     *        Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily
     *        set to <code>ipv4</code>.
     */

    public void setPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        this.publiclyAdvertisable = publiclyAdvertisable;
    }

    /**
     * <p>
     * Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @return Determines if the pool is publicly advertisable. This option is not available for pools with
     *         AddressFamily set to <code>ipv4</code>.
     */

    public Boolean getPubliclyAdvertisable() {
        return this.publiclyAdvertisable;
    }

    /**
     * <p>
     * Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @param publiclyAdvertisable
     *        Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily
     *        set to <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        setPubliclyAdvertisable(publiclyAdvertisable);
        return this;
    }

    /**
     * <p>
     * Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @return Determines if the pool is publicly advertisable. This option is not available for pools with
     *         AddressFamily set to <code>ipv4</code>.
     */

    public Boolean isPubliclyAdvertisable() {
        return this.publiclyAdvertisable;
    }

    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum netmask
     * length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @param allocationMinNetmaskLength
     *        The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum
     *        netmask length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses
     *        are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */

    public void setAllocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
    }

    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum netmask
     * length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @return The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum
     *         netmask length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses
     *         are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */

    public Integer getAllocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength;
    }

    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum netmask
     * length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @param allocationMinNetmaskLength
     *        The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum
     *        netmask length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses
     *        are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withAllocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
        setAllocationMinNetmaskLength(allocationMinNetmaskLength);
        return this;
    }

    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum netmask
     * length must be greater than the minimum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @param allocationMaxNetmaskLength
     *        The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum
     *        netmask length must be greater than the minimum netmask length. Possible netmask lengths for IPv4
     *        addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */

    public void setAllocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
    }

    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum netmask
     * length must be greater than the minimum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @return The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum
     *         netmask length must be greater than the minimum netmask length. Possible netmask lengths for IPv4
     *         addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     */

    public Integer getAllocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength;
    }

    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum netmask
     * length must be greater than the minimum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32.
     * Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @param allocationMaxNetmaskLength
     *        The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum
     *        netmask length must be greater than the minimum netmask length. Possible netmask lengths for IPv4
     *        addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withAllocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
        setAllocationMaxNetmaskLength(allocationMaxNetmaskLength);
        return this;
    }

    /**
     * <p>
     * The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is
     * 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * </p>
     * 
     * @param allocationDefaultNetmaskLength
     *        The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this
     *        pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     */

    public void setAllocationDefaultNetmaskLength(Integer allocationDefaultNetmaskLength) {
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
    }

    /**
     * <p>
     * The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is
     * 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * </p>
     * 
     * @return The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this
     *         pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     */

    public Integer getAllocationDefaultNetmaskLength() {
        return this.allocationDefaultNetmaskLength;
    }

    /**
     * <p>
     * The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is
     * 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * </p>
     * 
     * @param allocationDefaultNetmaskLength
     *        The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this
     *        pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withAllocationDefaultNetmaskLength(Integer allocationDefaultNetmaskLength) {
        setAllocationDefaultNetmaskLength(allocationDefaultNetmaskLength);
        return this;
    }

    /**
     * <p>
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags
     * will not be allowed to allocate space from the pool. If the resources have their tags changed after they have
     * allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as
     * noncompliant.
     * </p>
     * 
     * @return Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these
     *         tags will not be allowed to allocate space from the pool. If the resources have their tags changed after
     *         they have allocated space or if the allocation tagging requirements are changed on the pool, the resource
     *         may be marked as noncompliant.
     */

    public java.util.List<RequestIpamResourceTag> getAllocationResourceTags() {
        if (allocationResourceTags == null) {
            allocationResourceTags = new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>();
        }
        return allocationResourceTags;
    }

    /**
     * <p>
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags
     * will not be allowed to allocate space from the pool. If the resources have their tags changed after they have
     * allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as
     * noncompliant.
     * </p>
     * 
     * @param allocationResourceTags
     *        Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these
     *        tags will not be allowed to allocate space from the pool. If the resources have their tags changed after
     *        they have allocated space or if the allocation tagging requirements are changed on the pool, the resource
     *        may be marked as noncompliant.
     */

    public void setAllocationResourceTags(java.util.Collection<RequestIpamResourceTag> allocationResourceTags) {
        if (allocationResourceTags == null) {
            this.allocationResourceTags = null;
            return;
        }

        this.allocationResourceTags = new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>(allocationResourceTags);
    }

    /**
     * <p>
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags
     * will not be allowed to allocate space from the pool. If the resources have their tags changed after they have
     * allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as
     * noncompliant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllocationResourceTags(java.util.Collection)} or
     * {@link #withAllocationResourceTags(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allocationResourceTags
     *        Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these
     *        tags will not be allowed to allocate space from the pool. If the resources have their tags changed after
     *        they have allocated space or if the allocation tagging requirements are changed on the pool, the resource
     *        may be marked as noncompliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withAllocationResourceTags(RequestIpamResourceTag... allocationResourceTags) {
        if (this.allocationResourceTags == null) {
            setAllocationResourceTags(new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>(allocationResourceTags.length));
        }
        for (RequestIpamResourceTag ele : allocationResourceTags) {
            this.allocationResourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags
     * will not be allowed to allocate space from the pool. If the resources have their tags changed after they have
     * allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as
     * noncompliant.
     * </p>
     * 
     * @param allocationResourceTags
     *        Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these
     *        tags will not be allowed to allocate space from the pool. If the resources have their tags changed after
     *        they have allocated space or if the allocation tagging requirements are changed on the pool, the resource
     *        may be marked as noncompliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withAllocationResourceTags(java.util.Collection<RequestIpamResourceTag> allocationResourceTags) {
        setAllocationResourceTags(allocationResourceTags);
        return this;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @return The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *         tag value as the filter value. For example, to find all resources that have a tag with the key
     *         <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *         and <code>TeamA</code> for the filter value.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
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
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamPoolRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use
     * space for Elastic IP addresses and VPCs.
     * </p>
     * 
     * @param awsService
     *        Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users
     *        to use space for Elastic IP addresses and VPCs.
     * @see IpamPoolAwsService
     */

    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use
     * space for Elastic IP addresses and VPCs.
     * </p>
     * 
     * @return Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows
     *         users to use space for Elastic IP addresses and VPCs.
     * @see IpamPoolAwsService
     */

    public String getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use
     * space for Elastic IP addresses and VPCs.
     * </p>
     * 
     * @param awsService
     *        Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users
     *        to use space for Elastic IP addresses and VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolAwsService
     */

    public CreateIpamPoolRequest withAwsService(String awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use
     * space for Elastic IP addresses and VPCs.
     * </p>
     * 
     * @param awsService
     *        Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users
     *        to use space for Elastic IP addresses and VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolAwsService
     */

    public CreateIpamPoolRequest withAwsService(IpamPoolAwsService awsService) {
        this.awsService = awsService.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateIpamPoolRequest> getDryRunRequest() {
        Request<CreateIpamPoolRequest> request = new CreateIpamPoolRequestMarshaller().marshall(this);
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
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getSourceIpamPoolId() != null)
            sb.append("SourceIpamPoolId: ").append(getSourceIpamPoolId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getAutoImport() != null)
            sb.append("AutoImport: ").append(getAutoImport()).append(",");
        if (getPubliclyAdvertisable() != null)
            sb.append("PubliclyAdvertisable: ").append(getPubliclyAdvertisable()).append(",");
        if (getAllocationMinNetmaskLength() != null)
            sb.append("AllocationMinNetmaskLength: ").append(getAllocationMinNetmaskLength()).append(",");
        if (getAllocationMaxNetmaskLength() != null)
            sb.append("AllocationMaxNetmaskLength: ").append(getAllocationMaxNetmaskLength()).append(",");
        if (getAllocationDefaultNetmaskLength() != null)
            sb.append("AllocationDefaultNetmaskLength: ").append(getAllocationDefaultNetmaskLength()).append(",");
        if (getAllocationResourceTags() != null)
            sb.append("AllocationResourceTags: ").append(getAllocationResourceTags()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpamPoolRequest == false)
            return false;
        CreateIpamPoolRequest other = (CreateIpamPoolRequest) obj;
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getSourceIpamPoolId() == null ^ this.getSourceIpamPoolId() == null)
            return false;
        if (other.getSourceIpamPoolId() != null && other.getSourceIpamPoolId().equals(this.getSourceIpamPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
            return false;
        if (other.getAutoImport() == null ^ this.getAutoImport() == null)
            return false;
        if (other.getAutoImport() != null && other.getAutoImport().equals(this.getAutoImport()) == false)
            return false;
        if (other.getPubliclyAdvertisable() == null ^ this.getPubliclyAdvertisable() == null)
            return false;
        if (other.getPubliclyAdvertisable() != null && other.getPubliclyAdvertisable().equals(this.getPubliclyAdvertisable()) == false)
            return false;
        if (other.getAllocationMinNetmaskLength() == null ^ this.getAllocationMinNetmaskLength() == null)
            return false;
        if (other.getAllocationMinNetmaskLength() != null && other.getAllocationMinNetmaskLength().equals(this.getAllocationMinNetmaskLength()) == false)
            return false;
        if (other.getAllocationMaxNetmaskLength() == null ^ this.getAllocationMaxNetmaskLength() == null)
            return false;
        if (other.getAllocationMaxNetmaskLength() != null && other.getAllocationMaxNetmaskLength().equals(this.getAllocationMaxNetmaskLength()) == false)
            return false;
        if (other.getAllocationDefaultNetmaskLength() == null ^ this.getAllocationDefaultNetmaskLength() == null)
            return false;
        if (other.getAllocationDefaultNetmaskLength() != null
                && other.getAllocationDefaultNetmaskLength().equals(this.getAllocationDefaultNetmaskLength()) == false)
            return false;
        if (other.getAllocationResourceTags() == null ^ this.getAllocationResourceTags() == null)
            return false;
        if (other.getAllocationResourceTags() != null && other.getAllocationResourceTags().equals(this.getAllocationResourceTags()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getSourceIpamPoolId() == null) ? 0 : getSourceIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getAutoImport() == null) ? 0 : getAutoImport().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAdvertisable() == null) ? 0 : getPubliclyAdvertisable().hashCode());
        hashCode = prime * hashCode + ((getAllocationMinNetmaskLength() == null) ? 0 : getAllocationMinNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationMaxNetmaskLength() == null) ? 0 : getAllocationMaxNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationDefaultNetmaskLength() == null) ? 0 : getAllocationDefaultNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationResourceTags() == null) ? 0 : getAllocationResourceTags().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpamPoolRequest clone() {
        return (CreateIpamPoolRequest) super.clone();
    }
}
