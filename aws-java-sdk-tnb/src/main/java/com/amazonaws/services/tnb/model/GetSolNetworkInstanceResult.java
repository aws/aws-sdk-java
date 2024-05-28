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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network instance ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Network instance ID.
     * </p>
     */
    private String id;

    private LcmOperationInfo lcmOpInfo;

    private GetSolNetworkInstanceMetadata metadata;
    /**
     * <p>
     * Network instance description.
     * </p>
     */
    private String nsInstanceDescription;
    /**
     * <p>
     * Network instance name.
     * </p>
     */
    private String nsInstanceName;
    /**
     * <p>
     * Network instance state.
     * </p>
     */
    private String nsState;
    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     */
    private String nsdId;
    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     */
    private String nsdInfoId;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @param arn
     *        Network instance ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @return Network instance ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @param arn
     *        Network instance ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param id
     *        Network instance ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @return Network instance ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param id
     *        Network instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param lcmOpInfo
     */

    public void setLcmOpInfo(LcmOperationInfo lcmOpInfo) {
        this.lcmOpInfo = lcmOpInfo;
    }

    /**
     * @return
     */

    public LcmOperationInfo getLcmOpInfo() {
        return this.lcmOpInfo;
    }

    /**
     * @param lcmOpInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withLcmOpInfo(LcmOperationInfo lcmOpInfo) {
        setLcmOpInfo(lcmOpInfo);
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(GetSolNetworkInstanceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public GetSolNetworkInstanceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withMetadata(GetSolNetworkInstanceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Network instance description.
     * </p>
     * 
     * @param nsInstanceDescription
     *        Network instance description.
     */

    public void setNsInstanceDescription(String nsInstanceDescription) {
        this.nsInstanceDescription = nsInstanceDescription;
    }

    /**
     * <p>
     * Network instance description.
     * </p>
     * 
     * @return Network instance description.
     */

    public String getNsInstanceDescription() {
        return this.nsInstanceDescription;
    }

    /**
     * <p>
     * Network instance description.
     * </p>
     * 
     * @param nsInstanceDescription
     *        Network instance description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withNsInstanceDescription(String nsInstanceDescription) {
        setNsInstanceDescription(nsInstanceDescription);
        return this;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @param nsInstanceName
     *        Network instance name.
     */

    public void setNsInstanceName(String nsInstanceName) {
        this.nsInstanceName = nsInstanceName;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @return Network instance name.
     */

    public String getNsInstanceName() {
        return this.nsInstanceName;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @param nsInstanceName
     *        Network instance name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withNsInstanceName(String nsInstanceName) {
        setNsInstanceName(nsInstanceName);
        return this;
    }

    /**
     * <p>
     * Network instance state.
     * </p>
     * 
     * @param nsState
     *        Network instance state.
     * @see NsState
     */

    public void setNsState(String nsState) {
        this.nsState = nsState;
    }

    /**
     * <p>
     * Network instance state.
     * </p>
     * 
     * @return Network instance state.
     * @see NsState
     */

    public String getNsState() {
        return this.nsState;
    }

    /**
     * <p>
     * Network instance state.
     * </p>
     * 
     * @param nsState
     *        Network instance state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsState
     */

    public GetSolNetworkInstanceResult withNsState(String nsState) {
        setNsState(nsState);
        return this;
    }

    /**
     * <p>
     * Network instance state.
     * </p>
     * 
     * @param nsState
     *        Network instance state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsState
     */

    public GetSolNetworkInstanceResult withNsState(NsState nsState) {
        this.nsState = nsState.toString();
        return this;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdId
     *        Network service descriptor ID.
     */

    public void setNsdId(String nsdId) {
        this.nsdId = nsdId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @return Network service descriptor ID.
     */

    public String getNsdId() {
        return this.nsdId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdId
     *        Network service descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withNsdId(String nsdId) {
        setNsdId(nsdId);
        return this;
    }

    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     * 
     * @param nsdInfoId
     *        Network service descriptor info ID.
     */

    public void setNsdInfoId(String nsdInfoId) {
        this.nsdInfoId = nsdInfoId;
    }

    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     * 
     * @return Network service descriptor info ID.
     */

    public String getNsdInfoId() {
        return this.nsdInfoId;
    }

    /**
     * <p>
     * Network service descriptor info ID.
     * </p>
     * 
     * @param nsdInfoId
     *        Network service descriptor info ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult withNsdInfoId(String nsdInfoId) {
        setNsdInfoId(nsdInfoId);
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

    public GetSolNetworkInstanceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSolNetworkInstanceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkInstanceResult addTagsEntry(String key, String value) {
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

    public GetSolNetworkInstanceResult clearTagsEntries() {
        this.tags = null;
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
        if (getLcmOpInfo() != null)
            sb.append("LcmOpInfo: ").append(getLcmOpInfo()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsInstanceDescription() != null)
            sb.append("NsInstanceDescription: ").append(getNsInstanceDescription()).append(",");
        if (getNsInstanceName() != null)
            sb.append("NsInstanceName: ").append(getNsInstanceName()).append(",");
        if (getNsState() != null)
            sb.append("NsState: ").append(getNsState()).append(",");
        if (getNsdId() != null)
            sb.append("NsdId: ").append(getNsdId()).append(",");
        if (getNsdInfoId() != null)
            sb.append("NsdInfoId: ").append(getNsdInfoId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolNetworkInstanceResult == false)
            return false;
        GetSolNetworkInstanceResult other = (GetSolNetworkInstanceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLcmOpInfo() == null ^ this.getLcmOpInfo() == null)
            return false;
        if (other.getLcmOpInfo() != null && other.getLcmOpInfo().equals(this.getLcmOpInfo()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsInstanceDescription() == null ^ this.getNsInstanceDescription() == null)
            return false;
        if (other.getNsInstanceDescription() != null && other.getNsInstanceDescription().equals(this.getNsInstanceDescription()) == false)
            return false;
        if (other.getNsInstanceName() == null ^ this.getNsInstanceName() == null)
            return false;
        if (other.getNsInstanceName() != null && other.getNsInstanceName().equals(this.getNsInstanceName()) == false)
            return false;
        if (other.getNsState() == null ^ this.getNsState() == null)
            return false;
        if (other.getNsState() != null && other.getNsState().equals(this.getNsState()) == false)
            return false;
        if (other.getNsdId() == null ^ this.getNsdId() == null)
            return false;
        if (other.getNsdId() != null && other.getNsdId().equals(this.getNsdId()) == false)
            return false;
        if (other.getNsdInfoId() == null ^ this.getNsdInfoId() == null)
            return false;
        if (other.getNsdInfoId() != null && other.getNsdInfoId().equals(this.getNsdInfoId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLcmOpInfo() == null) ? 0 : getLcmOpInfo().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceDescription() == null) ? 0 : getNsInstanceDescription().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceName() == null) ? 0 : getNsInstanceName().hashCode());
        hashCode = prime * hashCode + ((getNsState() == null) ? 0 : getNsState().hashCode());
        hashCode = prime * hashCode + ((getNsdId() == null) ? 0 : getNsdId().hashCode());
        hashCode = prime * hashCode + ((getNsdInfoId() == null) ? 0 : getNsdInfoId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetSolNetworkInstanceResult clone() {
        try {
            return (GetSolNetworkInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
