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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAttackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The attack that is described.
     * </p>
     */
    private AttackDetail attack;

    /**
     * <p>
     * The attack that is described.
     * </p>
     * 
     * @param attack
     *        The attack that is described.
     */

    public void setAttack(AttackDetail attack) {
        this.attack = attack;
    }

    /**
     * <p>
     * The attack that is described.
     * </p>
     * 
     * @return The attack that is described.
     */

    public AttackDetail getAttack() {
        return this.attack;
    }

    /**
     * <p>
     * The attack that is described.
     * </p>
     * 
     * @param attack
     *        The attack that is described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAttackResult withAttack(AttackDetail attack) {
        setAttack(attack);
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
        if (getAttack() != null)
            sb.append("Attack: ").append(getAttack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAttackResult == false)
            return false;
        DescribeAttackResult other = (DescribeAttackResult) obj;
        if (other.getAttack() == null ^ this.getAttack() == null)
            return false;
        if (other.getAttack() != null && other.getAttack().equals(this.getAttack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttack() == null) ? 0 : getAttack().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAttackResult clone() {
        try {
            return (DescribeAttackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
