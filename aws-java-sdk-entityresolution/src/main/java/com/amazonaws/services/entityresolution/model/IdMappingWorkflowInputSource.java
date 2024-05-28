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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>InputSourceARN</code>, <code>SchemaName</code>, and <code>Type</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdMappingWorkflowInputSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingWorkflowInputSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Glue table ARN for the input source table.
     * </p>
     */
    private String inputSourceARN;
    /**
     * <p>
     * The name of the schema to be retrieved.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     */
    private String type;

    /**
     * <p>
     * An Glue table ARN for the input source table.
     * </p>
     * 
     * @param inputSourceARN
     *        An Glue table ARN for the input source table.
     */

    public void setInputSourceARN(String inputSourceARN) {
        this.inputSourceARN = inputSourceARN;
    }

    /**
     * <p>
     * An Glue table ARN for the input source table.
     * </p>
     * 
     * @return An Glue table ARN for the input source table.
     */

    public String getInputSourceARN() {
        return this.inputSourceARN;
    }

    /**
     * <p>
     * An Glue table ARN for the input source table.
     * </p>
     * 
     * @param inputSourceARN
     *        An Glue table ARN for the input source table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingWorkflowInputSource withInputSourceARN(String inputSourceARN) {
        setInputSourceARN(inputSourceARN);
        return this;
    }

    /**
     * <p>
     * The name of the schema to be retrieved.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema to be retrieved.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema to be retrieved.
     * </p>
     * 
     * @return The name of the schema to be retrieved.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema to be retrieved.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingWorkflowInputSource withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>. </p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @see IdNamespaceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @return The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>. </p>
     *         <p>
     *         The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *         an ID mapping workflow.
     *         </p>
     *         <p>
     *         The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *         <code>sourceIds</code> will resolve to.
     * @see IdNamespaceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>. </p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public IdMappingWorkflowInputSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>.
     * </p>
     * <p>
     * The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in an ID
     * mapping workflow.
     * </p>
     * <p>
     * The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all <code>sourceIds</code>
     * will resolve to.
     * </p>
     * 
     * @param type
     *        The type of ID namespace. There are two types: <code>SOURCE</code> and <code>TARGET</code>. </p>
     *        <p>
     *        The <code>SOURCE</code> contains configurations for <code>sourceId</code> data that will be processed in
     *        an ID mapping workflow.
     *        </p>
     *        <p>
     *        The <code>TARGET</code> contains a configuration of <code>targetId</code> to which all
     *        <code>sourceIds</code> will resolve to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public IdMappingWorkflowInputSource withType(IdNamespaceType type) {
        this.type = type.toString();
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
        if (getInputSourceARN() != null)
            sb.append("InputSourceARN: ").append(getInputSourceARN()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingWorkflowInputSource == false)
            return false;
        IdMappingWorkflowInputSource other = (IdMappingWorkflowInputSource) obj;
        if (other.getInputSourceARN() == null ^ this.getInputSourceARN() == null)
            return false;
        if (other.getInputSourceARN() != null && other.getInputSourceARN().equals(this.getInputSourceARN()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSourceARN() == null) ? 0 : getInputSourceARN().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingWorkflowInputSource clone() {
        try {
            return (IdMappingWorkflowInputSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdMappingWorkflowInputSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
