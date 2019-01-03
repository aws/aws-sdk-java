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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the solution stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/SolutionStackDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionStackDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> permittedFileTypes;

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     * 
     * @return The name of the solution stack.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionStackDescription withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     * 
     * @return The permitted file types allowed for a solution stack.
     */

    public java.util.List<String> getPermittedFileTypes() {
        if (permittedFileTypes == null) {
            permittedFileTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return permittedFileTypes;
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     * 
     * @param permittedFileTypes
     *        The permitted file types allowed for a solution stack.
     */

    public void setPermittedFileTypes(java.util.Collection<String> permittedFileTypes) {
        if (permittedFileTypes == null) {
            this.permittedFileTypes = null;
            return;
        }

        this.permittedFileTypes = new com.amazonaws.internal.SdkInternalList<String>(permittedFileTypes);
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermittedFileTypes(java.util.Collection)} or {@link #withPermittedFileTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param permittedFileTypes
     *        The permitted file types allowed for a solution stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionStackDescription withPermittedFileTypes(String... permittedFileTypes) {
        if (this.permittedFileTypes == null) {
            setPermittedFileTypes(new com.amazonaws.internal.SdkInternalList<String>(permittedFileTypes.length));
        }
        for (String ele : permittedFileTypes) {
            this.permittedFileTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     * 
     * @param permittedFileTypes
     *        The permitted file types allowed for a solution stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionStackDescription withPermittedFileTypes(java.util.Collection<String> permittedFileTypes) {
        setPermittedFileTypes(permittedFileTypes);
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
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getPermittedFileTypes() != null)
            sb.append("PermittedFileTypes: ").append(getPermittedFileTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionStackDescription == false)
            return false;
        SolutionStackDescription other = (SolutionStackDescription) obj;
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPermittedFileTypes() == null ^ this.getPermittedFileTypes() == null)
            return false;
        if (other.getPermittedFileTypes() != null && other.getPermittedFileTypes().equals(this.getPermittedFileTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPermittedFileTypes() == null) ? 0 : getPermittedFileTypes().hashCode());
        return hashCode;
    }

    @Override
    public SolutionStackDescription clone() {
        try {
            return (SolutionStackDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
