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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveSourceServerAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveSourceServerActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Source server post migration custom action ID to remove.
     * </p>
     */
    private String actionID;
    /**
     * <p>
     * Source server ID of the post migration custom action to remove.
     * </p>
     */
    private String sourceServerID;

    /**
     * <p>
     * Source server post migration custom action ID to remove.
     * </p>
     * 
     * @param actionID
     *        Source server post migration custom action ID to remove.
     */

    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

    /**
     * <p>
     * Source server post migration custom action ID to remove.
     * </p>
     * 
     * @return Source server post migration custom action ID to remove.
     */

    public String getActionID() {
        return this.actionID;
    }

    /**
     * <p>
     * Source server post migration custom action ID to remove.
     * </p>
     * 
     * @param actionID
     *        Source server post migration custom action ID to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveSourceServerActionRequest withActionID(String actionID) {
        setActionID(actionID);
        return this;
    }

    /**
     * <p>
     * Source server ID of the post migration custom action to remove.
     * </p>
     * 
     * @param sourceServerID
     *        Source server ID of the post migration custom action to remove.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Source server ID of the post migration custom action to remove.
     * </p>
     * 
     * @return Source server ID of the post migration custom action to remove.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Source server ID of the post migration custom action to remove.
     * </p>
     * 
     * @param sourceServerID
     *        Source server ID of the post migration custom action to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveSourceServerActionRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
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
        if (getActionID() != null)
            sb.append("ActionID: ").append(getActionID()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveSourceServerActionRequest == false)
            return false;
        RemoveSourceServerActionRequest other = (RemoveSourceServerActionRequest) obj;
        if (other.getActionID() == null ^ this.getActionID() == null)
            return false;
        if (other.getActionID() != null && other.getActionID().equals(this.getActionID()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionID() == null) ? 0 : getActionID().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        return hashCode;
    }

    @Override
    public RemoveSourceServerActionRequest clone() {
        return (RemoveSourceServerActionRequest) super.clone();
    }

}
