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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PutSchemaFromJson" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSchemaFromJsonRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the schema to update.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The replacement JSON schema.
     * </p>
     */
    private String document;

    /**
     * <p>
     * The ARN of the schema to update.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema to update.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema to update.
     * </p>
     * 
     * @return The ARN of the schema to update.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema to update.
     * </p>
     * 
     * @param schemaArn
     *        The ARN of the schema to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaFromJsonRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The replacement JSON schema.
     * </p>
     * 
     * @param document
     *        The replacement JSON schema.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The replacement JSON schema.
     * </p>
     * 
     * @return The replacement JSON schema.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The replacement JSON schema.
     * </p>
     * 
     * @param document
     *        The replacement JSON schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSchemaFromJsonRequest withDocument(String document) {
        setDocument(document);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSchemaFromJsonRequest == false)
            return false;
        PutSchemaFromJsonRequest other = (PutSchemaFromJsonRequest) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public PutSchemaFromJsonRequest clone() {
        return (PutSchemaFromJsonRequest) super.clone();
    }

}
