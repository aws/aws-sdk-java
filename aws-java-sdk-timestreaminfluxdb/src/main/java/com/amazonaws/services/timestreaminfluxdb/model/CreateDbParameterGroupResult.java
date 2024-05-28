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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/CreateDbParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDbParameterGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The customer-supplied name that uniquely identifies the DB parameter group when interacting with the Amazon
     * Timestream for InfluxDB API and CLI commands.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARM) of the DB parameter group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the DB parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     */
    private Parameters parameters;

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     * 
     * @param id
     *        A service-generated unique identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     * 
     * @return A service-generated unique identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A service-generated unique identifier.
     * </p>
     * 
     * @param id
     *        A service-generated unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The customer-supplied name that uniquely identifies the DB parameter group when interacting with the Amazon
     * Timestream for InfluxDB API and CLI commands.
     * </p>
     * 
     * @param name
     *        The customer-supplied name that uniquely identifies the DB parameter group when interacting with the
     *        Amazon Timestream for InfluxDB API and CLI commands.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The customer-supplied name that uniquely identifies the DB parameter group when interacting with the Amazon
     * Timestream for InfluxDB API and CLI commands.
     * </p>
     * 
     * @return The customer-supplied name that uniquely identifies the DB parameter group when interacting with the
     *         Amazon Timestream for InfluxDB API and CLI commands.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The customer-supplied name that uniquely identifies the DB parameter group when interacting with the Amazon
     * Timestream for InfluxDB API and CLI commands.
     * </p>
     * 
     * @param name
     *        The customer-supplied name that uniquely identifies the DB parameter group when interacting with the
     *        Amazon Timestream for InfluxDB API and CLI commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARM) of the DB parameter group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARM) of the DB parameter group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARM) of the DB parameter group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARM) of the DB parameter group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARM) of the DB parameter group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARM) of the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the DB parameter group.
     * </p>
     * 
     * @param description
     *        The description of the DB parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the DB parameter group.
     * </p>
     * 
     * @return The description of the DB parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the DB parameter group.
     * </p>
     * 
     * @param description
     *        The description of the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     * 
     * @param parameters
     *        A list of the parameters that comprise the DB parameter group.
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     * 
     * @return A list of the parameters that comprise the DB parameter group.
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * A list of the parameters that comprise the DB parameter group.
     * </p>
     * 
     * @param parameters
     *        A list of the parameters that comprise the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDbParameterGroupResult withParameters(Parameters parameters) {
        setParameters(parameters);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof CreateDbParameterGroupResult == false)
            return false;
        CreateDbParameterGroupResult other = (CreateDbParameterGroupResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateDbParameterGroupResult clone() {
        try {
            return (CreateDbParameterGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
