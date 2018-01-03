/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateCoreDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCoreDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The client token used to request idempotent operations. */
    private String amznClientToken;
    /** core definition Id */
    private String coreDefinitionId;
    /** Cores in the definition version. */
    private java.util.List<Core> cores;

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @return The client token used to request idempotent operations.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

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

    public CreateCoreDefinitionVersionRequest withCoreDefinitionId(String coreDefinitionId) {
        setCoreDefinitionId(coreDefinitionId);
        return this;
    }

    /**
     * Cores in the definition version.
     * 
     * @return Cores in the definition version.
     */

    public java.util.List<Core> getCores() {
        return cores;
    }

    /**
     * Cores in the definition version.
     * 
     * @param cores
     *        Cores in the definition version.
     */

    public void setCores(java.util.Collection<Core> cores) {
        if (cores == null) {
            this.cores = null;
            return;
        }

        this.cores = new java.util.ArrayList<Core>(cores);
    }

    /**
     * Cores in the definition version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCores(java.util.Collection)} or {@link #withCores(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cores
     *        Cores in the definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreDefinitionVersionRequest withCores(Core... cores) {
        if (this.cores == null) {
            setCores(new java.util.ArrayList<Core>(cores.length));
        }
        for (Core ele : cores) {
            this.cores.add(ele);
        }
        return this;
    }

    /**
     * Cores in the definition version.
     * 
     * @param cores
     *        Cores in the definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreDefinitionVersionRequest withCores(java.util.Collection<Core> cores) {
        setCores(cores);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getCoreDefinitionId() != null)
            sb.append("CoreDefinitionId: ").append(getCoreDefinitionId()).append(",");
        if (getCores() != null)
            sb.append("Cores: ").append(getCores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCoreDefinitionVersionRequest == false)
            return false;
        CreateCoreDefinitionVersionRequest other = (CreateCoreDefinitionVersionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getCoreDefinitionId() == null ^ this.getCoreDefinitionId() == null)
            return false;
        if (other.getCoreDefinitionId() != null && other.getCoreDefinitionId().equals(this.getCoreDefinitionId()) == false)
            return false;
        if (other.getCores() == null ^ this.getCores() == null)
            return false;
        if (other.getCores() != null && other.getCores().equals(this.getCores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getCoreDefinitionId() == null) ? 0 : getCoreDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getCores() == null) ? 0 : getCores().hashCode());
        return hashCode;
    }

    @Override
    public CreateCoreDefinitionVersionRequest clone() {
        return (CreateCoreDefinitionVersionRequest) super.clone();
    }

}
