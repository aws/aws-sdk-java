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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a conflicting query used across different sets of featured results. When you create a featured
 * results set, you must check that the queries are unique per featured results set for each index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ConflictingItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictingItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the conflicting query.
     * </p>
     */
    private String queryText;
    /**
     * <p>
     * The name for the set of featured results that the conflicting query belongs to.
     * </p>
     */
    private String setName;
    /**
     * <p>
     * The identifier of the set of featured results that the conflicting query belongs to.
     * </p>
     */
    private String setId;

    /**
     * <p>
     * The text of the conflicting query.
     * </p>
     * 
     * @param queryText
     *        The text of the conflicting query.
     */

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The text of the conflicting query.
     * </p>
     * 
     * @return The text of the conflicting query.
     */

    public String getQueryText() {
        return this.queryText;
    }

    /**
     * <p>
     * The text of the conflicting query.
     * </p>
     * 
     * @param queryText
     *        The text of the conflicting query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingItem withQueryText(String queryText) {
        setQueryText(queryText);
        return this;
    }

    /**
     * <p>
     * The name for the set of featured results that the conflicting query belongs to.
     * </p>
     * 
     * @param setName
     *        The name for the set of featured results that the conflicting query belongs to.
     */

    public void setSetName(String setName) {
        this.setName = setName;
    }

    /**
     * <p>
     * The name for the set of featured results that the conflicting query belongs to.
     * </p>
     * 
     * @return The name for the set of featured results that the conflicting query belongs to.
     */

    public String getSetName() {
        return this.setName;
    }

    /**
     * <p>
     * The name for the set of featured results that the conflicting query belongs to.
     * </p>
     * 
     * @param setName
     *        The name for the set of featured results that the conflicting query belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingItem withSetName(String setName) {
        setSetName(setName);
        return this;
    }

    /**
     * <p>
     * The identifier of the set of featured results that the conflicting query belongs to.
     * </p>
     * 
     * @param setId
     *        The identifier of the set of featured results that the conflicting query belongs to.
     */

    public void setSetId(String setId) {
        this.setId = setId;
    }

    /**
     * <p>
     * The identifier of the set of featured results that the conflicting query belongs to.
     * </p>
     * 
     * @return The identifier of the set of featured results that the conflicting query belongs to.
     */

    public String getSetId() {
        return this.setId;
    }

    /**
     * <p>
     * The identifier of the set of featured results that the conflicting query belongs to.
     * </p>
     * 
     * @param setId
     *        The identifier of the set of featured results that the conflicting query belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingItem withSetId(String setId) {
        setSetId(setId);
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
        if (getQueryText() != null)
            sb.append("QueryText: ").append(getQueryText()).append(",");
        if (getSetName() != null)
            sb.append("SetName: ").append(getSetName()).append(",");
        if (getSetId() != null)
            sb.append("SetId: ").append(getSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictingItem == false)
            return false;
        ConflictingItem other = (ConflictingItem) obj;
        if (other.getQueryText() == null ^ this.getQueryText() == null)
            return false;
        if (other.getQueryText() != null && other.getQueryText().equals(this.getQueryText()) == false)
            return false;
        if (other.getSetName() == null ^ this.getSetName() == null)
            return false;
        if (other.getSetName() != null && other.getSetName().equals(this.getSetName()) == false)
            return false;
        if (other.getSetId() == null ^ this.getSetId() == null)
            return false;
        if (other.getSetId() != null && other.getSetId().equals(this.getSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryText() == null) ? 0 : getQueryText().hashCode());
        hashCode = prime * hashCode + ((getSetName() == null) ? 0 : getSetName().hashCode());
        hashCode = prime * hashCode + ((getSetId() == null) ? 0 : getSetId().hashCode());
        return hashCode;
    }

    @Override
    public ConflictingItem clone() {
        try {
            return (ConflictingItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ConflictingItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
