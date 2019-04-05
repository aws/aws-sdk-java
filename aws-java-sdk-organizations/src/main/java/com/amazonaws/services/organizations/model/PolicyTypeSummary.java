/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a policy type and its status in the associated root.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/PolicyTypeSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyTypeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the policy type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a
     * root or to an OU or account in that root, it must be available in the organization and enabled for that root.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param type
     *        The name of the policy type.
     * @see PolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @return The name of the policy type.
     * @see PolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param type
     *        The name of the policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyTypeSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param type
     *        The name of the policy type.
     * @see PolicyType
     */

    public void setType(PolicyType type) {
        withType(type);
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param type
     *        The name of the policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyTypeSummary withType(PolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a
     * root or to an OU or account in that root, it must be available in the organization and enabled for that root.
     * </p>
     * 
     * @param status
     *        The status of the policy type as it relates to the associated root. To attach a policy of the specified
     *        type to a root or to an OU or account in that root, it must be available in the organization and enabled
     *        for that root.
     * @see PolicyTypeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a
     * root or to an OU or account in that root, it must be available in the organization and enabled for that root.
     * </p>
     * 
     * @return The status of the policy type as it relates to the associated root. To attach a policy of the specified
     *         type to a root or to an OU or account in that root, it must be available in the organization and enabled
     *         for that root.
     * @see PolicyTypeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a
     * root or to an OU or account in that root, it must be available in the organization and enabled for that root.
     * </p>
     * 
     * @param status
     *        The status of the policy type as it relates to the associated root. To attach a policy of the specified
     *        type to a root or to an OU or account in that root, it must be available in the organization and enabled
     *        for that root.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyTypeStatus
     */

    public PolicyTypeSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a
     * root or to an OU or account in that root, it must be available in the organization and enabled for that root.
     * </p>
     * 
     * @param status
     *        The status of the policy type as it relates to the associated root. To attach a policy of the specified
     *        type to a root or to an OU or account in that root, it must be available in the organization and enabled
     *        for that root.
     * @see PolicyTypeStatus
     */

    public void setStatus(PolicyTypeStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a
     * root or to an OU or account in that root, it must be available in the organization and enabled for that root.
     * </p>
     * 
     * @param status
     *        The status of the policy type as it relates to the associated root. To attach a policy of the specified
     *        type to a root or to an OU or account in that root, it must be available in the organization and enabled
     *        for that root.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyTypeStatus
     */

    public PolicyTypeSummary withStatus(PolicyTypeStatus status) {
        this.status = status.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTypeSummary == false)
            return false;
        PolicyTypeSummary other = (PolicyTypeSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PolicyTypeSummary clone() {
        try {
            return (PolicyTypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.PolicyTypeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
