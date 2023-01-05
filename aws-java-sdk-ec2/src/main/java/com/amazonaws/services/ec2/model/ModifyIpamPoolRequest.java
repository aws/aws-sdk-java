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
import com.amazonaws.services.ec2.model.transform.ModifyIpamPoolRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamPoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyIpamPoolRequest> {

    /**
     * <p>
     * The ID of the IPAM pool you want to modify.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The description of the IPAM pool you want to modify.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically import
     * them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be
     * allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
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
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128. The minimum
     * netmask length must be less than the maximum netmask length.
     * </p>
     */
    private Integer allocationMinNetmaskLength;
    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The maximum
     * netmask length must be greater than the minimum netmask length.
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
     * Clear the default netmask length allocation rule for this pool.
     * </p>
     */
    private Boolean clearAllocationDefaultNetmaskLength;
    /**
     * <p>
     * Add tag allocation rules to a pool. For more information about allocation rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     * <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag> addAllocationResourceTags;
    /**
     * <p>
     * Remove tag allocation rules from a pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag> removeAllocationResourceTags;

    /**
     * <p>
     * The ID of the IPAM pool you want to modify.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool you want to modify.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool you want to modify.
     * </p>
     * 
     * @return The ID of the IPAM pool you want to modify.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool you want to modify.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The description of the IPAM pool you want to modify.
     * </p>
     * 
     * @param description
     *        The description of the IPAM pool you want to modify.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the IPAM pool you want to modify.
     * </p>
     * 
     * @return The description of the IPAM pool you want to modify.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the IPAM pool you want to modify.
     * </p>
     * 
     * @param description
     *        The description of the IPAM pool you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically import
     * them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be
     * allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @param autoImport
     *        If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     *        import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not
     *        already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR
     *        regardless of its compliance with the pool's allocation rules, so a resource might be imported and
     *        subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     *        largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of
     *        them only. </p>
     *        <p>
     *        A locale must be set on the pool for this feature to work.
     */

    public void setAutoImport(Boolean autoImport) {
        this.autoImport = autoImport;
    }

    /**
     * <p>
     * If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically import
     * them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be
     * allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @return If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     *         import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not
     *         already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR
     *         regardless of its compliance with the pool's allocation rules, so a resource might be imported and
     *         subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     *         largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of
     *         them only. </p>
     *         <p>
     *         A locale must be set on the pool for this feature to work.
     */

    public Boolean getAutoImport() {
        return this.autoImport;
    }

    /**
     * <p>
     * If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically import
     * them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be
     * allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @param autoImport
     *        If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     *        import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not
     *        already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR
     *        regardless of its compliance with the pool's allocation rules, so a resource might be imported and
     *        subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     *        largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of
     *        them only. </p>
     *        <p>
     *        A locale must be set on the pool for this feature to work.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withAutoImport(Boolean autoImport) {
        setAutoImport(autoImport);
        return this;
    }

    /**
     * <p>
     * If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically import
     * them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be
     * allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its
     * compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as
     * noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM
     * discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.
     * </p>
     * <p>
     * A locale must be set on the pool for this feature to work.
     * </p>
     * 
     * @return If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically
     *         import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not
     *         already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR
     *         regardless of its compliance with the pool's allocation rules, so a resource might be imported and
     *         subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the
     *         largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of
     *         them only. </p>
     *         <p>
     *         A locale must be set on the pool for this feature to work.
     */

    public Boolean isAutoImport() {
        return this.autoImport;
    }

    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128. The minimum
     * netmask length must be less than the maximum netmask length.
     * </p>
     * 
     * @param allocationMinNetmaskLength
     *        The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible
     *        netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *        The minimum netmask length must be less than the maximum netmask length.
     */

    public void setAllocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
    }

    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128. The minimum
     * netmask length must be less than the maximum netmask length.
     * </p>
     * 
     * @return The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible
     *         netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *         The minimum netmask length must be less than the maximum netmask length.
     */

    public Integer getAllocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength;
    }

    /**
     * <p>
     * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128. The minimum
     * netmask length must be less than the maximum netmask length.
     * </p>
     * 
     * @param allocationMinNetmaskLength
     *        The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible
     *        netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     *        The minimum netmask length must be less than the maximum netmask length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withAllocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
        setAllocationMinNetmaskLength(allocationMinNetmaskLength);
        return this;
    }

    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The maximum
     * netmask length must be greater than the minimum netmask length.
     * </p>
     * 
     * @param allocationMaxNetmaskLength
     *        The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible
     *        netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The
     *        maximum netmask length must be greater than the minimum netmask length.
     */

    public void setAllocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
    }

    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The maximum
     * netmask length must be greater than the minimum netmask length.
     * </p>
     * 
     * @return The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible
     *         netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 -
     *         128.The maximum netmask length must be greater than the minimum netmask length.
     */

    public Integer getAllocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength;
    }

    /**
     * <p>
     * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible netmask
     * lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The maximum
     * netmask length must be greater than the minimum netmask length.
     * </p>
     * 
     * @param allocationMaxNetmaskLength
     *        The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible
     *        netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The
     *        maximum netmask length must be greater than the minimum netmask length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withAllocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
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

    public ModifyIpamPoolRequest withAllocationDefaultNetmaskLength(Integer allocationDefaultNetmaskLength) {
        setAllocationDefaultNetmaskLength(allocationDefaultNetmaskLength);
        return this;
    }

    /**
     * <p>
     * Clear the default netmask length allocation rule for this pool.
     * </p>
     * 
     * @param clearAllocationDefaultNetmaskLength
     *        Clear the default netmask length allocation rule for this pool.
     */

    public void setClearAllocationDefaultNetmaskLength(Boolean clearAllocationDefaultNetmaskLength) {
        this.clearAllocationDefaultNetmaskLength = clearAllocationDefaultNetmaskLength;
    }

    /**
     * <p>
     * Clear the default netmask length allocation rule for this pool.
     * </p>
     * 
     * @return Clear the default netmask length allocation rule for this pool.
     */

    public Boolean getClearAllocationDefaultNetmaskLength() {
        return this.clearAllocationDefaultNetmaskLength;
    }

    /**
     * <p>
     * Clear the default netmask length allocation rule for this pool.
     * </p>
     * 
     * @param clearAllocationDefaultNetmaskLength
     *        Clear the default netmask length allocation rule for this pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withClearAllocationDefaultNetmaskLength(Boolean clearAllocationDefaultNetmaskLength) {
        setClearAllocationDefaultNetmaskLength(clearAllocationDefaultNetmaskLength);
        return this;
    }

    /**
     * <p>
     * Clear the default netmask length allocation rule for this pool.
     * </p>
     * 
     * @return Clear the default netmask length allocation rule for this pool.
     */

    public Boolean isClearAllocationDefaultNetmaskLength() {
        return this.clearAllocationDefaultNetmaskLength;
    }

    /**
     * <p>
     * Add tag allocation rules to a pool. For more information about allocation rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     * <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @return Add tag allocation rules to a pool. For more information about allocation rules, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in
     *         the <i>Amazon VPC IPAM User Guide</i>.
     */

    public java.util.List<RequestIpamResourceTag> getAddAllocationResourceTags() {
        if (addAllocationResourceTags == null) {
            addAllocationResourceTags = new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>();
        }
        return addAllocationResourceTags;
    }

    /**
     * <p>
     * Add tag allocation rules to a pool. For more information about allocation rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     * <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param addAllocationResourceTags
     *        Add tag allocation rules to a pool. For more information about allocation rules, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     *        <i>Amazon VPC IPAM User Guide</i>.
     */

    public void setAddAllocationResourceTags(java.util.Collection<RequestIpamResourceTag> addAllocationResourceTags) {
        if (addAllocationResourceTags == null) {
            this.addAllocationResourceTags = null;
            return;
        }

        this.addAllocationResourceTags = new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>(addAllocationResourceTags);
    }

    /**
     * <p>
     * Add tag allocation rules to a pool. For more information about allocation rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     * <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddAllocationResourceTags(java.util.Collection)} or
     * {@link #withAddAllocationResourceTags(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addAllocationResourceTags
     *        Add tag allocation rules to a pool. For more information about allocation rules, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     *        <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withAddAllocationResourceTags(RequestIpamResourceTag... addAllocationResourceTags) {
        if (this.addAllocationResourceTags == null) {
            setAddAllocationResourceTags(new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>(addAllocationResourceTags.length));
        }
        for (RequestIpamResourceTag ele : addAllocationResourceTags) {
            this.addAllocationResourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Add tag allocation rules to a pool. For more information about allocation rules, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     * <i>Amazon VPC IPAM User Guide</i>.
     * </p>
     * 
     * @param addAllocationResourceTags
     *        Add tag allocation rules to a pool. For more information about allocation rules, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/ipam/create-top-ipam.html">Create a top-level pool</a> in the
     *        <i>Amazon VPC IPAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withAddAllocationResourceTags(java.util.Collection<RequestIpamResourceTag> addAllocationResourceTags) {
        setAddAllocationResourceTags(addAllocationResourceTags);
        return this;
    }

    /**
     * <p>
     * Remove tag allocation rules from a pool.
     * </p>
     * 
     * @return Remove tag allocation rules from a pool.
     */

    public java.util.List<RequestIpamResourceTag> getRemoveAllocationResourceTags() {
        if (removeAllocationResourceTags == null) {
            removeAllocationResourceTags = new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>();
        }
        return removeAllocationResourceTags;
    }

    /**
     * <p>
     * Remove tag allocation rules from a pool.
     * </p>
     * 
     * @param removeAllocationResourceTags
     *        Remove tag allocation rules from a pool.
     */

    public void setRemoveAllocationResourceTags(java.util.Collection<RequestIpamResourceTag> removeAllocationResourceTags) {
        if (removeAllocationResourceTags == null) {
            this.removeAllocationResourceTags = null;
            return;
        }

        this.removeAllocationResourceTags = new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>(removeAllocationResourceTags);
    }

    /**
     * <p>
     * Remove tag allocation rules from a pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveAllocationResourceTags(java.util.Collection)} or
     * {@link #withRemoveAllocationResourceTags(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeAllocationResourceTags
     *        Remove tag allocation rules from a pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withRemoveAllocationResourceTags(RequestIpamResourceTag... removeAllocationResourceTags) {
        if (this.removeAllocationResourceTags == null) {
            setRemoveAllocationResourceTags(new com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>(removeAllocationResourceTags.length));
        }
        for (RequestIpamResourceTag ele : removeAllocationResourceTags) {
            this.removeAllocationResourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Remove tag allocation rules from a pool.
     * </p>
     * 
     * @param removeAllocationResourceTags
     *        Remove tag allocation rules from a pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamPoolRequest withRemoveAllocationResourceTags(java.util.Collection<RequestIpamResourceTag> removeAllocationResourceTags) {
        setRemoveAllocationResourceTags(removeAllocationResourceTags);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIpamPoolRequest> getDryRunRequest() {
        Request<ModifyIpamPoolRequest> request = new ModifyIpamPoolRequestMarshaller().marshall(this);
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
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAutoImport() != null)
            sb.append("AutoImport: ").append(getAutoImport()).append(",");
        if (getAllocationMinNetmaskLength() != null)
            sb.append("AllocationMinNetmaskLength: ").append(getAllocationMinNetmaskLength()).append(",");
        if (getAllocationMaxNetmaskLength() != null)
            sb.append("AllocationMaxNetmaskLength: ").append(getAllocationMaxNetmaskLength()).append(",");
        if (getAllocationDefaultNetmaskLength() != null)
            sb.append("AllocationDefaultNetmaskLength: ").append(getAllocationDefaultNetmaskLength()).append(",");
        if (getClearAllocationDefaultNetmaskLength() != null)
            sb.append("ClearAllocationDefaultNetmaskLength: ").append(getClearAllocationDefaultNetmaskLength()).append(",");
        if (getAddAllocationResourceTags() != null)
            sb.append("AddAllocationResourceTags: ").append(getAddAllocationResourceTags()).append(",");
        if (getRemoveAllocationResourceTags() != null)
            sb.append("RemoveAllocationResourceTags: ").append(getRemoveAllocationResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIpamPoolRequest == false)
            return false;
        ModifyIpamPoolRequest other = (ModifyIpamPoolRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutoImport() == null ^ this.getAutoImport() == null)
            return false;
        if (other.getAutoImport() != null && other.getAutoImport().equals(this.getAutoImport()) == false)
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
        if (other.getClearAllocationDefaultNetmaskLength() == null ^ this.getClearAllocationDefaultNetmaskLength() == null)
            return false;
        if (other.getClearAllocationDefaultNetmaskLength() != null
                && other.getClearAllocationDefaultNetmaskLength().equals(this.getClearAllocationDefaultNetmaskLength()) == false)
            return false;
        if (other.getAddAllocationResourceTags() == null ^ this.getAddAllocationResourceTags() == null)
            return false;
        if (other.getAddAllocationResourceTags() != null && other.getAddAllocationResourceTags().equals(this.getAddAllocationResourceTags()) == false)
            return false;
        if (other.getRemoveAllocationResourceTags() == null ^ this.getRemoveAllocationResourceTags() == null)
            return false;
        if (other.getRemoveAllocationResourceTags() != null && other.getRemoveAllocationResourceTags().equals(this.getRemoveAllocationResourceTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAutoImport() == null) ? 0 : getAutoImport().hashCode());
        hashCode = prime * hashCode + ((getAllocationMinNetmaskLength() == null) ? 0 : getAllocationMinNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationMaxNetmaskLength() == null) ? 0 : getAllocationMaxNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAllocationDefaultNetmaskLength() == null) ? 0 : getAllocationDefaultNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getClearAllocationDefaultNetmaskLength() == null) ? 0 : getClearAllocationDefaultNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getAddAllocationResourceTags() == null) ? 0 : getAddAllocationResourceTags().hashCode());
        hashCode = prime * hashCode + ((getRemoveAllocationResourceTags() == null) ? 0 : getRemoveAllocationResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIpamPoolRequest clone() {
        return (ModifyIpamPoolRequest) super.clone();
    }
}
