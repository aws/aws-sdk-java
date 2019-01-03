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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemovePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemovePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     */
    private String statementId;

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     * 
     * @param statementId
     *        The statement ID corresponding to the account that is no longer allowed to put events to the default event
     *        bus.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     * 
     * @return The statement ID corresponding to the account that is no longer allowed to put events to the default
     *         event bus.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
     * </p>
     * 
     * @param statementId
     *        The statement ID corresponding to the account that is no longer allowed to put events to the default event
     *        bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
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
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemovePermissionRequest == false)
            return false;
        RemovePermissionRequest other = (RemovePermissionRequest) obj;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return hashCode;
    }

    @Override
    public RemovePermissionRequest clone() {
        return (RemovePermissionRequest) super.clone();
    }

}
