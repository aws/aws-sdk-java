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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of a network package.
 * </p>
 * <p>
 * A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to
 * deploy and the Amazon Web Services infrastructure you want to deploy them on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkPackageInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkPackageInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Network package ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * ID of the individual network package.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The metadata of the network package.
     * </p>
     */
    private ListSolNetworkPackageMetadata metadata;
    /**
     * <p>
     * Designer of the onboarded network service descriptor in the network package.
     * </p>
     */
    private String nsdDesigner;
    /**
     * <p>
     * ID of the network service descriptor on which the network package is based.
     * </p>
     */
    private String nsdId;
    /**
     * <p>
     * Identifies a network service descriptor in a version independent manner.
     * </p>
     */
    private String nsdInvariantId;
    /**
     * <p>
     * Name of the onboarded network service descriptor in the network package.
     * </p>
     */
    private String nsdName;
    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdOnboardingState;
    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdOperationalState;
    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdUsageState;
    /**
     * <p>
     * Version of the onboarded network service descriptor in the network package.
     * </p>
     */
    private String nsdVersion;
    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     */
    private java.util.List<String> vnfPkgIds;

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @param arn
     *        Network package ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @return Network package ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @param arn
     *        Network package ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * ID of the individual network package.
     * </p>
     * 
     * @param id
     *        ID of the individual network package.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the individual network package.
     * </p>
     * 
     * @return ID of the individual network package.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the individual network package.
     * </p>
     * 
     * @param id
     *        ID of the individual network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The metadata of the network package.
     * </p>
     * 
     * @param metadata
     *        The metadata of the network package.
     */

    public void setMetadata(ListSolNetworkPackageMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the network package.
     * </p>
     * 
     * @return The metadata of the network package.
     */

    public ListSolNetworkPackageMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the network package.
     * </p>
     * 
     * @param metadata
     *        The metadata of the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withMetadata(ListSolNetworkPackageMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Designer of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsdDesigner
     *        Designer of the onboarded network service descriptor in the network package.
     */

    public void setNsdDesigner(String nsdDesigner) {
        this.nsdDesigner = nsdDesigner;
    }

    /**
     * <p>
     * Designer of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @return Designer of the onboarded network service descriptor in the network package.
     */

    public String getNsdDesigner() {
        return this.nsdDesigner;
    }

    /**
     * <p>
     * Designer of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsdDesigner
     *        Designer of the onboarded network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withNsdDesigner(String nsdDesigner) {
        setNsdDesigner(nsdDesigner);
        return this;
    }

    /**
     * <p>
     * ID of the network service descriptor on which the network package is based.
     * </p>
     * 
     * @param nsdId
     *        ID of the network service descriptor on which the network package is based.
     */

    public void setNsdId(String nsdId) {
        this.nsdId = nsdId;
    }

    /**
     * <p>
     * ID of the network service descriptor on which the network package is based.
     * </p>
     * 
     * @return ID of the network service descriptor on which the network package is based.
     */

    public String getNsdId() {
        return this.nsdId;
    }

    /**
     * <p>
     * ID of the network service descriptor on which the network package is based.
     * </p>
     * 
     * @param nsdId
     *        ID of the network service descriptor on which the network package is based.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withNsdId(String nsdId) {
        setNsdId(nsdId);
        return this;
    }

    /**
     * <p>
     * Identifies a network service descriptor in a version independent manner.
     * </p>
     * 
     * @param nsdInvariantId
     *        Identifies a network service descriptor in a version independent manner.
     */

    public void setNsdInvariantId(String nsdInvariantId) {
        this.nsdInvariantId = nsdInvariantId;
    }

    /**
     * <p>
     * Identifies a network service descriptor in a version independent manner.
     * </p>
     * 
     * @return Identifies a network service descriptor in a version independent manner.
     */

    public String getNsdInvariantId() {
        return this.nsdInvariantId;
    }

    /**
     * <p>
     * Identifies a network service descriptor in a version independent manner.
     * </p>
     * 
     * @param nsdInvariantId
     *        Identifies a network service descriptor in a version independent manner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withNsdInvariantId(String nsdInvariantId) {
        setNsdInvariantId(nsdInvariantId);
        return this;
    }

    /**
     * <p>
     * Name of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsdName
     *        Name of the onboarded network service descriptor in the network package.
     */

    public void setNsdName(String nsdName) {
        this.nsdName = nsdName;
    }

    /**
     * <p>
     * Name of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @return Name of the onboarded network service descriptor in the network package.
     */

    public String getNsdName() {
        return this.nsdName;
    }

    /**
     * <p>
     * Name of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsdName
     *        Name of the onboarded network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withNsdName(String nsdName) {
        setNsdName(nsdName);
        return this;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Onboarding state of the network service descriptor in the network package.
     * @see NsdOnboardingState
     */

    public void setNsdOnboardingState(String nsdOnboardingState) {
        this.nsdOnboardingState = nsdOnboardingState;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Onboarding state of the network service descriptor in the network package.
     * @see NsdOnboardingState
     */

    public String getNsdOnboardingState() {
        return this.nsdOnboardingState;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Onboarding state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOnboardingState
     */

    public ListSolNetworkPackageInfo withNsdOnboardingState(String nsdOnboardingState) {
        setNsdOnboardingState(nsdOnboardingState);
        return this;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Onboarding state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOnboardingState
     */

    public ListSolNetworkPackageInfo withNsdOnboardingState(NsdOnboardingState nsdOnboardingState) {
        this.nsdOnboardingState = nsdOnboardingState.toString();
        return this;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @see NsdOperationalState
     */

    public void setNsdOperationalState(String nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Operational state of the network service descriptor in the network package.
     * @see NsdOperationalState
     */

    public String getNsdOperationalState() {
        return this.nsdOperationalState;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public ListSolNetworkPackageInfo withNsdOperationalState(String nsdOperationalState) {
        setNsdOperationalState(nsdOperationalState);
        return this;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public ListSolNetworkPackageInfo withNsdOperationalState(NsdOperationalState nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState.toString();
        return this;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdUsageState
     *        Usage state of the network service descriptor in the network package.
     * @see NsdUsageState
     */

    public void setNsdUsageState(String nsdUsageState) {
        this.nsdUsageState = nsdUsageState;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Usage state of the network service descriptor in the network package.
     * @see NsdUsageState
     */

    public String getNsdUsageState() {
        return this.nsdUsageState;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdUsageState
     *        Usage state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdUsageState
     */

    public ListSolNetworkPackageInfo withNsdUsageState(String nsdUsageState) {
        setNsdUsageState(nsdUsageState);
        return this;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdUsageState
     *        Usage state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdUsageState
     */

    public ListSolNetworkPackageInfo withNsdUsageState(NsdUsageState nsdUsageState) {
        this.nsdUsageState = nsdUsageState.toString();
        return this;
    }

    /**
     * <p>
     * Version of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsdVersion
     *        Version of the onboarded network service descriptor in the network package.
     */

    public void setNsdVersion(String nsdVersion) {
        this.nsdVersion = nsdVersion;
    }

    /**
     * <p>
     * Version of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @return Version of the onboarded network service descriptor in the network package.
     */

    public String getNsdVersion() {
        return this.nsdVersion;
    }

    /**
     * <p>
     * Version of the onboarded network service descriptor in the network package.
     * </p>
     * 
     * @param nsdVersion
     *        Version of the onboarded network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withNsdVersion(String nsdVersion) {
        setNsdVersion(nsdVersion);
        return this;
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * 
     * @return Identifies the function package for the function package descriptor referenced by the onboarded network
     *         package.
     */

    public java.util.List<String> getVnfPkgIds() {
        return vnfPkgIds;
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * 
     * @param vnfPkgIds
     *        Identifies the function package for the function package descriptor referenced by the onboarded network
     *        package.
     */

    public void setVnfPkgIds(java.util.Collection<String> vnfPkgIds) {
        if (vnfPkgIds == null) {
            this.vnfPkgIds = null;
            return;
        }

        this.vnfPkgIds = new java.util.ArrayList<String>(vnfPkgIds);
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVnfPkgIds(java.util.Collection)} or {@link #withVnfPkgIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vnfPkgIds
     *        Identifies the function package for the function package descriptor referenced by the onboarded network
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withVnfPkgIds(String... vnfPkgIds) {
        if (this.vnfPkgIds == null) {
            setVnfPkgIds(new java.util.ArrayList<String>(vnfPkgIds.length));
        }
        for (String ele : vnfPkgIds) {
            this.vnfPkgIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * 
     * @param vnfPkgIds
     *        Identifies the function package for the function package descriptor referenced by the onboarded network
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkPackageInfo withVnfPkgIds(java.util.Collection<String> vnfPkgIds) {
        setVnfPkgIds(vnfPkgIds);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsdDesigner() != null)
            sb.append("NsdDesigner: ").append(getNsdDesigner()).append(",");
        if (getNsdId() != null)
            sb.append("NsdId: ").append(getNsdId()).append(",");
        if (getNsdInvariantId() != null)
            sb.append("NsdInvariantId: ").append(getNsdInvariantId()).append(",");
        if (getNsdName() != null)
            sb.append("NsdName: ").append(getNsdName()).append(",");
        if (getNsdOnboardingState() != null)
            sb.append("NsdOnboardingState: ").append(getNsdOnboardingState()).append(",");
        if (getNsdOperationalState() != null)
            sb.append("NsdOperationalState: ").append(getNsdOperationalState()).append(",");
        if (getNsdUsageState() != null)
            sb.append("NsdUsageState: ").append(getNsdUsageState()).append(",");
        if (getNsdVersion() != null)
            sb.append("NsdVersion: ").append(getNsdVersion()).append(",");
        if (getVnfPkgIds() != null)
            sb.append("VnfPkgIds: ").append(getVnfPkgIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolNetworkPackageInfo == false)
            return false;
        ListSolNetworkPackageInfo other = (ListSolNetworkPackageInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsdDesigner() == null ^ this.getNsdDesigner() == null)
            return false;
        if (other.getNsdDesigner() != null && other.getNsdDesigner().equals(this.getNsdDesigner()) == false)
            return false;
        if (other.getNsdId() == null ^ this.getNsdId() == null)
            return false;
        if (other.getNsdId() != null && other.getNsdId().equals(this.getNsdId()) == false)
            return false;
        if (other.getNsdInvariantId() == null ^ this.getNsdInvariantId() == null)
            return false;
        if (other.getNsdInvariantId() != null && other.getNsdInvariantId().equals(this.getNsdInvariantId()) == false)
            return false;
        if (other.getNsdName() == null ^ this.getNsdName() == null)
            return false;
        if (other.getNsdName() != null && other.getNsdName().equals(this.getNsdName()) == false)
            return false;
        if (other.getNsdOnboardingState() == null ^ this.getNsdOnboardingState() == null)
            return false;
        if (other.getNsdOnboardingState() != null && other.getNsdOnboardingState().equals(this.getNsdOnboardingState()) == false)
            return false;
        if (other.getNsdOperationalState() == null ^ this.getNsdOperationalState() == null)
            return false;
        if (other.getNsdOperationalState() != null && other.getNsdOperationalState().equals(this.getNsdOperationalState()) == false)
            return false;
        if (other.getNsdUsageState() == null ^ this.getNsdUsageState() == null)
            return false;
        if (other.getNsdUsageState() != null && other.getNsdUsageState().equals(this.getNsdUsageState()) == false)
            return false;
        if (other.getNsdVersion() == null ^ this.getNsdVersion() == null)
            return false;
        if (other.getNsdVersion() != null && other.getNsdVersion().equals(this.getNsdVersion()) == false)
            return false;
        if (other.getVnfPkgIds() == null ^ this.getVnfPkgIds() == null)
            return false;
        if (other.getVnfPkgIds() != null && other.getVnfPkgIds().equals(this.getVnfPkgIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsdDesigner() == null) ? 0 : getNsdDesigner().hashCode());
        hashCode = prime * hashCode + ((getNsdId() == null) ? 0 : getNsdId().hashCode());
        hashCode = prime * hashCode + ((getNsdInvariantId() == null) ? 0 : getNsdInvariantId().hashCode());
        hashCode = prime * hashCode + ((getNsdName() == null) ? 0 : getNsdName().hashCode());
        hashCode = prime * hashCode + ((getNsdOnboardingState() == null) ? 0 : getNsdOnboardingState().hashCode());
        hashCode = prime * hashCode + ((getNsdOperationalState() == null) ? 0 : getNsdOperationalState().hashCode());
        hashCode = prime * hashCode + ((getNsdUsageState() == null) ? 0 : getNsdUsageState().hashCode());
        hashCode = prime * hashCode + ((getNsdVersion() == null) ? 0 : getNsdVersion().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgIds() == null) ? 0 : getVnfPkgIds().hashCode());
        return hashCode;
    }

    @Override
    public ListSolNetworkPackageInfo clone() {
        try {
            return (ListSolNetworkPackageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ListSolNetworkPackageInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
