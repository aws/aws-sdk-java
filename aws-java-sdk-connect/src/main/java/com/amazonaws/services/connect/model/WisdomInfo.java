/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about Amazon Connect Wisdom.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/WisdomInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WisdomInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     */
    private String sessionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     * 
     * @param sessionArn
     *        The Amazon Resource Name (ARN) of the Wisdom session.
     */

    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Wisdom session.
     */

    public String getSessionArn() {
        return this.sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom session.
     * </p>
     * 
     * @param sessionArn
     *        The Amazon Resource Name (ARN) of the Wisdom session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WisdomInfo withSessionArn(String sessionArn) {
        setSessionArn(sessionArn);
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
        if (getSessionArn() != null)
            sb.append("SessionArn: ").append(getSessionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WisdomInfo == false)
            return false;
        WisdomInfo other = (WisdomInfo) obj;
        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionArn() == null) ? 0 : getSessionArn().hashCode());
        return hashCode;
    }

    @Override
    public WisdomInfo clone() {
        try {
            return (WisdomInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.WisdomInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
