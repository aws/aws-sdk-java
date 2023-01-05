/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error associated with a resource returned for a Get or List resource response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ErrorResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the resource owner.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Additional details about the error.
     * </p>
     */
    private java.util.Map<String, String> additionalDetails;
    /**
     * <p>
     * The error code associated with the error.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The message associated with the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The Amazon Web Services account ID of the resource owner.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the resource owner.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the resource owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the resource owner.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the resource owner.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the resource owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Additional details about the error.
     * </p>
     * 
     * @return Additional details about the error.
     */

    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * <p>
     * Additional details about the error.
     * </p>
     * 
     * @param additionalDetails
     *        Additional details about the error.
     */

    public void setAdditionalDetails(java.util.Map<String, String> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    /**
     * <p>
     * Additional details about the error.
     * </p>
     * 
     * @param additionalDetails
     *        Additional details about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorResponse withAdditionalDetails(java.util.Map<String, String> additionalDetails) {
        setAdditionalDetails(additionalDetails);
        return this;
    }

    /**
     * Add a single AdditionalDetails entry
     *
     * @see ErrorResponse#withAdditionalDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ErrorResponse addAdditionalDetailsEntry(String key, String value) {
        if (null == this.additionalDetails) {
            this.additionalDetails = new java.util.HashMap<String, String>();
        }
        if (this.additionalDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorResponse clearAdditionalDetailsEntries() {
        this.additionalDetails = null;
        return this;
    }

    /**
     * <p>
     * The error code associated with the error.
     * </p>
     * 
     * @param code
     *        The error code associated with the error.
     * @see ErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code associated with the error.
     * </p>
     * 
     * @return The error code associated with the error.
     * @see ErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code associated with the error.
     * </p>
     * 
     * @param code
     *        The error code associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorResponse withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code associated with the error.
     * </p>
     * 
     * @param code
     *        The error code associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorResponse withCode(ErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @param message
     *        The message associated with the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @return The message associated with the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * 
     * @param message
     *        The message associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorResponse withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ID of the resource.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorResponse withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @see ErrorResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     * @see ErrorResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorResourceType
     */

    public ErrorResponse withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorResourceType
     */

    public ErrorResponse withResourceType(ErrorResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAdditionalDetails() != null)
            sb.append("AdditionalDetails: ").append(getAdditionalDetails()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorResponse == false)
            return false;
        ErrorResponse other = (ErrorResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAdditionalDetails() == null ^ this.getAdditionalDetails() == null)
            return false;
        if (other.getAdditionalDetails() != null && other.getAdditionalDetails().equals(this.getAdditionalDetails()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDetails() == null) ? 0 : getAdditionalDetails().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ErrorResponse clone() {
        try {
            return (ErrorResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.ErrorResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
