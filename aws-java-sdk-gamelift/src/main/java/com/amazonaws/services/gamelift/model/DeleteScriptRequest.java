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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteScriptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a Realtime script to delete.
     * </p>
     */
    private String scriptId;

    /**
     * <p>
     * Unique identifier for a Realtime script to delete.
     * </p>
     * 
     * @param scriptId
     *        Unique identifier for a Realtime script to delete.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script to delete.
     * </p>
     * 
     * @return Unique identifier for a Realtime script to delete.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script to delete.
     * </p>
     * 
     * @param scriptId
     *        Unique identifier for a Realtime script to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteScriptRequest withScriptId(String scriptId) {
        setScriptId(scriptId);
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
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteScriptRequest == false)
            return false;
        DeleteScriptRequest other = (DeleteScriptRequest) obj;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteScriptRequest clone() {
        return (DeleteScriptRequest) super.clone();
    }

}
