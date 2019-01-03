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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogStreams"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseLogStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object describing the result of your get relational database log streams request.
     * </p>
     */
    private java.util.List<String> logStreams;

    /**
     * <p>
     * An object describing the result of your get relational database log streams request.
     * </p>
     * 
     * @return An object describing the result of your get relational database log streams request.
     */

    public java.util.List<String> getLogStreams() {
        return logStreams;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log streams request.
     * </p>
     * 
     * @param logStreams
     *        An object describing the result of your get relational database log streams request.
     */

    public void setLogStreams(java.util.Collection<String> logStreams) {
        if (logStreams == null) {
            this.logStreams = null;
            return;
        }

        this.logStreams = new java.util.ArrayList<String>(logStreams);
    }

    /**
     * <p>
     * An object describing the result of your get relational database log streams request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogStreams(java.util.Collection)} or {@link #withLogStreams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logStreams
     *        An object describing the result of your get relational database log streams request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogStreamsResult withLogStreams(String... logStreams) {
        if (this.logStreams == null) {
            setLogStreams(new java.util.ArrayList<String>(logStreams.length));
        }
        for (String ele : logStreams) {
            this.logStreams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log streams request.
     * </p>
     * 
     * @param logStreams
     *        An object describing the result of your get relational database log streams request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogStreamsResult withLogStreams(java.util.Collection<String> logStreams) {
        setLogStreams(logStreams);
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
        if (getLogStreams() != null)
            sb.append("LogStreams: ").append(getLogStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogStreamsResult == false)
            return false;
        GetRelationalDatabaseLogStreamsResult other = (GetRelationalDatabaseLogStreamsResult) obj;
        if (other.getLogStreams() == null ^ this.getLogStreams() == null)
            return false;
        if (other.getLogStreams() != null && other.getLogStreams().equals(this.getLogStreams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreams() == null) ? 0 : getLogStreams().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseLogStreamsResult clone() {
        try {
            return (GetRelationalDatabaseLogStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
