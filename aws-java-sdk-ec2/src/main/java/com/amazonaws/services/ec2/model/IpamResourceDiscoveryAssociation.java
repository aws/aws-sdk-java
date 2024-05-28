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
 * An IPAM resource discovery association. An associated resource discovery is a resource discovery that has been
 * associated with an IPAM. IPAM aggregates the resource CIDRs discovered by the associated resource discovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamResourceDiscoveryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamResourceDiscoveryAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID of the resource discovery owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The resource discovery association ID.
     * </p>
     */
    private String ipamResourceDiscoveryAssociationId;
    /**
     * <p>
     * The resource discovery association Amazon Resource Name (ARN).
     * </p>
     */
    private String ipamResourceDiscoveryAssociationArn;
    /**
     * <p>
     * The resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * The IPAM ID.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * The IPAM ARN.
     * </p>
     */
    private String ipamArn;
    /**
     * <p>
     * The IPAM home Region.
     * </p>
     */
    private String ipamRegion;
    /**
     * <p>
     * Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     * created for your IPAM and it's associated with your IPAM.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The resource discovery status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     * intact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-found</code> - Connection or permissions required to read the results of the resource discovery are
     * broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the resource
     * discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource share is still
     * intact.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceDiscoveryStatus;
    /**
     * <p>
     * The lifecycle state of the association when you associate or disassociate a resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associate-in-progress</code> - Resource discovery is being associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-complete</code> - Resource discovery association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-failed</code> - Resource discovery association has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery association
     * has been removed and the resource discovery associatation is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete..
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Resource discovery is being restored.
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
     * The Amazon Web Services account ID of the resource discovery owner.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the resource discovery owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the resource discovery owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the resource discovery owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the resource discovery owner.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the resource discovery owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The resource discovery association ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociationId
     *        The resource discovery association ID.
     */

    public void setIpamResourceDiscoveryAssociationId(String ipamResourceDiscoveryAssociationId) {
        this.ipamResourceDiscoveryAssociationId = ipamResourceDiscoveryAssociationId;
    }

    /**
     * <p>
     * The resource discovery association ID.
     * </p>
     * 
     * @return The resource discovery association ID.
     */

    public String getIpamResourceDiscoveryAssociationId() {
        return this.ipamResourceDiscoveryAssociationId;
    }

    /**
     * <p>
     * The resource discovery association ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociationId
     *        The resource discovery association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withIpamResourceDiscoveryAssociationId(String ipamResourceDiscoveryAssociationId) {
        setIpamResourceDiscoveryAssociationId(ipamResourceDiscoveryAssociationId);
        return this;
    }

    /**
     * <p>
     * The resource discovery association Amazon Resource Name (ARN).
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociationArn
     *        The resource discovery association Amazon Resource Name (ARN).
     */

    public void setIpamResourceDiscoveryAssociationArn(String ipamResourceDiscoveryAssociationArn) {
        this.ipamResourceDiscoveryAssociationArn = ipamResourceDiscoveryAssociationArn;
    }

    /**
     * <p>
     * The resource discovery association Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The resource discovery association Amazon Resource Name (ARN).
     */

    public String getIpamResourceDiscoveryAssociationArn() {
        return this.ipamResourceDiscoveryAssociationArn;
    }

    /**
     * <p>
     * The resource discovery association Amazon Resource Name (ARN).
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociationArn
     *        The resource discovery association Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withIpamResourceDiscoveryAssociationArn(String ipamResourceDiscoveryAssociationArn) {
        setIpamResourceDiscoveryAssociationArn(ipamResourceDiscoveryAssociationArn);
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

    public IpamResourceDiscoveryAssociation withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * The IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        The IPAM ID.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The IPAM ID.
     * </p>
     * 
     * @return The IPAM ID.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        The IPAM ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * The IPAM ARN.
     * </p>
     * 
     * @param ipamArn
     *        The IPAM ARN.
     */

    public void setIpamArn(String ipamArn) {
        this.ipamArn = ipamArn;
    }

    /**
     * <p>
     * The IPAM ARN.
     * </p>
     * 
     * @return The IPAM ARN.
     */

    public String getIpamArn() {
        return this.ipamArn;
    }

    /**
     * <p>
     * The IPAM ARN.
     * </p>
     * 
     * @param ipamArn
     *        The IPAM ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withIpamArn(String ipamArn) {
        setIpamArn(ipamArn);
        return this;
    }

    /**
     * <p>
     * The IPAM home Region.
     * </p>
     * 
     * @param ipamRegion
     *        The IPAM home Region.
     */

    public void setIpamRegion(String ipamRegion) {
        this.ipamRegion = ipamRegion;
    }

    /**
     * <p>
     * The IPAM home Region.
     * </p>
     * 
     * @return The IPAM home Region.
     */

    public String getIpamRegion() {
        return this.ipamRegion;
    }

    /**
     * <p>
     * The IPAM home Region.
     * </p>
     * 
     * @param ipamRegion
     *        The IPAM home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withIpamRegion(String ipamRegion) {
        setIpamRegion(ipamRegion);
        return this;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     * created for your IPAM and it's associated with your IPAM.
     * </p>
     * 
     * @param isDefault
     *        Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     *        created for your IPAM and it's associated with your IPAM.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     * created for your IPAM and it's associated with your IPAM.
     * </p>
     * 
     * @return Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery
     *         is created for your IPAM and it's associated with your IPAM.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     * created for your IPAM and it's associated with your IPAM.
     * </p>
     * 
     * @param isDefault
     *        Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     *        created for your IPAM and it's associated with your IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamResourceDiscoveryAssociation withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is
     * created for your IPAM and it's associated with your IPAM.
     * </p>
     * 
     * @return Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery
     *         is created for your IPAM and it's associated with your IPAM.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The resource discovery status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     * intact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-found</code> - Connection or permissions required to read the results of the resource discovery are
     * broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the resource
     * discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource share is still
     * intact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceDiscoveryStatus
     *        The resource discovery status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     *        intact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-found</code> - Connection or permissions required to read the results of the resource discovery
     *        are broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the
     *        resource discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource
     *        share is still intact.
     *        </p>
     *        </li>
     * @see IpamAssociatedResourceDiscoveryStatus
     */

    public void setResourceDiscoveryStatus(String resourceDiscoveryStatus) {
        this.resourceDiscoveryStatus = resourceDiscoveryStatus;
    }

    /**
     * <p>
     * The resource discovery status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     * intact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-found</code> - Connection or permissions required to read the results of the resource discovery are
     * broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the resource
     * discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource share is still
     * intact.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource discovery status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - Connection or permissions required to read the results of the resource discovery
     *         are intact.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>not-found</code> - Connection or permissions required to read the results of the resource discovery
     *         are broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the
     *         resource discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource
     *         share is still intact.
     *         </p>
     *         </li>
     * @see IpamAssociatedResourceDiscoveryStatus
     */

    public String getResourceDiscoveryStatus() {
        return this.resourceDiscoveryStatus;
    }

    /**
     * <p>
     * The resource discovery status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     * intact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-found</code> - Connection or permissions required to read the results of the resource discovery are
     * broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the resource
     * discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource share is still
     * intact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceDiscoveryStatus
     *        The resource discovery status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     *        intact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-found</code> - Connection or permissions required to read the results of the resource discovery
     *        are broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the
     *        resource discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource
     *        share is still intact.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamAssociatedResourceDiscoveryStatus
     */

    public IpamResourceDiscoveryAssociation withResourceDiscoveryStatus(String resourceDiscoveryStatus) {
        setResourceDiscoveryStatus(resourceDiscoveryStatus);
        return this;
    }

    /**
     * <p>
     * The resource discovery status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     * intact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>not-found</code> - Connection or permissions required to read the results of the resource discovery are
     * broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the resource
     * discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource share is still
     * intact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceDiscoveryStatus
     *        The resource discovery status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - Connection or permissions required to read the results of the resource discovery are
     *        intact.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>not-found</code> - Connection or permissions required to read the results of the resource discovery
     *        are broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the
     *        resource discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource
     *        share is still intact.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamAssociatedResourceDiscoveryStatus
     */

    public IpamResourceDiscoveryAssociation withResourceDiscoveryStatus(IpamAssociatedResourceDiscoveryStatus resourceDiscoveryStatus) {
        this.resourceDiscoveryStatus = resourceDiscoveryStatus.toString();
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the association when you associate or disassociate a resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associate-in-progress</code> - Resource discovery is being associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-complete</code> - Resource discovery association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-failed</code> - Resource discovery association has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery association
     * has been removed and the resource discovery associatation is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete..
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Resource discovery is being restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The lifecycle state of the association when you associate or disassociate a resource discovery.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associate-in-progress</code> - Resource discovery is being associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associate-complete</code> - Resource discovery association is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associate-failed</code> - Resource discovery association has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery
     *        association has been removed and the resource discovery associatation is being isolated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-complete</code> - Resource discovery isolation is complete..
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>restore-in-progress</code> - Resource discovery is being restored.
     *        </p>
     *        </li>
     * @see IpamResourceDiscoveryAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The lifecycle state of the association when you associate or disassociate a resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associate-in-progress</code> - Resource discovery is being associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-complete</code> - Resource discovery association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-failed</code> - Resource discovery association has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery association
     * has been removed and the resource discovery associatation is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete..
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Resource discovery is being restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle state of the association when you associate or disassociate a resource discovery.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>associate-in-progress</code> - Resource discovery is being associated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>associate-complete</code> - Resource discovery association is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>associate-failed</code> - Resource discovery association has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery
     *         association has been removed and the resource discovery associatation is being isolated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>isolate-complete</code> - Resource discovery isolation is complete..
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>restore-in-progress</code> - Resource discovery is being restored.
     *         </p>
     *         </li>
     * @see IpamResourceDiscoveryAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The lifecycle state of the association when you associate or disassociate a resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associate-in-progress</code> - Resource discovery is being associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-complete</code> - Resource discovery association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-failed</code> - Resource discovery association has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery association
     * has been removed and the resource discovery associatation is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete..
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Resource discovery is being restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The lifecycle state of the association when you associate or disassociate a resource discovery.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associate-in-progress</code> - Resource discovery is being associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associate-complete</code> - Resource discovery association is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associate-failed</code> - Resource discovery association has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery
     *        association has been removed and the resource discovery associatation is being isolated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-complete</code> - Resource discovery isolation is complete..
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>restore-in-progress</code> - Resource discovery is being restored.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceDiscoveryAssociationState
     */

    public IpamResourceDiscoveryAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the association when you associate or disassociate a resource discovery.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associate-in-progress</code> - Resource discovery is being associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-complete</code> - Resource discovery association is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associate-failed</code> - Resource discovery association has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery association
     * has been removed and the resource discovery associatation is being isolated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isolate-complete</code> - Resource discovery isolation is complete..
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore-in-progress</code> - Resource discovery is being restored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The lifecycle state of the association when you associate or disassociate a resource discovery.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associate-in-progress</code> - Resource discovery is being associated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associate-complete</code> - Resource discovery association is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associate-failed</code> - Resource discovery association has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-in-progress</code> - Resource discovery is being disassociated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-complete</code> - Resource discovery disassociation is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociate-failed </code> - Resource discovery disassociation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-in-progress</code> - Amazon Web Services account that created the resource discovery
     *        association has been removed and the resource discovery associatation is being isolated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isolate-complete</code> - Resource discovery isolation is complete..
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>restore-in-progress</code> - Resource discovery is being restored.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceDiscoveryAssociationState
     */

    public IpamResourceDiscoveryAssociation withState(IpamResourceDiscoveryAssociationState state) {
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

    public IpamResourceDiscoveryAssociation withTags(Tag... tags) {
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

    public IpamResourceDiscoveryAssociation withTags(java.util.Collection<Tag> tags) {
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
        if (getIpamResourceDiscoveryAssociationId() != null)
            sb.append("IpamResourceDiscoveryAssociationId: ").append(getIpamResourceDiscoveryAssociationId()).append(",");
        if (getIpamResourceDiscoveryAssociationArn() != null)
            sb.append("IpamResourceDiscoveryAssociationArn: ").append(getIpamResourceDiscoveryAssociationArn()).append(",");
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId()).append(",");
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getIpamArn() != null)
            sb.append("IpamArn: ").append(getIpamArn()).append(",");
        if (getIpamRegion() != null)
            sb.append("IpamRegion: ").append(getIpamRegion()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getResourceDiscoveryStatus() != null)
            sb.append("ResourceDiscoveryStatus: ").append(getResourceDiscoveryStatus()).append(",");
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

        if (obj instanceof IpamResourceDiscoveryAssociation == false)
            return false;
        IpamResourceDiscoveryAssociation other = (IpamResourceDiscoveryAssociation) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getIpamResourceDiscoveryAssociationId() == null ^ this.getIpamResourceDiscoveryAssociationId() == null)
            return false;
        if (other.getIpamResourceDiscoveryAssociationId() != null
                && other.getIpamResourceDiscoveryAssociationId().equals(this.getIpamResourceDiscoveryAssociationId()) == false)
            return false;
        if (other.getIpamResourceDiscoveryAssociationArn() == null ^ this.getIpamResourceDiscoveryAssociationArn() == null)
            return false;
        if (other.getIpamResourceDiscoveryAssociationArn() != null
                && other.getIpamResourceDiscoveryAssociationArn().equals(this.getIpamResourceDiscoveryAssociationArn()) == false)
            return false;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getIpamArn() == null ^ this.getIpamArn() == null)
            return false;
        if (other.getIpamArn() != null && other.getIpamArn().equals(this.getIpamArn()) == false)
            return false;
        if (other.getIpamRegion() == null ^ this.getIpamRegion() == null)
            return false;
        if (other.getIpamRegion() != null && other.getIpamRegion().equals(this.getIpamRegion()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getResourceDiscoveryStatus() == null ^ this.getResourceDiscoveryStatus() == null)
            return false;
        if (other.getResourceDiscoveryStatus() != null && other.getResourceDiscoveryStatus().equals(this.getResourceDiscoveryStatus()) == false)
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
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryAssociationId() == null) ? 0 : getIpamResourceDiscoveryAssociationId().hashCode());
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryAssociationArn() == null) ? 0 : getIpamResourceDiscoveryAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getIpamArn() == null) ? 0 : getIpamArn().hashCode());
        hashCode = prime * hashCode + ((getIpamRegion() == null) ? 0 : getIpamRegion().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getResourceDiscoveryStatus() == null) ? 0 : getResourceDiscoveryStatus().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public IpamResourceDiscoveryAssociation clone() {
        try {
            return (IpamResourceDiscoveryAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
