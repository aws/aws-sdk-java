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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network function instance ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Network function instance ID.
     * </p>
     */
    private String id;

    private GetSolVnfInfo instantiatedVnfInfo;
    /**
     * <p>
     * Network function instantiation state.
     * </p>
     */
    private String instantiationState;

    private GetSolFunctionInstanceMetadata metadata;
    /**
     * <p>
     * Network instance ID.
     * </p>
     */
    private String nsInstanceId;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Function package ID.
     * </p>
     */
    private String vnfPkgId;
    /**
     * <p>
     * Network function product name.
     * </p>
     */
    private String vnfProductName;
    /**
     * <p>
     * Network function provider.
     * </p>
     */
    private String vnfProvider;
    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     */
    private String vnfdId;
    /**
     * <p>
     * Function package descriptor version.
     * </p>
     */
    private String vnfdVersion;

    /**
     * <p>
     * Network function instance ARN.
     * </p>
     * 
     * @param arn
     *        Network function instance ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network function instance ARN.
     * </p>
     * 
     * @return Network function instance ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network function instance ARN.
     * </p>
     * 
     * @param arn
     *        Network function instance ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Network function instance ID.
     * </p>
     * 
     * @param id
     *        Network function instance ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Network function instance ID.
     * </p>
     * 
     * @return Network function instance ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Network function instance ID.
     * </p>
     * 
     * @param id
     *        Network function instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param instantiatedVnfInfo
     */

    public void setInstantiatedVnfInfo(GetSolVnfInfo instantiatedVnfInfo) {
        this.instantiatedVnfInfo = instantiatedVnfInfo;
    }

    /**
     * @return
     */

    public GetSolVnfInfo getInstantiatedVnfInfo() {
        return this.instantiatedVnfInfo;
    }

    /**
     * @param instantiatedVnfInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withInstantiatedVnfInfo(GetSolVnfInfo instantiatedVnfInfo) {
        setInstantiatedVnfInfo(instantiatedVnfInfo);
        return this;
    }

    /**
     * <p>
     * Network function instantiation state.
     * </p>
     * 
     * @param instantiationState
     *        Network function instantiation state.
     * @see VnfInstantiationState
     */

    public void setInstantiationState(String instantiationState) {
        this.instantiationState = instantiationState;
    }

    /**
     * <p>
     * Network function instantiation state.
     * </p>
     * 
     * @return Network function instantiation state.
     * @see VnfInstantiationState
     */

    public String getInstantiationState() {
        return this.instantiationState;
    }

    /**
     * <p>
     * Network function instantiation state.
     * </p>
     * 
     * @param instantiationState
     *        Network function instantiation state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfInstantiationState
     */

    public GetSolFunctionInstanceResult withInstantiationState(String instantiationState) {
        setInstantiationState(instantiationState);
        return this;
    }

    /**
     * <p>
     * Network function instantiation state.
     * </p>
     * 
     * @param instantiationState
     *        Network function instantiation state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfInstantiationState
     */

    public GetSolFunctionInstanceResult withInstantiationState(VnfInstantiationState instantiationState) {
        this.instantiationState = instantiationState.toString();
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(GetSolFunctionInstanceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public GetSolFunctionInstanceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withMetadata(GetSolFunctionInstanceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param nsInstanceId
     *        Network instance ID.
     */

    public void setNsInstanceId(String nsInstanceId) {
        this.nsInstanceId = nsInstanceId;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @return Network instance ID.
     */

    public String getNsInstanceId() {
        return this.nsInstanceId;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param nsInstanceId
     *        Network instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
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

    public java.util.Map<String, String> getTags() {
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

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
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

    public GetSolFunctionInstanceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSolFunctionInstanceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @param vnfPkgId
     *        Function package ID.
     */

    public void setVnfPkgId(String vnfPkgId) {
        this.vnfPkgId = vnfPkgId;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @return Function package ID.
     */

    public String getVnfPkgId() {
        return this.vnfPkgId;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @param vnfPkgId
     *        Function package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withVnfPkgId(String vnfPkgId) {
        setVnfPkgId(vnfPkgId);
        return this;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @param vnfProductName
     *        Network function product name.
     */

    public void setVnfProductName(String vnfProductName) {
        this.vnfProductName = vnfProductName;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @return Network function product name.
     */

    public String getVnfProductName() {
        return this.vnfProductName;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @param vnfProductName
     *        Network function product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withVnfProductName(String vnfProductName) {
        setVnfProductName(vnfProductName);
        return this;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @param vnfProvider
     *        Network function provider.
     */

    public void setVnfProvider(String vnfProvider) {
        this.vnfProvider = vnfProvider;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @return Network function provider.
     */

    public String getVnfProvider() {
        return this.vnfProvider;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @param vnfProvider
     *        Network function provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withVnfProvider(String vnfProvider) {
        setVnfProvider(vnfProvider);
        return this;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @param vnfdId
     *        Function package descriptor ID.
     */

    public void setVnfdId(String vnfdId) {
        this.vnfdId = vnfdId;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @return Function package descriptor ID.
     */

    public String getVnfdId() {
        return this.vnfdId;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @param vnfdId
     *        Function package descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withVnfdId(String vnfdId) {
        setVnfdId(vnfdId);
        return this;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @param vnfdVersion
     *        Function package descriptor version.
     */

    public void setVnfdVersion(String vnfdVersion) {
        this.vnfdVersion = vnfdVersion;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @return Function package descriptor version.
     */

    public String getVnfdVersion() {
        return this.vnfdVersion;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @param vnfdVersion
     *        Function package descriptor version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionInstanceResult withVnfdVersion(String vnfdVersion) {
        setVnfdVersion(vnfdVersion);
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
        if (getInstantiatedVnfInfo() != null)
            sb.append("InstantiatedVnfInfo: ").append(getInstantiatedVnfInfo()).append(",");
        if (getInstantiationState() != null)
            sb.append("InstantiationState: ").append(getInstantiationState()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsInstanceId() != null)
            sb.append("NsInstanceId: ").append(getNsInstanceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getVnfPkgId() != null)
            sb.append("VnfPkgId: ").append(getVnfPkgId()).append(",");
        if (getVnfProductName() != null)
            sb.append("VnfProductName: ").append(getVnfProductName()).append(",");
        if (getVnfProvider() != null)
            sb.append("VnfProvider: ").append(getVnfProvider()).append(",");
        if (getVnfdId() != null)
            sb.append("VnfdId: ").append(getVnfdId()).append(",");
        if (getVnfdVersion() != null)
            sb.append("VnfdVersion: ").append(getVnfdVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolFunctionInstanceResult == false)
            return false;
        GetSolFunctionInstanceResult other = (GetSolFunctionInstanceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInstantiatedVnfInfo() == null ^ this.getInstantiatedVnfInfo() == null)
            return false;
        if (other.getInstantiatedVnfInfo() != null && other.getInstantiatedVnfInfo().equals(this.getInstantiatedVnfInfo()) == false)
            return false;
        if (other.getInstantiationState() == null ^ this.getInstantiationState() == null)
            return false;
        if (other.getInstantiationState() != null && other.getInstantiationState().equals(this.getInstantiationState()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsInstanceId() == null ^ this.getNsInstanceId() == null)
            return false;
        if (other.getNsInstanceId() != null && other.getNsInstanceId().equals(this.getNsInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVnfPkgId() == null ^ this.getVnfPkgId() == null)
            return false;
        if (other.getVnfPkgId() != null && other.getVnfPkgId().equals(this.getVnfPkgId()) == false)
            return false;
        if (other.getVnfProductName() == null ^ this.getVnfProductName() == null)
            return false;
        if (other.getVnfProductName() != null && other.getVnfProductName().equals(this.getVnfProductName()) == false)
            return false;
        if (other.getVnfProvider() == null ^ this.getVnfProvider() == null)
            return false;
        if (other.getVnfProvider() != null && other.getVnfProvider().equals(this.getVnfProvider()) == false)
            return false;
        if (other.getVnfdId() == null ^ this.getVnfdId() == null)
            return false;
        if (other.getVnfdId() != null && other.getVnfdId().equals(this.getVnfdId()) == false)
            return false;
        if (other.getVnfdVersion() == null ^ this.getVnfdVersion() == null)
            return false;
        if (other.getVnfdVersion() != null && other.getVnfdVersion().equals(this.getVnfdVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInstantiatedVnfInfo() == null) ? 0 : getInstantiatedVnfInfo().hashCode());
        hashCode = prime * hashCode + ((getInstantiationState() == null) ? 0 : getInstantiationState().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceId() == null) ? 0 : getNsInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgId() == null) ? 0 : getVnfPkgId().hashCode());
        hashCode = prime * hashCode + ((getVnfProductName() == null) ? 0 : getVnfProductName().hashCode());
        hashCode = prime * hashCode + ((getVnfProvider() == null) ? 0 : getVnfProvider().hashCode());
        hashCode = prime * hashCode + ((getVnfdId() == null) ? 0 : getVnfdId().hashCode());
        hashCode = prime * hashCode + ((getVnfdVersion() == null) ? 0 : getVnfdVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetSolFunctionInstanceResult clone() {
        try {
            return (GetSolFunctionInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
