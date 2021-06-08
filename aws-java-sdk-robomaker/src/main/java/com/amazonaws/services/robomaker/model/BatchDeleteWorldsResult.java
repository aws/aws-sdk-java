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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDeleteWorlds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteWorldsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * </p>
     */
    private java.util.List<String> unprocessedWorlds;

    /**
     * <p>
     * A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * </p>
     * 
     * @return A list of unprocessed worlds associated with the call. These worlds were not deleted.
     */

    public java.util.List<String> getUnprocessedWorlds() {
        return unprocessedWorlds;
    }

    /**
     * <p>
     * A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * </p>
     * 
     * @param unprocessedWorlds
     *        A list of unprocessed worlds associated with the call. These worlds were not deleted.
     */

    public void setUnprocessedWorlds(java.util.Collection<String> unprocessedWorlds) {
        if (unprocessedWorlds == null) {
            this.unprocessedWorlds = null;
            return;
        }

        this.unprocessedWorlds = new java.util.ArrayList<String>(unprocessedWorlds);
    }

    /**
     * <p>
     * A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedWorlds(java.util.Collection)} or {@link #withUnprocessedWorlds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param unprocessedWorlds
     *        A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteWorldsResult withUnprocessedWorlds(String... unprocessedWorlds) {
        if (this.unprocessedWorlds == null) {
            setUnprocessedWorlds(new java.util.ArrayList<String>(unprocessedWorlds.length));
        }
        for (String ele : unprocessedWorlds) {
            this.unprocessedWorlds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * </p>
     * 
     * @param unprocessedWorlds
     *        A list of unprocessed worlds associated with the call. These worlds were not deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteWorldsResult withUnprocessedWorlds(java.util.Collection<String> unprocessedWorlds) {
        setUnprocessedWorlds(unprocessedWorlds);
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
        if (getUnprocessedWorlds() != null)
            sb.append("UnprocessedWorlds: ").append(getUnprocessedWorlds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteWorldsResult == false)
            return false;
        BatchDeleteWorldsResult other = (BatchDeleteWorldsResult) obj;
        if (other.getUnprocessedWorlds() == null ^ this.getUnprocessedWorlds() == null)
            return false;
        if (other.getUnprocessedWorlds() != null && other.getUnprocessedWorlds().equals(this.getUnprocessedWorlds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnprocessedWorlds() == null) ? 0 : getUnprocessedWorlds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteWorldsResult clone() {
        try {
            return (BatchDeleteWorldsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
