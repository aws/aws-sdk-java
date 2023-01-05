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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetApiAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ApiAssociation</code> object.
     * </p>
     */
    private ApiAssociation apiAssociation;

    /**
     * <p>
     * The <code>ApiAssociation</code> object.
     * </p>
     * 
     * @param apiAssociation
     *        The <code>ApiAssociation</code> object.
     */

    public void setApiAssociation(ApiAssociation apiAssociation) {
        this.apiAssociation = apiAssociation;
    }

    /**
     * <p>
     * The <code>ApiAssociation</code> object.
     * </p>
     * 
     * @return The <code>ApiAssociation</code> object.
     */

    public ApiAssociation getApiAssociation() {
        return this.apiAssociation;
    }

    /**
     * <p>
     * The <code>ApiAssociation</code> object.
     * </p>
     * 
     * @param apiAssociation
     *        The <code>ApiAssociation</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiAssociationResult withApiAssociation(ApiAssociation apiAssociation) {
        setApiAssociation(apiAssociation);
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
        if (getApiAssociation() != null)
            sb.append("ApiAssociation: ").append(getApiAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApiAssociationResult == false)
            return false;
        GetApiAssociationResult other = (GetApiAssociationResult) obj;
        if (other.getApiAssociation() == null ^ this.getApiAssociation() == null)
            return false;
        if (other.getApiAssociation() != null && other.getApiAssociation().equals(this.getApiAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiAssociation() == null) ? 0 : getApiAssociation().hashCode());
        return hashCode;
    }

    @Override
    public GetApiAssociationResult clone() {
        try {
            return (GetApiAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
