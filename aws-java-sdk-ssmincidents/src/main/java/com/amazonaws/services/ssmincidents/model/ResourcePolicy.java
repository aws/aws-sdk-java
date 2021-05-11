/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource policy that allows Incident Manager to perform actions on resources on your behalf.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON blob that describes the policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The ID of the resource policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The Region that policy allows resources to be used in.
     * </p>
     */
    private String ramResourceShareRegion;

    /**
     * <p>
     * The JSON blob that describes the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON blob that describes the policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON blob that describes the policy.
     * </p>
     * 
     * @return The JSON blob that describes the policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON blob that describes the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON blob that describes the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The ID of the resource policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the resource policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the resource policy.
     * </p>
     * 
     * @return The ID of the resource policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the resource policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The Region that policy allows resources to be used in.
     * </p>
     * 
     * @param ramResourceShareRegion
     *        The Region that policy allows resources to be used in.
     */

    public void setRamResourceShareRegion(String ramResourceShareRegion) {
        this.ramResourceShareRegion = ramResourceShareRegion;
    }

    /**
     * <p>
     * The Region that policy allows resources to be used in.
     * </p>
     * 
     * @return The Region that policy allows resources to be used in.
     */

    public String getRamResourceShareRegion() {
        return this.ramResourceShareRegion;
    }

    /**
     * <p>
     * The Region that policy allows resources to be used in.
     * </p>
     * 
     * @param ramResourceShareRegion
     *        The Region that policy allows resources to be used in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withRamResourceShareRegion(String ramResourceShareRegion) {
        setRamResourceShareRegion(ramResourceShareRegion);
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
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getRamResourceShareRegion() != null)
            sb.append("RamResourceShareRegion: ").append(getRamResourceShareRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePolicy == false)
            return false;
        ResourcePolicy other = (ResourcePolicy) obj;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getRamResourceShareRegion() == null ^ this.getRamResourceShareRegion() == null)
            return false;
        if (other.getRamResourceShareRegion() != null && other.getRamResourceShareRegion().equals(this.getRamResourceShareRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getRamResourceShareRegion() == null) ? 0 : getRamResourceShareRegion().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePolicy clone() {
        try {
            return (ResourcePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ResourcePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
