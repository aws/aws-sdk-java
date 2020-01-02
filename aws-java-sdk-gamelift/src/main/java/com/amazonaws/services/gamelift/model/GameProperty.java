/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Set of key-value pairs that contain information about a game session. When included in a game session request, these
 * properties communicate details to be used when setting up the new game session. For example, a game property might
 * specify a game mode, level, or map. Game properties are passed to the game server process when initiating a new game
 * session. For more information, see the <a href=
 * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create"
 * > Amazon GameLift Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The game property identifier.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The game property value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The game property identifier.
     * </p>
     * 
     * @param key
     *        The game property identifier.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The game property identifier.
     * </p>
     * 
     * @return The game property identifier.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The game property identifier.
     * </p>
     * 
     * @param key
     *        The game property identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameProperty withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The game property value.
     * </p>
     * 
     * @param value
     *        The game property value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The game property value.
     * </p>
     * 
     * @return The game property value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The game property value.
     * </p>
     * 
     * @param value
     *        The game property value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameProperty withValue(String value) {
        setValue(value);
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
