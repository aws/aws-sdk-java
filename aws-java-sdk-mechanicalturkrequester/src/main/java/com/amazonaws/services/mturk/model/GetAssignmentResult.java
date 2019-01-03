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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetAssignment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssignmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The assignment. The response includes one Assignment element.
     * </p>
     */
    private Assignment assignment;
    /**
     * <p>
     * The HIT associated with this assignment. The response includes one HIT element.
     * </p>
     */
    private HIT hIT;

    /**
     * <p>
     * The assignment. The response includes one Assignment element.
     * </p>
     * 
     * @param assignment
     *        The assignment. The response includes one Assignment element.
     */

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    /**
     * <p>
     * The assignment. The response includes one Assignment element.
     * </p>
     * 
     * @return The assignment. The response includes one Assignment element.
     */

    public Assignment getAssignment() {
        return this.assignment;
    }

    /**
     * <p>
     * The assignment. The response includes one Assignment element.
     * </p>
     * 
     * @param assignment
     *        The assignment. The response includes one Assignment element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssignmentResult withAssignment(Assignment assignment) {
        setAssignment(assignment);
        return this;
    }

    /**
     * <p>
     * The HIT associated with this assignment. The response includes one HIT element.
     * </p>
     * 
     * @param hIT
     *        The HIT associated with this assignment. The response includes one HIT element.
     */

    public void setHIT(HIT hIT) {
        this.hIT = hIT;
    }

    /**
     * <p>
     * The HIT associated with this assignment. The response includes one HIT element.
     * </p>
     * 
     * @return The HIT associated with this assignment. The response includes one HIT element.
     */

    public HIT getHIT() {
        return this.hIT;
    }

    /**
     * <p>
     * The HIT associated with this assignment. The response includes one HIT element.
     * </p>
     * 
     * @param hIT
     *        The HIT associated with this assignment. The response includes one HIT element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssignmentResult withHIT(HIT hIT) {
        setHIT(hIT);
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
        if (getAssignment() != null)
            sb.append("Assignment: ").append(getAssignment()).append(",");
        if (getHIT() != null)
            sb.append("HIT: ").append(getHIT());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssignmentResult == false)
            return false;
        GetAssignmentResult other = (GetAssignmentResult) obj;
        if (other.getAssignment() == null ^ this.getAssignment() == null)
            return false;
        if (other.getAssignment() != null && other.getAssignment().equals(this.getAssignment()) == false)
            return false;
        if (other.getHIT() == null ^ this.getHIT() == null)
            return false;
        if (other.getHIT() != null && other.getHIT().equals(this.getHIT()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignment() == null) ? 0 : getAssignment().hashCode());
        hashCode = prime * hashCode + ((getHIT() == null) ? 0 : getHIT().hashCode());
        return hashCode;
    }

    @Override
    public GetAssignmentResult clone() {
        try {
            return (GetAssignmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
