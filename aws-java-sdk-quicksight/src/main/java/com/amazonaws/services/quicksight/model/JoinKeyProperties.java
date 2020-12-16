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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties associated with the columns participating in a join.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/JoinKeyProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JoinKeyProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by
     * QuickSight to optimize query performance.
     * </p>
     */
    private Boolean uniqueKey;

    /**
     * <p>
     * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by
     * QuickSight to optimize query performance.
     * </p>
     * 
     * @param uniqueKey
     *        A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is
     *        used by QuickSight to optimize query performance.
     */

    public void setUniqueKey(Boolean uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    /**
     * <p>
     * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by
     * QuickSight to optimize query performance.
     * </p>
     * 
     * @return A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is
     *         used by QuickSight to optimize query performance.
     */

    public Boolean getUniqueKey() {
        return this.uniqueKey;
    }

    /**
     * <p>
     * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by
     * QuickSight to optimize query performance.
     * </p>
     * 
     * @param uniqueKey
     *        A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is
     *        used by QuickSight to optimize query performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinKeyProperties withUniqueKey(Boolean uniqueKey) {
        setUniqueKey(uniqueKey);
        return this;
    }

    /**
     * <p>
     * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by
     * QuickSight to optimize query performance.
     * </p>
     * 
     * @return A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is
     *         used by QuickSight to optimize query performance.
     */

    public Boolean isUniqueKey() {
        return this.uniqueKey;
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
        if (getUniqueKey() != null)
            sb.append("UniqueKey: ").append(getUniqueKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinKeyProperties == false)
            return false;
        JoinKeyProperties other = (JoinKeyProperties) obj;
        if (other.getUniqueKey() == null ^ this.getUniqueKey() == null)
            return false;
        if (other.getUniqueKey() != null && other.getUniqueKey().equals(this.getUniqueKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUniqueKey() == null) ? 0 : getUniqueKey().hashCode());
        return hashCode;
    }

    @Override
    public JoinKeyProperties clone() {
        try {
            return (JoinKeyProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.JoinKeyPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
