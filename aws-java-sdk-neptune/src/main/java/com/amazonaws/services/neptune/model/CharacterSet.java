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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CharacterSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CharacterSet implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the character set.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The description of the character set.
     * </p>
     */
    private String characterSetDescription;

    /**
     * <p>
     * The name of the character set.
     * </p>
     * 
     * @param characterSetName
     *        The name of the character set.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * The name of the character set.
     * </p>
     * 
     * @return The name of the character set.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * The name of the character set.
     * </p>
     * 
     * @param characterSetName
     *        The name of the character set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CharacterSet withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The description of the character set.
     * </p>
     * 
     * @param characterSetDescription
     *        The description of the character set.
     */

    public void setCharacterSetDescription(String characterSetDescription) {
        this.characterSetDescription = characterSetDescription;
    }

    /**
     * <p>
     * The description of the character set.
     * </p>
     * 
     * @return The description of the character set.
     */

    public String getCharacterSetDescription() {
        return this.characterSetDescription;
    }

    /**
     * <p>
     * The description of the character set.
     * </p>
     * 
     * @param characterSetDescription
     *        The description of the character set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CharacterSet withCharacterSetDescription(String characterSetDescription) {
        setCharacterSetDescription(characterSetDescription);
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
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getCharacterSetDescription() != null)
            sb.append("CharacterSetDescription: ").append(getCharacterSetDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CharacterSet == false)
            return false;
        CharacterSet other = (CharacterSet) obj;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getCharacterSetDescription() == null ^ this.getCharacterSetDescription() == null)
            return false;
        if (other.getCharacterSetDescription() != null && other.getCharacterSetDescription().equals(this.getCharacterSetDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetDescription() == null) ? 0 : getCharacterSetDescription().hashCode());
        return hashCode;
    }

    @Override
    public CharacterSet clone() {
        try {
            return (CharacterSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
