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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for CreateTopic action.
 * </p>
 */
public class CreateTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     */
    private String name;

    /**
     * Default constructor for CreateTopicRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateTopicRequest() {
    }

    /**
     * Constructs a new CreateTopicRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     */
    public CreateTopicRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @return The name of the topic you want to create.</p>
     *         <p>
     *         Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *         underscores, and hyphens, and must be between 1 and 256 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRequest == false)
            return false;
        CreateTopicRequest other = (CreateTopicRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRequest clone() {
        return (CreateTopicRequest) super.clone();
    }
}
