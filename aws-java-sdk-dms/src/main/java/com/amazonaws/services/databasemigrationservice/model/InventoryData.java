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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Fleet Advisor collector inventory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/InventoryData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of databases in the Fleet Advisor collector inventory.
     * </p>
     */
    private Integer numberOfDatabases;
    /**
     * <p>
     * The number of schemas in the Fleet Advisor collector inventory.
     * </p>
     */
    private Integer numberOfSchemas;

    /**
     * <p>
     * The number of databases in the Fleet Advisor collector inventory.
     * </p>
     * 
     * @param numberOfDatabases
     *        The number of databases in the Fleet Advisor collector inventory.
     */

    public void setNumberOfDatabases(Integer numberOfDatabases) {
        this.numberOfDatabases = numberOfDatabases;
    }

    /**
     * <p>
     * The number of databases in the Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The number of databases in the Fleet Advisor collector inventory.
     */

    public Integer getNumberOfDatabases() {
        return this.numberOfDatabases;
    }

    /**
     * <p>
     * The number of databases in the Fleet Advisor collector inventory.
     * </p>
     * 
     * @param numberOfDatabases
     *        The number of databases in the Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryData withNumberOfDatabases(Integer numberOfDatabases) {
        setNumberOfDatabases(numberOfDatabases);
        return this;
    }

    /**
     * <p>
     * The number of schemas in the Fleet Advisor collector inventory.
     * </p>
     * 
     * @param numberOfSchemas
     *        The number of schemas in the Fleet Advisor collector inventory.
     */

    public void setNumberOfSchemas(Integer numberOfSchemas) {
        this.numberOfSchemas = numberOfSchemas;
    }

    /**
     * <p>
     * The number of schemas in the Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The number of schemas in the Fleet Advisor collector inventory.
     */

    public Integer getNumberOfSchemas() {
        return this.numberOfSchemas;
    }

    /**
     * <p>
     * The number of schemas in the Fleet Advisor collector inventory.
     * </p>
     * 
     * @param numberOfSchemas
     *        The number of schemas in the Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryData withNumberOfSchemas(Integer numberOfSchemas) {
        setNumberOfSchemas(numberOfSchemas);
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
        if (getNumberOfDatabases() != null)
            sb.append("NumberOfDatabases: ").append(getNumberOfDatabases()).append(",");
        if (getNumberOfSchemas() != null)
            sb.append("NumberOfSchemas: ").append(getNumberOfSchemas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryData == false)
            return false;
        InventoryData other = (InventoryData) obj;
        if (other.getNumberOfDatabases() == null ^ this.getNumberOfDatabases() == null)
            return false;
        if (other.getNumberOfDatabases() != null && other.getNumberOfDatabases().equals(this.getNumberOfDatabases()) == false)
            return false;
        if (other.getNumberOfSchemas() == null ^ this.getNumberOfSchemas() == null)
            return false;
        if (other.getNumberOfSchemas() != null && other.getNumberOfSchemas().equals(this.getNumberOfSchemas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfDatabases() == null) ? 0 : getNumberOfDatabases().hashCode());
        hashCode = prime * hashCode + ((getNumberOfSchemas() == null) ? 0 : getNumberOfSchemas().hashCode());
        return hashCode;
    }

    @Override
    public InventoryData clone() {
        try {
            return (InventoryData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.InventoryDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
