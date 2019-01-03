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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The display name for the project to be created in AWS CodeStar.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the project to be created in AWS CodeStar.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the project, if any.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A list of the Code objects submitted with the project request. If this parameter is specified, the request must
     * also include the toolchain parameter.
     * </p>
     */
    private java.util.List<Code> sourceCode;
    /**
     * <p>
     * The name of the toolchain template file submitted with the project request. If this parameter is specified, the
     * request must also include the sourceCode parameter.
     * </p>
     */
    private Toolchain toolchain;
    /**
     * <p>
     * The tags created for the project.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The display name for the project to be created in AWS CodeStar.
     * </p>
     * 
     * @param name
     *        The display name for the project to be created in AWS CodeStar.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the project to be created in AWS CodeStar.
     * </p>
     * 
     * @return The display name for the project to be created in AWS CodeStar.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name for the project to be created in AWS CodeStar.
     * </p>
     * 
     * @param name
     *        The display name for the project to be created in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the project to be created in AWS CodeStar.
     * </p>
     * 
     * @param id
     *        The ID of the project to be created in AWS CodeStar.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the project to be created in AWS CodeStar.
     * </p>
     * 
     * @return The ID of the project to be created in AWS CodeStar.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the project to be created in AWS CodeStar.
     * </p>
     * 
     * @param id
     *        The ID of the project to be created in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description of the project, if any.
     * </p>
     * 
     * @param description
     *        The description of the project, if any.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the project, if any.
     * </p>
     * 
     * @return The description of the project, if any.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the project, if any.
     * </p>
     * 
     * @param description
     *        The description of the project, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project creation. This token
     *        can be used to repeat the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request.
     * </p>
     * 
     * @return A user- or system-generated token that identifies the entity that requested project creation. This token
     *         can be used to repeat the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A user- or system-generated token that identifies the entity that requested project creation. This token can be
     * used to repeat the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A user- or system-generated token that identifies the entity that requested project creation. This token
     *        can be used to repeat the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A list of the Code objects submitted with the project request. If this parameter is specified, the request must
     * also include the toolchain parameter.
     * </p>
     * 
     * @return A list of the Code objects submitted with the project request. If this parameter is specified, the
     *         request must also include the toolchain parameter.
     */

    public java.util.List<Code> getSourceCode() {
        return sourceCode;
    }

    /**
     * <p>
     * A list of the Code objects submitted with the project request. If this parameter is specified, the request must
     * also include the toolchain parameter.
     * </p>
     * 
     * @param sourceCode
     *        A list of the Code objects submitted with the project request. If this parameter is specified, the request
     *        must also include the toolchain parameter.
     */

    public void setSourceCode(java.util.Collection<Code> sourceCode) {
        if (sourceCode == null) {
            this.sourceCode = null;
            return;
        }

        this.sourceCode = new java.util.ArrayList<Code>(sourceCode);
    }

    /**
     * <p>
     * A list of the Code objects submitted with the project request. If this parameter is specified, the request must
     * also include the toolchain parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceCode(java.util.Collection)} or {@link #withSourceCode(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceCode
     *        A list of the Code objects submitted with the project request. If this parameter is specified, the request
     *        must also include the toolchain parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSourceCode(Code... sourceCode) {
        if (this.sourceCode == null) {
            setSourceCode(new java.util.ArrayList<Code>(sourceCode.length));
        }
        for (Code ele : sourceCode) {
            this.sourceCode.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Code objects submitted with the project request. If this parameter is specified, the request must
     * also include the toolchain parameter.
     * </p>
     * 
     * @param sourceCode
     *        A list of the Code objects submitted with the project request. If this parameter is specified, the request
     *        must also include the toolchain parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withSourceCode(java.util.Collection<Code> sourceCode) {
        setSourceCode(sourceCode);
        return this;
    }

    /**
     * <p>
     * The name of the toolchain template file submitted with the project request. If this parameter is specified, the
     * request must also include the sourceCode parameter.
     * </p>
     * 
     * @param toolchain
     *        The name of the toolchain template file submitted with the project request. If this parameter is
     *        specified, the request must also include the sourceCode parameter.
     */

    public void setToolchain(Toolchain toolchain) {
        this.toolchain = toolchain;
    }

    /**
     * <p>
     * The name of the toolchain template file submitted with the project request. If this parameter is specified, the
     * request must also include the sourceCode parameter.
     * </p>
     * 
     * @return The name of the toolchain template file submitted with the project request. If this parameter is
     *         specified, the request must also include the sourceCode parameter.
     */

    public Toolchain getToolchain() {
        return this.toolchain;
    }

    /**
     * <p>
     * The name of the toolchain template file submitted with the project request. If this parameter is specified, the
     * request must also include the sourceCode parameter.
     * </p>
     * 
     * @param toolchain
     *        The name of the toolchain template file submitted with the project request. If this parameter is
     *        specified, the request must also include the sourceCode parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withToolchain(Toolchain toolchain) {
        setToolchain(toolchain);
        return this;
    }

    /**
     * <p>
     * The tags created for the project.
     * </p>
     * 
     * @return The tags created for the project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags created for the project.
     * </p>
     * 
     * @param tags
     *        The tags created for the project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags created for the project.
     * </p>
     * 
     * @param tags
     *        The tags created for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateProjectRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getSourceCode() != null)
            sb.append("SourceCode: ").append(getSourceCode()).append(",");
        if (getToolchain() != null)
            sb.append("Toolchain: ").append(getToolchain()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getSourceCode() == null ^ this.getSourceCode() == null)
            return false;
        if (other.getSourceCode() != null && other.getSourceCode().equals(this.getSourceCode()) == false)
            return false;
        if (other.getToolchain() == null ^ this.getToolchain() == null)
            return false;
        if (other.getToolchain() != null && other.getToolchain().equals(this.getToolchain()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSourceCode() == null) ? 0 : getSourceCode().hashCode());
        hashCode = prime * hashCode + ((getToolchain() == null) ? 0 : getToolchain().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
