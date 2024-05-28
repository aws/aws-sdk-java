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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes an application to which a principal is assigned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ApplicationAssignmentForPrincipal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationAssignmentForPrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the application to which the specified principal is assigned.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The unique identifier of the principal assigned to the application.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The type of the principal assigned to the application.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The ARN of the application to which the specified principal is assigned.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application to which the specified principal is assigned.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the application to which the specified principal is assigned.
     * </p>
     * 
     * @return The ARN of the application to which the specified principal is assigned.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the application to which the specified principal is assigned.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application to which the specified principal is assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAssignmentForPrincipal withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the principal assigned to the application.
     * </p>
     * 
     * @param principalId
     *        The unique identifier of the principal assigned to the application.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The unique identifier of the principal assigned to the application.
     * </p>
     * 
     * @return The unique identifier of the principal assigned to the application.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The unique identifier of the principal assigned to the application.
     * </p>
     * 
     * @param principalId
     *        The unique identifier of the principal assigned to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationAssignmentForPrincipal withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The type of the principal assigned to the application.
     * </p>
     * 
     * @param principalType
     *        The type of the principal assigned to the application.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The type of the principal assigned to the application.
     * </p>
     * 
     * @return The type of the principal assigned to the application.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The type of the principal assigned to the application.
     * </p>
     * 
     * @param principalType
     *        The type of the principal assigned to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public ApplicationAssignmentForPrincipal withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The type of the principal assigned to the application.
     * </p>
     * 
     * @param principalType
     *        The type of the principal assigned to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public ApplicationAssignmentForPrincipal withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationAssignmentForPrincipal == false)
            return false;
        ApplicationAssignmentForPrincipal other = (ApplicationAssignmentForPrincipal) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationAssignmentForPrincipal clone() {
        try {
            return (ApplicationAssignmentForPrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.ApplicationAssignmentForPrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
