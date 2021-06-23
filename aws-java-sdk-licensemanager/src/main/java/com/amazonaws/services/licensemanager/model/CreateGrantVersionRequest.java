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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrantVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGrantVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     */
    private String grantArn;
    /**
     * <p>
     * Grant name.
     * </p>
     */
    private String grantName;
    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     */
    private java.util.List<String> allowedOperations;
    /**
     * <p>
     * Grant status.
     * </p>
     */
    private String status;

    private String statusReason;
    /**
     * <p>
     * Current version of the grant.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     * 
     * @param grantArn
     *        Amazon Resource Name (ARN) of the grant.
     */

    public void setGrantArn(String grantArn) {
        this.grantArn = grantArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the grant.
     */

    public String getGrantArn() {
        return this.grantArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     * 
     * @param grantArn
     *        Amazon Resource Name (ARN) of the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantVersionRequest withGrantArn(String grantArn) {
        setGrantArn(grantArn);
        return this;
    }

    /**
     * <p>
     * Grant name.
     * </p>
     * 
     * @param grantName
     *        Grant name.
     */

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    /**
     * <p>
     * Grant name.
     * </p>
     * 
     * @return Grant name.
     */

    public String getGrantName() {
        return this.grantName;
    }

    /**
     * <p>
     * Grant name.
     * </p>
     * 
     * @param grantName
     *        Grant name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantVersionRequest withGrantName(String grantName) {
        setGrantName(grantName);
        return this;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @return Allowed operations for the grant.
     * @see AllowedOperation
     */

    public java.util.List<String> getAllowedOperations() {
        return allowedOperations;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @see AllowedOperation
     */

    public void setAllowedOperations(java.util.Collection<String> allowedOperations) {
        if (allowedOperations == null) {
            this.allowedOperations = null;
            return;
        }

        this.allowedOperations = new java.util.ArrayList<String>(allowedOperations);
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOperations(java.util.Collection)} or {@link #withAllowedOperations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public CreateGrantVersionRequest withAllowedOperations(String... allowedOperations) {
        if (this.allowedOperations == null) {
            setAllowedOperations(new java.util.ArrayList<String>(allowedOperations.length));
        }
        for (String ele : allowedOperations) {
            this.allowedOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public CreateGrantVersionRequest withAllowedOperations(java.util.Collection<String> allowedOperations) {
        setAllowedOperations(allowedOperations);
        return this;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public CreateGrantVersionRequest withAllowedOperations(AllowedOperation... allowedOperations) {
        java.util.ArrayList<String> allowedOperationsCopy = new java.util.ArrayList<String>(allowedOperations.length);
        for (AllowedOperation value : allowedOperations) {
            allowedOperationsCopy.add(value.toString());
        }
        if (getAllowedOperations() == null) {
            setAllowedOperations(allowedOperationsCopy);
        } else {
            getAllowedOperations().addAll(allowedOperationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param status
     *        Grant status.
     * @see GrantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @return Grant status.
     * @see GrantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param status
     *        Grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantStatus
     */

    public CreateGrantVersionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param status
     *        Grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantStatus
     */

    public CreateGrantVersionRequest withStatus(GrantStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param statusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * @return
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @param statusReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantVersionRequest withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Current version of the grant.
     * </p>
     * 
     * @param sourceVersion
     *        Current version of the grant.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * Current version of the grant.
     * </p>
     * 
     * @return Current version of the grant.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * Current version of the grant.
     * </p>
     * 
     * @param sourceVersion
     *        Current version of the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantVersionRequest withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getGrantArn() != null)
            sb.append("GrantArn: ").append(getGrantArn()).append(",");
        if (getGrantName() != null)
            sb.append("GrantName: ").append(getGrantName()).append(",");
        if (getAllowedOperations() != null)
            sb.append("AllowedOperations: ").append(getAllowedOperations()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGrantVersionRequest == false)
            return false;
        CreateGrantVersionRequest other = (CreateGrantVersionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getGrantArn() == null ^ this.getGrantArn() == null)
            return false;
        if (other.getGrantArn() != null && other.getGrantArn().equals(this.getGrantArn()) == false)
            return false;
        if (other.getGrantName() == null ^ this.getGrantName() == null)
            return false;
        if (other.getGrantName() != null && other.getGrantName().equals(this.getGrantName()) == false)
            return false;
        if (other.getAllowedOperations() == null ^ this.getAllowedOperations() == null)
            return false;
        if (other.getAllowedOperations() != null && other.getAllowedOperations().equals(this.getAllowedOperations()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getGrantArn() == null) ? 0 : getGrantArn().hashCode());
        hashCode = prime * hashCode + ((getGrantName() == null) ? 0 : getGrantName().hashCode());
        hashCode = prime * hashCode + ((getAllowedOperations() == null) ? 0 : getAllowedOperations().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateGrantVersionRequest clone() {
        return (CreateGrantVersionRequest) super.clone();
    }

}
