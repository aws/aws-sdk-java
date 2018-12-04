/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionDefinitionVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Arn of the function definition version. */
    private String arn;
    /** Timestamp when the funtion definition version was created. */
    private String creationTimestamp;
    /** Information on the definition */
    private FunctionDefinitionVersion definition;
    /** Id of the function definition the version belongs to. */
    private String id;
    /** Version of the function definition version. */
    private String version;

    /**
     * Arn of the function definition version.
     * 
     * @param arn
     *        Arn of the function definition version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Arn of the function definition version.
     * 
     * @return Arn of the function definition version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Arn of the function definition version.
     * 
     * @param arn
     *        Arn of the function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Timestamp when the funtion definition version was created.
     * 
     * @param creationTimestamp
     *        Timestamp when the funtion definition version was created.
     */

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * Timestamp when the funtion definition version was created.
     * 
     * @return Timestamp when the funtion definition version was created.
     */

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * Timestamp when the funtion definition version was created.
     * 
     * @param creationTimestamp
     *        Timestamp when the funtion definition version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionResult withCreationTimestamp(String creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * Information on the definition
     * 
     * @param definition
     *        Information on the definition
     */

    public void setDefinition(FunctionDefinitionVersion definition) {
        this.definition = definition;
    }

    /**
     * Information on the definition
     * 
     * @return Information on the definition
     */

    public FunctionDefinitionVersion getDefinition() {
        return this.definition;
    }

    /**
     * Information on the definition
     * 
     * @param definition
     *        Information on the definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionResult withDefinition(FunctionDefinitionVersion definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * Id of the function definition the version belongs to.
     * 
     * @param id
     *        Id of the function definition the version belongs to.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Id of the function definition the version belongs to.
     * 
     * @return Id of the function definition the version belongs to.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Id of the function definition the version belongs to.
     * 
     * @param id
     *        Id of the function definition the version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Version of the function definition version.
     * 
     * @param version
     *        Version of the function definition version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Version of the function definition version.
     * 
     * @return Version of the function definition version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * Version of the function definition version.
     * 
     * @param version
     *        Version of the function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionDefinitionVersionResult == false)
            return false;
        GetFunctionDefinitionVersionResult other = (GetFunctionDefinitionVersionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionDefinitionVersionResult clone() {
        try {
            return (GetFunctionDefinitionVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
