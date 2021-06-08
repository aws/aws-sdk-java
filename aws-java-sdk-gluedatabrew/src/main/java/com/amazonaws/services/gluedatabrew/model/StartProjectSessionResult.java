/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartProjectSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartProjectSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project to be acted upon.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A system-generated identifier for the session.
     * </p>
     */
    private String clientSessionId;

    /**
     * <p>
     * The name of the project to be acted upon.
     * </p>
     * 
     * @param name
     *        The name of the project to be acted upon.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project to be acted upon.
     * </p>
     * 
     * @return The name of the project to be acted upon.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project to be acted upon.
     * </p>
     * 
     * @param name
     *        The name of the project to be acted upon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProjectSessionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A system-generated identifier for the session.
     * </p>
     * 
     * @param clientSessionId
     *        A system-generated identifier for the session.
     */

    public void setClientSessionId(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    /**
     * <p>
     * A system-generated identifier for the session.
     * </p>
     * 
     * @return A system-generated identifier for the session.
     */

    public String getClientSessionId() {
        return this.clientSessionId;
    }

    /**
     * <p>
     * A system-generated identifier for the session.
     * </p>
     * 
     * @param clientSessionId
     *        A system-generated identifier for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProjectSessionResult withClientSessionId(String clientSessionId) {
        setClientSessionId(clientSessionId);
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
        if (getClientSessionId() != null)
            sb.append("ClientSessionId: ").append(getClientSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartProjectSessionResult == false)
            return false;
        StartProjectSessionResult other = (StartProjectSessionResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientSessionId() == null ^ this.getClientSessionId() == null)
            return false;
        if (other.getClientSessionId() != null && other.getClientSessionId().equals(this.getClientSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientSessionId() == null) ? 0 : getClientSessionId().hashCode());
        return hashCode;
    }

    @Override
    public StartProjectSessionResult clone() {
        try {
            return (StartProjectSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
