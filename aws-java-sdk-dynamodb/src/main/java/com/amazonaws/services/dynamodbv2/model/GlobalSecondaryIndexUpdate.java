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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A new global secondary index to be added to an existing table.
 * </p>
 * </li>
 * <li>
 * <p>
 * New provisioned throughput parameters for an existing global secondary index.
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing global secondary index to be removed from an existing table.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GlobalSecondaryIndexUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalSecondaryIndexUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to
     * that index.
     * </p>
     */
    private UpdateGlobalSecondaryIndexAction update;
    /**
     * <p>
     * The parameters required for creating a global secondary index on an existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     */
    private CreateGlobalSecondaryIndexAction create;
    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     */
    private DeleteGlobalSecondaryIndexAction delete;

    /**
     * <p>
     * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to
     * that index.
     * </p>
     * 
     * @param update
     *        The name of an existing global secondary index, along with new provisioned throughput settings to be
     *        applied to that index.
     */

    public void setUpdate(UpdateGlobalSecondaryIndexAction update) {
        this.update = update;
    }

    /**
     * <p>
     * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to
     * that index.
     * </p>
     * 
     * @return The name of an existing global secondary index, along with new provisioned throughput settings to be
     *         applied to that index.
     */

    public UpdateGlobalSecondaryIndexAction getUpdate() {
        return this.update;
    }

    /**
     * <p>
     * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to
     * that index.
     * </p>
     * 
     * @param update
     *        The name of an existing global secondary index, along with new provisioned throughput settings to be
     *        applied to that index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalSecondaryIndexUpdate withUpdate(UpdateGlobalSecondaryIndexAction update) {
        setUpdate(update);
        return this;
    }

    /**
     * <p>
     * The parameters required for creating a global secondary index on an existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param create
     *        The parameters required for creating a global secondary index on an existing table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IndexName </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributeDefinitions </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProvisionedThroughput </code>
     *        </p>
     *        </li>
     */

    public void setCreate(CreateGlobalSecondaryIndexAction create) {
        this.create = create;
    }

    /**
     * <p>
     * The parameters required for creating a global secondary index on an existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The parameters required for creating a global secondary index on an existing table:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IndexName </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeySchema </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AttributeDefinitions </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Projection </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProvisionedThroughput </code>
     *         </p>
     *         </li>
     */

    public CreateGlobalSecondaryIndexAction getCreate() {
        return this.create;
    }

    /**
     * <p>
     * The parameters required for creating a global secondary index on an existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param create
     *        The parameters required for creating a global secondary index on an existing table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IndexName </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributeDefinitions </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProvisionedThroughput </code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalSecondaryIndexUpdate withCreate(CreateGlobalSecondaryIndexAction create) {
        setCreate(create);
        return this;
    }

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     * 
     * @param delete
     *        The name of an existing global secondary index to be removed.
     */

    public void setDelete(DeleteGlobalSecondaryIndexAction delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     * 
     * @return The name of an existing global secondary index to be removed.
     */

    public DeleteGlobalSecondaryIndexAction getDelete() {
        return this.delete;
    }

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     * 
     * @param delete
     *        The name of an existing global secondary index to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalSecondaryIndexUpdate withDelete(DeleteGlobalSecondaryIndexAction delete) {
        setDelete(delete);
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
        if (getUpdate() != null)
            sb.append("Update: ").append(getUpdate()).append(",");
        if (getCreate() != null)
            sb.append("Create: ").append(getCreate()).append(",");
        if (getDelete() != null)
            sb.append("Delete: ").append(getDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalSecondaryIndexUpdate == false)
            return false;
        GlobalSecondaryIndexUpdate other = (GlobalSecondaryIndexUpdate) obj;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        if (other.getCreate() == null ^ this.getCreate() == null)
            return false;
        if (other.getCreate() != null && other.getCreate().equals(this.getCreate()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        hashCode = prime * hashCode + ((getCreate() == null) ? 0 : getCreate().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return hashCode;
    }

    @Override
    public GlobalSecondaryIndexUpdate clone() {
        try {
            return (GlobalSecondaryIndexUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.GlobalSecondaryIndexUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
