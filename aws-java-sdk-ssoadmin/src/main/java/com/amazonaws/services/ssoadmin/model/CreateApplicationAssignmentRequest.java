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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplicationAssignment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationAssignmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity Center, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center Identity Store API
     * Reference</a>.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application provider under which the operation will run.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     * 
     * @return The ARN of the application provider under which the operation will run.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the application provider under which the operation will run.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application provider under which the operation will run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationAssignmentRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity Center, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center Identity Store API
     * Reference</a>.
     * </p>
     * 
     * @param principalId
     *        An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For
     *        example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity
     *        Center, see the <a href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center
     *        Identity Store API Reference</a>.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity Center, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center Identity Store API
     * Reference</a>.
     * </p>
     * 
     * @return An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For
     *         example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity
     *         Center, see the <a href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center
     *         Identity Store API Reference</a>.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For example,
     * f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity Center, see the <a
     * href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center Identity Store API
     * Reference</a>.
     * </p>
     * 
     * @param principalId
     *        An identifier for an object in IAM Identity Center, such as a user or group. PrincipalIds are GUIDs (For
     *        example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in IAM Identity
     *        Center, see the <a href="/singlesignon/latest/IdentityStoreAPIReference/welcome.html">IAM Identity Center
     *        Identity Store API Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationAssignmentRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be created.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @return The entity type for which the assignment will be created.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public CreateApplicationAssignmentRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param principalType
     *        The entity type for which the assignment will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public CreateApplicationAssignmentRequest withPrincipalType(PrincipalType principalType) {
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

        if (obj instanceof CreateApplicationAssignmentRequest == false)
            return false;
        CreateApplicationAssignmentRequest other = (CreateApplicationAssignmentRequest) obj;
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
    public CreateApplicationAssignmentRequest clone() {
        return (CreateApplicationAssignmentRequest) super.clone();
    }

}
