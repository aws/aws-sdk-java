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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata information for a database in a data catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/Database" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Database implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the database.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A set of custom key/value pairs.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param name
     *        The name of the database.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param name
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the database.
     * </p>
     * 
     * @param description
     *        An optional description of the database.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the database.
     * </p>
     * 
     * @return An optional description of the database.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the database.
     * </p>
     * 
     * @param description
     *        An optional description of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A set of custom key/value pairs.
     * </p>
     * 
     * @return A set of custom key/value pairs.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A set of custom key/value pairs.
     * </p>
     * 
     * @param parameters
     *        A set of custom key/value pairs.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A set of custom key/value pairs.
     * </p>
     * 
     * @param parameters
     *        A set of custom key/value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see Database#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Database addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database clearParametersEntries() {
        this.parameters = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Database == false)
            return false;
        Database other = (Database) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public Database clone() {
        try {
            return (Database) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.DatabaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
