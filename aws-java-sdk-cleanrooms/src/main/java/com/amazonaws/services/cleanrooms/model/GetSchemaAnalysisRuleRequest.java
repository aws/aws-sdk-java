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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchemaAnalysisRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaAnalysisRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * The name of the schema to retrieve the analysis rule for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a combination
     * of the collaboration, the schema name, and their type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration
     *        ID.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     * 
     * @return A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration
     *         ID.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaAnalysisRuleRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the schema to retrieve the analysis rule for.
     * </p>
     * 
     * @param name
     *        The name of the schema to retrieve the analysis rule for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schema to retrieve the analysis rule for.
     * </p>
     * 
     * @return The name of the schema to retrieve the analysis rule for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schema to retrieve the analysis rule for.
     * </p>
     * 
     * @param name
     *        The name of the schema to retrieve the analysis rule for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaAnalysisRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a combination
     * of the collaboration, the schema name, and their type.
     * </p>
     * 
     * @param type
     *        The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a
     *        combination of the collaboration, the schema name, and their type.
     * @see AnalysisRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a combination
     * of the collaboration, the schema name, and their type.
     * </p>
     * 
     * @return The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a
     *         combination of the collaboration, the schema name, and their type.
     * @see AnalysisRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a combination
     * of the collaboration, the schema name, and their type.
     * </p>
     * 
     * @param type
     *        The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a
     *        combination of the collaboration, the schema name, and their type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public GetSchemaAnalysisRuleRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a combination
     * of the collaboration, the schema name, and their type.
     * </p>
     * 
     * @param type
     *        The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a
     *        combination of the collaboration, the schema name, and their type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public GetSchemaAnalysisRuleRequest withType(AnalysisRuleType type) {
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
        if (getCollaborationIdentifier() != null)
            sb.append("CollaborationIdentifier: ").append(getCollaborationIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof GetSchemaAnalysisRuleRequest == false)
            return false;
        GetSchemaAnalysisRuleRequest other = (GetSchemaAnalysisRuleRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaAnalysisRuleRequest clone() {
        return (GetSchemaAnalysisRuleRequest) super.clone();
    }

}
