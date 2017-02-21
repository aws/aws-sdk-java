/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set of key-value pairs containing information a server process requires to set up a game session. This object allows
 * you to pass in any set of data needed for your game. For more information, see the <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon GameLift Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * TBD
     * </p>
     */
    private String key;
    /**
     * <p>
     * TBD
     * </p>
     */
    private String value;

    /**
     * <p>
     * TBD
     * </p>
     * 
     * @param key
     *        TBD
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * TBD
     * </p>
     * 
     * @return TBD
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * TBD
     * </p>
     * 
     * @param key
     *        TBD
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameProperty withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * TBD
     * </p>
     * 
     * @param value
     *        TBD
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * TBD
     * </p>
     * 
     * @return TBD
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * TBD
     * </p>
     * 
     * @param value
     *        TBD
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameProperty withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameProperty == false)
            return false;
        GameProperty other = (GameProperty) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public GameProperty clone() {
        try {
            return (GameProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GamePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
