/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Operating System.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/OS" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OS implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The long name of the Operating System.
     * </p>
     */
    private String fullString;

    /**
     * <p>
     * The long name of the Operating System.
     * </p>
     * 
     * @param fullString
     *        The long name of the Operating System.
     */

    public void setFullString(String fullString) {
        this.fullString = fullString;
    }

    /**
     * <p>
     * The long name of the Operating System.
     * </p>
     * 
     * @return The long name of the Operating System.
     */

    public String getFullString() {
        return this.fullString;
    }

    /**
     * <p>
     * The long name of the Operating System.
     * </p>
     * 
     * @param fullString
     *        The long name of the Operating System.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OS withFullString(String fullString) {
        setFullString(fullString);
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
        if (getFullString() != null)
            sb.append("FullString: ").append(getFullString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OS == false)
            return false;
        OS other = (OS) obj;
        if (other.getFullString() == null ^ this.getFullString() == null)
            return false;
        if (other.getFullString() != null && other.getFullString().equals(this.getFullString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFullString() == null) ? 0 : getFullString().hashCode());
        return hashCode;
    }

    @Override
    public OS clone() {
        try {
            return (OS) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.OSMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
