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
 * Lists information about a network function instance.
 * </p>
 * <p>
 * A network function instance is a function in a function package .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionInstanceInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolFunctionInstanceInfo implements Serializable, Cloneable, StructuredPojo {

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

    private GetSolInstantiatedVnfInfo instantiatedVnfInfo;
    /**
     * <p>
     * Network function instance instantiation state.
     * </p>
     */
    private String instantiationState;
    /**
     * <p>
     * Network function instance metadata.
     * </p>
     */
    private ListSolFunctionInstanceMetadata metadata;
    /**
     * <p>
     * Network instance ID.
     * </p>
     */
    private String nsInstanceId;
    /**
     * <p>
     * Function package ID.
     * </p>
     */
    private String vnfPkgId;
    /**
     * <p>
     * Function package name.
     * </p>
     */
    private String vnfPkgName;

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

    public ListSolFunctionInstanceInfo withArn(String arn) {
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

    public ListSolFunctionInstanceInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param instantiatedVnfInfo
     */

    public void setInstantiatedVnfInfo(GetSolInstantiatedVnfInfo instantiatedVnfInfo) {
        this.instantiatedVnfInfo = instantiatedVnfInfo;
    }

    /**
     * @return
     */

    public GetSolInstantiatedVnfInfo getInstantiatedVnfInfo() {
        return this.instantiatedVnfInfo;
    }

    /**
     * @param instantiatedVnfInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionInstanceInfo withInstantiatedVnfInfo(GetSolInstantiatedVnfInfo instantiatedVnfInfo) {
        setInstantiatedVnfInfo(instantiatedVnfInfo);
        return this;
    }

    /**
     * <p>
     * Network function instance instantiation state.
     * </p>
     * 
     * @param instantiationState
     *        Network function instance instantiation state.
     * @see VnfInstantiationState
     */

    public void setInstantiationState(String instantiationState) {
        this.instantiationState = instantiationState;
    }

    /**
     * <p>
     * Network function instance instantiation state.
     * </p>
     * 
     * @return Network function instance instantiation state.
     * @see VnfInstantiationState
     */

    public String getInstantiationState() {
        return this.instantiationState;
    }

    /**
     * <p>
     * Network function instance instantiation state.
     * </p>
     * 
     * @param instantiationState
     *        Network function instance instantiation state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfInstantiationState
     */

    public ListSolFunctionInstanceInfo withInstantiationState(String instantiationState) {
        setInstantiationState(instantiationState);
        return this;
    }

    /**
     * <p>
     * Network function instance instantiation state.
     * </p>
     * 
     * @param instantiationState
     *        Network function instance instantiation state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VnfInstantiationState
     */

    public ListSolFunctionInstanceInfo withInstantiationState(VnfInstantiationState instantiationState) {
        this.instantiationState = instantiationState.toString();
        return this;
    }

    /**
     * <p>
     * Network function instance metadata.
     * </p>
     * 
     * @param metadata
     *        Network function instance metadata.
     */

    public void setMetadata(ListSolFunctionInstanceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Network function instance metadata.
     * </p>
     * 
     * @return Network function instance metadata.
     */

    public ListSolFunctionInstanceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Network function instance metadata.
     * </p>
     * 
     * @param metadata
     *        Network function instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionInstanceInfo withMetadata(ListSolFunctionInstanceMetadata metadata) {
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

    public ListSolFunctionInstanceInfo withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
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

    public ListSolFunctionInstanceInfo withVnfPkgId(String vnfPkgId) {
        setVnfPkgId(vnfPkgId);
        return this;
    }

    /**
     * <p>
     * Function package name.
     * </p>
     * 
     * @param vnfPkgName
     *        Function package name.
     */

    public void setVnfPkgName(String vnfPkgName) {
        this.vnfPkgName = vnfPkgName;
    }

    /**
     * <p>
     * Function package name.
     * </p>
     * 
     * @return Function package name.
     */

    public String getVnfPkgName() {
        return this.vnfPkgName;
    }

    /**
     * <p>
     * Function package name.
     * </p>
     * 
     * @param vnfPkgName
     *        Function package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionInstanceInfo withVnfPkgName(String vnfPkgName) {
        setVnfPkgName(vnfPkgName);
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
        if (getVnfPkgId() != null)
            sb.append("VnfPkgId: ").append(getVnfPkgId()).append(",");
        if (getVnfPkgName() != null)
            sb.append("VnfPkgName: ").append(getVnfPkgName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolFunctionInstanceInfo == false)
            return false;
        ListSolFunctionInstanceInfo other = (ListSolFunctionInstanceInfo) obj;
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
        if (other.getVnfPkgId() == null ^ this.getVnfPkgId() == null)
            return false;
        if (other.getVnfPkgId() != null && other.getVnfPkgId().equals(this.getVnfPkgId()) == false)
            return false;
        if (other.getVnfPkgName() == null ^ this.getVnfPkgName() == null)
            return false;
        if (other.getVnfPkgName() != null && other.getVnfPkgName().equals(this.getVnfPkgName()) == false)
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
        hashCode = prime * hashCode + ((getVnfPkgId() == null) ? 0 : getVnfPkgId().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgName() == null) ? 0 : getVnfPkgName().hashCode());
        return hashCode;
    }

    @Override
    public ListSolFunctionInstanceInfo clone() {
        try {
            return (ListSolFunctionInstanceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ListSolFunctionInstanceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
