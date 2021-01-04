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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartProjectSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartProjectSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project to act upon.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A value that, if true, enables you to take control of a session, even if a different client is currently
     * accessing the project.
     * </p>
     */
    private Boolean assumeControl;

    /**
     * <p>
     * The name of the project to act upon.
     * </p>
     * 
     * @param name
     *        The name of the project to act upon.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project to act upon.
     * </p>
     * 
     * @return The name of the project to act upon.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project to act upon.
     * </p>
     * 
     * @param name
     *        The name of the project to act upon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProjectSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A value that, if true, enables you to take control of a session, even if a different client is currently
     * accessing the project.
     * </p>
     * 
     * @param assumeControl
     *        A value that, if true, enables you to take control of a session, even if a different client is currently
     *        accessing the project.
     */

    public void setAssumeControl(Boolean assumeControl) {
        this.assumeControl = assumeControl;
    }

    /**
     * <p>
     * A value that, if true, enables you to take control of a session, even if a different client is currently
     * accessing the project.
     * </p>
     * 
     * @return A value that, if true, enables you to take control of a session, even if a different client is currently
     *         accessing the project.
     */

    public Boolean getAssumeControl() {
        return this.assumeControl;
    }

    /**
     * <p>
     * A value that, if true, enables you to take control of a session, even if a different client is currently
     * accessing the project.
     * </p>
     * 
     * @param assumeControl
     *        A value that, if true, enables you to take control of a session, even if a different client is currently
     *        accessing the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProjectSessionRequest withAssumeControl(Boolean assumeControl) {
        setAssumeControl(assumeControl);
        return this;
    }

    /**
     * <p>
     * A value that, if true, enables you to take control of a session, even if a different client is currently
     * accessing the project.
     * </p>
     * 
     * @return A value that, if true, enables you to take control of a session, even if a different client is currently
     *         accessing the project.
     */

    public Boolean isAssumeControl() {
        return this.assumeControl;
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
        if (getAssumeControl() != null)
            sb.append("AssumeControl: ").append(getAssumeControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartProjectSessionRequest == false)
            return false;
        StartProjectSessionRequest other = (StartProjectSessionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssumeControl() == null ^ this.getAssumeControl() == null)
            return false;
        if (other.getAssumeControl() != null && other.getAssumeControl().equals(this.getAssumeControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAssumeControl() == null) ? 0 : getAssumeControl().hashCode());
        return hashCode;
    }

    @Override
    public StartProjectSessionRequest clone() {
        return (StartProjectSessionRequest) super.clone();
    }

}
