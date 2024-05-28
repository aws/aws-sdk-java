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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PutSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store in which to place the schema.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the definition of the schema to be stored. The schema definition must be written in Cedar schema JSON.
     * </p>
     */
    private SchemaDefinition definition;

    /**
     * <p>
     * Specifies the ID of the policy store in which to place the schema.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store in which to place the schema.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store in which to place the schema.
     * </p>
     * 
     * @return Specifies the ID of the policy store in which to place the schema.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store in which to place the schema.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store in which to place the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the definition of the schema to be stored. The schema definition must be written in Cedar schema JSON.
     * </p>
     * 
     * @param definition
     *        Specifies the definition of the schema to be stored. The schema definition must be written in Cedar schema
     *        JSON.
     */

    public void setDefinition(SchemaDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Specifies the definition of the schema to be stored. The schema definition must be written in Cedar schema JSON.
     * </p>
     * 
     * @return Specifies the definition of the schema to be stored. The schema definition must be written in Cedar
     *         schema JSON.
     */

    public SchemaDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Specifies the definition of the schema to be stored. The schema definition must be written in Cedar schema JSON.
     * </p>
     * 
     * @param definition
     *        Specifies the definition of the schema to be stored. The schema definition must be written in Cedar schema
     *        JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaRequest withDefinition(SchemaDefinition definition) {
        setDefinition(definition);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSchemaRequest == false)
            return false;
        PutSchemaRequest other = (PutSchemaRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public PutSchemaRequest clone() {
        return (PutSchemaRequest) super.clone();
    }

}
