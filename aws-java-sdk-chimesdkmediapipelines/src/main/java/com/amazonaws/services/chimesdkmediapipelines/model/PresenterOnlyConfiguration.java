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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the configuration for a presenter only video tile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/PresenterOnlyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PresenterOnlyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * </p>
     */
    private String presenterPosition;

    /**
     * <p>
     * Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * </p>
     * 
     * @param presenterPosition
     *        Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * @see PresenterPosition
     */

    public void setPresenterPosition(String presenterPosition) {
        this.presenterPosition = presenterPosition;
    }

    /**
     * <p>
     * Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * </p>
     * 
     * @return Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * @see PresenterPosition
     */

    public String getPresenterPosition() {
        return this.presenterPosition;
    }

    /**
     * <p>
     * Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * </p>
     * 
     * @param presenterPosition
     *        Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresenterPosition
     */

    public PresenterOnlyConfiguration withPresenterPosition(String presenterPosition) {
        setPresenterPosition(presenterPosition);
        return this;
    }

    /**
     * <p>
     * Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * </p>
     * 
     * @param presenterPosition
     *        Defines the position of the presenter video tile. Default: <code>TopRight</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresenterPosition
     */

    public PresenterOnlyConfiguration withPresenterPosition(PresenterPosition presenterPosition) {
        this.presenterPosition = presenterPosition.toString();
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
        if (getPresenterPosition() != null)
            sb.append("PresenterPosition: ").append(getPresenterPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresenterOnlyConfiguration == false)
            return false;
        PresenterOnlyConfiguration other = (PresenterOnlyConfiguration) obj;
        if (other.getPresenterPosition() == null ^ this.getPresenterPosition() == null)
            return false;
        if (other.getPresenterPosition() != null && other.getPresenterPosition().equals(this.getPresenterPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresenterPosition() == null) ? 0 : getPresenterPosition().hashCode());
        return hashCode;
    }

    @Override
    public PresenterOnlyConfiguration clone() {
        try {
            return (PresenterOnlyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.PresenterOnlyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
