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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a through resource statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ThroughResourcesStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThroughResourcesStatement implements Serializable, Cloneable {

    /**
     * <p>
     * The resource statement.
     * </p>
     */
    private ResourceStatement resourceStatement;

    /**
     * <p>
     * The resource statement.
     * </p>
     * 
     * @param resourceStatement
     *        The resource statement.
     */

    public void setResourceStatement(ResourceStatement resourceStatement) {
        this.resourceStatement = resourceStatement;
    }

    /**
     * <p>
     * The resource statement.
     * </p>
     * 
     * @return The resource statement.
     */

    public ResourceStatement getResourceStatement() {
        return this.resourceStatement;
    }

    /**
     * <p>
     * The resource statement.
     * </p>
     * 
     * @param resourceStatement
     *        The resource statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThroughResourcesStatement withResourceStatement(ResourceStatement resourceStatement) {
        setResourceStatement(resourceStatement);
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
        if (getResourceStatement() != null)
            sb.append("ResourceStatement: ").append(getResourceStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThroughResourcesStatement == false)
            return false;
        ThroughResourcesStatement other = (ThroughResourcesStatement) obj;
        if (other.getResourceStatement() == null ^ this.getResourceStatement() == null)
            return false;
        if (other.getResourceStatement() != null && other.getResourceStatement().equals(this.getResourceStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceStatement() == null) ? 0 : getResourceStatement().hashCode());
        return hashCode;
    }

    @Override
    public ThroughResourcesStatement clone() {
        try {
            return (ThroughResourcesStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
