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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateCoreDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCoreDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** core definition Id */
    private String coreDefinitionId;
    /** name of the definition */
    private String name;

    /**
     * core definition Id
     * 
     * @param coreDefinitionId
     *        core definition Id
     */

    public void setCoreDefinitionId(String coreDefinitionId) {
        this.coreDefinitionId = coreDefinitionId;
    }

    /**
     * core definition Id
     * 
     * @return core definition Id
     */

    public String getCoreDefinitionId() {
        return this.coreDefinitionId;
    }

    /**
     * core definition Id
     * 
     * @param coreDefinitionId
     *        core definition Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCoreDefinitionRequest withCoreDefinitionId(String coreDefinitionId) {
        setCoreDefinitionId(coreDefinitionId);
        return this;
    }

    /**
     * name of the definition
     * 
     * @param name
     *        name of the definition
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * name of the definition
     * 
     * @return name of the definition
     */

    public String getName() {
        return this.name;
    }

    /**
     * name of the definition
     * 
     * @param name
     *        name of the definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCoreDefinitionRequest withName(String name) {
        setName(name);
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
        if (getCoreDefinitionId() != null)
            sb.append("CoreDefinitionId: ").append(getCoreDefinitionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCoreDefinitionRequest == false)
            return false;
        UpdateCoreDefinitionRequest other = (UpdateCoreDefinitionRequest) obj;
        if (other.getCoreDefinitionId() == null ^ this.getCoreDefinitionId() == null)
            return false;
        if (other.getCoreDefinitionId() != null && other.getCoreDefinitionId().equals(this.getCoreDefinitionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDefinitionId() == null) ? 0 : getCoreDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCoreDefinitionRequest clone() {
        return (UpdateCoreDefinitionRequest) super.clone();
    }

}
