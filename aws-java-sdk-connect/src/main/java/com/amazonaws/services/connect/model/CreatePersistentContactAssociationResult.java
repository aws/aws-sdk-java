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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePersistentContactAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePersistentContactAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field is populated only for persistent chat.
     * </p>
     */
    private String continuedFromContactId;

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field is populated only for persistent chat.
     * </p>
     * 
     * @param continuedFromContactId
     *        The contactId from which a persistent chat session is started. This field is populated only for persistent
     *        chat.
     */

    public void setContinuedFromContactId(String continuedFromContactId) {
        this.continuedFromContactId = continuedFromContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field is populated only for persistent chat.
     * </p>
     * 
     * @return The contactId from which a persistent chat session is started. This field is populated only for
     *         persistent chat.
     */

    public String getContinuedFromContactId() {
        return this.continuedFromContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session is started. This field is populated only for persistent chat.
     * </p>
     * 
     * @param continuedFromContactId
     *        The contactId from which a persistent chat session is started. This field is populated only for persistent
     *        chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePersistentContactAssociationResult withContinuedFromContactId(String continuedFromContactId) {
        setContinuedFromContactId(continuedFromContactId);
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
        if (getContinuedFromContactId() != null)
            sb.append("ContinuedFromContactId: ").append(getContinuedFromContactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePersistentContactAssociationResult == false)
            return false;
        CreatePersistentContactAssociationResult other = (CreatePersistentContactAssociationResult) obj;
        if (other.getContinuedFromContactId() == null ^ this.getContinuedFromContactId() == null)
            return false;
        if (other.getContinuedFromContactId() != null && other.getContinuedFromContactId().equals(this.getContinuedFromContactId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinuedFromContactId() == null) ? 0 : getContinuedFromContactId().hashCode());
        return hashCode;
    }

    @Override
    public CreatePersistentContactAssociationResult clone() {
        try {
            return (CreatePersistentContactAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
