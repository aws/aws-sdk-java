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
 * Describes a schema object in a Fleet Advisor collector inventory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/FleetAdvisorSchemaObjectResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetAdvisorSchemaObjectResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a schema object in a Fleet Advisor collector inventory.
     * </p>
     */
    private String schemaId;
    /**
     * <p>
     * The type of the schema object, as reported by the database engine. Examples include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trigger</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM_TABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String objectType;
    /**
     * <p>
     * The number of objects in a schema object in a Fleet Advisor collector inventory.
     * </p>
     */
    private Long numberOfObjects;
    /**
     * <p>
     * The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     */
    private Long codeLineCount;
    /**
     * <p>
     * The size level of the code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     */
    private Long codeSize;

    /**
     * <p>
     * The ID of a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaId
     *        The ID of a schema object in a Fleet Advisor collector inventory.
     */

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * The ID of a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The ID of a schema object in a Fleet Advisor collector inventory.
     */

    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * The ID of a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param schemaId
     *        The ID of a schema object in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorSchemaObjectResponse withSchemaId(String schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The type of the schema object, as reported by the database engine. Examples include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trigger</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM_TABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectType
     *        The type of the schema object, as reported by the database engine. Examples include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>function</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trigger</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM_TABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUE</code>
     *        </p>
     *        </li>
     */

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * <p>
     * The type of the schema object, as reported by the database engine. Examples include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trigger</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM_TABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the schema object, as reported by the database engine. Examples include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>function</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>trigger</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYSTEM_TABLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUE</code>
     *         </p>
     *         </li>
     */

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * <p>
     * The type of the schema object, as reported by the database engine. Examples include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trigger</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM_TABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectType
     *        The type of the schema object, as reported by the database engine. Examples include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>function</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>trigger</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM_TABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorSchemaObjectResponse withObjectType(String objectType) {
        setObjectType(objectType);
        return this;
    }

    /**
     * <p>
     * The number of objects in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param numberOfObjects
     *        The number of objects in a schema object in a Fleet Advisor collector inventory.
     */

    public void setNumberOfObjects(Long numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
    }

    /**
     * <p>
     * The number of objects in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The number of objects in a schema object in a Fleet Advisor collector inventory.
     */

    public Long getNumberOfObjects() {
        return this.numberOfObjects;
    }

    /**
     * <p>
     * The number of objects in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param numberOfObjects
     *        The number of objects in a schema object in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorSchemaObjectResponse withNumberOfObjects(Long numberOfObjects) {
        setNumberOfObjects(numberOfObjects);
        return this;
    }

    /**
     * <p>
     * The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeLineCount
     *        The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     */

    public void setCodeLineCount(Long codeLineCount) {
        this.codeLineCount = codeLineCount;
    }

    /**
     * <p>
     * The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     */

    public Long getCodeLineCount() {
        return this.codeLineCount;
    }

    /**
     * <p>
     * The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeLineCount
     *        The number of lines of code in a schema object in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorSchemaObjectResponse withCodeLineCount(Long codeLineCount) {
        setCodeLineCount(codeLineCount);
        return this;
    }

    /**
     * <p>
     * The size level of the code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeSize
     *        The size level of the code in a schema object in a Fleet Advisor collector inventory.
     */

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size level of the code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The size level of the code in a schema object in a Fleet Advisor collector inventory.
     */

    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size level of the code in a schema object in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param codeSize
     *        The size level of the code in a schema object in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorSchemaObjectResponse withCodeSize(Long codeSize) {
        setCodeSize(codeSize);
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
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getObjectType() != null)
            sb.append("ObjectType: ").append(getObjectType()).append(",");
        if (getNumberOfObjects() != null)
            sb.append("NumberOfObjects: ").append(getNumberOfObjects()).append(",");
        if (getCodeLineCount() != null)
            sb.append("CodeLineCount: ").append(getCodeLineCount()).append(",");
        if (getCodeSize() != null)
            sb.append("CodeSize: ").append(getCodeSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetAdvisorSchemaObjectResponse == false)
            return false;
        FleetAdvisorSchemaObjectResponse other = (FleetAdvisorSchemaObjectResponse) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getObjectType() == null ^ this.getObjectType() == null)
            return false;
        if (other.getObjectType() != null && other.getObjectType().equals(this.getObjectType()) == false)
            return false;
        if (other.getNumberOfObjects() == null ^ this.getNumberOfObjects() == null)
            return false;
        if (other.getNumberOfObjects() != null && other.getNumberOfObjects().equals(this.getNumberOfObjects()) == false)
            return false;
        if (other.getCodeLineCount() == null ^ this.getCodeLineCount() == null)
            return false;
        if (other.getCodeLineCount() != null && other.getCodeLineCount().equals(this.getCodeLineCount()) == false)
            return false;
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfObjects() == null) ? 0 : getNumberOfObjects().hashCode());
        hashCode = prime * hashCode + ((getCodeLineCount() == null) ? 0 : getCodeLineCount().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        return hashCode;
    }

    @Override
    public FleetAdvisorSchemaObjectResponse clone() {
        try {
            return (FleetAdvisorSchemaObjectResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.FleetAdvisorSchemaObjectResponseMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
