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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of mappings to the specified targets.
     * </p>
     */
    private java.util.List<MappingEntry> mapping;

    /**
     * <p>
     * A list of mappings to the specified targets.
     * </p>
     * 
     * @return A list of mappings to the specified targets.
     */

    public java.util.List<MappingEntry> getMapping() {
        return mapping;
    }

    /**
     * <p>
     * A list of mappings to the specified targets.
     * </p>
     * 
     * @param mapping
     *        A list of mappings to the specified targets.
     */

    public void setMapping(java.util.Collection<MappingEntry> mapping) {
        if (mapping == null) {
            this.mapping = null;
            return;
        }

        this.mapping = new java.util.ArrayList<MappingEntry>(mapping);
    }

    /**
     * <p>
     * A list of mappings to the specified targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMapping(java.util.Collection)} or {@link #withMapping(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param mapping
     *        A list of mappings to the specified targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMappingResult withMapping(MappingEntry... mapping) {
        if (this.mapping == null) {
            setMapping(new java.util.ArrayList<MappingEntry>(mapping.length));
        }
        for (MappingEntry ele : mapping) {
            this.mapping.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of mappings to the specified targets.
     * </p>
     * 
     * @param mapping
     *        A list of mappings to the specified targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMappingResult withMapping(java.util.Collection<MappingEntry> mapping) {
        setMapping(mapping);
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
        if (getMapping() != null)
            sb.append("Mapping: ").append(getMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMappingResult == false)
            return false;
        GetMappingResult other = (GetMappingResult) obj;
        if (other.getMapping() == null ^ this.getMapping() == null)
            return false;
        if (other.getMapping() != null && other.getMapping().equals(this.getMapping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapping() == null) ? 0 : getMapping().hashCode());
        return hashCode;
    }

    @Override
    public GetMappingResult clone() {
        try {
            return (GetMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
