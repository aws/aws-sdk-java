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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateScene" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSceneResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the scene was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @return The date and time when the scene was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the scene was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the scene was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSceneResult withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
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
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSceneResult == false)
            return false;
        UpdateSceneResult other = (UpdateSceneResult) obj;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSceneResult clone() {
        try {
            return (UpdateSceneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
