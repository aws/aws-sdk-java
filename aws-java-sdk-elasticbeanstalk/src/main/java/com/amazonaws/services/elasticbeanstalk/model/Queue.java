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
 * Describes a queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/Queue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Queue implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the queue.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL of the queue.
     * </p>
     */
    private String uRL;

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param name
     *        The name of the queue.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @return The name of the queue.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the queue.
     * </p>
     * 
     * @param name
     *        The name of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL of the queue.
     * </p>
     * 
     * @param uRL
     *        The URL of the queue.
     */

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * <p>
     * The URL of the queue.
     * </p>
     * 
     * @return The URL of the queue.
     */

    public String getURL() {
        return this.uRL;
    }

    /**
     * <p>
     * The URL of the queue.
     * </p>
     * 
     * @param uRL
     *        The URL of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withURL(String uRL) {
        setURL(uRL);
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
        if (getURL() != null)
            sb.append("URL: ").append(getURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Queue == false)
            return false;
        Queue other = (Queue) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getURL() == null ^ this.getURL() == null)
            return false;
        if (other.getURL() != null && other.getURL().equals(this.getURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getURL() == null) ? 0 : getURL().hashCode());
        return hashCode;
    }

    @Override
    public Queue clone() {
        try {
            return (Queue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
