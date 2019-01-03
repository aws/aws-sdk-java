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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a core definition version.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CoreDefinitionVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreDefinitionVersion implements Serializable, Cloneable, StructuredPojo {

    /** A list of cores in the core definition version. */
    private java.util.List<Core> cores;

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

    public CoreDefinitionVersion withCores(Core... cores) {
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

    public CoreDefinitionVersion withCores(java.util.Collection<Core> cores) {
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

        if (obj instanceof CoreDefinitionVersion == false)
            return false;
        CoreDefinitionVersion other = (CoreDefinitionVersion) obj;
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

        hashCode = prime * hashCode + ((getCores() == null) ? 0 : getCores().hashCode());
        return hashCode;
    }

    @Override
    public CoreDefinitionVersion clone() {
        try {
            return (CoreDefinitionVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.CoreDefinitionVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
