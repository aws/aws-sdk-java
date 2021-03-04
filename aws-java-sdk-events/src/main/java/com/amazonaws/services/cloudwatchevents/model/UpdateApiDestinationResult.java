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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/UpdateApiDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApiDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the API destination that was updated.
     * </p>
     */
    private String apiDestinationArn;
    /**
     * <p>
     * The state of the API destination that was updated.
     * </p>
     */
    private String apiDestinationState;
    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The ARN of the API destination that was updated.
     * </p>
     * 
     * @param apiDestinationArn
     *        The ARN of the API destination that was updated.
     */

    public void setApiDestinationArn(String apiDestinationArn) {
        this.apiDestinationArn = apiDestinationArn;
    }

    /**
     * <p>
     * The ARN of the API destination that was updated.
     * </p>
     * 
     * @return The ARN of the API destination that was updated.
     */

    public String getApiDestinationArn() {
        return this.apiDestinationArn;
    }

    /**
     * <p>
     * The ARN of the API destination that was updated.
     * </p>
     * 
     * @param apiDestinationArn
     *        The ARN of the API destination that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationResult withApiDestinationArn(String apiDestinationArn) {
        setApiDestinationArn(apiDestinationArn);
        return this;
    }

    /**
     * <p>
     * The state of the API destination that was updated.
     * </p>
     * 
     * @param apiDestinationState
     *        The state of the API destination that was updated.
     * @see ApiDestinationState
     */

    public void setApiDestinationState(String apiDestinationState) {
        this.apiDestinationState = apiDestinationState;
    }

    /**
     * <p>
     * The state of the API destination that was updated.
     * </p>
     * 
     * @return The state of the API destination that was updated.
     * @see ApiDestinationState
     */

    public String getApiDestinationState() {
        return this.apiDestinationState;
    }

    /**
     * <p>
     * The state of the API destination that was updated.
     * </p>
     * 
     * @param apiDestinationState
     *        The state of the API destination that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationState
     */

    public UpdateApiDestinationResult withApiDestinationState(String apiDestinationState) {
        setApiDestinationState(apiDestinationState);
        return this;
    }

    /**
     * <p>
     * The state of the API destination that was updated.
     * </p>
     * 
     * @param apiDestinationState
     *        The state of the API destination that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationState
     */

    public UpdateApiDestinationResult withApiDestinationState(ApiDestinationState apiDestinationState) {
        this.apiDestinationState = apiDestinationState.toString();
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp for the time that the API destination was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     * 
     * @return A time stamp for the time that the API destination was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp for the time that the API destination was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A time stamp for the time that the API destination was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     * 
     * @return A time stamp for the time that the API destination was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A time stamp for the time that the API destination was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getApiDestinationArn() != null)
            sb.append("ApiDestinationArn: ").append(getApiDestinationArn()).append(",");
        if (getApiDestinationState() != null)
            sb.append("ApiDestinationState: ").append(getApiDestinationState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApiDestinationResult == false)
            return false;
        UpdateApiDestinationResult other = (UpdateApiDestinationResult) obj;
        if (other.getApiDestinationArn() == null ^ this.getApiDestinationArn() == null)
            return false;
        if (other.getApiDestinationArn() != null && other.getApiDestinationArn().equals(this.getApiDestinationArn()) == false)
            return false;
        if (other.getApiDestinationState() == null ^ this.getApiDestinationState() == null)
            return false;
        if (other.getApiDestinationState() != null && other.getApiDestinationState().equals(this.getApiDestinationState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiDestinationArn() == null) ? 0 : getApiDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getApiDestinationState() == null) ? 0 : getApiDestinationState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApiDestinationResult clone() {
        try {
            return (UpdateApiDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
