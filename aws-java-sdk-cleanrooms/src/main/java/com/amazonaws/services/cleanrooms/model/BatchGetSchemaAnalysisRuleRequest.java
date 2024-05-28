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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchemaAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSchemaAnalysisRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the collaboration that contains the schema analysis rule.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * The information that's necessary to retrieve a schema analysis rule.
     * </p>
     */
    private java.util.List<SchemaAnalysisRuleRequest> schemaAnalysisRuleRequests;

    /**
     * <p>
     * The unique identifier of the collaboration that contains the schema analysis rule.
     * </p>
     * 
     * @param collaborationIdentifier
     *        The unique identifier of the collaboration that contains the schema analysis rule.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains the schema analysis rule.
     * </p>
     * 
     * @return The unique identifier of the collaboration that contains the schema analysis rule.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains the schema analysis rule.
     * </p>
     * 
     * @param collaborationIdentifier
     *        The unique identifier of the collaboration that contains the schema analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * The information that's necessary to retrieve a schema analysis rule.
     * </p>
     * 
     * @return The information that's necessary to retrieve a schema analysis rule.
     */

    public java.util.List<SchemaAnalysisRuleRequest> getSchemaAnalysisRuleRequests() {
        return schemaAnalysisRuleRequests;
    }

    /**
     * <p>
     * The information that's necessary to retrieve a schema analysis rule.
     * </p>
     * 
     * @param schemaAnalysisRuleRequests
     *        The information that's necessary to retrieve a schema analysis rule.
     */

    public void setSchemaAnalysisRuleRequests(java.util.Collection<SchemaAnalysisRuleRequest> schemaAnalysisRuleRequests) {
        if (schemaAnalysisRuleRequests == null) {
            this.schemaAnalysisRuleRequests = null;
            return;
        }

        this.schemaAnalysisRuleRequests = new java.util.ArrayList<SchemaAnalysisRuleRequest>(schemaAnalysisRuleRequests);
    }

    /**
     * <p>
     * The information that's necessary to retrieve a schema analysis rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaAnalysisRuleRequests(java.util.Collection)} or
     * {@link #withSchemaAnalysisRuleRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param schemaAnalysisRuleRequests
     *        The information that's necessary to retrieve a schema analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleRequest withSchemaAnalysisRuleRequests(SchemaAnalysisRuleRequest... schemaAnalysisRuleRequests) {
        if (this.schemaAnalysisRuleRequests == null) {
            setSchemaAnalysisRuleRequests(new java.util.ArrayList<SchemaAnalysisRuleRequest>(schemaAnalysisRuleRequests.length));
        }
        for (SchemaAnalysisRuleRequest ele : schemaAnalysisRuleRequests) {
            this.schemaAnalysisRuleRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information that's necessary to retrieve a schema analysis rule.
     * </p>
     * 
     * @param schemaAnalysisRuleRequests
     *        The information that's necessary to retrieve a schema analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaAnalysisRuleRequest withSchemaAnalysisRuleRequests(java.util.Collection<SchemaAnalysisRuleRequest> schemaAnalysisRuleRequests) {
        setSchemaAnalysisRuleRequests(schemaAnalysisRuleRequests);
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
        if (getCollaborationIdentifier() != null)
            sb.append("CollaborationIdentifier: ").append(getCollaborationIdentifier()).append(",");
        if (getSchemaAnalysisRuleRequests() != null)
            sb.append("SchemaAnalysisRuleRequests: ").append(getSchemaAnalysisRuleRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetSchemaAnalysisRuleRequest == false)
            return false;
        BatchGetSchemaAnalysisRuleRequest other = (BatchGetSchemaAnalysisRuleRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getSchemaAnalysisRuleRequests() == null ^ this.getSchemaAnalysisRuleRequests() == null)
            return false;
        if (other.getSchemaAnalysisRuleRequests() != null && other.getSchemaAnalysisRuleRequests().equals(this.getSchemaAnalysisRuleRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSchemaAnalysisRuleRequests() == null) ? 0 : getSchemaAnalysisRuleRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSchemaAnalysisRuleRequest clone() {
        return (BatchGetSchemaAnalysisRuleRequest) super.clone();
    }

}
