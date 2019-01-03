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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateParameterGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The parameter group that has been modified.
     * </p>
     */
    private ParameterGroup parameterGroup;

    /**
     * <p>
     * The parameter group that has been modified.
     * </p>
     * 
     * @param parameterGroup
     *        The parameter group that has been modified.
     */

    public void setParameterGroup(ParameterGroup parameterGroup) {
        this.parameterGroup = parameterGroup;
    }

    /**
     * <p>
     * The parameter group that has been modified.
     * </p>
     * 
     * @return The parameter group that has been modified.
     */

    public ParameterGroup getParameterGroup() {
        return this.parameterGroup;
    }

    /**
     * <p>
     * The parameter group that has been modified.
     * </p>
     * 
     * @param parameterGroup
     *        The parameter group that has been modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParameterGroupResult withParameterGroup(ParameterGroup parameterGroup) {
        setParameterGroup(parameterGroup);
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
        if (getParameterGroup() != null)
            sb.append("ParameterGroup: ").append(getParameterGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParameterGroupResult == false)
            return false;
        UpdateParameterGroupResult other = (UpdateParameterGroupResult) obj;
        if (other.getParameterGroup() == null ^ this.getParameterGroup() == null)
            return false;
        if (other.getParameterGroup() != null && other.getParameterGroup().equals(this.getParameterGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroup() == null) ? 0 : getParameterGroup().hashCode());
        return hashCode;
    }

    @Override
    public UpdateParameterGroupResult clone() {
        try {
            return (UpdateParameterGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
