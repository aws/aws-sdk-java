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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartChangeSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier generated for the request.
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The ARN associated to the unique identifier generated for the request.
     * </p>
     */
    private String changeSetArn;

    /**
     * <p>
     * Unique identifier generated for the request.
     * </p>
     * 
     * @param changeSetId
     *        Unique identifier generated for the request.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * Unique identifier generated for the request.
     * </p>
     * 
     * @return Unique identifier generated for the request.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * Unique identifier generated for the request.
     * </p>
     * 
     * @param changeSetId
     *        Unique identifier generated for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetResult withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The ARN associated to the unique identifier generated for the request.
     * </p>
     * 
     * @param changeSetArn
     *        The ARN associated to the unique identifier generated for the request.
     */

    public void setChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
    }

    /**
     * <p>
     * The ARN associated to the unique identifier generated for the request.
     * </p>
     * 
     * @return The ARN associated to the unique identifier generated for the request.
     */

    public String getChangeSetArn() {
        return this.changeSetArn;
    }

    /**
     * <p>
     * The ARN associated to the unique identifier generated for the request.
     * </p>
     * 
     * @param changeSetArn
     *        The ARN associated to the unique identifier generated for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChangeSetResult withChangeSetArn(String changeSetArn) {
        setChangeSetArn(changeSetArn);
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
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getChangeSetArn() != null)
            sb.append("ChangeSetArn: ").append(getChangeSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartChangeSetResult == false)
            return false;
        StartChangeSetResult other = (StartChangeSetResult) obj;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetArn() == null ^ this.getChangeSetArn() == null)
            return false;
        if (other.getChangeSetArn() != null && other.getChangeSetArn().equals(this.getChangeSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetArn() == null) ? 0 : getChangeSetArn().hashCode());
        return hashCode;
    }

    @Override
    public StartChangeSetResult clone() {
        try {
            return (StartChangeSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
