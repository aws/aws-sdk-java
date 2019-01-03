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

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /** The ID of the core definition. */
    private String coreDefinitionId;
    /** A list of cores in the core definition version. */
    private java.util.List<Core> cores;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * The ID of the core definition.
     * 
     * @param coreDefinitionId
     *        The ID of the core definition.
     */

    public void setCoreDefinitionId(String coreDefinitionId) {
        this.coreDefinitionId = coreDefinitionId;
    }

    /**
     * The ID of the core definition.
     * 
     * @return The ID of the core definition.
     */

    public String getCoreDefinitionId() {
        return this.coreDefinitionId;
    }

    /**
     * The ID of the core definition.
     * 
     * @param coreDefinitionId
     *        The ID of the core definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreDefinitionVersionRequest withCoreDefinitionId(String coreDefinitionId) {
        setCoreDefinitionId(coreDefinitionId);
        return this;
    }

    /**
     * A list of cores in the core definition version.
     * 
     * @return A list of cores in the core definition version.
     */

    public java.util.List<Core> getCores() {
        return cores;
    }

    /**
     * A list of cores in the core definition version.
     * 
     * @param cores
     *        A list of cores in the core definition version.
     */

    public void setCores(java.util.Collection<Core> cores) {
        if (cores == null) {
            this.cores = null;
            return;
        }

        this.cores = new java.util.ArrayList<Core>(cores);
    }

    /**
     * A list of cores in the core definition version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCores(java.util.Collection)} or {@link #withCores(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cores
     *        A list of cores in the core definition version.
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
     * A list of cores in the core definition version.
     * 
     * @param cores
     *        A list of cores in the core definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreDefinitionVersionRequest withCores(java.util.Collection<Core> cores) {
        setCores(cores);
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
