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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DeleteDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the Amazon Web Services domain that is to be deleted.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Specifies the optional flag to delete all child entities within the domain.
     * </p>
     */
    private Boolean skipDeletionCheck;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services domain that is to be deleted.
     * </p>
     * 
     * @param identifier
     *        The identifier of the Amazon Web Services domain that is to be deleted.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services domain that is to be deleted.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services domain that is to be deleted.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services domain that is to be deleted.
     * </p>
     * 
     * @param identifier
     *        The identifier of the Amazon Web Services domain that is to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Specifies the optional flag to delete all child entities within the domain.
     * </p>
     * 
     * @param skipDeletionCheck
     *        Specifies the optional flag to delete all child entities within the domain.
     */

    public void setSkipDeletionCheck(Boolean skipDeletionCheck) {
        this.skipDeletionCheck = skipDeletionCheck;
    }

    /**
     * <p>
     * Specifies the optional flag to delete all child entities within the domain.
     * </p>
     * 
     * @return Specifies the optional flag to delete all child entities within the domain.
     */

    public Boolean getSkipDeletionCheck() {
        return this.skipDeletionCheck;
    }

    /**
     * <p>
     * Specifies the optional flag to delete all child entities within the domain.
     * </p>
     * 
     * @param skipDeletionCheck
     *        Specifies the optional flag to delete all child entities within the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainRequest withSkipDeletionCheck(Boolean skipDeletionCheck) {
        setSkipDeletionCheck(skipDeletionCheck);
        return this;
    }

    /**
     * <p>
     * Specifies the optional flag to delete all child entities within the domain.
     * </p>
     * 
     * @return Specifies the optional flag to delete all child entities within the domain.
     */

    public Boolean isSkipDeletionCheck() {
        return this.skipDeletionCheck;
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getSkipDeletionCheck() != null)
            sb.append("SkipDeletionCheck: ").append(getSkipDeletionCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainRequest == false)
            return false;
        DeleteDomainRequest other = (DeleteDomainRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getSkipDeletionCheck() == null ^ this.getSkipDeletionCheck() == null)
            return false;
        if (other.getSkipDeletionCheck() != null && other.getSkipDeletionCheck().equals(this.getSkipDeletionCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSkipDeletionCheck() == null) ? 0 : getSkipDeletionCheck().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDomainRequest clone() {
        return (DeleteDomainRequest) super.clone();
    }

}
