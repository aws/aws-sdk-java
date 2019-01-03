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
 * A list of available AWS Elastic Beanstalk solution stacks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListAvailableSolutionStacks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableSolutionStacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> solutionStacks;
    /**
     * <p>
     * A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SolutionStackDescription> solutionStackDetails;

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     * 
     * @return A list of available solution stacks.
     */

    public java.util.List<String> getSolutionStacks() {
        if (solutionStacks == null) {
            solutionStacks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return solutionStacks;
    }

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     * 
     * @param solutionStacks
     *        A list of available solution stacks.
     */

    public void setSolutionStacks(java.util.Collection<String> solutionStacks) {
        if (solutionStacks == null) {
            this.solutionStacks = null;
            return;
        }

        this.solutionStacks = new com.amazonaws.internal.SdkInternalList<String>(solutionStacks);
    }

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSolutionStacks(java.util.Collection)} or {@link #withSolutionStacks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param solutionStacks
     *        A list of available solution stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableSolutionStacksResult withSolutionStacks(String... solutionStacks) {
        if (this.solutionStacks == null) {
            setSolutionStacks(new com.amazonaws.internal.SdkInternalList<String>(solutionStacks.length));
        }
        for (String ele : solutionStacks) {
            this.solutionStacks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     * 
     * @param solutionStacks
     *        A list of available solution stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableSolutionStacksResult withSolutionStacks(java.util.Collection<String> solutionStacks) {
        setSolutionStacks(solutionStacks);
        return this;
    }

    /**
     * <p>
     * A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * </p>
     * 
     * @return A list of available solution stacks and their <a>SolutionStackDescription</a>.
     */

    public java.util.List<SolutionStackDescription> getSolutionStackDetails() {
        if (solutionStackDetails == null) {
            solutionStackDetails = new com.amazonaws.internal.SdkInternalList<SolutionStackDescription>();
        }
        return solutionStackDetails;
    }

    /**
     * <p>
     * A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * </p>
     * 
     * @param solutionStackDetails
     *        A list of available solution stacks and their <a>SolutionStackDescription</a>.
     */

    public void setSolutionStackDetails(java.util.Collection<SolutionStackDescription> solutionStackDetails) {
        if (solutionStackDetails == null) {
            this.solutionStackDetails = null;
            return;
        }

        this.solutionStackDetails = new com.amazonaws.internal.SdkInternalList<SolutionStackDescription>(solutionStackDetails);
    }

    /**
     * <p>
     * A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSolutionStackDetails(java.util.Collection)} or {@link #withSolutionStackDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param solutionStackDetails
     *        A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableSolutionStacksResult withSolutionStackDetails(SolutionStackDescription... solutionStackDetails) {
        if (this.solutionStackDetails == null) {
            setSolutionStackDetails(new com.amazonaws.internal.SdkInternalList<SolutionStackDescription>(solutionStackDetails.length));
        }
        for (SolutionStackDescription ele : solutionStackDetails) {
            this.solutionStackDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * </p>
     * 
     * @param solutionStackDetails
     *        A list of available solution stacks and their <a>SolutionStackDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableSolutionStacksResult withSolutionStackDetails(java.util.Collection<SolutionStackDescription> solutionStackDetails) {
        setSolutionStackDetails(solutionStackDetails);
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
        if (getSolutionStacks() != null)
            sb.append("SolutionStacks: ").append(getSolutionStacks()).append(",");
        if (getSolutionStackDetails() != null)
            sb.append("SolutionStackDetails: ").append(getSolutionStackDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAvailableSolutionStacksResult == false)
            return false;
        ListAvailableSolutionStacksResult other = (ListAvailableSolutionStacksResult) obj;
        if (other.getSolutionStacks() == null ^ this.getSolutionStacks() == null)
            return false;
        if (other.getSolutionStacks() != null && other.getSolutionStacks().equals(this.getSolutionStacks()) == false)
            return false;
        if (other.getSolutionStackDetails() == null ^ this.getSolutionStackDetails() == null)
            return false;
        if (other.getSolutionStackDetails() != null && other.getSolutionStackDetails().equals(this.getSolutionStackDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionStacks() == null) ? 0 : getSolutionStacks().hashCode());
        hashCode = prime * hashCode + ((getSolutionStackDetails() == null) ? 0 : getSolutionStackDetails().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableSolutionStacksResult clone() {
        try {
            return (ListAvailableSolutionStacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
