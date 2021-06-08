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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about a key group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KeyGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyGroupSummary implements Serializable, Cloneable {

    /**
     * <p>
     * A key group.
     * </p>
     */
    private KeyGroup keyGroup;

    /**
     * <p>
     * A key group.
     * </p>
     * 
     * @param keyGroup
     *        A key group.
     */

    public void setKeyGroup(KeyGroup keyGroup) {
        this.keyGroup = keyGroup;
    }

    /**
     * <p>
     * A key group.
     * </p>
     * 
     * @return A key group.
     */

    public KeyGroup getKeyGroup() {
        return this.keyGroup;
    }

    /**
     * <p>
     * A key group.
     * </p>
     * 
     * @param keyGroup
     *        A key group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroupSummary withKeyGroup(KeyGroup keyGroup) {
        setKeyGroup(keyGroup);
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
        if (getKeyGroup() != null)
            sb.append("KeyGroup: ").append(getKeyGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyGroupSummary == false)
            return false;
        KeyGroupSummary other = (KeyGroupSummary) obj;
        if (other.getKeyGroup() == null ^ this.getKeyGroup() == null)
            return false;
        if (other.getKeyGroup() != null && other.getKeyGroup().equals(this.getKeyGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyGroup() == null) ? 0 : getKeyGroup().hashCode());
        return hashCode;
    }

    @Override
    public KeyGroupSummary clone() {
        try {
            return (KeyGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
