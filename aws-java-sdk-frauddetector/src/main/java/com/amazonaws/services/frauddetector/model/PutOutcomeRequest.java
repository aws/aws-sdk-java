/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOutcomeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the outcome.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The outcome description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the outcome.
     * </p>
     * 
     * @param name
     *        The name of the outcome.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the outcome.
     * </p>
     * 
     * @return The name of the outcome.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the outcome.
     * </p>
     * 
     * @param name
     *        The name of the outcome.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOutcomeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The outcome description.
     * </p>
     * 
     * @param description
     *        The outcome description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The outcome description.
     * </p>
     * 
     * @return The outcome description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The outcome description.
     * </p>
     * 
     * @param description
     *        The outcome description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOutcomeRequest withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOutcomeRequest == false)
            return false;
        PutOutcomeRequest other = (PutOutcomeRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PutOutcomeRequest clone() {
        return (PutOutcomeRequest) super.clone();
    }

}
