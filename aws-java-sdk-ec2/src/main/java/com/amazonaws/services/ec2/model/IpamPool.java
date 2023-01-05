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

/**
 * <p>
 * In IPAM, a pool is a collection of contiguous IP addresses CIDRs. Pools enable you to organize your IP addresses
 * according to your routing and security needs. For example, if you have separate routing and security needs for
 * development and production applications, you can create a pool for each.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamPool" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPool implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the IPAM pool.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source pool.
     * </p>
     */
    private String sourceIpamPoolId;
    /**
     * <p>
     * The ARN of the IPAM pool.
     * </p>
     */
    private String ipamPoolArn;
    /**
     * <p>
     * The ARN of the scope of the IPAM pool.
     * </p>
     */
    private String ipamScopeArn;
    /**
     * <p>
     * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope
     * represents the IP space for a single network. The private scope is intended for all private IP address space. The
     * public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple
     * unconnected networks without causing IP address overlap or conflict.
     * </p>
     */
    private String ipamScopeType;
    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     */
    private String ipamArn;
    /**
     * <p>
     * The Amazon Web Services Region of the IPAM pool.
     * </p>
     */
    private String ipamRegion;
    /**
     * <p>
     * The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM
     * pool available for allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a
     * locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you choose
     * an Amazon Web Services Region for locale that has not been configured as an operating Region for the IPAM, you'll
     * get an error.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     */
    private Integer poolDepth;
    /**
     * <p>
     * The state of the IPAM pool.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A message related to the failed creation of an IPAM pool.
     * </p>
     */
    private String stateMessage;
    /**
     * <p>
     * The description of the IPAM pool.
     * </p>
     */
    private String description;
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
     * Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     */
    private Boolean publiclyAdvertisable;
    /**
     * <p>
     * The address family of the pool.
     * </p>
     */
    private String addressFamily;
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
    private com.amazonaws.internal.SdkInternalList<IpamResourceTag> allocationResourceTags;
    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use
     * space for Elastic IP addresses and VPCs.
     * </p>
     */
    private String awsService;

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the owner of the IPAM pool.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the owner of the IPAM pool.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the owner of the IPAM pool.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the owner of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM pool.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool.
     * </p>
     * 
     * @return The ID of the IPAM pool.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source pool.
     * </p>
     * 
     * @param sourceIpamPoolId
     *        The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source
     *        pool.
     */

    public void setSourceIpamPoolId(String sourceIpamPoolId) {
        this.sourceIpamPoolId = sourceIpamPoolId;
    }

    /**
     * <p>
     * The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source pool.
     * </p>
     * 
     * @return The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source
     *         pool.
     */

    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

    /**
     * <p>
     * The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source pool.
     * </p>
     * 
     * @param sourceIpamPoolId
     *        The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source
     *        pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withSourceIpamPoolId(String sourceIpamPoolId) {
        setSourceIpamPoolId(sourceIpamPoolId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IPAM pool.
     * </p>
     * 
     * @param ipamPoolArn
     *        The ARN of the IPAM pool.
     */

    public void setIpamPoolArn(String ipamPoolArn) {
        this.ipamPoolArn = ipamPoolArn;
    }

    /**
     * <p>
     * The ARN of the IPAM pool.
     * </p>
     * 
     * @return The ARN of the IPAM pool.
     */

    public String getIpamPoolArn() {
        return this.ipamPoolArn;
    }

    /**
     * <p>
     * The ARN of the IPAM pool.
     * </p>
     * 
     * @param ipamPoolArn
     *        The ARN of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withIpamPoolArn(String ipamPoolArn) {
        setIpamPoolArn(ipamPoolArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the scope of the IPAM pool.
     * </p>
     * 
     * @param ipamScopeArn
     *        The ARN of the scope of the IPAM pool.
     */

    public void setIpamScopeArn(String ipamScopeArn) {
        this.ipamScopeArn = ipamScopeArn;
    }

    /**
     * <p>
     * The ARN of the scope of the IPAM pool.
     * </p>
     * 
     * @return The ARN of the scope of the IPAM pool.
     */

    public String getIpamScopeArn() {
        return this.ipamScopeArn;
    }

    /**
     * <p>
     * The ARN of the scope of the IPAM pool.
     * </p>
     * 
     * @param ipamScopeArn
     *        The ARN of the scope of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withIpamScopeArn(String ipamScopeArn) {
        setIpamScopeArn(ipamScopeArn);
        return this;
    }

    /**
     * <p>
     * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope
     * represents the IP space for a single network. The private scope is intended for all private IP address space. The
     * public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple
     * unconnected networks without causing IP address overlap or conflict.
     * </p>
     * 
     * @param ipamScopeType
     *        In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each
     *        scope represents the IP space for a single network. The private scope is intended for all private IP
     *        address space. The public scope is intended for all public IP address space. Scopes enable you to reuse IP
     *        addresses across multiple unconnected networks without causing IP address overlap or conflict.
     * @see IpamScopeType
     */

    public void setIpamScopeType(String ipamScopeType) {
        this.ipamScopeType = ipamScopeType;
    }

    /**
     * <p>
     * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope
     * represents the IP space for a single network. The private scope is intended for all private IP address space. The
     * public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple
     * unconnected networks without causing IP address overlap or conflict.
     * </p>
     * 
     * @return In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each
     *         scope represents the IP space for a single network. The private scope is intended for all private IP
     *         address space. The public scope is intended for all public IP address space. Scopes enable you to reuse
     *         IP addresses across multiple unconnected networks without causing IP address overlap or conflict.
     * @see IpamScopeType
     */

    public String getIpamScopeType() {
        return this.ipamScopeType;
    }

    /**
     * <p>
     * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope
     * represents the IP space for a single network. The private scope is intended for all private IP address space. The
     * public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple
     * unconnected networks without causing IP address overlap or conflict.
     * </p>
     * 
     * @param ipamScopeType
     *        In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each
     *        scope represents the IP space for a single network. The private scope is intended for all private IP
     *        address space. The public scope is intended for all public IP address space. Scopes enable you to reuse IP
     *        addresses across multiple unconnected networks without causing IP address overlap or conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamScopeType
     */

    public IpamPool withIpamScopeType(String ipamScopeType) {
        setIpamScopeType(ipamScopeType);
        return this;
    }

    /**
     * <p>
     * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope
     * represents the IP space for a single network. The private scope is intended for all private IP address space. The
     * public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple
     * unconnected networks without causing IP address overlap or conflict.
     * </p>
     * 
     * @param ipamScopeType
     *        In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each
     *        scope represents the IP space for a single network. The private scope is intended for all private IP
     *        address space. The public scope is intended for all public IP address space. Scopes enable you to reuse IP
     *        addresses across multiple unconnected networks without causing IP address overlap or conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamScopeType
     */

    public IpamPool withIpamScopeType(IpamScopeType ipamScopeType) {
        this.ipamScopeType = ipamScopeType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     * 
     * @param ipamArn
     *        The ARN of the IPAM.
     */

    public void setIpamArn(String ipamArn) {
        this.ipamArn = ipamArn;
    }

    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     * 
     * @return The ARN of the IPAM.
     */

    public String getIpamArn() {
        return this.ipamArn;
    }

    /**
     * <p>
     * The ARN of the IPAM.
     * </p>
     * 
     * @param ipamArn
     *        The ARN of the IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withIpamArn(String ipamArn) {
        setIpamArn(ipamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM pool.
     * </p>
     * 
     * @param ipamRegion
     *        The Amazon Web Services Region of the IPAM pool.
     */

    public void setIpamRegion(String ipamRegion) {
        this.ipamRegion = ipamRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM pool.
     * </p>
     * 
     * @return The Amazon Web Services Region of the IPAM pool.
     */

    public String getIpamRegion() {
        return this.ipamRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the IPAM pool.
     * </p>
     * 
     * @param ipamRegion
     *        The Amazon Web Services Region of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withIpamRegion(String ipamRegion) {
        setIpamRegion(ipamRegion);
        return this;
    }

    /**
     * <p>
     * The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM
     * pool available for allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a
     * locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you choose
     * an Amazon Web Services Region for locale that has not been configured as an operating Region for the IPAM, you'll
     * get an error.
     * </p>
     * 
     * @param locale
     *        The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make
     *        an IPAM pool available for allocations. Only resources in the same Region as the locale of the pool can
     *        get IP address allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an
     *        IPAM pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool, you
     *        cannot modify it. If you choose an Amazon Web Services Region for locale that has not been configured as
     *        an operating Region for the IPAM, you'll get an error.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM
     * pool available for allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a
     * locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you choose
     * an Amazon Web Services Region for locale that has not been configured as an operating Region for the IPAM, you'll
     * get an error.
     * </p>
     * 
     * @return The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make
     *         an IPAM pool available for allocations. Only resources in the same Region as the locale of the pool can
     *         get IP address allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an
     *         IPAM pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool, you
     *         cannot modify it. If you choose an Amazon Web Services Region for locale that has not been configured as
     *         an operating Region for the IPAM, you'll get an error.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM
     * pool available for allocations. Only resources in the same Region as the locale of the pool can get IP address
     * allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a
     * locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you choose
     * an Amazon Web Services Region for locale that has not been configured as an operating Region for the IPAM, you'll
     * get an error.
     * </p>
     * 
     * @param locale
     *        The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make
     *        an IPAM pool available for allocations. Only resources in the same Region as the locale of the pool can
     *        get IP address allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an
     *        IPAM pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool, you
     *        cannot modify it. If you choose an Amazon Web Services Region for locale that has not been configured as
     *        an operating Region for the IPAM, you'll get an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param poolDepth
     *        The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     */

    public void setPoolDepth(Integer poolDepth) {
        this.poolDepth = poolDepth;
    }

    /**
     * <p>
     * The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @return The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon
     *         VPC IPAM User Guide</i>.
     */

    public Integer getPoolDepth() {
        return this.poolDepth;
    }

    /**
     * <p>
     * The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon VPC IPAM
     * User Guide</i>.
     * </p>
     * 
     * @param poolDepth
     *        The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/quotas-ipam.html">Quotas in IPAM</a> in the <i>Amazon
     *        VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withPoolDepth(Integer poolDepth) {
        setPoolDepth(poolDepth);
        return this;
    }

    /**
     * <p>
     * The state of the IPAM pool.
     * </p>
     * 
     * @param state
     *        The state of the IPAM pool.
     * @see IpamPoolState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the IPAM pool.
     * </p>
     * 
     * @return The state of the IPAM pool.
     * @see IpamPoolState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the IPAM pool.
     * </p>
     * 
     * @param state
     *        The state of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolState
     */

    public IpamPool withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the IPAM pool.
     * </p>
     * 
     * @param state
     *        The state of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolState
     */

    public IpamPool withState(IpamPoolState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A message related to the failed creation of an IPAM pool.
     * </p>
     * 
     * @param stateMessage
     *        A message related to the failed creation of an IPAM pool.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * A message related to the failed creation of an IPAM pool.
     * </p>
     * 
     * @return A message related to the failed creation of an IPAM pool.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * A message related to the failed creation of an IPAM pool.
     * </p>
     * 
     * @param stateMessage
     *        A message related to the failed creation of an IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
        return this;
    }

    /**
     * <p>
     * The description of the IPAM pool.
     * </p>
     * 
     * @param description
     *        The description of the IPAM pool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the IPAM pool.
     * </p>
     * 
     * @return The description of the IPAM pool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the IPAM pool.
     * </p>
     * 
     * @param description
     *        The description of the IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withDescription(String description) {
        setDescription(description);
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

    public IpamPool withAutoImport(Boolean autoImport) {
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
     * Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @param publiclyAdvertisable
     *        Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily
     *        set to <code>ipv4</code>.
     */

    public void setPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        this.publiclyAdvertisable = publiclyAdvertisable;
    }

    /**
     * <p>
     * Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @return Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily
     *         set to <code>ipv4</code>.
     */

    public Boolean getPubliclyAdvertisable() {
        return this.publiclyAdvertisable;
    }

    /**
     * <p>
     * Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @param publiclyAdvertisable
     *        Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily
     *        set to <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        setPubliclyAdvertisable(publiclyAdvertisable);
        return this;
    }

    /**
     * <p>
     * Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily set to
     * <code>ipv4</code>.
     * </p>
     * 
     * @return Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily
     *         set to <code>ipv4</code>.
     */

    public Boolean isPubliclyAdvertisable() {
        return this.publiclyAdvertisable;
    }

    /**
     * <p>
     * The address family of the pool.
     * </p>
     * 
     * @param addressFamily
     *        The address family of the pool.
     * @see AddressFamily
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The address family of the pool.
     * </p>
     * 
     * @return The address family of the pool.
     * @see AddressFamily
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The address family of the pool.
     * </p>
     * 
     * @param addressFamily
     *        The address family of the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public IpamPool withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * The address family of the pool.
     * </p>
     * 
     * @param addressFamily
     *        The address family of the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressFamily
     */

    public IpamPool withAddressFamily(AddressFamily addressFamily) {
        this.addressFamily = addressFamily.toString();
        return this;
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

    public IpamPool withAllocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
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

    public IpamPool withAllocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
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

    public IpamPool withAllocationDefaultNetmaskLength(Integer allocationDefaultNetmaskLength) {
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

    public java.util.List<IpamResourceTag> getAllocationResourceTags() {
        if (allocationResourceTags == null) {
            allocationResourceTags = new com.amazonaws.internal.SdkInternalList<IpamResourceTag>();
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

    public void setAllocationResourceTags(java.util.Collection<IpamResourceTag> allocationResourceTags) {
        if (allocationResourceTags == null) {
            this.allocationResourceTags = null;
            return;
        }

        this.allocationResourceTags = new com.amazonaws.internal.SdkInternalList<IpamResourceTag>(allocationResourceTags);
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

    public IpamPool withAllocationResourceTags(IpamResourceTag... allocationResourceTags) {
        if (this.allocationResourceTags == null) {
            setAllocationResourceTags(new com.amazonaws.internal.SdkInternalList<IpamResourceTag>(allocationResourceTags.length));
        }
        for (IpamResourceTag ele : allocationResourceTags) {
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

    public IpamPool withAllocationResourceTags(java.util.Collection<IpamResourceTag> allocationResourceTags) {
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

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tags
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
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
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
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
     * @param tags
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPool withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public IpamPool withAwsService(String awsService) {
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

    public IpamPool withAwsService(IpamPoolAwsService awsService) {
        this.awsService = awsService.toString();
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getSourceIpamPoolId() != null)
            sb.append("SourceIpamPoolId: ").append(getSourceIpamPoolId()).append(",");
        if (getIpamPoolArn() != null)
            sb.append("IpamPoolArn: ").append(getIpamPoolArn()).append(",");
        if (getIpamScopeArn() != null)
            sb.append("IpamScopeArn: ").append(getIpamScopeArn()).append(",");
        if (getIpamScopeType() != null)
            sb.append("IpamScopeType: ").append(getIpamScopeType()).append(",");
        if (getIpamArn() != null)
            sb.append("IpamArn: ").append(getIpamArn()).append(",");
        if (getIpamRegion() != null)
            sb.append("IpamRegion: ").append(getIpamRegion()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getPoolDepth() != null)
            sb.append("PoolDepth: ").append(getPoolDepth()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAutoImport() != null)
            sb.append("AutoImport: ").append(getAutoImport()).append(",");
        if (getPubliclyAdvertisable() != null)
            sb.append("PubliclyAdvertisable: ").append(getPubliclyAdvertisable()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
        if (getAllocationMinNetmaskLength() != null)
            sb.append("AllocationMinNetmaskLength: ").append(getAllocationMinNetmaskLength()).append(",");
        if (getAllocationMaxNetmaskLength() != null)
            sb.append("AllocationMaxNetmaskLength: ").append(getAllocationMaxNetmaskLength()).append(",");
        if (getAllocationDefaultNetmaskLength() != null)
            sb.append("AllocationDefaultNetmaskLength: ").append(getAllocationDefaultNetmaskLength()).append(",");
        if (getAllocationResourceTags() != null)
            sb.append("AllocationResourceTags: ").append(getAllocationResourceTags()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof IpamPool == false)
            return false;
        IpamPool other = (IpamPool) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getSourceIpamPoolId() == null ^ this.getSourceIpamPoolId() == null)
            return false;
        if (other.getSourceIpamPoolId() != null && other.getSourceIpamPoolId().equals(this.getSourceIpamPoolId()) == false)
            return false;
        if (other.getIpamPoolArn() == null ^ this.getIpamPoolArn() == null)
            return false;
        if (other.getIpamPoolArn() != null && other.getIpamPoolArn().equals(this.getIpamPoolArn()) == false)
            return false;
        if (other.getIpamScopeArn() == null ^ this.getIpamScopeArn() == null)
            return false;
        if (other.getIpamScopeArn() != null && other.getIpamScopeArn().equals(this.getIpamScopeArn()) == false)
            return false;
        if (other.getIpamScopeType() == null ^ this.getIpamScopeType() == null)
            return false;
        if (other.getIpamScopeType() != null && other.getIpamScopeType().equals(this.getIpamScopeType()) == false)
            return false;
        if (other.getIpamArn() == null ^ this.getIpamArn() == null)
            return false;
        if (other.getIpamArn() != null && other.getIpamArn().equals(this.getIpamArn()) == false)
            return false;
        if (other.getIpamRegion() == null ^ this.getIpamRegion() == null)
            return false;
        if (other.getIpamRegion() != null && other.getIpamRegion().equals(this.getIpamRegion()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getPoolDepth() == null ^ this.getPoolDepth() == null)
            return false;
        if (other.getPoolDepth() != null && other.getPoolDepth().equals(this.getPoolDepth()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutoImport() == null ^ this.getAutoImport() == null)
            return false;
        if (other.getAutoImport() != null && other.getAutoImport().equals(this.getAutoImport()) == false)
            return false;
        if (other.getPubliclyAdvertisable() == null ^ this.getPubliclyAdvertisable() == null)
            return false;
        if (other.getPubliclyAdvertisable() != null && other.getPubliclyAdvertisable().equals(this.getPubliclyAdvertisable()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getSourceIpamPoolId() == null) ? 0 : getSourceIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolArn() == null) ? 0 : getIpamPoolArn().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeArn() == null) ? 0 : getIpamScopeArn().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeType() == null) ? 0 : getIpamScopeType().hashCode());
        hashCode = prime * hashCode + ((getIpamArn() == null) ? 0 : getIpamArn().hashCode());
        hashCode = prime * hashCode + ((getIpamRegion() == null) ? 0 : getIpamRegion().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getPoolDepth() == null) ? 0 : getPoolDepth().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAutoImport() == null) ? 0 : getAutoImport().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAdvertisable() == null) ? 0 : getPubliclyAdvertisable().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getAllocationMinNetmaskLength() == null) ? 0 : getAllocationMinNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationMaxNetmaskLength() == null) ? 0 : getAllocationMaxNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationDefaultNetmaskLength() == null) ? 0 : getAllocationDefaultNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationResourceTags() == null) ? 0 : getAllocationResourceTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        return hashCode;
    }

    @Override
    public IpamPool clone() {
        try {
            return (IpamPool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
