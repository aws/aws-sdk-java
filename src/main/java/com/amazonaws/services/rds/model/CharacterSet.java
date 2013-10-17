/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * This data type is used as a response element in the action DescribeDBEngineVersions.
 * </p>
 */
public class CharacterSet implements Serializable {

    /**
     * The name of the character set.
     */
    private String characterSetName;

    /**
     * The description of the character set.
     */
    private String characterSetDescription;

    /**
     * The name of the character set.
     *
     * @return The name of the character set.
     */
    public String getCharacterSetName() {
        return characterSetName;
    }
    
    /**
     * The name of the character set.
     *
     * @param characterSetName The name of the character set.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    /**
     * The name of the character set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetName The name of the character set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CharacterSet withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * The description of the character set.
     *
     * @return The description of the character set.
     */
    public String getCharacterSetDescription() {
        return characterSetDescription;
    }
    
    /**
     * The description of the character set.
     *
     * @param characterSetDescription The description of the character set.
     */
    public void setCharacterSetDescription(String characterSetDescription) {
        this.characterSetDescription = characterSetDescription;
    }
    
    /**
     * The description of the character set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetDescription The description of the character set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CharacterSet withCharacterSetDescription(String characterSetDescription) {
        this.characterSetDescription = characterSetDescription;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCharacterSetName() != null) sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getCharacterSetDescription() != null) sb.append("CharacterSetDescription: " + getCharacterSetDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CharacterSet == false) return false;
        CharacterSet other = (CharacterSet)obj;
        
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null) return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false) return false; 
        if (other.getCharacterSetDescription() == null ^ this.getCharacterSetDescription() == null) return false;
        if (other.getCharacterSetDescription() != null && other.getCharacterSetDescription().equals(this.getCharacterSetDescription()) == false) return false; 
        return true;
    }
    
}
    