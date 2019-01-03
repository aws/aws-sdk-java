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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of segments and corresponding subsegments associated to a trace summary error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ErrorRootCauseEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorRootCauseEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the entity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The types and messages of the exceptions.
     * </p>
     */
    private java.util.List<RootCauseException> exceptions;
    /**
     * <p>
     * A flag that denotes a remote subsegment.
     * </p>
     */
    private Boolean remote;

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param name
     *        The name of the entity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @return The name of the entity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param name
     *        The name of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseEntity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The types and messages of the exceptions.
     * </p>
     * 
     * @return The types and messages of the exceptions.
     */

    public java.util.List<RootCauseException> getExceptions() {
        return exceptions;
    }

    /**
     * <p>
     * The types and messages of the exceptions.
     * </p>
     * 
     * @param exceptions
     *        The types and messages of the exceptions.
     */

    public void setExceptions(java.util.Collection<RootCauseException> exceptions) {
        if (exceptions == null) {
            this.exceptions = null;
            return;
        }

        this.exceptions = new java.util.ArrayList<RootCauseException>(exceptions);
    }

    /**
     * <p>
     * The types and messages of the exceptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExceptions(java.util.Collection)} or {@link #withExceptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exceptions
     *        The types and messages of the exceptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseEntity withExceptions(RootCauseException... exceptions) {
        if (this.exceptions == null) {
            setExceptions(new java.util.ArrayList<RootCauseException>(exceptions.length));
        }
        for (RootCauseException ele : exceptions) {
            this.exceptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types and messages of the exceptions.
     * </p>
     * 
     * @param exceptions
     *        The types and messages of the exceptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseEntity withExceptions(java.util.Collection<RootCauseException> exceptions) {
        setExceptions(exceptions);
        return this;
    }

    /**
     * <p>
     * A flag that denotes a remote subsegment.
     * </p>
     * 
     * @param remote
     *        A flag that denotes a remote subsegment.
     */

    public void setRemote(Boolean remote) {
        this.remote = remote;
    }

    /**
     * <p>
     * A flag that denotes a remote subsegment.
     * </p>
     * 
     * @return A flag that denotes a remote subsegment.
     */

    public Boolean getRemote() {
        return this.remote;
    }

    /**
     * <p>
     * A flag that denotes a remote subsegment.
     * </p>
     * 
     * @param remote
     *        A flag that denotes a remote subsegment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseEntity withRemote(Boolean remote) {
        setRemote(remote);
        return this;
    }

    /**
     * <p>
     * A flag that denotes a remote subsegment.
     * </p>
     * 
     * @return A flag that denotes a remote subsegment.
     */

    public Boolean isRemote() {
        return this.remote;
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
        if (getExceptions() != null)
            sb.append("Exceptions: ").append(getExceptions()).append(",");
        if (getRemote() != null)
            sb.append("Remote: ").append(getRemote());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorRootCauseEntity == false)
            return false;
        ErrorRootCauseEntity other = (ErrorRootCauseEntity) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExceptions() == null ^ this.getExceptions() == null)
            return false;
        if (other.getExceptions() != null && other.getExceptions().equals(this.getExceptions()) == false)
            return false;
        if (other.getRemote() == null ^ this.getRemote() == null)
            return false;
        if (other.getRemote() != null && other.getRemote().equals(this.getRemote()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExceptions() == null) ? 0 : getExceptions().hashCode());
        hashCode = prime * hashCode + ((getRemote() == null) ? 0 : getRemote().hashCode());
        return hashCode;
    }

    @Override
    public ErrorRootCauseEntity clone() {
        try {
            return (ErrorRootCauseEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ErrorRootCauseEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
