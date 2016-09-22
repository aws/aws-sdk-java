/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results for the <a>CreateComputer</a> operation.
 * </p>
 */
public class CreateComputerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>Computer</a> object that represents the computer account.
     * </p>
     */
    private Computer computer;

    /**
     * <p>
     * A <a>Computer</a> object that represents the computer account.
     * </p>
     * 
     * @param computer
     *        A <a>Computer</a> object that represents the computer account.
     */

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    /**
     * <p>
     * A <a>Computer</a> object that represents the computer account.
     * </p>
     * 
     * @return A <a>Computer</a> object that represents the computer account.
     */

    public Computer getComputer() {
        return this.computer;
    }

    /**
     * <p>
     * A <a>Computer</a> object that represents the computer account.
     * </p>
     * 
     * @param computer
     *        A <a>Computer</a> object that represents the computer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputerResult withComputer(Computer computer) {
        setComputer(computer);
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
        if (getComputer() != null)
            sb.append("Computer: " + getComputer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateComputerResult == false)
            return false;
        CreateComputerResult other = (CreateComputerResult) obj;
        if (other.getComputer() == null ^ this.getComputer() == null)
            return false;
        if (other.getComputer() != null && other.getComputer().equals(this.getComputer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputer() == null) ? 0 : getComputer().hashCode());
        return hashCode;
    }

    @Override
    public CreateComputerResult clone() {
        try {
            return (CreateComputerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
