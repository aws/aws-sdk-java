/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDeleteWorlds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteWorldsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * </p>
     */
    private java.util.List<String> worlds;

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * </p>
     * 
     * @return A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     */

    public java.util.List<String> getWorlds() {
        return worlds;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     */

    public void setWorlds(java.util.Collection<String> worlds) {
        if (worlds == null) {
            this.worlds = null;
            return;
        }

        this.worlds = new java.util.ArrayList<String>(worlds);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorlds(java.util.Collection)} or {@link #withWorlds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteWorldsRequest withWorlds(String... worlds) {
        if (this.worlds == null) {
            setWorlds(new java.util.ArrayList<String>(worlds.length));
        }
        for (String ele : worlds) {
            this.worlds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * </p>
     * 
     * @param worlds
     *        A list of Amazon Resource Names (arns) that correspond to worlds to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteWorldsRequest withWorlds(java.util.Collection<String> worlds) {
        setWorlds(worlds);
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
        if (getWorlds() != null)
            sb.append("Worlds: ").append(getWorlds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteWorldsRequest == false)
            return false;
        BatchDeleteWorldsRequest other = (BatchDeleteWorldsRequest) obj;
        if (other.getWorlds() == null ^ this.getWorlds() == null)
            return false;
        if (other.getWorlds() != null && other.getWorlds().equals(this.getWorlds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorlds() == null) ? 0 : getWorlds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteWorldsRequest clone() {
        return (BatchDeleteWorldsRequest) super.clone();
    }

}
