/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetBlueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlueprintResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a <code>Blueprint</code> object.
     * </p>
     */
    private Blueprint blueprint;

    /**
     * <p>
     * Returns a <code>Blueprint</code> object.
     * </p>
     * 
     * @param blueprint
     *        Returns a <code>Blueprint</code> object.
     */

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    /**
     * <p>
     * Returns a <code>Blueprint</code> object.
     * </p>
     * 
     * @return Returns a <code>Blueprint</code> object.
     */

    public Blueprint getBlueprint() {
        return this.blueprint;
    }

    /**
     * <p>
     * Returns a <code>Blueprint</code> object.
     * </p>
     * 
     * @param blueprint
     *        Returns a <code>Blueprint</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlueprintResult withBlueprint(Blueprint blueprint) {
        setBlueprint(blueprint);
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
        if (getBlueprint() != null)
            sb.append("Blueprint: ").append(getBlueprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlueprintResult == false)
            return false;
        GetBlueprintResult other = (GetBlueprintResult) obj;
        if (other.getBlueprint() == null ^ this.getBlueprint() == null)
            return false;
        if (other.getBlueprint() != null && other.getBlueprint().equals(this.getBlueprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprint() == null) ? 0 : getBlueprint().hashCode());
        return hashCode;
    }

    @Override
    public GetBlueprintResult clone() {
        try {
            return (GetBlueprintResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
