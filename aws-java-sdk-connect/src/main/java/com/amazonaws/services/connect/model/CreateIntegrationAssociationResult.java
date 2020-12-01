/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateIntegrationAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the association.
     * </p>
     */
    private String integrationAssociationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     */
    private String integrationAssociationArn;

    /**
     * <p>
     * The identifier for the association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the association.
     */

    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the association.
     * </p>
     * 
     * @return The identifier for the association.
     */

    public String getIntegrationAssociationId() {
        return this.integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationAssociationResult withIntegrationAssociationId(String integrationAssociationId) {
        setIntegrationAssociationId(integrationAssociationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     * 
     * @param integrationAssociationArn
     *        The Amazon Resource Name (ARN) for the association.
     */

    public void setIntegrationAssociationArn(String integrationAssociationArn) {
        this.integrationAssociationArn = integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the association.
     */

    public String getIntegrationAssociationArn() {
        return this.integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the association.
     * </p>
     * 
     * @param integrationAssociationArn
     *        The Amazon Resource Name (ARN) for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationAssociationResult withIntegrationAssociationArn(String integrationAssociationArn) {
        setIntegrationAssociationArn(integrationAssociationArn);
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
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: ").append(getIntegrationAssociationId()).append(",");
        if (getIntegrationAssociationArn() != null)
            sb.append("IntegrationAssociationArn: ").append(getIntegrationAssociationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationAssociationResult == false)
            return false;
        CreateIntegrationAssociationResult other = (CreateIntegrationAssociationResult) obj;
        if (other.getIntegrationAssociationId() == null ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        if (other.getIntegrationAssociationArn() == null ^ this.getIntegrationAssociationArn() == null)
            return false;
        if (other.getIntegrationAssociationArn() != null && other.getIntegrationAssociationArn().equals(this.getIntegrationAssociationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationAssociationArn() == null) ? 0 : getIntegrationAssociationArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationAssociationResult clone() {
        try {
            return (CreateIntegrationAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
