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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * The names for the schema objects to retrieve.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     * </p>
     * 
     * @return A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     * </p>
     * 
     * @param collaborationIdentifier
     *        A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * The names for the schema objects to retrieve.
     * </p>
     * 
     * @return The names for the schema objects to retrieve.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * The names for the schema objects to retrieve.
     * </p>
     * 
     * @param names
     *        The names for the schema objects to retrieve.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * The names for the schema objects to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        The names for the schema objects to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names for the schema objects to retrieve.
     * </p>
     * 
     * @param names
     *        The names for the schema objects to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaRequest withNames(java.util.Collection<String> names) {
        setNames(names);
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetSchemaRequest == false)
            return false;
        BatchGetSchemaRequest other = (BatchGetSchemaRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSchemaRequest clone() {
        return (BatchGetSchemaRequest) super.clone();
    }

}
