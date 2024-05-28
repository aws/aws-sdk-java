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

/**
 * <p>
 * A resource discovery is an IPAM component that enables IPAM to manage and monitor resources that belong to the owning
 * account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamResourceDiscovery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamResourceDiscovery implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * The resource discovery Amazon Resource Name (ARN).
     * </p>
     */
    private String ipamResourceDiscoveryArn;
    /**
     * <p>
     * The resource discovery Region.
     * </p>
     */
    private String ipamResourceDiscoveryRegion;
    /**
     * <p>
     * The resource discovery description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamOperatingRegion> operatingRegions;
    /**
     * <p>
     * Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     * automatically created when you create an IPAM.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The lifecycle state of the resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-in-progress</code> - Resource discovery is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-complete</code> - Resource discovery creation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-failed</code> - Resource discovery creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-in-progress</code> - Resource discovery is being modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-complete</code> - Resource discovery modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-failed</code> - Resource discovery modification has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-in-progress</code> - Resource discovery is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-complete</code> - Resource discovery deletion is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-failed</code> - Resource discovery deletion has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has been
     * removed and the resource discovery is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     * isolated has been restored.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the owner.
     * </p>
     * 
     * @param ownerId
     *        The ID of the owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the owner.
     * </p>
     * 
     * @return The ID of the owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the owner.
     * </p>
     * 
     * @param ownerId
     *        The ID of the owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        The resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     * 
     * @return The resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * The resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        The resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * The resource discovery Amazon Resource Name (ARN).
     * </p>
     * 
     * @param ipamResourceDiscoveryArn
     *        The resource discovery Amazon Resource Name (ARN).
     */

    public void setIpamResourceDiscoveryArn(String ipamResourceDiscoveryArn) {
        this.ipamResourceDiscoveryArn = ipamResourceDiscoveryArn;
    }

    /**
     * <p>
     * The resource discovery Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The resource discovery Amazon Resource Name (ARN).
     */

    public String getIpamResourceDiscoveryArn() {
        return this.ipamResourceDiscoveryArn;
    }

    /**
     * <p>
     * The resource discovery Amazon Resource Name (ARN).
     * </p>
     * 
     * @param ipamResourceDiscoveryArn
     *        The resource discovery Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withIpamResourceDiscoveryArn(String ipamResourceDiscoveryArn) {
        setIpamResourceDiscoveryArn(ipamResourceDiscoveryArn);
        return this;
    }

    /**
     * <p>
     * The resource discovery Region.
     * </p>
     * 
     * @param ipamResourceDiscoveryRegion
     *        The resource discovery Region.
     */

    public void setIpamResourceDiscoveryRegion(String ipamResourceDiscoveryRegion) {
        this.ipamResourceDiscoveryRegion = ipamResourceDiscoveryRegion;
    }

    /**
     * <p>
     * The resource discovery Region.
     * </p>
     * 
     * @return The resource discovery Region.
     */

    public String getIpamResourceDiscoveryRegion() {
        return this.ipamResourceDiscoveryRegion;
    }

    /**
     * <p>
     * The resource discovery Region.
     * </p>
     * 
     * @param ipamResourceDiscoveryRegion
     *        The resource discovery Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withIpamResourceDiscoveryRegion(String ipamResourceDiscoveryRegion) {
        setIpamResourceDiscoveryRegion(ipamResourceDiscoveryRegion);
        return this;
    }

    /**
     * <p>
     * The resource discovery description.
     * </p>
     * 
     * @param description
     *        The resource discovery description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The resource discovery description.
     * </p>
     * 
     * @return The resource discovery description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The resource discovery description.
     * </p>
     * 
     * @param description
     *        The resource discovery description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @return The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where
     *         the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *         Web Services Regions you select as operating Regions.
     */

    public java.util.List<IpamOperatingRegion> getOperatingRegions() {
        if (operatingRegions == null) {
            operatingRegions = new com.amazonaws.internal.SdkInternalList<IpamOperatingRegion>();
        }
        return operatingRegions;
    }

    /**
     * <p>
     * The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     */

    public void setOperatingRegions(java.util.Collection<IpamOperatingRegion> operatingRegions) {
        if (operatingRegions == null) {
            this.operatingRegions = null;
            return;
        }

        this.operatingRegions = new com.amazonaws.internal.SdkInternalList<IpamOperatingRegion>(operatingRegions);
    }

    /**
     * <p>
     * The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingRegions(java.util.Collection)} or {@link #withOperatingRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withOperatingRegions(IpamOperatingRegion... operatingRegions) {
        if (this.operatingRegions == null) {
            setOperatingRegions(new com.amazonaws.internal.SdkInternalList<IpamOperatingRegion>(operatingRegions.length));
        }
        for (IpamOperatingRegion ele : operatingRegions) {
            this.operatingRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where the
     * IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services
     * Regions you select as operating Regions.
     * </p>
     * 
     * @param operatingRegions
     *        The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where
     *        the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon
     *        Web Services Regions you select as operating Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withOperatingRegions(java.util.Collection<IpamOperatingRegion> operatingRegions) {
        setOperatingRegions(operatingRegions);
        return this;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     * automatically created when you create an IPAM.
     * </p>
     * 
     * @param isDefault
     *        Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     *        automatically created when you create an IPAM.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     * automatically created when you create an IPAM.
     * </p>
     * 
     * @return Defines if the resource discovery is the default. The default resource discovery is the resource
     *         discovery automatically created when you create an IPAM.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     * automatically created when you create an IPAM.
     * </p>
     * 
     * @param isDefault
     *        Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     *        automatically created when you create an IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. The default resource discovery is the resource discovery
     * automatically created when you create an IPAM.
     * </p>
     * 
     * @return Defines if the resource discovery is the default. The default resource discovery is the resource
     *         discovery automatically created when you create an IPAM.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The lifecycle state of the resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-in-progress</code> - Resource discovery is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-complete</code> - Resource discovery creation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-failed</code> - Resource discovery creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-in-progress</code> - Resource discovery is being modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-complete</code> - Resource discovery modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-failed</code> - Resource discovery modification has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-in-progress</code> - Resource discovery is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-complete</code> - Resource discovery deletion is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-failed</code> - Resource discovery deletion has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has been
     * removed and the resource discovery is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     * isolated has been restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The lifecycle state of the resource discovery.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-in-progress</code> - Resource discovery is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-complete</code> - Resource discovery creation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-failed</code> - Resource discovery creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-in-progress</code> - Resource discovery is being modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-complete</code> - Resource discovery modification is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-failed</code> - Resource discovery modification has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-in-progress</code> - Resource discovery is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-complete</code> - Resource discovery deletion is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-failed</code> - Resource discovery deletion has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has
     *        been removed and the resource discovery is being isolated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-complete</code> - Resource discovery isolation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     *        isolated has been restored.
     *        </p>
     *        </li>
     * @see IpamResourceDiscoveryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The lifecycle state of the resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-in-progress</code> - Resource discovery is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-complete</code> - Resource discovery creation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-failed</code> - Resource discovery creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-in-progress</code> - Resource discovery is being modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-complete</code> - Resource discovery modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-failed</code> - Resource discovery modification has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-in-progress</code> - Resource discovery is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-complete</code> - Resource discovery deletion is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-failed</code> - Resource discovery deletion has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has been
     * removed and the resource discovery is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     * isolated has been restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle state of the resource discovery.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>create-in-progress</code> - Resource discovery is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-complete</code> - Resource discovery creation is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-failed</code> - Resource discovery creation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify-in-progress</code> - Resource discovery is being modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify-complete</code> - Resource discovery modification is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify-failed</code> - Resource discovery modification has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>delete-in-progress</code> - Resource discovery is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>delete-complete</code> - Resource discovery deletion is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>delete-failed</code> - Resource discovery deletion has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has
     *         been removed and the resource discovery is being isolated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>isolate-complete</code> - Resource discovery isolation is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and
     *         was isolated has been restored.
     *         </p>
     *         </li>
     * @see IpamResourceDiscoveryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The lifecycle state of the resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-in-progress</code> - Resource discovery is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-complete</code> - Resource discovery creation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-failed</code> - Resource discovery creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-in-progress</code> - Resource discovery is being modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-complete</code> - Resource discovery modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-failed</code> - Resource discovery modification has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-in-progress</code> - Resource discovery is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-complete</code> - Resource discovery deletion is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-failed</code> - Resource discovery deletion has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has been
     * removed and the resource discovery is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     * isolated has been restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The lifecycle state of the resource discovery.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-in-progress</code> - Resource discovery is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-complete</code> - Resource discovery creation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-failed</code> - Resource discovery creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-in-progress</code> - Resource discovery is being modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-complete</code> - Resource discovery modification is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-failed</code> - Resource discovery modification has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-in-progress</code> - Resource discovery is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-complete</code> - Resource discovery deletion is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-failed</code> - Resource discovery deletion has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has
     *        been removed and the resource discovery is being isolated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-complete</code> - Resource discovery isolation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     *        isolated has been restored.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceDiscoveryState
     */

    public IpamResourceDiscovery withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-in-progress</code> - Resource discovery is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-complete</code> - Resource discovery creation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-failed</code> - Resource discovery creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-in-progress</code> - Resource discovery is being modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-complete</code> - Resource discovery modification is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify-failed</code> - Resource discovery modification has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-in-progress</code> - Resource discovery is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-complete</code> - Resource discovery deletion is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>delete-failed</code> - Resource discovery deletion has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has been
     * removed and the resource discovery is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     * isolated has been restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The lifecycle state of the resource discovery.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-in-progress</code> - Resource discovery is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-complete</code> - Resource discovery creation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-failed</code> - Resource discovery creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-in-progress</code> - Resource discovery is being modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-complete</code> - Resource discovery modification is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify-failed</code> - Resource discovery modification has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-in-progress</code> - Resource discovery is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-complete</code> - Resource discovery deletion is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>delete-failed</code> - Resource discovery deletion has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery has
     *        been removed and the resource discovery is being isolated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-complete</code> - Resource discovery isolation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>restore-in-progress</code> - Amazon Web Services account that created the resource discovery and was
     *        isolated has been restored.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceDiscoveryState
     */

    public IpamResourceDiscovery withState(IpamResourceDiscoveryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @return A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *         optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *         costs.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
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
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withTags(Tag... tags) {
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
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscovery withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId()).append(",");
        if (getIpamResourceDiscoveryArn() != null)
            sb.append("IpamResourceDiscoveryArn: ").append(getIpamResourceDiscoveryArn()).append(",");
        if (getIpamResourceDiscoveryRegion() != null)
            sb.append("IpamResourceDiscoveryRegion: ").append(getIpamResourceDiscoveryRegion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperatingRegions() != null)
            sb.append("OperatingRegions: ").append(getOperatingRegions()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamResourceDiscovery == false)
            return false;
        IpamResourceDiscovery other = (IpamResourceDiscovery) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getIpamResourceDiscoveryArn() == null ^ this.getIpamResourceDiscoveryArn() == null)
            return false;
        if (other.getIpamResourceDiscoveryArn() != null && other.getIpamResourceDiscoveryArn().equals(this.getIpamResourceDiscoveryArn()) == false)
            return false;
        if (other.getIpamResourceDiscoveryRegion() == null ^ this.getIpamResourceDiscoveryRegion() == null)
            return false;
        if (other.getIpamResourceDiscoveryRegion() != null && other.getIpamResourceDiscoveryRegion().equals(this.getIpamResourceDiscoveryRegion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperatingRegions() == null ^ this.getOperatingRegions() == null)
            return false;
        if (other.getOperatingRegions() != null && other.getOperatingRegions().equals(this.getOperatingRegions()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryArn() == null) ? 0 : getIpamResourceDiscoveryArn().hashCode());
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryRegion() == null) ? 0 : getIpamResourceDiscoveryRegion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperatingRegions() == null) ? 0 : getOperatingRegions().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public IpamResourceDiscovery clone() {
        try {
            return (IpamResourceDiscovery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
